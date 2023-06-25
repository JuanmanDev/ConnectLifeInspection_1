package com.internationalwinecooler.p529ui.fragment.dialog;

import android.view.View;
import android.widget.TextView;
import androidx.navigation.NavInflater;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u00020\u00062\u001b\u0010\u0007\u001a\u0017\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0014J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "()V", "mListener", "Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog$ListenerBuilder;", "addUnplacedDialogListener", "", "listenerBuilder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "bindLayout", "", "initSelecter", "onDestroy", "setListeners", "ListenerBuilder", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.fragment.dialog.UnplacedDialog */
/* compiled from: UnplacedDialog.kt */
public final class UnplacedDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public ListenerBuilder mListener;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0010"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog$ListenerBuilder;", "", "(Lcom/internationalwinecooler/ui/fragment/dialog/UnplacedDialog;)V", "confirmAction", "Lkotlin/Function0;", "", "getConfirmAction$app_aab", "()Lkotlin/jvm/functions/Function0;", "setConfirmAction$app_aab", "(Lkotlin/jvm/functions/Function0;)V", "dismissAction", "getDismissAction$app_aab", "setDismissAction$app_aab", "confirm", "action", "dismiss", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.fragment.dialog.UnplacedDialog$ListenerBuilder */
    /* compiled from: UnplacedDialog.kt */
    public final class ListenerBuilder {
        @Nullable
        public Function0<Unit> confirmAction;
        @Nullable
        public Function0<Unit> dismissAction;
        public final /* synthetic */ UnplacedDialog this$0;

        public ListenerBuilder(UnplacedDialog unplacedDialog) {
            Intrinsics.checkNotNullParameter(unplacedDialog, "this$0");
            this.this$0 = unplacedDialog;
        }

        public final void confirm(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, NavInflater.TAG_ACTION);
            this.confirmAction = function0;
        }

        public final void dismiss(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, NavInflater.TAG_ACTION);
            this.dismissAction = function0;
        }

        @Nullable
        public final Function0<Unit> getConfirmAction$app_aab() {
            return this.confirmAction;
        }

        @Nullable
        public final Function0<Unit> getDismissAction$app_aab() {
            return this.dismissAction;
        }

        public final void setConfirmAction$app_aab(@Nullable Function0<Unit> function0) {
            this.confirmAction = function0;
        }

        public final void setDismissAction$app_aab(@Nullable Function0<Unit> function0) {
            this.dismissAction = function0;
        }
    }

    public UnplacedDialog() {
        super(0, 1, (DefaultConstructorMarker) null);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void addUnplacedDialogListener(@NotNull Function1<? super ListenerBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "listenerBuilder");
        ListenerBuilder listenerBuilder = new ListenerBuilder(this);
        function1.invoke(listenerBuilder);
        this.mListener = listenerBuilder;
    }

    public int bindLayout() {
        return R.layout.unplaced_dialog_layout;
    }

    public void initSelecter() {
    }

    public void onDestroy() {
        Function0<Unit> dismissAction$app_aab;
        super.onDestroy();
        ListenerBuilder listenerBuilder = this.mListener;
        if (listenerBuilder != null && (dismissAction$app_aab = listenerBuilder.getDismissAction$app_aab()) != null) {
            dismissAction$app_aab.invoke();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.unplaced_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "unplaced_close");
        JuConnectExtKt.singleClickListener(iconFontView, new UnplacedDialog$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.unplaced_confirm);
        Intrinsics.checkNotNullExpressionValue(textView, "unplaced_confirm");
        JuConnectExtKt.singleClickListener(textView, new UnplacedDialog$setListeners$2(this));
    }
}
