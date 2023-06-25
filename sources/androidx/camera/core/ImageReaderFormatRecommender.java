package androidx.camera.core;

public final class ImageReaderFormatRecommender {

    public static abstract class FormatCombo {
        public static FormatCombo create(int i, int i2) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i, i2);
        }

        public abstract int imageAnalysisFormat();

        public abstract int imageCaptureFormat();
    }

    public static FormatCombo chooseCombo() {
        if (ImageReaderProxys.inSharedReaderWhitelist(DeviceProperties.create())) {
            return FormatCombo.create(35, 35);
        }
        return FormatCombo.create(256, 35);
    }
}
