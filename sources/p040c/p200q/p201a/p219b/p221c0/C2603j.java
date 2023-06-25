package p040c.p200q.p201a.p219b.p221c0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.c0.j */
/* compiled from: AudioFocusManager */
public final class C2603j {
    @Nullable

    /* renamed from: a */
    public final AudioManager f3120a;

    /* renamed from: b */
    public final C2605b f3121b;

    /* renamed from: c */
    public final C2606c f3122c;
    @Nullable

    /* renamed from: d */
    public C2599h f3123d;

    /* renamed from: e */
    public int f3124e;

    /* renamed from: f */
    public int f3125f;

    /* renamed from: g */
    public float f3126g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f3127h;

    /* renamed from: i */
    public boolean f3128i;

    /* renamed from: c.q.a.b.c0.j$b */
    /* compiled from: AudioFocusManager */
    public class C2605b implements AudioManager.OnAudioFocusChangeListener {
        public C2605b() {
        }

        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i == -2) {
                    int unused = C2603j.this.f3124e = 2;
                } else if (i == -1) {
                    int unused2 = C2603j.this.f3124e = -1;
                } else if (i != 1) {
                    C3163m.m7880f("AudioFocusManager", "Unknown focus change type: " + i);
                    return;
                } else {
                    int unused3 = C2603j.this.f3124e = 1;
                }
            } else if (C2603j.this.mo18253v()) {
                int unused4 = C2603j.this.f3124e = 2;
            } else {
                int unused5 = C2603j.this.f3124e = 3;
            }
            int e = C2603j.this.f3124e;
            if (e == -1) {
                C2603j.this.f3122c.mo18256d(-1);
                C2603j.this.mo18241b(true);
            } else if (e != 0) {
                if (e == 1) {
                    C2603j.this.f3122c.mo18256d(1);
                } else if (e == 2) {
                    C2603j.this.f3122c.mo18256d(0);
                } else if (e != 3) {
                    throw new IllegalStateException("Unknown audio focus state: " + C2603j.this.f3124e);
                }
            }
            float f = C2603j.this.f3124e == 3 ? 0.2f : 1.0f;
            if (C2603j.this.f3126g != f) {
                float unused6 = C2603j.this.f3126g = f;
                C2603j.this.f3122c.mo18255c(f);
            }
        }
    }

    /* renamed from: c.q.a.b.c0.j$c */
    /* compiled from: AudioFocusManager */
    public interface C2606c {
        /* renamed from: c */
        void mo18255c(float f);

        /* renamed from: d */
        void mo18256d(int i);
    }

    public C2603j(@Nullable Context context, C2606c cVar) {
        AudioManager audioManager;
        if (context == null) {
            audioManager = null;
        } else {
            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        }
        this.f3120a = audioManager;
        this.f3122c = cVar;
        this.f3121b = new C2605b();
        this.f3124e = 0;
    }

    /* renamed from: l */
    public static int m4839l(@Nullable C2599h hVar) {
        if (hVar == null) {
            return 0;
        }
        switch (hVar.f3112c) {
            case 0:
                C3163m.m7880f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (hVar.f3110a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (C3152e0.f5819a >= 19) {
                    return 4;
                }
                return 2;
            default:
                C3163m.m7880f("AudioFocusManager", "Unidentified audio usage: " + hVar.f3112c);
                return 0;
        }
        return 3;
    }

    /* renamed from: a */
    public final void mo18240a() {
        mo18241b(false);
    }

    /* renamed from: b */
    public final void mo18241b(boolean z) {
        if (this.f3125f != 0 || this.f3124e != 0) {
            if (this.f3125f != 1 || this.f3124e == -1 || z) {
                if (C3152e0.f5819a >= 26) {
                    mo18243d();
                } else {
                    mo18242c();
                }
                this.f3124e = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo18242c() {
        AudioManager audioManager = this.f3120a;
        C3151e.m7757e(audioManager);
        audioManager.abandonAudioFocus(this.f3121b);
    }

    @RequiresApi(26)
    /* renamed from: d */
    public final void mo18243d() {
        if (this.f3127h != null) {
            AudioManager audioManager = this.f3120a;
            C3151e.m7757e(audioManager);
            audioManager.abandonAudioFocusRequest(this.f3127h);
        }
    }

    /* renamed from: m */
    public float mo18244m() {
        return this.f3126g;
    }

    /* renamed from: n */
    public final int mo18245n(boolean z) {
        return z ? 1 : -1;
    }

    /* renamed from: o */
    public int mo18246o(boolean z) {
        if (this.f3120a == null) {
            return 1;
        }
        if (z) {
            return mo18249r();
        }
        return -1;
    }

    /* renamed from: p */
    public int mo18247p(boolean z, int i) {
        if (this.f3120a == null) {
            return 1;
        }
        if (z) {
            return i == 1 ? mo18245n(z) : mo18249r();
        }
        mo18240a();
        return -1;
    }

    /* renamed from: q */
    public void mo18248q() {
        if (this.f3120a != null) {
            mo18241b(true);
        }
    }

    /* renamed from: r */
    public final int mo18249r() {
        int i;
        if (this.f3125f == 0) {
            if (this.f3124e != 0) {
                mo18241b(true);
            }
            return 1;
        }
        if (this.f3124e == 0) {
            if (C3152e0.f5819a >= 26) {
                i = mo18251t();
            } else {
                i = mo18250s();
            }
            this.f3124e = i == 1 ? 1 : 0;
        }
        int i2 = this.f3124e;
        if (i2 == 0) {
            return -1;
        }
        if (i2 == 2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: s */
    public final int mo18250s() {
        AudioManager audioManager = this.f3120a;
        C3151e.m7757e(audioManager);
        C2605b bVar = this.f3121b;
        C2599h hVar = this.f3123d;
        C3151e.m7757e(hVar);
        return audioManager.requestAudioFocus(bVar, C3152e0.m7772L(hVar.f3112c), this.f3125f);
    }

    @RequiresApi(26)
    /* renamed from: t */
    public final int mo18251t() {
        if (this.f3127h == null || this.f3128i) {
            AudioFocusRequest.Builder builder = this.f3127h == null ? new AudioFocusRequest.Builder(this.f3125f) : new AudioFocusRequest.Builder(this.f3127h);
            boolean v = mo18253v();
            C2599h hVar = this.f3123d;
            C3151e.m7757e(hVar);
            this.f3127h = builder.setAudioAttributes(hVar.mo18229a()).setWillPauseWhenDucked(v).setOnAudioFocusChangeListener(this.f3121b).build();
            this.f3128i = false;
        }
        AudioManager audioManager = this.f3120a;
        C3151e.m7757e(audioManager);
        return audioManager.requestAudioFocus(this.f3127h);
    }

    /* renamed from: u */
    public int mo18252u(@Nullable C2599h hVar, boolean z, int i) {
        if (this.f3123d == null && hVar == null) {
            return z ? 1 : -1;
        }
        C3151e.m7758f(this.f3120a, "SimpleExoPlayer must be created with a context to handle audio focus.");
        if (!C3152e0.m7789b(this.f3123d, hVar)) {
            this.f3123d = hVar;
            int l = m4839l(hVar);
            this.f3125f = l;
            C3151e.m7754b(l == 1 || l == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            if (z && (i == 2 || i == 3)) {
                return mo18249r();
            }
        }
        if (i == 1) {
            return mo18245n(z);
        }
        return mo18246o(z);
    }

    /* renamed from: v */
    public final boolean mo18253v() {
        C2599h hVar = this.f3123d;
        return hVar != null && hVar.f3110a == 1;
    }
}
