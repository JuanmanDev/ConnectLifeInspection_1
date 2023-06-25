package com.facebook.stetho.dumpapp;

import android.support.p025v4.media.session.PlaybackStateCompat;
import com.facebook.stetho.common.LogUtil;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Framer {
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    public static final String TAG = "FramingSocket";
    public final DataInputStream mInput;
    public final DataOutputStream mMultiplexedOutputStream;
    public final PrintStream mStderr = new PrintStream(new FramingOutputStream(STDERR_FRAME_PREFIX));
    public final InputStream mStdin = new FramingInputStream();
    public final PrintStream mStdout = new PrintStream(new BufferedOutputStream(new FramingOutputStream(STDOUT_FRAME_PREFIX)));

    public static class ClosedHelper {
        public volatile boolean mClosed;

        public ClosedHelper() {
        }

        public void close() {
            this.mClosed = true;
        }

        public void throwIfClosed() {
            if (this.mClosed) {
                throw new IOException("Stream is closed");
            }
        }
    }

    public Framer(InputStream inputStream, OutputStream outputStream) {
        this.mInput = new DataInputStream(inputStream);
        this.mMultiplexedOutputStream = new DataOutputStream(outputStream);
    }

    public static <T extends Throwable> T handleSuppression(T t, T t2) {
        if (t == null) {
            return t2;
        }
        LogUtil.m9810i(TAG, t2, "Suppressed while handling " + t);
        return t;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public byte readFrameType() {
        return this.mInput.readByte();
    }

    public int readInt() {
        return this.mInput.readInt();
    }

    public String readString() {
        byte[] bArr = new byte[this.mInput.readUnsignedShort()];
        this.mInput.readFully(bArr);
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public void writeBlob(byte[] bArr, int i, int i2) {
        this.mMultiplexedOutputStream.write(bArr, i, i2);
    }

    public void writeExitCode(int i) {
        this.mStdout.flush();
        this.mStderr.flush();
        writeIntFrame(EXIT_FRAME_PREFIX, i);
    }

    public void writeIntFrame(byte b, int i) {
        this.mMultiplexedOutputStream.write(b);
        this.mMultiplexedOutputStream.writeInt(i);
    }

    public class FramingInputStream extends InputStream {
        public final ClosedHelper mClosedHelper;

        public FramingInputStream() {
            this.mClosedHelper = new ClosedHelper();
        }

        public void close() {
            this.mClosedHelper.close();
        }

        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr) == 0) {
                return -1;
            }
            return bArr[0];
        }

        public long skip(long j) {
            long j2;
            byte[] bArr = new byte[((int) Math.min(j, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH))];
            synchronized (Framer.this) {
                j2 = 0;
                while (true) {
                    if (j2 >= j) {
                        break;
                    }
                    int read = read(bArr);
                    if (read < 0) {
                        break;
                    }
                    j2 += (long) read;
                }
            }
            return j2;
        }

        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        public int read(byte[] bArr, int i, int i2) {
            int readInt;
            this.mClosedHelper.throwIfClosed();
            synchronized (Framer.this) {
                Framer.this.writeIntFrame(Framer.STDIN_REQUEST_FRAME_PREFIX, i2);
                byte readFrameType = Framer.this.readFrameType();
                if (readFrameType == 45) {
                    readInt = Framer.this.readInt();
                    if (readInt > 0) {
                        if (readInt <= i2) {
                            Framer.this.mInput.readFully(bArr, i, readInt);
                        } else {
                            throw new DumpappFramingException("Expected at most " + i2 + " bytes, got: " + readInt);
                        }
                    }
                } else {
                    throw new UnexpectedFrameException(Framer.STDIN_FRAME_PREFIX, readFrameType);
                }
            }
            return readInt;
        }
    }

    public class FramingOutputStream extends OutputStream {
        public final ClosedHelper mClosedHelper = new ClosedHelper();
        public final byte mPrefix;

        public FramingOutputStream(byte b) {
            this.mPrefix = b;
        }

        public void close() {
            this.mClosedHelper.close();
        }

        public void write(byte[] bArr, int i, int i2) {
            this.mClosedHelper.throwIfClosed();
            if (i2 > 0) {
                try {
                    synchronized (Framer.this) {
                        Framer.this.writeIntFrame(this.mPrefix, i2);
                        Framer.this.writeBlob(bArr, i, i2);
                        Framer.this.mMultiplexedOutputStream.flush();
                    }
                } catch (IOException e) {
                    throw new DumpappOutputBrokenException((Throwable) e);
                }
            }
        }

        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }
    }
}
