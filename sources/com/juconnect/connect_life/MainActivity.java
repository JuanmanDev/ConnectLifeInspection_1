package com.juconnect.connect_life;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.p028os.BundleKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.work.PeriodicWorkRequest;
import com.alibaba.android.arouter.facade.Postcard;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.stetho.common.LogUtil;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.CheckUpgradeTool;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.util.alexa.AmazonAuthorizationBean;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseApplication;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.NetUtils;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.message.MessageObserver;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessageBeen;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import com.hisense.juconnect.app_device.event.DeleteNotification;
import com.hisense.juconnect.app_device.event.GetMessage;
import com.hisense.juconnect.app_device.event.GetUserMessage;
import com.hisense.juconnect.app_device.event.GoNotification;
import com.hisense.juconnect.app_device.event.NewMessage;
import com.hisense.juconnect.app_device.event.NotificationBack;
import com.hisense.juconnect.app_device.event.ToastMsg;
import com.hisense.juconnect.app_device.event.ZoneWineBindEvent;
import com.hisense.juconnect.connectlife.R;
import com.hisense.juconnect.connectlife.utils.AlexaAppUtil;
import com.juconnect.connect_life.application.MainApplication;
import com.juconnect.connect_life.broadcast.NetWorkMonitorManager;
import com.juconnect.connect_life.event.LoginEvent;
import com.juconnect.connect_life.fcm.FireBaseViewModel;
import com.juconnect.connect_life.global.AccountChannel;
import com.juconnect.connect_life.global.AccountMethodConstant;
import com.juconnect.connect_life.global.DeviceInfoChannel;
import com.juconnect.connect_life.global.GeneralChannel;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import com.juconnect.connect_life.global.MessageChannel;
import com.juconnect.connect_life.global.NotificationChannel;
import com.juconnect.connect_life.global.PingChannel;
import com.juconnect.connect_life.model.ChannelResponse;
import com.juconnect.connect_life.model.ConfigViewModel;
import com.juconnect.connect_life.model.LanguageData;
import com.juconnect.connect_life.model.LoginOutModel;
import com.juconnect.connect_life.page.NativeWebViewActivity;
import com.juconnect.connect_life.socket.SocketManager;
import com.juconnect.connect_life.socket.SocketModel;
import com.juconnect.connect_life.util.DataAnalyticsReportUtils;
import com.juconnect.connect_life.util.LogFileUtils;
import com.juconnect.connect_life.util.PingUtils;
import com.juconnect.connect_life.util.WifiConnectUtils;
import com.juconnect.connect_life.util.WifiNewUtils;
import com.juconnect.connectlife.ju_dist.event.EventUnregisterNetwork;
import com.juconnect.connectlife.ju_dist.utils.WifiNameUtils;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
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
import org.json.JSONObject;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p301y.p508a.C7709a;
import p040c.p301y.p508a.C7711c;
import p040c.p301y.p508a.C7712d;
import p040c.p301y.p508a.C7714f;
import p040c.p301y.p508a.C7715g;
import p040c.p301y.p508a.C7716h;
import p040c.p301y.p508a.C7717i;
import p040c.p301y.p508a.C7718j;
import p040c.p301y.p508a.C7719k;
import p040c.p301y.p508a.C7720l;
import p040c.p301y.p508a.C7723o;
import p040c.p301y.p508a.C7724p;
import p040c.p301y.p508a.C7725q;
import p040c.p472t.p473a.C7585u;
import p553f.p554a.p556d.p557a.C8914g;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p630io.flutter.embedding.android.FlutterFragmentActivity;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0007J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010=\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001cH\u0002J\b\u0010?\u001a\u000207H\u0002J\b\u0010@\u001a\u000207H\u0002J\b\u0010A\u001a\u00020\u0014H\u0002J\b\u0010B\u001a\u000207H\u0002J\u001a\u0010C\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\u001cH\u0002J\u0012\u0010E\u001a\u0002072\b\b\u0001\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\u001c\u0010I\u001a\u0002072\b\u0010J\u001a\u0004\u0018\u00010\f2\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010K\u001a\u000207H\u0002J\u0010\u0010L\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\fH\u0002J\b\u0010R\u001a\u000207H\u0002J\u0012\u0010S\u001a\u0002072\b\u0010T\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010U\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0002J\u000e\u0010V\u001a\u0002072\u0006\u0010;\u001a\u00020WJ\u0012\u0010X\u001a\u0002072\b\u0010Y\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010Z\u001a\u0002072\u0006\u0010Z\u001a\u00020[H\u0007J\b\u0010\\\u001a\u000207H\u0002JJ\u0010]\u001a\u0002072\u0006\u0010^\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\f2\b\u0010_\u001a\u0004\u0018\u00010\f2\b\u0010`\u001a\u0004\u0018\u00010\f2\u0006\u0010a\u001a\u00020\f2\b\b\u0002\u0010b\u001a\u00020\f2\b\b\u0002\u0010c\u001a\u00020\fH\u0002J\b\u0010d\u001a\u000207H\u0002J\b\u0010e\u001a\u000207H\u0002J\u0010\u0010f\u001a\u0002072\u0006\u0010g\u001a\u00020\fH\u0002J\u0012\u0010h\u001a\u0002072\b\u0010i\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010j\u001a\u000207H\u0002J\u0012\u0010k\u001a\u0002072\b\u0010l\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010m\u001a\u0002072\b\u0010n\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010o\u001a\u0002072\u0006\u0010p\u001a\u00020\fH\u0002J\u0012\u0010q\u001a\u0002072\b\u0010r\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010s\u001a\u0002072\b\u0010r\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010t\u001a\u0002072\b\u0010r\u001a\u0004\u0018\u00010\f2\u0006\u0010u\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u001cH\u0002J\b\u0010v\u001a\u000207H\u0002J\u0018\u0010w\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001cH\u0002J\u0018\u0010x\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001cH\u0002J\u0018\u0010y\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001cH\u0002J\u0018\u0010z\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001cH\u0002J\b\u0010{\u001a\u000207H\u0002J\u0010\u0010|\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010}\u001a\u00020\u0014H\u0002J\u001b\u0010~\u001a\u00020\u00142\u0007\u0010\u001a\u00030\u00012\b\u0010n\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u001a\u00030\u0001H\u0002J\u0007\u0010\u0001\u001a\u000207J\t\u0010\u0001\u001a\u000207H\u0002J\t\u0010\u0001\u001a\u000207H\u0002J&\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u00010OH\u0014J\u0015\u0010\u0001\u001a\u0002072\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u000207H\u0014J\u0012\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\fH\u0007J\u0013\u0010\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0013\u0010\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0013\u0010\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0011\u0010\u0001\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0014J\t\u0010\u0001\u001a\u000207H\u0014J\"\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u00052\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0001H\u0016J\"\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u00052\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0001H\u0016J4\u0010\u0001\u001a\u0002072\u0007\u0010\u0001\u001a\u00020\u00052\u0010\u0010\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\f0\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0003\u0010 \u0001J\t\u0010¡\u0001\u001a\u000207H\u0014J\u0013\u0010¢\u0001\u001a\u0002072\b\u0010£\u0001\u001a\u00030¤\u0001H\u0007J\u0013\u0010¥\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030¦\u0001H\u0007J\u0014\u0010§\u0001\u001a\u0002072\t\u0010¨\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010©\u0001\u001a\u0002072\t\u0010ª\u0001\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010«\u0001\u001a\u00030¬\u0001H\u0016J\t\u0010­\u0001\u001a\u000207H\u0002J\t\u0010®\u0001\u001a\u000207H\u0002J\u0011\u0010¯\u0001\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\u0011\u0010°\u0001\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0002J\u0012\u0010±\u0001\u001a\u0002072\t\b\u0001\u0010²\u0001\u001a\u00020\u0005J\u0012\u0010±\u0001\u001a\u0002072\u0007\u0010³\u0001\u001a\u00020\fH\u0002J\u0013\u0010´\u0001\u001a\u0002072\b\u0010T\u001a\u0004\u0018\u00010\fH\u0002J\u0013\u0010µ\u0001\u001a\u0002072\b\u0010T\u001a\u0004\u0018\u00010\fH\u0002J\t\u0010¶\u0001\u001a\u000207H\u0002J\t\u0010·\u0001\u001a\u000207H\u0002J\u0013\u0010¸\u0001\u001a\u0002072\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0013\u0010»\u0001\u001a\u0002072\b\u0010\u0001\u001a\u00030¼\u0001H\u0007J\t\u0010½\u0001\u001a\u000207H\u0002J\t\u0010¾\u0001\u001a\u000207H\u0002J\u001b\u00105\u001a\u0002072\u0006\u0010^\u001a\u00020\f2\t\u0010¿\u0001\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&X.¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006À\u0001"}, mo47991d2 = {"Lcom/juconnect/connect_life/MainActivity;", "Lio/flutter/embedding/android/FlutterFragmentActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "CODE_LOCATION", "", "CODE_WRITE", "CODE_WRITE_MANAGER_TYP", "OPEN_WIFI_SET", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "alexaCode", "", "configViewModel", "Lcom/juconnect/connect_life/model/ConfigViewModel;", "connetlifePrivacyPolicyUrl", "fireBaseViewModel", "Lcom/juconnect/connect_life/fcm/FireBaseViewModel;", "firstName", "hasLoginSuccess", "", "jhlNeedUserAgreementCount", "Ljava/lang/Integer;", "lastName", "mConfigMac", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "mTypeResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "notificationPermissionNeverGranted", "getNotificationPermissionNeverGranted", "()Z", "setNotificationPermissionNeverGranted", "(Z)V", "photoUrl", "tags", "Ljava/util/ArrayList;", "termsConditionsUrl", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdPlatformId", "timer", "Ljava/util/Timer;", "userIconBgColor", "userName", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "setWifiManager", "(Landroid/net/wifi/WifiManager;)V", "writeLog", "GoNotificationBack", "", "notificationBack", "Lcom/hisense/juconnect/app_device/event/NotificationBack;", "NewMessage", "call", "Lio/flutter/plugin/common/MethodCall;", "NotificationHandleMethod", "result", "addNetMonitor", "avoidHomeReload", "checkFileWritePerm", "checkLocationPerm", "checkSing", "resultStr", "configureFlutterEngine", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "connectSocket", "connectWifiOfDevice", "wifiStartName", "disconnectSocket", "firebaseAnalyticsMethod", "getAlexaData", "intent", "Landroid/content/Intent;", "getAppToAppIntent", "appToAppUrl", "getLanguageTypeCode", "getMac", "cmd", "getManagerType", "getMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessageBeen;", "getToBrowser", "url", "getUserMessage", "Lcom/hisense/juconnect/app_device/event/GetUserMessage;", "getUserProfile", "gotoAgreementWebViewActivity", "title", "userAgreementUrl", "privacyPolicyUrl", "from", "email", "pwd", "gotoGooglePlay", "gotoLogin", "gotoLoginBefore", "deletedAccount", "gotoNativeWebViewActivity", "params", "gotoSetWifi", "gotoSettings", "devStr", "gotoThirdApp", "packageName", "gotoThirdLogin", "thirdId", "gotoUserProfile", "argument", "gotoWineApp", "gotoWineInventory", "isTypeSelected", "gotoWineSetUp", "handleDeviceInfoMethod", "handleGeneralMethod", "handleMethod", "handlePingMethod", "importOldUserEmails", "initAlexaUrl", "isAppBackground", "isAppInstalled", "context", "Landroid/content/Context;", "isLocServiceEnable", "logSuccess", "loginOut", "loginWithOneAccount", "onActivityResult", "requestCode", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEventMessage", "event", "onGoNotification", "zoneWineBindEvent", "Lcom/hisense/juconnect/app_device/event/DeleteNotification;", "Lcom/hisense/juconnect/app_device/event/GoNotification;", "onLoginEvent", "Lcom/juconnect/connect_life/event/LoginEvent;", "onNewIntent", "onPause", "onPermissionsDenied", "perms", "", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onUserProfileEvent", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "onWineBind", "Lcom/hisense/juconnect/app_device/event/ZoneWineBindEvent;", "openAlexaAppToAppUrl", "urlJson", "openQRPage", "tip", "provideSplashScreen", "Lio/flutter/embedding/android/SplashScreen;", "refreshOverPushPage", "registerFireBase", "sendToast", "setHasLogin", "showString", "resourcesId", "string", "startConfigNet", "startGetNetStatus", "subscribeFireBase", "subscribeMsgObservable", "thirdLoginByAccount", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "unRegisterNetwork", "Lcom/juconnect/connectlife/ju_dist/event/EventUnregisterNetwork;", "unsubscribeFireBase", "updateUserProfile", "logStr", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity extends FlutterFragmentActivity implements EasyPermissions.PermissionCallbacks {
    public final int CODE_LOCATION = 1;
    public final int CODE_WRITE = 3;
    public final int CODE_WRITE_MANAGER_TYP = 4;
    public final int OPEN_WIFI_SET = 2;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public AccountViewModel accountViewModel;
    @NotNull
    public String alexaCode = "";
    public ConfigViewModel configViewModel;
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    public FireBaseViewModel fireBaseViewModel;
    @NotNull
    public String firstName = "";
    public boolean hasLoginSuccess;
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @NotNull
    public String lastName = "";
    @NotNull
    public String mConfigMac = "";
    @Nullable
    public FirebaseAnalytics mFirebaseAnalytics;
    @Nullable
    public C9017j.C9022d mTypeResult;
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    public boolean notificationPermissionNeverGranted;
    @Nullable
    public String photoUrl = "";
    public ArrayList<Integer> tags;
    @Nullable
    public String termsConditionsUrl = "";
    public ThirdAccountViewModel thirdLoginModel;
    @NotNull
    public String thirdPlatformId = "";
    @Nullable
    public Timer timer;
    public int userIconBgColor;
    public String userName;
    @Nullable
    public WifiManager wifiManager;
    @NotNull
    public String writeLog = "";

    private final void NewMessage(C9016i iVar) {
        Gson gson = new Gson();
        if (iVar.f17688b.toString() != null) {
            ArrayList arrayList = (ArrayList) gson.fromJson(SPManagerKt.getDeviceId(), new MainActivity$NewMessage$type$1().getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
                if (!arrayList.contains(iVar.f17688b.toString())) {
                    arrayList.add(iVar.f17688b.toString());
                }
            } else if (!arrayList.contains(iVar.f17688b.toString())) {
                arrayList.add(iVar.f17688b.toString());
            }
            String json = gson.toJson((Object) arrayList);
            Intrinsics.checkNotNullExpressionValue(json, "json");
            SPManagerKt.setDeviceId(json);
        }
        EventBus.getDefault().post(new NewMessage());
    }

    /* access modifiers changed from: private */
    public final void NotificationHandleMethod(C9016i iVar, C9017j.C9022d dVar) {
        String obj;
        AccountMethodConstant accountMethodConstant = AccountMethodConstant.INSTANCE;
        String str = iVar.f17687a;
        if (str != null) {
            String str2 = null;
            switch (str.hashCode()) {
                case -1251560920:
                    if (str.equals(AccountMethodConstant.METHOD_GET_USER_PROFILE)) {
                        getUserProfile();
                        return;
                    }
                    return;
                case -1093540357:
                    if (str.equals(AccountMethodConstant.METHOD_GOTO_USER_PROFILE)) {
                        Object obj2 = iVar.f17688b;
                        if (obj2 != null) {
                            str2 = obj2.toString();
                        }
                        gotoUserProfile(str2);
                        return;
                    }
                    return;
                case 398553829:
                    if (str.equals(AccountMethodConstant.METHOD_CHECK_SIGN)) {
                        Object obj3 = iVar.f17688b;
                        if (obj3 != null) {
                            str2 = obj3.toString();
                        }
                        checkSing(str2, dVar);
                        return;
                    }
                    return;
                case 1264612062:
                    if (str.equals(GeneralMethodConstant.PUSH_MESSAGE)) {
                        NewMessage(iVar);
                        return;
                    }
                    return;
                case 1816847302:
                    if (str.equals(AccountMethodConstant.METHOD_GOTO_LOGIN)) {
                        Object obj4 = iVar.f17688b;
                        String str3 = "";
                        if (!(obj4 == null || (obj = obj4.toString()) == null)) {
                            str3 = obj;
                        }
                        gotoLoginBefore(str3);
                        return;
                    }
                    return;
                case 2022744869:
                    if (str.equals(AccountMethodConstant.METHOD_LOGIN_OUT)) {
                        loginOut();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void addNetMonitor() {
        Handler handler = new Handler();
        NetWorkMonitorManager instance = NetWorkMonitorManager.Companion.getInstance();
        if (instance != null) {
            instance.init(getApplication());
        }
        NetWorkMonitorManager instance2 = NetWorkMonitorManager.Companion.getInstance();
        if (instance2 != null) {
            instance2.addNetMonitor(new MainActivity$addNetMonitor$1(this, handler));
        }
    }

    private final void avoidHomeReload() {
        if ((getIntent().getFlags() & 4194304) != 0) {
        }
    }

    private final boolean checkFileWritePerm() {
        boolean a = EasyPermissions.m26767a(this, "android.permission.WRITE_EXTERNAL_STORAGE");
        if (!a) {
            C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, this.CODE_WRITE, "android.permission.WRITE_EXTERNAL_STORAGE");
            bVar.mo50749d(R.string.request_permissions);
            bVar.mo50748c(R.string.rationale_ask_ok);
            bVar.mo50747b(R.string.camera_cancel);
            C9818b a2 = bVar.mo50746a();
            Intrinsics.checkNotNullExpressionValue(a2, "Builder(\n               …\n                .build()");
            EasyPermissions.m26771e(a2);
        }
        return a;
    }

    private final void checkLocationPerm() {
        if (!EasyPermissions.m26767a(this, "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_COARSE_LOCATION", PermissionConstKt.PERMISSION_LOCATION)) {
            C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, this.CODE_LOCATION, "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_COARSE_LOCATION", PermissionConstKt.PERMISSION_LOCATION);
            bVar.mo50749d(R.string.request_permissions);
            bVar.mo50748c(R.string.rationale_ask_ok);
            bVar.mo50747b(R.string.camera_cancel);
            C9818b a = bVar.mo50746a();
            Intrinsics.checkNotNullExpressionValue(a, "Builder(\n               …\n                .build()");
            EasyPermissions.m26771e(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[Catch:{ Exception -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0018 A[Catch:{ Exception -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[Catch:{ Exception -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void checkSing(java.lang.String r7, p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x000f
            int r2 = r7.length()     // Catch:{ Exception -> 0x000d }
            if (r2 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = r0
            goto L_0x0010
        L_0x000d:
            r7 = move-exception
            goto L_0x0051
        L_0x000f:
            r2 = r1
        L_0x0010:
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x000d }
            r8.success(r7)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0018:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x000d }
            r2.<init>()     // Catch:{ Exception -> 0x000d }
            java.lang.Class<com.hisense.connect_life.hismart.model.JuCustomResult> r3 = com.hisense.connect_life.hismart.model.JuCustomResult.class
            java.lang.Object r2 = r2.fromJson((java.lang.String) r7, r3)     // Catch:{ Exception -> 0x000d }
            com.hisense.connect_life.hismart.model.JuCustomResult r2 = (com.hisense.connect_life.hismart.model.JuCustomResult) r2     // Catch:{ Exception -> 0x000d }
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x002b
        L_0x0029:
            r2 = r3
            goto L_0x0032
        L_0x002b:
            java.lang.String r2 = r2.getSignatureServer()     // Catch:{ Exception -> 0x000d }
            if (r2 != 0) goto L_0x0032
            goto L_0x0029
        L_0x0032:
            java.lang.String r4 = ",(\\s*)\"signatureServer\":(\\s*)\"(.*?)\""
            kotlin.text.Regex r5 = new kotlin.text.Regex     // Catch:{ Exception -> 0x000d }
            r5.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x000d }
            java.lang.String r7 = r5.replace((java.lang.CharSequence) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x000d }
            com.hisense.connect_life.hismart.networks.parameters.RsaSignProvider r3 = new com.hisense.connect_life.hismart.networks.parameters.RsaSignProvider     // Catch:{ Exception -> 0x000d }
            r3.<init>()     // Catch:{ Exception -> 0x000d }
            boolean r7 = r3.checkSign(r7, r2)     // Catch:{ Exception -> 0x000d }
            if (r7 != 0) goto L_0x0049
            r0 = r1
        L_0x0049:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x000d }
            r8.success(r7)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0051:
            r7.printStackTrace()
            java.lang.String r0 = r7.getMessage()
            java.lang.String r1 = "-1"
            r8.error(r1, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connect_life.MainActivity.checkSing(java.lang.String, f.a.e.a.j$d):void");
    }

    private final void connectSocket(C9016i iVar) {
        String obj = iVar.f17688b.toString();
        if (!TextUtils.isEmpty(obj)) {
            SocketModel socketModel = (SocketModel) C1502i.m924d(obj, SocketModel.class);
            SocketManager.Companion.getInstance().initSocket(socketModel.getPath(), socketModel.getPingInterval());
            return;
        }
        throw new Exception("The arg isn't null or empty!");
    }

    private final void connectWifiOfDevice(String str, C9017j.C9022d dVar) {
        try {
            Intrinsics.stringPlus(str, "");
            if (str != null) {
                List listOf = CollectionsKt__CollectionsKt.listOf(PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION");
                if (C7585u.m21554c(this, listOf)) {
                    WifiConnectUtils.Companion.getInstance().connectWifi(this, str, new MainActivity$connectWifiOfDevice$1(this, new Ref.BooleanRef(), dVar));
                    return;
                }
                C7585u l = C7585u.m21560l(this);
                l.mo33041f(listOf);
                l.mo33043h(new C7712d(this, str, dVar));
            } else if (dVar != null) {
                dVar.success("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: connectWifiOfDevice$lambda-43  reason: not valid java name */
    public static final void m27226connectWifiOfDevice$lambda43(MainActivity mainActivity, String str, C9017j.C9022d dVar, List list, boolean z) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        if (z) {
            mainActivity.connectWifiOfDevice(str, dVar);
        }
    }

    private final void disconnectSocket() {
        SocketManager.Companion.getInstance().closeSocket();
    }

    private final void firebaseAnalyticsMethod(C9016i iVar) {
        String obj;
        Object obj2 = iVar.f17688b;
        if (obj2 != null && (obj = obj2.toString()) != null) {
            Object obj3 = new JSONObject(obj).get("eventName");
            DataAnalyticsReportUtils instance = DataAnalyticsReportUtils.Companion.getInstance();
            if (instance != null) {
                DataAnalyticsReportUtils.report$default(instance, obj3.toString(), (Bundle) null, 2, (Object) null);
            }
        }
    }

    private final void getAlexaData(Intent intent) {
        String.valueOf(intent.getData());
        if (intent.getData() != null) {
            int i = 0;
            if (StringsKt__StringsJVMKt.startsWith$default(String.valueOf(intent.getData()), "https:", false, 2, (Object) null) || StringsKt__StringsJVMKt.startsWith$default(String.valueOf(intent.getData()), "connect:", false, 2, (Object) null)) {
                String valueOf = String.valueOf(intent.getData());
                int length = valueOf.length();
                int i2 = -1;
                if (StringsKt__StringsKt.contains$default((CharSequence) valueOf, (CharSequence) "&", false, 2, (Object) null)) {
                    int length2 = valueOf.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            length = -1;
                            break;
                        } else if (Intrinsics.areEqual((Object) String.valueOf(valueOf.charAt(i3)), (Object) "&")) {
                            length = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                int length3 = valueOf.length();
                while (true) {
                    if (i >= length3) {
                        break;
                    } else if (Intrinsics.areEqual((Object) String.valueOf(valueOf.charAt(i)), (Object) MAPCookie.COOKIE_NAME_VALUE_SEPERATOR)) {
                        i2 = i;
                        break;
                    } else {
                        i++;
                    }
                }
                String substring = valueOf.substring(i2 + 1, length);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                this.alexaCode = substring;
            }
        }
    }

    private final Intent getAppToAppIntent(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    private final void getLanguageTypeCode() {
        Intrinsics.stringPlus("languageType: ", SPManagerKt.getLanguageType());
        C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.GET_LANGUAGE_TYPE_CODE_CALLBACK, SPManagerKt.getLanguageType());
        }
    }

    private final void getMac(String str) {
        if (str != null) {
            this.mConfigMac = "";
            Object d = C1502i.m924d(str, ConfigParsCom.class);
            Intrinsics.checkNotNullExpressionValue(d, "fromJson(cmd, ConfigParsCom::class.java)");
            ConfigParsCom configParsCom = (ConfigParsCom) d;
            new Timer().schedule(new MainActivity$getMac$$inlined$schedule$1(this), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            ConfigViewModel configViewModel2 = this.configViewModel;
            if (configViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
                configViewModel2 = null;
            }
            configViewModel2.getMac(configParsCom);
        }
    }

    private final void getManagerType(C9017j.C9022d dVar) {
        if (dVar != null) {
            dVar.success(String.valueOf(SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0)));
        }
    }

    private final void getToBrowser(String str) {
        if (str != null) {
            try {
                String.valueOf(str);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
                intent.setData(parse);
                startActivity(Intent.createChooser(intent, "please select browser"));
            } catch (Exception e) {
                String.valueOf(e.getMessage());
            }
        }
    }

    private final void getUserProfile() {
        AccountViewModel accountViewModel2 = this.accountViewModel;
        if (accountViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel2 = null;
        }
        accountViewModel2.getUserProfile(MainActivity$getUserProfile$1.INSTANCE, MainActivity$getUserProfile$2.INSTANCE);
    }

    private final void gotoAgreementWebViewActivity(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.GUserAgreementWebViewActivity);
        a.withString(KeyConst.KEY_TITLE_TEXT, str).withString("email", str6).withString(EventBusConstKt.PSW, str7).withString(KeyConst.KEY_TARGET_URL, str2).withString("from", str5).withString(KeyConst.USER_AGREEMENT_URL, str3).withString(KeyConst.USER_PRIVACY_POLICY, str4).withString(EventBusConstKt.ID_TOKEN, "");
        a.navigation();
    }

    public static /* synthetic */ void gotoAgreementWebViewActivity$default(MainActivity mainActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        mainActivity.gotoAgreementWebViewActivity(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    private final void gotoGooglePlay() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(Intrinsics.stringPlus("market://details?id=", getPackageName())));
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(Intrinsics.stringPlus("https://play.google.com/store/apps/details?id=", getPackageName())));
            if (intent2.resolveActivity(getPackageManager()) != null) {
                startActivity(intent2);
            }
        } catch (ActivityNotFoundException e) {
            Intrinsics.stringPlus("GoogleMarket Intent not found :", e);
        }
    }

    private final void gotoLogin() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new MainActivity$gotoLogin$1(this, (Continuation<? super MainActivity$gotoLogin$1>) null), 2, (Object) null);
    }

    private final void gotoLoginBefore(String str) {
        if (this.hasLoginSuccess) {
            logSuccess();
            return;
        }
        if ((str.length() > 0) && Intrinsics.areEqual((Object) str, (Object) "true")) {
            AccountUtils.Companion.deleteCurrentUserInfoFromDatabase();
            AccountUtils.Companion.clearLoginInfo();
            AppConfig.Companion.setAccessToken("");
        }
        gotoLogin();
    }

    private final void gotoNativeWebViewActivity(String str) {
        Intent intent = new Intent(this, NativeWebViewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("params", str);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private final void gotoSetWifi() {
        startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), this.OPEN_WIFI_SET);
    }

    private final void gotoSettings(String str) {
        DeviceInfo deviceInfo;
        String str2;
        if (!(str == null || str.length() == 0) && (deviceInfo = (DeviceInfo) C1502i.m924d(str, DeviceInfo.class)) != null) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("onlineStatus");
            if (!(optString == null || optString.length() == 0)) {
                str2 = jSONObject.optString("onlineStatus");
                Intrinsics.checkNotNullExpressionValue(str2, "jo.optString(\"onlineStatus\")");
            } else {
                str2 = "1";
            }
            Postcard a = C1337a.m211c().mo15011a(Paths.App.SettingWineWebViewActivity);
            Postcard withString = a.withString("deviceId", deviceInfo.getDeviceId());
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            withString.withString(KeyConst.KEY_TARGET_URL, JuConnectExtKt.buildAssetUrl(HtmlPaths.DEVICE_SETTINGS2, applicationContext, SPManagerKt.getLanguageType(), MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceId", deviceInfo.getDeviceId()), TuplesKt.m25743to(EventBusConstKt.WIFIID, deviceInfo.getWifiId()), TuplesKt.m25743to("deviceName", deviceInfo.getDeviceNickName()), TuplesKt.m25743to("onlineStatus", str2), TuplesKt.m25743to("oneZoneFlag", DeviceCache.Companion.getInstance().getOneZoneFlagByFeatureCode(deviceInfo.getDeviceId())))));
            a.navigation();
        }
    }

    private final void gotoThirdApp(String str) {
        if (isAppInstalled(this, str)) {
            PackageManager packageManager = getPackageManager();
            Intrinsics.checkNotNull(str);
            startActivity(packageManager.getLaunchIntentForPackage(str));
            return;
        }
        ToastUtils.m9596o().mo21603w("应用未安装！", new Object[0]);
    }

    private final void gotoThirdLogin(String str) {
        if (!Intrinsics.areEqual((Object) str, (Object) getString(R.string.server_client_id))) {
            return;
        }
        if (ThirdLoginForGoogleUtils.Companion.checkUserLogin(this)) {
            GoogleSignInAccount currentUser = ThirdLoginForGoogleUtils.Companion.getCurrentUser(this);
            if (currentUser != null) {
                thirdLoginByAccount(currentUser);
                return;
            }
            return;
        }
        ThirdLoginForGoogleUtils.Companion.thirdLogin(this);
    }

    private final void gotoUserProfile(String str) {
        String str2;
        String.valueOf(str);
        if (str == null) {
            str2 = "";
        } else {
            JSONObject jSONObject = new JSONObject(str);
            Intrinsics.checkNotNullExpressionValue(jSONObject.optString("source"), "jsonObject.optString(\"source\")");
            str2 = jSONObject.optString("domainUrl");
            Intrinsics.checkNotNullExpressionValue(str2, "jsonObject.optString(\"domainUrl\")");
        }
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
        a.withString("domain", str2);
        a.navigation();
    }

    private final void gotoWineApp(String str) {
        boolean z;
        if (str != null) {
            List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"@@"}, false, 0, 6, (Object) null);
            if (split$default != null && split$default.size() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Postcard a = C1337a.m211c().mo15011a(Paths.Device.DeviceInfoActivity);
                a.withBundle(EventBusConstKt.DEVICE_INFO_BUNDLE, BundleKt.bundleOf(TuplesKt.m25743to(EventBusConstKt.DEVICE, split$default.get(1)), TuplesKt.m25743to(EventBusConstKt.COOLER_ACCESS_TOKEN, HiSmart.Companion.getInstance().getToken()), TuplesKt.m25743to(EventBusConstKt.COOLER_DNAME, split$default.get(0))));
                a.navigation();
            }
        }
    }

    private final void gotoWineInventory(String str, boolean z, C9017j.C9022d dVar) {
        this.mTypeResult = dVar;
        String serviceType = AppConfig.Companion.getServiceType();
        int hashCode = serviceType.hashCode();
        if (hashCode != -1422446064) {
            if (hashCode != 99349) {
                if (hashCode == 1090594823 && serviceType.equals("release")) {
                    HiSmart instance = HiSmart.Companion.getInstance();
                    if (str == null) {
                        str = "";
                    }
                    instance.setWineHost(str);
                }
            } else if (serviceType.equals("dev")) {
                HiSmart instance2 = HiSmart.Companion.getInstance();
                if (str == null) {
                    str = "";
                }
                instance2.setWineHost(str);
            }
        } else if (serviceType.equals("testing")) {
            HiSmart instance3 = HiSmart.Companion.getInstance();
            if (str == null) {
                str = "";
            }
            instance3.setWineHost(str);
        }
        AppConfig.Companion.setAnonymousLoginToken(HiSmart.Companion.getInstance().getToken());
        if (z) {
            int i = this.CODE_WRITE_MANAGER_TYP;
            Postcard a = C1337a.m211c().mo15011a(Paths.App.InventorySelectTypeActivity);
            a.withBoolean("isShowSecond", true);
            a.withString(KeyConst.KEY_AUIT, "");
            a.navigation((Activity) this, i);
            return;
        }
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_INVENTORY_TYPE_FIRST, Boolean.TRUE);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            Postcard a2 = C1337a.m211c().mo15011a(Paths.App.InventorySelectTypeActivity);
            a2.withBoolean("isShowSecond", false);
            a2.navigation();
        } else {
            JuConnectExtKt.navigation(Paths.App.InventoryMainActivity);
        }
    }

    private final void gotoWineSetUp() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Device.AddNewWifiInstructionsActivity);
        a.withString(EventBusConstKt.COOLER_ACCESS_TOKEN, HiSmart.Companion.getInstance().getToken());
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void handleDeviceInfoMethod(C9016i iVar, C9017j.C9022d dVar) {
        GeneralMethodConstant generalMethodConstant = GeneralMethodConstant.INSTANCE;
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) GeneralMethodConstant.METHOD_DEVICE_INFO)) {
            dVar.success(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("systemVersion", Build.VERSION.RELEASE), TuplesKt.m25743to("systemName", "Android")));
        }
    }

    /* access modifiers changed from: private */
    public final void handleGeneralMethod(C9016i iVar, C9017j.C9022d dVar) {
        String obj;
        GeneralMethodConstant generalMethodConstant = GeneralMethodConstant.INSTANCE;
        String str = iVar.f17687a;
        if (str != null) {
            String str2 = null;
            switch (str.hashCode()) {
                case -1846692995:
                    if (str.equals(GeneralMethodConstant.SHOW_TOAST_MESSAGE)) {
                        sendToast(iVar);
                        return;
                    }
                    return;
                case -1657429157:
                    if (str.equals(GeneralMethodConstant.SET_LANGUAGE_METHOD)) {
                        Object obj2 = iVar.f17688b;
                        if (!(obj2 == null || (obj = obj2.toString()) == null)) {
                            LanguageData languageData = (LanguageData) C1502i.m924d(obj, LanguageData.class);
                            String languageId = languageData.getLanguageId();
                            String languageCode = languageData.getLanguageCode();
                            "languageId : " + languageId + ", languageCode :" + languageCode;
                            SPManagerKt.setFlutterSettingLanguage(true);
                            SPManagerKt.setLanguageId(Long.parseLong(languageId));
                            SPManagerKt.setLanguageType(languageCode);
                        }
                        MultiLanguageUtil.INSTANCE.setConfiguration();
                        return;
                    }
                    return;
                case -1387438513:
                    if (str.equals(GeneralMethodConstant.refreshOver)) {
                        refreshOverPushPage();
                        return;
                    }
                    return;
                case -1061547478:
                    if (str.equals(GeneralMethodConstant.GOTO_WIFI_SET)) {
                        gotoSetWifi();
                        return;
                    }
                    return;
                case -945905010:
                    if (str.equals(GeneralMethodConstant.DEV_GET_MAC)) {
                        Object obj3 = iVar.f17688b;
                        if (obj3 != null) {
                            str2 = obj3.toString();
                        }
                        getMac(str2);
                        return;
                    }
                    return;
                case -423445250:
                    if (str.equals(GeneralMethodConstant.GOTO_THIRD_APP_METHOD)) {
                        Object obj4 = iVar.f17688b;
                        if (obj4 != null) {
                            str2 = obj4.toString();
                        }
                        gotoThirdApp(str2);
                        return;
                    }
                    return;
                case -404561177:
                    if (str.equals(GeneralMethodConstant.GOTO_WINE_ALL_INVENTORY)) {
                        Object obj5 = iVar.f17688b;
                        if (obj5 != null) {
                            str2 = obj5.toString();
                        }
                        gotoWineInventory(str2, false, dVar);
                        return;
                    }
                    return;
                case -337521102:
                    if (str.equals(GeneralMethodConstant.GET_MANAGER_TYPE)) {
                        getManagerType(dVar);
                        return;
                    }
                    return;
                case -186285866:
                    if (str.equals(GeneralMethodConstant.OPEN_ALEXA_URL)) {
                        Object obj6 = iVar.f17688b;
                        if (obj6 != null) {
                            str2 = obj6.toString();
                        }
                        openAlexaAppToAppUrl(str2);
                        return;
                    }
                    return;
                case -114850328:
                    if (str.equals(GeneralMethodConstant.START_PANASONIC_CONFIG)) {
                        Object obj7 = iVar.f17688b;
                        if (obj7 != null) {
                            str2 = obj7.toString();
                        }
                        startConfigNet(str2);
                        return;
                    }
                    return;
                case -104580832:
                    if (str.equals(GeneralMethodConstant.GO_TO_QR_PAGE)) {
                        Object obj8 = iVar.f17688b;
                        if (obj8 != null) {
                            str2 = obj8.toString();
                        }
                        openQRPage(str2);
                        return;
                    }
                    return;
                case -95888144:
                    if (str.equals(GeneralMethodConstant.DISCONNECT_SOCKET_METHOD)) {
                        disconnectSocket();
                        return;
                    }
                    return;
                case -48464457:
                    if (str.equals(GeneralMethodConstant.GOTO_WEB_VIEW_METHOD)) {
                        Object obj9 = iVar.f17688b;
                        if (obj9 != null) {
                            str2 = obj9.toString();
                        }
                        gotoNativeWebViewActivity(str2);
                        return;
                    }
                    return;
                case 181027054:
                    if (str.equals(GeneralMethodConstant.REGISTER_FCM_METHOD)) {
                        registerFireBase();
                        return;
                    }
                    return;
                case 304356359:
                    if (str.equals(GeneralMethodConstant.ANALYTICS_METHOD)) {
                        firebaseAnalyticsMethod(iVar);
                        return;
                    }
                    return;
                case 450671089:
                    if (str.equals(GeneralMethodConstant.GOTO_WINE_SETUP)) {
                        gotoWineSetUp();
                        return;
                    }
                    return;
                case 492684539:
                    if (str.equals(GeneralMethodConstant.OPEN_WINE_COOLER_SETTING_PAGE)) {
                        Object obj10 = iVar.f17688b;
                        if (obj10 != null) {
                            str2 = obj10.toString();
                        }
                        gotoSettings(str2);
                        return;
                    }
                    return;
                case 571671004:
                    if (str.equals(GeneralMethodConstant.WRITE_LOG_TO_FILE)) {
                        Object obj11 = iVar.f17688b;
                        if (obj11 != null) {
                            str2 = obj11.toString();
                        }
                        writeLog("配网", str2);
                        return;
                    }
                    return;
                case 899414078:
                    if (str.equals(GeneralMethodConstant.CONNECT_SOCKET_METHOD)) {
                        connectSocket(iVar);
                        return;
                    }
                    return;
                case 1107543867:
                    if (str.equals(GeneralMethodConstant.GOTO_WINE_ACTIVITY)) {
                        Object obj12 = iVar.f17688b;
                        if (obj12 != null) {
                            str2 = obj12.toString();
                        }
                        gotoWineApp(str2);
                        return;
                    }
                    return;
                case 1199244128:
                    if (str.equals(GeneralMethodConstant.GOTO_AC_INTRODUCTION_METHOD)) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty(NotificationCompatJellybean.KEY_TITLE, "Ac Manual");
                        jsonObject.addProperty("url", "file:///android_asset/resource/ConnectLife-Instruction-20200810.pdf");
                        gotoNativeWebViewActivity(jsonObject.toString());
                        return;
                    }
                    return;
                case 1252676236:
                    if (str.equals(GeneralMethodConstant.CHECK_LOCATION_PRE)) {
                        checkLocationPerm();
                        return;
                    }
                    return;
                case 1798783935:
                    if (str.equals(GeneralMethodConstant.GOTO_STORE_METHOD)) {
                        gotoGooglePlay();
                        return;
                    }
                    return;
                case 1838665198:
                    if (str.equals(GeneralMethodConstant.DEV_GET_NET_STATUS)) {
                        Object obj13 = iVar.f17688b;
                        if (obj13 != null) {
                            str2 = obj13.toString();
                        }
                        startGetNetStatus(str2);
                        return;
                    }
                    return;
                case 1914106186:
                    if (str.equals(GeneralMethodConstant.CONNECT_WIFI)) {
                        Object obj14 = iVar.f17688b;
                        if (obj14 != null) {
                            str2 = obj14.toString();
                        }
                        connectWifiOfDevice(str2, dVar);
                        return;
                    }
                    return;
                case 1953565493:
                    if (str.equals(GeneralMethodConstant.GET_LANGUAGE_TYPE_CODE)) {
                        getLanguageTypeCode();
                        return;
                    }
                    return;
                case 2042133573:
                    if (str.equals(GeneralMethodConstant.GOTO_Browser)) {
                        Object obj15 = iVar.f17688b;
                        if (obj15 != null) {
                            str2 = obj15.toString();
                        }
                        getToBrowser(str2);
                        return;
                    }
                    return;
                case 2043857584:
                    if (str.equals(GeneralMethodConstant.GOTO_WINE_INVENTORY)) {
                        Object obj16 = iVar.f17688b;
                        if (obj16 != null) {
                            str2 = obj16.toString();
                        }
                        gotoWineInventory(str2, true, dVar);
                        return;
                    }
                    return;
                case 2089411289:
                    if (str.equals(GeneralMethodConstant.OPEN_APP_SETTING)) {
                        Object obj17 = iVar.f17688b;
                        if (obj17 != null) {
                            str2 = obj17.toString();
                        }
                        if (Intrinsics.areEqual((Object) str2, (Object) "location")) {
                            C7585u.m21557i(this, CollectionsKt__CollectionsKt.listOf(PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"));
                            return;
                        } else if (Intrinsics.areEqual((Object) str2, (Object) "camera")) {
                            C7585u.m21559k(this, "android.permission.CAMERA");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleMethod(C9016i iVar, C9017j.C9022d dVar) {
        String obj;
        AccountMethodConstant accountMethodConstant = AccountMethodConstant.INSTANCE;
        String str = iVar.f17687a;
        if (str != null) {
            String str2 = null;
            switch (str.hashCode()) {
                case -1251560920:
                    if (str.equals(AccountMethodConstant.METHOD_GET_USER_PROFILE)) {
                        getUserProfile();
                        return;
                    }
                    return;
                case -1093540357:
                    if (str.equals(AccountMethodConstant.METHOD_GOTO_USER_PROFILE)) {
                        Object obj2 = iVar.f17688b;
                        if (obj2 != null) {
                            str2 = obj2.toString();
                        }
                        gotoUserProfile(str2);
                        return;
                    }
                    return;
                case 398553829:
                    if (str.equals(AccountMethodConstant.METHOD_CHECK_SIGN)) {
                        Object obj3 = iVar.f17688b;
                        if (obj3 != null) {
                            str2 = obj3.toString();
                        }
                        checkSing(str2, dVar);
                        return;
                    }
                    return;
                case 1264612062:
                    if (str.equals(GeneralMethodConstant.PUSH_MESSAGE)) {
                        NewMessage(iVar);
                        return;
                    }
                    return;
                case 1816847302:
                    if (str.equals(AccountMethodConstant.METHOD_GOTO_LOGIN)) {
                        Object obj4 = iVar.f17688b;
                        String str3 = "";
                        if (!(obj4 == null || (obj = obj4.toString()) == null)) {
                            str3 = obj;
                        }
                        gotoLoginBefore(str3);
                        return;
                    }
                    return;
                case 2022744869:
                    if (str.equals(AccountMethodConstant.METHOD_LOGIN_OUT)) {
                        loginOut();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handlePingMethod(C9016i iVar, C9017j.C9022d dVar) {
        GeneralMethodConstant generalMethodConstant = GeneralMethodConstant.INSTANCE;
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) GeneralMethodConstant.METHOD_PING)) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Object obj = iVar.f17688b;
            if (obj != null) {
                Timer timer2 = new Timer();
                timer2.schedule(new MainActivity$handlePingMethod$1$1(booleanRef, dVar), ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS);
                String ping = PingUtils.INSTANCE.ping((String) obj);
                timer2.cancel();
                if (!booleanRef.element) {
                    dVar.success(Intrinsics.areEqual((Object) ping, (Object) "ok") ? "1" : "0");
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    private final void importOldUserEmails() {
        int i;
        try {
            i = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll().size();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i != 0 && !(!AccountUtils.Companion.userEmails().isEmpty())) {
            for (LoginUserInfo email : LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll()) {
                AccountUtils.Companion.saveUserEmail(email.getEmail());
            }
        }
    }

    private final void initAlexaUrl(Intent intent) {
        String.valueOf(intent.getData());
        if (intent.getData() != null) {
            int i = 0;
            if (StringsKt__StringsJVMKt.startsWith$default(String.valueOf(intent.getData()), "https:", false, 2, (Object) null) || StringsKt__StringsJVMKt.startsWith$default(String.valueOf(intent.getData()), "connect:", false, 2, (Object) null)) {
                String valueOf = String.valueOf(intent.getData());
                int length = valueOf.length();
                int i2 = -1;
                if (StringsKt__StringsKt.contains$default((CharSequence) valueOf, (CharSequence) "&", false, 2, (Object) null)) {
                    int length2 = valueOf.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            length = -1;
                            break;
                        } else if (Intrinsics.areEqual((Object) String.valueOf(valueOf.charAt(i3)), (Object) "&")) {
                            length = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                int length3 = valueOf.length();
                while (true) {
                    if (i >= length3) {
                        break;
                    } else if (Intrinsics.areEqual((Object) String.valueOf(valueOf.charAt(i)), (Object) MAPCookie.COOKIE_NAME_VALUE_SEPERATOR)) {
                        i2 = i;
                        break;
                    } else {
                        i++;
                    }
                }
                String substring = valueOf.substring(i2 + 1, length);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
                if (methodChannel != null) {
                    methodChannel.mo46573c(GeneralMethodConstant.RETURN_ALEXA_AUTH_CODE, substring);
                }
            }
        }
    }

    private final boolean isAppBackground() {
        Object systemService = getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            Intrinsics.checkNotNullExpressionValue(runningAppProcesses, "processes");
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                boolean z = true;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
                    if (Intrinsics.areEqual((Object) runningAppProcessInfo.processName, (Object) getPackageName())) {
                        int i = runningAppProcessInfo.importance;
                        if (i == 100 || i == 200) {
                            z = false;
                        }
                    }
                }
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    private final boolean isAppInstalled(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(String.valueOf(str), 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private final boolean isLocServiceEnable(Context context) {
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled(EventBusConstKt.GPS) || locationManager.isProviderEnabled("network");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    private final void loginOut() {
        AccountViewModel accountViewModel2 = this.accountViewModel;
        AccountViewModel accountViewModel3 = null;
        if (accountViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel2 = null;
        }
        accountViewModel2.getSignOutLiveData().observe(this, new C7723o(this));
        AccountViewModel accountViewModel4 = this.accountViewModel;
        if (accountViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
        } else {
            accountViewModel3 = accountViewModel4;
        }
        accountViewModel3.signOut();
    }

    /* renamed from: loginOut$lambda-33  reason: not valid java name */
    public static final void m27227loginOut$lambda33(MainActivity mainActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, LanguageConstKt.f15954it);
        String j = C1502i.m930j(new ChannelResponse(new LoginOutModel(bool.booleanValue()), 0, 0, (String) null, 14, (DefaultConstructorMarker) null));
        AccountUtils.Companion.deleteAllUserInfoFromDatabase();
        AccountUtils.Companion.clearLoginInfo();
        AppConfig.Companion.setAccessToken("");
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(AccountMethodConstant.METHOD_LOGIN_OUT_CALLBACK, j);
        }
        ThirdLoginForGoogleUtils.Companion.signOut(mainActivity);
    }

    /* access modifiers changed from: private */
    public final void loginWithOneAccount() {
        AccountViewModel accountViewModel2;
        CheckUpgradeTool checkUpgradeTool = CheckUpgradeTool.INSTANCE;
        Application application = getApplication();
        if (application != null) {
            checkUpgradeTool.checkUpgrade((BaseApplication) application);
            AccountViewModel accountViewModel3 = null;
            if (LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll().isEmpty()) {
                AccountViewModel accountViewModel4 = this.accountViewModel;
                if (accountViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                } else {
                    accountViewModel3 = accountViewModel4;
                }
                accountViewModel3.updateLoadingStatus(false);
                Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
                a.withFlags(268468224);
                a.navigation();
                return;
            }
            LoginUserInfo loginUserInfo = (LoginUserInfo) CollectionsKt___CollectionsKt.last(LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll());
            String email = loginUserInfo.getEmail();
            String psw = loginUserInfo.getPsw();
            String refresh_token = loginUserInfo.getRefresh_token();
            String login_source = loginUserInfo.getLogin_source();
            this.thirdPlatformId = loginUserInfo.getThird_platform_id();
            this.userName = loginUserInfo.getLogin_name();
            this.firstName = loginUserInfo.getFirst_name();
            this.lastName = loginUserInfo.getLast_name();
            this.userIconBgColor = R.color.user_bg_1;
            this.photoUrl = loginUserInfo.getPhoto_url();
            if (NetUtils.Companion.getNETWORK_ENABLE()) {
                AccountViewModel accountViewModel5 = this.accountViewModel;
                if (accountViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel5 = null;
                }
                accountViewModel5.updateLoadingStatus(true);
                AccountViewModel accountViewModel6 = this.accountViewModel;
                if (accountViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel2 = null;
                } else {
                    accountViewModel2 = accountViewModel6;
                }
                accountViewModel2.refreshToken(refresh_token, email, psw, login_source, this.thirdPlatformId);
                AccountViewModel accountViewModel7 = this.accountViewModel;
                if (accountViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                } else {
                    accountViewModel3 = accountViewModel7;
                }
                accountViewModel3.getRefreshTokenLiveData().observe(this, new C7719k(this, login_source));
                return;
            }
            AccountViewModel accountViewModel8 = this.accountViewModel;
            if (accountViewModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            } else {
                accountViewModel3 = accountViewModel8;
            }
            accountViewModel3.updateLoadingStatus(false);
            String string = getString(R.string.network_lost);
            Intrinsics.checkNotNullExpressionValue(string, "getString(com.hisense.co…nt.R.string.network_lost)");
            showString(string);
            Postcard a2 = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
            a2.withFlags(268468224);
            a2.navigation();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.core.base.BaseApplication");
    }

    /* renamed from: loginWithOneAccount$lambda-40  reason: not valid java name */
    public static final void m27228loginWithOneAccount$lambda40(MainActivity mainActivity, String str, Pair pair) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "$loginSource");
        if (pair != null) {
            AccountViewModel accountViewModel2 = null;
            if (((Boolean) pair.getFirst()).booleanValue()) {
                AccountViewModel accountViewModel3 = mainActivity.accountViewModel;
                if (accountViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel3 = null;
                }
                accountViewModel3.getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
                AccountViewModel accountViewModel4 = mainActivity.accountViewModel;
                if (accountViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                } else {
                    accountViewModel2 = accountViewModel4;
                }
                accountViewModel2.getGetJHLUserRegisterProtocolLiveData().observe(mainActivity, new C7709a(mainActivity));
                return;
            }
            AccountViewModel accountViewModel5 = mainActivity.accountViewModel;
            if (accountViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            } else {
                accountViewModel2 = accountViewModel5;
            }
            accountViewModel2.updateLoadingStatus(false);
            if (Intrinsics.areEqual((Object) str, (Object) "0")) {
                Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
                a.withFlags(268468224);
                a.navigation();
                return;
            }
            mainActivity.gotoThirdLogin(mainActivity.thirdPlatformId);
        }
    }

    /* renamed from: loginWithOneAccount$lambda-40$lambda-39$lambda-37  reason: not valid java name */
    public static final void m27229loginWithOneAccount$lambda40$lambda39$lambda37(MainActivity mainActivity, Pair pair) {
        String str;
        Integer num;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        AccountViewModel accountViewModel2 = null;
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            AccountViewModel accountViewModel3 = mainActivity.accountViewModel;
            if (accountViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            } else {
                accountViewModel2 = accountViewModel3;
            }
            accountViewModel2.updateLoadingStatus(false);
            String string = mainActivity.getString(R.string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(com.hisense.co…g.no_internet_connection)");
            mainActivity.showString(string);
        } else if (pair == null) {
            AccountViewModel accountViewModel4 = mainActivity.accountViewModel;
            if (accountViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            } else {
                accountViewModel2 = accountViewModel4;
            }
            accountViewModel2.updateLoadingStatus(false);
        } else {
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData = (JHLAgreementData) pair.getSecond();
            companion.mo39138e(Intrinsics.stringPlus("jhl tosVer: ", jHLAgreementData == null ? null : jHLAgreementData.getTosVersion()));
            LogUtilsShen.Companion companion2 = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData2 = (JHLAgreementData) pair.getSecond();
            companion2.mo39138e(Intrinsics.stringPlus("jhl ppVer: ", jHLAgreementData2 == null ? null : jHLAgreementData2.getPpVersion()));
            SPUtils sPUtils = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData3 = (JHLAgreementData) pair.getSecond();
            String str2 = "";
            if (jHLAgreementData3 == null || (str = jHLAgreementData3.getTosVersion()) == null) {
                str = str2;
            }
            sPUtils.put(KeyConst.KEY_JHL_TOSVER, str);
            SPUtils sPUtils2 = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData4 = (JHLAgreementData) pair.getSecond();
            if (!(jHLAgreementData4 == null || (ppVersion = jHLAgreementData4.getPpVersion()) == null)) {
                str2 = ppVersion;
            }
            sPUtils2.put(KeyConst.KEY_JHL_PPVER, str2);
            JHLAgreementData jHLAgreementData5 = (JHLAgreementData) pair.getSecond();
            mainActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            mainActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                num = (jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null) ? null : Integer.valueOf(Integer.parseInt(updateCount));
            }
            mainActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                AccountViewModel accountViewModel5 = mainActivity.accountViewModel;
                if (accountViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                } else {
                    accountViewModel2 = accountViewModel5;
                }
                accountViewModel2.updateLoadingStatus(false);
                Paths.Jump.INSTANCE.jumpToMain(mainActivity);
                return;
            }
            AccountViewModel accountViewModel6 = mainActivity.accountViewModel;
            if (accountViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            } else {
                accountViewModel2 = accountViewModel6;
            }
            accountViewModel2.updateLoadingStatus(false);
            String string2 = mainActivity.getString(R.string.register_privacy_policy_terms_conditions);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(com.hisense.co…_policy_terms_conditions)");
            String str3 = mainActivity.termsConditionsUrl;
            gotoAgreementWebViewActivity$default(mainActivity, string2, str3, str3, mainActivity.connetlifePrivacyPolicyUrl, EventBusConstKt.AUTO_LOGIN, (String) null, (String) null, 96, (Object) null);
        }
    }

    private final void openAlexaAppToAppUrl(String str) {
        AmazonAuthorizationBean amazonAuthorizationBean = (AmazonAuthorizationBean) C1502i.m924d(str, AmazonAuthorizationBean.class);
        if (amazonAuthorizationBean != null) {
            if (amazonAuthorizationBean.getType() == 0) {
                Context baseContext = getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                Intent alexaStartIntent = AlexaAppUtil.getAlexaStartIntent(baseContext, amazonAuthorizationBean.getAppUrl());
                if (alexaStartIntent == null) {
                    alexaStartIntent = getAppToAppIntent(amazonAuthorizationBean.getLwaUrl());
                }
                startActivity(alexaStartIntent);
                return;
            }
            Context baseContext2 = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
            Intent alexaStartIntent2 = AlexaAppUtil.getAlexaStartIntent(baseContext2, amazonAuthorizationBean.getUnLinkAppUrl());
            if (alexaStartIntent2 == null) {
                alexaStartIntent2 = getAppToAppIntent(amazonAuthorizationBean.getUnLinkLwaUrl());
            }
            startActivity(alexaStartIntent2);
        }
    }

    private final void openQRPage(String str) {
    }

    private final void refreshOverPushPage() {
        "registerFireBase call back, alexaCode: " + this.alexaCode + ' ';
        if (this.alexaCode.length() > 0) {
            C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel != null) {
                methodChannel.mo46573c(GeneralMethodConstant.RETURN_ALEXA_AUTH_CODE, this.alexaCode);
            }
            this.alexaCode = "";
        }
    }

    private final void registerFireBase() {
        FireBaseViewModel fireBaseViewModel2 = this.fireBaseViewModel;
        if (fireBaseViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fireBaseViewModel");
            fireBaseViewModel2 = null;
        }
        fireBaseViewModel2.subscribeFireBase();
    }

    private final void sendToast(C9016i iVar) {
        EventBus.getDefault().post(new ToastMsg(iVar.f17688b.toString()));
    }

    private final void setHasLogin(Intent intent) {
        String stringExtra = intent.getStringExtra("loginSuccessCallback");
        if (stringExtra != null) {
            if (stringExtra.length() > 0) {
                this.hasLoginSuccess = true;
            }
        }
    }

    private final void showString(String str) {
        ToastUtils o = ToastUtils.m9596o();
        o.mo21601s("dark");
        o.mo21603w(str, new Object[0]);
    }

    private final void startConfigNet(String str) {
        Intrinsics.stringPlus("start config net, cmd ", str);
        if (str != null) {
            new Timer().schedule(new MainActivity$startConfigNet$$inlined$schedule$1(this, str), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            Object d = C1502i.m924d(str, ConfigParsCom.class);
            Intrinsics.checkNotNullExpressionValue(d, "fromJson(cmd, ConfigParsCom::class.java)");
            ConfigParsCom configParsCom = (ConfigParsCom) d;
            ConfigViewModel configViewModel2 = this.configViewModel;
            if (configViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
                configViewModel2 = null;
            }
            configViewModel2.cfgPars(configParsCom, this.mConfigMac);
        }
    }

    private final void startGetNetStatus(String str) {
        if (str != null) {
            new Timer().schedule(new MainActivity$startGetNetStatus$$inlined$schedule$1(this, str), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            Object d = C1502i.m924d(str, ConfigParsCom.class);
            Intrinsics.checkNotNullExpressionValue(d, "fromJson(cmd, ConfigParsCom::class.java)");
            ConfigParsCom configParsCom = (ConfigParsCom) d;
            ConfigViewModel configViewModel2 = this.configViewModel;
            if (configViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
                configViewModel2 = null;
            }
            configViewModel2.getNetStatus(configParsCom);
        }
    }

    private final void subscribeFireBase() {
        FireBaseViewModel fireBaseViewModel2 = this.fireBaseViewModel;
        ConfigViewModel configViewModel2 = null;
        if (fireBaseViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fireBaseViewModel");
            fireBaseViewModel2 = null;
        }
        fireBaseViewModel2.getSubscribeLiveData().observe(this, C7720l.f14492a);
        ConfigViewModel configViewModel3 = this.configViewModel;
        if (configViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
            configViewModel3 = null;
        }
        configViewModel3.getCfgParsLiveData().observe(this, C7724p.f14498a);
        ConfigViewModel configViewModel4 = this.configViewModel;
        if (configViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
            configViewModel4 = null;
        }
        configViewModel4.getMacLiveData().observe(this, new C7711c(this));
        ConfigViewModel configViewModel5 = this.configViewModel;
        if (configViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configViewModel");
        } else {
            configViewModel2 = configViewModel5;
        }
        configViewModel2.getNetStatusLiveData().observe(this, new C7725q(this));
    }

    /* renamed from: subscribeFireBase$lambda-27  reason: not valid java name */
    public static final void m27230subscribeFireBase$lambda27(String str) {
        C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.REGISTER_DEVICE_TOKEN_CALLBACK, str);
        }
    }

    /* renamed from: subscribeFireBase$lambda-28  reason: not valid java name */
    public static final void m27231subscribeFireBase$lambda28(ConfigParsCom configParsCom) {
        if (configParsCom != null) {
            Intrinsics.stringPlus("下发设备配置信息响应：成功", configParsCom);
            C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel != null) {
                methodChannel.mo46573c(GeneralMethodConstant.START_CONFIG_CALLBACK, "success");
                return;
            }
            return;
        }
        C9017j methodChannel2 = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel2 != null) {
            methodChannel2.mo46573c(GeneralMethodConstant.START_CONFIG_CALLBACK, "fail");
        }
        Intrinsics.stringPlus("下发设备配置信息响应：失败", configParsCom);
    }

    /* renamed from: subscribeFireBase$lambda-29  reason: not valid java name */
    public static final void m27232subscribeFireBase$lambda29(MainActivity mainActivity, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        try {
            mainActivity.mConfigMac = (String) configParsCom.getCmdArr().get(1).get(4);
            C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel != null) {
                methodChannel.mo46573c(GeneralMethodConstant.DEV_GET_MAC_CALLBACK, "success");
            }
        } catch (Throwable unused) {
            C9017j methodChannel2 = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel2 != null) {
                methodChannel2.mo46573c(GeneralMethodConstant.DEV_GET_MAC_CALLBACK, "fail");
            }
        }
    }

    /* renamed from: subscribeFireBase$lambda-30  reason: not valid java name */
    public static final void m27233subscribeFireBase$lambda30(MainActivity mainActivity, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        try {
            Intrinsics.stringPlus("获取设备状态响应：", configParsCom);
            String str = (String) configParsCom.getCmdArr().get(0).get(5);
            C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel != null) {
                methodChannel.mo46573c(GeneralMethodConstant.DEV_GET_NET_STATUS_CALLBACK, str);
            }
        } catch (Throwable unused) {
            String wifiName = WifiNameUtils.Companion.wifiName(mainActivity);
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String upperCase = wifiName.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "HIS-", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CONNECTLIFE", false, 2, (Object) null)) {
                C9017j methodChannel2 = GeneralChannel.Companion.getMethodChannel();
                if (methodChannel2 != null) {
                    methodChannel2.mo46573c(GeneralMethodConstant.DEV_GET_NET_STATUS_CALLBACK, "-1");
                }
                mainActivity.writeLog("配网", "异常：wifi未断开，调用-flutter-1");
                return;
            }
            C9017j methodChannel3 = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel3 != null) {
                methodChannel3.mo46573c(GeneralMethodConstant.DEV_GET_NET_STATUS_CALLBACK, "-2");
            }
            mainActivity.writeLog("配网", "异常：wifi已经断开，调用-flutter-2");
        }
    }

    private final void subscribeMsgObservable() {
        if (this.messageReceivedListener == null && SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH)) {
            Application application = getApplication();
            if (application != null) {
                this.messageReceivedListener = new MainActivity$subscribeMsgObservable$1((MainApplication) application, this);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connect_life.application.MainApplication");
            }
        }
        if (this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.subscribe(messageReceivedListener2);
        }
    }

    private final void thirdLoginByAccount(GoogleSignInAccount googleSignInAccount) {
        String jhkSerial;
        Intrinsics.stringPlus("firebaseAuthWithGoogle:", googleSignInAccount.mo24423U());
        String U = googleSignInAccount.mo24423U();
        if (!(U == null || U.length() == 0)) {
            ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
            if (thirdAccountViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                thirdAccountViewModel = null;
            }
            String string = getString(R.string.server_client_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(com.hisense.co….string.server_client_id)");
            String U2 = googleSignInAccount.mo24423U();
            Intrinsics.checkNotNull(U2);
            Intrinsics.checkNotNullExpressionValue(U2, "account.idToken!!");
            HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
            String str = "";
            if (!(hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null)) {
                str = jhkSerial;
            }
            thirdAccountViewModel.thirdSignIn(ThirdLoginForGoogleUtils.thirdType, string, U2, str);
        }
    }

    private final void unsubscribeFireBase() {
        FireBaseViewModel fireBaseViewModel2 = this.fireBaseViewModel;
        if (fireBaseViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fireBaseViewModel");
            fireBaseViewModel2 = null;
        }
        fireBaseViewModel2.unsubscribeFireBase();
    }

    private final void updateUserProfile() {
        AccountViewModel accountViewModel2 = this.accountViewModel;
        if (accountViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel2 = null;
        }
        accountViewModel2.getUserProfile(MainActivity$updateUserProfile$1.INSTANCE, MainActivity$updateUserProfile$2.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void writeLog(String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            this.writeLog = str2;
            LogFileUtils.Companion.get().upLog(str, Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), this.writeLog);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void GoNotificationBack(@NotNull NotificationBack notificationBack) {
        Intrinsics.checkNotNullParameter(notificationBack, "notificationBack");
        C9017j methodChannel = NotificationChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.LEAVE_NOTIFICATION_CENTER, "");
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

    public void configureFlutterEngine(@NotNull @NonNull C8916a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "flutterEngine");
        super.configureFlutterEngine(aVar);
        AccountChannel.Companion.setMethodChannel(new C9017j(aVar.mo46371h().mo46437h(), AccountMethodConstant.juAccountMethod));
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46575e(new C7717i(this));
        }
        NotificationChannel.Companion.setMethodChannel(new C9017j(aVar.mo46371h().mo46437h(), AccountMethodConstant.juNotificationMethod));
        C9017j methodChannel2 = AccountChannel.Companion.getMethodChannel();
        if (methodChannel2 != null) {
            methodChannel2.mo46575e(new C7718j(this));
        }
        MessageChannel instance = MessageChannel.Companion.getInstance();
        C9003c h = aVar.mo46371h().mo46437h();
        Intrinsics.checkNotNullExpressionValue(h, "flutterEngine.dartExecutor.binaryMessenger");
        instance.initChannel(h);
        GeneralChannel.Companion.setMethodChannel(new C9017j(aVar.mo46371h().mo46437h(), GeneralMethodConstant.juGeneralMethodChannel));
        C9017j methodChannel3 = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel3 != null) {
            methodChannel3.mo46575e(new C7716h(this));
        }
        DeviceInfoChannel.Companion.setMethodChannel(new C9017j(aVar.mo46371h().mo46437h(), GeneralMethodConstant.juGeneralMethodChannel_1));
        C9017j methodChannel4 = DeviceInfoChannel.Companion.getMethodChannel();
        if (methodChannel4 != null) {
            methodChannel4.mo46575e(new C7715g(this));
        }
        PingChannel.Companion.setMethodChannel(new C9017j(aVar.mo46371h().mo46437h(), GeneralMethodConstant.juGeneralMethodChannel_PING));
        C9017j methodChannel5 = PingChannel.Companion.getMethodChannel();
        if (methodChannel5 != null) {
            methodChannel5.mo46575e(new C7714f(this));
        }
    }

    public final void getMessage(@NotNull AlarmMessageBeen alarmMessageBeen) {
        Intrinsics.checkNotNullParameter(alarmMessageBeen, NotificationCompat.CATEGORY_CALL);
        if (!alarmMessageBeen.getHasMore()) {
            EventBus.getDefault().post(Integer.valueOf(EventBusConstKt.NOT_MORE));
        }
        List<AlarmMessage> data = alarmMessageBeen.getData();
        Collections.reverse(data);
        for (AlarmMessage alarmMessage : data) {
            NotificationRoom.Companion.notificationProvider().insert(new Notification(0, SPManagerKt.getCustomerId(), alarmMessage.getMsgTitle(), alarmMessage.getFormatId(), alarmMessage.getWarning(), alarmMessage.getDeviceId(), alarmMessage.getMsgLevel(), KeyConst.MSG_ADD_WINE, alarmMessage.getStartTime(), false, alarmMessage.getStartTime(), alarmMessage.getExpireTime(), alarmMessage.getMsgId(), "Bottles added", 0, 16384, (DefaultConstructorMarker) null));
        }
        EventBus.getDefault().post(new GetMessage());
    }

    public final boolean getNotificationPermissionNeverGranted() {
        return this.notificationPermissionNeverGranted;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void getUserMessage(@NotNull GetUserMessage getUserMessage) {
        Intrinsics.checkNotNullParameter(getUserMessage, "getUserMessage");
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, getUserMessage.getWifiId()), TuplesKt.m25743to("deviceId", getUserMessage.getDeviceId()));
        C9017j methodChannel = NotificationChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46574d(GeneralMethodConstant.GET_UNREAD_NOTIFICATION_MESSAGE_COUNT, mapOf, new MainActivity$getUserMessage$1());
        }
    }

    @Nullable
    public final WifiManager getWifiManager() {
        return this.wifiManager;
    }

    public final void logSuccess() {
        this.hasLoginSuccess = false;
        String j = C1502i.m930j(new ChannelResponse(AccountUtils.Companion.getUserInfo(), 0, 0, (String) null, 14, (DefaultConstructorMarker) null));
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c("loginSuccessCallback", j);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.m9805e("requestCode:" + i + " + resultCode:" + i2);
        if (i == this.OPEN_WIFI_SET) {
            C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
            if (methodChannel != null) {
                methodChannel.mo46573c(GeneralMethodConstant.METHOD_SET_WIFI_CALLBACK, "");
            }
        } else if (i == this.CODE_WRITE_MANAGER_TYP) {
            getManagerType(this.mTypeResult);
        } else if (i == 9001) {
            try {
                GoogleSignInAccount n = C3253a.m8297c(intent).mo28853n(ApiException.class);
                Intrinsics.checkNotNull(n);
                thirdLoginByAccount(n);
            } catch (ApiException e) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7) {
                    showString((int) R.string.network_lost);
                } else if (statusCode != 10) {
                    showString((int) R.string.error);
                } else {
                    showString((int) R.string.invalid_account);
                }
                Intrinsics.stringPlus("Google sign in failed:", Integer.valueOf(e.getStatusCode()));
                Intrinsics.stringPlus("Google sign in failed:", e.getStatus());
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.stringPlus("onCreate data: ", intent == null ? null : intent.getData());
        ThirdLoginForGoogleUtils.Companion.initGoogleLogin(this);
        this.thirdLoginModel = new ThirdAccountViewModel();
        this.accountViewModel = new AccountViewModel();
        this.fireBaseViewModel = new FireBaseViewModel();
        avoidHomeReload();
        this.tags = new ArrayList<>();
        EventBus.getDefault().register(this);
        this.configViewModel = new ConfigViewModel();
        importOldUserEmails();
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
        setHasLogin(intent2);
        subscribeMsgObservable();
        subscribeFireBase();
        writeLog("首页", "进入MainActivity");
        Object systemService = getApplicationContext().getSystemService("wifi");
        if (systemService != null) {
            this.wifiManager = (WifiManager) systemService;
            addNetMonitor();
            if (this.mFirebaseAnalytics == null) {
                this.mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
            }
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            getAlexaData(intent3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.timer = null;
        NetWorkMonitorManager instance = NetWorkMonitorManager.Companion.getInstance();
        if (instance != null) {
            instance.onDestroy();
        }
        MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
        if (messageReceivedListener2 != null) {
            MessageObserver.Companion.getInstance().unsubscribe(messageReceivedListener2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMessage(@NotNull String str) {
        C9017j methodChannel;
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_EVENT);
        switch (str.hashCode()) {
            case -1694626987:
                if (str.equals(KeyConst.REFRESH_TOKEN) && (methodChannel = AccountChannel.Companion.getMethodChannel()) != null) {
                    methodChannel.mo46573c(AccountMethodConstant.REFRESH_ACCESS_TOKEN, AppConfig.Companion.getAccessToken());
                    return;
                }
                return;
            case -1600259393:
                if (str.equals("loginSuccessCallback")) {
                    logSuccess();
                    return;
                }
                return;
            case -1315419101:
                if (str.equals(KeyConst.Exit_App)) {
                    finish();
                    return;
                }
                return;
            case -583129630:
                if (str.equals(KeyConst.DeleteAccount)) {
                    AccountUtils.Companion.deleteAllUserInfoFromDatabase();
                    AccountUtils.Companion.clearLoginInfo();
                    AppConfig.Companion.setAccessToken("");
                    C9017j methodChannel2 = AccountChannel.Companion.getMethodChannel();
                    if (methodChannel2 != null) {
                        methodChannel2.mo46573c(AccountMethodConstant.METHOD_DELETE_ACCOUNT, "");
                        return;
                    }
                    return;
                }
                return;
            case 1068600632:
                if (str.equals(KeyConst.LOGIN_OUT)) {
                    String j = C1502i.m930j(new ChannelResponse(new LoginOutModel(true), 0, 0, (String) null, 14, (DefaultConstructorMarker) null));
                    C9017j methodChannel3 = AccountChannel.Companion.getMethodChannel();
                    if (methodChannel3 != null) {
                        methodChannel3.mo46573c(AccountMethodConstant.METHOD_LOGIN_OUT_CALLBACK, j);
                        return;
                    }
                    return;
                }
                return;
            case 1381405242:
                if (str.equals("updateUserProfileCallback")) {
                    updateUserProfile();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onGoNotification(@NotNull GoNotification goNotification) {
        Intrinsics.checkNotNullParameter(goNotification, "zoneWineBindEvent");
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, goNotification.getWifiId()), TuplesKt.m25743to("deviceId", goNotification.getDeviceId()), TuplesKt.m25743to("refresh", goNotification.getRefresh()));
        C9017j methodChannel = NotificationChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46574d(GeneralMethodConstant.GET_NOTIFICATION_MESSAGE, mapOf, new MainActivity$onGoNotification$1(this));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(@NotNull LoginEvent loginEvent) {
        Intrinsics.checkNotNullParameter(loginEvent, NotificationCompat.CATEGORY_EVENT);
        if (loginEvent.isLogin()) {
            gotoLogin();
        }
    }

    public void onNewIntent(@NotNull Intent intent) {
        Unit unit;
        C9017j methodChannel;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (this.mFirebaseAnalytics == null) {
            this.mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        }
        Intrinsics.stringPlus("onNewIntent data: ", intent.getData());
        if (intent.getStringExtra("loginSuccessCallback") == null) {
            unit = null;
        } else {
            logSuccess();
            unit = Unit.INSTANCE;
        }
        if (unit == null && TextUtils.isEmpty(AppConfig.Companion.getAccessToken())) {
            gotoLogin();
        }
        getAlexaData(intent);
        initAlexaUrl(intent);
        if (intent.hasExtra(AppConfig.NOTIFY_MSG_CONTENT) && (methodChannel = AccountChannel.Companion.getMethodChannel()) != null) {
            methodChannel.mo46573c(GeneralMethodConstant.CLICK_NOTIFY_OPEN_PAGE, intent.getStringExtra(AppConfig.NOTIFY_MSG_CONTENT));
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.METHOD_SET_WIFI_CALLBACK, "");
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            if (timer2 != null) {
                timer2.cancel();
            }
            this.timer = null;
        }
        Timer timer3 = new Timer();
        this.timer = timer3;
        if (timer3 != null) {
            timer3.scheduleAtFixedRate(new MainActivity$onResume$1(), 5000, 30000);
        }
        if ((AppConfig.Companion.getAccessToken().length() > 0) && !C7585u.m21555d(this, "android.permission.POST_NOTIFICATIONS") && !this.notificationPermissionNeverGranted) {
            C7585u l = C7585u.m21560l(this);
            l.mo33042g("android.permission.POST_NOTIFICATIONS");
            l.mo33043h(new MainActivity$onResume$2(this));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onUserProfileEvent(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        String j = C1502i.m930j(new ChannelResponse(userProfile, 0, 0, (String) null, 14, (DefaultConstructorMarker) null));
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c("updateUserProfileCallback", j);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onWineBind(@NotNull ZoneWineBindEvent zoneWineBindEvent) {
        Intrinsics.checkNotNullParameter(zoneWineBindEvent, "zoneWineBindEvent");
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to("devNickName", zoneWineBindEvent.getNickName()), TuplesKt.m25743to(EventBusConstKt.WIFIID, zoneWineBindEvent.getWifiId()), TuplesKt.m25743to("deviceId", zoneWineBindEvent.getDeviceId()));
        C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.WINE_SETUP_CALLBACK, mapOf);
        }
    }

    @NotNull
    public C8914g provideSplashScreen() {
        return new ConnectLifeSplashScreen();
    }

    public final void setNotificationPermissionNeverGranted(boolean z) {
        this.notificationPermissionNeverGranted = z;
    }

    public final void setWifiManager(@Nullable WifiManager wifiManager2) {
        this.wifiManager = wifiManager2;
    }

    @Subscribe
    public final void unRegisterNetwork(@NotNull EventUnregisterNetwork eventUnregisterNetwork) {
        Intrinsics.checkNotNullParameter(eventUnregisterNetwork, NotificationCompat.CATEGORY_EVENT);
        WifiNewUtils.Companion.getInstance().unRegisterNetwork();
    }

    public final void showString(@StringRes int i) {
        MultiLanguageUtil.INSTANCE.getConfigLocale();
        ToastUtils o = ToastUtils.m9596o();
        o.mo21601s("dark");
        o.mo21603w(getString(i), new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onGoNotification(@NotNull DeleteNotification deleteNotification) {
        Intrinsics.checkNotNullParameter(deleteNotification, "zoneWineBindEvent");
        ArrayList<String> msgId = deleteNotification.getMsgId();
        C9017j methodChannel = NotificationChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46574d(GeneralMethodConstant.DELETE_NOTIFICATION_MESSAGE, msgId, new MainActivity$onGoNotification$2());
        }
    }
}
