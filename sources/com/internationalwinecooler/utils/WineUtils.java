package com.internationalwinecooler.utils;

import android.content.Context;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.juconnect.connectlife.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/internationalwinecooler/utils/WineUtils;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineUtils.kt */
public final class WineUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u000e"}, mo47991d2 = {"Lcom/internationalwinecooler/utils/WineUtils$Companion;", "", "()V", "getWineNameString", "", "wineId", "", "wineNameToType", "wineName", "context", "Landroid/content/Context;", "wineTypeMapWineName", "type", "wineTypeToLocalLanguage", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WineUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getWineNameString(int i) {
            String string = AppConfig.Companion.getApplication().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "AppConfig.application.getString(wineId)");
            return string;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final int wineTypeMapWineName(java.lang.String r2) {
            /*
                r1 = this;
                int r0 = r2.hashCode()
                switch(r0) {
                    case 49: goto L_0x0049;
                    case 50: goto L_0x003c;
                    case 51: goto L_0x002f;
                    case 52: goto L_0x0022;
                    case 53: goto L_0x0015;
                    case 54: goto L_0x0008;
                    default: goto L_0x0007;
                }
            L_0x0007:
                goto L_0x0056
            L_0x0008:
                java.lang.String r0 = "6"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0011
                goto L_0x0056
            L_0x0011:
                r2 = 2131821162(0x7f11026a, float:1.927506E38)
                goto L_0x0059
            L_0x0015:
                java.lang.String r0 = "5"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x001e
                goto L_0x0056
            L_0x001e:
                r2 = 2131821066(0x7f11020a, float:1.9274865E38)
                goto L_0x0059
            L_0x0022:
                java.lang.String r0 = "4"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x002b
                goto L_0x0056
            L_0x002b:
                r2 = 2131821585(0x7f110411, float:1.9275917E38)
                goto L_0x0059
            L_0x002f:
                java.lang.String r0 = "3"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0038
                goto L_0x0056
            L_0x0038:
                r2 = 2131821779(0x7f1104d3, float:1.927631E38)
                goto L_0x0059
            L_0x003c:
                java.lang.String r0 = "2"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0045
                goto L_0x0056
            L_0x0045:
                r2 = 2131821910(0x7f110556, float:1.9276577E38)
                goto L_0x0059
            L_0x0049:
                java.lang.String r0 = "1"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0052
                goto L_0x0056
            L_0x0052:
                r2 = 2131821518(0x7f1103ce, float:1.9275781E38)
                goto L_0x0059
            L_0x0056:
                r2 = 2131821864(0x7f110528, float:1.9276483E38)
            L_0x0059:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.utils.WineUtils.Companion.wineTypeMapWineName(java.lang.String):int");
        }

        public final int wineNameToType(@NotNull String str, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(str, "wineName");
            Intrinsics.checkNotNullParameter(context, "context");
            if (Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.red_wine))) {
                return 1;
            }
            if (Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.white_wine))) {
                return 2;
            }
            if (Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.sparkling_wine))) {
                return 3;
            }
            if (Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.rose_wine))) {
                return 4;
            }
            if (Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.dessert_wine))) {
                return 5;
            }
            return Intrinsics.areEqual((Object) str, (Object) context.getString(R.string.fortified_wine)) ? 6 : 7;
        }

        @NotNull
        public final String wineTypeToLocalLanguage(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "type");
            String string = context.getString(wineTypeMapWineName(str));
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(wineTypeMapWineName(type))");
            return string;
        }
    }
}
