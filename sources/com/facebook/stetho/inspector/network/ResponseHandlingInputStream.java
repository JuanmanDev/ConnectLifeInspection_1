package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ResponseHandlingInputStream extends FilterInputStream {
    public static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    public boolean mClosed;
    public final CountingOutputStream mDecompressedCounter;
    public boolean mEofSeen;
    public long mLastDecompressedCount = 0;
    public final ChromePeerManager mNetworkPeerManager;
    public final OutputStream mOutputStream;
    public final String mRequestId;
    public final ResponseHandler mResponseHandler;
    public byte[] mSkipBuffer;

    public ResponseHandlingInputStream(InputStream inputStream, String str, OutputStream outputStream, CountingOutputStream countingOutputStream, ChromePeerManager chromePeerManager, ResponseHandler responseHandler) {
        super(inputStream);
        this.mRequestId = str;
        this.mOutputStream = outputStream;
        this.mDecompressedCounter = countingOutputStream;
        this.mNetworkPeerManager = chromePeerManager;
        this.mResponseHandler = responseHandler;
        this.mClosed = false;
    }

    private synchronized int checkEOF(int i) {
        if (i == -1) {
            closeOutputStreamQuietly();
            this.mResponseHandler.onEOF();
            this.mEofSeen = true;
        }
        return i;
    }

    private synchronized void closeOutputStreamQuietly() {
        if (!this.mClosed) {
            try {
                this.mOutputStream.close();
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                try {
                    ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
                    Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                    Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                    CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, "Could not close the output stream" + e);
                } catch (Throwable th) {
                    this.mClosed = true;
                    throw th;
                }
            }
            this.mClosed = true;
        }
    }

    private byte[] getSkipBufferLocked() {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[1024];
        }
        return this.mSkipBuffer;
    }

    private IOException handleIOException(IOException iOException) {
        this.mResponseHandler.onError(iOException);
        return iOException;
    }

    private void handleIOExceptionWritingToStream(IOException iOException) {
        ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
        Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
        Console.MessageSource messageSource = Console.MessageSource.NETWORK;
        CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, "Could not write response body to the stream " + iOException);
        closeOutputStreamQuietly();
    }

    private void reportDecodedSizeIfApplicable() {
        CountingOutputStream countingOutputStream = this.mDecompressedCounter;
        if (countingOutputStream != null) {
            long count = countingOutputStream.getCount();
            this.mResponseHandler.onReadDecoded((int) (count - this.mLastDecompressedCount));
            this.mLastDecompressedCount = count;
        }
    }

    private synchronized void writeToOutputStream(int i) {
        if (!this.mClosed) {
            try {
                this.mOutputStream.write(i);
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                handleIOExceptionWritingToStream(e);
            }
        } else {
            return;
        }
        return;
    }

    public void close() {
        long j;
        try {
            if (!this.mEofSeen) {
                byte[] bArr = new byte[1024];
                j = 0;
                while (true) {
                    int read = read(bArr);
                    if (read == -1) {
                        break;
                    }
                    j += (long) read;
                }
            } else {
                j = 0;
            }
            if (j > 0) {
                CLog.writeToConsole(this.mNetworkPeerManager, Console.MessageLevel.ERROR, Console.MessageSource.NETWORK, "There were " + String.valueOf(j) + " bytes that were not consumed while processing request " + this.mRequestId);
            }
        } finally {
            super.close();
            closeOutputStreamQuietly();
        }
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        try {
            int checkEOF = checkEOF(this.in.read());
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(1);
                writeToOutputStream(checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    public void reset() {
        throw new UnsupportedOperationException("Mark not supported");
    }

    public synchronized long skip(long j) {
        long j2;
        byte[] skipBufferLocked = getSkipBufferLocked();
        j2 = 0;
        while (j2 < j) {
            int read = read(skipBufferLocked, 0, (int) Math.min((long) skipBufferLocked.length, j - j2));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
        }
        return j2;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int checkEOF = checkEOF(this.in.read(bArr, i, i2));
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(checkEOF);
                writeToOutputStream(bArr, i, checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    private synchronized void writeToOutputStream(byte[] bArr, int i, int i2) {
        if (!this.mClosed) {
            try {
                this.mOutputStream.write(bArr, i, i2);
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                handleIOExceptionWritingToStream(e);
            }
        } else {
            return;
        }
        return;
    }
}
