package com.juconnect.connect_life;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p040c.p301y.p508a.C7722n;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$connectWifiOfDevice$1 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ Ref.BooleanRef $isGetResult;
    public final /* synthetic */ C9017j.C9022d $result;
    public final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainActivity$connectWifiOfDevice$1(MainActivity mainActivity, Ref.BooleanRef booleanRef, C9017j.C9022d dVar) {
        super(1);
        this.this$0 = mainActivity;
        this.$isGetResult = booleanRef;
        this.$result = dVar;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m27237invoke$lambda0(Ref.BooleanRef booleanRef, C9017j.C9022d dVar, String str) {
        Intrinsics.checkNotNullParameter(booleanRef, "$isGetResult");
        Intrinsics.checkNotNullParameter(str, "$it");
        if (!booleanRef.element) {
            if (dVar != null) {
                dVar.success(str);
            }
            booleanRef.element = true;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
        this.this$0.runOnUiThread(new C7722n(this.$isGetResult, this.$result, str));
    }
}
