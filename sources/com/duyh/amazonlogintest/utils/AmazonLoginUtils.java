package com.duyh.amazonlogintest.utils;

import android.content.Context;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.api.authorization.AuthorizeResult;
import com.amazon.identity.auth.device.api.authorization.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p048b.p049a.p050a.p051a.p052h.C1361a;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1362a;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1365b;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1368c;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1369d;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;

@Metadata(mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014J\u001a\u0010\u0017\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u0014J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u001aJ\f\u0010\u001b\u001a\u00020\u0010*\u00020\u001cH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, mo47991d2 = {"Lcom/duyh/amazonlogintest/utils/AmazonLoginUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "amazonRequestContext", "Lcom/amazon/identity/auth/device/api/workflow/RequestContext;", "getContext", "()Landroid/content/Context;", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "amazonLogin", "", "amazonOnResume", "amazonOnStart", "listener", "Lcom/amazon/identity/auth/device/api/Listener;", "Lcom/amazon/identity/auth/device/api/authorization/AuthorizeResult;", "Lcom/amazon/identity/auth/device/AuthError;", "fetchUserProfile", "Lcom/amazon/identity/auth/device/api/authorization/User;", "init", "Lcom/amazon/identity/auth/device/api/authorization/AuthorizeListener;", "log", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AmazonLoginUtils.kt */
public class AmazonLoginUtils {
    @Nullable
    public C1373a amazonRequestContext;
    @NotNull
    public final Context context;
    public boolean enabled;

    public AmazonLoginUtils(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    private final void log(String str) {
    }

    public final void amazonLogin() {
        if (this.enabled) {
            AuthorizeRequest.C3801a aVar = new AuthorizeRequest.C3801a(this.amazonRequestContext);
            aVar.mo21409a(C1368c.m321b(), C1368c.m320a());
            C1362a.m293a(aVar.mo21410b());
        }
    }

    public final void amazonOnResume() {
        C1373a aVar;
        if (this.enabled && (aVar = this.amazonRequestContext) != null) {
            aVar.mo15091m();
        }
    }

    public final void amazonOnStart(@NotNull C1361a<AuthorizeResult, AuthError> aVar) {
        Intrinsics.checkNotNullParameter(aVar, RunnerArgs.ARGUMENT_LISTENER);
        if (this.enabled) {
            C1362a.m296d(this.context, new C1369d[]{C1368c.m321b(), C1368c.m320a()}, aVar);
        }
    }

    public final void fetchUserProfile(@NotNull C1361a<User, AuthError> aVar) {
        Intrinsics.checkNotNullParameter(aVar, RunnerArgs.ARGUMENT_LISTENER);
        if (this.enabled) {
            User.m9453a(this.context, aVar);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void init(@NotNull C1365b bVar) {
        Intrinsics.checkNotNullParameter(bVar, RunnerArgs.ARGUMENT_LISTENER);
        if (this.enabled && this.amazonRequestContext == null) {
            C1373a e = C1373a.m330e(this.context);
            this.amazonRequestContext = e;
            if (e != null) {
                e.mo15094p(bVar);
            }
        }
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
