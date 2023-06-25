package com.hisense.connect_life.hismart.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/utils/SaveFileUtils;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SaveFileUtils.kt */
public final class SaveFileUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/utils/SaveFileUtils$Companion;", "", "()V", "writeBytesToFile", "", "content", "", "destFile", "Ljava/io/File;", "writeFileToSDCard", "fileName", "", "dirPath", "responseBody", "Lokhttp3/ResponseBody;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: SaveFileUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0058 A[SYNTHETIC, Splitter:B:34:0x0058] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[Catch:{ IOException -> 0x0062 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[Catch:{ IOException -> 0x0062 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeBytesToFile(@org.jetbrains.annotations.NotNull byte[] r4, @org.jetbrains.annotations.NotNull java.io.File r5) {
            /*
                r3 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "destFile"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                boolean r1 = r5.exists()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                r2 = 1
                if (r1 != 0) goto L_0x0017
                boolean r1 = r5.createNewFile()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                if (r1 == 0) goto L_0x002c
                r1 = 0
                okio.Sink r5 = okio.Okio__JvmOkioKt.sink$default(r5, r1, r2, r0)     // Catch:{ IOException -> 0x0042, all -> 0x003f }
                okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r5)     // Catch:{ IOException -> 0x002a }
                r0.write((byte[]) r4)     // Catch:{ IOException -> 0x002a }
                r0.flush()     // Catch:{ IOException -> 0x002a }
                goto L_0x002d
            L_0x002a:
                r4 = move-exception
                goto L_0x0044
            L_0x002c:
                r5 = r0
            L_0x002d:
                if (r0 != 0) goto L_0x0030
                goto L_0x0033
            L_0x0030:
                r0.close()     // Catch:{ IOException -> 0x003a }
            L_0x0033:
                if (r5 != 0) goto L_0x0036
                goto L_0x0053
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x0053
            L_0x003a:
                r4 = move-exception
                r4.printStackTrace()
                goto L_0x0053
            L_0x003f:
                r4 = move-exception
                r5 = r0
                goto L_0x0055
            L_0x0042:
                r4 = move-exception
                r5 = r0
            L_0x0044:
                r4.printStackTrace()     // Catch:{ all -> 0x0054 }
                if (r0 != 0) goto L_0x004a
                goto L_0x004d
            L_0x004a:
                r0.close()     // Catch:{ IOException -> 0x003a }
            L_0x004d:
                if (r5 != 0) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x003a }
            L_0x0053:
                return
            L_0x0054:
                r4 = move-exception
            L_0x0055:
                if (r0 != 0) goto L_0x0058
                goto L_0x005b
            L_0x0058:
                r0.close()     // Catch:{ IOException -> 0x0062 }
            L_0x005b:
                if (r5 != 0) goto L_0x005e
                goto L_0x0066
            L_0x005e:
                r5.close()     // Catch:{ IOException -> 0x0062 }
                goto L_0x0066
            L_0x0062:
                r5 = move-exception
                r5.printStackTrace()
            L_0x0066:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.utils.SaveFileUtils.Companion.writeBytesToFile(byte[], java.io.File):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC, Splitter:B:29:0x007c] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC, Splitter:B:32:0x0083] */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeFileToSDCard(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull okhttp3.ResponseBody r6) {
            /*
                r3 = this;
                java.lang.String r0 = "fileName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "dirPath"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "responseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.io.File r0 = new java.io.File
                r0.<init>(r5)
                boolean r1 = r0.exists()
                if (r1 != 0) goto L_0x0023
                boolean r1 = r0.isDirectory()
                if (r1 != 0) goto L_0x0023
                r0.mkdirs()
            L_0x0023:
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                r5 = 47
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                boolean r4 = r0.exists()
                if (r4 != 0) goto L_0x0045
                r0.createNewFile()
            L_0x0045:
                java.io.InputStream r4 = r6.byteStream()
                r5 = 4096(0x1000, float:5.74E-42)
                byte[] r5 = new byte[r5]
                r6 = 0
                r1 = 0
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0075 }
                r2.<init>(r0)     // Catch:{ IOException -> 0x0075 }
            L_0x0054:
                int r6 = r4.read(r5)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
                if (r6 <= 0) goto L_0x005e
                r2.write(r5, r1, r6)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
                goto L_0x0054
            L_0x005e:
                r2.flush()     // Catch:{ IOException -> 0x0070, all -> 0x006d }
                r2.close()     // Catch:{ IOException -> 0x0070, all -> 0x006d }
                r2.close()     // Catch:{ IOException -> 0x0068 }
                goto L_0x007f
            L_0x0068:
                r4 = move-exception
                r4.printStackTrace()
                goto L_0x007f
            L_0x006d:
                r4 = move-exception
                r6 = r2
                goto L_0x0080
            L_0x0070:
                r4 = move-exception
                r6 = r2
                goto L_0x0076
            L_0x0073:
                r4 = move-exception
                goto L_0x0080
            L_0x0075:
                r4 = move-exception
            L_0x0076:
                r4.printStackTrace()     // Catch:{ all -> 0x0073 }
                if (r6 != 0) goto L_0x007c
                goto L_0x007f
            L_0x007c:
                r6.close()     // Catch:{ IOException -> 0x0068 }
            L_0x007f:
                return
            L_0x0080:
                if (r6 != 0) goto L_0x0083
                goto L_0x008b
            L_0x0083:
                r6.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r5 = move-exception
                r5.printStackTrace()
            L_0x008b:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.utils.SaveFileUtils.Companion.writeFileToSDCard(java.lang.String, java.lang.String, okhttp3.ResponseBody):void");
        }
    }
}
