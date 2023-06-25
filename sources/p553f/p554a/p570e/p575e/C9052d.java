package p553f.p554a.p570e.p575e;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import p630io.flutter.embedding.engine.systemchannels.PlatformChannel;

/* renamed from: f.a.e.e.d */
/* compiled from: PlatformPlugin */
public class C9052d {

    /* renamed from: a */
    public final Activity f17758a;

    /* renamed from: b */
    public final PlatformChannel f17759b;

    /* renamed from: c */
    public PlatformChannel.C9422e f17760c;

    /* renamed from: d */
    public int f17761d = 1280;
    @VisibleForTesting

    /* renamed from: e */
    public final PlatformChannel.C9421d f17762e;

    /* renamed from: f.a.e.e.d$a */
    /* compiled from: PlatformPlugin */
    public class C9053a implements PlatformChannel.C9421d {
        public C9053a() {
        }

        /* renamed from: a */
        public void mo46670a() {
            C9052d.this.mo46661m();
        }

        /* renamed from: b */
        public void mo46671b(@NonNull List<PlatformChannel.SystemUiOverlay> list) {
            C9052d.this.mo46665q(list);
        }

        /* renamed from: c */
        public void mo46672c(@NonNull String str) {
            C9052d.this.mo46663o(str);
        }

        /* renamed from: d */
        public void mo46673d(@NonNull PlatformChannel.C9422e eVar) {
            C9052d.this.mo46667s(eVar);
        }

        /* renamed from: e */
        public void mo46674e(@NonNull PlatformChannel.SoundType soundType) {
            C9052d.this.mo46660l(soundType);
        }

        /* renamed from: f */
        public void mo46675f() {
            C9052d.this.mo46662n();
        }

        /* renamed from: g */
        public void mo46676g(int i) {
            C9052d.this.mo46666r(i);
        }

        /* renamed from: h */
        public void mo46677h(@NonNull PlatformChannel.C9420c cVar) {
            C9052d.this.mo46664p(cVar);
        }

        /* renamed from: i */
        public void mo46678i(@NonNull PlatformChannel.HapticFeedbackType hapticFeedbackType) {
            C9052d.this.mo46669u(hapticFeedbackType);
        }

        /* renamed from: j */
        public boolean mo46679j() {
            CharSequence h = C9052d.this.mo46659k(PlatformChannel.ClipboardContentFormat.PLAIN_TEXT);
            return h != null && h.length() > 0;
        }

        /* renamed from: k */
        public CharSequence mo46680k(@Nullable PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
            return C9052d.this.mo46659k(clipboardContentFormat);
        }
    }

    /* renamed from: f.a.e.e.d$b */
    /* compiled from: PlatformPlugin */
    public static /* synthetic */ class C9054b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17764a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f17765b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f17766c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness[] r0 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17766c = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17766c     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay[] r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f17765b = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f17765b     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType[] r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f17764a = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f17764a     // Catch:{ NoSuchFieldError -> 0x0053 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f17764a     // Catch:{ NoSuchFieldError -> 0x005e }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f17764a     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f17764a     // Catch:{ NoSuchFieldError -> 0x0074 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p570e.p575e.C9052d.C9054b.<clinit>():void");
        }
    }

    public C9052d(Activity activity, PlatformChannel platformChannel) {
        C9053a aVar = new C9053a();
        this.f17762e = aVar;
        this.f17758a = activity;
        this.f17759b = platformChannel;
        platformChannel.mo47528j(aVar);
    }

    /* renamed from: j */
    public void mo46658j() {
        this.f17759b.mo47528j((PlatformChannel.C9421d) null);
    }

    /* renamed from: k */
    public final CharSequence mo46659k(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipData primaryClip = ((ClipboardManager) this.f17758a.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null) {
            return null;
        }
        if (clipboardContentFormat == null || clipboardContentFormat == PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
            return primaryClip.getItemAt(0).coerceToText(this.f17758a);
        }
        return null;
    }

    /* renamed from: l */
    public final void mo46660l(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.f17758a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* renamed from: m */
    public final void mo46661m() {
        this.f17758a.finish();
    }

    /* renamed from: n */
    public final void mo46662n() {
        mo46668t();
    }

    /* renamed from: o */
    public final void mo46663o(String str) {
        ((ClipboardManager) this.f17758a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* renamed from: p */
    public final void mo46664p(PlatformChannel.C9420c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 28 && i > 21) {
                this.f17758a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f18527b, (Bitmap) null, cVar.f18526a));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f17758a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f18527b, 0, cVar.f18526a));
            }
        }
    }

    /* renamed from: q */
    public final void mo46665q(List<PlatformChannel.SystemUiOverlay> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = C9054b.f17765b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & -513 & -3;
            }
        }
        this.f17761d = i;
        mo46668t();
    }

    /* renamed from: r */
    public final void mo46666r(int i) {
        this.f17758a.setRequestedOrientation(i);
    }

    /* renamed from: s */
    public final void mo46667s(PlatformChannel.C9422e eVar) {
        Window window = this.f17758a.getWindow();
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 26) {
            PlatformChannel.Brightness brightness = eVar.f18531d;
            if (brightness != null) {
                int i = C9054b.f17766c[brightness.ordinal()];
                if (i == 1) {
                    systemUiVisibility |= 16;
                } else if (i == 2) {
                    systemUiVisibility &= -17;
                }
            }
            Integer num = eVar.f18530c;
            if (num != null) {
                window.setNavigationBarColor(num.intValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PlatformChannel.Brightness brightness2 = eVar.f18529b;
            if (brightness2 != null) {
                int i2 = C9054b.f17766c[brightness2.ordinal()];
                if (i2 == 1) {
                    systemUiVisibility |= 8192;
                } else if (i2 == 2) {
                    systemUiVisibility &= -8193;
                }
            }
            Integer num2 = eVar.f18528a;
            if (num2 != null) {
                window.setStatusBarColor(num2.intValue());
            }
        }
        Integer num3 = eVar.f18532e;
        decorView.setSystemUiVisibility(systemUiVisibility);
        this.f17760c = eVar;
    }

    /* renamed from: t */
    public void mo46668t() {
        this.f17758a.getWindow().getDecorView().setSystemUiVisibility(this.f17761d);
        PlatformChannel.C9422e eVar = this.f17760c;
        if (eVar != null) {
            mo46667s(eVar);
        }
    }

    @VisibleForTesting
    /* renamed from: u */
    public void mo46669u(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.f17758a.getWindow().getDecorView();
        int i = C9054b.f17764a[hapticFeedbackType.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
        } else if (i == 2) {
            decorView.performHapticFeedback(1);
        } else if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 21) {
                decorView.performHapticFeedback(4);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }
}
