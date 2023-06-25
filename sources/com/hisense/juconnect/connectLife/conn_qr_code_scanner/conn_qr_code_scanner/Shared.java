package com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/juconnect/connectLife/conn_qr_code_scanner/conn_qr_code_scanner/Shared;", "", "()V", "CAMERA_REQUEST_ID", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "getBinding", "()Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "setBinding", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "getRegistrar", "()Lio/flutter/plugin/common/PluginRegistry$Registrar;", "setRegistrar", "(Lio/flutter/plugin/common/PluginRegistry$Registrar;)V", "conn_qr_code_scanner_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Shared.kt */
public final class Shared {
    public static final int CAMERA_REQUEST_ID = 513469796;
    @NotNull
    public static final Shared INSTANCE = new Shared();
    @Nullable
    public static Activity activity;
    @Nullable
    public static C8950c binding;
    @Nullable
    public static C9024l.C9027c registrar;

    @Nullable
    public final Activity getActivity() {
        return activity;
    }

    @Nullable
    public final C8950c getBinding() {
        return binding;
    }

    @Nullable
    public final C9024l.C9027c getRegistrar() {
        return registrar;
    }

    public final void setActivity(@Nullable Activity activity2) {
        activity = activity2;
    }

    public final void setBinding(@Nullable C8950c cVar) {
        binding = cVar;
    }

    public final void setRegistrar(@Nullable C9024l.C9027c cVar) {
        registrar = cVar;
    }
}
