package p040c.p200q.p201a.p219b.p221c0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: c.q.a.b.c0.i */
/* compiled from: AudioCapabilities */
public final class C2602i {

    /* renamed from: c */
    public static final C2602i f3117c = new C2602i(new int[]{2}, 8);

    /* renamed from: a */
    public final int[] f3118a;

    /* renamed from: b */
    public final int f3119b;

    public C2602i(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f3118a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f3118a = new int[0];
        }
        this.f3119b = i;
    }

    /* renamed from: a */
    public static C2602i m4828a(Context context) {
        return m4829b(context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public static C2602i m4829b(@Nullable Intent intent) {
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f3117c;
        }
        return new C2602i(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: c */
    public int mo18235c() {
        return this.f3119b;
    }

    /* renamed from: d */
    public boolean mo18236d(int i) {
        return Arrays.binarySearch(this.f3118a, i) >= 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2602i)) {
            return false;
        }
        C2602i iVar = (C2602i) obj;
        if (!Arrays.equals(this.f3118a, iVar.f3118a) || this.f3119b != iVar.f3119b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f3119b + (Arrays.hashCode(this.f3118a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f3119b + ", supportedEncodings=" + Arrays.toString(this.f3118a) + "]";
    }
}
