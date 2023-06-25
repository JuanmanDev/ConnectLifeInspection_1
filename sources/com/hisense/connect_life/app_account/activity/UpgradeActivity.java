package com.hisense.connect_life.app_account.activity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Route(path = "/account/UpgradeActivity")
@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/UpgradeActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "type", "getType", "setType", "version", "getVersion", "setVersion", "bindLayout", "", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "setListeners", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UpgradeActivity.kt */
public final class UpgradeActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TYPE_FORCED = "1";
    @NotNull
    public static final String TYPE_UNFORCED = "2";
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "content")
    public String content;
    @Autowired(name = "type")
    public String type;
    @Autowired(name = "version")
    public String version;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/UpgradeActivity$Companion;", "", "()V", "TYPE_FORCED", "", "TYPE_UNFORCED", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: UpgradeActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

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

    public int bindLayout() {
        return R$layout.activity_upgrade;
    }

    @NotNull
    public final String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(BrowserServiceFileProvider.CONTENT_SCHEME);
        return null;
    }

    @NotNull
    public final String getType() {
        String str = this.type;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    @NotNull
    public final String getVersion() {
        String str = this.version;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("version");
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.tv_version)).setText(getString(R$string.version) + ':' + getVersion());
        if (Intrinsics.areEqual((Object) getType(), (Object) "1")) {
            ((TextView) _$_findCachedViewById(R$id.tv_close)).setVisibility(8);
            ((TextView) _$_findCachedViewById(R$id.btn_not_now)).setVisibility(8);
        }
    }

    public boolean onKeyDown(int i, @Nullable KeyEvent keyEvent) {
        if (i != 4 || !Intrinsics.areEqual((Object) getType(), (Object) "1")) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_close);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_close");
        JuConnectExtKt.singleClickListener(textView, new UpgradeActivity$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.btn_not_now);
        Intrinsics.checkNotNullExpressionValue(textView2, "btn_not_now");
        JuConnectExtKt.singleClickListener(textView2, new UpgradeActivity$setListeners$2(this));
        Button button = (Button) _$_findCachedViewById(R$id.btn_update);
        Intrinsics.checkNotNullExpressionValue(button, "btn_update");
        JuConnectExtKt.singleClickListener(button, new UpgradeActivity$setListeners$3(this));
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
