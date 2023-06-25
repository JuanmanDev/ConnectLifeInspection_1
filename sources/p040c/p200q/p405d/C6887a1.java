package p040c.p200q.p405d;

import com.google.protobuf.ProtoSyntax;

/* renamed from: c.q.d.a1 */
/* compiled from: RawMessageInfo */
public final class C6887a1 implements C6947k0 {

    /* renamed from: a */
    public final C6954m0 f13178a;

    /* renamed from: b */
    public final String f13179b;

    /* renamed from: c */
    public final Object[] f13180c;

    /* renamed from: d */
    public final int f13181d;

    public C6887a1(C6954m0 m0Var, String str, Object[] objArr) {
        this.f13178a = m0Var;
        this.f13179b = str;
        this.f13180c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13181d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f13181d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo31751a() {
        return (this.f13181d & 2) == 2;
    }

    /* renamed from: b */
    public C6954m0 mo31752b() {
        return this.f13178a;
    }

    /* renamed from: c */
    public ProtoSyntax mo31753c() {
        return (this.f13181d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public Object[] mo31754d() {
        return this.f13180c;
    }

    /* renamed from: e */
    public String mo31755e() {
        return this.f13179b;
    }
}
