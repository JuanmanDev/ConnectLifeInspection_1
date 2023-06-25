package androidx.camera.core;

public final class CameraCaptureResultImageInfo implements ImageInfo {
    public final CameraCaptureResult mCameraCaptureResult;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    public CameraCaptureResult getCameraCaptureResult() {
        return this.mCameraCaptureResult;
    }

    public Object getTag() {
        return this.mCameraCaptureResult.getTag();
    }

    public long getTimestamp() {
        return this.mCameraCaptureResult.getTimestamp();
    }
}
