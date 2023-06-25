package p040c.p200q.p201a.p264c.p276d.p291o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.d.o.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3573c {

    /* renamed from: b */
    public static C3573c f6557b = new C3573c();
    @Nullable

    /* renamed from: a */
    public C3572b f6558a = null;

    @NonNull
    /* renamed from: a */
    public static C3572b m9110a(@NonNull Context context) {
        return f6557b.mo20850b(context);
    }

    @NonNull
    /* renamed from: b */
    public final synchronized C3572b mo20850b(@NonNull Context context) {
        if (this.f6558a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6558a = new C3572b(context);
        }
        return this.f6558a;
    }
}
