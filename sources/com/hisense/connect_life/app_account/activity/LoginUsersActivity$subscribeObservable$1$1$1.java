package com.hisense.connect_life.app_account.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p040c.p072c.p073a.p074a.C1506m;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUsersActivity.kt */
public final class LoginUsersActivity$subscribeObservable$1$1$1 extends Lambda implements Function1<Boolean, Unit> {
    public static final LoginUsersActivity$subscribeObservable$1$1$1 INSTANCE = new LoginUsersActivity$subscribeObservable$1$1$1();

    public LoginUsersActivity$subscribeObservable$1$1$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            C1506m.m960j("退出三方登录");
        }
    }
}
