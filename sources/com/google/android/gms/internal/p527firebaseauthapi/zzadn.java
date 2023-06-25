package com.google.android.gms.internal.p527firebaseauthapi;

import java.io.IOException;
import p040c.p200q.p201a.p264c.p294g.p333g.C4572l2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzadn extends IOException {
    public C4572l2 zza = null;

    public zzadn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzadm zza() {
        return new zzadm("Protocol message tag had invalid wire type.");
    }

    public static zzadn zzb() {
        return new zzadn("Protocol message end-group tag did not match expected tag.");
    }

    public static zzadn zzc() {
        return new zzadn("Protocol message contained an invalid tag (zero).");
    }

    public static zzadn zzd() {
        return new zzadn("Protocol message had invalid UTF-8.");
    }

    public static zzadn zze() {
        return new zzadn("CodedInputStream encountered a malformed varint.");
    }

    public static zzadn zzf() {
        return new zzadn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzadn zzg() {
        return new zzadn("Failed to parse the message.");
    }

    public static zzadn zzi() {
        return new zzadn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzadn zzh(C4572l2 l2Var) {
        this.zza = l2Var;
        return this;
    }

    public zzadn(String str) {
        super(str);
    }
}
