package p040c.p525z.p526a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import okhttp3.internal.platform.android.AndroidLog;

/* renamed from: c.z.a.h */
/* compiled from: PrettyFormatStrategy */
public class C7822h implements C7816b {

    /* renamed from: a */
    public final int f14601a;

    /* renamed from: b */
    public final int f14602b;

    /* renamed from: c */
    public final boolean f14603c;
    @NonNull

    /* renamed from: d */
    public final C7818d f14604d;
    @Nullable

    /* renamed from: e */
    public final String f14605e;

    /* renamed from: c.z.a.h$b */
    /* compiled from: PrettyFormatStrategy */
    public static class C7824b {

        /* renamed from: a */
        public int f14606a;

        /* renamed from: b */
        public int f14607b;

        /* renamed from: c */
        public boolean f14608c;
        @Nullable

        /* renamed from: d */
        public C7818d f14609d;
        @Nullable

        /* renamed from: e */
        public String f14610e;

        @NonNull
        /* renamed from: a */
        public C7822h mo33335a() {
            if (this.f14609d == null) {
                this.f14609d = new C7819e();
            }
            return new C7822h(this);
        }

        @NonNull
        /* renamed from: b */
        public C7824b mo33336b(int i) {
            this.f14606a = i;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C7824b mo33337c(int i) {
            this.f14607b = i;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C7824b mo33338d(boolean z) {
            this.f14608c = z;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C7824b mo33339e(@Nullable String str) {
            this.f14610e = str;
            return this;
        }

        public C7824b() {
            this.f14606a = 2;
            this.f14607b = 0;
            this.f14608c = true;
            this.f14610e = "PRETTY_LOGGER";
        }
    }

    @NonNull
    /* renamed from: j */
    public static C7824b m21875j() {
        return new C7824b();
    }

    @Nullable
    /* renamed from: a */
    public final String mo33326a(@Nullable String str) {
        if (C7826j.m21904d(str) || C7826j.m21902b(this.f14605e, str)) {
            return this.f14605e;
        }
        return this.f14605e + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + str;
    }

    /* renamed from: b */
    public final String mo33327b(@NonNull String str) {
        C7826j.m21901a(str);
        return str.substring(str.lastIndexOf(MAPCookie.DOT) + 1);
    }

    /* renamed from: c */
    public final int mo33328c(@NonNull StackTraceElement[] stackTraceElementArr) {
        C7826j.m21901a(stackTraceElementArr);
        for (int i = 5; i < stackTraceElementArr.length; i++) {
            String className = stackTraceElementArr[i].getClassName();
            if (!className.equals(C7821g.class.getName()) && !className.equals(C7820f.class.getName())) {
                return i - 1;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo33329d(int i, @Nullable String str) {
        mo33330e(i, str, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    /* renamed from: e */
    public final void mo33330e(int i, @Nullable String str, @NonNull String str2) {
        C7826j.m21901a(str2);
        this.f14604d.log(i, str, str2);
    }

    /* renamed from: f */
    public final void mo33331f(int i, @Nullable String str, @NonNull String str2) {
        C7826j.m21901a(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            mo33330e(i, str, "│ " + str3);
        }
    }

    /* renamed from: g */
    public final void mo33332g(int i, @Nullable String str) {
        mo33330e(i, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
    }

    /* renamed from: h */
    public final void mo33333h(int i, @Nullable String str, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f14603c) {
            mo33330e(i, str, "│ Thread: " + Thread.currentThread().getName());
            mo33332g(i, str);
        }
        int c = mo33328c(stackTrace) + this.f14602b;
        if (i2 + c > stackTrace.length) {
            i2 = (stackTrace.length - c) - 1;
        }
        String str2 = "";
        while (i2 > 0) {
            int i3 = i2 + c;
            if (i3 < stackTrace.length) {
                str2 = str2 + "   ";
                mo33330e(i, str, 9474 + ' ' + str2 + mo33327b(stackTrace[i3].getClassName()) + MAPCookie.DOT + stackTrace[i3].getMethodName() + " " + " (" + stackTrace[i3].getFileName() + RunnerArgs.CLASSPATH_SEPARATOR + stackTrace[i3].getLineNumber() + ")");
            }
            i2--;
        }
    }

    /* renamed from: i */
    public final void mo33334i(int i, @Nullable String str) {
        mo33330e(i, str, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    public void log(int i, @Nullable String str, @NonNull String str2) {
        C7826j.m21901a(str2);
        String a = mo33326a(str);
        mo33334i(i, a);
        mo33333h(i, a, this.f14601a);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            if (this.f14601a > 0) {
                mo33332g(i, a);
            }
            mo33331f(i, a, str2);
            mo33329d(i, a);
            return;
        }
        if (this.f14601a > 0) {
            mo33332g(i, a);
        }
        for (int i2 = 0; i2 < length; i2 += AndroidLog.MAX_LOG_LENGTH) {
            mo33331f(i, a, new String(bytes, i2, Math.min(length - i2, AndroidLog.MAX_LOG_LENGTH)));
        }
        mo33329d(i, a);
    }

    public C7822h(@NonNull C7824b bVar) {
        C7826j.m21901a(bVar);
        this.f14601a = bVar.f14606a;
        this.f14602b = bVar.f14607b;
        this.f14603c = bVar.f14608c;
        this.f14604d = bVar.f14609d;
        this.f14605e = bVar.f14610e;
    }
}
