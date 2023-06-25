package com.hisense.connect_life.app_account.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.JHKUserAgreementBean;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import com.hisense.connect_life.third_account.util.RefreshTokenUtils;
import java.io.File;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020CJ'\u0010u\u001a\u00020s2\u0006\u0010v\u001a\u00020\u00042\u0012\u0010w\u001a\n\u0012\u0006\b\u0001\u0012\u00020y0x\"\u00020y¢\u0006\u0002\u0010zJ\u001e\u0010{\u001a\u00020s2\u0006\u0010|\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001d2\u0006\u0010~\u001a\u00020\u001dJ\b\u0010\u001a\u00020\u0010H\u0002J\u000f\u0010\u0001\u001a\u00020s2\u0006\u0010|\u001a\u00020\u001dJ\u0010\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001dJ\u0019\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001dJ\u001b\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J8\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u001d2\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020s0\u0001J\u001a\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\b\b\u0002\u0010}\u001a\u00020\u001dJ\u0019\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001dJ\u0019\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001dJ\u0007\u0010\u0001\u001a\u00020sJ\t\u0010\u0001\u001a\u00020sH\u0007J\u0012\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001dH\u0007J\u0010\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001dJ\u0010\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001dJ\u001b\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001dJ8\u0010\u0001\u001a\u00020s2\u0016\u0010\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020s0\u00012\u0017\u0010 \u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010¡\u0001\u0012\u0004\u0012\u00020s0\u0001J\u0010\u0010\u0001\u001a\u00020s2\u0007\u0010¢\u0001\u001a\u00020\u0010J\u0019\u0010£\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010¤\u0001\u001a\u00020\u001dJ\t\u0010¥\u0001\u001a\u00020sH\u0002J4\u0010¦\u0001\u001a\u00020s2\u0007\u0010¦\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\u001d2\u0007\u0010¨\u0001\u001a\u00020\u001dJ \u0010©\u0001\u001a\u00020s2\u0006\u0010|\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001d2\u0007\u0010ª\u0001\u001a\u00020\u001dJ!\u0010«\u0001\u001a\u00020s2\u0006\u0010|\u001a\u00020\u001d2\u0007\u0010¬\u0001\u001a\u00020\u001d2\u0007\u0010ª\u0001\u001a\u00020\u001dJ#\u0010­\u0001\u001a\u00020s2\u0007\u0010®\u0001\u001a\u00020\u001d2\b\u0010¯\u0001\u001a\u00030°\u00012\u0007\u0010±\u0001\u001a\u00020\u001dJ\u0013\u0010²\u0001\u001a\u00020s2\b\u0010t\u001a\u0004\u0018\u00010CH\u0002J$\u0010³\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010¤\u0001\u001a\u00020\u001dH\u0002J7\u0010´\u0001\u001a\u00020s2\b\u0010µ\u0001\u001a\u00030¶\u00012\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010§\u0001\u001a\u00020\u001d2\u0007\u0010¨\u0001\u001a\u00020\u001dH\u0002J\u0019\u0010·\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001dJ!\u0010·\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001dJ\u0007\u0010¸\u0001\u001a\u00020sJ)\u0010¹\u0001\u001a\u00020s2\u0006\u0010|\u001a\u00020\u001d2\u0007\u0010\u0001\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001d2\u0007\u0010º\u0001\u001a\u00020\u001dJ4\u0010»\u0001\u001a\u00020s2\u0007\u0010\u0001\u001a\u00020\u001d2\u0007\u0010¼\u0001\u001a\u00020\u001d2\u0007\u0010½\u0001\u001a\u00020\u001d2\u0007\u0010¾\u0001\u001a\u00020\u001d2\u0007\u0010ª\u0001\u001a\u00020\u001dJ\u001b\u0010¿\u0001\u001a\u00020s2\u0007\u0010À\u0001\u001a\u00020\u001d2\u0007\u0010Á\u0001\u001a\u00020\u001dH\u0007J\u0019\u0010Â\u0001\u001a\u00020s2\u0007\u0010Ã\u0001\u001a\u00020\u001d2\u0007\u0010Ä\u0001\u001a\u00020\u001dJ\u0011\u0010Å\u0001\u001a\u00020s2\b\u0010Æ\u0001\u001a\u00030Ç\u0001J\u0018\u0010È\u0001\u001a\u00020s2\u0006\u0010t\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R-\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012R-\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0012R3\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100!0\u000f8FX\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0012R#\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u000f8FX\u0002¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b&\u0010\u0012R-\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b)\u0010\u0012R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b,\u0010\u0012R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b/\u0010\u0012R/\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u0001020\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b4\u0010\u0014\u001a\u0004\b3\u0010\u0012R/\u00105\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u0001020\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b6\u0010\u0012R#\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u000f8FX\u0002¢\u0006\f\n\u0004\b;\u0010\u0014\u001a\u0004\b:\u0010\u0012R/\u0010<\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u0001090\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b>\u0010\u0014\u001a\u0004\b=\u0010\u0012R-\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bA\u0010\u0014\u001a\u0004\b@\u0010\u0012R/\u0010B\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010C0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bE\u0010\u0014\u001a\u0004\bD\u0010\u0012R-\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bH\u0010\u0014\u001a\u0004\bG\u0010\u0012R'\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0\u000f8FX\u0002¢\u0006\f\n\u0004\bM\u0010\u0014\u001a\u0004\bL\u0010\u0012R-\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bP\u0010\u0014\u001a\u0004\bO\u0010\u0012R-\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bS\u0010\u0014\u001a\u0004\bR\u0010\u0012R-\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bV\u0010\u0014\u001a\u0004\bU\u0010\u0012R!\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\bY\u0010\u0014\u001a\u0004\bX\u0010\u0012R!\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\b\\\u0010\u0014\u001a\u0004\b[\u0010\u0012R-\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\b_\u0010\u0014\u001a\u0004\b^\u0010\u0012R-\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00160\u000f8FX\u0002¢\u0006\f\n\u0004\bb\u0010\u0014\u001a\u0004\ba\u0010\u0012R!\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\be\u0010\u0014\u001a\u0004\bd\u0010\u0012R!\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\bh\u0010\u0014\u001a\u0004\bg\u0010\u0012R!\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0002¢\u0006\f\n\u0004\bk\u0010\u0014\u001a\u0004\bj\u0010\u0012R5\u0010l\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010C0!0\u000f8FX\u0002¢\u0006\f\n\u0004\bn\u0010\u0014\u001a\u0004\bm\u0010\u0012R!\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f8FX\u0002¢\u0006\f\n\u0004\bq\u0010\u0014\u001a\u0004\bp\u0010\u0012¨\u0006É\u0001"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "CHECK_EMAIL_AUTH_CODE", "", "CHECK_EMAIL_REGISTER", "EMAIL_LOGIN", "EMAIL_REGISTER", "GET_LANG", "GET_VER_CODE", "PROCOTO_GET", "PROCOTO_REGISTER_UPDATE", "PROCOTO_USER_GET", "RESET_PWD_AUTH_CODE", "addUPLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAddUPLiveData", "()Landroidx/lifecycle/MutableLiveData;", "addUPLiveData$delegate", "Lkotlin/Lazy;", "changeEmailLiveData", "Lkotlin/Pair;", "getChangeEmailLiveData", "changeEmailLiveData$delegate", "checkAuthCodeLiveData", "getCheckAuthCodeLiveData", "checkAuthCodeLiveData$delegate", "checkLoginNameSignLiveData", "", "getCheckLoginNameSignLiveData", "checkLoginNameSignLiveData$delegate", "checkPassLiveData", "Lkotlin/Triple;", "getCheckPassLiveData", "checkPassLiveData$delegate", "checkUpgradeLiveData", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "getCheckUpgradeLiveData", "checkUpgradeLiveData$delegate", "deleteAccountLiveData", "getDeleteAccountLiveData", "deleteAccountLiveData$delegate", "downloadFileLiveData", "getDownloadFileLiveData", "downloadFileLiveData$delegate", "forgetPwdLiveData", "getForgetPwdLiveData", "forgetPwdLiveData$delegate", "getJHKRegisterProtocolLiveData", "Lcom/hisense/connect_life/hismart/networks/request/device/model/JHKUserAgreementBean;", "getGetJHKRegisterProtocolLiveData", "getJHKRegisterProtocolLiveData$delegate", "getJHKUserRegisterProtocolLiveData", "getGetJHKUserRegisterProtocolLiveData", "getJHKUserRegisterProtocolLiveData$delegate", "getJHLRegisterProtocolLiveData", "Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "getGetJHLRegisterProtocolLiveData", "getJHLRegisterProtocolLiveData$delegate", "getJHLUserRegisterProtocolLiveData", "getGetJHLUserRegisterProtocolLiveData", "getJHLUserRegisterProtocolLiveData$delegate", "getVerificationLiveData", "getGetVerificationLiveData", "getVerificationLiveData$delegate", "queryUpLiveData", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "getQueryUpLiveData", "queryUpLiveData$delegate", "refreshTokenLiveData", "getRefreshTokenLiveData", "refreshTokenLiveData$delegate", "regionByLangLiveData", "", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "getRegionByLangLiveData", "regionByLangLiveData$delegate", "resetPswByOldPSWLiveData", "getResetPswByOldPSWLiveData", "resetPswByOldPSWLiveData$delegate", "resetPswLiveData", "getResetPswLiveData", "resetPswLiveData$delegate", "signInLiveData", "getSignInLiveData", "signInLiveData$delegate", "signOutLiveData", "getSignOutLiveData", "signOutLiveData$delegate", "signUpLiveData", "getSignUpLiveData", "signUpLiveData$delegate", "thirdSignInBindLiveData", "getThirdSignInBindLiveData", "thirdSignInBindLiveData$delegate", "thirdSignInLiveData", "getThirdSignInLiveData", "thirdSignInLiveData$delegate", "updateJHKUserRegisterProtocolLiveData", "getUpdateJHKUserRegisterProtocolLiveData", "updateJHKUserRegisterProtocolLiveData$delegate", "updateJHLUserRegisterProtocolLiveData", "getUpdateJHLUserRegisterProtocolLiveData", "updateJHLUserRegisterProtocolLiveData$delegate", "updateProfilePhotoLiveData", "getUpdateProfilePhotoLiveData", "updateProfilePhotoLiveData$delegate", "updateUpLiveData", "getUpdateUpLiveData", "updateUpLiveData$delegate", "userDataLiveData", "getUserDataLiveData", "userDataLiveData$delegate", "addUserProfile", "", "userProfile", "anonymousLogin", "requestFun", "arg", "", "", "(I[Ljava/lang/Object;)V", "checkAuthCode", "loginName", "authCode", "delFlag", "checkIsLogin", "checkLoginNameSign", "checkPassExist", "requestTag", "checkPassword", "email", "password", "checkUpgrade", "languageId", "versionCode", "checkUpgradeByPackage", "packageName", "responseCallback", "Lkotlin/Function1;", "deleteAccount", "deleteUserData", "appId", "customerId", "downloadFileWithDynamicUrlSync", "fileName", "fileUrl", "getDefaultLanguage", "getJHKRegisterProtocol", "getJHKUserRegisterProtocol", "requestType", "getJHLRegisterProtocol", "getJHLUserRegisterProtocol", "getRegionByLang", "token", "getUserData", "domain", "getUserProfile", "success", "error", "", "isSaveUserInfoToSql", "getVerificationCode", "codeType", "logOut", "refreshToken", "loginSource", "thirdPlatformId", "resetPassword", "newPassword", "resetPasswordByOldPsw", "oldPassword", "saveLoginInfo", "userId", "loginTime", "", "phoneModel", "saveUserProfileToSql", "sendVerificationCode", "setLoginSuccInfo", "signonReplyInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "signIn", "signOut", "signUp", "sourceId", "updateEmail", "oldAuthCode", "newAuthCode", "newEmail", "updateJHKUserRegisterProtocol", "tosVer", "ppVer", "updateJHLUserRegisterProtocol", "ppVersion", "tosVersion", "updateProfilePhoto", "file", "Ljava/io/File;", "updateUserProfile", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel extends BaseViewModel {
    public final int CHECK_EMAIL_AUTH_CODE = 2;
    public final int CHECK_EMAIL_REGISTER = 1;
    public final int EMAIL_LOGIN = 4;
    public final int EMAIL_REGISTER = 3;
    public final int GET_LANG = 9;
    public final int GET_VER_CODE = 10;
    public final int PROCOTO_GET = 6;
    public final int PROCOTO_REGISTER_UPDATE = 8;
    public final int PROCOTO_USER_GET = 7;
    public final int RESET_PWD_AUTH_CODE = 5;
    @NotNull
    public final Lazy addUPLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$addUPLiveData$2.INSTANCE);
    @NotNull
    public final Lazy changeEmailLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$changeEmailLiveData$2.INSTANCE);
    @NotNull
    public final Lazy checkAuthCodeLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$checkAuthCodeLiveData$2.INSTANCE);
    @NotNull
    public final Lazy checkLoginNameSignLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$checkLoginNameSignLiveData$2.INSTANCE);
    @NotNull
    public final Lazy checkPassLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$checkPassLiveData$2.INSTANCE);
    @NotNull
    public final Lazy checkUpgradeLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$checkUpgradeLiveData$2.INSTANCE);
    @NotNull
    public final Lazy deleteAccountLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$deleteAccountLiveData$2.INSTANCE);
    @NotNull
    public final Lazy downloadFileLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$downloadFileLiveData$2.INSTANCE);
    @NotNull
    public final Lazy forgetPwdLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$forgetPwdLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getJHKRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$getJHKRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getJHKUserRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$getJHKUserRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getJHLRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$getJHLRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getJHLUserRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$getJHLUserRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy getVerificationLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$getVerificationLiveData$2.INSTANCE);
    @NotNull
    public final Lazy queryUpLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$queryUpLiveData$2.INSTANCE);
    @NotNull
    public final Lazy refreshTokenLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$refreshTokenLiveData$2.INSTANCE);
    @NotNull
    public final Lazy regionByLangLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$regionByLangLiveData$2.INSTANCE);
    @NotNull
    public final Lazy resetPswByOldPSWLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$resetPswByOldPSWLiveData$2.INSTANCE);
    @NotNull
    public final Lazy resetPswLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$resetPswLiveData$2.INSTANCE);
    @NotNull
    public final Lazy signInLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$signInLiveData$2.INSTANCE);
    @NotNull
    public final Lazy signOutLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$signOutLiveData$2.INSTANCE);
    @NotNull
    public final Lazy signUpLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$signUpLiveData$2.INSTANCE);
    @NotNull
    public final Lazy thirdSignInBindLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$thirdSignInBindLiveData$2.INSTANCE);
    @NotNull
    public final Lazy thirdSignInLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$thirdSignInLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateJHKUserRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$updateJHKUserRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateJHLUserRegisterProtocolLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$updateJHLUserRegisterProtocolLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateProfilePhotoLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$updateProfilePhotoLiveData$2.INSTANCE);
    @NotNull
    public final Lazy updateUpLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$updateUpLiveData$2.INSTANCE);
    @NotNull
    public final Lazy userDataLiveData$delegate = LazyKt__LazyJVMKt.lazy(AccountViewModel$userDataLiveData$2.INSTANCE);

    private final boolean checkIsLogin() {
        return AppConfig.Companion.getAnonymousLoginToken().length() > 0;
    }

    public static /* synthetic */ void deleteAccount$default(AccountViewModel accountViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        accountViewModel.deleteAccount(str, str2);
    }

    /* access modifiers changed from: private */
    public final void logOut() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$logOut$1(this, (Continuation<? super AccountViewModel$logOut$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void saveUserProfileToSql(UserProfile userProfile) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$saveUserProfileToSql$1(userProfile, (Continuation<? super AccountViewModel$saveUserProfileToSql$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void sendVerificationCode(String str, String str2, String str3) {
        C1524t.m1041e().mo15421l(KeyConst.VER_LAST_GET_TIME, System.currentTimeMillis());
        C1524t.m1041e().mo15423n(KeyConst.VER_LAST_GET_EMAIL, str2);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$sendVerificationCode$1(str, str2, str3, this, (Continuation<? super AccountViewModel$sendVerificationCode$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void setLoginSuccInfo(ClientLoginInfo clientLoginInfo, String str, String str2, String str3, String str4) {
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("login sucess: ", C1502i.m931k(clientLoginInfo, ClientLoginInfo.class)));
        SPManagerKt.setCustomerId(clientLoginInfo.getCustomerId());
        AppConfig.Companion.setAnonymousLoginToken("");
        AccountUtils.Companion.cacheLoginInfo(clientLoginInfo, str2, str, str3, str4);
        AccountUtils.Companion.updateRefreshToken(clientLoginInfo.getRefreshToken(), clientLoginInfo.getCustomerId());
        HiSmart.Companion.getInstance().updateToken(clientLoginInfo.getAccessToken());
        HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
        if (hiSystemParameter != null) {
            hiSystemParameter.setToken(clientLoginInfo.getAccessToken());
        }
        AppConfig.Companion.setAccessToken(clientLoginInfo.getAccessToken());
        SPManagerKt.setEmail(str);
        SPManagerKt.setPsw(str2);
        RefreshTokenUtils.Companion.getInstance().refreshTokenOnTime(clientLoginInfo.getAccessTokenExpiredTime() / 2, SPUtils.INSTANCE.getContext().getApplicationContext());
        EventBus.getDefault().post(KeyConst.REFRESH_TOKEN);
    }

    public final void addUserProfile(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$addUserProfile$1(userProfile, this, (Continuation<? super AccountViewModel$addUserProfile$1>) null), 2, (Object) null);
    }

    public final void anonymousLogin(int i, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "arg");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$anonymousLogin$1(i, this, objArr, (Continuation<? super AccountViewModel$anonymousLogin$1>) null), 2, (Object) null);
    }

    public final void checkAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        Intrinsics.checkNotNullParameter(str3, "delFlag");
        if (checkIsLogin()) {
            updateLoadingStatus(true);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkAuthCode$1(str, str2, str3, this, (Continuation<? super AccountViewModel$checkAuthCode$1>) null), 2, (Object) null);
            return;
        }
        anonymousLogin(this.CHECK_EMAIL_AUTH_CODE, str, str2, str3);
    }

    public final void checkLoginNameSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        if (checkIsLogin()) {
            updateLoadingStatus(true);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkLoginNameSign$1(str, this, (Continuation<? super AccountViewModel$checkLoginNameSign$1>) null), 2, (Object) null);
            return;
        }
        anonymousLogin(this.CHECK_EMAIL_REGISTER, str);
    }

    public final void checkPassExist(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "requestTag");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkPassExist$1(this, str, (Continuation<? super AccountViewModel$checkPassExist$1>) null), 2, (Object) null);
    }

    public final void checkPassword(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        if (checkIsLogin()) {
            updateLoadingStatus(true);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkPassword$1(str, str2, this, (Continuation<? super AccountViewModel$checkPassword$1>) null), 2, (Object) null);
            return;
        }
        anonymousLogin(this.EMAIL_LOGIN, str, str2, "");
    }

    @Deprecated(message = "已废弃，请使用checkUpgradeByPackage")
    public final void checkUpgrade(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkUpgrade$1(str, i, (Continuation<? super AccountViewModel$checkUpgrade$1>) null), 2, (Object) null);
    }

    public final void checkUpgradeByPackage(@NotNull String str, int i, @NotNull String str2, @NotNull Function1<? super CheckUpgradeByPackageResponse, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Intrinsics.checkNotNullParameter(str2, "packageName");
        Intrinsics.checkNotNullParameter(function1, "responseCallback");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$checkUpgradeByPackage$1(str, i, str2, function1, (Continuation<? super AccountViewModel$checkUpgradeByPackage$1>) null), 2, (Object) null);
    }

    public final void deleteAccount(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "password");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$deleteAccount$1(str, str2, this, (Continuation<? super AccountViewModel$deleteAccount$1>) null), 2, (Object) null);
    }

    public final void deleteUserData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(str2, "customerId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$deleteUserData$1(str, str2, (Continuation<? super AccountViewModel$deleteUserData$1>) null), 2, (Object) null);
    }

    public final void downloadFileWithDynamicUrlSync(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(str2, "fileUrl");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$downloadFileWithDynamicUrlSync$1(str2, this, str, (Continuation<? super AccountViewModel$downloadFileWithDynamicUrlSync$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getAddUPLiveData() {
        return (MutableLiveData) this.addUPLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getChangeEmailLiveData() {
        return (MutableLiveData) this.changeEmailLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getCheckAuthCodeLiveData() {
        return (MutableLiveData) this.checkAuthCodeLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getCheckLoginNameSignLiveData() {
        return (MutableLiveData) this.checkLoginNameSignLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Triple<Boolean, String, Boolean>> getCheckPassLiveData() {
        return (MutableLiveData) this.checkPassLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<CheckUpgradeByPackageResponse> getCheckUpgradeLiveData() {
        return (MutableLiveData) this.checkUpgradeLiveData$delegate.getValue();
    }

    public final void getDefaultLanguage() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getDefaultLanguage$1((Continuation<? super AccountViewModel$getDefaultLanguage$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getDeleteAccountLiveData() {
        return (MutableLiveData) this.deleteAccountLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDownloadFileLiveData() {
        return (MutableLiveData) this.downloadFileLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getForgetPwdLiveData() {
        return (MutableLiveData) this.forgetPwdLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, JHKUserAgreementBean>> getGetJHKRegisterProtocolLiveData() {
        return (MutableLiveData) this.getJHKRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, JHKUserAgreementBean>> getGetJHKUserRegisterProtocolLiveData() {
        return (MutableLiveData) this.getJHKUserRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<JHLAgreementData> getGetJHLRegisterProtocolLiveData() {
        return (MutableLiveData) this.getJHLRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, JHLAgreementData>> getGetJHLUserRegisterProtocolLiveData() {
        return (MutableLiveData) this.getJHLUserRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getGetVerificationLiveData() {
        return (MutableLiveData) this.getVerificationLiveData$delegate.getValue();
    }

    @Deprecated(message = "已变更为聚好联协议接口")
    public final void getJHKRegisterProtocol() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getJHKRegisterProtocol$1(this, (Continuation<? super AccountViewModel$getJHKRegisterProtocol$1>) null), 2, (Object) null);
    }

    @Deprecated(message = "已变更为聚好联协议接口")
    public final void getJHKUserRegisterProtocol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "requestType");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getJHKUserRegisterProtocol$1(str, this, (Continuation<? super AccountViewModel$getJHKUserRegisterProtocol$1>) null), 2, (Object) null);
    }

    public final void getJHLRegisterProtocol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        boolean z = true;
        updateLoadingStatus(true);
        Intrinsics.stringPlus("AppConfig.accessToken: ", AppConfig.Companion.getAccessToken());
        Intrinsics.stringPlus("AppConfig.anonymousLoginToken: ", AppConfig.Companion.getAnonymousLoginToken());
        if (!checkIsLogin()) {
            if (!(AppConfig.Companion.getAccessToken().length() > 0)) {
                anonymousLogin(this.PROCOTO_GET, str);
                return;
            }
        }
        if (AppConfig.Companion.getAccessToken().length() <= 0) {
            z = false;
        }
        String accessToken = z ? AppConfig.Companion.getAccessToken() : AppConfig.Companion.getAnonymousLoginToken();
        Intrinsics.stringPlus("token: ", accessToken);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getJHLRegisterProtocol$1(accessToken, str, this, (Continuation<? super AccountViewModel$getJHLRegisterProtocol$1>) null), 2, (Object) null);
    }

    public final void getJHLUserRegisterProtocol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        boolean z = true;
        if (!checkIsLogin()) {
            if (!(AppConfig.Companion.getAccessToken().length() > 0)) {
                anonymousLogin(this.PROCOTO_USER_GET, str);
                return;
            }
        }
        if (AppConfig.Companion.getAccessToken().length() <= 0) {
            z = false;
        }
        AppConfig.Companion companion = AppConfig.Companion;
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getJHLUserRegisterProtocol$1(z ? companion.getAccessToken() : companion.getAnonymousLoginToken(), str, this, (Continuation<? super AccountViewModel$getJHLUserRegisterProtocol$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, UserProfile>> getQueryUpLiveData() {
        return (MutableLiveData) this.queryUpLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getRefreshTokenLiveData() {
        return (MutableLiveData) this.refreshTokenLiveData$delegate.getValue();
    }

    public final void getRegionByLang(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        if (str2 == null || str2.length() == 0) {
            anonymousLogin(this.GET_LANG, str);
        } else {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getRegionByLang$1(str, str2, this, (Continuation<? super AccountViewModel$getRegionByLang$1>) null), 2, (Object) null);
        }
    }

    @NotNull
    public final MutableLiveData<List<Region>> getRegionByLangLiveData() {
        return (MutableLiveData) this.regionByLangLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getResetPswByOldPSWLiveData() {
        return (MutableLiveData) this.resetPswByOldPSWLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getResetPswLiveData() {
        return (MutableLiveData) this.resetPswLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getSignInLiveData() {
        return (MutableLiveData) this.signInLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSignOutLiveData() {
        return (MutableLiveData) this.signOutLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSignUpLiveData() {
        return (MutableLiveData) this.signUpLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getThirdSignInBindLiveData() {
        return (MutableLiveData) this.thirdSignInBindLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getThirdSignInLiveData() {
        return (MutableLiveData) this.thirdSignInLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateJHKUserRegisterProtocolLiveData() {
        return (MutableLiveData) this.updateJHKUserRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateJHLUserRegisterProtocolLiveData() {
        return (MutableLiveData) this.updateJHLUserRegisterProtocolLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateProfilePhotoLiveData() {
        return (MutableLiveData) this.updateProfilePhotoLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Triple<Boolean, String, UserProfile>> getUpdateUpLiveData() {
        return (MutableLiveData) this.updateUpLiveData$delegate.getValue();
    }

    public final void getUserData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "domain");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, (Object) null)) {
            T substring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = substring;
        }
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getUserData$1(objectRef, this, (Continuation<? super AccountViewModel$getUserData$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<String> getUserDataLiveData() {
        return (MutableLiveData) this.userDataLiveData$delegate.getValue();
    }

    public final void getUserProfile(@NotNull Function1<? super UserProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getUserProfile$1(function1, function12, (Continuation<? super AccountViewModel$getUserProfile$1>) null), 2, (Object) null);
    }

    public final void getVerificationCode(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "codeType");
        boolean z = true;
        updateLoadingStatus(true);
        if (!checkIsLogin()) {
            if (!(AppConfig.Companion.getAccessToken().length() > 0)) {
                anonymousLogin(this.GET_VER_CODE, str, str2);
                return;
            }
        }
        if (AppConfig.Companion.getAnonymousLoginToken().length() <= 0) {
            z = false;
        }
        sendVerificationCode(z ? AppConfig.Companion.getAnonymousLoginToken() : AppConfig.Companion.getAccessToken(), str, str2);
    }

    public final void refreshToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "refreshToken");
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, "password");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "loginSource");
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str7, "thirdPlatformId");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$refreshToken$1(str, this, str2, str3, str6, str7, (Continuation<? super AccountViewModel$refreshToken$1>) null), 2, (Object) null);
    }

    public final void resetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        if (str3.length() < 8) {
            ToastUtils.m9582A(SPUtils.INSTANCE.getContext().getString(R$string.password_to_short), new Object[0]);
        } else if (checkIsLogin()) {
            updateLoadingStatus(true);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$resetPassword$1(str, str2, str3, this, (Continuation<? super AccountViewModel$resetPassword$1>) null), 2, (Object) null);
        } else {
            anonymousLogin(this.RESET_PWD_AUTH_CODE, str, str2, str3);
        }
    }

    public final void resetPasswordByOldPsw(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "oldPassword");
        Intrinsics.checkNotNullParameter(str3, "newPassword");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$resetPasswordByOldPsw$1(str, str2, str3, this, (Continuation<? super AccountViewModel$resetPasswordByOldPsw$1>) null), 2, (Object) null);
    }

    public final void saveLoginInfo(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "phoneModel");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$saveLoginInfo$1(str, j, str2, this, (Continuation<? super AccountViewModel$saveLoginInfo$1>) null), 2, (Object) null);
    }

    public final void signIn(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        signIn(str, str2, "");
    }

    public final void signOut() {
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$signOut$1(this, (Continuation<? super AccountViewModel$signOut$1>) null), 2, (Object) null);
    }

    public final void signUp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "loginName");
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "authCode");
        Intrinsics.checkNotNullParameter(str4, "sourceId");
        if (str2.length() < 8) {
            ToastUtils.m9582A(SPUtils.INSTANCE.getContext().getString(R$string.password_to_short), new Object[0]);
        } else if (checkIsLogin()) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$signUp$1(str, str2, str3, this, (Continuation<? super AccountViewModel$signUp$1>) null), 2, (Object) null);
        } else {
            anonymousLogin(this.EMAIL_REGISTER, str, str2, str3, AppConfig.Companion.getJhlDevSerial());
        }
    }

    public final void updateEmail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "password");
        Intrinsics.checkNotNullParameter(str2, "oldAuthCode");
        Intrinsics.checkNotNullParameter(str3, "newAuthCode");
        Intrinsics.checkNotNullParameter(str4, "newEmail");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "newPassword");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$updateEmail$1(str, str2, str3, str4, str6, this, (Continuation<? super AccountViewModel$updateEmail$1>) null), 2, (Object) null);
    }

    @Deprecated(message = "已变更为聚好联协议接口")
    public final void updateJHKUserRegisterProtocol(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "tosVer");
        Intrinsics.checkNotNullParameter(str2, "ppVer");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$updateJHKUserRegisterProtocol$1(str, str2, this, (Continuation<? super AccountViewModel$updateJHKUserRegisterProtocol$1>) null), 2, (Object) null);
    }

    public final void updateJHLUserRegisterProtocol(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "ppVersion");
        Intrinsics.checkNotNullParameter(str2, "tosVersion");
        boolean z = true;
        if (!checkIsLogin()) {
            if (!(AppConfig.Companion.getAccessToken().length() > 0)) {
                anonymousLogin(this.PROCOTO_REGISTER_UPDATE, str, str2);
                return;
            }
        }
        if (AppConfig.Companion.getAccessToken().length() <= 0) {
            z = false;
        }
        AppConfig.Companion companion = AppConfig.Companion;
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$updateJHLUserRegisterProtocol$1(z ? companion.getAccessToken() : companion.getAnonymousLoginToken(), str, str2, this, (Continuation<? super AccountViewModel$updateJHLUserRegisterProtocol$1>) null), 2, (Object) null);
    }

    public final void updateProfilePhoto(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$updateProfilePhoto$1(file, this, (Continuation<? super AccountViewModel$updateProfilePhoto$1>) null), 2, (Object) null);
    }

    public final void updateUserProfile(@NotNull UserProfile userProfile, @NotNull String str) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(str, "requestTag");
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$updateUserProfile$1(userProfile, str, this, (Continuation<? super AccountViewModel$updateUserProfile$1>) null), 2, (Object) null);
    }

    public final void getUserProfile(boolean z) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$getUserProfile$2(this, z, (Continuation<? super AccountViewModel$getUserProfile$2>) null), 2, (Object) null);
    }

    public final void signIn(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "authCode");
        if (checkIsLogin()) {
            updateLoadingStatus(true);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AccountViewModel$signIn$1(str, str2, str3, this, (Continuation<? super AccountViewModel$signIn$1>) null), 2, (Object) null);
            return;
        }
        anonymousLogin(this.EMAIL_LOGIN, str, str2, str3);
    }
}
