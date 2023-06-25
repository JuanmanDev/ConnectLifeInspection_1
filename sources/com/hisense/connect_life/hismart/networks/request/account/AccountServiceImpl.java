package com.hisense.connect_life.hismart.networks.request.account;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.CheckPassResponse;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import com.hisense.connect_life.hismart.model.CheckUpgradeResponse;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.model.JuUserAgreement;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.parameters.RsaPasswordUtils;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.account.model.JuUserProfile;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.JHKUserAgreementBean;
import com.hisense.connect_life.hismart.networks.request.device.model.JhlRegisterResult;
import com.hisense.connect_life.hismart.networks.request.device.model.RegisterInfo;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import com.hmct.cloud.sdk.bean.account.SignonReplyInfo;
import com.juconnect.vivino.global.UrlConstKt;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7289a;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7290a0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7291a1;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7292b;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7293b0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7294b1;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7295c;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7296c0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7297d;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7298d0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7299e;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7300e0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7301f;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7302f0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7303g;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7304g0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7305h;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7306h0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7307i;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7308i0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7309j;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7310j0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7311k;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7312k0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7313l;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7314l0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7315m;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7316m0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7317n;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7318n0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7319o;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7320o0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7321p;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7322p0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7323q;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7324q0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7325r;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7326r0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7327s;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7328s0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7329t;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7330t0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7331u;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7332u0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7333v;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7334v0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7335w;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7336w0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7337x;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7338x0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7339y;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7340y0;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7341z;
import p040c.p429r.p430a.p439c.p440a.p441a.p442a.C7342z0;
import p040c.p474u.p475a.p476a.p477a.C7587a;
import p040c.p474u.p475a.p476a.p478b.C7588a;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7683c;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J/\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JW\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002010'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J7\u00102\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J'\u00103\u001a\u00020\u001b2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J?\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002090'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J?\u0010:\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u0002072\u0006\u0010;\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JT\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002070@\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J@\u0010A\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J8\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J\u0014\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040GH\u0002J\u0014\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040GH\u0002J'\u0010I\u001a\u00020!2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J7\u0010K\u001a\u00020!2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JB\u0010M\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016JB\u0010O\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J2\u0010P\u001a\u00020\u001b2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J\u0010\u0010Q\u001a\u00020!2\u0006\u0010R\u001a\u00020\u0004H\u0002JQ\u0010S\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J/\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J?\u0010U\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JO\u0010W\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JG\u0010Z\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J?\u0010\\\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JH\u0010^\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020\u00042\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J?\u0010c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JF\u0010f\u001a\u00020!2\u0006\u0010g\u001a\u00020\u00042&\u0010h\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040ij\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004`j2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020l0'H\u0002J_\u0010m\u001a\u00020\u001b2\u0006\u0010n\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JO\u0010q\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u00042\u0006\u0010n\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J7\u0010r\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J?\u0010t\u001a\u00020!2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u00042\u0006\u0010v\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016JH\u0010w\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u00042\u0006\u0010y\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016J8\u0010z\u001a\u00020\u001b2\u0006\u0010{\u001a\u00020|2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016JP\u0010}\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u00042\u0006\u0010\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0'\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b)H\u0016J9\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/AccountServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/account/IAccountService;", "()V", "TAG", "", "branchHis", "errorCodeKey", "errorDescKey", "gson", "Lcom/google/gson/Gson;", "jhkAppVersion", "juAccountApi", "Lcom/hisense/connect_life/hismart/networks/request/account/JuAccountApi;", "kotlin.jvm.PlatformType", "key_accessToken", "key_brandCode", "key_devSerial", "key_isoLanguageCode", "key_randStr", "key_sourceType", "key_timeStamp", "key_version", "resultCodeKey", "value_randStr", "value_timeStamp", "value_version", "addUserProfile", "Lio/reactivex/disposables/Disposable;", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "success", "Lkotlin/Function1;", "", "", "failure", "", "anonymousLogin", "sourceId", "hiSmartCallback", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "Lkotlin/ExtensionFunctionType;", "checkAuthCode", "loginName", "authCode", "delFlag", "devSerial", "authCodeType", "token", "Lcom/hisense/connect_life/hismart/networks/request/device/model/JhlRegisterResult;", "checkLoginNameSign", "checkPass", "checkUpgrade", "languageId", "versionCode", "", "appId", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeResponse;", "checkUpgradeByPackage", "packageName", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "deleteAccount", "password", "accessToken", "Lkotlin/Pair;", "deleteUserData", "customerId", "downloadFileWithDynamicUrlSync", "fileUrl", "Lokhttp3/ResponseBody;", "generateJhkSystemParam", "", "generateParamWithDevSerial", "getJHKRegisterProtocol", "Lcom/hisense/connect_life/hismart/networks/request/device/model/JHKUserAgreementBean;", "getJHKUserRegisterProtocol", "requestType", "getJHLProtocolInfo", "Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "getJHLUserProtocolInfo", "getUserProfile", "log", "msg", "login", "logout", "refreshToken", "deviceId", "register", "mailbox", "Lcom/hisense/connect_life/hismart/networks/request/device/model/RegisterInfo;", "resetPassword", "newPassword", "resetPasswordByOldPsw", "oldPassword", "saveLoginLog", "userId", "loginTime", "", "phoneModel", "sendVerificationCode", "email", "codeType", "setLoginCommonInfo", "url", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callback", "Lcom/hmct/cloud/sdk/bean/account/SignonReplyInfo;", "thirdRegister", "thirdClientId", "thirdType", "idToken", "thirdSignIn", "thirdUnBind", "Lcom/hisense/connect_life/hismart/model/JuResponse;", "updateJHKUserRegisterProtocol", "tosVer", "ppVer", "updateJHLUserRegisterProtocol", "ppVersion", "tosVersion", "updateProfilePhoto", "file", "Ljava/io/File;", "updateUserEmail", "oldAuthCode", "newAuthCode", "newEmail", "updateUserProfile", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountServiceImpl.kt */
public final class AccountServiceImpl implements IAccountService {
    @NotNull
    public final String TAG = LogUtilsShen.TAG_SHEN;
    @NotNull
    public final String branchHis;
    @NotNull
    public final String errorCodeKey;
    @NotNull
    public final String errorDescKey;
    @NotNull
    public final Gson gson = new Gson();
    @NotNull
    public final String jhkAppVersion = "1.0";
    public final JuAccountApi juAccountApi;
    @NotNull
    public final String key_accessToken = "accessToken";
    @NotNull
    public final String key_brandCode = "brandCode";
    @NotNull
    public final String key_devSerial = "devSerial";
    @NotNull
    public final String key_isoLanguageCode = "isoLanguageCode";
    @NotNull
    public final String key_randStr = "randStr";
    @NotNull
    public final String key_sourceType = "sourceType";
    @NotNull
    public final String key_timeStamp = "timeStamp";
    @NotNull
    public final String key_version = "version";
    @NotNull
    public final String resultCodeKey;
    @NotNull
    public final String value_randStr;
    @NotNull
    public final String value_timeStamp = String.valueOf(System.currentTimeMillis() / ((long) 1000));
    @NotNull
    public final String value_version = this.jhkAppVersion;

    public AccountServiceImpl() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.value_randStr = StringsKt__StringsJVMKt.replace$default(uuid, AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null);
        this.branchHis = "gcl";
        this.resultCodeKey = "resultCode";
        this.errorCodeKey = "errorCode";
        this.errorDescKey = "errorDesc";
        this.juAccountApi = (JuAccountApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.ACCOUNT)).mo51323b(JuAccountApi.class);
    }

    /* renamed from: addUserProfile$lambda-22  reason: not valid java name */
    public static final void m26927addUserProfile$lambda22(Function1 function1, AccountServiceImpl accountServiceImpl, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        if (juCustomResult != null) {
            function1.invoke(Boolean.valueOf(((JuResponse) juCustomResult.getResponse()).getResultCode() == 0));
        } else {
            function1.invoke(Boolean.FALSE);
        }
        accountServiceImpl.log(Intrinsics.stringPlus("addUserProfile success: ", juCustomResult));
    }

    /* renamed from: addUserProfile$lambda-23  reason: not valid java name */
    public static final void m26928addUserProfile$lambda23(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("addUserProfile failure: ", th));
    }

    /* renamed from: checkAuthCode$lambda-10  reason: not valid java name */
    public static final void m26929checkAuthCode$lambda10(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        int i;
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("checkEmailAuthCode success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i2 = -1;
                if (juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null) {
                    i = -1;
                } else {
                    i = juResponse3.getResultCode();
                }
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(new JhlRegisterResult(((JuResponse) juCustomResult.getResponse()).getResultCode(), ((JuResponse) juCustomResult.getResponse()).getErrorCode(), ((JuResponse) juCustomResult.getResponse()).getDesc()));
        }
    }

    /* renamed from: checkAuthCode$lambda-11  reason: not valid java name */
    public static final void m26930checkAuthCode$lambda11(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("checkEmailAuthCode fail: ", th));
    }

    /* renamed from: checkLoginNameSign$lambda-34  reason: not valid java name */
    public static final void m26931checkLoginNameSign$lambda34(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        int i;
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("checkLoginNameSign success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i2 = -1;
                if (juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null) {
                    i = -1;
                } else {
                    i = juResponse3.getResultCode();
                }
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(String.valueOf(((JuResponse) juCustomResult.getResponse()).getResultCode()));
        }
    }

    /* renamed from: checkLoginNameSign$lambda-35  reason: not valid java name */
    public static final void m26932checkLoginNameSign$lambda35(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, -1, "The resultBean is null"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("checkLoginNameSign fail: ", th));
    }

    /* renamed from: checkPass$lambda-53  reason: not valid java name */
    public static final void m26933checkPass$lambda53(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("checkPass success: ", juCustomResult));
        if (juCustomResult == null || ((CheckPassResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                onFailure$hismart_account_release.invoke(new FailureBean(-1, -1, ""));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            int isHavePass = ((CheckPassResponse) juCustomResult.getResponse()).isHavePass();
            boolean z = true;
            if (isHavePass != 1) {
                z = false;
            }
            onSuccess$hismart_account_release.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: checkPass$lambda-54  reason: not valid java name */
    public static final void m26934checkPass$lambda54(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, "NetWork anomaly!"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("checkPass fail: ", th));
    }

    /* renamed from: checkUpgrade$lambda-55  reason: not valid java name */
    public static final void m26935checkUpgrade$lambda55(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("checkUpgrade success: ", juCustomResult));
        if (juCustomResult == null || ((CheckUpgradeResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                onFailure$hismart_account_release.invoke(new FailureBean(-1, -1, ""));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: checkUpgrade$lambda-56  reason: not valid java name */
    public static final void m26936checkUpgrade$lambda56(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, "NetWork anomaly!"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("checkUpgrade fail: ", th));
    }

    /* renamed from: checkUpgradeByPackage$lambda-57  reason: not valid java name */
    public static final void m26937checkUpgradeByPackage$lambda57(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("checkUpgrade success: ", juCustomResult));
        if (juCustomResult == null || ((CheckUpgradeByPackageResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                onFailure$hismart_account_release.invoke(new FailureBean(-1, -1, ""));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: checkUpgradeByPackage$lambda-58  reason: not valid java name */
    public static final void m26938checkUpgradeByPackage$lambda58(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, "NetWork abNormal!"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("checkUpgrade fail: ", th));
    }

    /* renamed from: deleteAccount$lambda-32  reason: not valid java name */
    public static final void m26939deleteAccount$lambda32(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("deleteAccount success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Boolean bool = Boolean.FALSE;
            int i = -1;
            if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null)) {
                i = juResponse.getErrorCode();
            }
            function1.invoke(new Pair(bool, Integer.valueOf(i)));
            return;
        }
        function1.invoke(new Pair(Boolean.TRUE, 0));
    }

    /* renamed from: deleteAccount$lambda-33  reason: not valid java name */
    public static final void m26940deleteAccount$lambda33(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("deleteAccount fail: ", th));
    }

    /* renamed from: deleteUserData$lambda-47  reason: not valid java name */
    public static final void m26941deleteUserData$lambda47(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("deleteUserData success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: deleteUserData$lambda-48  reason: not valid java name */
    public static final void m26942deleteUserData$lambda48(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("deleteUserData fail: ", th));
    }

    /* renamed from: downloadFileWithDynamicUrlSync$lambda-45  reason: not valid java name */
    public static final void m26943downloadFileWithDynamicUrlSync$lambda45(Function1 function1, ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullExpressionValue(responseBody, LanguageConstKt.f15954it);
        function1.invoke(responseBody);
    }

    /* renamed from: downloadFileWithDynamicUrlSync$lambda-46  reason: not valid java name */
    public static final void m26944downloadFileWithDynamicUrlSync$lambda46(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    private final Map<String, String> generateJhkSystemParam() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return MapsKt__MapsKt.hashMapOf(TuplesKt.m25743to("accessToken", HiSmart.Companion.getInstance().getToken()), TuplesKt.m25743to("version", this.jhkAppVersion), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis() / ((long) 1000))), TuplesKt.m25743to("format", "1"), TuplesKt.m25743to("languageId", "1"), TuplesKt.m25743to("sourceType", "1"), TuplesKt.m25743to("randStr", StringsKt__StringsJVMKt.replace$default(uuid, (String) AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null)), TuplesKt.m25743to("devSerial", HiSmart.Companion.getInstance().getJhkSerial()));
    }

    private final Map<String, String> generateParamWithDevSerial() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return MapsKt__MapsKt.hashMapOf(TuplesKt.m25743to("version", this.jhkAppVersion), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis() / ((long) 1000))), TuplesKt.m25743to("sourceType", "1"), TuplesKt.m25743to("randStr", StringsKt__StringsJVMKt.replace$default(uuid, (String) AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null)), TuplesKt.m25743to("brandCode", this.branchHis), TuplesKt.m25743to("devSerial", HiSmart.Companion.getInstance().getJhkSerial()), TuplesKt.m25743to("isoLanguageCode", "eng"));
    }

    /* renamed from: getJHLProtocolInfo$lambda-39  reason: not valid java name */
    public static final void m26945getJHLProtocolInfo$lambda39(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("getJHLProtocolInfo success: ", juCustomResult));
        if (juCustomResult == null || ((JuUserAgreement) juCustomResult.getResponse()).getResultCode() != 0) {
            function1.invoke(null);
        } else {
            function1.invoke(((JuUserAgreement) juCustomResult.getResponse()).getData());
        }
    }

    /* renamed from: getJHLProtocolInfo$lambda-40  reason: not valid java name */
    public static final void m26946getJHLProtocolInfo$lambda40(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("getJHLProtocolInfo fail: ", th));
    }

    /* renamed from: getJHLUserProtocolInfo$lambda-41  reason: not valid java name */
    public static final void m26947getJHLUserProtocolInfo$lambda41(AccountServiceImpl accountServiceImpl, Function1 function1, Function1 function12, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.checkNotNullParameter(function12, "$failure");
        accountServiceImpl.log(Intrinsics.stringPlus("getJHLUserProtocolInfo success: ", juCustomResult));
        if (juCustomResult == null || ((JuUserAgreement) juCustomResult.getResponse()).getResultCode() != 0) {
            function12.invoke(new Throwable());
        } else {
            function1.invoke(((JuUserAgreement) juCustomResult.getResponse()).getData());
        }
    }

    /* renamed from: getJHLUserProtocolInfo$lambda-42  reason: not valid java name */
    public static final void m26948getJHLUserProtocolInfo$lambda42(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("getJHLUserProtocolInfo fail: ", th));
    }

    /* renamed from: getUserProfile$lambda-24  reason: not valid java name */
    public static final void m26949getUserProfile$lambda24(Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        if (juCustomResult == null || ((JuUserProfile) juCustomResult.getResponse()).getResultCode() != 0) {
            function1.invoke(null);
        } else {
            function1.invoke(((JuUserProfile) juCustomResult.getResponse()).getUserProfile());
        }
    }

    /* renamed from: getUserProfile$lambda-25  reason: not valid java name */
    public static final void m26950getUserProfile$lambda25(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    private final void log(String str) {
    }

    /* renamed from: login$lambda-8  reason: not valid java name */
    public static final void m26951login$lambda8(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        ClientLoginInfo clientLoginInfo;
        String errorDesc;
        ClientLoginInfo clientLoginInfo2;
        ClientLoginInfo clientLoginInfo3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("login success: ", juCustomResult));
        if (juCustomResult == null || ((ClientLoginInfo) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = -99;
                if (!(juCustomResult == null || (clientLoginInfo3 = (ClientLoginInfo) juCustomResult.getResponse()) == null)) {
                    i = clientLoginInfo3.getResultCode();
                }
                int i2 = 0;
                if (!(juCustomResult == null || (clientLoginInfo2 = (ClientLoginInfo) juCustomResult.getResponse()) == null)) {
                    i2 = clientLoginInfo2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (clientLoginInfo = (ClientLoginInfo) juCustomResult.getResponse()) == null || (errorDesc = clientLoginInfo.getErrorDesc()) == null)) {
                    str = errorDesc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: login$lambda-9  reason: not valid java name */
    public static final void m26952login$lambda9(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("login fail: ", th));
    }

    /* renamed from: logout$lambda-12  reason: not valid java name */
    public static final void m26953logout$lambda12(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        int i;
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("logout success: ", juCustomResult));
        String str = "";
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i2 = -1;
                if (juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null) {
                    i = -1;
                } else {
                    i = juResponse3.getResultCode();
                }
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            String desc2 = ((JuResponse) juCustomResult.getResponse()).getDesc();
            if (desc2 != null) {
                str = desc2;
            }
            onSuccess$hismart_account_release.invoke(str);
        }
    }

    /* renamed from: logout$lambda-13  reason: not valid java name */
    public static final void m26954logout$lambda13(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("logout fail: ", th));
    }

    /* renamed from: refreshToken$lambda-14  reason: not valid java name */
    public static final void m26955refreshToken$lambda14(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        int i;
        ClientLoginInfo clientLoginInfo;
        String errorDesc;
        ClientLoginInfo clientLoginInfo2;
        ClientLoginInfo clientLoginInfo3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("refreshToken success: ", juCustomResult));
        if (juCustomResult == null || ((ClientLoginInfo) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i2 = -1;
                if (juCustomResult == null || (clientLoginInfo3 = (ClientLoginInfo) juCustomResult.getResponse()) == null) {
                    i = -1;
                } else {
                    i = clientLoginInfo3.getResultCode();
                }
                if (!(juCustomResult == null || (clientLoginInfo2 = (ClientLoginInfo) juCustomResult.getResponse()) == null)) {
                    i2 = clientLoginInfo2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (clientLoginInfo = (ClientLoginInfo) juCustomResult.getResponse()) == null || (errorDesc = clientLoginInfo.getErrorDesc()) == null)) {
                    str = errorDesc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: refreshToken$lambda-15  reason: not valid java name */
    public static final void m26956refreshToken$lambda15(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("refreshToken fail: ", th));
    }

    /* renamed from: register$lambda-0  reason: not valid java name */
    public static final void m26957register$lambda0(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("register success: ", juCustomResult));
        if (juCustomResult == null || ((RegisterInfo) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: register$lambda-1  reason: not valid java name */
    public static final void m26958register$lambda1(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("register fail: ", th));
    }

    /* renamed from: resetPassword$lambda-16  reason: not valid java name */
    public static final void m26959resetPassword$lambda16(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("resetPassword success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = 1;
                if (!(juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i = juResponse3.getResultCode();
                }
                int i2 = -1;
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: resetPassword$lambda-17  reason: not valid java name */
    public static final void m26960resetPassword$lambda17(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("resetPassword fail: ", th));
    }

    /* renamed from: resetPasswordByOldPsw$lambda-18  reason: not valid java name */
    public static final void m26961resetPasswordByOldPsw$lambda18(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("resetPasswordByOldPsw success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = 1;
                if (!(juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i = juResponse3.getResultCode();
                }
                int i2 = -1;
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: resetPasswordByOldPsw$lambda-19  reason: not valid java name */
    public static final void m26962resetPasswordByOldPsw$lambda19(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("resetPasswordByOldPsw fail: ", th));
    }

    /* renamed from: saveLoginLog$lambda-49  reason: not valid java name */
    public static final void m26963saveLoginLog$lambda49(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("saveLoginLog success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: saveLoginLog$lambda-50  reason: not valid java name */
    public static final void m26964saveLoginLog$lambda50(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("saveLoginLog fail: ", th));
    }

    /* renamed from: sendVerificationCode$lambda-20  reason: not valid java name */
    public static final void m26965sendVerificationCode$lambda20(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("getAuthCode success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = 1;
                if (!(juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i = juResponse3.getResultCode();
                }
                int i2 = -1;
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: sendVerificationCode$lambda-21  reason: not valid java name */
    public static final void m26966sendVerificationCode$lambda21(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, "NetWork anomaly!"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("getAuthCode fail: ", th));
    }

    private final void setLoginCommonInfo(String str, HashMap<String, String> hashMap, HiSmartCallback<SignonReplyInfo> hiSmartCallback) {
        C7587a c = C7588a.m21571a().mo33051c(str, hashMap, false, new C7683c());
        log(Intrinsics.stringPlus("setLoginCommonInfo params: ", hashMap));
        log(Intrinsics.stringPlus("setLoginCommonInfo url: ", str));
        "setLoginCommonInfo universalBean = " + c.mo33046c() + "   " + c.mo33044a();
        String str2 = "The universalBean is null";
        int i = 1;
        if (c != null) {
            String b = c.mo33045b();
            log(Intrinsics.stringPlus("setLoginCommonInfo result: ", b));
            JsonObject jsonObject = new JsonObject();
            if (!TextUtils.isEmpty(b)) {
                jsonObject = new JsonParser().parse(b).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "JsonParser().parse(result).asJsonObject");
            }
            int asInt = jsonObject.has(this.resultCodeKey) ? jsonObject.get(this.resultCodeKey).getAsInt() : 1;
            if (jsonObject.has(this.errorDescKey)) {
                str2 = jsonObject.get(this.errorDescKey).getAsString();
            }
            if (jsonObject.has(this.errorCodeKey)) {
                i = jsonObject.get(this.errorCodeKey).getAsInt();
            }
            if (!c.mo33046c() || TextUtils.isEmpty(b)) {
                Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "errorDesc");
                    onFailure$hismart_account_release.invoke(new FailureBean(asInt, i, str2));
                }
            } else if (asInt == 0) {
                SignonReplyInfo signonReplyInfo = (SignonReplyInfo) this.gson.fromJson(b, SignonReplyInfo.class);
                Function1<SignonReplyInfo, Unit> onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
                if (onSuccess$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(signonReplyInfo, "signonReplyInfo");
                    onSuccess$hismart_account_release.invoke(signonReplyInfo);
                }
            } else {
                Function1<FailureBean, Unit> onFailure$hismart_account_release2 = hiSmartCallback.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release2 != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "errorDesc");
                    onFailure$hismart_account_release2.invoke(new FailureBean(asInt, i, str2));
                }
            }
        } else {
            Function1<FailureBean, Unit> onFailure$hismart_account_release3 = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release3 != null) {
                onFailure$hismart_account_release3.invoke(new FailureBean(1, 1, str2));
            }
        }
    }

    /* renamed from: thirdRegister$lambda-4  reason: not valid java name */
    public static final void m26967thirdRegister$lambda4(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("thirdRegister success: ", juCustomResult));
        if (juCustomResult == null || ((RegisterInfo) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: thirdRegister$lambda-5  reason: not valid java name */
    public static final void m26968thirdRegister$lambda5(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("thirdRegister fail: ", th));
    }

    /* renamed from: thirdSignIn$lambda-2  reason: not valid java name */
    public static final void m26969thirdSignIn$lambda2(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        ClientLoginInfo clientLoginInfo;
        String errorDesc;
        ClientLoginInfo clientLoginInfo2;
        ClientLoginInfo clientLoginInfo3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("thirdLogin success: ", juCustomResult));
        if (juCustomResult == null || ((ClientLoginInfo) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = -1;
                if (!(juCustomResult == null || (clientLoginInfo3 = (ClientLoginInfo) juCustomResult.getResponse()) == null)) {
                    i = clientLoginInfo3.getResultCode();
                }
                int i2 = 0;
                if (!(juCustomResult == null || (clientLoginInfo2 = (ClientLoginInfo) juCustomResult.getResponse()) == null)) {
                    i2 = clientLoginInfo2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (clientLoginInfo = (ClientLoginInfo) juCustomResult.getResponse()) == null || (errorDesc = clientLoginInfo.getErrorDesc()) == null)) {
                    str = errorDesc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: thirdSignIn$lambda-3  reason: not valid java name */
    public static final void m26970thirdSignIn$lambda3(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("thirdLogin fail: ", th));
    }

    /* renamed from: thirdUnBind$lambda-6  reason: not valid java name */
    public static final void m26971thirdUnBind$lambda6(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("thirdUnBind success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = -1;
                if (!(juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i = juResponse3.getResultCode();
                }
                int i2 = 0;
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(juCustomResult.getResponse());
        }
    }

    /* renamed from: thirdUnBind$lambda-7  reason: not valid java name */
    public static final void m26972thirdUnBind$lambda7(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, ""));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("thirdUnBind fail: ", th));
    }

    /* renamed from: updateJHLUserRegisterProtocol$lambda-43  reason: not valid java name */
    public static final void m26973updateJHLUserRegisterProtocol$lambda43(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("updateJHLUserRegisterProtocol success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: updateJHLUserRegisterProtocol$lambda-44  reason: not valid java name */
    public static final void m26974updateJHLUserRegisterProtocol$lambda44(Function1 function1, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
        accountServiceImpl.log(Intrinsics.stringPlus("updateJHLUserRegisterProtocol fail: ", th));
    }

    /* renamed from: updateProfilePhoto$lambda-30  reason: not valid java name */
    public static final void m26975updateProfilePhoto$lambda30(AccountServiceImpl accountServiceImpl, Function1 function1, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$success");
        accountServiceImpl.log(Intrinsics.stringPlus("updateProfilePhoto suc: ", juCustomResult));
        boolean z = false;
        if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || juResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: updateProfilePhoto$lambda-31  reason: not valid java name */
    public static final void m26976updateProfilePhoto$lambda31(AccountServiceImpl accountServiceImpl, Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$failure");
        accountServiceImpl.log(Intrinsics.stringPlus("updateProfilePhoto fail: ", th.getMessage()));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: updateUserEmail$lambda-51  reason: not valid java name */
    public static final void m26977updateUserEmail$lambda51(AccountServiceImpl accountServiceImpl, HiSmartCallback hiSmartCallback, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        String desc;
        JuResponse juResponse2;
        JuResponse juResponse3;
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        accountServiceImpl.log(Intrinsics.stringPlus("change_email success: ", juCustomResult));
        if (juCustomResult == null || ((JuResponse) juCustomResult.getResponse()).getResultCode() != 0) {
            Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release != null) {
                int i = 1;
                if (!(juCustomResult == null || (juResponse3 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i = juResponse3.getResultCode();
                }
                int i2 = -1;
                if (!(juCustomResult == null || (juResponse2 = (JuResponse) juCustomResult.getResponse()) == null)) {
                    i2 = juResponse2.getErrorCode();
                }
                String str = "";
                if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || (desc = juResponse.getDesc()) == null)) {
                    str = desc;
                }
                onFailure$hismart_account_release.invoke(new FailureBean(i, i2, str));
                return;
            }
            return;
        }
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            onSuccess$hismart_account_release.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: updateUserEmail$lambda-52  reason: not valid java name */
    public static final void m26978updateUserEmail$lambda52(HiSmartCallback hiSmartCallback, AccountServiceImpl accountServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(accountServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, "NetWork anomaly!"));
        }
        accountServiceImpl.log(Intrinsics.stringPlus("change_email fail: ", th));
    }

    /* renamed from: updateUserProfile$lambda-26  reason: not valid java name */
    public static final void m26979updateUserProfile$lambda26(Function1 function1, JuCustomResult juCustomResult) {
        JuResponse juResponse;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(juCustomResult == null || (juResponse = (JuResponse) juCustomResult.getResponse()) == null || juResponse.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: updateUserProfile$lambda-27  reason: not valid java name */
    public static final void m26980updateUserProfile$lambda27(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b addUserProfile(@NotNull UserProfile userProfile, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        String json = new Gson().toJson((Object) userProfile, (Type) UserProfile.class);
        try {
            Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("userProfile", new JSONObject(json)));
            log(Intrinsics.stringPlus("addUserProfile jsonProfile: ", json));
            requestBody = ParameterUtils.Companion.createParamBodySpecUrl$default(ParameterUtils.Companion, (Map) null, mapOf, (Map) null, 5, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.juAccountApi.addUserProfile(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7325r(function1, this), new C7313l(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.addUserProf…ure: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b anonymousLogin(@NotNull String str, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "sourceId");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        return login("", "", "", str, "", function1);
    }

    @NotNull
    public C9207b checkAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Function1<? super HiSmartCallback<JhlRegisterResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        Intrinsics.checkNotNullParameter(str3, "delFlag");
        Intrinsics.checkNotNullParameter(str4, "devSerial");
        Intrinsics.checkNotNullParameter(str5, "authCodeType");
        Intrinsics.checkNotNullParameter(str6, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.checkEmailAuthCode(ParameterUtils.Companion.createParamBody(str6, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("mailbox", str), TuplesKt.m25743to("authCode", str2), TuplesKt.m25743to("authCodeType", str5)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7320o0(this, create), new C7289a(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.checkEmailA…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b checkLoginNameSign(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.checkEmailRegister(ParameterUtils.Companion.createParamBody(str2, MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("mailbox", str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7336w0(this, create), new C7319o(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.checkEmailR…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b checkPass(@NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.checkPass(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7298d0(this, create), new C7321p(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.checkPass(p…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b checkUpgrade(@NotNull String str, int i, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<CheckUpgradeResponse>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Intrinsics.checkNotNullParameter(str2, "appId");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.checkUpgrade(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("versionCode", String.valueOf(i)), TuplesKt.m25743to("appLanguage", str), TuplesKt.m25743to("appOs", UrlConstKt.APP_PLATFORM), TuplesKt.m25743to("appId", str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7329t(this, create), new C7338x0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.checkUpgrad…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b checkUpgradeByPackage(@NotNull String str, int i, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<CheckUpgradeByPackageResponse>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Intrinsics.checkNotNullParameter(str2, "packageName");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        Map<String, String> mutableMap = MapsKt__MapsKt.toMutableMap(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("versionCode", String.valueOf(i)), TuplesKt.m25743to("appLanguage", str), TuplesKt.m25743to("packageName", str2))));
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.checkUpgradeByPackage(mutableMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7310j0(this, create), new C7342z0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.checkUpgrad…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b deleteAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Pair<Boolean, Integer>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "password");
        Intrinsics.checkNotNullParameter(str2, "accessToken");
        Intrinsics.checkNotNullParameter(str3, "authCode");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = true;
        if (str.length() > 0) {
            linkedHashMap.put("password", RsaPasswordUtils.Companion.enCodePwd(str));
        }
        if (str3.length() <= 0) {
            z = false;
        }
        if (z) {
            linkedHashMap.put("authCode", str3);
        }
        C9207b s = this.juAccountApi.deleteAccount(ParameterUtils.Companion.createParamBody(linkedHashMap)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7292b(this, function1), new C7322p0(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.deleteAccou…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b deleteUserData(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.juAccountApi.deleteUserData(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("appId", str), TuplesKt.m25743to("customerId", str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7316m0(this, function1), new C7337x(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.deleteUserD…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b downloadFileWithDynamicUrlSync(@NotNull String str, @NotNull Function1<? super ResponseBody, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "fileUrl");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.juAccountApi.downloadFileWithDynamicUrlAsync(str).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7339y(function1), new C7302f0(function12));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.downloadFil…\", \"fail\")\n            })");
        return s;
    }

    public void errorCallback(@NotNull Function0<Unit> function0) {
        IAccountService.DefaultImpls.errorCallback(this, function0);
    }

    public void getJHKRegisterProtocol(@NotNull Function1<? super HiSmartCallback<JHKUserAgreementBean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        String str = HiNetWorks.Companion.getInstance().getHostUrl(CloudService.ACCOUNT_JHK) + AccoutActionKt.JHK_GET_REG_PROT;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        int i = 1;
        C7587a a = C7588a.m21571a().mo33050a(str, MapsKt__MapsKt.hashMapOf(TuplesKt.m25743to(this.key_version, this.value_version), TuplesKt.m25743to(this.key_timeStamp, this.value_timeStamp), TuplesKt.m25743to(this.key_sourceType, "2"), TuplesKt.m25743to(this.key_randStr, this.value_randStr), TuplesKt.m25743to(this.key_brandCode, this.branchHis), TuplesKt.m25743to(this.key_devSerial, HiSmart.Companion.getInstance().getJhkSerial()), TuplesKt.m25743to(this.key_isoLanguageCode, "eng")), false, new C7683c());
        String str2 = "The universalBean is null";
        if (a != null) {
            String b = a.mo33045b();
            log(Intrinsics.stringPlus("getJHKRegisterProtocol result: ", b));
            JsonObject jsonObject = new JsonObject();
            if (!TextUtils.isEmpty(b)) {
                jsonObject = new JsonParser().parse(b).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "JsonParser().parse(result).asJsonObject");
            }
            int asInt = jsonObject.has(this.resultCodeKey) ? jsonObject.get(this.resultCodeKey).getAsInt() : 1;
            if (jsonObject.has(this.errorDescKey)) {
                str2 = jsonObject.get(this.errorDescKey).getAsString();
            }
            if (jsonObject.has(this.errorCodeKey)) {
                i = jsonObject.get(this.errorCodeKey).getAsInt();
            }
            if (!a.mo33046c() || TextUtils.isEmpty(b)) {
                Function1<FailureBean, Unit> onFailure$hismart_account_release = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "errorDesc");
                    onFailure$hismart_account_release.invoke(new FailureBean(asInt, i, str2));
                }
            } else if (asInt == 0) {
                JHKUserAgreementBean jHKUserAgreementBean = (JHKUserAgreementBean) this.gson.fromJson(b, JHKUserAgreementBean.class);
                Function1<T, Unit> onSuccess$hismart_account_release = create.getOnSuccess$hismart_account_release();
                if (onSuccess$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(jHKUserAgreementBean, "jhkUserAgreementBean");
                    onSuccess$hismart_account_release.invoke(jHKUserAgreementBean);
                }
            } else {
                Function1<FailureBean, Unit> onFailure$hismart_account_release2 = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release2 != null) {
                    Intrinsics.checkNotNullExpressionValue(str2, "errorDesc");
                    onFailure$hismart_account_release2.invoke(new FailureBean(asInt, i, str2));
                }
            }
        } else {
            Function1<FailureBean, Unit> onFailure$hismart_account_release3 = create.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release3 != null) {
                onFailure$hismart_account_release3.invoke(new FailureBean(1, 1, str2));
            }
        }
    }

    public void getJHKUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<JHKUserAgreementBean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "requestType");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        String str3 = HiNetWorks.Companion.getInstance().getHostUrl(CloudService.ACCOUNT_JHK) + AccoutActionKt.JHK_GET_USER_REG_PROT;
        Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
        Pair pair = TuplesKt.m25743to("requestType", str2);
        int i = 1;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        C7587a a = C7588a.m21571a().mo33050a(str3, MapsKt__MapsKt.hashMapOf(TuplesKt.m25743to("accessToken", str), pair, TuplesKt.m25743to("version", this.jhkAppVersion), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis() / ((long) 1000))), TuplesKt.m25743to("sourceType", "2"), TuplesKt.m25743to("randStr", StringsKt__StringsJVMKt.replace$default(uuid, (String) AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null)), TuplesKt.m25743to("brandCode", this.branchHis), TuplesKt.m25743to("devSerial", HiSmart.Companion.getInstance().getJhkSerial()), TuplesKt.m25743to("isoLanguageCode", "eng")), false, new C7683c());
        String str4 = "The universalBean is null";
        if (a != null) {
            String b = a.mo33045b();
            log(Intrinsics.stringPlus("getJHKUserRegisterProtocol result: ", b));
            JsonObject jsonObject = new JsonObject();
            if (!TextUtils.isEmpty(b)) {
                jsonObject = new JsonParser().parse(b).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "JsonParser().parse(result).asJsonObject");
            }
            int asInt = jsonObject.has(this.resultCodeKey) ? jsonObject.get(this.resultCodeKey).getAsInt() : 1;
            if (jsonObject.has(this.errorDescKey)) {
                str4 = jsonObject.get(this.errorDescKey).getAsString();
            }
            if (jsonObject.has(this.errorCodeKey)) {
                i = jsonObject.get(this.errorCodeKey).getAsInt();
            }
            if (!a.mo33046c() || TextUtils.isEmpty(b)) {
                Function1<FailureBean, Unit> onFailure$hismart_account_release = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(str4, "errorDesc");
                    onFailure$hismart_account_release.invoke(new FailureBean(asInt, i, str4));
                }
            } else if (asInt == 0) {
                JHKUserAgreementBean jHKUserAgreementBean = (JHKUserAgreementBean) this.gson.fromJson(b, JHKUserAgreementBean.class);
                Function1<T, Unit> onSuccess$hismart_account_release = create.getOnSuccess$hismart_account_release();
                if (onSuccess$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(jHKUserAgreementBean, "jhkUserAgreementBean");
                    onSuccess$hismart_account_release.invoke(jHKUserAgreementBean);
                }
            } else {
                Function1<FailureBean, Unit> onFailure$hismart_account_release2 = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release2 != null) {
                    Intrinsics.checkNotNullExpressionValue(str4, "errorDesc");
                    onFailure$hismart_account_release2.invoke(new FailureBean(asInt, i, str4));
                }
            }
        } else {
            Function1<FailureBean, Unit> onFailure$hismart_account_release3 = create.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release3 != null) {
                onFailure$hismart_account_release3.invoke(new FailureBean(1, 1, str4));
            }
        }
    }

    @NotNull
    public C9207b getJHLProtocolInfo(@NotNull String str, @NotNull String str2, @NotNull Function1<? super JHLAgreementData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "languageId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("languageId", str2));
        if (HiSmart.Companion.getInstance().getToken().length() == 0) {
            map = ParameterUtils.Companion.createParamMap(str, (Map<String, String>) mapOf);
        } else {
            map = ParameterUtils.Companion.createParamMap(mapOf);
        }
        C9207b s = this.juAccountApi.getJHLProtocolInfo(map).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7293b0(this, function1), new C7290a0(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.getJHLProto…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b getJHLUserProtocolInfo(@NotNull String str, @NotNull String str2, @NotNull Function1<? super JHLAgreementData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "languageId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("languageId", str2));
        if (HiSmart.Companion.getInstance().getToken().length() == 0) {
            map = ParameterUtils.Companion.createParamMap(str, (Map<String, String>) mapOf);
        } else {
            map = ParameterUtils.Companion.createParamMap(mapOf);
        }
        Map<String, String> mutableMap = MapsKt__MapsKt.toMutableMap(map);
        mutableMap.put("languageId", str2);
        C9207b s = this.juAccountApi.getJHLUserProtocolInfo(mutableMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7296c0(this, function1, function12), new C7311k(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.getJHLUserP…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b getUserProfile(@NotNull Function1<? super UserProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.juAccountApi.getUserProfile(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7308i0(function1), new C7295c(function12));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.getUserProf…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b login(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1) {
        String str6;
        String jhlAppSecret;
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str4, "sourceId");
        Intrinsics.checkNotNullParameter(str5, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        HiNetWorks hiNetWorks$hismart_account_release = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String jhlClientId = hiNetWorks$hismart_account_release == null ? null : hiNetWorks$hismart_account_release.getJhlClientId();
        boolean z = true;
        String str7 = "";
        String enCodePwd = !(str2.length() == 0) ? RsaPasswordUtils.Companion.enCodePwd(str2) : str7;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.m25743to("loginName", str);
        pairArr[1] = TuplesKt.m25743to("password", enCodePwd);
        HiNetWorks hiNetWorks$hismart_account_release2 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (hiNetWorks$hismart_account_release2 == null || (str6 = hiNetWorks$hismart_account_release2.getJhlAppKey()) == null) {
            str6 = str7;
        }
        pairArr[2] = TuplesKt.m25743to("appId", str6);
        HiNetWorks hiNetWorks$hismart_account_release3 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (!(hiNetWorks$hismart_account_release3 == null || (jhlAppSecret = hiNetWorks$hismart_account_release3.getJhlAppSecret()) == null)) {
            str7 = jhlAppSecret;
        }
        pairArr[3] = TuplesKt.m25743to("appSecret", str7);
        pairArr[4] = TuplesKt.m25743to("sourceId", Intrinsics.stringPlus(jhlClientId, str4));
        Map mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
        if (!(str3 == null || str3.length() == 0)) {
            mutableMapOf.put("authCode", str3);
        }
        if (str5.length() != 0) {
            z = false;
        }
        ParameterUtils.Companion companion = ParameterUtils.Companion;
        C9207b s = this.juAccountApi.login(z ? companion.createParamBody(mutableMapOf) : companion.createParamBody(str5, mutableMapOf)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7312k0(this, create), new C7318n0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.login(param…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b logout(@NotNull String str, @NotNull Function1<? super HiSmartCallback<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "refreshToken");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.logout(ParameterUtils.Companion.createParamBody(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("refreshToken", str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7334v0(this, create), new C7314l0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.logout(para…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b refreshToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1) {
        String str4;
        String jhlAppSecret;
        Intrinsics.checkNotNullParameter(str, "refreshToken");
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "sourceId");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        HiNetWorks hiNetWorks$hismart_account_release = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String jhlClientId = hiNetWorks$hismart_account_release == null ? null : hiNetWorks$hismart_account_release.getJhlClientId();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.m25743to("refreshToken", str);
        HiNetWorks hiNetWorks$hismart_account_release2 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String str5 = "";
        if (hiNetWorks$hismart_account_release2 == null || (str4 = hiNetWorks$hismart_account_release2.getJhlAppKey()) == null) {
            str4 = str5;
        }
        pairArr[1] = TuplesKt.m25743to("appId", str4);
        HiNetWorks hiNetWorks$hismart_account_release3 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (!(hiNetWorks$hismart_account_release3 == null || (jhlAppSecret = hiNetWorks$hismart_account_release3.getJhlAppSecret()) == null)) {
            str5 = jhlAppSecret;
        }
        pairArr[2] = TuplesKt.m25743to("appSecret", str5);
        pairArr[3] = TuplesKt.m25743to("sourceId", Intrinsics.stringPlus(jhlClientId, str3));
        C9207b s = this.juAccountApi.refreshToken(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(pairArr))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7291a1(this, create), new C7315m(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.refreshToke…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b register(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<RegisterInfo>, Unit> function1) {
        String str6;
        String jhlAppSecret;
        Intrinsics.checkNotNullParameter(str, "mailbox");
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "authCode");
        Intrinsics.checkNotNullParameter(str4, "sourceId");
        Intrinsics.checkNotNullParameter(str5, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        HiNetWorks hiNetWorks$hismart_account_release = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String jhlClientId = hiNetWorks$hismart_account_release == null ? null : hiNetWorks$hismart_account_release.getJhlClientId();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m25743to("mailbox", str);
        pairArr[1] = TuplesKt.m25743to("authCode", str3);
        HiNetWorks hiNetWorks$hismart_account_release2 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String str7 = "";
        if (hiNetWorks$hismart_account_release2 == null || (str6 = hiNetWorks$hismart_account_release2.getJhlAppKey()) == null) {
            str6 = str7;
        }
        pairArr[2] = TuplesKt.m25743to("appId", str6);
        HiNetWorks hiNetWorks$hismart_account_release3 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (!(hiNetWorks$hismart_account_release3 == null || (jhlAppSecret = hiNetWorks$hismart_account_release3.getJhlAppSecret()) == null)) {
            str7 = jhlAppSecret;
        }
        pairArr[3] = TuplesKt.m25743to("appSecret", str7);
        pairArr[4] = TuplesKt.m25743to("sourceId", Intrinsics.stringPlus(jhlClientId, str4));
        pairArr[5] = TuplesKt.m25743to("password", RsaPasswordUtils.Companion.enCodePwd(str2));
        RequestBody createParamBody = ParameterUtils.Companion.createParamBody(str5, MapsKt__MapsKt.mapOf(pairArr));
        LoggerUtil.Companion.mo41771i(RsaPasswordUtils.Companion.enCodePwd(str2));
        C9207b s = this.juAccountApi.register(createParamBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7330t0(this, create), new C7317n(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.register(pa…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b resetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        Intrinsics.checkNotNullParameter(str4, "accessToken");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.resetPWD(ParameterUtils.Companion.createParamBody(str4, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("mailbox", str), TuplesKt.m25743to("authCode", str2), TuplesKt.m25743to("newPassword", RsaPasswordUtils.Companion.enCodePwd(str3))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7326r0(this, create), new C7297d(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.resetPWD(pa…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b resetPasswordByOldPsw(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "oldPassword");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.updatePWD(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("oldPassword", RsaPasswordUtils.Companion.enCodePwd(str2)), TuplesKt.m25743to("newPassword", RsaPasswordUtils.Companion.enCodePwd(str3))))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7303g(this, create), new C7307i(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.updatePWD(p…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b saveLoginLog(@NotNull String str, long j, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "phoneModel");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.juAccountApi.saveLoginLog(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("userId", str), TuplesKt.m25743to("loginTime", str2), TuplesKt.m25743to("phoneModel", str2)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7299e(this, function1), new C7306h0(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.saveLoginLo…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b sendVerificationCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, "codeType");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        C9207b s = this.juAccountApi.getAuthCode(ParameterUtils.Companion.createParamBody(str, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("mailbox", str2), TuplesKt.m25743to("authCodeType", str3)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7331u(this, create), new C7309j(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.getAuthCode…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b thirdRegister(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull Function1<? super HiSmartCallback<RegisterInfo>, Unit> function1) {
        String str8;
        String jhlAppSecret;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        Function1<? super HiSmartCallback<RegisterInfo>, Unit> function12 = function1;
        Intrinsics.checkNotNullParameter(str9, "thirdClientId");
        Intrinsics.checkNotNullParameter(str10, "thirdType");
        Intrinsics.checkNotNullParameter(str11, EventBusConstKt.ID_TOKEN);
        Intrinsics.checkNotNullParameter(str12, "mailbox");
        Intrinsics.checkNotNullParameter(str13, "authCode");
        Intrinsics.checkNotNullParameter(str14, "sourceId");
        Intrinsics.checkNotNullParameter(str15, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function12, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function12);
        HiNetWorks hiNetWorks$hismart_account_release = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String jhlClientId = hiNetWorks$hismart_account_release == null ? null : hiNetWorks$hismart_account_release.getJhlClientId();
        HiSmartCallback<T> hiSmartCallback = create;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.m25743to("thirdClientId", str9);
        pairArr[1] = TuplesKt.m25743to("thirdType", str10);
        pairArr[2] = TuplesKt.m25743to(EventBusConstKt.ID_TOKEN, str11);
        pairArr[3] = TuplesKt.m25743to("authCode", str13);
        pairArr[4] = TuplesKt.m25743to("mailbox", str12);
        HiNetWorks hiNetWorks$hismart_account_release2 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String str16 = "";
        if (hiNetWorks$hismart_account_release2 == null || (str8 = hiNetWorks$hismart_account_release2.getJhlAppKey()) == null) {
            str8 = str16;
        }
        pairArr[5] = TuplesKt.m25743to("appId", str8);
        HiNetWorks hiNetWorks$hismart_account_release3 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (!(hiNetWorks$hismart_account_release3 == null || (jhlAppSecret = hiNetWorks$hismart_account_release3.getJhlAppSecret()) == null)) {
            str16 = jhlAppSecret;
        }
        pairArr[6] = TuplesKt.m25743to("appSecret", str16);
        pairArr[7] = TuplesKt.m25743to("sourceId", Intrinsics.stringPlus(jhlClientId, str14));
        HiSmartCallback<T> hiSmartCallback2 = hiSmartCallback;
        C9207b s = this.juAccountApi.thirdRegister(ParameterUtils.Companion.createParamBody(str15, MapsKt__MapsKt.mapOf(pairArr))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7332u0(this, hiSmartCallback2), new C7335w(hiSmartCallback2, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.thirdRegist…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b thirdSignIn(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1) {
        String str6;
        String jhlAppSecret;
        Intrinsics.checkNotNullParameter(str, "thirdType");
        Intrinsics.checkNotNullParameter(str2, "thirdClientId");
        Intrinsics.checkNotNullParameter(str3, EventBusConstKt.ID_TOKEN);
        Intrinsics.checkNotNullParameter(str4, "sourceId");
        Intrinsics.checkNotNullParameter(str5, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        HiNetWorks hiNetWorks$hismart_account_release = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String jhlClientId = hiNetWorks$hismart_account_release == null ? null : hiNetWorks$hismart_account_release.getJhlClientId();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m25743to("thirdType", str);
        pairArr[1] = TuplesKt.m25743to("thirdClientId", str2);
        pairArr[2] = TuplesKt.m25743to(EventBusConstKt.ID_TOKEN, str3);
        HiNetWorks hiNetWorks$hismart_account_release2 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        String str7 = "";
        if (hiNetWorks$hismart_account_release2 == null || (str6 = hiNetWorks$hismart_account_release2.getJhlAppKey()) == null) {
            str6 = str7;
        }
        pairArr[3] = TuplesKt.m25743to("appId", str6);
        HiNetWorks hiNetWorks$hismart_account_release3 = HiSmart.Companion.getHiNetWorks$hismart_account_release();
        if (!(hiNetWorks$hismart_account_release3 == null || (jhlAppSecret = hiNetWorks$hismart_account_release3.getJhlAppSecret()) == null)) {
            str7 = jhlAppSecret;
        }
        pairArr[4] = TuplesKt.m25743to("appSecret", str7);
        pairArr[5] = TuplesKt.m25743to("sourceId", Intrinsics.stringPlus(jhlClientId, str4));
        C9207b s = this.juAccountApi.thirdLogin(ParameterUtils.Companion.createParamBody(str5, MapsKt__MapsKt.mutableMapOf(pairArr))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7340y0(this, create), new C7304g0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.thirdLogin(…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b thirdUnBind(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<JuResponse>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "thirdType");
        Intrinsics.checkNotNullParameter(str2, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        boolean z = true;
        Map mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m25743to("thirdType", str));
        if (str2.length() != 0) {
            z = false;
        }
        C9207b s = this.juAccountApi.thirdUnbind(z ? ParameterUtils.Companion.createParamBody(mutableMapOf) : ParameterUtils.Companion.createParamBody(str2, mutableMapOf)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7323q(this, create), new C7300e0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.thirdUnbind…ail: $it\")\n            })");
        return s;
    }

    public void updateJHKUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "tosVer");
        Intrinsics.checkNotNullParameter(str3, "ppVer");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        String str4 = HiNetWorks.Companion.getInstance().getHostUrl(CloudService.ACCOUNT_JHK) + AccoutActionKt.JHK_UPDATE_USER_REG_PROT;
        Intrinsics.checkNotNullExpressionValue(str4, "StringBuilder().apply(builderAction).toString()");
        Pair pair = TuplesKt.m25743to("tosVer", str2);
        int i = 1;
        String str5 = this.key_randStr;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m25743to(this.key_accessToken, str), pair, TuplesKt.m25743to("ppVer", str3), TuplesKt.m25743to(this.key_version, this.jhkAppVersion), TuplesKt.m25743to(this.key_timeStamp, String.valueOf(System.currentTimeMillis() / ((long) 1000))), TuplesKt.m25743to(this.key_sourceType, "2"), TuplesKt.m25743to(str5, StringsKt__StringsJVMKt.replace$default(uuid, (String) AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null)), TuplesKt.m25743to(this.key_brandCode, this.branchHis), TuplesKt.m25743to(this.key_devSerial, HiSmart.Companion.getInstance().getJhkSerial()), TuplesKt.m25743to(this.key_isoLanguageCode, "eng"));
        hashMapOf.putAll(generateParamWithDevSerial());
        C7587a c = C7588a.m21571a().mo33051c(str4, hashMapOf, false, new C7683c());
        String str6 = "The universalBean is null";
        if (c != null) {
            String b = c.mo33045b();
            log(Intrinsics.stringPlus("updateJHKUserRegisterProtocol result: ", b));
            JsonObject jsonObject = new JsonObject();
            if (!TextUtils.isEmpty(b)) {
                jsonObject = new JsonParser().parse(b).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "JsonParser().parse(result).asJsonObject");
            }
            int asInt = jsonObject.has(this.resultCodeKey) ? jsonObject.get(this.resultCodeKey).getAsInt() : 1;
            if (jsonObject.has(this.errorDescKey)) {
                str6 = jsonObject.get(this.errorDescKey).getAsString();
            }
            if (jsonObject.has(this.errorCodeKey)) {
                i = jsonObject.get(this.errorCodeKey).getAsInt();
            }
            if (!c.mo33046c() || TextUtils.isEmpty(b)) {
                Function1<FailureBean, Unit> onFailure$hismart_account_release = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release != null) {
                    Intrinsics.checkNotNullExpressionValue(str6, "errorDesc");
                    onFailure$hismart_account_release.invoke(new FailureBean(asInt, i, str6));
                }
            } else if (asInt == 0) {
                Function1<T, Unit> onSuccess$hismart_account_release = create.getOnSuccess$hismart_account_release();
                if (onSuccess$hismart_account_release != null) {
                    onSuccess$hismart_account_release.invoke(Boolean.TRUE);
                }
            } else {
                Function1<FailureBean, Unit> onFailure$hismart_account_release2 = create.getOnFailure$hismart_account_release();
                if (onFailure$hismart_account_release2 != null) {
                    Intrinsics.checkNotNullExpressionValue(str6, "errorDesc");
                    onFailure$hismart_account_release2.invoke(new FailureBean(asInt, i, str6));
                }
            }
        } else {
            Function1<FailureBean, Unit> onFailure$hismart_account_release3 = create.getOnFailure$hismart_account_release();
            if (onFailure$hismart_account_release3 != null) {
                onFailure$hismart_account_release3.invoke(new FailureBean(1, 1, str6));
            }
        }
    }

    @NotNull
    public C9207b updateJHLUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "ppVersion");
        Intrinsics.checkNotNullParameter(str3, "tosVersion");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        boolean z = false;
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to("ppVersion", str2), TuplesKt.m25743to("tosVersion", str3));
        if (HiSmart.Companion.getInstance().getToken().length() == 0) {
            z = true;
        }
        if (z) {
            requestBody = ParameterUtils.Companion.createParamBody(str, mapOf);
        } else {
            requestBody = ParameterUtils.Companion.createParamBody(mapOf);
        }
        C9207b s = this.juAccountApi.updateJHLCustomerProtocol(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7328s0(this, function1), new C7327s(function12, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.updateJHLCu…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b updateProfilePhoto(@NotNull File file, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file);
        MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("headImg", file.getName(), create);
        Map<String, String> mutableMap = MapsKt__MapsKt.toMutableMap(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : mutableMap.entrySet()) {
            linkedHashMap.put(next.getKey(), RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), (String) next.getValue()));
        }
        new MultipartBody.Builder((String) null, 1, (DefaultConstructorMarker) null).addPart(create);
        C9207b s = this.juAccountApi.updateProfilePhoto(createFormData, linkedHashMap).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7305h(this, function1), new C7301f(this, function12));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.updateProfi…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b updateUserEmail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        Function1<? super HiSmartCallback<Boolean>, Unit> function12 = function1;
        Intrinsics.checkNotNullParameter(str6, "password");
        Intrinsics.checkNotNullParameter(str7, "oldAuthCode");
        Intrinsics.checkNotNullParameter(str8, "newAuthCode");
        Intrinsics.checkNotNullParameter(str9, "newEmail");
        Intrinsics.checkNotNullParameter(str10, "newPassword");
        Intrinsics.checkNotNullParameter(function12, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function12);
        Pair[] pairArr = new Pair[5];
        boolean z = true;
        String str11 = "";
        pairArr[0] = TuplesKt.m25743to("password", str.length() == 0 ? str11 : RsaPasswordUtils.Companion.enCodePwd(str6));
        pairArr[1] = TuplesKt.m25743to("oldAuthCode", str7);
        pairArr[2] = TuplesKt.m25743to("newAuthCode", str8);
        pairArr[3] = TuplesKt.m25743to("newEmail", str9);
        if (str5.length() != 0) {
            z = false;
        }
        if (!z) {
            str11 = RsaPasswordUtils.Companion.enCodePwd(str10);
        }
        pairArr[4] = TuplesKt.m25743to("newPassword", str11);
        C9207b s = this.juAccountApi.changeEmail(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(pairArr))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7294b1(this, create), new C7324q0(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.changeEmail…ail: $it\")\n            })");
        return s;
    }

    @NotNull
    public C9207b updateUserProfile(@NotNull UserProfile userProfile, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        RequestBody requestBody;
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        String json = new Gson().toJson((Object) userProfile, (Type) UserProfile.class);
        try {
            Map mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("userProfile", new JSONObject(json)));
            log(Intrinsics.stringPlus("updateUserProfile jsonProfile: ", json));
            log(Intrinsics.stringPlus("updateUserProfile params: ", mapOf));
            requestBody = ParameterUtils.Companion.createParamBodySpecUrl$default(ParameterUtils.Companion, (Map) null, mapOf, (Map) null, 5, (Object) null);
        } catch (JSONException unused) {
            requestBody = ParameterUtils.Companion.createParamBodySpec$default(ParameterUtils.Companion, (Map) null, (Map) null, (Map) null, 7, (Object) null);
        }
        C9207b s = this.juAccountApi.updateUserProfile(requestBody).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7341z(function1), new C7333v(function12));
        Intrinsics.checkNotNullExpressionValue(s, "juAccountApi.updateUserP…ailure(it)\n            })");
        return s;
    }
}
