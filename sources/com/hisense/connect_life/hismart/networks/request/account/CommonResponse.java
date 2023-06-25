package com.hisense.connect_life.hismart.networks.request.account;

import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/CommonResponse;", "", "tag", "", "pair", "Lkotlin/Pair;", "", "(Ljava/lang/String;Lkotlin/Pair;)V", "getPair", "()Lkotlin/Pair;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChinaBeans.kt */
public final class CommonResponse {
    @NotNull
    public final Pair<Boolean, String> pair;
    @NotNull
    public final String tag;

    public CommonResponse(@NotNull String str, @NotNull Pair<Boolean, String> pair2) {
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        Intrinsics.checkNotNullParameter(pair2, "pair");
        this.tag = str;
        this.pair = pair2;
    }

    public static /* synthetic */ CommonResponse copy$default(CommonResponse commonResponse, String str, Pair<Boolean, String> pair2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonResponse.tag;
        }
        if ((i & 2) != 0) {
            pair2 = commonResponse.pair;
        }
        return commonResponse.copy(str, pair2);
    }

    @NotNull
    public final String component1() {
        return this.tag;
    }

    @NotNull
    public final Pair<Boolean, String> component2() {
        return this.pair;
    }

    @NotNull
    public final CommonResponse copy(@NotNull String str, @NotNull Pair<Boolean, String> pair2) {
        Intrinsics.checkNotNullParameter(str, FragmentDescriptor.TAG_ATTRIBUTE_NAME);
        Intrinsics.checkNotNullParameter(pair2, "pair");
        return new CommonResponse(str, pair2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonResponse)) {
            return false;
        }
        CommonResponse commonResponse = (CommonResponse) obj;
        return Intrinsics.areEqual((Object) this.tag, (Object) commonResponse.tag) && Intrinsics.areEqual((Object) this.pair, (Object) commonResponse.pair);
    }

    @NotNull
    public final Pair<Boolean, String> getPair() {
        return this.pair;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.pair.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommonResponse(tag=" + this.tag + ", pair=" + this.pair + ')';
    }
}
