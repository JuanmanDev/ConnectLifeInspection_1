package com.hisense.juconnect.app_device.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.contrarywind.view.WheelView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$style;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p465d.C7559a;
import p040c.p429r.p460b.p461a.p465d.C7560b;

@Metadata(mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\"\u001a\u00020\u0012H\u0002J\u001e\u0010#\u001a\u00020\u00122\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u0010\u0010$\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006&"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/widget/MultiModeDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "currentItem", "", "layout", "Landroid/view/View;", "modeList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "modeResult", "Lcom/hisense/juconnect/app_device/widget/MultiModeDialog$ModeResult;", "pop_confirm", "Landroid/widget/TextView;", "wheelview_mode", "Lcom/contrarywind/view/WheelView;", "initSelecter", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onViewCreated", "view", "setCurrentItem", "setListener", "setModeList", "setResult", "ModeResult", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiModeDialog.kt */
public final class MultiModeDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int currentItem;
    public View layout;
    @NotNull
    public ArrayList<String> modeList = new ArrayList<>();
    @Nullable
    public ModeResult modeResult;
    public TextView pop_confirm;
    public WheelView wheelview_mode;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/widget/MultiModeDialog$ModeResult;", "", "modeResult", "", "mode", "", "currentItem", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MultiModeDialog.kt */
    public interface ModeResult {
        void modeResult(@NotNull String str, int i);
    }

    private final void initSelecter() {
        MultiModeDialog$initSelecter$adapter$1 multiModeDialog$initSelecter$adapter$1 = new MultiModeDialog$initSelecter$adapter$1(this);
        WheelView wheelView = this.wheelview_mode;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheelview_mode");
            wheelView = null;
        }
        wheelView.setCyclic(false);
        WheelView wheelView3 = this.wheelview_mode;
        if (wheelView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheelview_mode");
            wheelView3 = null;
        }
        wheelView3.setAdapter(multiModeDialog$initSelecter$adapter$1);
        WheelView wheelView4 = this.wheelview_mode;
        if (wheelView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheelview_mode");
            wheelView4 = null;
        }
        wheelView4.setCurrentItem(this.currentItem);
        WheelView wheelView5 = this.wheelview_mode;
        if (wheelView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheelview_mode");
        } else {
            wheelView2 = wheelView5;
        }
        wheelView2.setOnItemSelectedListener(new C7560b(this));
    }

    /* renamed from: initSelecter$lambda-1  reason: not valid java name */
    public static final void m27171initSelecter$lambda1(MultiModeDialog multiModeDialog, int i) {
        Intrinsics.checkNotNullParameter(multiModeDialog, "this$0");
        multiModeDialog.currentItem = i;
    }

    private final void setListener() {
        TextView textView = this.pop_confirm;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pop_confirm");
            textView = null;
        }
        textView.setOnClickListener(new C7559a(this));
    }

    /* renamed from: setListener$lambda-0  reason: not valid java name */
    public static final void m27172setListener$lambda0(MultiModeDialog multiModeDialog, View view) {
        Intrinsics.checkNotNullParameter(multiModeDialog, "this$0");
        multiModeDialog.dismiss();
        ModeResult modeResult2 = multiModeDialog.modeResult;
        if (modeResult2 != null) {
            String str = multiModeDialog.modeList.get(multiModeDialog.currentItem);
            Intrinsics.checkNotNullExpressionValue(str, "modeList[currentItem]");
            modeResult2.modeResult(str, multiModeDialog.currentItem);
        }
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

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.layout_mode, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…t_mode, container, false)");
        this.layout = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            inflate = null;
        }
        View findViewById = inflate.findViewById(R$id.pop_confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout.findViewById(R.id.pop_confirm)");
        this.pop_confirm = (TextView) findViewById;
        View view = this.layout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        View findViewById2 = view.findViewById(R$id.wheelview_mode);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "layout.findViewById(R.id.wheelview_mode)");
        this.wheelview_mode = (WheelView) findViewById2;
        View view2 = this.layout;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
    }

    public void onDestroy() {
        this.modeList.clear();
        this.modeResult = null;
        this.currentItem = 0;
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setWindowAnimations(R$style.animate_bottom_dialog);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            window.setAttributes(attributes);
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSelecter();
        setListener();
    }

    public final void setCurrentItem(int i) {
        this.currentItem = i;
    }

    public final void setModeList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "modeList");
        this.modeList = arrayList;
    }

    public final void setResult(@Nullable ModeResult modeResult2) {
        this.modeResult = modeResult2;
    }
}
