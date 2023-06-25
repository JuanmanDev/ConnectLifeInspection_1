package com.google.android.gms.internal.measurement;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzjk extends IOException {
    public zzjk() {
        super(CodedOutputStream.OutOfSpaceException.MESSAGE);
    }

    public zzjk(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzjk(Throwable th) {
        super(CodedOutputStream.OutOfSpaceException.MESSAGE, th);
    }
}
