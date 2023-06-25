package com.internationalwinecooler.p529ui.inventory;

import com.hisense.juconnect.connectlife.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/WineTypeMap;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.inventory.WineTypeMap */
/* compiled from: WineTypeMap.kt */
public final class WineTypeMap {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Map<String, String> wineTypeMap = MapsKt__MapsKt.mutableMapOf(TuplesKt.m25743to("1", C1527w.m1063b(R.string.red)), TuplesKt.m25743to("2", C1527w.m1063b(R.string.white)), TuplesKt.m25743to("3", C1527w.m1063b(R.string.sparkling)), TuplesKt.m25743to("4", C1527w.m1063b(R.string.rose)), TuplesKt.m25743to("5", C1527w.m1063b(R.string.dessert)), TuplesKt.m25743to("6", C1527w.m1063b(R.string.fortified)), TuplesKt.m25743to("7", C1527w.m1063b(R.string.unknow)));

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/inventory/WineTypeMap$Companion;", "", "()V", "wineTypeMap", "", "", "kotlin.jvm.PlatformType", "getWineTypeMap", "()Ljava/util/Map;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: com.internationalwinecooler.ui.inventory.WineTypeMap$Companion */
    /* compiled from: WineTypeMap.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<String, String> getWineTypeMap() {
            return WineTypeMap.wineTypeMap;
        }
    }
}
