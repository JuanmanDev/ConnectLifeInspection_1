package com.hisense.connect_life.app_account.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
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
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$style;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageEntity;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p117g.p118a.C1994a;
import p040c.p429r.p430a.p431a.p435e.C7270a;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003456B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020 H\u0016J\b\u0010,\u001a\u00020 H\u0016J\u001a\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u0010/\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0003J\b\u00100\u001a\u00020 H\u0002J\u001e\u00101\u001a\u00020 2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\u0012j\b\u0012\u0004\u0012\u000203`\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX.¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX.¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog;", "Landroidx/fragment/app/DialogFragment;", "int", "", "(I)V", "changeCity", "", "changeLanguage", "cityResult", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$CityResult;", "countryCode", "", "countryCodeArray", "", "[Ljava/lang/String;", "countryNameArray", "currentItem", "languageList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/core/multilingual/LanguageEntity;", "Lkotlin/collections/ArrayList;", "languageName", "languageResult", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$LanguageResult;", "languageType", "layout", "Landroid/view/View;", "optionResult", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$OptionResult;", "selectAnOption", "type", "initSelecter", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onViewCreated", "view", "setCurrentItem", "setListener", "setRegionList", "regionList", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "CityResult", "LanguageResult", "OptionResult", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiLanguageDialog.kt */
public final class MultiLanguageDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public boolean changeCity;
    public boolean changeLanguage;
    public CityResult cityResult;
    public String countryCode;
    public String[] countryCodeArray;
    public String[] countryNameArray;
    public int currentItem;
    @NotNull
    public final ArrayList<LanguageEntity> languageList = LanguageListManager.INSTANCE.initLanguage();
    public String languageName;
    public LanguageResult languageResult;
    public String languageType;
    public View layout;
    public OptionResult optionResult;
    public boolean selectAnOption;
    public int type;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$CityResult;", "", "cityResult", "", "currentItem", "", "countryCode", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MultiLanguageDialog.kt */
    public interface CityResult {
        void cityResult(int i, @NotNull String str);
    }

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$LanguageResult;", "", "languageResult", "", "languageName", "", "languageType", "currentItem", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MultiLanguageDialog.kt */
    public interface LanguageResult {
        void languageResult(@NotNull String str, @NotNull String str2, int i);
    }

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$OptionResult;", "", "optionResult", "", "deviceName", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MultiLanguageDialog.kt */
    public interface OptionResult {
        void optionResult(@NotNull String str);
    }

    public MultiLanguageDialog(int i) {
        this.type = i;
    }

    private final void initSelecter() {
        C1994a aVar;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i = this.type;
        View view = null;
        if (i == 602) {
            objectRef.element = new MultiLanguageDialog$initSelecter$1(this);
        } else if (i != 603) {
            this.languageList.get(this.currentItem).setSelected(true);
            View view2 = this.layout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
                view2 = null;
            }
            WheelView wheelView = (WheelView) view2.findViewById(R$id.wheelview_city);
            Intrinsics.checkNotNullExpressionValue(wheelView, "layout.wheelview_city");
            wheelView.setVisibility(8);
            objectRef.element = new MultiLanguageDialog$initSelecter$3();
        } else {
            View view3 = this.layout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
                view3 = null;
            }
            WheelView wheelView2 = (WheelView) view3.findViewById(R$id.wheelview_city);
            Intrinsics.checkNotNullExpressionValue(wheelView2, "layout.wheelview_city");
            wheelView2.setVisibility(8);
            objectRef.element = new MultiLanguageDialog$initSelecter$2();
        }
        View view4 = this.layout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view4 = null;
        }
        ((WheelView) view4.findViewById(R$id.wheelview_city)).setCyclic(false);
        View view5 = this.layout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view5 = null;
        }
        ((WheelView) view5.findViewById(R$id.wheelview_language)).setCyclic(false);
        View view6 = this.layout;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view6 = null;
        }
        WheelView wheelView3 = (WheelView) view6.findViewById(R$id.wheelview_language);
        T t = objectRef.element;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            aVar = null;
        } else {
            aVar = (C1994a) t;
        }
        wheelView3.setAdapter(aVar);
        View view7 = this.layout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view7 = null;
        }
        ((WheelView) view7.findViewById(R$id.wheelview_language)).setCurrentItem(this.currentItem);
        View view8 = this.layout;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
        } else {
            view = view8;
        }
        ((WheelView) view.findViewById(R$id.wheelview_language)).setOnItemSelectedListener(new C7270a(this, objectRef));
    }

    /* renamed from: initSelecter$lambda-3  reason: not valid java name */
    public static final void m26917initSelecter$lambda3(MultiLanguageDialog multiLanguageDialog, Ref.ObjectRef objectRef, int i) {
        C1994a aVar;
        Intrinsics.checkNotNullParameter(multiLanguageDialog, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$adapter");
        if (multiLanguageDialog.type == 602) {
            String[] strArr = multiLanguageDialog.countryNameArray;
            if (strArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countryNameArray");
                strArr = null;
            }
            for (String str : strArr) {
                multiLanguageDialog.currentItem = i;
                View view = multiLanguageDialog.layout;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layout");
                    view = null;
                }
                WheelView wheelView = (WheelView) view.findViewById(R$id.wheelview_city);
                T t = objectRef.element;
                if (t == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    aVar = null;
                } else {
                    aVar = (C1994a) t;
                }
                wheelView.setAdapter(aVar);
            }
            return;
        }
        int i2 = 0;
        for (T next : multiLanguageDialog.languageList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            LanguageEntity languageEntity = (LanguageEntity) next;
            multiLanguageDialog.currentItem = i2;
            languageEntity.setSelected(i2 == i);
            i2 = i3;
        }
    }

    private final void setListener() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.pop_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "pop_cancel");
        JuConnectExtKt.singleClickListener(textView, new MultiLanguageDialog$setListener$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.pop_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "pop_confirm");
        JuConnectExtKt.singleClickListener(textView2, new MultiLanguageDialog$setListener$2(this));
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
        LoggerUtil.Companion.mo39146e(String.valueOf(context));
        switch (this.type) {
            case EventBusConstKt.CHANGE_LANGUAGE /*601*/:
                this.languageResult = (LanguageResult) context;
                return;
            case EventBusConstKt.COUNTRY_CITY /*602*/:
                this.cityResult = (CityResult) context;
                return;
            case EventBusConstKt.SELECT_AN_OPTION /*603*/:
                this.optionResult = (OptionResult) context;
                return;
            default:
                return;
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.pop_language, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…nguage, container, false)");
        this.layout = inflate;
        if (inflate != null) {
            return inflate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
    }

    public void onDestroy() {
        String str = null;
        switch (this.type) {
            case EventBusConstKt.CHANGE_LANGUAGE /*601*/:
                if (this.changeLanguage) {
                    LanguageResult languageResult2 = this.languageResult;
                    if (languageResult2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageResult");
                        languageResult2 = null;
                    }
                    String str2 = this.languageName;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageName");
                        str2 = null;
                    }
                    String str3 = this.languageType;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageType");
                    } else {
                        str = str3;
                    }
                    languageResult2.languageResult(str2, str, this.currentItem);
                    break;
                }
                break;
            case EventBusConstKt.COUNTRY_CITY /*602*/:
                if (this.changeCity) {
                    CityResult cityResult2 = this.cityResult;
                    if (cityResult2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cityResult");
                        cityResult2 = null;
                    }
                    int i = this.currentItem;
                    String str4 = this.countryCode;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("countryCode");
                    } else {
                        str = str4;
                    }
                    cityResult2.cityResult(i, str);
                    break;
                }
                break;
            case EventBusConstKt.SELECT_AN_OPTION /*603*/:
                if (this.selectAnOption) {
                    OptionResult optionResult2 = this.optionResult;
                    if (optionResult2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("optionResult");
                        optionResult2 = null;
                    }
                    String str5 = this.languageName;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageName");
                    } else {
                        str = str5;
                    }
                    optionResult2.optionResult(str);
                    break;
                }
                break;
        }
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
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSelecter();
        setListener();
        ((WheelView) _$_findCachedViewById(R$id.wheelview_language)).setTypeface(Typeface.DEFAULT);
        ((WheelView) _$_findCachedViewById(R$id.wheelview_city)).setTypeface(Typeface.DEFAULT);
    }

    public final void setCurrentItem(int i) {
        this.currentItem = i;
    }

    public final void setRegionList(@NotNull ArrayList<Region> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "regionList");
        int size = arrayList.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = "";
        }
        this.countryNameArray = strArr;
        String[] strArr2 = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr2[i3] = "";
        }
        this.countryCodeArray = strArr2;
        while (i < size) {
            int i4 = i + 1;
            String[] strArr3 = this.countryNameArray;
            String[] strArr4 = null;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countryNameArray");
                strArr3 = null;
            }
            strArr3[i] = arrayList.get(i).getName();
            String[] strArr5 = this.countryCodeArray;
            if (strArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countryCodeArray");
            } else {
                strArr4 = strArr5;
            }
            strArr4[i] = arrayList.get(i).getCode();
            i = i4;
        }
    }
}
