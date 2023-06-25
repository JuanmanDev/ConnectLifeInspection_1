package com.kasem.flutter_absolute_path;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ9\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u0012"}, mo47991d2 = {"Lcom/kasem/flutter_absolute_path/FileDirectory;", "", "()V", "getAbsolutePath", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getDataColumn", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "isDownloadsDocument", "", "isExternalStorageDocument", "isMediaDocument", "flutter_absolute_path_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FileDirectory.kt */
public final class FileDirectory {
    @NotNull
    public static final FileDirectory INSTANCE = new FileDirectory();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        throw r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getDataColumn(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r8 = this;
            java.lang.String r0 = r10.getAuthority()
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.io.File r11 = new java.io.File
            java.io.File r12 = r9.getCacheDir()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "IMG_"
            r0.append(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            r0.append(r2)
            java.lang.String r2 = ".png"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r12, r0)
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.io.InputStream r9 = r9.openInputStream(r10)
            if (r9 != 0) goto L_0x003a
            goto L_0x004a
        L_0x003a:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x0056 }
            r10.<init>(r11)     // Catch:{ all -> 0x0056 }
            r12 = 0
            r0 = 2
            kotlin.p639io.ByteStreamsKt.copyTo$default(r9, r10, r12, r0, r1)     // Catch:{ all -> 0x004f }
            kotlin.p639io.CloseableKt.closeFinally(r10, r1)     // Catch:{ all -> 0x0056 }
            kotlin.p639io.CloseableKt.closeFinally(r9, r1)
        L_0x004a:
            java.lang.String r9 = r11.getPath()
            return r9
        L_0x004f:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r12 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r10, r11)     // Catch:{ all -> 0x0056 }
            throw r12     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r11 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r9, r10)
            throw r11
        L_0x005d:
            java.lang.String r0 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ all -> 0x008d }
            r7 = 0
            r3 = r10
            r5 = r11
            r6 = r12
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008d }
            if (r9 == 0) goto L_0x0086
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x0086
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0083 }
            r9.close()
            return r10
        L_0x0083:
            r10 = move-exception
            r1 = r9
            goto L_0x008e
        L_0x0086:
            if (r9 != 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r9.close()
        L_0x008c:
            return r1
        L_0x008d:
            r10 = move-exception
        L_0x008e:
            if (r1 != 0) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r1.close()
        L_0x0094:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kasem.flutter_absolute_path.FileDirectory.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0180  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getAbsolutePath(@org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull android.net.Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 19
            if (r0 < r3) goto L_0x0014
            r0 = r1
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            r3 = 0
            if (r0 == 0) goto L_0x0186
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r9, r10)
            if (r0 == 0) goto L_0x0186
            boolean r0 = r8.isExternalStorageDocument(r10)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r5 = "null cannot be cast to non-null type java.util.Collection<T>"
            java.lang.String r6 = ":"
            java.lang.String r7 = "docId"
            if (r0 == 0) goto L_0x00b0
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>((java.lang.String) r6)
            java.util.List r9 = r0.split(r9, r2)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x006b
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x004a:
            boolean r3 = r0.hasPrevious()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r0.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x005e
            r3 = r1
            goto L_0x005f
        L_0x005e:
            r3 = r2
        L_0x005f:
            if (r3 != 0) goto L_0x004a
            int r0 = r0.nextIndex()
            int r0 = r0 + r1
            java.util.List r9 = kotlin.collections.CollectionsKt___CollectionsKt.take(r9, r0)
            goto L_0x006f
        L_0x006b:
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x006f:
            if (r9 == 0) goto L_0x00aa
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r9.toArray(r0)
            if (r9 == 0) goto L_0x00a4
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0 = r9[r2]
            java.lang.String r2 = "primary"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r0, r1)
            if (r0 == 0) goto L_0x0197
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            r0 = 47
            r10.append(r0)
            r9 = r9[r1]
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L_0x00a4:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r4)
            throw r9
        L_0x00aa:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r5)
            throw r9
        L_0x00b0:
            boolean r0 = r8.isDownloadsDocument(r10)
            if (r0 == 0) goto L_0x00db
            java.lang.String r10 = android.provider.DocumentsContract.getDocumentId(r10)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r1 = "valueOf(id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            long r1 = r10.longValue()
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r0, r1)
            java.lang.String r0 = "contentUri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            java.lang.String r9 = r8.getDataColumn(r9, r10, r3, r3)
            return r9
        L_0x00db:
            boolean r0 = r8.isMediaDocument(r10)
            if (r0 == 0) goto L_0x0197
            java.lang.String r10 = android.provider.DocumentsContract.getDocumentId(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r7)
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>((java.lang.String) r6)
            java.util.List r10 = r0.split(r10, r2)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0120
            int r0 = r10.size()
            java.util.ListIterator r0 = r10.listIterator(r0)
        L_0x00ff:
            boolean r6 = r0.hasPrevious()
            if (r6 == 0) goto L_0x0120
            java.lang.Object r6 = r0.previous()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0113
            r6 = r1
            goto L_0x0114
        L_0x0113:
            r6 = r2
        L_0x0114:
            if (r6 != 0) goto L_0x00ff
            int r0 = r0.nextIndex()
            int r0 = r0 + r1
            java.util.List r10 = kotlin.collections.CollectionsKt___CollectionsKt.take(r10, r0)
            goto L_0x0124
        L_0x0120:
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0124:
            if (r10 == 0) goto L_0x0180
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r10 = r10.toArray(r0)
            if (r10 == 0) goto L_0x017a
            java.lang.String[] r10 = (java.lang.String[]) r10
            r0 = r10[r2]
            int r4 = r0.hashCode()
            r5 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r4 == r5) goto L_0x015e
            r5 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r4 == r5) goto L_0x0152
            r5 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r4 == r5) goto L_0x0146
            goto L_0x0166
        L_0x0146:
            java.lang.String r4 = "video"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x014f
            goto L_0x0166
        L_0x014f:
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x016a
        L_0x0152:
            java.lang.String r4 = "image"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x015b
            goto L_0x0166
        L_0x015b:
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x016a
        L_0x015e:
            java.lang.String r4 = "audio"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0168
        L_0x0166:
            r0 = r3
            goto L_0x016a
        L_0x0168:
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x016a:
            if (r0 != 0) goto L_0x016d
            return r3
        L_0x016d:
            java.lang.String[] r3 = new java.lang.String[r1]
            r10 = r10[r1]
            r3[r2] = r10
            java.lang.String r10 = "_id=?"
            java.lang.String r9 = r8.getDataColumn(r9, r0, r10, r3)
            return r9
        L_0x017a:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r4)
            throw r9
        L_0x0180:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r5)
            throw r9
        L_0x0186:
            java.lang.String r0 = r10.getScheme()
            java.lang.String r2 = "content"
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r0, r1)
            if (r0 == 0) goto L_0x0197
            java.lang.String r9 = r8.getDataColumn(r9, r10, r3, r3)
            return r9
        L_0x0197:
            java.lang.String r9 = r10.getPath()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kasem.flutter_absolute_path.FileDirectory.getAbsolutePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final boolean isDownloadsDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.providers.downloads.documents", (Object) uri.getAuthority());
    }

    public final boolean isExternalStorageDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.externalstorage.documents", (Object) uri.getAuthority());
    }

    public final boolean isMediaDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.providers.media.documents", (Object) uri.getAuthority());
    }
}
