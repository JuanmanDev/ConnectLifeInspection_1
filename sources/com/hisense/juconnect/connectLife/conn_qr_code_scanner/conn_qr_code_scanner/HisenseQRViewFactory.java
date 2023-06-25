package com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner;

import android.content.Context;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9031m;
import p553f.p554a.p570e.p575e.C9055e;
import p553f.p554a.p570e.p575e.C9056f;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo47991d2 = {"Lcom/hisense/juconnect/connectLife/conn_qr_code_scanner/conn_qr_code_scanner/HisenseQRViewFactory;", "Lio/flutter/plugin/platform/PlatformViewFactory;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "create", "Lio/flutter/plugin/platform/PlatformView;", "context", "Landroid/content/Context;", "viewId", "", "args", "", "conn_qr_code_scanner_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HisenseQRViewFactory.kt */
public final class HisenseQRViewFactory extends C9056f {
    @NotNull
    public final C9003c messenger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HisenseQRViewFactory(@NotNull C9003c cVar) {
        super(C9031m.f17698a);
        Intrinsics.checkNotNullParameter(cVar, "messenger");
        this.messenger = cVar;
    }

    @NotNull
    public C9055e create(@Nullable Context context, int i, @Nullable Object obj) {
        if (obj != null) {
            return new HisenseQRView(this.messenger, i, (HashMap) obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
    }
}
