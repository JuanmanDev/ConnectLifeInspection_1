package com.internationalwinecooler.p529ui.inventory;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.google.gson.JsonObject;
import com.hisense.connect_life.app_account.widget.MultiLanguageDialog;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.CountryConst;
import com.hisense.connect_life.core.global.CountryMapKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import com.hisense.juconnect.app_device.fragment.TicketDialog;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.WineFilterModel;
import com.internationalwinecooler.p529ui.fragment.dialog.InventoryBestToServeYearDialog;
import com.internationalwinecooler.p529ui.fragment.dialog.InventoryGrapeDialog;
import com.internationalwinecooler.p529ui.fragment.dialog.InventoryProductYearDialog;
import com.internationalwinecooler.p529ui.fragment.dialog.InventoryRegionDialog;
import com.juconnect.connect_life.R$id;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005¢\u0006\u0002\u0010\bJ0\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\nH\u0014J\u0018\u0010e\u001a\u00020^2\u0006\u0010f\u001a\u00020\n2\u0006\u0010g\u001a\u00020\u000eH\u0016J\b\u0010h\u001a\u00020^H\u0002J\b\u0010i\u001a\u00020^H\u0002J\b\u0010j\u001a\u00020^H\u0002J\b\u0010k\u001a\u00020^H\u0002J\b\u0010l\u001a\u00020^H\u0002J\b\u0010m\u001a\u00020\nH\u0002J\b\u0010n\u001a\u00020^H\u0002J\u0018\u0010o\u001a\u00020^2\u0006\u0010f\u001a\u00020\n2\u0006\u0010p\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020^H\u0002J\b\u0010r\u001a\u00020^H\u0002J\b\u0010s\u001a\u00020^H\u0002J\b\u0010t\u001a\u00020^H\u0002J\b\u0010u\u001a\u00020^H\u0002J\b\u0010v\u001a\u00020^H\u0002J\b\u0010w\u001a\u00020^H\u0002J\b\u0010x\u001a\u00020^H\u0002J\b\u0010y\u001a\u00020^H\u0002J\b\u0010z\u001a\u00020^H\u0002J\b\u0010{\u001a\u00020^H\u0014J\u0006\u0010|\u001a\u00020^J\u0018\u0010}\u001a\u00020^2\u0006\u0010f\u001a\u00020\n2\u0006\u0010p\u001a\u00020\u000eH\u0016J\b\u0010~\u001a\u00020^H\u0002J\u0006\u0010\u001a\u00020^J1\u0010\u0001\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\nH\u0016J\t\u0010\u0001\u001a\u00020^H\u0002J\t\u0010\u0001\u001a\u00020^H\u0002J\t\u0010\u0001\u001a\u00020^H\u0002J\t\u0010\u0001\u001a\u00020^H\u0014J\u001c\u0010\u0001\u001a\u00020^2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u000eH\u0002J\t\u0010\u0001\u001a\u00020^H\u0002J\t\u0010\u0001\u001a\u00020^H\u0002J\t\u0010\u0001\u001a\u00020^H\u0002J\u0012\u0010\u0001\u001a\u00020^2\u0007\u0010\u0001\u001a\u00020,H\u0016J\u0012\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R.\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R.\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u000e\u0010#\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0004\n\u0002\u00102R\u0012\u00103\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0004\n\u0002\u00102R\u000e\u00104\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0004\n\u0002\u00102R\u0010\u00108\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0+X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u0012\u0012\u0004\u0012\u00020A0\rj\b\u0012\u0004\u0012\u00020A`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R.\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0011\"\u0004\bE\u0010\u0013R\u000e\u0010F\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R.\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0011\"\u0004\b[\u0010\u0013R\u000e\u0010\\\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventoryFilterActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "Lcom/hisense/juconnect/app_device/fragment/TicketDialog$TicketResult;", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$CityResult;", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryRegionDialog$RegionSelectResult;", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryGrapeDialog$GrapeSelectResult;", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryProductYearDialog$YearSelectCallback;", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryBestToServeYearDialog$BestServeYearSelectCallback;", "()V", "bestServeEndCurrentItem", "", "bestServeStartCurrentItem", "countriesList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCountriesList", "()Ljava/util/ArrayList;", "setCountriesList", "(Ljava/util/ArrayList;)V", "countryCurrentItem", "currentFragmentTag", "currentYear", "filterInType", "", "filterModel", "Lcom/internationalwinecooler/model/WineFilterModel;", "getFilterModel", "()Lcom/internationalwinecooler/model/WineFilterModel;", "setFilterModel", "(Lcom/internationalwinecooler/model/WineFilterModel;)V", "grapeTypeCurrentItem", "grapeTypeList", "getGrapeTypeList", "setGrapeTypeList", "mAuid", "mBestServeEndYear", "mBestServeEndYearList", "mBestServeStartYear", "mBestServeStartYearList", "mBestToServe", "mCountryCode", "mDeviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "mGrapeType", "mGrapeTypeList", "mInitAuid", "mIsBestToServeAll", "mIsFavourite", "Ljava/lang/Boolean;", "mIsInInventory", "mIsVintageAllYear", "mRegion", "mRegionList", "mShowDeletedItems", "mVintage", "mVintageEndYear", "mVintageEndYearList", "mVintageStartYear", "mVintageStartYearList", "mWineType", "mWineTypeList", "originalWineCoolName", "regionCountryBeanList", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "regionCurrentItem", "regionList", "getRegionList", "setRegionList", "stringAll", "stringBestToServe", "stringBtnMainCheckboxNormal", "stringBtnMainCheckboxSelected", "stringBtnSwitchOff", "stringBtnSwitchOn", "stringVintage", "typeDessert", "typeFortified", "typeOther", "typeRed", "typeRose", "typeSparkling", "typeWhite", "vintageEndCurrentItem", "vintageStartCurrentItem", "winType", "wineCoolerCurrentItem", "wineTypeCurrentItem", "wineTypeList", "getWineTypeList", "setWineTypeList", "wineTypeSelected", "bestToServeSelectYear", "", "isSelectAll", "startYear", "startCurrentItem", "endYear", "endCurrentItem", "bindLayout", "cityResult", "currentItem", "countryCode", "executeFilter", "getBestToServeCurrentItem", "getCountryCurrentItem", "getGrapeCurrentItem", "getRegionCurrentItem", "getSelectedFilterCount", "getWineCoolerCurrentItem", "grapeSelectResult", "dataString", "initBestToServeYearList", "initCountryList", "initDataState", "initDeviceList", "initGrapeTypeList", "initIntentData", "initRegionList", "initStringData", "initVintageYearList", "initWidgetState", "initWidgets", "initWineType", "regionSelectResult", "resetState", "resetWineType", "selectYear", "setBestToServeShow", "setCountryShow", "setGrapeTypeShow", "setListeners", "setOnclickType", "iconFontView", "Lcom/hisense/connect_life/core/widget/IconFontView;", "type", "setRegionShow", "setVintageShow", "setWineCoolerNameShow", "ticketResult", "deviceInfo", "wineTypeToWineName", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/InventoryFilterActivity")
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryFilterActivity */
/* compiled from: InventoryFilterActivity.kt */
public final class InventoryFilterActivity extends BaseActivity implements TicketDialog.TicketResult, MultiLanguageDialog.CityResult, InventoryRegionDialog.RegionSelectResult, InventoryGrapeDialog.GrapeSelectResult, InventoryProductYearDialog.YearSelectCallback, InventoryBestToServeYearDialog.BestServeYearSelectCallback {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    public int bestServeEndCurrentItem = 1;
    public int bestServeStartCurrentItem;
    @Autowired(name = "inventoryCountryCodeList")
    public ArrayList<String> countriesList;
    public int countryCurrentItem;
    @Autowired(name = "currentFragmentTag")
    @JvmField
    public int currentFragmentTag;
    public int currentYear = 2020;
    @Autowired(name = "filterInType")
    @JvmField
    public boolean filterInType = true;
    @Autowired(name = "filterModel")
    public WineFilterModel filterModel;
    public int grapeTypeCurrentItem;
    @Autowired(name = "inventoryGrapeTypeList")
    public ArrayList<String> grapeTypeList;
    @NotNull
    public String mAuid = "";
    public int mBestServeEndYear;
    @NotNull
    public final ArrayList<Integer> mBestServeEndYearList = new ArrayList<>();
    public int mBestServeStartYear;
    @NotNull
    public final ArrayList<Integer> mBestServeStartYearList = new ArrayList<>();
    @Nullable
    public String mBestToServe = "";
    @NotNull
    public String mCountryCode = "";
    @NotNull
    public List<DeviceInfo> mDeviceList = new ArrayList();
    @NotNull
    public String mGrapeType = "";
    @NotNull
    public final ArrayList<String> mGrapeTypeList = new ArrayList<>();
    @NotNull
    public String mInitAuid = "";
    public boolean mIsBestToServeAll;
    @Nullable
    public Boolean mIsFavourite = Boolean.FALSE;
    @Nullable
    public Boolean mIsInInventory = Boolean.TRUE;
    public boolean mIsVintageAllYear;
    @NotNull
    public String mRegion = "";
    @NotNull
    public final ArrayList<String> mRegionList = new ArrayList<>();
    @Nullable
    public Boolean mShowDeletedItems = Boolean.FALSE;
    @Nullable
    public String mVintage = "";
    public int mVintageEndYear = this.currentYear;
    @NotNull
    public final ArrayList<Integer> mVintageEndYearList = new ArrayList<>();
    public int mVintageStartYear = 1890;
    @NotNull
    public final ArrayList<Integer> mVintageStartYearList = new ArrayList<>();
    @NotNull
    public List<String> mWineType = new ArrayList();
    @NotNull
    public final ArrayList<String> mWineTypeList = new ArrayList<>();
    @NotNull
    public String originalWineCoolName;
    @NotNull
    public final ArrayList<Region> regionCountryBeanList = new ArrayList<>();
    public int regionCurrentItem;
    @Autowired(name = "inventoryRegionsStringList")
    public ArrayList<String> regionList;
    @NotNull
    public String stringAll = "";
    @NotNull
    public String stringBestToServe = "";
    @NotNull
    public String stringBtnMainCheckboxNormal = "";
    @NotNull
    public String stringBtnMainCheckboxSelected = "";
    @NotNull
    public String stringBtnSwitchOff = "";
    @NotNull
    public String stringBtnSwitchOn = "";
    @NotNull
    public String stringVintage = "";
    @NotNull
    public final String typeDessert = "5";
    @NotNull
    public final String typeFortified = "6";
    @NotNull
    public final String typeOther = "7";
    @NotNull
    public final String typeRed = "1";
    @NotNull
    public final String typeRose = "4";
    @NotNull
    public final String typeSparkling = "3";
    @NotNull
    public final String typeWhite = "2";
    public int vintageEndCurrentItem = 1;
    public int vintageStartCurrentItem;
    @Nullable
    public String winType = "";
    public int wineCoolerCurrentItem;
    public int wineTypeCurrentItem;
    @Autowired(name = "inventoryWineTypeStringList")
    public ArrayList<String> wineTypeList;
    public int wineTypeSelected;

    public InventoryFilterActivity() {
        int i = this.currentYear;
        this.mBestServeStartYear = i;
        this.mBestServeEndYear = i + 1;
        this.originalWineCoolName = "";
        this._$_findViewCache = new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public final void executeFilter() {
        List list;
        List list2;
        List list3;
        List<String> list4 = this.mWineType;
        if (list4 != null) {
            CollectionsKt__MutableCollectionsJVMKt.sort(list4);
        }
        String str = this.mAuid;
        String str2 = this.mBestToServe;
        Boolean bool = this.mIsFavourite;
        Boolean bool2 = this.mIsInInventory;
        Boolean bool3 = this.mShowDeletedItems;
        String str3 = this.mVintage;
        if (TextUtils.isEmpty(this.mGrapeType)) {
            list = CollectionsKt__CollectionsKt.emptyList();
        } else {
            list = CollectionsKt__CollectionsKt.mutableListOf(this.mGrapeType);
        }
        List list5 = list;
        if (TextUtils.isEmpty(this.mCountryCode)) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        } else {
            list2 = CollectionsKt__CollectionsKt.mutableListOf(this.mCountryCode);
        }
        List list6 = list2;
        if (TextUtils.isEmpty(this.mRegion)) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        } else {
            list3 = CollectionsKt__CollectionsKt.mutableListOf(this.mRegion);
        }
        setFilterModel(new WineFilterModel(str, str2, bool, bool2, bool3, str3, list5, list6, list3, this.mWineType, 0, 0, 0, 7168, (DefaultConstructorMarker) null));
        Intent intent = new Intent();
        intent.putExtra("data", getFilterModel());
        intent.putExtra("selectFilterCount", getSelectedFilterCount());
        setResult(-1, intent);
        finish();
    }

    private final void getBestToServeCurrentItem() {
        int i = 0;
        int i2 = 0;
        for (T next : this.mBestServeStartYearList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.currentYear == ((Number) next).intValue()) {
                this.bestServeStartCurrentItem = i2;
            }
            i2 = i3;
        }
        for (T next2 : this.mBestServeEndYearList) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.currentYear + 1 == ((Number) next2).intValue()) {
                this.bestServeEndCurrentItem = i;
            }
            i = i4;
        }
    }

    private final void getCountryCurrentItem() {
        ArrayList<String> countriesList2 = getCountriesList();
        if (countriesList2 != null) {
            int i = 0;
            for (T next : countriesList2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) this.mCountryCode, (Object) (String) next)) {
                    this.countryCurrentItem = i;
                }
                i = i2;
            }
        }
    }

    private final void getGrapeCurrentItem() {
        ArrayList<String> arrayList = this.mGrapeTypeList;
        if (arrayList != null) {
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) this.mGrapeType, (Object) (String) next)) {
                    this.grapeTypeCurrentItem = i;
                }
                i = i2;
            }
        }
    }

    private final void getRegionCurrentItem() {
        ArrayList<String> arrayList = this.mRegionList;
        if (arrayList != null) {
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) this.mRegion, (Object) (String) next)) {
                    this.regionCurrentItem = i;
                }
                i = i2;
            }
        }
    }

    private final int getSelectedFilterCount() {
        int i = this.wineTypeSelected;
        int i2 = 0;
        if (i >= 0) {
            i2 = 0 + i;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_region)).getText(), (Object) this.stringAll)) {
            i2++;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_country)).getText(), (Object) this.stringAll)) {
            i2++;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_grapes)).getText(), (Object) this.stringAll)) {
            i2++;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_vintage)).getText(), (Object) this.stringVintage)) {
            i2++;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_wine_cooler_select)).getText(), (Object) this.stringAll) && this.filterInType) {
            i2++;
        }
        if (!Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(R$id.text_best_to_serve)).getText(), (Object) this.stringBestToServe)) {
            i2++;
        }
        if (Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_only_favorite)).getText(), (Object) this.stringBtnSwitchOn)) {
            i2++;
        }
        if (Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_is_in_inventory)).getText(), (Object) this.stringBtnSwitchOn)) {
            i2++;
        }
        return Intrinsics.areEqual((Object) ((IconFontView) _$_findCachedViewById(R$id.icon_show_deleted_items)).getText(), (Object) this.stringBtnSwitchOn) ? i2 + 1 : i2;
    }

    private final void getWineCoolerCurrentItem() {
        List<DeviceInfo> list = this.mDeviceList;
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) this.mAuid, (Object) ((DeviceInfo) next).getDeviceId())) {
                    this.wineCoolerCurrentItem = i;
                }
                i = i2;
            }
        }
    }

    private final void initBestToServeYearList() {
        this.mBestServeStartYearList.clear();
        this.mBestServeEndYearList.clear();
        int i = Calendar.getInstance().get(1) + 100;
        int i2 = 1890;
        if (1890 <= i) {
            while (true) {
                int i3 = i2 + 1;
                this.mBestServeStartYearList.add(Integer.valueOf(i2));
                this.mBestServeEndYearList.add(Integer.valueOf(i2));
                if (i2 != i) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    private final void initCountryList() {
        this.regionCountryBeanList.clear();
        if (getCountriesList() != null) {
            if (getCountriesList().contains("")) {
                getCountriesList().remove("");
            }
            getCountriesList().add(0, "");
            for (String str : getCountriesList()) {
                if (str != null) {
                    if (TextUtils.isEmpty(str)) {
                        CountryConst.Companion companion = CountryConst.Companion;
                        String upperCase = str.toUpperCase();
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                        this.regionCountryBeanList.add(new Region(str, companion.toCountryMap(this, upperCase)));
                    } else {
                        this.regionCountryBeanList.add(new Region(str, str));
                    }
                }
            }
        }
    }

    private final void initDataState() {
        Boolean bool = this.mIsFavourite;
        if (bool != null) {
            if (bool.booleanValue()) {
                ((IconFontView) _$_findCachedViewById(R$id.icon_only_favorite)).setText(this.stringBtnSwitchOn);
            } else {
                ((IconFontView) _$_findCachedViewById(R$id.icon_only_favorite)).setText(this.stringBtnSwitchOff);
            }
        }
        Boolean bool2 = this.mIsInInventory;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                ((IconFontView) _$_findCachedViewById(R$id.icon_is_in_inventory)).setText(this.stringBtnSwitchOff);
            } else {
                ((IconFontView) _$_findCachedViewById(R$id.icon_is_in_inventory)).setText(this.stringBtnSwitchOn);
            }
        }
        Boolean bool3 = this.mShowDeletedItems;
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                ((IconFontView) _$_findCachedViewById(R$id.icon_show_deleted_items)).setText(this.stringBtnSwitchOn);
            } else {
                ((IconFontView) _$_findCachedViewById(R$id.icon_show_deleted_items)).setText(this.stringBtnSwitchOff);
            }
        }
        setCountryShow();
        getCountryCurrentItem();
        setWineCoolerNameShow();
        getWineCoolerCurrentItem();
        setRegionShow();
        getRegionCurrentItem();
        setGrapeTypeShow();
        getGrapeCurrentItem();
        setVintageShow();
        setBestToServeShow();
    }

    private final void initDeviceList() {
        DeviceInfo deviceInfo = r1;
        DeviceInfo deviceInfo2 = new DeviceInfo("", "", "", "", "", "", this.stringAll, "", "", "", "", 0, "", 0, "", "", 0, (JsonObject) null, (OnlineStatus) null, 393216, (DefaultConstructorMarker) null);
        this.mDeviceList.add(deviceInfo);
        this.mDeviceList.addAll(DeviceCache.Companion.getInstance().getAllWineCoolerDevice());
    }

    private final void initGrapeTypeList() {
        this.mGrapeTypeList.clear();
        if (getGrapeTypeList() != null) {
            if (getGrapeTypeList().contains("")) {
                getGrapeTypeList().remove("");
            }
            this.mGrapeTypeList.add(0, this.stringAll);
            for (String add : getGrapeTypeList()) {
                this.mGrapeTypeList.add(add);
            }
        }
    }

    private final void initIntentData() {
        String str;
        String str2;
        String str3;
        String auid = getFilterModel().getAuid();
        this.mAuid = auid;
        this.mInitAuid = auid;
        this.mVintage = getFilterModel().getVintage();
        this.mBestToServe = getFilterModel().getBestToServe();
        this.mIsFavourite = getFilterModel().isFavourite();
        this.mIsInInventory = getFilterModel().isInInventory();
        this.mShowDeletedItems = getFilterModel().getShowDeletedItems();
        List<String> wineType = getFilterModel().getWineType();
        if (wineType != null) {
            this.mWineType = TypeIntrinsics.asMutableList(wineType);
            List<String> country = getFilterModel().getCountry();
            boolean z = true;
            if (country == null || country.isEmpty()) {
                str = "";
            } else {
                List<String> country2 = getFilterModel().getCountry();
                Intrinsics.checkNotNull(country2);
                str = country2.get(0);
            }
            this.mCountryCode = str;
            List<String> region = getFilterModel().getRegion();
            if (region == null || region.isEmpty()) {
                str2 = "";
            } else {
                List<String> region2 = getFilterModel().getRegion();
                Intrinsics.checkNotNull(region2);
                str2 = region2.get(0);
            }
            this.mRegion = str2;
            List<String> grapeType = getFilterModel().getGrapeType();
            if (grapeType != null && !grapeType.isEmpty()) {
                z = false;
            }
            if (z) {
                str3 = "";
            } else {
                List<String> grapeType2 = getFilterModel().getGrapeType();
                Intrinsics.checkNotNull(grapeType2);
                str3 = grapeType2.get(0);
            }
            this.mGrapeType = str3;
            this.mIsVintageAllYear = Intrinsics.areEqual((Object) this.mVintage, (Object) "");
            this.mIsBestToServeAll = Intrinsics.areEqual((Object) this.mBestToServe, (Object) "");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
    }

    private final void initRegionList() {
        this.mRegionList.clear();
        if (getRegionList() != null) {
            if (getRegionList().contains("")) {
                getRegionList().remove("");
            }
            getRegionList().add(0, this.stringAll);
            for (String add : getRegionList()) {
                this.mRegionList.add(add);
            }
        }
    }

    private final void initStringData() {
        this.currentYear = Calendar.getInstance().get(1);
        String string = getString(R.string.all_device);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.all_device)");
        this.stringAll = string;
        String string2 = getString(R.string.btn_switch_off);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.btn_switch_off)");
        this.stringBtnSwitchOff = string2;
        String string3 = getString(R.string.btn_switch_on);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.btn_switch_on)");
        this.stringBtnSwitchOn = string3;
        String string4 = getString(R.string.btn_main_checkbox_selected);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.btn_main_checkbox_selected)");
        this.stringBtnMainCheckboxSelected = string4;
        String string5 = getString(R.string.btn_main_checkbox_normal);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.btn_main_checkbox_normal)");
        this.stringBtnMainCheckboxNormal = string5;
        String string6 = getString(R.string.select_date);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.select_date)");
        this.stringBestToServe = string6;
        String string7 = getString(R.string.select_vintage);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.select_vintage)");
        this.stringVintage = string7;
    }

    private final void initVintageYearList() {
        this.mVintageStartYearList.clear();
        this.mVintageEndYearList.clear();
        int i = this.currentYear;
        int i2 = 1890;
        if (1890 <= i) {
            while (true) {
                int i3 = i2 + 1;
                this.mVintageStartYearList.add(Integer.valueOf(i2));
                this.mVintageEndYearList.add(Integer.valueOf(i2));
                if (i2 != i) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    private final void initWidgetState() {
    }

    /* access modifiers changed from: private */
    public final void resetState() {
        this.wineTypeSelected = 0;
        this.mWineType.clear();
        this.mIsFavourite = Boolean.FALSE;
        this.mIsInInventory = Boolean.TRUE;
        this.mShowDeletedItems = Boolean.FALSE;
        if (this.filterInType) {
            this.mAuid = "";
        } else {
            this.mAuid = this.mInitAuid;
        }
        this.mVintage = "";
        this.mBestToServe = "";
        this.mCountryCode = "";
        this.mRegion = "";
        this.mGrapeType = "";
        this.vintageStartCurrentItem = 0;
        this.vintageEndCurrentItem = this.mVintageEndYearList.size() - 1;
        getBestToServeCurrentItem();
        ((TextView) _$_findCachedViewById(R$id.text_country)).setText(this.stringAll);
        ((TextView) _$_findCachedViewById(R$id.text_region)).setText(this.stringAll);
        ((TextView) _$_findCachedViewById(R$id.text_grapes)).setText(this.stringAll);
        ((TextView) _$_findCachedViewById(R$id.text_country)).setText(this.stringAll);
        setWineCoolerNameShow();
        ((IconFontView) _$_findCachedViewById(R$id.icon_only_favorite)).setText(this.stringBtnSwitchOff);
        ((IconFontView) _$_findCachedViewById(R$id.icon_is_in_inventory)).setText(this.stringBtnSwitchOff);
        ((IconFontView) _$_findCachedViewById(R$id.icon_show_deleted_items)).setText(this.stringBtnSwitchOff);
        ((TextView) _$_findCachedViewById(R$id.text_vintage)).setText(this.stringVintage);
        ((TextView) _$_findCachedViewById(R$id.text_best_to_serve)).setText(this.stringBestToServe);
        getWineCoolerCurrentItem();
        resetWineType();
    }

    private final void setBestToServeShow() {
        int i = 0;
        if (Intrinsics.areEqual((Object) this.mBestToServe, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_best_to_serve)).setText(this.stringBestToServe);
            int i2 = this.currentYear;
            this.mBestServeStartYear = i2;
            this.mBestServeEndYear = i2 + 1;
            int i3 = 0;
            for (T next : this.mBestServeStartYearList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (this.mBestServeStartYear == ((Number) next).intValue()) {
                    this.bestServeStartCurrentItem = i3;
                }
                i3 = i4;
            }
            for (T next2 : this.mBestServeEndYearList) {
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (this.mBestServeEndYear == ((Number) next2).intValue()) {
                    this.bestServeEndCurrentItem = i;
                }
                i = i5;
            }
            return;
        }
        String str = this.mBestToServe;
        Intrinsics.checkNotNull(str);
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{AccountManagerConstants$LOCALE.LOCALE_SEPERATOR}, false, 0, 6, (Object) null);
        this.mBestServeStartYear = Integer.parseInt((String) split$default.get(0));
        this.mBestServeEndYear = Integer.parseInt((String) split$default.get(1));
        ((TextView) _$_findCachedViewById(R$id.text_best_to_serve)).setText(this.mBestServeStartYear + " - " + this.mBestServeEndYear);
        int i6 = 0;
        for (T next3 : this.mBestServeStartYearList) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.mBestServeStartYear == ((Number) next3).intValue()) {
                this.bestServeStartCurrentItem = i6;
            }
            i6 = i7;
        }
        for (T next4 : this.mBestServeEndYearList) {
            int i8 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.mBestServeEndYear == ((Number) next4).intValue()) {
                this.bestServeEndCurrentItem = i;
            }
            i = i8;
        }
    }

    private final void setCountryShow() {
        String str;
        if (Intrinsics.areEqual((Object) this.mCountryCode, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_country)).setText(this.stringAll);
            return;
        }
        Map<String, String> countryMap = CountryMapKt.getCountryMap();
        String str2 = this.mCountryCode;
        String str3 = null;
        if (str2 == null) {
            str = null;
        } else {
            str = str2.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
        }
        if (countryMap.get(str) == null) {
            ((TextView) _$_findCachedViewById(R$id.text_country)).setText(this.mCountryCode);
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(R$id.text_country);
        Map<String, String> countryMap2 = CountryMapKt.getCountryMap();
        String str4 = this.mCountryCode;
        if (str4 != null) {
            str3 = str4.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toUpperCase()");
        }
        textView.setText(String.valueOf(countryMap2.get(str3)));
    }

    private final void setGrapeTypeShow() {
        if (Intrinsics.areEqual((Object) this.mGrapeType, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_grapes)).setText(this.stringAll);
        } else {
            ((TextView) _$_findCachedViewById(R$id.text_grapes)).setText(this.mGrapeType);
        }
    }

    private final void setOnclickType(IconFontView iconFontView, String str) {
        if (Intrinsics.areEqual((Object) iconFontView.getText(), (Object) this.stringBtnMainCheckboxNormal)) {
            iconFontView.setText(this.stringBtnMainCheckboxSelected);
            this.mWineType.add(str);
            return;
        }
        iconFontView.setText(this.stringBtnMainCheckboxNormal);
        this.mWineType.remove(str);
    }

    private final void setRegionShow() {
        if (Intrinsics.areEqual((Object) this.mRegion, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_region)).setText(this.stringAll);
        } else {
            ((TextView) _$_findCachedViewById(R$id.text_region)).setText(this.mRegion);
        }
    }

    private final void setVintageShow() {
        int i = 0;
        if (Intrinsics.areEqual((Object) this.mVintage, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_vintage)).setText(this.stringVintage);
            this.mVintageStartYear = 1890;
            this.mVintageEndYear = this.currentYear;
            int i2 = 0;
            for (T next : this.mVintageStartYearList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (this.mVintageStartYear == ((Number) next).intValue()) {
                    this.vintageStartCurrentItem = i2;
                }
                i2 = i3;
            }
            for (T next2 : this.mVintageEndYearList) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (this.mVintageEndYear == ((Number) next2).intValue()) {
                    this.vintageEndCurrentItem = i;
                }
                i = i4;
            }
            return;
        }
        String str = this.mVintage;
        Intrinsics.checkNotNull(str);
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{AccountManagerConstants$LOCALE.LOCALE_SEPERATOR}, false, 0, 6, (Object) null);
        this.mVintageStartYear = Integer.parseInt((String) split$default.get(0));
        this.mVintageEndYear = Integer.parseInt((String) split$default.get(1));
        ((TextView) _$_findCachedViewById(R$id.text_vintage)).setText(this.mVintageStartYear + " - " + this.mVintageEndYear);
        int i5 = 0;
        for (T next3 : this.mVintageStartYearList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.mVintageStartYear == ((Number) next3).intValue()) {
                this.vintageStartCurrentItem = i5;
            }
            i5 = i6;
        }
        for (T next4 : this.mVintageEndYearList) {
            int i7 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (this.mVintageEndYear == ((Number) next4).intValue()) {
                this.vintageEndCurrentItem = i;
            }
            i = i7;
        }
    }

    private final void setWineCoolerNameShow() {
        if (Intrinsics.areEqual((Object) this.mAuid, (Object) "")) {
            ((TextView) _$_findCachedViewById(R$id.text_wine_cooler_select)).setText(this.stringAll);
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(R$id.text_wine_cooler_select);
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(this.mAuid);
        textView.setText(device == null ? null : device.getDeviceNickName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String wineTypeToWineName(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case 49: goto L_0x0050;
                case 50: goto L_0x0044;
                case 51: goto L_0x0038;
                case 52: goto L_0x002c;
                case 53: goto L_0x0020;
                case 54: goto L_0x0014;
                case 55: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x005c
        L_0x0008:
            java.lang.String r0 = "7"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0011
            goto L_0x005c
        L_0x0011:
            java.lang.String r2 = "Cava Wine"
            goto L_0x005e
        L_0x0014:
            java.lang.String r0 = "6"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001d
            goto L_0x005c
        L_0x001d:
            java.lang.String r2 = "Fortified Wine"
            goto L_0x005e
        L_0x0020:
            java.lang.String r0 = "5"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0029
            goto L_0x005c
        L_0x0029:
            java.lang.String r2 = "Dessert Wine"
            goto L_0x005e
        L_0x002c:
            java.lang.String r0 = "4"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0035
            goto L_0x005c
        L_0x0035:
            java.lang.String r2 = "Rose Wine"
            goto L_0x005e
        L_0x0038:
            java.lang.String r0 = "3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0041
            goto L_0x005c
        L_0x0041:
            java.lang.String r2 = "Sparkling"
            goto L_0x005e
        L_0x0044:
            java.lang.String r0 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004d
            goto L_0x005c
        L_0x004d:
            java.lang.String r2 = "White Wine"
            goto L_0x005e
        L_0x0050:
            java.lang.String r0 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            java.lang.String r2 = "Red Wine"
            goto L_0x005e
        L_0x005c:
            java.lang.String r2 = "Unknown"
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.inventory.InventoryFilterActivity.wineTypeToWineName(java.lang.String):java.lang.String");
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

    public void bestToServeSelectYear(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            this.mIsBestToServeAll = false;
            this.mBestServeStartYear = i;
            this.mBestServeEndYear = i3;
            this.bestServeStartCurrentItem = i2;
            this.bestServeEndCurrentItem = i4;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('-');
            sb.append(i3);
            this.mBestToServe = sb.toString();
            ((TextView) _$_findCachedViewById(R$id.text_best_to_serve)).setText(i + " - " + i3);
        }
    }

    public int bindLayout() {
        return R.layout.activity_inventory_filter_layout;
    }

    public void cityResult(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "countryCode");
        this.mCountryCode = str;
        setCountryShow();
        this.countryCurrentItem = i;
    }

    @NotNull
    public final ArrayList<String> getCountriesList() {
        ArrayList<String> arrayList = this.countriesList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("countriesList");
        return null;
    }

    @NotNull
    public final WineFilterModel getFilterModel() {
        WineFilterModel wineFilterModel = this.filterModel;
        if (wineFilterModel != null) {
            return wineFilterModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("filterModel");
        return null;
    }

    @NotNull
    public final ArrayList<String> getGrapeTypeList() {
        ArrayList<String> arrayList = this.grapeTypeList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("grapeTypeList");
        return null;
    }

    @NotNull
    public final ArrayList<String> getRegionList() {
        ArrayList<String> arrayList = this.regionList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionList");
        return null;
    }

    @NotNull
    public final ArrayList<String> getWineTypeList() {
        ArrayList<String> arrayList = this.wineTypeList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineTypeList");
        return null;
    }

    public void grapeSelectResult(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "dataString");
        if (Intrinsics.areEqual((Object) str, (Object) this.stringAll)) {
            this.mGrapeType = "";
        } else {
            this.mGrapeType = str;
        }
        ((TextView) _$_findCachedViewById(R$id.text_grapes)).setText(str);
        this.grapeTypeCurrentItem = i;
    }

    public void initWidgets() {
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R.string.btn_main_close));
        ((TextView) _$_findCachedViewById(R$id.top_title)).setVisibility(8);
        ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R.string.reset));
        initStringData();
        ((TextView) _$_findCachedViewById(R$id.text_vintage)).setText(this.stringVintage);
        initIntentData();
        initWidgetState();
        initGrapeTypeList();
        initCountryList();
        initRegionList();
        initVintageYearList();
        initBestToServeYearList();
        initDeviceList();
        initDataState();
        initWineType();
        this.originalWineCoolName = ((TextView) _$_findCachedViewById(R$id.text_wine_cooler_select)).getText().toString();
    }

    public final void initWineType() {
        this.wineTypeSelected += this.mWineType.size();
        for (String str : getWineTypeList()) {
            View inflate = getLayoutInflater().inflate(R.layout.inventory_wine_type_item, (LinearLayout) _$_findCachedViewById(R$id.ll_add_wine_type), false);
            ((TextView) inflate.findViewById(R$id.wineType)).setText(str);
            if (this.mWineType.contains(str)) {
                ((IconFontView) inflate.findViewById(R$id.icon_type_view)).setText(this.stringBtnMainCheckboxSelected);
            }
            Intrinsics.checkNotNullExpressionValue(inflate, "itemView");
            JuConnectExtKt.singleClickListener(inflate, new InventoryFilterActivity$initWineType$1$1(inflate, this, str));
            ((LinearLayout) _$_findCachedViewById(R$id.ll_add_wine_type)).addView(inflate);
        }
    }

    public void regionSelectResult(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "dataString");
        if (Intrinsics.areEqual((Object) str, (Object) this.stringAll)) {
            this.mRegion = "";
        } else {
            this.mRegion = str;
        }
        ((TextView) _$_findCachedViewById(R$id.text_region)).setText(str);
        this.regionCurrentItem = i;
    }

    public final void resetWineType() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_add_wine_type);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_add_wine_type");
        for (View findViewById : ViewGroupKt.getChildren(linearLayout)) {
            ((IconFontView) findViewById.findViewById(R$id.icon_type_view)).setText(this.stringBtnMainCheckboxNormal);
        }
    }

    public void selectYear(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            this.mIsVintageAllYear = false;
            this.mVintageStartYear = i;
            this.mVintageEndYear = i3;
            this.vintageStartCurrentItem = i2;
            this.vintageEndCurrentItem = i4;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('-');
            sb.append(i3);
            this.mVintage = sb.toString();
            ((TextView) _$_findCachedViewById(R$id.text_vintage)).setText(i + " - " + i3);
        }
    }

    public final void setCountriesList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.countriesList = arrayList;
    }

    public final void setFilterModel(@NotNull WineFilterModel wineFilterModel) {
        Intrinsics.checkNotNullParameter(wineFilterModel, "<set-?>");
        this.filterModel = wineFilterModel;
    }

    public final void setGrapeTypeList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.grapeTypeList = arrayList;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new InventoryFilterActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_next);
        Intrinsics.checkNotNullExpressionValue(textView, "top_next");
        JuConnectExtKt.singleClickListener(textView, new InventoryFilterActivity$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.text_filter_results);
        Intrinsics.checkNotNullExpressionValue(textView2, "text_filter_results");
        JuConnectExtKt.singleClickListener(textView2, new InventoryFilterActivity$setListeners$3(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.icon_only_favorite);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "icon_only_favorite");
        JuConnectExtKt.singleClickListener(iconFontView2, new InventoryFilterActivity$setListeners$4(this));
        IconFontView iconFontView3 = (IconFontView) _$_findCachedViewById(R$id.icon_is_in_inventory);
        Intrinsics.checkNotNullExpressionValue(iconFontView3, "icon_is_in_inventory");
        JuConnectExtKt.singleClickListener(iconFontView3, new InventoryFilterActivity$setListeners$5(this));
        IconFontView iconFontView4 = (IconFontView) _$_findCachedViewById(R$id.icon_show_deleted_items);
        Intrinsics.checkNotNullExpressionValue(iconFontView4, "icon_show_deleted_items");
        JuConnectExtKt.singleClickListener(iconFontView4, new InventoryFilterActivity$setListeners$6(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.text_wine_cooler_select);
        Intrinsics.checkNotNullExpressionValue(textView3, "text_wine_cooler_select");
        JuConnectExtKt.singleClickListener(textView3, new InventoryFilterActivity$setListeners$7(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.text_country);
        Intrinsics.checkNotNullExpressionValue(textView4, "text_country");
        JuConnectExtKt.singleClickListener(textView4, new InventoryFilterActivity$setListeners$8(this));
        TextView textView5 = (TextView) _$_findCachedViewById(R$id.text_region);
        Intrinsics.checkNotNullExpressionValue(textView5, "text_region");
        JuConnectExtKt.singleClickListener(textView5, new InventoryFilterActivity$setListeners$9(this));
        TextView textView6 = (TextView) _$_findCachedViewById(R$id.text_grapes);
        Intrinsics.checkNotNullExpressionValue(textView6, "text_grapes");
        JuConnectExtKt.singleClickListener(textView6, new InventoryFilterActivity$setListeners$10(this));
        TextView textView7 = (TextView) _$_findCachedViewById(R$id.text_vintage);
        Intrinsics.checkNotNullExpressionValue(textView7, "text_vintage");
        JuConnectExtKt.singleClickListener(textView7, new InventoryFilterActivity$setListeners$11(this));
        TextView textView8 = (TextView) _$_findCachedViewById(R$id.text_best_to_serve);
        Intrinsics.checkNotNullExpressionValue(textView8, "text_best_to_serve");
        JuConnectExtKt.singleClickListener(textView8, new InventoryFilterActivity$setListeners$12(this));
    }

    public final void setRegionList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.regionList = arrayList;
    }

    public final void setWineTypeList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.wineTypeList = arrayList;
    }

    public void ticketResult(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, GeneralMethodConstant.METHOD_DEVICE_INFO);
        ((TextView) _$_findCachedViewById(R$id.text_wine_cooler_select)).setText(deviceInfo.getDeviceNickName());
        this.mAuid = deviceInfo.getDeviceId();
        getWineCoolerCurrentItem();
    }
}
