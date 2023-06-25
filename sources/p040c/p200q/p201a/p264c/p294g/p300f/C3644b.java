package p040c.p200q.p201a.p264c.p294g.p300f;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.f.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3644b extends C3645c {

    /* renamed from: a */
    public Object[] f6590a = new Object[4];

    /* renamed from: b */
    public int f6591b = 0;

    /* renamed from: c */
    public boolean f6592c;

    public C3644b(int i) {
    }

    /* renamed from: a */
    public final C3644b mo20910a(Object obj) {
        if (obj != null) {
            mo20911b(this.f6591b + 1);
            Object[] objArr = this.f6590a;
            int i = this.f6591b;
            this.f6591b = i + 1;
            objArr[i] = obj;
            return this;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo20911b(int i) {
        Object[] objArr = this.f6590a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f6590a = Arrays.copyOf(objArr, i2);
            this.f6592c = false;
        } else if (this.f6592c) {
            this.f6590a = (Object[]) objArr.clone();
            this.f6592c = false;
        }
    }
}
