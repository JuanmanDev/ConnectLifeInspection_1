package androidx.camera.core;

import android.location.Location;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.File;

public final class ImageSaver implements Runnable {
    public static final String TAG = "ImageSaver";
    public final File mFile;
    public final Handler mHandler;
    public final ImageProxy mImage;
    public final boolean mIsReversedHorizontal;
    public final boolean mIsReversedVertical;
    public final OnImageSavedListener mListener;
    @Nullable
    public final Location mLocation;
    public final int mOrientation;

    /* renamed from: androidx.camera.core.ImageSaver$3 */
    public static /* synthetic */ class C04293 {

        /* renamed from: $SwitchMap$androidx$camera$core$ImageUtil$CodecFailedException$FailureType */
        public static final /* synthetic */ int[] f211x9a1ac3a4;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.ImageUtil$CodecFailedException$FailureType[] r0 = androidx.camera.core.ImageUtil.CodecFailedException.FailureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f211x9a1ac3a4 = r0
                androidx.camera.core.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f211x9a1ac3a4     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f211x9a1ac3a4     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.ImageUtil.CodecFailedException.FailureType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageSaver.C04293.<clinit>():void");
        }
    }

    public interface OnImageSavedListener {
        void onError(SaveError saveError, String str, @Nullable Throwable th);

        void onImageSaved(File file);
    }

    public enum SaveError {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public ImageSaver(ImageProxy imageProxy, File file, int i, boolean z, boolean z2, @Nullable Location location, OnImageSavedListener onImageSavedListener, Handler handler) {
        this.mImage = imageProxy;
        this.mFile = file;
        this.mOrientation = i;
        this.mIsReversedHorizontal = z;
        this.mIsReversedVertical = z2;
        this.mListener = onImageSavedListener;
        this.mHandler = handler;
        this.mLocation = location;
    }

    private void postError(final SaveError saveError, final String str, @Nullable final Throwable th) {
        this.mHandler.post(new Runnable() {
            public void run() {
                ImageSaver.this.mListener.onError(saveError, str, th);
            }
        });
    }

    private void postSuccess() {
        this.mHandler.post(new Runnable() {
            public void run() {
                ImageSaver imageSaver = ImageSaver.this;
                imageSaver.mListener.onImageSaved(imageSaver.mFile);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.camera.core.ImageUtil$CodecFailedException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.IOException} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0055, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005f, code lost:
        throw r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            r0 = 0
            androidx.camera.core.ImageProxy r1 = r6.mImage     // Catch:{ IOException -> 0x0082, CodecFailedException -> 0x0060 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0052 }
            java.io.File r3 = r6.mFile     // Catch:{ all -> 0x0052 }
            r2.<init>(r3)     // Catch:{ all -> 0x0052 }
            androidx.camera.core.ImageProxy r3 = r6.mImage     // Catch:{ all -> 0x0046 }
            byte[] r3 = androidx.camera.core.ImageUtil.imageToJpegByteArray(r3)     // Catch:{ all -> 0x0046 }
            r2.write(r3)     // Catch:{ all -> 0x0046 }
            java.io.File r3 = r6.mFile     // Catch:{ all -> 0x0046 }
            androidx.camera.core.Exif r3 = androidx.camera.core.Exif.createFromFile(r3)     // Catch:{ all -> 0x0046 }
            r3.attachTimestamp()     // Catch:{ all -> 0x0046 }
            int r4 = r6.mOrientation     // Catch:{ all -> 0x0046 }
            r3.rotate(r4)     // Catch:{ all -> 0x0046 }
            boolean r4 = r6.mIsReversedHorizontal     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0028
            r3.flipHorizontally()     // Catch:{ all -> 0x0046 }
        L_0x0028:
            boolean r4 = r6.mIsReversedVertical     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x002f
            r3.flipVertically()     // Catch:{ all -> 0x0046 }
        L_0x002f:
            android.location.Location r4 = r6.mLocation     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0038
            android.location.Location r4 = r6.mLocation     // Catch:{ all -> 0x0046 }
            r3.attachLocation(r4)     // Catch:{ all -> 0x0046 }
        L_0x0038:
            r3.save()     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0082, CodecFailedException -> 0x0060 }
        L_0x0043:
            r1 = r0
            r2 = r1
            goto L_0x008a
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch:{ all -> 0x0052 }
        L_0x0051:
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r2 = move-exception
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ IOException -> 0x0082, CodecFailedException -> 0x0060 }
        L_0x005f:
            throw r2     // Catch:{ IOException -> 0x0082, CodecFailedException -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            int[] r1 = androidx.camera.core.ImageSaver.C04293.f211x9a1ac3a4
            androidx.camera.core.ImageUtil$CodecFailedException$FailureType r2 = r0.getFailureType()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x007d
            r2 = 2
            if (r1 == r2) goto L_0x0078
            androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.UNKNOWN
            java.lang.String r2 = "Failed to transcode mImage"
            goto L_0x0087
        L_0x0078:
            androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.CROP_FAILED
            java.lang.String r2 = "Failed to crop mImage"
            goto L_0x0087
        L_0x007d:
            androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.ENCODE_FAILED
            java.lang.String r2 = "Failed to encode mImage"
            goto L_0x0087
        L_0x0082:
            r0 = move-exception
            androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED
            java.lang.String r2 = "Failed to write or close the file"
        L_0x0087:
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x008a:
            if (r0 == 0) goto L_0x0090
            r6.postError(r0, r2, r1)
            goto L_0x0093
        L_0x0090:
            r6.postSuccess()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageSaver.run():void");
    }
}
