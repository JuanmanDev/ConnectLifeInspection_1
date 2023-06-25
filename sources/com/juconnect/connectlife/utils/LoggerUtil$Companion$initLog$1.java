package com.juconnect.connectlife.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p040c.p525z.p526a.C7815a;
import p040c.p525z.p526a.C7822h;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/juconnect/connectlife/utils/LoggerUtil$Companion$initLog$1", "Lcom/orhanobut/logger/AndroidLogAdapter;", "isLoggable", "", "priority", "", "tag", "", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoggerUtil.kt */
public final class LoggerUtil$Companion$initLog$1 extends C7815a {
    public final /* synthetic */ C7822h $formatStrategy;
    public final /* synthetic */ boolean $isLogEnable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggerUtil$Companion$initLog$1(C7822h hVar, boolean z) {
        super(hVar);
        this.$formatStrategy = hVar;
        this.$isLogEnable = z;
    }

    public boolean isLoggable(int i, @Nullable String str) {
        return this.$isLogEnable;
    }
}
