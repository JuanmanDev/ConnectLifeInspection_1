package com.hisense.juconnect.app_device.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineLabelScannerActivity.kt */
public final class WineLabelScannerActivity$pathLabel$2 extends Lambda implements Function0<String> {
    public final /* synthetic */ WineLabelScannerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelScannerActivity$pathLabel$2(WineLabelScannerActivity wineLabelScannerActivity) {
        super(0);
        this.this$0 = wineLabelScannerActivity;
    }

    public final String invoke() {
        return this.this$0.getFileLabel().getPath();
    }
}
