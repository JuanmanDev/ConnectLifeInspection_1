package p549e.p550a.p551a.p552a;

import android.provider.Settings;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: e.a.a.a.a */
/* compiled from: ScreenPlugin */
public class C8892a implements C9017j.C9021c {

    /* renamed from: e */
    public C9024l.C9027c f17416e;

    public C8892a(C9024l.C9027c cVar) {
        this.f17416e = cVar;
    }

    /* renamed from: b */
    public static void m24022b(C9024l.C9027c cVar) {
        new C9017j(cVar.mo46301f(), "github.com/clovisnicolas/flutter_screen").mo46575e(new C8892a(cVar));
    }

    /* renamed from: a */
    public final float mo46255a() {
        float f = this.f17416e.mo46299d().getWindow().getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        try {
            return ((float) Settings.System.getInt(this.f17416e.mo46298c().getContentResolver(), "screen_brightness")) / 255.0f;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r8, p553f.p554a.p570e.p571a.C9017j.C9022d r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f17687a
            int r1 = r0.hashCode()
            r2 = 0
            java.lang.String r3 = "brightness"
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1135253436: goto L_0x002c;
                case -460887769: goto L_0x0022;
                case 648162385: goto L_0x001a;
                case 1124545107: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0036
        L_0x0010:
            java.lang.String r1 = "setBrightness"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r6
            goto L_0x0037
        L_0x001a:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0036
            r0 = r2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "isKeptOn"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r5
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "keepOn"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r4
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x00ca
            r1 = 0
            if (r0 == r6) goto L_0x009e
            r3 = 128(0x80, float:1.794E-43)
            if (r0 == r5) goto L_0x0082
            if (r0 == r4) goto L_0x0047
            r9.notImplemented()
            goto L_0x00d5
        L_0x0047:
            java.lang.String r0 = "on"
            java.lang.Object r8 = r8.mo46571a(r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006a
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r0 = "Keeping screen on "
            r8.println(r0)
            f.a.e.a.l$c r8 = r7.f17416e
            android.app.Activity r8 = r8.mo46299d()
            android.view.Window r8 = r8.getWindow()
            r8.addFlags(r3)
            goto L_0x007e
        L_0x006a:
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r0 = "Not keeping screen on"
            r8.println(r0)
            f.a.e.a.l$c r8 = r7.f17416e
            android.app.Activity r8 = r8.mo46299d()
            android.view.Window r8 = r8.getWindow()
            r8.clearFlags(r3)
        L_0x007e:
            r9.success(r1)
            goto L_0x00d5
        L_0x0082:
            f.a.e.a.l$c r8 = r7.f17416e
            android.app.Activity r8 = r8.mo46299d()
            android.view.Window r8 = r8.getWindow()
            android.view.WindowManager$LayoutParams r8 = r8.getAttributes()
            int r8 = r8.flags
            r8 = r8 & r3
            if (r8 == 0) goto L_0x0096
            r2 = r6
        L_0x0096:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r9.success(r8)
            goto L_0x00d5
        L_0x009e:
            java.lang.Object r8 = r8.mo46571a(r3)
            java.lang.Double r8 = (java.lang.Double) r8
            double r2 = r8.doubleValue()
            f.a.e.a.l$c r8 = r7.f17416e
            android.app.Activity r8 = r8.mo46299d()
            android.view.Window r8 = r8.getWindow()
            android.view.WindowManager$LayoutParams r8 = r8.getAttributes()
            float r0 = (float) r2
            r8.screenBrightness = r0
            f.a.e.a.l$c r0 = r7.f17416e
            android.app.Activity r0 = r0.mo46299d()
            android.view.Window r0 = r0.getWindow()
            r0.setAttributes(r8)
            r9.success(r1)
            goto L_0x00d5
        L_0x00ca:
            float r8 = r7.mo46255a()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r9.success(r8)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p549e.p550a.p551a.p552a.C8892a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
