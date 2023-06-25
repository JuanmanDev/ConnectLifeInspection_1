package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.Config;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.TargetConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseEventConfig;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, Config, UseCaseEventConfig {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, Config.ExtendableBuilder, UseCaseEventConfig.Builder<B> {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        C build();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setDefaultCaptureConfig(CaptureConfig captureConfig);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setDefaultSessionConfig(SessionConfig sessionConfig);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setSurfaceOccupancyPriority(int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker();

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(@Nullable CaptureConfig.OptionUnpacker optionUnpacker);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CaptureConfig getDefaultCaptureConfig();

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CaptureConfig getDefaultCaptureConfig(@Nullable CaptureConfig captureConfig);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    SessionConfig getDefaultSessionConfig();

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    SessionConfig getDefaultSessionConfig(@Nullable SessionConfig sessionConfig);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    SessionConfig.OptionUnpacker getSessionOptionUnpacker();

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    SessionConfig.OptionUnpacker getSessionOptionUnpacker(@Nullable SessionConfig.OptionUnpacker optionUnpacker);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    int getSurfaceOccupancyPriority();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    int getSurfaceOccupancyPriority(int i);
}
