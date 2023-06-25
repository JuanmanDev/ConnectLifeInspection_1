package com.hisense.connect_life.core.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/BitmapUtils;", "", "()V", "base64ToBitmap", "Landroid/graphics/Bitmap;", "base64Data", "", "bitmapToBase64", "bitmap", "fileToBase64", "file", "Ljava/io/File;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BitmapUtils.kt */
public final class BitmapUtils {
    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    @NotNull
    public final Bitmap base64ToBitmap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "base64Data");
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
        return decodeByteArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[SYNTHETIC, Splitter:B:14:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String bitmapToBase64(@org.jetbrains.annotations.Nullable android.graphics.Bitmap r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0047
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r1.<init>()     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0020 }
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch:{ IOException -> 0x0020 }
            r1.flush()     // Catch:{ IOException -> 0x0020 }
            r1.close()     // Catch:{ IOException -> 0x0020 }
            byte[] r5 = r1.toByteArray()     // Catch:{ IOException -> 0x0020 }
            r2 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ IOException -> 0x0020 }
            r0 = r1
            goto L_0x0048
        L_0x0020:
            r5 = move-exception
            goto L_0x0026
        L_0x0022:
            r5 = move-exception
            goto L_0x0039
        L_0x0024:
            r5 = move-exception
            r1 = r0
        L_0x0026:
            r5.printStackTrace()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0056
            r1.flush()     // Catch:{ IOException -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0056
        L_0x0032:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0056
        L_0x0037:
            r5 = move-exception
            r0 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x0046
            r0.flush()     // Catch:{ IOException -> 0x0042 }
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            throw r5
        L_0x0047:
            r5 = r0
        L_0x0048:
            if (r0 == 0) goto L_0x0055
            r0.flush()     // Catch:{ IOException -> 0x0051 }
            r0.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0055:
            r0 = r5
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.core.utils.BitmapUtils.bitmapToBase64(android.graphics.Bitmap):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061 A[Catch:{ IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[SYNTHETIC, Splitter:B:32:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071 A[Catch:{ IOException -> 0x0075 }] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String fileToBase64(@org.jetbrains.annotations.Nullable java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r1.<init>()     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r2.<init>(r7)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            byte[] r7 = kotlin.p639io.ByteStreamsKt.readBytes(r2)     // Catch:{ IOException -> 0x0048 }
            r1.write(r7)     // Catch:{ IOException -> 0x0048 }
            r1.flush()     // Catch:{ IOException -> 0x0048 }
            byte[] r7 = r1.toByteArray()     // Catch:{ IOException -> 0x0048 }
            com.hisense.connect_life.core.utils.LogUtilsShen$Companion r3 = com.hisense.connect_life.core.utils.LogUtilsShen.Companion     // Catch:{ IOException -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048 }
            r4.<init>()     // Catch:{ IOException -> 0x0048 }
            java.lang.String r5 = "addWine fileToBase64图片的大小 "
            r4.append(r5)     // Catch:{ IOException -> 0x0048 }
            int r5 = r7.length     // Catch:{ IOException -> 0x0048 }
            int r5 = r5 / 1024
            r4.append(r5)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r5 = "kb"
            r4.append(r5)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0048 }
            r3.mo39138e(r4)     // Catch:{ IOException -> 0x0048 }
            r3 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r7, r3)     // Catch:{ IOException -> 0x0048 }
            r1.close()     // Catch:{ IOException -> 0x0043 }
            r2.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0065
        L_0x0043:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x0065
        L_0x0048:
            r7 = move-exception
            goto L_0x0056
        L_0x004a:
            r7 = move-exception
            r2 = r0
            goto L_0x0067
        L_0x004d:
            r7 = move-exception
            r2 = r0
            goto L_0x0056
        L_0x0050:
            r7 = move-exception
            r2 = r0
            goto L_0x0068
        L_0x0053:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0056:
            r7.printStackTrace()     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r1.close()     // Catch:{ IOException -> 0x0043 }
        L_0x005f:
            if (r2 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0065:
            return r0
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            r0 = r1
        L_0x0068:
            if (r0 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r0.close()     // Catch:{ IOException -> 0x0075 }
        L_0x006e:
            if (r2 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r2.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0079:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.core.utils.BitmapUtils.fileToBase64(java.io.File):java.lang.String");
    }
}
