package com.hisense.connect_life.core.extentions;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavInflater;
import com.alibaba.android.arouter.facade.Postcard;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.DialogManager;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH\bø\u0001\u0000\u001a\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a=\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH\bø\u0001\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a*\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001\u001a:\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001\u001a0\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0\u0019\u001a\u0012\u0010\u001b\u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u001a\u0010\u001b\u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u0012\u0010 \u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u001a\u0010 \u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0001\u001a/\u0010!\u001a\u00020\u0007*\u00020\"2#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\n\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006'"}, mo47991d2 = {"h5Paths", "", "getDebugOrReleaseUrl", "context", "Landroid/content/Context;", "getLanguage", "navigation", "", "path", "post", "Lkotlin/Function1;", "Lcom/alibaba/android/arouter/facade/Postcard;", "Lkotlin/ExtensionFunctionType;", "navigationForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "buildAssetUrl", "language", "from", "auid", "wifiId", "deviceName", "params", "", "", "dismissDialog", "Landroidx/fragment/app/DialogFragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "tag", "displayDialog", "singleClickListener", "Landroid/view/View;", "action", "Lkotlin/ParameterName;", "name", "v", "core_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuConnectExt.kt */
public final class JuConnectExtKt {
    @NotNull
    public static final String h5Paths = "file:///android_asset/wine/index.html#/";

    @NotNull
    public static final String buildAssetUrl(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String str2 = getDebugOrReleaseUrl(context) + str;
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
        return str2;
    }

    public static /* synthetic */ String buildAssetUrl$default(String str, Context context, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return buildAssetUrl(str, context, str2, map);
    }

    public static final void dismissDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        DialogManager.INSTANCE.displayDialog(dialogFragment, fragmentManager);
    }

    public static final void displayDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        DialogManager.INSTANCE.displayDialog(dialogFragment, fragmentManager);
    }

    @Nullable
    public static final String getDebugOrReleaseUrl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir((String) null);
        Intrinsics.checkNotNull(externalFilesDir);
        Intrinsics.stringPlus(externalFilesDir.getPath(), "/hmctdevdebug");
        return h5Paths;
    }

    @NotNull
    public static final String getLanguage() {
        if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_CN)) {
            return "zh_cn";
        }
        if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.zh_TW_HK)) {
            return "zh_tw";
        }
        if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.f15944en)) {
            return LanguageConstKt.f15944en;
        }
        return SPManagerKt.getLanguageType();
    }

    public static final void navigation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        C1337a.m211c().mo15011a(str).navigation();
    }

    public static final void navigationForResult(@NotNull String str, @NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(str, "path");
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C1337a.m211c().mo15011a(str).navigation(activity, i);
    }

    public static final void singleClickListener(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function1, NavInflater.TAG_ACTION);
        view.setOnClickListener(new JuConnectExtKt$singleClickListener$1(function1));
    }

    public static final void dismissDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        DialogManager.INSTANCE.displayDialog(dialogFragment, fragmentManager, str);
    }

    public static final void displayDialog(@NotNull DialogFragment dialogFragment, @NotNull FragmentManager fragmentManager, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        DialogManager.INSTANCE.displayDialog(dialogFragment, fragmentManager, str);
    }

    public static final void navigation(@NotNull String str, @NotNull Function1<? super Postcard, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "path");
        Intrinsics.checkNotNullParameter(function1, "post");
        Postcard a = C1337a.m211c().mo15011a(str);
        function1.invoke(a);
        a.navigation();
    }

    public static final void navigationForResult(@NotNull String str, @NotNull Activity activity, int i, @NotNull Function1<? super Postcard, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "path");
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intrinsics.checkNotNullParameter(function1, "post");
        Postcard a = C1337a.m211c().mo15011a(str);
        function1.invoke(a);
        a.navigation(activity, i);
    }

    @NotNull
    public static final String buildAssetUrl(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "language");
        Intrinsics.checkNotNullParameter(map, "params");
        Intrinsics.stringPlus(SPManagerKt.getLanguageType(), "语言");
        String languageType = SPManagerKt.getLanguageType();
        if (Intrinsics.areEqual((Object) languageType, (Object) LanguageConstKt.zh_CN)) {
            languageType = "zh_cn";
        }
        if (Intrinsics.areEqual((Object) languageType, (Object) LanguageConstKt.zh_TW_HK)) {
            languageType = "zh_tw";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getDebugOrReleaseUrl(context));
        sb.append(str);
        sb.append("?");
        sb.append(Intrinsics.stringPlus("language=", languageType));
        sb.append("&from=android");
        for (Map.Entry next : map.entrySet()) {
            sb.append(Typography.amp + ((String) next.getKey()) + '=' + next.getValue());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public static final String buildAssetUrl(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "language");
        Intrinsics.checkNotNullParameter(str3, "from");
        Intrinsics.checkNotNullParameter(str4, KeyConst.KEY_AUIT);
        Intrinsics.stringPlus(SPManagerKt.getLanguageType(), "语言");
        String str5 = getDebugOrReleaseUrl(context) + str + "?" + Intrinsics.stringPlus("language=", getLanguage()) + Intrinsics.stringPlus("&from=", str3) + Intrinsics.stringPlus("&auid=", str4);
        Intrinsics.checkNotNullExpressionValue(str5, "StringBuilder().apply(builderAction).toString()");
        return str5;
    }

    @NotNull
    public static final String buildAssetUrl(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "language");
        Intrinsics.checkNotNullParameter(str3, "from");
        Intrinsics.checkNotNullParameter(str4, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str5, EventBusConstKt.WIFIID);
        Intrinsics.stringPlus(SPManagerKt.getLanguageType(), "语言");
        String str6 = getDebugOrReleaseUrl(context) + str + "?" + Intrinsics.stringPlus("language=", getLanguage()) + Intrinsics.stringPlus("&from=", str3) + Intrinsics.stringPlus("&auid=", str4) + Intrinsics.stringPlus("&wifiId=", str5);
        Intrinsics.checkNotNullExpressionValue(str6, "StringBuilder().apply(builderAction).toString()");
        return str6;
    }

    @NotNull
    public static final String buildAssetUrl(@NotNull String str, @NotNull Context context, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "language");
        Intrinsics.checkNotNullParameter(str3, "from");
        Intrinsics.checkNotNullParameter(str4, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str5, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str6, "deviceName");
        Intrinsics.stringPlus(SPManagerKt.getLanguageType(), "语言");
        String str7 = getDebugOrReleaseUrl(context) + str + "?" + Intrinsics.stringPlus("language=", getLanguage());
        Intrinsics.checkNotNullExpressionValue(str7, "StringBuilder().apply(builderAction).toString()");
        return str7;
    }
}
