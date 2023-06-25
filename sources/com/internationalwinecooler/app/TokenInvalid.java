package com.internationalwinecooler.app;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.listener.ITokenInvalidCallback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo47991d2 = {"Lcom/internationalwinecooler/app/TokenInvalid;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/hisense/connect_life/hismart/listener/ITokenInvalidCallback;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "accept", "", "isITokenInvalid", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TokenInvalid.kt */
public final class TokenInvalid extends AppCompatActivity implements ITokenInvalidCallback, CoroutineScope {
    public final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void accept(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "isITokenInvalid");
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_TOKEN_INVALID_TURN, Boolean.TRUE);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new TokenInvalid$accept$1(this, (Continuation<? super TokenInvalid$accept$1>) null), 2, (Object) null);
        }
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
