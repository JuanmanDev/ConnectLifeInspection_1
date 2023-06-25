package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040c.p200q.p201a.p264c.p294g.p335i.C5030d7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5046e7;

/* renamed from: c.q.a.c.g.i.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5046e7<MessageType extends C5046e7<MessageType, BuilderType>, BuilderType extends C5030d7<MessageType, BuilderType>> implements C5295u9 {
    public int zzb = 0;

    /* renamed from: g */
    public static void m14014g(Iterable iterable, List list) {
        C5369z8.m15425e(iterable);
        if (iterable instanceof C5016c9) {
            List e = ((C5016c9) iterable).mo27010e();
            C5016c9 c9Var = (C5016c9) list;
            int size = list.size();
            for (Object next : e) {
                if (next == null) {
                    int size2 = c9Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = c9Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            c9Var.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzje) {
                    c9Var.mo27004C((zzje) next);
                } else {
                    c9Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof C5001ba)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public final zzje mo27188a() {
        try {
            int d = mo27715d();
            zzje zzje = zzje.zzb;
            byte[] bArr = new byte[d];
            C4999b8 c = C4999b8.m13824c(bArr);
            mo27713b(c);
            c.mo26985d();
            return new C5263s7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: f */
    public int mo27189f(C5065fa faVar) {
        throw null;
    }

    /* renamed from: h */
    public final byte[] mo27190h() {
        try {
            byte[] bArr = new byte[mo27715d()];
            C4999b8 c = C4999b8.m13824c(bArr);
            mo27713b(c);
            c.mo26985d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
