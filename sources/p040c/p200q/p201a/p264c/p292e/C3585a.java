package p040c.p200q.p201a.p264c.p292e;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p294g.p300f.C3653k;

/* renamed from: c.q.a.c.e.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C3585a extends IInterface {

    /* renamed from: c.q.a.c.e.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C3586a extends C3653k implements C3585a {
        public C3586a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* renamed from: e */
        public static C3585a m9122e(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C3585a ? (C3585a) queryLocalInterface : new C3588c(iBinder);
        }
    }
}
