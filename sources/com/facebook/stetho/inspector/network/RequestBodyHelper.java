package com.facebook.stetho.inspector.network;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;

public class RequestBodyHelper {
    public ByteArrayOutputStream mDeflatedOutput;
    public CountingOutputStream mDeflatingOutput;
    public final NetworkEventReporter mEventReporter;
    public final String mRequestId;

    public RequestBodyHelper(NetworkEventReporter networkEventReporter, String str) {
        this.mEventReporter = networkEventReporter;
        this.mRequestId = str;
    }

    private void throwIfNoBody() {
        if (!hasBody()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }

    public OutputStream createBodySink(String str) {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (DecompressionHelper.GZIP_ENCODING.equals(str)) {
            outputStream = GunzippingOutputStream.create(byteArrayOutputStream);
        } else {
            outputStream = DecompressionHelper.DEFLATE_ENCODING.equals(str) ? new InflaterOutputStream(byteArrayOutputStream) : byteArrayOutputStream;
        }
        CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
        this.mDeflatingOutput = countingOutputStream;
        this.mDeflatedOutput = byteArrayOutputStream;
        return countingOutputStream;
    }

    public byte[] getDisplayBody() {
        throwIfNoBody();
        return this.mDeflatedOutput.toByteArray();
    }

    public boolean hasBody() {
        return this.mDeflatedOutput != null;
    }

    public void reportDataSent() {
        throwIfNoBody();
        this.mEventReporter.dataSent(this.mRequestId, this.mDeflatedOutput.size(), (int) this.mDeflatingOutput.getCount());
    }
}
