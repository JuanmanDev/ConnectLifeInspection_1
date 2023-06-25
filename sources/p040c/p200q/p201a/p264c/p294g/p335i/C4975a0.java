package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.q.a.c.g.i.a0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C4975a0 extends C5330x {
    public C4975a0() {
        this.f10245a.add(zzbl.APPLY);
        this.f10245a.add(zzbl.BLOCK);
        this.f10245a.add(zzbl.BREAK);
        this.f10245a.add(zzbl.CASE);
        this.f10245a.add(zzbl.DEFAULT);
        this.f10245a.add(zzbl.CONTINUE);
        this.f10245a.add(zzbl.DEFINE_FUNCTION);
        this.f10245a.add(zzbl.FN);
        this.f10245a.add(zzbl.IF);
        this.f10245a.add(zzbl.QUOTE);
        this.f10245a.add(zzbl.RETURN);
        this.f10245a.add(zzbl.SWITCH);
        this.f10245a.add(zzbl.TERNARY);
    }

    /* renamed from: c */
    public static C5225q m13742c(C5215p4 p4Var, List list) {
        C5216p5.m14639i(zzbl.FN.name(), 2, list);
        C5225q b = p4Var.mo27496b((C5225q) list.get(0));
        C5225q b2 = p4Var.mo27496b((C5225q) list.get(1));
        if (b2 instanceof C5054f) {
            List z = ((C5054f) b2).mo27223z();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C5210p(b.mo27208f(), z, arrayList, p4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        if (r9.equals("continue") == false) goto L_0x012d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p294g.p335i.C5225q mo26909a(java.lang.String r9, p040c.p200q.p201a.p264c.p294g.p335i.C5215p4 r10, java.util.List r11) {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14635e(r9)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x020f
            r5 = 15
            if (r0 == r5) goto L_0x0203
            r5 = 25
            if (r0 == r5) goto L_0x01fe
            r5 = 41
            r6 = 0
            if (r0 == r5) goto L_0x01ae
            r5 = 54
            if (r0 == r5) goto L_0x01a8
            r5 = 57
            java.lang.String r7 = "return"
            if (r0 == r5) goto L_0x0185
            r5 = 19
            if (r0 == r5) goto L_0x0164
            r5 = 20
            if (r0 == r5) goto L_0x0140
            r5 = 60
            if (r0 == r5) goto L_0x008b
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0164;
                default: goto L_0x003a;
            }
        L_0x003a:
            super.mo27875b(r9)
            throw r6
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r4, r11)
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10071g
            return r9
        L_0x004a:
            c.q.a.c.g.i.p4 r9 = r10.mo27495a()
            c.q.a.c.g.i.f r10 = new c.q.a.c.g.i.f
            r10.<init>(r11)
            c.q.a.c.g.i.q r9 = r9.mo27497c(r10)
            return r9
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r1, r11)
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            java.lang.Boolean r9 = r9.mo27212k()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0080
            java.lang.Object r9 = r11.get(r3)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            goto L_0x008a
        L_0x0080:
            java.lang.Object r9 = r11.get(r2)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
        L_0x008a:
            return r9
        L_0x008b:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r1, r11)
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            java.lang.Object r0 = r11.get(r3)
            c.q.a.c.g.i.q r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r0
            c.q.a.c.g.i.q r0 = r10.mo27496b(r0)
            java.lang.Object r11 = r11.get(r2)
            c.q.a.c.g.i.q r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r11
            c.q.a.c.g.i.q r11 = r10.mo27496b(r11)
            boolean r1 = r0 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5054f
            if (r1 == 0) goto L_0x0138
            boolean r1 = r11 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5054f
            if (r1 == 0) goto L_0x0130
            c.q.a.c.g.i.f r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r0
            c.q.a.c.g.i.f r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r11
            r1 = r4
            r2 = r1
        L_0x00c0:
            int r5 = r0.mo27219u()
            if (r1 >= r5) goto L_0x00fb
            if (r2 != 0) goto L_0x00d9
            c.q.a.c.g.i.q r2 = r0.mo27220v(r1)
            c.q.a.c.g.i.q r2 = r10.mo27496b(r2)
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r2 = r4
            goto L_0x00f8
        L_0x00d9:
            c.q.a.c.g.i.q r2 = r11.mo27220v(r1)
            c.q.a.c.g.i.q r2 = r10.mo27496b(r2)
            boolean r5 = r2 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5086h
            if (r5 == 0) goto L_0x00f7
            r9 = r2
            c.q.a.c.g.i.h r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5086h) r9
            java.lang.String r9 = r9.mo27282b()
            java.lang.String r10 = "break"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x012c
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            return r9
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00fb:
            int r9 = r0.mo27219u()
            int r9 = r9 + r3
            int r1 = r11.mo27219u()
            if (r9 != r1) goto L_0x012d
            int r9 = r0.mo27219u()
            c.q.a.c.g.i.q r9 = r11.mo27220v(r9)
            c.q.a.c.g.i.q r2 = r10.mo27496b(r9)
            boolean r9 = r2 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5086h
            if (r9 == 0) goto L_0x012d
            r9 = r2
            c.q.a.c.g.i.h r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5086h) r9
            java.lang.String r9 = r9.mo27282b()
            boolean r10 = r9.equals(r7)
            if (r10 != 0) goto L_0x012c
            java.lang.String r10 = "continue"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            return r2
        L_0x012d:
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            return r9
        L_0x0130:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, case statements are not a list"
            r9.<init>(r10)
            throw r9
        L_0x0138:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, cases are not a list"
            r9.<init>(r10)
            throw r9
        L_0x0140:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14639i(r9, r2, r11)
            c.q.a.c.g.i.q r9 = m13742c(r10, r11)
            r11 = r9
            c.q.a.c.g.i.j r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5118j) r11
            java.lang.String r0 = r11.mo27337b()
            if (r0 != 0) goto L_0x015c
            java.lang.String r11 = ""
            r10.mo27501g(r11, r9)
            goto L_0x0163
        L_0x015c:
            java.lang.String r11 = r11.mo27337b()
            r10.mo27501g(r11, r9)
        L_0x0163:
            return r9
        L_0x0164:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x016d
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            goto L_0x0184
        L_0x016d:
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            boolean r11 = r9 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5054f
            if (r11 == 0) goto L_0x0182
            c.q.a.c.g.i.f r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r9
            c.q.a.c.g.i.q r9 = r10.mo27497c(r9)
            goto L_0x0184
        L_0x0182:
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
        L_0x0184:
            return r9
        L_0x0185:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x018e
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10072h
            goto L_0x01a7
        L_0x018e:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r3, r11)
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            c.q.a.c.g.i.h r10 = new c.q.a.c.g.i.h
            r10.<init>(r7, r9)
            r9 = r10
        L_0x01a7:
            return r9
        L_0x01a8:
            c.q.a.c.g.i.f r9 = new c.q.a.c.g.i.f
            r9.<init>(r11)
            return r9
        L_0x01ae:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14639i(r9, r2, r11)
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            java.lang.Object r0 = r11.get(r3)
            c.q.a.c.g.i.q r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r0
            c.q.a.c.g.i.q r0 = r10.mo27496b(r0)
            int r1 = r11.size()
            if (r1 <= r2) goto L_0x01db
            java.lang.Object r11 = r11.get(r2)
            c.q.a.c.g.i.q r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r11
            c.q.a.c.g.i.q r6 = r10.mo27496b(r11)
        L_0x01db:
            c.q.a.c.g.i.q r11 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            java.lang.Boolean r9 = r9.mo27212k()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x01ee
            c.q.a.c.g.i.f r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r0
            c.q.a.c.g.i.q r11 = r10.mo27497c(r0)
            goto L_0x01f6
        L_0x01ee:
            if (r6 == 0) goto L_0x01f6
            c.q.a.c.g.i.f r6 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r6
            c.q.a.c.g.i.q r11 = r10.mo27497c(r6)
        L_0x01f6:
            boolean r9 = r11 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5086h
            if (r9 == 0) goto L_0x01fb
            return r11
        L_0x01fb:
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            return r9
        L_0x01fe:
            c.q.a.c.g.i.q r9 = m13742c(r10, r11)
            return r9
        L_0x0203:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r4, r11)
            c.q.a.c.g.i.q r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10070f
            return r9
        L_0x020f:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.String r9 = r9.name()
            p040c.p200q.p201a.p264c.p294g.p335i.C5216p5.m14638h(r9, r1, r11)
            java.lang.Object r9 = r11.get(r4)
            c.q.a.c.g.i.q r9 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r9
            c.q.a.c.g.i.q r9 = r10.mo27496b(r9)
            java.lang.Object r0 = r11.get(r3)
            c.q.a.c.g.i.q r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r0
            c.q.a.c.g.i.q r0 = r10.mo27496b(r0)
            java.lang.String r0 = r0.mo27208f()
            java.lang.Object r11 = r11.get(r2)
            c.q.a.c.g.i.q r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r11
            c.q.a.c.g.i.q r11 = r10.mo27496b(r11)
            boolean r1 = r11 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5054f
            if (r1 == 0) goto L_0x0257
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x024f
            c.q.a.c.g.i.f r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5054f) r11
            java.util.List r11 = r11.mo27223z()
            c.q.a.c.g.i.q r9 = r9.mo27216s(r0, r10, r11)
            return r9
        L_0x024f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Function name for apply is undefined"
            r9.<init>(r10)
            throw r9
        L_0x0257:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getCanonicalName()
            r10[r4] = r11
            java.lang.String r11 = "Function arguments for Apply are not a list found %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C4975a0.mo26909a(java.lang.String, c.q.a.c.g.i.p4, java.util.List):c.q.a.c.g.i.q");
    }
}
