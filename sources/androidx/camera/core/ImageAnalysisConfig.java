package androidx.camera.core;

import android.os.Handler;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraDeviceConfig;
import androidx.camera.core.CameraX;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageOutputConfig;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.ThreadConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseConfig;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.Set;
import java.util.UUID;

public final class ImageAnalysisConfig implements UseCaseConfig<ImageAnalysis>, ImageOutputConfig, CameraDeviceConfig, ThreadConfig {
    public static final Config.Option<Integer> OPTION_IMAGE_QUEUE_DEPTH = Config.Option.create("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final Config.Option<ImageAnalysis.ImageReaderMode> OPTION_IMAGE_READER_MODE = Config.Option.create("camerax.core.imageAnalysis.imageReaderMode", ImageAnalysis.ImageReaderMode.class);
    public final OptionsBundle mConfig;

    public static final class Builder implements CameraDeviceConfig.Builder<Builder>, ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder> {
        public final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(ImageAnalysisConfig imageAnalysisConfig) {
            return new Builder(MutableOptionsBundle.from(imageAnalysisConfig));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setImageQueueDepth(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i));
            return this;
        }

        public Builder setImageReaderMode(ImageAnalysis.ImageReaderMode imageReaderMode) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_READER_MODE, imageReaderMode);
            return this;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<ImageAnalysis> cls = ImageAnalysis.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public ImageAnalysisConfig build() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public Builder setCallbackHandler(Handler handler) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_CALLBACK_HANDLER, handler);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder setLensFacing(CameraX.LensFacing lensFacing) {
            getMutableConfig().insertOption(CameraDeviceConfig.OPTION_LENS_FACING, lensFacing);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(Rational rational) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, rational);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(Class<ImageAnalysis> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseEventListener(UseCase.EventListener eventListener) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER, eventListener);
            return this;
        }
    }

    public ImageAnalysisConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean containsOption(Config.Option<?> option) {
        return this.mConfig.containsOption(option);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void findOptions(String str, Config.OptionMatcher optionMatcher) {
        this.mConfig.findOptions(str, optionMatcher);
    }

    @Nullable
    public Handler getCallbackHandler(@Nullable Handler handler) {
        return (Handler) retrieveOption(ThreadConfig.OPTION_CALLBACK_HANDLER, handler);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(@Nullable CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig getDefaultCaptureConfig(@Nullable CaptureConfig captureConfig) {
        return (CaptureConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig getDefaultSessionConfig(@Nullable SessionConfig sessionConfig) {
        return (SessionConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    public int getImageQueueDepth(int i) {
        return ((Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i))).intValue();
    }

    @Nullable
    public ImageAnalysis.ImageReaderMode getImageReaderMode(@Nullable ImageAnalysis.ImageReaderMode imageReaderMode) {
        return (ImageAnalysis.ImageReaderMode) retrieveOption(OPTION_IMAGE_READER_MODE, imageReaderMode);
    }

    @Nullable
    public CameraX.LensFacing getLensFacing(@Nullable CameraX.LensFacing lensFacing) {
        return (CameraX.LensFacing) retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING, lensFacing);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getMaxResolution(Size size) {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig.OptionUnpacker getSessionOptionUnpacker(@Nullable SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getSurfaceOccupancyPriority(int i) {
        return ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }

    @Nullable
    public Rational getTargetAspectRatio(@Nullable Rational rational) {
        return (Rational) retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, rational);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<ImageAnalysis> getTargetClass(@Nullable Class<ImageAnalysis> cls) {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    @Nullable
    public String getTargetName(@Nullable String str) {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }

    public Size getTargetResolution(Size size) {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    public int getTargetRotation(int i) {
        return ((Integer) retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCase.EventListener getUseCaseEventListener(@Nullable UseCase.EventListener eventListener) {
        return (UseCase.EventListener) retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER, eventListener);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Config.Option<?>> listOptions() {
        return this.mConfig.listOptions();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option) {
        return this.mConfig.retrieveOption(option);
    }

    public Handler getCallbackHandler() {
        return (Handler) retrieveOption(ThreadConfig.OPTION_CALLBACK_HANDLER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (CaptureConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CaptureConfig getDefaultCaptureConfig() {
        return (CaptureConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig getDefaultSessionConfig() {
        return (SessionConfig) retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
    }

    public int getImageQueueDepth() {
        return ((Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH)).intValue();
    }

    public ImageAnalysis.ImageReaderMode getImageReaderMode() {
        return (ImageAnalysis.ImageReaderMode) retrieveOption(OPTION_IMAGE_READER_MODE);
    }

    public CameraX.LensFacing getLensFacing() {
        return (CameraX.LensFacing) retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size getMaxResolution() {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (SessionConfig.OptionUnpacker) retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    public Rational getTargetAspectRatio() {
        return (Rational) retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }

    public String getTargetName() {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    public Size getTargetResolution() {
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION);
    }

    public int getTargetRotation() {
        return ((Integer) retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION)).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCase.EventListener getUseCaseEventListener() {
        return (UseCase.EventListener) retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_LISTENER);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, @Nullable ValueT valuet) {
        return this.mConfig.retrieveOption(option, valuet);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<ImageAnalysis> getTargetClass() {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }
}
