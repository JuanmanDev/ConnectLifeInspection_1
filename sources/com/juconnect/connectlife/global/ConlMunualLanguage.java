package com.juconnect.connectlife.global;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connectlife/global/ConlMunualLanguage;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SL", "NL", "EN", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConlMunualLanguage.kt */
public enum ConlMunualLanguage {
    SL("SL"),
    NL("NL"),
    EN("EN");
    
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public final String type;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connectlife/global/ConlMunualLanguage$Companion;", "", "()V", "fromType", "Lcom/juconnect/connectlife/global/ConlMunualLanguage;", "type", "", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConlMunualLanguage.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConlMunualLanguage fromType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "type");
            if (Intrinsics.areEqual((Object) str, (Object) ConlMunualLanguage.SL.getType())) {
                return ConlMunualLanguage.SL;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ConlMunualLanguage.NL.getType())) {
                return ConlMunualLanguage.NL;
            }
            if (Intrinsics.areEqual((Object) str, (Object) ConlMunualLanguage.EN.getType())) {
                return ConlMunualLanguage.EN;
            }
            throw new Throwable("ConlMunualLanguage isn't exist for " + str + PublicSuffixDatabase.EXCEPTION_MARKER);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ConlMunualLanguage(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
