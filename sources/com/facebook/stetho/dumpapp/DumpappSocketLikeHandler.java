package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DumpappSocketLikeHandler implements SocketLikeHandler {
    public static final byte[] PROTOCOL_MAGIC = {68, 85, 77, 80};
    public static final int PROTOCOL_VERSION = 1;
    public final Dumper mDumper;

    public DumpappSocketLikeHandler(Dumper dumper) {
        this.mDumper = dumper;
    }

    public static void dump(Dumper dumper, Framer framer, String[] strArr) {
        try {
            framer.writeExitCode(dumper.dump(framer.getStdin(), framer.getStdout(), framer.getStderr(), strArr));
        } catch (DumpappOutputBrokenException unused) {
        }
    }

    private void establishConversation(DataInputStream dataInputStream) {
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        if (Arrays.equals(PROTOCOL_MAGIC, bArr)) {
            int readInt = dataInputStream.readInt();
            if (readInt != 1) {
                throw logAndThrowProtocolException("Expected version=1; got=" + readInt);
            }
            return;
        }
        throw logAndThrowProtocolException("Incompatible protocol, are you using an old dumpapp script?");
    }

    public static IOException logAndThrowProtocolException(String str) {
        LogUtil.m9817w(str);
        throw new IOException(str);
    }

    private String[] readArgs(Framer framer) {
        String[] strArr;
        synchronized (framer) {
            byte readFrameType = framer.readFrameType();
            if (readFrameType == 33) {
                int readInt = framer.readInt();
                strArr = new String[readInt];
                for (int i = 0; i < readInt; i++) {
                    strArr[i] = framer.readString();
                }
            } else {
                throw new DumpappFramingException("Expected enter frame, got: " + readFrameType);
            }
        }
        return strArr;
    }

    public void onAccepted(SocketLike socketLike) {
        DataInputStream dataInputStream = new DataInputStream(socketLike.getInput());
        establishConversation(dataInputStream);
        Framer framer = new Framer(dataInputStream, socketLike.getOutput());
        dump(this.mDumper, framer, readArgs(framer));
    }
}
