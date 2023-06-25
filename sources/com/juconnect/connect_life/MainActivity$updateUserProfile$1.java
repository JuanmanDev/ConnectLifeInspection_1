package com.juconnect.connect_life;

import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.juconnect.connect_life.global.AccountChannel;
import com.juconnect.connect_life.model.ChannelResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$updateUserProfile$1 extends Lambda implements Function1<UserProfile, Unit> {
    public static final MainActivity$updateUserProfile$1 INSTANCE = new MainActivity$updateUserProfile$1();

    public MainActivity$updateUserProfile$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UserProfile) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable UserProfile userProfile) {
        String j = C1502i.m930j(new ChannelResponse(userProfile, 0, 0, (String) null, 14, (DefaultConstructorMarker) null));
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c("updateUserProfileCallback", j);
        }
    }
}
