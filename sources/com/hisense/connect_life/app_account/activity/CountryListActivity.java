package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.adapter.CountryListAdapter;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/CountryListActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "countryListAdapter", "Lcom/hisense/connect_life/app_account/adapter/CountryListAdapter;", "bindLayout", "", "filter", "", "s", "", "getItemPosition", "initWidgets", "setListeners", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/CountryListActivity")
/* compiled from: CountryListActivity.kt */
public final class CountryListActivity extends BaseActivity {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static String countryCode = "";
    public static int countryCurrentItem;
    @NotNull
    public static ArrayList<Region> mRegionList = new ArrayList<>();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public CountryListAdapter countryListAdapter;

    @Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/CountryListActivity$Companion;", "", "()V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "countryCurrentItem", "", "getCountryCurrentItem", "()I", "setCountryCurrentItem", "(I)V", "mRegionList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "Lkotlin/collections/ArrayList;", "getMRegionList", "()Ljava/util/ArrayList;", "setMRegionList", "(Ljava/util/ArrayList;)V", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: CountryListActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getCountryCode() {
            return CountryListActivity.countryCode;
        }

        public final int getCountryCurrentItem() {
            return CountryListActivity.countryCurrentItem;
        }

        @NotNull
        public final ArrayList<Region> getMRegionList() {
            return CountryListActivity.mRegionList;
        }

        public final void setCountryCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            CountryListActivity.countryCode = str;
        }

        public final void setCountryCurrentItem(int i) {
            CountryListActivity.countryCurrentItem = i;
        }

        public final void setMRegionList(@NotNull ArrayList<Region> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            CountryListActivity.mRegionList = arrayList;
        }
    }

    /* access modifiers changed from: private */
    public final void filter(String str) {
        CountryListAdapter countryListAdapter2 = this.countryListAdapter;
        if (countryListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countryListAdapter");
            countryListAdapter2 = null;
        }
        countryListAdapter2.getFilter().filter(str);
    }

    private final int getItemPosition() {
        int i = 0;
        int i2 = 0;
        for (T next : mRegionList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) ((Region) next).getCode(), (Object) countryCode)) {
                i = i2;
            }
            i2 = i3;
        }
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getItemPosition: ", Integer.valueOf(i)));
        return i;
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
        return R$layout.activity_country_list;
    }

    public void initWidgets() {
        CountryListAdapter countryListAdapter2 = new CountryListAdapter();
        this.countryListAdapter = countryListAdapter2;
        CountryListAdapter countryListAdapter3 = null;
        if (countryListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countryListAdapter");
            countryListAdapter2 = null;
        }
        countryListAdapter2.initData(mRegionList, countryCode);
        ((RecyclerView) _$_findCachedViewById(R$id.country_recycler)).setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.country_recycler);
        CountryListAdapter countryListAdapter4 = this.countryListAdapter;
        if (countryListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countryListAdapter");
        } else {
            countryListAdapter3 = countryListAdapter4;
        }
        recyclerView.setAdapter(countryListAdapter3);
        ((RecyclerView) _$_findCachedViewById(R$id.country_recycler)).scrollToPosition(getItemPosition());
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new CountryListActivity$setListeners$1(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.icon_clear);
        Intrinsics.checkNotNullExpressionValue(imageView, "icon_clear");
        JuConnectExtKt.singleClickListener(imageView, new CountryListActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_cancel");
        JuConnectExtKt.singleClickListener(textView, new CountryListActivity$setListeners$3(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_save);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_save");
        JuConnectExtKt.singleClickListener(textView2, new CountryListActivity$setListeners$4(this));
        ((EditText) _$_findCachedViewById(R$id.edit_text_search)).addTextChangedListener(new CountryListActivity$setListeners$5(this));
    }
}
