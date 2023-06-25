package p553f.p590b.p591a.p592a.p593a;

import android.content.Context;
import android.widget.Toast;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: f.b.a.a.a.a */
/* compiled from: FluttertoastPlugin */
public class C9182a implements C9017j.C9021c {

    /* renamed from: e */
    public Context f17982e;

    /* renamed from: l */
    public Toast f17983l;

    public C9182a(Context context) {
        this.f17982e = context;
    }

    /* renamed from: b */
    public static void m24903b(C9024l.C9027c cVar) {
        new C9017j(cVar.mo46301f(), "PonnamKarthik/fluttertoast").mo46575e(new C9182a(cVar.mo46298c()));
    }

    /* renamed from: a */
    public final float mo46971a(float f) {
        return (f * this.f17982e.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r12, p553f.p554a.p570e.p571a.C9017j.C9022d r13) {
        /*
            r11 = this;
            java.lang.String r0 = r12.f17687a
            int r1 = r0.hashCode()
            r2 = -1913642710(0xffffffff8df0212a, float:-1.4799126E-30)
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L_0x001e
            r2 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "cancel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = r4
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "showToast"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = r5
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            if (r0 == 0) goto L_0x0040
            if (r0 == r4) goto L_0x0032
            r13.notImplemented()
            goto L_0x012f
        L_0x0032:
            android.widget.Toast r12 = r11.f17983l
            if (r12 == 0) goto L_0x0039
            r12.cancel()
        L_0x0039:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r13.success(r12)
            goto L_0x012f
        L_0x0040:
            java.lang.String r0 = "msg"
            java.lang.Object r0 = r12.mo46571a(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "length"
            java.lang.Object r1 = r12.mo46571a(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "gravity"
            java.lang.Object r2 = r12.mo46571a(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "bgcolor"
            java.lang.Object r6 = r12.mo46571a(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.String r7 = "textcolor"
            java.lang.Object r7 = r12.mo46571a(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.String r8 = "fontSize"
            java.lang.Object r12 = r12.mo46571a(r8)
            java.lang.Number r12 = (java.lang.Number) r12
            int r8 = r2.hashCode()
            r9 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r8 == r9) goto L_0x008f
            r9 = 115029(0x1c155, float:1.6119E-40)
            if (r8 == r9) goto L_0x0085
            goto L_0x0098
        L_0x0085:
            java.lang.String r8 = "top"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0098
            r3 = r5
            goto L_0x0098
        L_0x008f:
            java.lang.String r8 = "center"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0098
            r3 = r4
        L_0x0098:
            r2 = 17
            r8 = 48
            if (r3 == 0) goto L_0x00a5
            if (r3 == r4) goto L_0x00a3
            r3 = 80
            goto L_0x00a6
        L_0x00a3:
            r3 = r2
            goto L_0x00a6
        L_0x00a5:
            r3 = r8
        L_0x00a6:
            java.lang.String r4 = "long"
            boolean r1 = r1.equals(r4)
            if (r6 == 0) goto L_0x0106
            if (r7 == 0) goto L_0x0106
            if (r12 == 0) goto L_0x0106
            android.content.Context r4 = r11.f17982e
            java.lang.String r9 = "layout_inflater"
            java.lang.Object r4 = r4.getSystemService(r9)
            android.view.LayoutInflater r4 = (android.view.LayoutInflater) r4
            int r9 = p630io.github.ponnamkarthik.toast.fluttertoast.R$layout.toast_custom
            r10 = 0
            android.view.View r4 = r4.inflate(r9, r10)
            int r9 = p630io.github.ponnamkarthik.toast.fluttertoast.R$id.text
            android.view.View r9 = r4.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r6 = r6.intValue()
            r0.setColor(r6)
            r6 = 1082130432(0x40800000, float:4.0)
            float r6 = r11.mo46971a(r6)
            r0.setCornerRadius(r6)
            r9.setBackground(r0)
            float r12 = r12.floatValue()
            r9.setTextSize(r12)
            int r12 = r7.intValue()
            r9.setTextColor(r12)
            android.widget.Toast r12 = new android.widget.Toast
            android.content.Context r0 = r11.f17982e
            r12.<init>(r0)
            r11.f17983l = r12
            r12.setDuration(r1)
            android.widget.Toast r12 = r11.f17983l
            r12.setView(r4)
            goto L_0x010e
        L_0x0106:
            android.content.Context r12 = r11.f17982e
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r0, r1)
            r11.f17983l = r12
        L_0x010e:
            if (r3 != r2) goto L_0x0116
            android.widget.Toast r12 = r11.f17983l
            r12.setGravity(r3, r5, r5)
            goto L_0x0125
        L_0x0116:
            r12 = 100
            if (r3 != r8) goto L_0x0120
            android.widget.Toast r0 = r11.f17983l
            r0.setGravity(r3, r5, r12)
            goto L_0x0125
        L_0x0120:
            android.widget.Toast r0 = r11.f17983l
            r0.setGravity(r3, r5, r12)
        L_0x0125:
            android.widget.Toast r12 = r11.f17983l
            r12.show()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r13.success(r12)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p590b.p591a.p592a.p593a.C9182a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
