package com.internationalwinecooler.p529ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.FileUtils;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchListResponse;
import com.hisense.connect_life.hismart.networks.request.model.WinePositionModel;
import com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWine;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.FilterCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.listener.IJsCallback;
import com.internationalwinecooler.model.JsResp;
import com.internationalwinecooler.model.WineFilterModelKt;
import com.internationalwinecooler.p529ui.model.AddWineImageBean;
import com.internationalwinecooler.viewmodel.WineCategoryViewModel;
import com.juconnect.connect_life.util.DataAnalyticsReportUtils;
import com.juconnect.connectlife.model.WineInventoryBean;
import com.juconnect.connectlife.sql.property.DeviceSettingRoom;
import com.juconnect.connectlife.sql.property.MsgEntity;
import com.juconnect.connectlife.sql.property.ProfileEntity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p072c.p073a.p074a.C1527w;
import p040c.p482v.p483a.C7594a;
import p040c.p482v.p483a.C7596c;
import p040c.p525z.p526a.C7820f;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0002J\u0018\u0010U\u001a\u00020R2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u000206H\u0002J\u0018\u0010Y\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0018\u0010\\\u001a\u00020R2\u0006\u0010Y\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\u0007H\u0002J\u0018\u0010b\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0017J\u0018\u0010c\u001a\u00020R2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\bH\u0002J\u0018\u0010e\u001a\u00020R2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010f\u001a\u00020_H\u0002J\u0018\u0010g\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u0007H\u0002J\u0018\u0010j\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u0007H\u0002J\u0010\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020mH\u0002J\u0010\u0010n\u001a\u00020\u00072\u0006\u0010l\u001a\u00020mH\u0002J\u0018\u0010o\u001a\u00020\u00112\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020qH\u0002J\u0018\u0010s\u001a\u00020R2\u0006\u0010t\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0016H\u0002J\u0018\u0010v\u001a\u00020R2\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u0007H\u0016J8\u0010y\u001a\u00020R2\u0006\u0010[\u001a\u00020\u00072\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020R0{2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020R0{H\u0002J \u0010~\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0018\u0010\u0001\u001a\b\u0012\u0004\u0012\u000206052\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J'\u0010\u0001\u001a\b\u0012\u0004\u0012\u000206052\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u000206052\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J\u0018\u0010\u0001\u001a\b\u0012\u0004\u0012\u000206052\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J!\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u0007H\u0002J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u0007H\u0002J!\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u001d\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020qH\u0002J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0016J\u001b\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\t\u0010\u0001\u001a\u00020RH\u0016J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010\u001a\u00020\u0007H\u0016J!\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u00020\u00072\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u000105H\u0002J!\u0010\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\t\u0010\u0001\u001a\u00020RH\u0016J,\u0010 \u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0007\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010£\u0001\u001a\u00020\u0007H\u0002J,\u0010¤\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0007\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010£\u0001\u001a\u00020\u0007H\u0002J,\u0010¥\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0007\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010£\u0001\u001a\u00020\u0007H\u0002J,\u0010¦\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0007\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010£\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010§\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0011\u0010¨\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0016J.\u0010©\u0001\u001a\u00020R2\t\u0010ª\u0001\u001a\u0004\u0018\u0001062\t\u0010«\u0001\u001a\u0004\u0018\u0001062\r\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\u0012\u0010­\u0001\u001a\u00020\u00072\u0007\u0010ª\u0001\u001a\u000206H\u0002J\u0011\u0010®\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\u0019\u0010¯\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010°\u0001\u001a\u00020\b2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0011\u0010±\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\u0019\u0010²\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0011\u0010³\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\t\u0010´\u0001\u001a\u00020RH\u0016J\u0011\u0010µ\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\u0013\u0010¶\u0001\u001a\u00020R2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0002J\u0019\u0010¹\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J'\u0010º\u0001\u001a\u00020\u00112\r\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u0007052\r\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020\u000705H\u0002J\u0012\u0010½\u0001\u001a\u00020R2\u0007\u0010¾\u0001\u001a\u00020\u0007H\u0002J\u001b\u0010¿\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\b\u0010À\u0001\u001a\u00030Á\u0001H\u0002J\"\u0010Â\u0001\u001a\u00020R2\u000e\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u0002060Ä\u00012\u0007\u0010Å\u0001\u001a\u00020\bH\u0002J\t\u0010Æ\u0001\u001a\u00020RH\u0014J\u0011\u0010Ç\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J0\u0010È\u0001\u001a\u00020R2\u0006\u0010\u001a\u00020\u00072\u0007\u0010É\u0001\u001a\u00020\u00072\u0014\u0010Ê\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070Ë\u0001H\u0002J\u0012\u0010Ì\u0001\u001a\u00020R2\u0007\u0010¾\u0001\u001a\u00020\u0007H\u0002J\u001d\u0010Í\u0001\u001a\u00020R2\u0006\u0010a\u001a\u00020\u00072\n\b\u0002\u0010f\u001a\u0004\u0018\u00010_H\u0002J\u0019\u0010Î\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010Ï\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010Ð\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J!\u0010Ñ\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0016H\u0002J\u0012\u0010Ò\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010Ó\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0002J\u0013\u0010Ô\u0001\u001a\u00020R2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0002J!\u0010Õ\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010Ö\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0012\u0010×\u0001\u001a\u00020R2\u0007\u0010Ø\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010Ù\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020\u0007H\u0016J\u0011\u0010Ú\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u0007H\u0016J\u0010\u0010Û\u0001\u001a\u00020R2\u0007\u0010Ü\u0001\u001a\u00020\u0007J\u0015\u0010Ý\u0001\u001a\u00030Þ\u00012\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010à\u0001\u001a\u00020m2\u0007\u0010á\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010â\u0001\u001a\u00020\u00072\u0007\u0010á\u0001\u001a\u00020\u0007H\u0002J\u0019\u0010ã\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\t\u0010ä\u0001\u001a\u00020RH\u0002J\t\u0010å\u0001\u001a\u00020RH\u0002J\u0011\u0010æ\u0001\u001a\u00030ç\u00012\u0007\u0010è\u0001\u001a\u000206J\u0019\u0010é\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J$\u0010ê\u0001\u001a\u00020R2\u0007\u0010É\u0001\u001a\u00020\u00072\u0007\u0010ë\u0001\u001a\u00020\u00072\u0007\u0010ì\u0001\u001a\u00020\u0007H\u0016J>\u0010í\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0007\u0010É\u0001\u001a\u00020\u00072\u0007\u0010ë\u0001\u001a\u00020\u00072\u0007\u0010î\u0001\u001a\u00020\u00072\u0007\u0010ï\u0001\u001a\u00020\u00072\u0007\u0010ð\u0001\u001a\u00020\u0007H\u0016J\u0011\u0010ñ\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0002J\u0011\u0010ò\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0011\u0010ó\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010ô\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0019\u0010õ\u0001\u001a\u00020R2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0016J\u001a\u0010ö\u0001\u001a\u00020R2\u0006\u0010[\u001a\u00020\u00072\u0007\u0010÷\u0001\u001a\u00020\u0007H\u0016J\u0019\u0010ø\u0001\u001a\u00020R2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0002R3\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\nR-\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00150\u00058FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0017\u0010\nR!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00058FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001b\u0010\nR!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001e\u0010\nR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b!\u0010\nR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058FX\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b$\u0010\nR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b'\u0010\nR!\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b*\u0010\nR\u001a\u0010,\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R!\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\b3\u0010\f\u001a\u0004\b2\u0010\nR3\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020605\u0012\u0004\u0012\u00020\u00110\u00150\u00058FX\u0002¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b7\u0010\nR!\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058FX\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b:\u0010\nR!\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058FX\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b=\u0010\nR!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058FX\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\b@\u0010\nR\u001b\u0010B\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bD\u0010ER\u001b\u0010G\u001a\u00020H8FX\u0002¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bI\u0010JR\u001b\u0010L\u001a\u00020M8FX\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bN\u0010O¨\u0006ù\u0001"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/WineWebViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "Lcom/internationalwinecooler/listener/IJsCallback;", "()V", "addWineSucLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "", "getAddWineSucLiveData", "()Landroidx/lifecycle/MutableLiveData;", "addWineSucLiveData$delegate", "Lkotlin/Lazy;", "compositeDisposableMap", "", "Lio/reactivex/disposables/CompositeDisposable;", "compressImageLiveData", "", "getCompressImageLiveData", "compressImageLiveData$delegate", "evaluateJsLiveData", "Lkotlin/Pair;", "Lcom/internationalwinecooler/ui/WebActionEnum;", "getEvaluateJsLiveData", "evaluateJsLiveData$delegate", "getImageLiveData", "Lcom/internationalwinecooler/ui/model/AddWineImageBean;", "getGetImageLiveData", "getImageLiveData$delegate", "goAddWinePageLiveData", "getGoAddWinePageLiveData", "goAddWinePageLiveData$delegate", "goInvLiveData", "getGoInvLiveData", "goInvLiveData$delegate", "goVivinoLiveData", "getGoVivinoLiveData", "goVivinoLiveData$delegate", "gobackLiveData", "getGobackLiveData", "gobackLiveData$delegate", "imageBadPathLiveData", "getImageBadPathLiveData", "imageBadPathLiveData$delegate", "lastCategory", "getLastCategory", "()Ljava/lang/String;", "setLastCategory", "(Ljava/lang/String;)V", "loadingData", "getLoadingData", "loadingData$delegate", "removeWineSucLiveData", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "getRemoveWineSucLiveData", "removeWineSucLiveData$delegate", "setImageBase64LiveData", "getSetImageBase64LiveData", "setImageBase64LiveData$delegate", "takePhotoLiveData", "getTakePhotoLiveData", "takePhotoLiveData$delegate", "unbindApplianceLiveData", "getUnbindApplianceLiveData", "unbindApplianceLiveData$delegate", "wineCabinetListModel", "Lcom/internationalwinecooler/ui/WineCabinetListModel;", "getWineCabinetListModel", "()Lcom/internationalwinecooler/ui/WineCabinetListModel;", "wineCabinetListModel$delegate", "wineCategoryManager", "Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "getWineCategoryManager", "()Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "wineCategoryManager$delegate", "wineCategoryViewModel", "Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "getWineCategoryViewModel", "()Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "wineCategoryViewModel$delegate", "addCategory", "", "addWineCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategory;", "addPositionProperty", "jsonObject", "Lcom/google/gson/JsonObject;", "wineBaseInfo", "addWine", "identityPage", "model", "addWineDirectly", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWine;", "addWineResult", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineResult;", "addWineDirectlySuccess", "info", "addWineForBase", "addWineInfoError", "resultCode", "addWineSuccess", "addWineCategoryResult", "cacheMsgSwitcg", "auid", "data", "cacheProfile", "calendarToDayStr", "calendar", "Ljava/util/Calendar;", "calendarToMonthStr", "diffWineType", "wineAdd", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "wineInInven", "executeFailCallback", "errorDesc", "actionEnum", "gaWebOperationReport", "key", "values", "generateJSONObject", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "failure", "getAllSameWinesInDevice", "deviceId", "getAllWineByCategory", "categoryId", "categoryList", "getAllWineByVivinoId", "vivinoId", "getAllWinesInDevice", "getApplianceProfile", "getBadImageAfterVivino", "getByteArrayFromImageURL", "", "url", "getCacheMsgSwitch", "getCacheProfile", "getChartData", "getDeviceInfo", "getDevicePropertiesInfo", "getGenericSameWineArr", "Lcom/google/gson/JsonArray;", "jsonWineArr", "wineDto", "getInventoryExistCountByVivinoId", "getInventoryExistCountByVivinoIdSuccess", "wineTotal", "getLightsInfo", "getManualInfo", "getManualUrl", "getMsgSwitch", "getMsgSwitchByDeviceId", "switchList", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchListResponse;", "getNoShelfWineNum", "getRemoveMessageStatus", "getStatisticHour", "startDate", "endDate", "zone", "getStatisticMonth", "getStatisticWeek", "getStatisticYear", "getVivinoInfo", "getWineCardInfo", "getWineCardInfoH5", "wineInfo", "wineBaseInfoTmp", "wineList", "getWineCardInfoJsonObject", "getWineCoolerList", "getWineCoolerListAndCount", "getWineCount", "getWineDeviceList", "getWineInfo", "goAddWinePage", "goBack", "goInventoryPage", "handleAddWinePicture", "h5AddWine", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/H5AddWine;", "imageUrlToBase64", "isListEquals", "list1", "list2", "log", "msg", "manageDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "modifyWineCategoryCount", "winInfoList", "Ljava/util/ArrayList;", "size", "onCleared", "onPageFinish", "openLight", "wifiId", "map", "", "queryInventCountByVivioIdError", "refreshInfoSuccess", "removeMulWineWithIdArray", "removeOtherWineWithIdArray", "removeWineWithIdArray", "removeWineWithIdArrayExe", "searchCategoryExiestWithCategory", "searchCategoryExiestWithNet", "searchCategoryExist", "sendCmd", "sendTemperatureCmd", "setRemoveMessageStatus", "status", "showVivinoInfo", "showWineData", "showWineDataExe", "imageBase64", "strDateToLong", "", "time", "strToCalendar", "date", "strToMonthStr", "takePhoto", "testLogAllWine", "timeStampToString", "toWinePositionModel", "Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "entity", "unpairAppliance", "updateApplianceNickName", "auId", "deviceNickName", "updateApplianceProfile", "purchaseDate", "warrantyEndDate", "applianceMedia", "updateCategory", "updateFile", "updateMsgSwitch", "updateWine", "updateWineFavorite", "updateWineInfo", "totalModel", "updateZoneBWine", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel extends BaseViewModel implements IJsCallback {
    @NotNull
    public final Lazy addWineSucLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$addWineSucLiveData$2.INSTANCE);
    @NotNull
    public final Map<String, C9206a> compositeDisposableMap = new LinkedHashMap();
    @NotNull
    public final Lazy compressImageLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$compressImageLiveData$2.INSTANCE);
    @NotNull
    public final Lazy evaluateJsLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$evaluateJsLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getImageLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$getImageLiveData$2.INSTANCE);
    @NotNull
    public final Lazy goAddWinePageLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$goAddWinePageLiveData$2.INSTANCE);
    @NotNull
    public final Lazy goInvLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$goInvLiveData$2.INSTANCE);
    @NotNull
    public final Lazy goVivinoLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$goVivinoLiveData$2.INSTANCE);
    @NotNull
    public final Lazy gobackLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$gobackLiveData$2.INSTANCE);
    @NotNull
    public final Lazy imageBadPathLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$imageBadPathLiveData$2.INSTANCE);
    @NotNull
    public String lastCategory = "";
    @NotNull
    public final Lazy loadingData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$loadingData$2.INSTANCE);
    @NotNull
    public final Lazy removeWineSucLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$removeWineSucLiveData$2.INSTANCE);
    @NotNull
    public final Lazy setImageBase64LiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$setImageBase64LiveData$2.INSTANCE);
    @NotNull
    public final Lazy takePhotoLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$takePhotoLiveData$2.INSTANCE);
    @NotNull
    public final Lazy unbindApplianceLiveData$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$unbindApplianceLiveData$2.INSTANCE);
    @NotNull
    public final Lazy wineCabinetListModel$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$wineCabinetListModel$2.INSTANCE);
    @NotNull
    public final Lazy wineCategoryManager$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$wineCategoryManager$2.INSTANCE);
    @NotNull
    public final Lazy wineCategoryViewModel$delegate = LazyKt__LazyJVMKt.lazy(WineWebViewModel$wineCategoryViewModel$2.INSTANCE);

    /* access modifiers changed from: private */
    public final void addCategory(AddWineCategory addWineCategory) {
        try {
            LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("addCategory wifiId is ", addWineCategory));
            getWineCategoryManager().addWineCategory(addWineCategory, new WineWebViewModel$addCategory$1(addWineCategory, this), new WineWebViewModel$addCategory$2(this));
        } catch (Throwable th) {
            addWineInfoError(th.toString(), 1);
        }
    }

    private final void addPositionProperty(JsonObject jsonObject, WineBaseInfo wineBaseInfo) {
        String zoneName = wineBaseInfo.getZoneName();
        boolean z = true;
        String str = "";
        if (zoneName == null || zoneName.length() == 0) {
            jsonObject.addProperty("shelfPosition", str);
        } else if (wineBaseInfo.getCellNum() < 0) {
            jsonObject.addProperty("shelfPosition", "N0");
        } else {
            jsonObject.addProperty("shelfPosition", Intrinsics.stringPlus(wineBaseInfo.getZoneName(), Integer.valueOf(wineBaseInfo.getCellNum())));
        }
        int positionNum = wineBaseInfo.getPositionNum();
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("positionNum  is ", Integer.valueOf(positionNum)));
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("positionNum  wineBaseInfo ", wineBaseInfo));
        if (positionNum >= 0) {
            if (positionNum >= 0 && positionNum < 7) {
                str = Intrinsics.stringPlus("F", Integer.valueOf(positionNum + 1));
            } else {
                if (7 > positionNum || positionNum >= 13) {
                    z = false;
                }
                if (z) {
                    str = Intrinsics.stringPlus("B", Integer.valueOf(positionNum - 6));
                } else {
                    str = Intrinsics.stringPlus("C", Integer.valueOf(positionNum));
                }
            }
        }
        jsonObject.addProperty("exactPosition", str);
    }

    /* access modifiers changed from: private */
    public final void addWineDirectly(AddWine addWine, AddWineResult addWineResult) {
        Intrinsics.stringPlus("addWineDirectly: ", addWine);
        HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().addWindInWentory(addWine, new WineWebViewModel$addWineDirectly$1(this, addWineResult), new WineWebViewModel$addWineDirectly$2(this));
    }

    private final void addWineDirectlySuccess(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", str);
        jSONObject.put("resultCode", 0);
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("addCategory===", jSONObject));
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.ADD_WINE_CALLBACK;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "returnJson.toString()");
        evaluateJsLiveData.setValue(new Pair(webActionEnum, jSONObject2));
    }

    /* access modifiers changed from: private */
    public final void addWineInfoError(String str, int i) {
        String json = new Gson().toJson((Object) new JsResp(CollectionsKt__CollectionsKt.emptyList(), i, str));
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("error==", json));
        getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.ADD_WINE_CALLBACK, json));
    }

    /* access modifiers changed from: private */
    public final void addWineSuccess(String str, AddWineResult addWineResult) {
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceId : DeviceCache.Companion.getInstance().getDeviceList()) {
            arrayList.add(deviceId.getDeviceId());
        }
        MutableLiveData<List<WineBaseInfo>> remoteQueryByDevList = getWineCabinetListModel().getRemoteQueryByDevList(arrayList, (FilterCondition) null, 0, true);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new AtomicBoolean(false);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C7594a aVar = new C7594a(remoteQueryByDevList, objectRef2, booleanRef, booleanRef2, objectRef, this, str, addWineResult);
        objectRef2.element = aVar;
        remoteQueryByDevList.observeForever(aVar);
        MutableLiveData<Pair<Boolean, List<WineCategoryInfo>>> allWineCategories = getWineCategoryViewModel().getAllWineCategories();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        C7596c cVar = new C7596c(allWineCategories, objectRef3, booleanRef2, booleanRef, objectRef, this, str, addWineResult);
        objectRef3.element = cVar;
        allWineCategories.observeForever(cVar);
    }

    /* renamed from: addWineSuccess$lambda-3  reason: not valid java name */
    public static final void m27176addWineSuccess$lambda3(MutableLiveData mutableLiveData, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef2, WineWebViewModel wineWebViewModel, String str, AddWineResult addWineResult, List list) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "$addwineLiveData");
        Intrinsics.checkNotNullParameter(objectRef, "$refreshWineObserver");
        Intrinsics.checkNotNullParameter(booleanRef, "$refreshWine");
        Intrinsics.checkNotNullParameter(booleanRef2, "$refreshCategory");
        Intrinsics.checkNotNullParameter(objectRef2, "$refreshOnce");
        Intrinsics.checkNotNullParameter(wineWebViewModel, "this$0");
        Intrinsics.checkNotNullParameter(str, "$info");
        Intrinsics.checkNotNullParameter(addWineResult, "$addWineCategoryResult");
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        mutableLiveData.removeObserver((Observer) t);
        booleanRef.element = true;
        if (booleanRef2.element && ((AtomicBoolean) objectRef2.element).compareAndSet(false, true)) {
            wineWebViewModel.refreshInfoSuccess(str, addWineResult);
        }
    }

    /* renamed from: addWineSuccess$lambda-4  reason: not valid java name */
    public static final void m27177addWineSuccess$lambda4(MutableLiveData mutableLiveData, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef2, WineWebViewModel wineWebViewModel, String str, AddWineResult addWineResult, Pair pair) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "$allWineCategoriesLiveData");
        Intrinsics.checkNotNullParameter(objectRef, "$getWineObserver");
        Intrinsics.checkNotNullParameter(booleanRef, "$refreshCategory");
        Intrinsics.checkNotNullParameter(booleanRef2, "$refreshWine");
        Intrinsics.checkNotNullParameter(objectRef2, "$refreshOnce");
        Intrinsics.checkNotNullParameter(wineWebViewModel, "this$0");
        Intrinsics.checkNotNullParameter(str, "$info");
        Intrinsics.checkNotNullParameter(addWineResult, "$addWineCategoryResult");
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        mutableLiveData.removeObserver((Observer) t);
        booleanRef.element = true;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LogUtilsShen.Companion.mo39140i("addWineSuccess 刷新成功");
            EventBus.getDefault().post(pair.getSecond());
        } else {
            LogUtilsShen.Companion.mo39140i("addWineSuccess 刷新失败");
        }
        if (booleanRef2.element && ((AtomicBoolean) objectRef2.element).compareAndSet(false, true)) {
            wineWebViewModel.refreshInfoSuccess(str, addWineResult);
        }
    }

    /* access modifiers changed from: private */
    public final void cacheMsgSwitcg(String str, String str2) {
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("cahce数据== 缓存MsgData ", str2));
        DeviceSettingRoom.Companion.deviceSettingProvider().updateMsg(new MsgEntity(str2, str));
    }

    private final void cacheProfile(String str, String str2) {
        DeviceSettingRoom.Companion.deviceSettingProvider().updateProfile(new ProfileEntity(str2, str));
    }

    private final String calendarToDayStr(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(date)");
        return format;
    }

    private final String calendarToMonthStr(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM").format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(date)");
        return format;
    }

    private final boolean diffWineType(WineInventoryBean wineInventoryBean, WineInventoryBean wineInventoryBean2) {
        boolean z = false;
        if (!Intrinsics.areEqual((Object) wineInventoryBean.getVivinoId(), (Object) wineInventoryBean2.getVivinoId())) {
            return false;
        }
        String vivinoId = wineInventoryBean.getVivinoId();
        if (vivinoId != null && Long.parseLong(vivinoId) == -1) {
            z = true;
        }
        if (!z) {
            return true;
        }
        return Intrinsics.areEqual((Object) wineInventoryBean, (Object) wineInventoryBean2);
    }

    /* access modifiers changed from: private */
    public final void executeFailCallback(String str, WebActionEnum webActionEnum) {
        JsonObject jsonObject = new JsonObject();
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("executeFailCallback  actionEnum ", webActionEnum));
        jsonObject.addProperty("resultCode", (Number) 1);
        jsonObject.addProperty("errorDesc", str);
        jsonObject.add("data", new JsonArray());
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        String json = new Gson().toJson((JsonElement) jsonObject);
        if (json == null) {
            json = "";
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, json));
    }

    /* access modifiers changed from: private */
    public final void generateJSONObject(String str, Function1<? super JSONObject, Unit> function1, Function1<? super String, Unit> function12) {
        try {
            function1.invoke(new JSONObject(str));
        } catch (JSONException unused) {
            String b = C1527w.m1063b(R.string.data_model_error);
            Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.data_model_error)");
            function12.invoke(b);
        }
    }

    /* access modifiers changed from: private */
    public final List<WineBaseInfo> getAllWineByCategory(String str) {
        List<WineBaseInfo> queryWineInventoryByCategoryId = LoginUserInfoRoom.Companion.loginUserInfoProvider().queryWineInventoryByCategoryId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryWineInventoryByCategoryId.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (DeviceCache.Companion.getInstance().getDevice(((WineBaseInfo) next).getDeviceId()) == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new WineWebViewModel$getAllWineByCategory$$inlined$sortBy$1());
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList2);
    }

    private final List<WineBaseInfo> getAllWineByVivinoId(String str) {
        List<WineBaseInfo> queryByVivinoId = LoginUserInfoRoom.Companion.loginUserInfoProvider().queryByVivinoId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryByVivinoId.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (DeviceCache.Companion.getInstance().getDevice(((WineBaseInfo) next).getDeviceId()) == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new WineWebViewModel$getAllWineByVivinoId$$inlined$sortBy$1());
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList2);
    }

    private final byte[] getByteArrayFromImageURL(String str) {
        ResponseBody body = new OkHttpClient().newCall(new Request.Builder().get().url(str).build()).execute().body();
        InputStream byteStream = body == null ? null : body.byteStream();
        if (byteStream == null) {
            return new byte[0];
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(byteStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "outStream.toByteArray()");
        return byteArray;
    }

    /* access modifiers changed from: private */
    public final void getCacheMsgSwitch(String str) {
        String str2;
        MsgEntity msg = DeviceSettingRoom.Companion.deviceSettingProvider().getMsg(str);
        String str3 = null;
        if (msg == null) {
            str2 = null;
        } else {
            str2 = msg.getData();
        }
        if (str2 != null) {
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            if (msg != null) {
                str3 = msg.getData();
            }
            companion.mo39140i(Intrinsics.stringPlus("cahce数据==getMsgData ", str3));
            MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
            WebActionEnum webActionEnum = WebActionEnum.GET_MSG_SWITCH_CALLBACK;
            String data = msg.getData();
            Intrinsics.checkNotNull(data);
            evaluateJsLiveData.postValue(new Pair(webActionEnum, data));
            return;
        }
        LogUtilsShen.Companion.mo39140i("cahce数据==查询MsgData失败");
    }

    /* access modifiers changed from: private */
    public final void getCacheProfile(String str) {
        String str2;
        ProfileEntity profile = DeviceSettingRoom.Companion.deviceSettingProvider().getProfile(str);
        if (profile == null) {
            str2 = null;
        } else {
            str2 = profile.getData();
        }
        if (str2 != null) {
            MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
            WebActionEnum webActionEnum = WebActionEnum.GET_APPLIANCE_PROFILE_CALLBACK;
            String data = profile.getData();
            Intrinsics.checkNotNull(data);
            evaluateJsLiveData.postValue(new Pair(webActionEnum, data));
            return;
        }
        LogUtilsShen.Companion.mo39140i("cahce数据==查询Profile失败");
    }

    private final JsonArray getGenericSameWineArr(JsonArray jsonArray, WineInventoryBean wineInventoryBean) {
        Class<WineInventoryBean> cls = WineInventoryBean.class;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray2 = new JsonArray();
        Object fromJson = new Gson().fromJson(jsonArray.toString(), new WineWebViewModel$getGenericSameWineArr$type$1().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(jsonWineArr.toString(), type)");
        for (WineInventoryBean wineInventoryBean2 : (List) fromJson) {
            Intrinsics.checkNotNull(wineInventoryBean);
            if (!TextUtils.isEmpty(wineInventoryBean.getVivinoId())) {
                String vivinoId = wineInventoryBean.getVivinoId();
                boolean z = false;
                if (vivinoId != null && Long.parseLong(vivinoId) == -1) {
                    z = true;
                }
                if (!z) {
                    if (Intrinsics.areEqual((Object) wineInventoryBean.getVivinoId(), (Object) wineInventoryBean2.getVivinoId())) {
                        jsonObject.addProperty("isThisType", Boolean.TRUE);
                        jsonObject.add("wineInventoryDtoModel", new Gson().toJsonTree(wineInventoryBean2, cls));
                        jsonArray2.add((JsonElement) jsonObject);
                    }
                }
            }
            if (TextUtils.equals(wineInventoryBean.getIdentify(), wineInventoryBean2.getIdentify())) {
                jsonObject.addProperty("isThisType", Boolean.TRUE);
                jsonObject.add("wineInventoryDtoModel", new Gson().toJsonTree(wineInventoryBean2, cls));
                jsonArray2.add((JsonElement) jsonObject);
            }
        }
        return jsonArray2;
    }

    private final void getInventoryExistCountByVivinoIdSuccess(int i, String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("wineTotal", (Number) Integer.valueOf(i));
        jsonObject.addProperty("categoryId", str);
        String str2 = "";
        JsResp jsResp = new JsResp(jsonObject, 0, str2);
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        String json = new Gson().toJson((Object) jsResp);
        if (json == null) {
            json = str2;
        }
        companion.mo39146e(Intrinsics.stringPlus("getInventoryExistCountByVivinoId: ", json));
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.GET_INVENTORY_EXIST_COUNT_BY_VIVINOID_CALLBACK;
        String json2 = new Gson().toJson((Object) jsResp);
        if (json2 != null) {
            str2 = json2;
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, str2));
    }

    /* access modifiers changed from: private */
    public final String getMsgSwitchByDeviceId(String str, List<MessageSwitchListResponse> list) {
        if (list == null || list.isEmpty()) {
            return "0";
        }
        for (MessageSwitchListResponse messageSwitchListResponse : list) {
            if (Intrinsics.areEqual((Object) str, (Object) messageSwitchListResponse.getDeviceId())) {
                return messageSwitchListResponse.getNeedPush();
            }
        }
        return "0";
    }

    public static final void getNoShelfWineNum$evaluateJs(WineWebViewModel wineWebViewModel, int i, List<String> list) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        JsonArray asJsonArray = new Gson().toJsonTree(list).getAsJsonArray();
        jsonObject.addProperty("totalNum", (Number) Integer.valueOf(i));
        jsonObject.add("idInventies", asJsonArray);
        jsonObject2.addProperty("resultCode", (Number) 0);
        jsonObject2.add("data", jsonObject);
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getNoShelfWineNum jsonResult: ", jsonObject2));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(wineWebViewModel), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getNoShelfWineNum$evaluateJs$3(wineWebViewModel, jsonObject2, (Continuation<? super WineWebViewModel$getNoShelfWineNum$evaluateJs$3>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void getStatisticHour(String str, String str2, String str3, String str4) {
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("getStatisticHour - startDate: ");
        String str5 = str2;
        sb.append(str2);
        sb.append(", endDate: ");
        String str6 = str3;
        sb.append(str6);
        companion.mo39146e(sb.toString());
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getStatisticHour$1(str, this, str2, str6, str4, -1.000001d, (Continuation<? super WineWebViewModel$getStatisticHour$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void getStatisticMonth(String str, String str2, String str3, String str4) {
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("getStatisticWee - startDate: ");
        String str5 = str2;
        sb.append(str2);
        sb.append(", endDate: ");
        String str6 = str3;
        sb.append(str6);
        companion.mo39146e(sb.toString());
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getStatisticMonth$1(str, this, str2, str6, str4, -1.000001d, (Continuation<? super WineWebViewModel$getStatisticMonth$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void getStatisticWeek(String str, String str2, String str3, String str4) {
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("getStatisticWee - startDate: ");
        String str5 = str2;
        sb.append(str2);
        sb.append(", endDate: ");
        String str6 = str3;
        sb.append(str6);
        companion.mo39146e(sb.toString());
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getStatisticWeek$1(str, this, str2, str6, str4, -1.000001d, (Continuation<? super WineWebViewModel$getStatisticWeek$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void getStatisticYear(String str, String str2, String str3, String str4) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getStatisticYear$1(str, this, str2, str3, str4, -1.000001d, (Continuation<? super WineWebViewModel$getStatisticYear$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final WineCabinetListModel getWineCabinetListModel() {
        return (WineCabinetListModel) this.wineCabinetListModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void getWineCardInfoH5(WineBaseInfo wineBaseInfo, WineBaseInfo wineBaseInfo2, List<WineBaseInfo> list) {
        Unit unit;
        if (wineBaseInfo == null) {
            wineBaseInfo = !(list == null || list.isEmpty()) ? list.get(0) : wineBaseInfo2;
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getWineCardInfo wineBaseInfo: ", wineBaseInfo));
        }
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Gson create = new GsonBuilder().serializeNulls().create();
        for (WineBaseInfo wineBaseInfo3 : list) {
            JsonObject asJsonObject = create.toJsonTree(wineBaseInfo3).getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "element");
            addPositionProperty(asJsonObject, wineBaseInfo3);
            asJsonObject.addProperty(EventBusConstKt.WIFIID, "");
            jsonArray.add((JsonElement) asJsonObject);
        }
        WineBaseInfo wineBaseInfo4 = wineBaseInfo;
        if (wineBaseInfo4 == null) {
            unit = null;
        } else {
            JsonObject asJsonObject2 = create.toJsonTree(wineBaseInfo).getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject2, "wineInfoJson");
            addPositionProperty(asJsonObject2, wineBaseInfo4);
            asJsonObject2.addProperty(EventBusConstKt.WIFIID, "");
            jsonObject2.add("wineInfo", asJsonObject2);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            jsonObject2.add("wineInfo", new JsonObject());
        }
        jsonObject2.add("wineList", jsonArray);
        jsonObject.addProperty("resultCode", (Number) 0);
        jsonObject.add("data", jsonObject2);
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getWineCardInfo data2: ", jsonObject));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getWineCardInfoH5$6(this, jsonObject, (Continuation<? super WineWebViewModel$getWineCardInfoH5$6>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final String getWineCardInfoJsonObject(WineBaseInfo wineBaseInfo) {
        List<WineBaseInfo> list;
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Gson create = new GsonBuilder().serializeNulls().create();
        String categoryId = wineBaseInfo.getCategoryId();
        if ((categoryId == null || categoryId.length() == 0) || Intrinsics.areEqual((Object) wineBaseInfo.getCategoryId(), (Object) "0")) {
            String vivinoId = wineBaseInfo.getVivinoId();
            if ((vivinoId == null || vivinoId.length() == 0) || Intrinsics.areEqual((Object) wineBaseInfo.getVivinoId(), (Object) "-1")) {
                list = CollectionsKt__CollectionsKt.emptyList();
            } else {
                list = getAllWineByVivinoId(String.valueOf(wineBaseInfo.getVivinoId()));
            }
        } else {
            list = getAllWineByCategory(wineBaseInfo.getCategoryId());
        }
        if (true ^ list.isEmpty()) {
            for (WineBaseInfo wineBaseInfo2 : list) {
                JsonObject asJsonObject = create.toJsonTree(wineBaseInfo2).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "element");
                addPositionProperty(asJsonObject, wineBaseInfo2);
                asJsonObject.addProperty(EventBusConstKt.WIFIID, "");
                jsonArray.add((JsonElement) asJsonObject);
            }
        }
        JsonObject asJsonObject2 = create.toJsonTree(wineBaseInfo).getAsJsonObject();
        asJsonObject2.addProperty(EventBusConstKt.WIFIID, "");
        Intrinsics.checkNotNullExpressionValue(asJsonObject2, "wineInfoJson");
        addPositionProperty(asJsonObject2, wineBaseInfo);
        jsonObject2.add("wineInfo", asJsonObject2);
        jsonObject2.add("wineList", jsonArray);
        jsonObject.addProperty("resultCode", (Number) 0);
        jsonObject.add("data", jsonObject2);
        Intrinsics.stringPlus("getWineCardInfoJsonObject: ", jsonObject);
        String jsonElement = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jsonElement, "jsonResult.toString()");
        return jsonElement;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7 A[Catch:{ Exception -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getWineCount(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getWineCount auid:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ",   vivinoId:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.mo39138e(r1)
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x010a }
            r1.<init>(r12)     // Catch:{ Exception -> 0x010a }
            java.lang.String r12 = "wineInfo"
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Exception -> 0x010a }
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x010a }
            r1.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo> r2 = com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo.class
            java.lang.Object r12 = r1.fromJson((java.lang.String) r12, r2)     // Catch:{ Exception -> 0x010a }
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r12 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r12     // Catch:{ Exception -> 0x010a }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r1 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x010a }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r1 = r1.loginUserInfoProvider()     // Catch:{ Exception -> 0x010a }
            java.util.List r1 = r1.getAllWineInventoryByDeviceId(r11)     // Catch:{ Exception -> 0x010a }
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r2 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = "getWineCount 过滤之前 "
            r4 = 0
            if (r1 != 0) goto L_0x004a
            r5 = r4
            goto L_0x0052
        L_0x004a:
            int r5 = r1.size()     // Catch:{ Exception -> 0x010a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x010a }
        L_0x0052:
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r5)     // Catch:{ Exception -> 0x010a }
            r2.mo39138e(r3)     // Catch:{ Exception -> 0x010a }
            r2 = 1
            if (r1 != 0) goto L_0x005f
            r3 = r4
            goto L_0x00db
        L_0x005f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x010a }
            r3.<init>()     // Catch:{ Exception -> 0x010a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x010a }
        L_0x0068:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x010a }
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x010a }
            r6 = r5
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r6 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r6     // Catch:{ Exception -> 0x010a }
            java.lang.String r7 = r12.getCategoryId()     // Catch:{ Exception -> 0x010a }
            if (r7 == 0) goto L_0x0084
            int r7 = r7.length()     // Catch:{ Exception -> 0x010a }
            if (r7 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r7 = r0
            goto L_0x0085
        L_0x0084:
            r7 = r2
        L_0x0085:
            if (r7 != 0) goto L_0x00a0
            java.lang.String r7 = r12.getCategoryId()     // Catch:{ Exception -> 0x010a }
            java.lang.String r8 = "0"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ Exception -> 0x010a }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r7 = r12.getCategoryId()     // Catch:{ Exception -> 0x010a }
            java.lang.String r8 = r6.getCategoryId()     // Catch:{ Exception -> 0x010a }
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch:{ Exception -> 0x010a }
            goto L_0x00a1
        L_0x00a0:
            r7 = r0
        L_0x00a1:
            java.lang.String r8 = r12.getVivinoId()     // Catch:{ Exception -> 0x010a }
            if (r8 == 0) goto L_0x00b0
            int r8 = r8.length()     // Catch:{ Exception -> 0x010a }
            if (r8 != 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r8 = r0
            goto L_0x00b1
        L_0x00b0:
            r8 = r2
        L_0x00b1:
            if (r8 != 0) goto L_0x00cc
            java.lang.String r8 = r12.getVivinoId()     // Catch:{ Exception -> 0x010a }
            java.lang.String r9 = "-1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)     // Catch:{ Exception -> 0x010a }
            if (r8 != 0) goto L_0x00cc
            java.lang.String r8 = r12.getVivinoId()     // Catch:{ Exception -> 0x010a }
            java.lang.String r6 = r6.getVivinoId()     // Catch:{ Exception -> 0x010a }
            boolean r6 = android.text.TextUtils.equals(r8, r6)     // Catch:{ Exception -> 0x010a }
            goto L_0x00cd
        L_0x00cc:
            r6 = r0
        L_0x00cd:
            if (r7 != 0) goto L_0x00d4
            if (r6 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r6 = r0
            goto L_0x00d5
        L_0x00d4:
            r6 = r2
        L_0x00d5:
            if (r6 == 0) goto L_0x0068
            r3.add(r5)     // Catch:{ Exception -> 0x010a }
            goto L_0x0068
        L_0x00db:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r12 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = "getWineCount 过滤之后 "
            if (r3 != 0) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            int r4 = r3.size()     // Catch:{ Exception -> 0x010a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x010a }
        L_0x00ea:
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r4)     // Catch:{ Exception -> 0x010a }
            r12.mo39138e(r1)     // Catch:{ Exception -> 0x010a }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x010a }
            if (r11 != 0) goto L_0x0109
            if (r3 == 0) goto L_0x0101
            boolean r11 = r3.isEmpty()     // Catch:{ Exception -> 0x010a }
            if (r11 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r2 = r0
        L_0x0101:
            if (r2 == 0) goto L_0x0104
            goto L_0x0109
        L_0x0104:
            int r11 = r3.size()     // Catch:{ Exception -> 0x010a }
            return r11
        L_0x0109:
            return r0
        L_0x010a:
            r11 = move-exception
            r11.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel.getWineCount(java.lang.String, java.lang.String):int");
    }

    /* access modifiers changed from: private */
    public final void handleAddWinePicture(H5AddWine h5AddWine) {
        try {
            if (!TextUtils.isEmpty(h5AddWine.getPhoto())) {
                File file = new File(AppConfig.Companion.getApplication().getCacheDir(), "linshi.jpeg");
                if (!file.exists()) {
                    file.createNewFile();
                }
                byte[] decode = Base64.decode(h5AddWine.getPhoto(), 2);
                FileUtils.Companion companion = FileUtils.Companion;
                Intrinsics.checkNotNullExpressionValue(decode, BundleJUnitUtils.KEY_RESULT);
                companion.writeBytesToFile(decode, file);
                "添加的酒品类的图片大小is" + (file.length() / ((long) 1024)) + "kb";
                h5AddWine.setPhotoFile(file);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            addWineInfoError(th.toString(), 1);
        }
    }

    private final boolean isListEquals(List<String> list, List<String> list2) {
        for (String contains : list) {
            if (list2.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void log(String str) {
    }

    private final void manageDisposable(String str, C9207b bVar) {
        C9206a aVar;
        C7820f.m21850d(Intrinsics.stringPlus("manageDisposable - identityPage: ", str), new Object[0]);
        if (this.compositeDisposableMap.containsKey(str)) {
            C9206a aVar2 = this.compositeDisposableMap.get(str);
            Intrinsics.checkNotNull(aVar2);
            aVar = aVar2;
        } else {
            C9206a aVar3 = new C9206a();
            this.compositeDisposableMap.put(str, aVar3);
            aVar = aVar3;
        }
        aVar.mo47027b(bVar);
    }

    /* access modifiers changed from: private */
    public final void modifyWineCategoryCount(ArrayList<WineBaseInfo> arrayList, int i) {
        ArrayList<WineCategoryInfo> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        for (WineBaseInfo wineBaseInfo : arrayList) {
            if (arrayList3.contains(wineBaseInfo.getCategoryId())) {
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (WineCategoryInfo wineCategoryInfo : arrayList2) {
                    if (wineCategoryInfo.getCategoryId() == Integer.parseInt(wineBaseInfo.getCategoryId())) {
                        wineCategoryInfo.setWineCount(wineCategoryInfo.getWineCount() - 1);
                    }
                    arrayList4.add(Unit.INSTANCE);
                }
            } else {
                arrayList3.add(wineBaseInfo.getCategoryId());
                WineCategoryInfo queryByCategoryId = LoginUserInfoRoom.Companion.wineCategoryDao().queryByCategoryId(Integer.parseInt(wineBaseInfo.getCategoryId()));
                queryByCategoryId.setWineCount(queryByCategoryId.getWineCount() - 1);
                arrayList2.add(queryByCategoryId);
            }
        }
        LoginUserInfoRoom.Companion.wineCategoryDao().updateWineInventories(arrayList2);
    }

    private final void openLight(String str, String str2, Map<String, String> map) {
        HiSmart.Companion.getInstance().deviceService().sendCommand(str, str2, map, WineWebViewModel$openLight$1.INSTANCE, WineWebViewModel$openLight$2.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void queryInventCountByVivioIdError(String str) {
        JsResp jsResp = new JsResp("query error", 1, str);
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.GET_INVENTORY_EXIST_COUNT_BY_VIVINOID_CALLBACK;
        String json = new Gson().toJson((Object) jsResp);
        if (json == null) {
            json = "";
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, json));
    }

    private final void refreshInfoSuccess(String str, AddWineResult addWineResult) {
        JSONObject jSONObject = new JSONObject();
        if (addWineResult != null) {
            this.lastCategory = String.valueOf(addWineResult.getCategoryId());
            jSONObject.put("categoryId", String.valueOf(addWineResult.getCategoryId()));
            jSONObject.put("photoUrl", addWineResult.getPhotoUrl());
        } else {
            jSONObject.put("data", str);
        }
        jSONObject.put("resultCode", 0);
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("addCategory===", jSONObject));
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.ADD_WINE_CALLBACK;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "returnJson.toString()");
        evaluateJsLiveData.setValue(new Pair(webActionEnum, jSONObject2));
    }

    public static /* synthetic */ void refreshInfoSuccess$default(WineWebViewModel wineWebViewModel, String str, AddWineResult addWineResult, int i, Object obj) {
        if ((i & 2) != 0) {
            addWineResult = null;
        }
        wineWebViewModel.refreshInfoSuccess(str, addWineResult);
    }

    private final void removeWineWithIdArrayExe(String str, String str2, WebActionEnum webActionEnum) {
        try {
            Object fromJson = new Gson().fromJson(new JSONArray(str2).toString(), new WineWebViewModel$removeWineWithIdArrayExe$type$1().getType());
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(jsonArray.toString(), type)");
            List<String> list = (List) fromJson;
            if (list.isEmpty()) {
                Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$removeWineWithIdArrayExe$1(this, webActionEnum, (Continuation<? super WineWebViewModel$removeWineWithIdArrayExe$1>) null), 2, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String longOrNull : list) {
                Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(longOrNull);
                arrayList.add(Long.valueOf(longOrNull2 == null ? -1 : longOrNull2.longValue()));
            }
            Job unused2 = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$removeWineWithIdArrayExe$3(arrayList, list, this, str, webActionEnum, (Continuation<? super WineWebViewModel$removeWineWithIdArrayExe$3>) null), 2, (Object) null);
        } catch (JSONException e) {
            List emptyList = CollectionsKt__CollectionsKt.emptyList();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            getEvaluateJsLiveData().postValue(new Pair(webActionEnum, new Gson().toJson((Object) new JsResp(emptyList, 1, message))));
        }
    }

    /* access modifiers changed from: private */
    public final void searchCategoryExiestWithCategory(String str) {
        int i;
        WineCategoryInfo queryByCategoryId = LoginUserInfoRoom.Companion.wineCategoryDao().queryByCategoryId(Integer.parseInt(str));
        if (queryByCategoryId == null) {
            i = 0;
        } else {
            i = queryByCategoryId.getWineCount();
        }
        getInventoryExistCountByVivinoIdSuccess(i, str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d A[Catch:{ Exception -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[Catch:{ Exception -> 0x00c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void searchCategoryExiestWithNet(java.lang.String r32) {
        /*
            r31 = this;
            r1 = r31
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00c4 }
            r0.<init>()     // Catch:{ Exception -> 0x00c4 }
            java.lang.Class<com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine> r2 = com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine.class
            r3 = r32
            java.lang.Object r0 = r0.fromJson((java.lang.String) r3, r2)     // Catch:{ Exception -> 0x00c4 }
            com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine r0 = (com.hisense.connect_life.hismart.networks.request.wine.model.H5AddWine) r0     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = r0.getVivinoId()     // Catch:{ Exception -> 0x00c4 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0022
            int r2 = r2.length()     // Catch:{ Exception -> 0x00c4 }
            if (r2 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = r0.getVivinoId()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r5 = "-1"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ Exception -> 0x00c4 }
            if (r2 != 0) goto L_0x0033
            r2 = r4
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            java.util.List r5 = r0.getFoodMatch()     // Catch:{ Exception -> 0x00c4 }
            if (r5 != 0) goto L_0x003c
        L_0x003a:
            r5 = r3
            goto L_0x0043
        L_0x003c:
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00c4 }
            if (r5 != r4) goto L_0x003a
            r5 = r4
        L_0x0043:
            r6 = 0
            if (r5 == 0) goto L_0x0049
            r0.setFoodMatch(r6)     // Catch:{ Exception -> 0x00c4 }
        L_0x0049:
            java.util.List r5 = r0.getGrapes()     // Catch:{ Exception -> 0x00c4 }
            if (r5 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00c4 }
            if (r5 != r4) goto L_0x0057
            r3 = r4
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            r0.setGrapes(r6)     // Catch:{ Exception -> 0x00c4 }
        L_0x005c:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r3 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = "searchCategoryExiestWithNet vivinoId is =="
            java.lang.String r5 = r0.getVivinoId()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r5)     // Catch:{ Exception -> 0x00c4 }
            r3.mo39140i(r4)     // Catch:{ Exception -> 0x00c4 }
            if (r2 == 0) goto L_0x0085
            com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory r2 = new com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory     // Catch:{ Exception -> 0x00c4 }
            r6 = 1
            java.lang.String r7 = r0.getVivinoId()     // Catch:{ Exception -> 0x00c4 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1020(0x3fc, float:1.43E-42)
            r17 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00b2
        L_0x0085:
            java.lang.String r21 = r0.getWineFactoryName()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r23 = r0.getWineType()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r22 = r0.getWineName()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r24 = r0.getArea()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r25 = r0.getCountry()     // Catch:{ Exception -> 0x00c4 }
            java.util.List r26 = r0.getGrapes()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r27 = r0.getProduceYear()     // Catch:{ Exception -> 0x00c4 }
            com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory r2 = new com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory     // Catch:{ Exception -> 0x00c4 }
            r19 = 0
            r20 = 0
            r28 = 0
            r29 = 514(0x202, float:7.2E-43)
            r30 = 0
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x00c4 }
        L_0x00b2:
            com.hisense.connect_life.hismart.networks.request.wine.IWineCategoryManager r0 = r31.getWineCategoryManager()     // Catch:{ Exception -> 0x00c4 }
            com.internationalwinecooler.ui.WineWebViewModel$searchCategoryExiestWithNet$1 r3 = new com.internationalwinecooler.ui.WineWebViewModel$searchCategoryExiestWithNet$1     // Catch:{ Exception -> 0x00c4 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00c4 }
            com.internationalwinecooler.ui.WineWebViewModel$searchCategoryExiestWithNet$2 r4 = new com.internationalwinecooler.ui.WineWebViewModel$searchCategoryExiestWithNet$2     // Catch:{ Exception -> 0x00c4 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00c4 }
            r0.queryCategoryExist(r2, r3, r4)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00cc
        L_0x00c4:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r1.queryInventCountByVivioIdError(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel.searchCategoryExiestWithNet(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void searchCategoryExist(H5AddWine h5AddWine) {
        QueryOneCategory queryOneCategory;
        try {
            if (h5AddWine.isAutoAdd()) {
                queryOneCategory = new QueryOneCategory(1, h5AddWine.getVivinoId(), (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null);
            } else {
                queryOneCategory = new QueryOneCategory(0, (String) null, h5AddWine.getWineFactoryName(), h5AddWine.getWineName(), h5AddWine.getWineType(), h5AddWine.getArea(), h5AddWine.getCountry(), h5AddWine.getGrapes(), h5AddWine.getProduceYear(), (String) null, 514, (DefaultConstructorMarker) null);
            }
            LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("vivinoId is ==", queryOneCategory.getVivinoId()));
            LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("vivinoId is ", h5AddWine.getVivinoId()));
            getWineCategoryManager().queryCategoryExist(queryOneCategory, new WineWebViewModel$searchCategoryExist$1(h5AddWine, this), new WineWebViewModel$searchCategoryExist$2(this));
        } catch (Exception e) {
            addWineInfoError(e.toString(), 1);
        }
    }

    private final long strDateToLong(String str) {
        if (TextUtils.isEmpty(str)) {
            return System.currentTimeMillis();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:SS");
        Intrinsics.checkNotNull(str);
        Date parse = simpleDateFormat.parse(str);
        Long valueOf = parse == null ? null : Long.valueOf(parse.getTime());
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }

    private final Calendar strToCalendar(String str) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(parse.getTime());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return instance;
    }

    /* access modifiers changed from: private */
    public final String strToMonthStr(String str) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(parse.getTime());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return calendarToMonthStr(instance);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0013 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void testLogAllWine() {
        /*
            r8 = this;
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom$Companion r0 = com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom.Companion     // Catch:{ Exception -> 0x007f }
            com.hisense.connect_life.hismart.sql.account.LoginUserInfoProvider r0 = r0.loginUserInfoProvider()     // Catch:{ Exception -> 0x007f }
            java.util.List r0 = r0.getAllWineInventoryNew()     // Catch:{ Exception -> 0x007f }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000f
            goto L_0x0058
        L_0x000f:
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x007f }
        L_0x0013:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x007f }
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x007f }
            com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo r4 = (com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo) r4     // Catch:{ Exception -> 0x007f }
            java.lang.String r5 = r4.getDeviceId()     // Catch:{ Exception -> 0x007f }
            if (r5 == 0) goto L_0x002e
            int r5 = r5.length()     // Catch:{ Exception -> 0x007f }
            if (r5 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r5 = r1
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            if (r5 == 0) goto L_0x0013
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r5 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x007f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007f }
            r6.<init>()     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = "testLogAllWine  category is"
            r6.append(r7)     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = r4.getCategoryId()     // Catch:{ Exception -> 0x007f }
            r6.append(r7)     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = " wineName is "
            r6.append(r7)     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = r4.getWineName()     // Catch:{ Exception -> 0x007f }
            r6.append(r4)     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x007f }
            r5.mo39140i(r4)     // Catch:{ Exception -> 0x007f }
            goto L_0x0013
        L_0x0058:
            if (r0 == 0) goto L_0x0060
            boolean r3 = r0.isEmpty()     // Catch:{ Exception -> 0x007f }
            if (r3 == 0) goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            if (r1 == 0) goto L_0x006b
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x007f }
            java.lang.String r1 = "testLogAllWine  wines is  empty"
            r0.mo39140i(r1)     // Catch:{ Exception -> 0x007f }
            goto L_0x008a
        L_0x006b:
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r1 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = "testLogAllWine  wines is  "
            int r0 = r0.size()     // Catch:{ Exception -> 0x007f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)     // Catch:{ Exception -> 0x007f }
            r1.mo39140i(r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x008a
        L_0x007f:
            r0 = move-exception
            r0.printStackTrace()
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r0 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion
            java.lang.String r1 = "testLogAllWine  操作数据库失败"
            r0.mo39140i(r1)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.WineWebViewModel.testLogAllWine():void");
    }

    private final void timeStampToString() {
        System.out.println(Intrinsics.stringPlus("格式化结果：", new SimpleDateFormat(WineFilterModelKt.COMMON_FORMAT).format(new Date(Long.parseLong(String.valueOf(948585600000L))))));
        System.out.println(Intrinsics.stringPlus("格式化结果：", new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒").format(new Date(Long.parseLong(String.valueOf(948585600000L))))));
    }

    private final void updateCategory(AddWineCategory addWineCategory) {
        try {
            LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("addCategory wifiId is ", addWineCategory));
            getWineCategoryManager().updateWineCategory(addWineCategory, new WineWebViewModel$updateCategory$1(this), new WineWebViewModel$updateCategory$2(this));
        } catch (Throwable th) {
            addWineInfoError(th.toString(), 1);
        }
    }

    /* access modifiers changed from: private */
    public final void updateZoneBWine(String str, String str2) {
        if (!TextUtils.isEmpty(str) && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "Zone2Use", false, 2, (Object) null)) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$updateZoneBWine$1(str, this, (Continuation<? super WineWebViewModel$updateZoneBWine$1>) null), 2, (Object) null);
        }
    }

    public void addWine(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$addWine$1(str2, this, (Continuation<? super WineWebViewModel$addWine$1>) null), 2, (Object) null);
    }

    @Deprecated(message = "使用addWine")
    public void addWineForBase(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("addWine model: ", str2));
    }

    public void gaWebOperationReport(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(str2, SavedStateHandle.VALUES);
        DataAnalyticsReportUtils instance = DataAnalyticsReportUtils.Companion.getInstance();
        if (instance != null) {
            DataAnalyticsReportUtils.report$default(instance, str, (Bundle) null, 2, (Object) null);
        }
    }

    @NotNull
    public final MutableLiveData<Triple<String, Integer, String>> getAddWineSucLiveData() {
        return (MutableLiveData) this.addWineSucLiveData$delegate.getValue();
    }

    public void getAllSameWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getAllSameWinesInDevice$1(str3, str2, this, (Continuation<? super WineWebViewModel$getAllSameWinesInDevice$1>) null), 2, (Object) null);
    }

    public void getAllWinesInDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        LogUtilsShen.Companion.mo39138e("getAllWinesInDevice");
        LogUtilsShen.Companion companion = LogUtilsShen.Companion;
        companion.mo39138e(" auid: " + str2 + ", model: " + str3);
        Intrinsics.stringPlus("identityPage:", str);
        Intrinsics.stringPlus("auid:", str2);
        Intrinsics.stringPlus("model:", str3);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getAllWinesInDevice$1(str3, str2, this, (Continuation<? super WineWebViewModel$getAllWinesInDevice$1>) null), 2, (Object) null);
    }

    public void getApplianceProfile(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getApplianceProfile$1(this, str2, (Continuation<? super WineWebViewModel$getApplianceProfile$1>) null), 2, (Object) null);
    }

    public void getBadImageAfterVivino(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getBadImageAfterVivino$1(this, (Continuation<? super WineWebViewModel$getBadImageAfterVivino$1>) null), 2, (Object) null);
    }

    public void getChartData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        companion.mo39146e("getCharData - auid: " + str2 + ", model: " + str3 + "  identityPage：" + str);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getChartData$1(str3, str2, this, (Continuation<? super WineWebViewModel$getChartData$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getCompressImageLiveData() {
        return (MutableLiveData) this.compressImageLiveData$delegate.getValue();
    }

    public void getDeviceInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getDeviceInfo$1(str2, this, (Continuation<? super WineWebViewModel$getDeviceInfo$1>) null), 2, (Object) null);
    }

    public void getDevicePropertiesInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("getDeviceProperties is ", str2));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getDevicePropertiesInfo$1(str2, this, (Continuation<? super WineWebViewModel$getDevicePropertiesInfo$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Pair<WebActionEnum, String>> getEvaluateJsLiveData() {
        return (MutableLiveData) this.evaluateJsLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<AddWineImageBean> getGetImageLiveData() {
        return (MutableLiveData) this.getImageLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getGoAddWinePageLiveData() {
        return (MutableLiveData) this.goAddWinePageLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getGoInvLiveData() {
        return (MutableLiveData) this.goInvLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getGoVivinoLiveData() {
        return (MutableLiveData) this.goVivinoLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getGobackLiveData() {
        return (MutableLiveData) this.gobackLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getImageBadPathLiveData() {
        return (MutableLiveData) this.imageBadPathLiveData$delegate.getValue();
    }

    public void getInventoryExistCountByVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getInventoryExistCountByVivinoId: model = ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getInventoryExistCountByVivinoId$1(str, this, (Continuation<? super WineWebViewModel$getInventoryExistCountByVivinoId$1>) null), 2, (Object) null);
    }

    @NotNull
    public final String getLastCategory() {
        return this.lastCategory;
    }

    public void getLightsInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getLightsInfo model: ", str2));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getLightsInfo$1(str2, this, (Continuation<? super WineWebViewModel$getLightsInfo$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadingData() {
        return (MutableLiveData) this.loadingData$delegate.getValue();
    }

    public void getManualInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getManualInfo$1(str2, this, (Continuation<? super WineWebViewModel$getManualInfo$1>) null), 2, (Object) null);
    }

    public void getManualUrl() {
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getManualUrl manualUrl: ", SPManagerKt.getManualUrl(KeyConst.KEY_MANUAL_URL)));
        String str = "";
        JsResp jsResp = new JsResp(SPManagerKt.getManualUrl(KeyConst.KEY_MANUAL_URL), 0, str);
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.GET_MANUAL_URL_CALLBACK;
        String json = new Gson().toJson((Object) jsResp);
        if (json != null) {
            str = json;
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
    }

    public void getMsgSwitch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getMsgSwitch$1(str, this, (Continuation<? super WineWebViewModel$getMsgSwitch$1>) null), 2, (Object) null);
    }

    public void getNoShelfWineNum(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        Ref.IntRef intRef = new Ref.IntRef();
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            intRef.element = ((Integer) obj).intValue();
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getNoShelfWineNum$1(str3, str2, intRef, this, (Continuation<? super WineWebViewModel$getNoShelfWineNum$1>) null), 2, (Object) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public void getRemoveMessageStatus() {
        String str = "1";
        JsResp jsResp = new JsResp(C1524t.m1041e().mo15416c("isShowDeleted") ? "0" : str, 0, "");
        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = getEvaluateJsLiveData();
        WebActionEnum webActionEnum = WebActionEnum.GET_REMOVE_MSG_STATUS_CALLBACK;
        String json = new Gson().toJson((Object) jsResp);
        if (json != null) {
            str = json;
        }
        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
    }

    @NotNull
    public final MutableLiveData<Pair<List<WineBaseInfo>, Boolean>> getRemoveWineSucLiveData() {
        return (MutableLiveData) this.removeWineSucLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getSetImageBase64LiveData() {
        return (MutableLiveData) this.setImageBase64LiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getTakePhotoLiveData() {
        return (MutableLiveData) this.takePhotoLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUnbindApplianceLiveData() {
        return (MutableLiveData) this.unbindApplianceLiveData$delegate.getValue();
    }

    public void getVivinoInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getVivinoInfo model: ", str));
        log("getVivinoInfo start ====");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getVivinoInfo$1(str, this, (Continuation<? super WineWebViewModel$getVivinoInfo$1>) null), 2, (Object) null);
    }

    public void getWineCardInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getWineCardInfo model: ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getWineCardInfo$1(str, this, (Continuation<? super WineWebViewModel$getWineCardInfo$1>) null), 2, (Object) null);
    }

    @NotNull
    public final IWineCategoryManager getWineCategoryManager() {
        return (IWineCategoryManager) this.wineCategoryManager$delegate.getValue();
    }

    @NotNull
    public final WineCategoryViewModel getWineCategoryViewModel() {
        return (WineCategoryViewModel) this.wineCategoryViewModel$delegate.getValue();
    }

    public void getWineCoolerList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getWineCoolerList: ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getWineCoolerList$1(this, (Continuation<? super WineWebViewModel$getWineCoolerList$1>) null), 2, (Object) null);
    }

    public void getWineCoolerListAndCount(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        companion.mo39146e("getWineCoolerListAndCount: identityPage:" + str + ", vivinoId:" + str2);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getWineCoolerListAndCount$1(this, str2, (Continuation<? super WineWebViewModel$getWineCoolerListAndCount$1>) null), 2, (Object) null);
    }

    public void getWineDeviceList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$getWineDeviceList$1(this, (Continuation<? super WineWebViewModel$getWineDeviceList$1>) null), 2, (Object) null);
    }

    public void getWineInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$getWineInfo$1(this, str2, (Continuation<? super WineWebViewModel$getWineInfo$1>) null), 2, (Object) null);
    }

    public void goAddWinePage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("goAddWinePage: ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$goAddWinePage$1(this, (Continuation<? super WineWebViewModel$goAddWinePage$1>) null), 2, (Object) null);
    }

    public void goBack() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$goBack$1(this, (Continuation<? super WineWebViewModel$goBack$1>) null), 2, (Object) null);
    }

    public void goInventoryPage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$goInventoryPage$1(this, (Continuation<? super WineWebViewModel$goInventoryPage$1>) null), 2, (Object) null);
    }

    public void imageUrlToBase64(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("imageUrlToBase64 model: ", str2));
        try {
            String string = new JSONObject(str2).getString("imageUrl");
            if (TextUtils.isEmpty(string)) {
                LoggerUtil.Companion.mo39146e("imageUrlToBase64 fail: 参数错误");
                String b = C1527w.m1063b(R.string.parameter_error);
                Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
                executeFailCallback(b, WebActionEnum.IMAGE_URL_TO_BASE64_CALLBACK);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(string, "imageUrl");
            String encodeToString = Base64.encodeToString(getByteArrayFromImageURL(string), 2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("imageData", encodeToString);
            JsResp jsResp = new JsResp(jsonObject, 0, (String) null, 6, (DefaultConstructorMarker) null);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$imageUrlToBase64$1(this, jsResp, (Continuation<? super WineWebViewModel$imageUrlToBase64$1>) null), 2, (Object) null);
            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("imageUrlToBase64 suc: ", new Gson().toJson((Object) jsResp)));
        } catch (JSONException e) {
            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("imageUrlToBase64 fail: ", e.getMessage()));
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            executeFailCallback(message, WebActionEnum.IMAGE_URL_TO_BASE64_CALLBACK);
        }
    }

    public void onCleared() {
        super.onCleared();
    }

    public void onPageFinish(@NotNull String str) {
        C9206a aVar;
        Intrinsics.checkNotNullParameter(str, "identityPage");
        C7820f.m21850d(Intrinsics.stringPlus("onPageFinish - identity: ", str), new Object[0]);
        if (this.compositeDisposableMap.containsKey(str) && (aVar = this.compositeDisposableMap.get(str)) != null) {
            if (!aVar.mo47031f()) {
                aVar.dispose();
            }
            aVar.mo47029d();
        }
    }

    public void removeMulWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
    }

    public void removeOtherWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        removeWineWithIdArrayExe(str, str2, WebActionEnum.REMOVE_OTHER_WINE_WITH_ID_ARRAY_CALLBACK);
    }

    public void removeWineWithIdArray(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        removeWineWithIdArrayExe(str, str2, WebActionEnum.REMOVE_WINE_WITH_ID_ARRAY_CALLBACK);
    }

    public void sendCmd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str3, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$sendCmd$1(str3, str2, this, (Continuation<? super WineWebViewModel$sendCmd$1>) null), 2, (Object) null);
    }

    public void sendTemperatureCmd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$sendTemperatureCmd$1(str2, this, (Continuation<? super WineWebViewModel$sendTemperatureCmd$1>) null), 2, (Object) null);
    }

    public final void setLastCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastCategory = str;
    }

    public void setRemoveMessageStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$setRemoveMessageStatus$1(str, (Continuation<? super WineWebViewModel$setRemoveMessageStatus$1>) null), 2, (Object) null);
    }

    public void showVivinoInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
        if (str.length() > 0) {
            String string = new JSONObject(str).getString(KeyConst.KEY_VIVINO_ID);
            Postcard a = C1337a.m211c().mo15011a(Paths.App.VivinoWebViewActivity);
            a.withString(KeyConst.KEY_VIVINO_ID, string);
            a.navigation();
            return;
        }
        ToastUtils.m9602z(R.string.error);
    }

    public void showWineData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$showWineData$1(this, (Continuation<? super WineWebViewModel$showWineData$1>) null), 2, (Object) null);
    }

    public final void showWineDataExe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "imageBase64");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$showWineDataExe$1(str, this, (Continuation<? super WineWebViewModel$showWineDataExe$1>) null), 2, (Object) null);
    }

    public void takePhoto(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$takePhoto$1(this, str2, (Continuation<? super WineWebViewModel$takePhoto$1>) null), 2, (Object) null);
    }

    @NotNull
    public final WinePositionModel toWinePositionModel(@NotNull WineBaseInfo wineBaseInfo) {
        Intrinsics.checkNotNullParameter(wineBaseInfo, "entity");
        return new WinePositionModel(wineBaseInfo.getZoneName(), Integer.valueOf(wineBaseInfo.getCellNum()), Integer.valueOf(wineBaseInfo.getPositionNum()), wineBaseInfo.getBestDrinkDate(), wineBaseInfo.getRemindAlarmDate(), wineBaseInfo.getNotes(), Long.valueOf(wineBaseInfo.getInventoryId()), wineBaseInfo.getDeviceId());
    }

    public void unpairAppliance(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("unpairAppliance model：", str2));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$unpairAppliance$1(this, str2, (Continuation<? super WineWebViewModel$unpairAppliance$1>) null), 2, (Object) null);
    }

    public void updateApplianceNickName(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "auId");
        Intrinsics.checkNotNullParameter(str3, "deviceNickName");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$updateApplianceNickName$1(str, str2, str3, this, (Continuation<? super WineWebViewModel$updateApplianceNickName$1>) null), 2, (Object) null);
    }

    public void updateApplianceProfile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "auId");
        Intrinsics.checkNotNullParameter(str4, "purchaseDate");
        Intrinsics.checkNotNullParameter(str5, "warrantyEndDate");
        Intrinsics.checkNotNullParameter(str6, "applianceMedia");
        HiSmart.Companion.getInstance().deviceService().updateApplianceProfile(str2, str3, str4, str5, str6, new WineWebViewModel$updateApplianceProfile$1(this), new WineWebViewModel$updateApplianceProfile$2(this));
    }

    public void updateFile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("updateFile model: ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$updateFile$1(str, this, (Continuation<? super WineWebViewModel$updateFile$1>) null), 2, (Object) null);
    }

    public void updateMsgSwitch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "model");
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("updateMsgSwitch model: ", str));
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$updateMsgSwitch$1(str, this, (Continuation<? super WineWebViewModel$updateMsgSwitch$1>) null), 2, (Object) null);
    }

    public void updateWine(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new WineWebViewModel$updateWine$1(str2, this, (Continuation<? super WineWebViewModel$updateWine$1>) null), 2, (Object) null);
    }

    public void updateWineFavorite(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "identityPage");
        Intrinsics.checkNotNullParameter(str2, "model");
        LogUtilsShen.Companion.mo39140i(Intrinsics.stringPlus("updateWineFavorite ==", str2));
        WineCategoryInfo wineCategoryInfo = (WineCategoryInfo) new Gson().fromJson(str2, WineCategoryInfo.class);
        int favorite = wineCategoryInfo.getFavorite();
        getWineCategoryManager().favoriteWineCategory(String.valueOf(wineCategoryInfo.getCategoryId()), String.valueOf(favorite), new WineWebViewModel$updateWineFavorite$1(this, favorite, wineCategoryInfo), new WineWebViewModel$updateWineFavorite$2(this));
    }

    public void updateWineInfo(@NotNull String str, @NotNull String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "model");
        Intrinsics.checkNotNullParameter(str2, "totalModel");
        try {
            Type type = new WineWebViewModel$updateWineInfo$listType$1().getType();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            T fromJson = new Gson().fromJson(str2, WineBaseInfo.class);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(totalMod…WineBaseInfo::class.java)");
            objectRef.element = fromJson;
            Object fromJson2 = new Gson().fromJson(str, type);
            Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(model, listType)");
            List<WinePositionModel> list = (List) fromJson2;
            for (WinePositionModel winePositionModel : list) {
                if (winePositionModel.getNotes() != null) {
                    if (!TextUtils.isEmpty(winePositionModel.getNotes())) {
                        str3 = winePositionModel.getNotes();
                        winePositionModel.setNotes(str3);
                    }
                }
                str3 = "-1";
                winePositionModel.setNotes(str3);
            }
            HiSmart.Companion.getInstance().wineWineInventoryManagerSerivce().upDateWindInventory(list, new WineWebViewModel$updateWineInfo$2(objectRef, str, type, this), new WineWebViewModel$updateWineInfo$3(this));
        } catch (Throwable unused) {
            Job unused2 = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), (CoroutineStart) null, new WineWebViewModel$updateWineInfo$4(this, (Continuation<? super WineWebViewModel$updateWineInfo$4>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final List<WineBaseInfo> getAllWineByCategory(List<WineBaseInfo> list, String str) {
        for (WineBaseInfo wineBaseInfo : list) {
            wineBaseInfo + " ------- " + wineBaseInfo.getCategoryId() + " ----" + str;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (Intrinsics.areEqual((Object) ((WineBaseInfo) next).getCategoryId(), (Object) str)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new WineWebViewModel$getAllWineByCategory$$inlined$sortBy$2());
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList2);
    }
}
