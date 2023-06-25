package com.internationalwinecooler.p529ui.inventory;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.google.gson.Gson;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.listener.IItemCallback;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.DragCustomView;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.wine.model.DeleteWineMessage;
import com.hisense.connect_life.hismart.networks.request.wine.model.ModelExtKt;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineFilterConditionResult;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.fragment.AddWineAutoManualDialog;
import com.hisense.juconnect.app_device.model.LabelScannerType;
import com.hisense.juconnect.app_socket.utils.LogUtils;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.WineFilterModel;
import com.internationalwinecooler.model.WineFilterModelKt;
import com.internationalwinecooler.model.WineSortBaseModel;
import com.internationalwinecooler.p529ui.AddWineSuccessModel;
import com.internationalwinecooler.p529ui.DeleteModel;
import com.internationalwinecooler.p529ui.DeletedWine;
import com.internationalwinecooler.p529ui.fragment.WineCategoryListFragment;
import com.internationalwinecooler.p529ui.fragment.cabinet_exact.InventoryExactCabinetFragment;
import com.internationalwinecooler.p529ui.fragment.cabinet_generic.InventoryGenericCabinetFragment;
import com.internationalwinecooler.p529ui.fragment.dialog.InventoryDetailDialog;
import com.internationalwinecooler.p529ui.fragment.dialog.UnplacedDialog;
import com.internationalwinecooler.p529ui.model.AddWineCategoryModel;
import com.internationalwinecooler.p529ui.model.FavoriteModifyModel;
import com.internationalwinecooler.p529ui.model.UserFilerWineCondition;
import com.internationalwinecooler.utils.WineUtils;
import com.internationalwinecooler.viewmodel.InventoryWineViewModel;
import com.internationalwinecooler.viewmodel.WineCategoryViewModel;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p482v.p483a.p491f.C7613a;
import p040c.p482v.p483a.p491f.C7614b;
import p040c.p482v.p483a.p491f.C7615c;
import p040c.p482v.p483a.p491f.C7616d;
import p040c.p482v.p483a.p491f.C7617e;
import p040c.p482v.p483a.p491f.C7618f;
import p040c.p482v.p483a.p491f.C7619g;
import p040c.p482v.p483a.p491f.C7620h;
import p040c.p482v.p493b.C7644b;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010d\u001a\u00020eH\u0002J\u0010\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020hH\u0007J\b\u0010i\u001a\u00020\u0005H\u0014J\u0006\u0010j\u001a\u00020eJ\u0010\u0010k\u001a\u00020e2\u0006\u0010l\u001a\u00020mH\u0002J\u001c\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e2\u0006\u0010l\u001a\u00020mH\u0002J\u0006\u0010o\u001a\u00020eJ\u0006\u0010p\u001a\u00020\u0016J\b\u0010q\u001a\u00020eH\u0007J\u0006\u0010r\u001a\u00020eJ\b\u0010s\u001a\u00020eH\u0007J\u0006\u0010t\u001a\u00020\u0016J\u0006\u0010u\u001a\u00020eJ\u0006\u0010v\u001a\u00020eJ\u0006\u0010w\u001a\u00020eJ\b\u0010x\u001a\u00020eH\u0002J\b\u0010y\u001a\u00020eH\u0002J\u0010\u0010z\u001a\u00020e2\b\u0010{\u001a\u0004\u0018\u00010|J\u000e\u0010}\u001a\u00020e2\u0006\u0010~\u001a\u00020\bJ\u0019\u0010\u001a\u00020e2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0002J\u0007\u0010\u0001\u001a\u00020eJ\t\u0010\u0001\u001a\u00020eH\u0002J\t\u0010\u0001\u001a\u00020eH\u0014J\t\u0010\u0001\u001a\u00020eH\u0002J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\t\u0010\u0001\u001a\u00020eH\u0014J\u0012\u0010\u0001\u001a\u00020e2\u0007\u0010g\u001a\u00030\u0001H\u0007J\u0007\u0010\u0001\u001a\u00020eJ'\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u00020eH\u0014J\u0012\u0010\u0001\u001a\u00020e2\u0007\u0010g\u001a\u00030\u0001H\u0007J\t\u0010\u0001\u001a\u00020eH\u0014J!\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\u00052\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0016J!\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\u00052\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0016J\t\u0010\u0001\u001a\u00020eH\u0014J\u0017\u0010\u0001\u001a\u00020e2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0007J\u0013\u0010\u0001\u001a\u00020e2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0013\u0010\u0001\u001a\u00020e2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0007\u0010\u0001\u001a\u00020eJ*\u0010 \u0001\u001a\u00020e2\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0007\u0010¢\u0001\u001a\u00020\u001b2\t\b\u0002\u0010£\u0001\u001a\u00020\u001bJ\u001f\u0010¤\u0001\u001a\u00020e2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0007\u0010¦\u0001\u001a\u00020\u001bJ\u001f\u0010§\u0001\u001a\u00020e2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0007\u0010¦\u0001\u001a\u00020\u001bJ\t\u0010¨\u0001\u001a\u00020eH\u0002J\u0010\u0010©\u0001\u001a\u00020e2\u0007\u0010ª\u0001\u001a\u00020\u001bJ\t\u0010«\u0001\u001a\u00020eH\u0002J\u0010\u0010¬\u0001\u001a\u00020e2\u0007\u0010­\u0001\u001a\u00020\u001bJ\t\u0010®\u0001\u001a\u00020eH\u0014J\t\u0010¯\u0001\u001a\u00020eH\u0002J\u0013\u0010°\u0001\u001a\u00020e2\b\u0010±\u0001\u001a\u00030²\u0001H\u0002J\u0007\u0010³\u0001\u001a\u00020eJ\u0007\u0010´\u0001\u001a\u00020eJ\u0011\u0010µ\u0001\u001a\u00020e2\b\u0010¶\u0001\u001a\u00030·\u0001J \u0010¸\u0001\u001a\u00020e2\u0007\u0010¹\u0001\u001a\u00020\u000f2\u000e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0»\u0001J\t\u0010¼\u0001\u001a\u00020eH\u0016J\u0007\u0010½\u0001\u001a\u00020eJ\u0012\u0010¾\u0001\u001a\u00020e2\u0007\u0010¿\u0001\u001a\u00020\u0013H\u0002J\u0019\u0010À\u0001\u001a\u00020e2\u0007\u0010¹\u0001\u001a\u00020\b2\u0007\u0010¦\u0001\u001a\u00020\u001bJ\u0019\u0010Á\u0001\u001a\u00020e2\u0007\u0010¹\u0001\u001a\u00020\u000f2\u0007\u0010¦\u0001\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u0012\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u000e\u0010%\u001a\u00020\u0016XD¢\u0006\u0002\n\u0000R\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\n\"\u0004\b-\u0010\fR\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\n\"\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\n\"\u0004\b8\u0010\fR\u000e\u00109\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R\u001a\u0010A\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u000e\u0010C\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00103\"\u0004\bL\u00105R\u000e\u0010M\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00103\"\u0004\bP\u00105R\u000e\u0010Q\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010T\u001a\u00020U8FX\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bV\u0010WR\u000e\u0010Z\u001a\u00020[X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020]X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010^\u001a\u00020_X.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006Â\u0001"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/InventoryMainActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/internationalwinecooler/viewmodel/InventoryWineViewModel;", "()V", "GOTO_FILTER_CODE", "", "baseWineCategoryList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "getBaseWineCategoryList", "()Ljava/util/List;", "setBaseWineCategoryList", "(Ljava/util/List;)V", "baseWineSortList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "getBaseWineSortList", "setBaseWineSortList", "currentFragment", "Landroidx/fragment/app/Fragment;", "currentFragmentTag", "deviceAuid", "", "exactBaseWineSortList", "getExactBaseWineSortList", "setExactBaseWineSortList", "expired", "", "filterConditionDeviceId", "getFilterConditionDeviceId", "()Ljava/lang/String;", "setFilterConditionDeviceId", "(Ljava/lang/String;)V", "filterModel", "Lcom/internationalwinecooler/model/WineFilterModel;", "genericBaseWineSortList", "getGenericBaseWineSortList", "identityPage", "inventoryCountriesList", "getInventoryCountriesList", "setInventoryCountriesList", "inventoryDetailDialog", "Lcom/internationalwinecooler/ui/fragment/dialog/InventoryDetailDialog;", "inventoryGrapeTypeList", "getInventoryGrapeTypeList", "setInventoryGrapeTypeList", "inventoryRegionList", "getInventoryRegionList", "setInventoryRegionList", "inventoryType", "getInventoryType", "()I", "setInventoryType", "(I)V", "inventoryWineTypeList", "getInventoryWineTypeList", "setInventoryWineTypeList", "isAddExactListFlag", "isFavoriteGenericDialog", "isSearchState", "()Z", "setSearchState", "(Z)V", "isSelectNoLocation", "setSelectNoLocation", "isSelectShowDelete", "setSelectShowDelete", "isShowLoadingThreeSecond", "mItemHolder", "Lcom/hisense/connect_life/core/utils/Holder;", "getMItemHolder", "()Lcom/hisense/connect_life/core/utils/Holder;", "setMItemHolder", "(Lcom/hisense/connect_life/core/utils/Holder;)V", "mItemPosition", "getMItemPosition", "setMItemPosition", "requestExactWineList", "selectFilterCount", "getSelectFilterCount", "setSelectFilterCount", "sortId", "wineCategoryFragment", "Lcom/internationalwinecooler/ui/fragment/WineCategoryListFragment;", "wineCategoryViewModel", "Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "getWineCategoryViewModel", "()Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "wineCategoryViewModel$delegate", "Lkotlin/Lazy;", "wineExactCabinetFragment", "Lcom/internationalwinecooler/ui/fragment/cabinet_exact/InventoryExactCabinetFragment;", "wineGenericCabinetFragment", "Lcom/internationalwinecooler/ui/fragment/cabinet_generic/InventoryGenericCabinetFragment;", "wineSortBaseModel", "Lcom/internationalwinecooler/model/WineSortBaseModel;", "getWineSortBaseModel", "()Lcom/internationalwinecooler/model/WineSortBaseModel;", "setWineSortBaseModel", "(Lcom/internationalwinecooler/model/WineSortBaseModel;)V", "addWine", "", "addWineCategory", "event", "Lcom/internationalwinecooler/ui/model/AddWineCategoryModel;", "bindLayout", "dismissLoading", "filterExactSearchList", "charSequence", "", "filterSearchList", "getCacheFilterCondition", "getExactWineBottlesCount", "getExactWineBottlesFilterCount", "getFilterCondition", "getGenericWineBottlesFilterCount", "getWineBottlesCount", "getWineBottlesCountFromCategory", "getWineCategory", "getWineCategoryWithLastChange", "gotoAddWineActivity", "gotoFilterActivity", "gotoWineDetail", "wineBaseInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "gotoWineDetailFromCategory", "wineList", "handleGetWineCategory", "wineCategoryInfoList", "hideEmptyView", "hideKeyboard", "initData", "initGetWineListParam", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "modifyFavoriteCategory", "Lcom/internationalwinecooler/ui/model/FavoriteModifyModel;", "obtainSocketMessage", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onNetworkEvent", "Lcom/internationalwinecooler/ui/DeleteModel;", "onPause", "onPermissionsDenied", "perms", "onPermissionsGranted", "onResume", "onWineCategoryChanged", "onWineRemove", "deledteWine", "Lcom/internationalwinecooler/ui/DeletedWine;", "onWineRemoved", "deleteWineMessage", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeleteWineMessage;", "refreshMessage", "removeDataObserver", "idInventoryList", "showToast", "deleteType", "removeMulWineWithIdArrayExe", "idInventoriesList", "isRefreshExactList", "removeWineCategory", "requestCameraPermission", "setAddWineLayoutShow", "isShow", "setFilterCountShow", "setGenericZoneTopViewShowOrHide", "isHide", "setListeners", "setSearchViewShow", "showKeyboard", "et", "Landroid/widget/EditText;", "showSnackbar", "showSortDialog", "showUnplacedDialog", "holder", "Lcom/donkingliang/groupedadapter/holder/BaseViewHolder;", "showWineDetail", "wine", "dismissCallBack", "Lcom/hisense/connect_life/core/listener/IItemCallback;", "subscribeObservable", "subscribeObservableCategory", "switchFragment", "fragment", "updateWineCategoryFavorite", "updateWineFavorite", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/InventoryMainActivity")
/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity */
/* compiled from: InventoryMainActivity.kt */
public final class InventoryMainActivity extends BaseVmActivity<InventoryWineViewModel> {
    public final int GOTO_FILTER_CODE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public List<WineCategoryInfo> baseWineCategoryList = new ArrayList();
    @NotNull
    public List<List<WineInventoryBean>> baseWineSortList = new ArrayList();
    @Nullable
    public Fragment currentFragment;
    public int currentFragmentTag;
    @NotNull
    @Autowired(name = "auid")
    @JvmField
    public String deviceAuid = "";
    @NotNull
    public List<List<WineInventoryBean>> exactBaseWineSortList = new ArrayList();
    @Autowired(name = "expired")
    @JvmField
    public boolean expired;
    @NotNull
    public String filterConditionDeviceId = "";
    public WineFilterModel filterModel;
    @NotNull
    public final List<List<WineInventoryBean>> genericBaseWineSortList = new ArrayList();
    @NotNull
    public final String identityPage = HtmlPaths.WINE_INVENTORY_MAINTAIN;
    @NotNull
    public List<String> inventoryCountriesList = new ArrayList();
    @NotNull
    public final InventoryDetailDialog inventoryDetailDialog = new InventoryDetailDialog();
    @NotNull
    public List<String> inventoryGrapeTypeList = new ArrayList();
    @NotNull
    public List<String> inventoryRegionList = new ArrayList();
    public int inventoryType;
    @NotNull
    public List<String> inventoryWineTypeList = new ArrayList();
    public boolean isAddExactListFlag = true;
    public boolean isFavoriteGenericDialog;
    public boolean isSearchState;
    public boolean isSelectNoLocation;
    public boolean isSelectShowDelete;
    public boolean isShowLoadingThreeSecond;
    @Nullable
    public Holder mItemHolder;
    public int mItemPosition;
    public boolean requestExactWineList;
    public int selectFilterCount;
    @NotNull
    public String sortId = "5";
    @NotNull
    public WineCategoryListFragment wineCategoryFragment = new WineCategoryListFragment();
    @NotNull
    public final Lazy wineCategoryViewModel$delegate = LazyKt__LazyJVMKt.lazy(InventoryMainActivity$wineCategoryViewModel$2.INSTANCE);
    @NotNull
    public InventoryExactCabinetFragment wineExactCabinetFragment = new InventoryExactCabinetFragment();
    @NotNull
    public InventoryGenericCabinetFragment wineGenericCabinetFragment = new InventoryGenericCabinetFragment();
    public WineSortBaseModel wineSortBaseModel;

    public static final /* synthetic */ InventoryWineViewModel access$getMViewModel(InventoryMainActivity inventoryMainActivity) {
        return (InventoryWineViewModel) inventoryMainActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final void addWine() {
        AddWineAutoManualDialog addWineAutoManualDialog = new AddWineAutoManualDialog();
        addWineAutoManualDialog.setAddWineCallback(new InventoryMainActivity$addWine$1(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(addWineAutoManualDialog, supportFragmentManager);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r8 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r10 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r10 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r11 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r12 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if (r14 == null) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void filterExactSearchList(java.lang.CharSequence r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r17.toString()
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r2 = "this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r3 = r1.length()
            r5 = 0
            if (r3 != 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = r5
        L_0x0019:
            if (r3 == 0) goto L_0x0041
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r1 = r0.exactBaseWineSortList
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0150
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r2.next()
            com.juconnect.connectlife.model.WineInventoryBean r3 = (com.juconnect.connectlife.model.WineInventoryBean) r3
            r3.setFilteredOut(r5)
            goto L_0x0031
        L_0x0041:
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r3 = r0.exactBaseWineSortList
            java.util.Iterator r3 = r3.iterator()
        L_0x0047:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0150
            java.lang.Object r6 = r3.next()
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0057:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0047
            java.lang.Object r7 = r6.next()
            com.juconnect.connectlife.model.WineInventoryBean r7 = (com.juconnect.connectlife.model.WineInventoryBean) r7
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x006d
        L_0x006b:
            r8 = r9
            goto L_0x0077
        L_0x006d:
            java.lang.String r8 = r8.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            if (r8 != 0) goto L_0x0077
            goto L_0x006b
        L_0x0077:
            java.lang.String r10 = r7.getCountry()
            if (r10 != 0) goto L_0x007f
        L_0x007d:
            r10 = r9
            goto L_0x0089
        L_0x007f:
            java.lang.String r10 = r10.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            if (r10 != 0) goto L_0x0089
            goto L_0x007d
        L_0x0089:
            java.util.Map r11 = com.hisense.connect_life.core.global.CountryMapKt.getCountryMap()
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x0097
        L_0x0095:
            r10 = r9
            goto L_0x00a1
        L_0x0097:
            java.lang.String r10 = r10.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            if (r10 != 0) goto L_0x00a1
            goto L_0x0095
        L_0x00a1:
            java.lang.String r11 = r7.getRegion()
            if (r11 != 0) goto L_0x00a9
        L_0x00a7:
            r11 = r9
            goto L_0x00b3
        L_0x00a9:
            java.lang.String r11 = r11.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            if (r11 != 0) goto L_0x00b3
            goto L_0x00a7
        L_0x00b3:
            java.lang.Long r12 = r7.getVintage()
            if (r12 != 0) goto L_0x00bb
        L_0x00b9:
            r12 = r9
            goto L_0x00cc
        L_0x00bb:
            java.lang.String r12 = r12.toString()
            if (r12 != 0) goto L_0x00c2
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r12 = r12.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            if (r12 != 0) goto L_0x00cc
            goto L_0x00b9
        L_0x00cc:
            java.util.List r13 = r7.getGrapeType()
            if (r13 != 0) goto L_0x00d6
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x00d6:
            java.lang.String r14 = r7.getPersonalNotes()
            if (r14 != 0) goto L_0x00de
        L_0x00dc:
            r14 = r9
            goto L_0x00e8
        L_0x00de:
            java.lang.String r14 = r14.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            if (r14 != 0) goto L_0x00e8
            goto L_0x00dc
        L_0x00e8:
            java.lang.String r15 = r7.getWinery()
            if (r15 != 0) goto L_0x00ef
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r15 = r15.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r2)
            if (r15 != 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r9 = r15
        L_0x00fa:
            r15 = 2
            r4 = 0
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r11, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r12, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r14, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r8 != 0) goto L_0x0148
            boolean r8 = r13 instanceof java.util.Collection
            if (r8 == 0) goto L_0x012c
            boolean r8 = r13.isEmpty()
            if (r8 == 0) goto L_0x012c
        L_0x012a:
            r4 = r5
            goto L_0x0143
        L_0x012c:
            java.util.Iterator r8 = r13.iterator()
        L_0x0130:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x012a
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r1, (boolean) r5, (int) r15, (java.lang.Object) r4)
            if (r9 == 0) goto L_0x0130
            r4 = 1
        L_0x0143:
            if (r4 == 0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            r4 = r5
            goto L_0x0149
        L_0x0148:
            r4 = 1
        L_0x0149:
            r8 = 1
            r4 = r4 ^ r8
            r7.setFilteredOut(r4)
            goto L_0x0057
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.inventory.InventoryMainActivity.filterExactSearchList(java.lang.CharSequence):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r10 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r12 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r12 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        if (r13 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        if (r14 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f2, code lost:
        if (r5 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x015d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> filterSearchList(java.lang.CharSequence r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r18.toString()
            java.lang.String r2 = r2.toUpperCase()
            java.lang.String r3 = "this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r4 = r2.length()
            r6 = 0
            if (r4 != 0) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = r6
        L_0x001e:
            if (r4 == 0) goto L_0x002a
            r1.clear()
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r2 = r0.baseWineSortList
            r1.addAll(r2)
            goto L_0x0174
        L_0x002a:
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r4 = r0.baseWineSortList
            if (r4 == 0) goto L_0x0037
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r4 = r6
            goto L_0x0038
        L_0x0037:
            r4 = 1
        L_0x0038:
            if (r4 != 0) goto L_0x016c
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r4 = r0.baseWineSortList
            java.lang.Object r4 = r4.get(r6)
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x004d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r4 = r6
            goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            if (r4 == 0) goto L_0x0052
            goto L_0x016c
        L_0x0052:
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r4 = r0.baseWineSortList
            java.lang.Object r4 = r4.get(r6)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0063:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0161
            java.lang.Object r8 = r4.next()
            r9 = r8
            com.juconnect.connectlife.model.WineInventoryBean r9 = (com.juconnect.connectlife.model.WineInventoryBean) r9
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x007a
        L_0x0078:
            r10 = r11
            goto L_0x0084
        L_0x007a:
            java.lang.String r10 = r10.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            if (r10 != 0) goto L_0x0084
            goto L_0x0078
        L_0x0084:
            java.lang.String r12 = r9.getCountry()
            if (r12 != 0) goto L_0x008c
        L_0x008a:
            r12 = r11
            goto L_0x0096
        L_0x008c:
            java.lang.String r12 = r12.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            if (r12 != 0) goto L_0x0096
            goto L_0x008a
        L_0x0096:
            java.util.Map r13 = com.hisense.connect_life.core.global.CountryMapKt.getCountryMap()
            java.lang.Object r12 = r13.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00a4
        L_0x00a2:
            r12 = r11
            goto L_0x00ae
        L_0x00a4:
            java.lang.String r12 = r12.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            if (r12 != 0) goto L_0x00ae
            goto L_0x00a2
        L_0x00ae:
            java.lang.String r13 = r9.getRegion()
            if (r13 != 0) goto L_0x00b6
        L_0x00b4:
            r13 = r11
            goto L_0x00c0
        L_0x00b6:
            java.lang.String r13 = r13.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            if (r13 != 0) goto L_0x00c0
            goto L_0x00b4
        L_0x00c0:
            java.lang.Long r14 = r9.getVintage()
            if (r14 != 0) goto L_0x00c8
        L_0x00c6:
            r14 = r11
            goto L_0x00d9
        L_0x00c8:
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto L_0x00cf
            goto L_0x00c6
        L_0x00cf:
            java.lang.String r14 = r14.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r3)
            if (r14 != 0) goto L_0x00d9
            goto L_0x00c6
        L_0x00d9:
            java.util.List r15 = r9.getGrapeType()
            if (r15 != 0) goto L_0x00e3
            java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x00e3:
            java.lang.String r16 = r9.getPersonalNotes()
            if (r16 != 0) goto L_0x00eb
        L_0x00e9:
            r5 = r11
            goto L_0x00f5
        L_0x00eb:
            java.lang.String r5 = r16.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            if (r5 != 0) goto L_0x00f5
            goto L_0x00e9
        L_0x00f5:
            java.lang.String r9 = r9.getWinery()
            if (r9 != 0) goto L_0x00fc
            goto L_0x0107
        L_0x00fc:
            java.lang.String r9 = r9.toUpperCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
            if (r9 != 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r11 = r9
        L_0x0107:
            r9 = 2
            r16 = r3
            r3 = 0
            boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r10 != 0) goto L_0x0157
            boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r12, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r10 != 0) goto L_0x0157
            boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r13, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r10 != 0) goto L_0x0157
            boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r14, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r10 != 0) goto L_0x0157
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r5 != 0) goto L_0x0157
            boolean r5 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r11, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r5 != 0) goto L_0x0157
            boolean r5 = r15 instanceof java.util.Collection
            if (r5 == 0) goto L_0x013b
            boolean r5 = r15.isEmpty()
            if (r5 == 0) goto L_0x013b
        L_0x0139:
            r3 = r6
            goto L_0x0152
        L_0x013b:
            java.util.Iterator r5 = r15.iterator()
        L_0x013f:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0139
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r10, (java.lang.CharSequence) r2, (boolean) r6, (int) r9, (java.lang.Object) r3)
            if (r10 == 0) goto L_0x013f
            r3 = 1
        L_0x0152:
            if (r3 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r3 = r6
            goto L_0x0158
        L_0x0157:
            r3 = 1
        L_0x0158:
            if (r3 == 0) goto L_0x015d
            r7.add(r8)
        L_0x015d:
            r3 = r16
            goto L_0x0063
        L_0x0161:
            r1.clear()
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r7)
            r1.addAll(r2)
            goto L_0x0174
        L_0x016c:
            r1.clear()
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r2 = r0.baseWineSortList
            r1.addAll(r2)
        L_0x0174:
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r2 = r0.genericBaseWineSortList
            r2.clear()
            java.util.List<java.util.List<com.juconnect.connectlife.model.WineInventoryBean>> r2 = r0.genericBaseWineSortList
            r2.addAll(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.inventory.InventoryMainActivity.filterSearchList(java.lang.CharSequence):java.util.List");
    }

    /* renamed from: getWineCategoryWithLastChange$lambda-11  reason: not valid java name */
    public static final void m27195getWineCategoryWithLastChange$lambda11(InventoryMainActivity inventoryMainActivity, Ref.ObjectRef objectRef, List list) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$getCategoryLiveData");
        inventoryMainActivity.handleGetWineCategory(list);
        objectRef.element = null;
    }

    private final void gotoAddWineActivity() {
        WineLabelScannerActivity.Companion.gotoWLabScanner(this, LabelScannerType.ADD_WINE.getType());
    }

    /* access modifiers changed from: private */
    public final void gotoFilterActivity() {
        int i = this.GOTO_FILTER_CODE;
        Postcard a = C1337a.m211c().mo15011a(Paths.App.InventoryFilterActivity);
        Postcard withStringArrayList = a.withParcelable("filterModel", getWineSortBaseModel().getFilterModel()).withStringArrayList("inventoryCountryCodeList", (ArrayList) getInventoryCountriesList()).withStringArrayList("inventoryRegionsStringList", (ArrayList) getInventoryRegionList()).withStringArrayList("inventoryGrapeTypeList", (ArrayList) getInventoryGrapeTypeList()).withStringArrayList("inventoryWineTypeStringList", (ArrayList) getInventoryWineTypeList());
        String str = this.deviceAuid;
        withStringArrayList.withBoolean("filterInType", str == null || str.length() == 0).withInt("currentFragmentTag", this.currentFragmentTag);
        a.navigation((Activity) this, i);
    }

    private final void handleGetWineCategory(List<WineCategoryInfo> list) {
        this.isShowLoadingThreeSecond = true;
        hideLoading();
        if (list != null) {
            getBaseWineCategoryList().clear();
            LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("当前需要处理的酒品类数量是 ", Integer.valueOf(list.size())));
            if (!TextUtils.isEmpty(this.deviceAuid)) {
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    WineCategoryInfo wineCategoryInfo = (WineCategoryInfo) next;
                    List<String> deviceIdList = wineCategoryInfo.getDeviceIdList();
                    boolean z = false;
                    if (!(deviceIdList == null || deviceIdList.isEmpty())) {
                        List<String> deviceIdList2 = wineCategoryInfo.getDeviceIdList();
                        Intrinsics.checkNotNull(deviceIdList2);
                        z = deviceIdList2.contains(this.deviceAuid);
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                getBaseWineCategoryList().addAll(arrayList);
            } else if (this.expired) {
                getBaseWineCategoryList().addAll(list);
            } else {
                getBaseWineCategoryList().addAll(list);
            }
        }
        this.wineCategoryFragment.setWineCategoryListShow();
    }

    /* access modifiers changed from: private */
    public final void hideKeyboard() {
        Object systemService = getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    private final void initGetWineListParam() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.deviceAuid;
        if (str == null) {
            str = "";
        }
        WineFilterModel wineFilterModel = new WineFilterModel(str, "", Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, "", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), this.expired ? currentTimeMillis : -1, this.expired ? currentTimeMillis : -1, this.expired ? currentTimeMillis : -1);
        this.filterModel = wineFilterModel;
        String str2 = this.sortId;
        if (wineFilterModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterModel");
            wineFilterModel = null;
        }
        setWineSortBaseModel(new WineSortBaseModel(1, -1, str2, wineFilterModel));
    }

    public static /* synthetic */ void removeDataObserver$default(InventoryMainActivity inventoryMainActivity, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        inventoryMainActivity.removeDataObserver(list, z, z2);
    }

    /* access modifiers changed from: private */
    public final void requestCameraPermission() {
        if (EasyPermissions.m26767a(this, "android.permission.CAMERA")) {
            gotoAddWineActivity();
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, 1, "android.permission.CAMERA");
        bVar.mo50749d(R.string.camera_permissions);
        bVar.mo50748c(R.string.rationale_ask_ok);
        bVar.mo50747b(R.string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…                 .build()");
        EasyPermissions.m26771e(a);
    }

    /* access modifiers changed from: private */
    public final void setFilterCountShow() {
        if (this.selectFilterCount == 0) {
            TextView textView = (TextView) _$_findCachedViewById(R$id.filter_count);
            Intrinsics.checkNotNullExpressionValue(textView, "filter_count");
            textView.setVisibility(8);
            IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.filter_icon);
            Intrinsics.checkNotNullExpressionValue(iconFontView, "filter_icon");
            iconFontView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.filter_count);
        Intrinsics.checkNotNullExpressionValue(textView2, "filter_count");
        textView2.setVisibility(0);
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.filter_icon);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "filter_icon");
        iconFontView2.setVisibility(8);
        ((TextView) _$_findCachedViewById(R$id.filter_count)).setText(String.valueOf(this.selectFilterCount));
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27196setListeners$lambda2(InventoryMainActivity inventoryMainActivity, View view) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        ((RelativeLayout) inventoryMainActivity._$_findCachedViewById(R$id.sort_layout)).setVisibility(0);
        inventoryMainActivity.switchFragment(inventoryMainActivity.wineCategoryFragment);
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27197setListeners$lambda3(InventoryMainActivity inventoryMainActivity, View view) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        if (inventoryMainActivity.isSelectShowDelete || inventoryMainActivity.isSelectNoLocation) {
            String string = inventoryMainActivity.getString(R.string.remove_or_unplaced_wine_cabinet_tips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.remov…placed_wine_cabinet_tips)");
            inventoryMainActivity.showString(string);
            ((RadioButton) inventoryMainActivity._$_findCachedViewById(R$id.wine_list)).setChecked(true);
            ((RadioButton) inventoryMainActivity._$_findCachedViewById(R$id.wine_cabinet)).setChecked(false);
            return;
        }
        ((RelativeLayout) inventoryMainActivity._$_findCachedViewById(R$id.sort_layout)).setVisibility(8);
        if (inventoryMainActivity.inventoryType == 0) {
            inventoryMainActivity.switchFragment(inventoryMainActivity.wineGenericCabinetFragment);
        } else {
            inventoryMainActivity.switchFragment(inventoryMainActivity.wineExactCabinetFragment);
        }
    }

    /* access modifiers changed from: private */
    public final void setSearchViewShow() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.normal_top_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "normal_top_view");
        if (relativeLayout.getVisibility() == 0) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R$id.normal_top_view);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "normal_top_view");
            relativeLayout2.setVisibility(8);
            setAddWineLayoutShow(false);
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R$id.top_search_view);
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "top_search_view");
            relativeLayout3.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(R$id.normal_top_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout4, "normal_top_view");
        relativeLayout4.setVisibility(0);
        setAddWineLayoutShow(true);
        RelativeLayout relativeLayout5 = (RelativeLayout) _$_findCachedViewById(R$id.top_search_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout5, "top_search_view");
        relativeLayout5.setVisibility(8);
        ((EditText) _$_findCachedViewById(R$id.edit_search)).setText("");
    }

    /* access modifiers changed from: private */
    public final void showKeyboard(EditText editText) {
        editText.requestFocus();
        Object systemService = getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: subscribeObservable$lambda-29  reason: not valid java name */
    public static final void m27198subscribeObservable$lambda29(InventoryMainActivity inventoryMainActivity, List list) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(list, LanguageConstKt.f15954it);
        removeDataObserver$default(inventoryMainActivity, list, true, false, 4, (Object) null);
        inventoryMainActivity.getWineCategoryWithLastChange();
    }

    /* renamed from: subscribeObservableCategory$lambda-30  reason: not valid java name */
    public static final void m27199subscribeObservableCategory$lambda30(InventoryMainActivity inventoryMainActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            inventoryMainActivity.handleGetWineCategory((List) pair.getSecond());
            return;
        }
        String string = inventoryMainActivity.getString(R.string.failure);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
        inventoryMainActivity.showString(string);
    }

    /* renamed from: subscribeObservableCategory$lambda-32  reason: not valid java name */
    public static final void m27200subscribeObservableCategory$lambda32(InventoryMainActivity inventoryMainActivity, UserFilerWineCondition userFilerWineCondition) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        if (userFilerWineCondition != null) {
            inventoryMainActivity.inventoryGrapeTypeList.clear();
            inventoryMainActivity.inventoryGrapeTypeList.addAll(userFilerWineCondition.getGrapeList());
            inventoryMainActivity.inventoryCountriesList.clear();
            inventoryMainActivity.inventoryCountriesList.addAll(userFilerWineCondition.getCountryList());
            inventoryMainActivity.inventoryRegionList.clear();
            inventoryMainActivity.inventoryRegionList.addAll(userFilerWineCondition.getAreaList());
            inventoryMainActivity.inventoryWineTypeList.clear();
            for (String str : userFilerWineCondition.getWineTypeList()) {
                if (!(str.length() == 0)) {
                    inventoryMainActivity.getInventoryWineTypeList().add(WineUtils.Companion.wineTypeToLocalLanguage(inventoryMainActivity, str));
                }
            }
        }
    }

    /* renamed from: subscribeObservableCategory$lambda-33  reason: not valid java name */
    public static final void m27201subscribeObservableCategory$lambda33(InventoryMainActivity inventoryMainActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = inventoryMainActivity.getString(R.string.failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
            inventoryMainActivity.showString(string);
            inventoryMainActivity.hideLoading();
            if (Intrinsics.areEqual((Object) inventoryMainActivity.currentFragment, (Object) inventoryMainActivity.wineCategoryFragment)) {
                inventoryMainActivity.wineCategoryFragment.setIsFavoriteRequestFailed();
            } else {
                System.out.println("不应该出现这种情况--");
            }
        } else if (Intrinsics.areEqual((Object) inventoryMainActivity.currentFragment, (Object) inventoryMainActivity.wineCategoryFragment)) {
            inventoryMainActivity.hideLoading();
            inventoryMainActivity.wineCategoryFragment.setIsFavoriteRequest();
        } else {
            System.out.println("不应该出现这种情况--");
        }
    }

    /* renamed from: subscribeObservableCategory$lambda-34  reason: not valid java name */
    public static final void m27202subscribeObservableCategory$lambda34(InventoryMainActivity inventoryMainActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryMainActivity, "this$0");
        inventoryMainActivity.hideLoading();
        inventoryMainActivity.setAddWineLayoutShow(true);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String string = inventoryMainActivity.getString(R.string.delete_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.delete_success)");
            inventoryMainActivity.showString(string);
        } else {
            String string2 = inventoryMainActivity.getString(R.string.failure);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.failure)");
            inventoryMainActivity.showString(string2);
        }
        if (Intrinsics.areEqual((Object) inventoryMainActivity.currentFragment, (Object) inventoryMainActivity.wineCategoryFragment)) {
            inventoryMainActivity.wineCategoryFragment.setDeleteShow((List) pair.getSecond());
        }
    }

    /* access modifiers changed from: private */
    public final void switchFragment(Fragment fragment) {
        if (this.currentFragment != fragment) {
            if (!fragment.isAdded()) {
                Fragment fragment2 = this.currentFragment;
                if (fragment2 != null) {
                    getSupportFragmentManager().beginTransaction().hide(fragment2).add((int) R.id.inventory_fl, fragment).commit();
                }
            } else {
                Fragment fragment3 = this.currentFragment;
                if (fragment3 != null) {
                    getSupportFragmentManager().beginTransaction().hide(fragment3).show(fragment).commit();
                }
            }
            this.currentFragment = fragment;
            if (Intrinsics.areEqual((Object) fragment, (Object) this.wineCategoryFragment)) {
                this.currentFragmentTag = 0;
            } else if (Intrinsics.areEqual((Object) fragment, (Object) this.wineGenericCabinetFragment)) {
                this.currentFragmentTag = 1;
            } else if (Intrinsics.areEqual((Object) fragment, (Object) this.wineExactCabinetFragment)) {
                this.currentFragmentTag = 1;
            }
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void addWineCategory(@NotNull AddWineCategoryModel addWineCategoryModel) {
        Intrinsics.checkNotNullParameter(addWineCategoryModel, NotificationCompat.CATEGORY_EVENT);
        getFilterCondition();
    }

    public int bindLayout() {
        return R.layout.activity_inventory_main_layout;
    }

    public final void dismissLoading() {
        hideLoading();
    }

    @NotNull
    public final List<WineCategoryInfo> getBaseWineCategoryList() {
        return this.baseWineCategoryList;
    }

    @NotNull
    public final List<List<WineInventoryBean>> getBaseWineSortList() {
        return this.baseWineSortList;
    }

    public final void getCacheFilterCondition() {
        String valueOf = String.valueOf(SPUtils.INSTANCE.get(KeyConst.FILTER_CONDITION, ""));
        if (!TextUtils.isEmpty(valueOf)) {
            WineFilterConditionResult wineFilterConditionResult = (WineFilterConditionResult) new Gson().fromJson(valueOf, WineFilterConditionResult.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List<String> wineTypeList = wineFilterConditionResult.getWineTypeList();
            if (wineTypeList == null) {
                wineTypeList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList.addAll(wineTypeList);
            List<String> areaList = wineFilterConditionResult.getAreaList();
            if (areaList == null) {
                areaList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList2.addAll(areaList);
            List<String> countryList = wineFilterConditionResult.getCountryList();
            if (countryList == null) {
                countryList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList3.addAll(countryList);
            List<String> grapeList = wineFilterConditionResult.getGrapeList();
            if (grapeList == null) {
                grapeList = CollectionsKt__CollectionsKt.emptyList();
            }
            arrayList4.addAll(grapeList);
            getWineCategoryViewModel().getGetWineListFilterInfoLiveData().postValue(new UserFilerWineCondition(arrayList, arrayList2, arrayList3, arrayList4));
        }
    }

    @NotNull
    public final List<List<WineInventoryBean>> getExactBaseWineSortList() {
        return this.exactBaseWineSortList;
    }

    @NotNull
    public final String getExactWineBottlesCount() {
        int i = 0;
        if (!this.exactBaseWineSortList.isEmpty()) {
            for (List size : this.exactBaseWineSortList) {
                i += size.size();
            }
        }
        ((TextView) _$_findCachedViewById(R$id.bottles_size_text)).setText(String.valueOf(i));
        return String.valueOf(i);
    }

    @SuppressLint({"SetTextI18n"})
    public final void getExactWineBottlesFilterCount() {
        int i = 0;
        if (!this.exactBaseWineSortList.isEmpty()) {
            for (List<WineInventoryBean> it : this.exactBaseWineSortList) {
                for (WineInventoryBean isFilteredOut : it) {
                    if (!isFilteredOut.isFilteredOut()) {
                        i++;
                    }
                }
            }
        }
        ((TextView) _$_findCachedViewById(R$id.bottles_size_text)).setText(i + '/' + getExactWineBottlesCount());
    }

    public final void getFilterCondition() {
        getWineCategoryViewModel().getFilterCondition();
    }

    @NotNull
    public final String getFilterConditionDeviceId() {
        return this.filterConditionDeviceId;
    }

    @NotNull
    public final List<List<WineInventoryBean>> getGenericBaseWineSortList() {
        return this.genericBaseWineSortList;
    }

    @SuppressLint({"SetTextI18n"})
    public final void getGenericWineBottlesFilterCount() {
        int i = 0;
        if (!this.genericBaseWineSortList.isEmpty()) {
            for (List<WineInventoryBean> it : this.genericBaseWineSortList) {
                for (WineInventoryBean wineInventoryBean : it) {
                    i++;
                }
            }
        }
        ((TextView) _$_findCachedViewById(R$id.bottles_size_text)).setText(i + '/' + getWineBottlesCount());
    }

    @NotNull
    public final List<String> getInventoryCountriesList() {
        return this.inventoryCountriesList;
    }

    @NotNull
    public final List<String> getInventoryGrapeTypeList() {
        return this.inventoryGrapeTypeList;
    }

    @NotNull
    public final List<String> getInventoryRegionList() {
        return this.inventoryRegionList;
    }

    public final int getInventoryType() {
        return this.inventoryType;
    }

    @NotNull
    public final List<String> getInventoryWineTypeList() {
        return this.inventoryWineTypeList;
    }

    @Nullable
    public final Holder getMItemHolder() {
        return this.mItemHolder;
    }

    public final int getMItemPosition() {
        return this.mItemPosition;
    }

    public final int getSelectFilterCount() {
        return this.selectFilterCount;
    }

    @NotNull
    public final String getWineBottlesCount() {
        int i = 0;
        if (!this.baseWineSortList.isEmpty()) {
            for (List size : this.baseWineSortList) {
                i += size.size();
            }
        }
        ((TextView) _$_findCachedViewById(R$id.bottles_size_text)).setText(String.valueOf(i));
        return String.valueOf(i);
    }

    public final void getWineBottlesCountFromCategory() {
        int i = 0;
        if (!this.baseWineCategoryList.isEmpty()) {
            for (WineCategoryInfo wineCount : this.baseWineCategoryList) {
                i += wineCount.getWineCount();
            }
        }
        ((TextView) _$_findCachedViewById(R$id.bottles_size_text)).setText(String.valueOf(i));
    }

    public final void getWineCategory() {
        getWineCategoryViewModel().getWineCategoryWithFilter(this.identityPage, getWineSortBaseModel(), this);
    }

    @NotNull
    public final WineCategoryViewModel getWineCategoryViewModel() {
        return (WineCategoryViewModel) this.wineCategoryViewModel$delegate.getValue();
    }

    public final void getWineCategoryWithLastChange() {
        if (!this.expired) {
            String str = this.deviceAuid;
            if (str == null || str.length() == 0) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                T wineCategory = getWineCategoryViewModel().getWineCategory(false, this.sortId);
                objectRef.element = wineCategory;
                MutableLiveData mutableLiveData = (MutableLiveData) wineCategory;
                if (mutableLiveData != null) {
                    mutableLiveData.observe(this, new C7618f(this, objectRef));
                    return;
                }
                return;
            }
        }
        getWineCategory();
    }

    @NotNull
    public final WineSortBaseModel getWineSortBaseModel() {
        WineSortBaseModel wineSortBaseModel2 = this.wineSortBaseModel;
        if (wineSortBaseModel2 != null) {
            return wineSortBaseModel2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wineSortBaseModel");
        return null;
    }

    public final void gotoWineDetail(@Nullable WineBaseInfo wineBaseInfo) {
        this.isSearchState = false;
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.top_search_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "top_search_view");
        if (relativeLayout.getVisibility() == 0) {
            setSearchViewShow();
        }
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            boolean z = ((Integer) obj).intValue() == 0;
            SPUtils.INSTANCE.put(KeyConst.KEY_WINE_CARD_INFO_FROM, "1");
            SPUtils sPUtils = SPUtils.INSTANCE;
            String json = new Gson().toJson((Object) wineBaseInfo);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(wineBaseInfo)");
            sPUtils.put(KeyConst.KEY_WINE_CARD_INFO, json);
            if (wineBaseInfo == null) {
                SPUtils.INSTANCE.put(KeyConst.KEY_WINE_CARD_INFO_COUNT, 0);
            } else {
                List<WineCategoryInfo> list = this.baseWineCategoryList;
                ArrayList<WineCategoryInfo> arrayList = new ArrayList<>();
                for (T next : list) {
                    if (((WineCategoryInfo) next).getCategoryId() == Integer.parseInt(wineBaseInfo.getCategoryId())) {
                        arrayList.add(next);
                    }
                }
                for (WineCategoryInfo wineCategoryInfo : arrayList) {
                    if (wineCategoryInfo.getCategoryId() == Integer.parseInt(wineBaseInfo.getCategoryId())) {
                        SPUtils.INSTANCE.put(KeyConst.KEY_WINE_CARD_INFO_COUNT, Integer.valueOf(wineCategoryInfo.getWineCount()));
                    }
                }
            }
            String str = z ? HtmlPaths.WINE_INVENTORY_DETAIL_GENERIC : HtmlPaths.WINE_INVENTORY_DETAIL_EXACT;
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            String buildAssetUrl = JuConnectExtKt.buildAssetUrl(str, baseContext, LanguageConstKt.f15944en, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("generic", Boolean.valueOf(z)), TuplesKt.m25743to("found", Boolean.TRUE), TuplesKt.m25743to("inventoryFlag", Boolean.TRUE)));
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventoryWineWebView);
            a.withString(KeyConst.KEY_TARGET_URL, buildAssetUrl);
            a.navigation();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final void gotoWineDetailFromCategory(@NotNull WineCategoryInfo wineCategoryInfo) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wineList");
        this.isSearchState = false;
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.top_search_view);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "top_search_view");
        if (relativeLayout.getVisibility() == 0) {
            setSearchViewShow();
        }
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            boolean z = ((Integer) obj).intValue() == 0;
            SPUtils sPUtils = SPUtils.INSTANCE;
            String json = new Gson().toJson((Object) ModelExtKt.toSaveInfo(wineCategoryInfo));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(wineList.toSaveInfo())");
            sPUtils.put(KeyConst.KEY_WINE_CARD_INFO, json);
            SPUtils.INSTANCE.put(KeyConst.KEY_WINE_CARD_INFO_FROM, "0");
            SPUtils.INSTANCE.put(KeyConst.KEY_WINE_CARD_INFO_COUNT, Integer.valueOf(wineCategoryInfo.getWineCount()));
            String str = z ? HtmlPaths.WINE_INVENTORY_DETAIL_GENERIC : HtmlPaths.WINE_INVENTORY_DETAIL_EXACT;
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            String buildAssetUrl = JuConnectExtKt.buildAssetUrl(str, baseContext, LanguageConstKt.f15944en, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("generic", Boolean.valueOf(z)), TuplesKt.m25743to("found", Boolean.TRUE), TuplesKt.m25743to("inventoryFlag", Boolean.TRUE)));
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventoryWineWebView);
            a.withString(KeyConst.KEY_TARGET_URL, buildAssetUrl);
            a.navigation();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final void hideEmptyView() {
        if (this.wineGenericCabinetFragment.isAdded()) {
            this.wineGenericCabinetFragment.setEmptyViewShow(false, this.baseWineSortList);
        }
    }

    public void initData() {
        super.initData();
        String valueOf = String.valueOf(SPUtils.INSTANCE.get(KeyConst.KEY_SORTID, "5"));
        this.sortId = valueOf;
        switch (valueOf.hashCode()) {
            case 49:
                if (valueOf.equals("1")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.vintage_old));
                    break;
                }
                break;
            case 50:
                if (valueOf.equals("2")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.vintage_young));
                    break;
                }
                break;
            case 51:
                if (valueOf.equals("3")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.name_small));
                    break;
                }
                break;
            case 52:
                if (valueOf.equals("4")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.name_big));
                    break;
                }
                break;
            case 53:
                if (valueOf.equals("5")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.inventory_big));
                    break;
                }
                break;
            case 54:
                if (valueOf.equals("6")) {
                    ((TextView) _$_findCachedViewById(R$id.sort_text_name)).setText(getString(R.string.inventory_small));
                    break;
                }
                break;
        }
        if (DeviceCache.Companion.getInstance().getDeviceList().isEmpty()) {
            HiSmart.Companion.getInstance().deviceService().getApplianceListWithProperty(InventoryMainActivity$initData$1.INSTANCE, InventoryMainActivity$initData$2.INSTANCE);
        }
        initGetWineListParam();
        getCacheFilterCondition();
        getFilterCondition();
        getWineCategoryWithLastChange();
        EventBus.getDefault().register(this);
    }

    @NotNull
    public Class<InventoryWineViewModel> initViewModelClz() {
        return InventoryWineViewModel.class;
    }

    public void initWidgets() {
        C1337a.m211c().mo15012e(this);
        ((RadioButton) _$_findCachedViewById(R$id.wine_list)).setChecked(true);
        getSupportFragmentManager().beginTransaction().add((int) R.id.inventory_fl, (Fragment) this.wineCategoryFragment).commit();
        this.currentFragment = this.wineCategoryFragment;
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            this.inventoryType = intValue;
            if (intValue == 0) {
                getSupportFragmentManager().beginTransaction().add((int) R.id.inventory_fl, (Fragment) this.wineGenericCabinetFragment).hide(this.wineGenericCabinetFragment).commit();
            } else {
                getSupportFragmentManager().beginTransaction().add((int) R.id.inventory_fl, (Fragment) this.wineExactCabinetFragment).hide(this.wineExactCabinetFragment).commit();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public final boolean isSearchState() {
        return this.isSearchState;
    }

    public final boolean isSelectNoLocation() {
        return this.isSelectNoLocation;
    }

    public final boolean isSelectShowDelete() {
        return this.isSelectShowDelete;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void modifyFavoriteCategory(@NotNull FavoriteModifyModel favoriteModifyModel) {
        Intrinsics.checkNotNullParameter(favoriteModifyModel, NotificationCompat.CATEGORY_EVENT);
        if (this.mItemHolder != null) {
            getWineCategory();
            WineCategoryListFragment wineCategoryListFragment = this.wineCategoryFragment;
            Holder holder = this.mItemHolder;
            Intrinsics.checkNotNull(holder);
            wineCategoryListFragment.notifiItemData(holder, Integer.valueOf(favoriteModifyModel.getFavorite()), this.mItemPosition);
        }
    }

    public final void obtainSocketMessage() {
        Fragment fragment = this.currentFragment;
        if (Intrinsics.areEqual((Object) fragment, (Object) this.wineExactCabinetFragment)) {
            this.wineExactCabinetFragment.getRemoteQueryByDevList(WineFilterModelKt.toFilterCondition(getWineSortBaseModel().getFilterModel(), this));
        } else if (Intrinsics.areEqual((Object) fragment, (Object) this.wineGenericCabinetFragment)) {
            this.wineGenericCabinetFragment.refreshFragment(WineFilterModelKt.toFilterCondition(getWineSortBaseModel().getFilterModel(), this));
        } else {
            getWineCategory();
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Bundle extras;
        Bundle extras2;
        super.onActivityResult(i, i2, intent);
        if (i == this.GOTO_FILTER_CODE) {
            if (!(intent == null || (extras2 = intent.getExtras()) == null)) {
                Object obj = extras2.get("selectFilterCount");
                if (obj != null) {
                    setSelectFilterCount(((Integer) obj).intValue());
                    WineSortBaseModel wineSortBaseModel2 = getWineSortBaseModel();
                    Object obj2 = extras2.get("data");
                    if (obj2 != null) {
                        wineSortBaseModel2.setFilterModel((WineFilterModel) obj2);
                        LogUtils.Companion.debug("WineFilterModel ", Intrinsics.stringPlus("wineType is  ", getWineSortBaseModel().getFilterModel().getWineType()));
                        Boolean showDeletedItems = getWineSortBaseModel().getFilterModel().getShowDeletedItems();
                        Intrinsics.checkNotNull(showDeletedItems);
                        setSelectShowDelete(showDeletedItems.booleanValue());
                        Boolean isInInventory = getWineSortBaseModel().getFilterModel().isInInventory();
                        Intrinsics.checkNotNull(isInInventory);
                        setSelectNoLocation(!isInInventory.booleanValue());
                        setFilterCountShow();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.model.WineFilterModel");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            }
            if (this.isSelectShowDelete || this.isSelectNoLocation) {
                ((RadioButton) _$_findCachedViewById(R$id.wine_list)).setChecked(true);
                ((RadioButton) _$_findCachedViewById(R$id.wine_cabinet)).setChecked(false);
                this.currentFragment = this.wineCategoryFragment;
                getSupportFragmentManager().beginTransaction().hide(this.wineGenericCabinetFragment).hide(this.wineExactCabinetFragment).show(this.wineCategoryFragment).commit();
                getWineCategory();
                this.currentFragmentTag = 0;
                return;
            }
            Object obj3 = null;
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                obj3 = extras.get("data");
            }
            if (obj3 != null) {
                if (Intrinsics.areEqual((Object) this.currentFragment, (Object) this.wineExactCabinetFragment) || Intrinsics.areEqual((Object) this.currentFragment, (Object) this.wineGenericCabinetFragment)) {
                    showLoading();
                }
                refreshMessage();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onNetworkEvent(@NotNull DeleteModel deleteModel) {
        Intrinsics.checkNotNullParameter(deleteModel, NotificationCompat.CATEGORY_EVENT);
        if (deleteModel.getCategoryType()) {
            ArrayList arrayList = new ArrayList();
            for (String queryWineInventoryByCategoryId : deleteModel.getList()) {
                for (WineBaseInfo inventoryId : LoginUserInfoRoom.Companion.loginUserInfoProvider().queryWineInventoryByCategoryId(queryWineInventoryByCategoryId)) {
                    arrayList.add(String.valueOf(inventoryId.getInventoryId()));
                }
            }
            removeDataObserver$default(this, arrayList, false, false, 4, (Object) null);
            Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new InventoryMainActivity$onNetworkEvent$2(deleteModel, (Continuation<? super InventoryMainActivity$onNetworkEvent$2>) null), 2, (Object) null);
            return;
        }
        removeDataObserver(deleteModel.getList(), false, false);
    }

    public void onPause() {
        super.onPause();
        this.isShowLoadingThreeSecond = true;
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        showString((int) R.string.pt_camera);
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        gotoAddWineActivity();
    }

    public void onResume() {
        super.onResume();
        this.isShowLoadingThreeSecond = false;
    }

    @Subscribe
    public final void onWineCategoryChanged(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "wineList");
        getWineCategory();
    }

    @Subscribe
    public final void onWineRemove(@NotNull DeletedWine deletedWine) {
        Intrinsics.checkNotNullParameter(deletedWine, "deledteWine");
        String idInventory = deletedWine.getWineInventoryBean().getIdInventory();
        if (idInventory != null) {
            showLoading();
            ((InventoryWineViewModel) getMViewModel()).removeWineArrayNew(CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(Long.parseLong(idInventory))));
        }
    }

    @Subscribe
    public final void onWineRemoved(@NotNull DeleteWineMessage deleteWineMessage) {
        Intrinsics.checkNotNullParameter(deleteWineMessage, "deleteWineMessage");
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new InventoryMainActivity$onWineRemoved$1(this, (Continuation<? super InventoryMainActivity$onWineRemoved$1>) null), 2, (Object) null);
    }

    public final void refreshMessage() {
        getWineCategory();
        if (this.wineExactCabinetFragment.isAdded()) {
            this.wineExactCabinetFragment.getRemoteQueryByDevList(WineFilterModelKt.toFilterCondition(getWineSortBaseModel().getFilterModel(), this));
        } else if (this.wineGenericCabinetFragment.isAdded()) {
            this.wineGenericCabinetFragment.refreshFragment(WineFilterModelKt.toFilterCondition(getWineSortBaseModel().getFilterModel(), this));
        }
    }

    public final void removeDataObserver(@NotNull List<String> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "idInventoryList");
        hideLoading();
        setAddWineLayoutShow(true);
        if (z) {
            if (true ^ list.isEmpty()) {
                showSnackbar();
            } else {
                String string = getString(R.string.failure);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
                showString(string);
            }
        }
        for (List<WineInventoryBean> it : this.baseWineSortList) {
            for (WineInventoryBean selected : it) {
                selected.setSelected(false);
            }
        }
        if (!z2) {
            EventBus.getDefault().post(new AddWineSuccessModel(0));
        } else if (this.wineGenericCabinetFragment.isAdded() && this.inventoryType == 0) {
            this.wineGenericCabinetFragment.setDeleteShow(list, z);
        } else if (this.wineExactCabinetFragment.isAdded()) {
            this.wineExactCabinetFragment.setDeleteShow(list, z);
        }
    }

    public final void removeMulWineWithIdArrayExe(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "idInventoriesList");
        this.isAddExactListFlag = z;
        ((InventoryWineViewModel) getMViewModel()).removeMulWineWithIdArrayExe(list);
    }

    public final void removeWineCategory(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "idInventoriesList");
        this.isAddExactListFlag = z;
        WineCategoryViewModel.deleteWineCategory$default(getWineCategoryViewModel(), list, (String) null, 2, (Object) null);
    }

    public final void setAddWineLayoutShow(boolean z) {
        DragCustomView dragCustomView = (DragCustomView) _$_findCachedViewById(R$id.add_wine_layout);
        Intrinsics.checkNotNullExpressionValue(dragCustomView, "add_wine_layout");
        int i = 8;
        dragCustomView.setVisibility(z ? 0 : 8);
        if (Intrinsics.areEqual((Object) this.currentFragment, (Object) this.wineCategoryFragment)) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.count_filter_layout_activity);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "count_filter_layout_activity");
            if (z) {
                i = 0;
            }
            relativeLayout.setVisibility(i);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R$id.count_filter_layout_activity);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "count_filter_layout_activity");
        relativeLayout2.setVisibility(0);
    }

    public final void setBaseWineCategoryList(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.baseWineCategoryList = list;
    }

    public final void setBaseWineSortList(@NotNull List<List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.baseWineSortList = list;
    }

    public final void setExactBaseWineSortList(@NotNull List<List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.exactBaseWineSortList = list;
    }

    public final void setFilterConditionDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filterConditionDeviceId = str;
    }

    public final void setGenericZoneTopViewShowOrHide(boolean z) {
        this.wineGenericCabinetFragment.setZoneTopViewShowOrHide(z);
    }

    public final void setInventoryCountriesList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inventoryCountriesList = list;
    }

    public final void setInventoryGrapeTypeList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inventoryGrapeTypeList = list;
    }

    public final void setInventoryRegionList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inventoryRegionList = list;
    }

    public final void setInventoryType(int i) {
        this.inventoryType = i;
    }

    public final void setInventoryWineTypeList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inventoryWineTypeList = list;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new InventoryMainActivity$setListeners$1(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.search_icon);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "search_icon");
        JuConnectExtKt.singleClickListener(iconFontView2, new InventoryMainActivity$setListeners$2(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.filter_layout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "filter_layout");
        JuConnectExtKt.singleClickListener(linearLayout, new InventoryMainActivity$setListeners$3(this));
        DragCustomView dragCustomView = (DragCustomView) _$_findCachedViewById(R$id.add_wine_layout);
        Intrinsics.checkNotNullExpressionValue(dragCustomView, "add_wine_layout");
        JuConnectExtKt.singleClickListener(dragCustomView, new InventoryMainActivity$setListeners$4(this));
        ((RadioButton) _$_findCachedViewById(R$id.wine_list)).setOnClickListener(new C7615c(this));
        ((RadioButton) _$_findCachedViewById(R$id.wine_cabinet)).setOnClickListener(new C7619g(this));
        IconFontView iconFontView3 = (IconFontView) _$_findCachedViewById(R$id.search_close_btn);
        Intrinsics.checkNotNullExpressionValue(iconFontView3, "search_close_btn");
        JuConnectExtKt.singleClickListener(iconFontView3, new InventoryMainActivity$setListeners$7(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.text_clear);
        Intrinsics.checkNotNullExpressionValue(textView, "text_clear");
        JuConnectExtKt.singleClickListener(textView, new InventoryMainActivity$setListeners$8(this));
        ((EditText) _$_findCachedViewById(R$id.edit_search)).addTextChangedListener(new InventoryMainActivity$setListeners$9(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.sort_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "sort_layout");
        JuConnectExtKt.singleClickListener(relativeLayout, new InventoryMainActivity$setListeners$10(this));
    }

    public final void setMItemHolder(@Nullable Holder holder) {
        this.mItemHolder = holder;
    }

    public final void setMItemPosition(int i) {
        this.mItemPosition = i;
    }

    public final void setSearchState(boolean z) {
        this.isSearchState = z;
    }

    public final void setSelectFilterCount(int i) {
        this.selectFilterCount = i;
    }

    public final void setSelectNoLocation(boolean z) {
        this.isSelectNoLocation = z;
    }

    public final void setSelectShowDelete(boolean z) {
        this.isSelectShowDelete = z;
    }

    public final void setWineSortBaseModel(@NotNull WineSortBaseModel wineSortBaseModel2) {
        Intrinsics.checkNotNullParameter(wineSortBaseModel2, "<set-?>");
        this.wineSortBaseModel = wineSortBaseModel2;
    }

    public final void showSnackbar() {
        ImageView imageView = new ImageView(SPUtils.INSTANCE.getContext());
        imageView.setImageResource(R.drawable.icon_general_wine_);
        C7644b a = C7644b.m21597a((CoordinatorLayout) _$_findCachedViewById(R$id.coordinator), Intrinsics.stringPlus("        ", getString(R.string.wine_bottle_removed)), 5000);
        a.mo33068e(getColor(R.color.colorBlack), getColor(R.color.colorWhite), getColor(R.color.colorWhite));
        a.mo33073j(R.string.cancel);
        a.mo33066c(imageView, 0);
        a.mo33065b(16);
        a.mo33075l(14);
        a.mo33071h(18.0f);
        a.mo33074k();
    }

    public final void showSortDialog() {
        InventorySortDialog inventorySortDialog = new InventorySortDialog();
        inventorySortDialog.setSortId(this.sortId);
        inventorySortDialog.setISortCallBack(new InventoryMainActivity$showSortDialog$1(this, inventorySortDialog));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(inventorySortDialog, supportFragmentManager);
    }

    public final void showUnplacedDialog(@NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        UnplacedDialog unplacedDialog = new UnplacedDialog();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(unplacedDialog, supportFragmentManager);
        unplacedDialog.addUnplacedDialogListener(new InventoryMainActivity$showUnplacedDialog$1(this, baseViewHolder));
    }

    public final void showWineDetail(@NotNull WineInventoryBean wineInventoryBean, @NotNull IItemCallback<? super Boolean> iItemCallback) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wine");
        Intrinsics.checkNotNullParameter(iItemCallback, "dismissCallBack");
        InventoryDetailDialog inventoryDetailDialog2 = this.inventoryDetailDialog;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        inventoryDetailDialog2.setWineData(wineInventoryBean, iItemCallback, supportFragmentManager);
        if (!this.inventoryDetailDialog.isAdded()) {
            InventoryDetailDialog inventoryDetailDialog3 = this.inventoryDetailDialog;
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
            JuConnectExtKt.displayDialog(inventoryDetailDialog3, supportFragmentManager2);
        }
        this.inventoryDetailDialog.setOnRemoveCallback(new InventoryMainActivity$showWineDetail$1(this));
        this.inventoryDetailDialog.setOnFavoriteCallback(new InventoryMainActivity$showWineDetail$2(this));
        this.inventoryDetailDialog.setOnItemClickCallback(new InventoryMainActivity$showWineDetail$3(this));
    }

    public void subscribeObservable() {
        hideLoading();
        ((InventoryWineViewModel) getMViewModel()).getRemoveWineSucLiveData().observe(this, new C7620h(this));
        subscribeObservableCategory();
    }

    public final void subscribeObservableCategory() {
        getWineCategoryViewModel().updateLoadingStatus(false);
        getWineCategoryViewModel().getGetWineListLiveData().observe(this, new C7613a(this));
        getWineCategoryViewModel().getGetWineListFilterInfoLiveData().observe(this, new C7614b(this));
        getWineCategoryViewModel().getUpdateWineFavoriteLiveData().observe(this, new C7617e(this));
        getWineCategoryViewModel().getRemoveWineSucLiveData().observe(this, new C7616d(this));
    }

    public final void updateWineCategoryFavorite(@NotNull WineCategoryInfo wineCategoryInfo, boolean z) {
        Intrinsics.checkNotNullParameter(wineCategoryInfo, "wine");
        this.isAddExactListFlag = z;
        getWineCategoryViewModel().updateWineFavorite(wineCategoryInfo);
    }

    public final void updateWineFavorite(@NotNull WineInventoryBean wineInventoryBean, boolean z) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wine");
        this.isAddExactListFlag = z;
    }
}
