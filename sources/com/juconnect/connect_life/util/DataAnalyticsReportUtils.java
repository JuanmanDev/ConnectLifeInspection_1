package com.juconnect.connect_life.util;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hisense.connect_life.core.global.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/DataAnalyticsReportUtils;", "", "()V", "report", "", "key", "", "value", "Landroid/os/Bundle;", "reportLogEvent", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DataAnalyticsReportUtils.kt */
public final class DataAnalyticsReportUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static volatile DataAnalyticsReportUtils instance;
    public static FirebaseAnalytics mFirebaseAnalytics;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/DataAnalyticsReportUtils$Companion;", "", "()V", "<set-?>", "Lcom/juconnect/connect_life/util/DataAnalyticsReportUtils;", "instance", "getInstance", "()Lcom/juconnect/connect_life/util/DataAnalyticsReportUtils;", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DataAnalyticsReportUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DataAnalyticsReportUtils getInstance() {
            if (DataAnalyticsReportUtils.instance == null) {
                DataAnalyticsReportUtils.instance = new DataAnalyticsReportUtils((DefaultConstructorMarker) null);
            }
            return DataAnalyticsReportUtils.instance;
        }
    }

    public DataAnalyticsReportUtils() {
        FirebaseAnalytics instance2 = FirebaseAnalytics.getInstance(AppConfig.Companion.getApplication());
        Intrinsics.checkNotNullExpressionValue(instance2, "getInstance(AppConfig.application)");
        mFirebaseAnalytics = instance2;
    }

    public /* synthetic */ DataAnalyticsReportUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void report$default(DataAnalyticsReportUtils dataAnalyticsReportUtils, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        dataAnalyticsReportUtils.report(str, bundle);
    }

    public static /* synthetic */ void reportLogEvent$default(DataAnalyticsReportUtils dataAnalyticsReportUtils, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        dataAnalyticsReportUtils.reportLogEvent(str, bundle);
    }

    @JvmOverloads
    public final void report(@Nullable String str) {
        report$default(this, str, (Bundle) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void report(@Nullable String str, @Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        FirebaseAnalytics firebaseAnalytics = mFirebaseAnalytics;
        if (firebaseAnalytics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirebaseAnalytics");
            firebaseAnalytics = null;
        }
        Intrinsics.checkNotNull(str);
        firebaseAnalytics.mo37291a(str, bundle);
    }

    @JvmOverloads
    public final void reportLogEvent(@Nullable String str) {
        reportLogEvent$default(this, str, (Bundle) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void reportLogEvent(@Nullable String str, @Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        FirebaseAnalytics firebaseAnalytics = mFirebaseAnalytics;
        if (firebaseAnalytics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFirebaseAnalytics");
            firebaseAnalytics = null;
        }
        Intrinsics.checkNotNull(str);
        firebaseAnalytics.mo37291a(str, bundle);
    }
}
