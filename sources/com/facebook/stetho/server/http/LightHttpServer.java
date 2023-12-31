package com.facebook.stetho.server.http;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.webkit.internal.AssetHelper;
import com.facebook.stetho.server.LeakyBufferedInputStream;
import com.facebook.stetho.server.SocketLike;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LightHttpServer {
    public static final String TAG = "LightHttpServer";
    public final HandlerRegistry mHandlerRegistry;

    public static class HttpMessageReader {
        public final StringBuilder mBuffer = new StringBuilder();
        public final BufferedInputStream mIn;
        public final NewLineDetector mNewLineDetector = new NewLineDetector();

        public static class NewLineDetector {
            public static final int STATE_ON_CR = 2;
            public static final int STATE_ON_CRLF = 3;
            public static final int STATE_ON_OTHER = 1;
            public int state;

            public NewLineDetector() {
                this.state = 1;
            }

            public void accept(char c) {
                int i = this.state;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalArgumentException("Unknown state: " + this.state);
                        } else if (c == 13) {
                            this.state = 2;
                        } else {
                            this.state = 1;
                        }
                    } else if (c == 10) {
                        this.state = 3;
                    } else {
                        this.state = 1;
                    }
                } else if (c == 13) {
                    this.state = 2;
                }
            }

            public int state() {
                return this.state;
            }
        }

        public HttpMessageReader(BufferedInputStream bufferedInputStream) {
            this.mIn = bufferedInputStream;
        }

        @Nullable
        public String readLine() {
            while (true) {
                int read = this.mIn.read();
                if (read < 0) {
                    return null;
                }
                char c = (char) read;
                this.mNewLineDetector.accept(c);
                int state = this.mNewLineDetector.state();
                if (state == 1) {
                    this.mBuffer.append(c);
                } else if (state == 3) {
                    String sb = this.mBuffer.toString();
                    this.mBuffer.setLength(0);
                    return sb;
                }
            }
        }
    }

    public LightHttpServer(HandlerRegistry handlerRegistry) {
        this.mHandlerRegistry = handlerRegistry;
    }

    private boolean dispatchToHandler(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) {
        PrintWriter printWriter;
        HttpHandler lookup = this.mHandlerRegistry.lookup(lightHttpRequest.uri.getPath());
        if (lookup == null) {
            lightHttpResponse.code = HttpStatus.HTTP_NOT_FOUND;
            lightHttpResponse.reasonPhrase = "Not found";
            lightHttpResponse.body = LightHttpBody.create("No handler found\n", AssetHelper.DEFAULT_MIME_TYPE);
            return true;
        }
        try {
            return lookup.handleRequest(socketLike, lightHttpRequest, lightHttpResponse);
        } catch (RuntimeException e) {
            lightHttpResponse.code = 500;
            lightHttpResponse.reasonPhrase = "Internal Server Error";
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.close();
            lightHttpResponse.body = LightHttpBody.create(stringWriter.toString(), AssetHelper.DEFAULT_MIME_TYPE);
            return true;
        } catch (Throwable th) {
            printWriter.close();
            throw th;
        }
    }

    public static void readHeaders(LightHttpMessage lightHttpMessage, HttpMessageReader httpMessageReader) {
        while (true) {
            String readLine = httpMessageReader.readLine();
            if (readLine == null) {
                throw new EOFException();
            } else if (!"".equals(readLine)) {
                String[] split = readLine.split(": ", 2);
                if (split.length == 2) {
                    String str = split[0];
                    String str2 = split[1];
                    lightHttpMessage.headerNames.add(str);
                    lightHttpMessage.headerValues.add(str2);
                } else {
                    throw new IOException("Malformed header: " + readLine);
                }
            } else {
                return;
            }
        }
    }

    @Nullable
    public static LightHttpRequest readRequestMessage(LightHttpRequest lightHttpRequest, HttpMessageReader httpMessageReader) {
        lightHttpRequest.reset();
        String readLine = httpMessageReader.readLine();
        if (readLine == null) {
            return null;
        }
        String[] split = readLine.split(" ", 3);
        if (split.length == 3) {
            lightHttpRequest.method = split[0];
            lightHttpRequest.uri = Uri.parse(split[1]);
            lightHttpRequest.protocol = split[2];
            readHeaders(lightHttpRequest, httpMessageReader);
            return lightHttpRequest;
        }
        throw new IOException("Invalid request line: " + readLine);
    }

    public static void writeFullResponse(LightHttpResponse lightHttpResponse, HttpMessageWriter httpMessageWriter, OutputStream outputStream) {
        lightHttpResponse.prepare();
        writeResponseMessage(lightHttpResponse, httpMessageWriter);
        LightHttpBody lightHttpBody = lightHttpResponse.body;
        if (lightHttpBody != null) {
            lightHttpBody.writeTo(outputStream);
        }
    }

    public static void writeResponseMessage(LightHttpResponse lightHttpResponse, HttpMessageWriter httpMessageWriter) {
        httpMessageWriter.writeLine("HTTP/1.1 " + lightHttpResponse.code + " " + lightHttpResponse.reasonPhrase);
        int size = lightHttpResponse.headerNames.size();
        for (int i = 0; i < size; i++) {
            httpMessageWriter.writeLine(lightHttpResponse.headerNames.get(i) + ": " + lightHttpResponse.headerValues.get(i));
        }
        httpMessageWriter.writeLine();
        httpMessageWriter.flush();
    }

    public void serve(SocketLike socketLike) {
        LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(socketLike.getInput(), 1024);
        OutputStream output = socketLike.getOutput();
        HttpMessageReader httpMessageReader = new HttpMessageReader(leakyBufferedInputStream);
        HttpMessageWriter httpMessageWriter = new HttpMessageWriter(new BufferedOutputStream(output));
        SocketLike socketLike2 = new SocketLike(socketLike, leakyBufferedInputStream);
        LightHttpRequest lightHttpRequest = new LightHttpRequest();
        LightHttpResponse lightHttpResponse = new LightHttpResponse();
        while (true) {
            LightHttpRequest readRequestMessage = readRequestMessage(lightHttpRequest, httpMessageReader);
            if (readRequestMessage != null) {
                lightHttpResponse.reset();
                if (dispatchToHandler(socketLike2, readRequestMessage, lightHttpResponse)) {
                    writeFullResponse(lightHttpResponse, httpMessageWriter, output);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static class HttpMessageWriter {
        public static final byte[] CRLF = "\r\n".getBytes();
        public final BufferedOutputStream mOut;

        public HttpMessageWriter(BufferedOutputStream bufferedOutputStream) {
            this.mOut = bufferedOutputStream;
        }

        public void flush() {
            this.mOut.flush();
        }

        public void writeLine(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                this.mOut.write(str.charAt(i));
            }
            this.mOut.write(CRLF);
        }

        public void writeLine() {
            this.mOut.write(CRLF);
        }
    }
}
