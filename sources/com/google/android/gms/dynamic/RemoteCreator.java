package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    public final String f8365a;

    /* renamed from: b */
    public Object f8366b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    public RemoteCreator(@NonNull String str) {
        this.f8365a = str;
    }

    @NonNull
    /* renamed from: a */
    public abstract T mo20781a(@NonNull IBinder iBinder);

    @NonNull
    /* renamed from: b */
    public final T mo24663b(@NonNull Context context) {
        if (this.f8366b == null) {
            C3495o.m8908j(context);
            Context c = C3330e.m8445c(context);
            if (c != null) {
                try {
                    this.f8366b = mo20781a((IBinder) c.getClassLoader().loadClass(this.f8365a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f8366b;
    }
}
