package com.facebook.stetho.dumpapp;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.internal.AssetHelper;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.server.http.LightHttpBody;
import com.facebook.stetho.server.http.LightHttpRequest;
import com.facebook.stetho.server.http.LightHttpResponse;
import com.facebook.stetho.server.http.LightHttpServer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

@Deprecated
public class DumpappHttpSocketLikeHandler implements SocketLikeHandler {
    public final LightHttpServer mServer;

    public static class DumpappLegacyHttpHandler implements HttpHandler {
        public static final String CONTENT_TYPE = "application/octet-stream";
        public static final String QUERY_PARAM_ARGV = "argv";
        public static final String RESPONSE_HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        public final Dumper mDumper;

        public DumpappLegacyHttpHandler(Dumper dumper) {
            this.mDumper = dumper;
        }

        public boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) {
            boolean equals = ShareTarget.METHOD_POST.equals(lightHttpRequest.method);
            boolean z = !equals && ShareTarget.METHOD_GET.equals(lightHttpRequest.method);
            if (z || equals) {
                List<String> queryParameters = lightHttpRequest.uri.getQueryParameters(QUERY_PARAM_ARGV);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Framer framer = new Framer(new ByteArrayInputStream(new byte[0]), byteArrayOutputStream);
                String str = equals ? "ERROR" : "WARNING";
                PrintStream stderr = framer.getStderr();
                stderr.println("*** " + str + ": Using legacy HTTP protocol; update dumpapp script! ***");
                if (z) {
                    DumpappSocketLikeHandler.dump(this.mDumper, framer, (String[]) queryParameters.toArray(new String[queryParameters.size()]));
                } else {
                    framer.writeExitCode(1);
                }
                lightHttpResponse.code = 200;
                lightHttpResponse.reasonPhrase = "OK";
                lightHttpResponse.addHeader(RESPONSE_HEADER_ALLOW_ORIGIN, "*");
                lightHttpResponse.body = LightHttpBody.create(byteArrayOutputStream.toByteArray(), "application/octet-stream");
            } else {
                lightHttpResponse.code = HttpStatus.HTTP_NOT_IMPLEMENTED;
                lightHttpResponse.reasonPhrase = "Not implemented";
                lightHttpResponse.body = LightHttpBody.create(lightHttpRequest.method + " not implemented", AssetHelper.DEFAULT_MIME_TYPE);
            }
            return true;
        }
    }

    public DumpappHttpSocketLikeHandler(Dumper dumper) {
        HandlerRegistry handlerRegistry = new HandlerRegistry();
        handlerRegistry.register(new ExactPathMatcher("/dumpapp"), new DumpappLegacyHttpHandler(dumper));
        this.mServer = new LightHttpServer(handlerRegistry);
    }

    public void onAccepted(SocketLike socketLike) {
        this.mServer.serve(socketLike);
    }
}
