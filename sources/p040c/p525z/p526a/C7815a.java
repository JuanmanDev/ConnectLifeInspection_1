package p040c.p525z.p526a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.z.a.a */
/* compiled from: AndroidLogAdapter */
public class C7815a implements C7817c {
    @NonNull
    public final C7816b formatStrategy;

    public C7815a() {
        this.formatStrategy = C7822h.m21875j().mo33335a();
    }

    public boolean isLoggable(int i, @Nullable String str) {
        return true;
    }

    public void log(int i, @Nullable String str, @NonNull String str2) {
        this.formatStrategy.log(i, str, str2);
    }

    public C7815a(@NonNull C7816b bVar) {
        C7826j.m21901a(bVar);
        this.formatStrategy = bVar;
    }
}
