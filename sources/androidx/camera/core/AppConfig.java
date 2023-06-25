package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;
import androidx.camera.core.TargetConfig;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.Set;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppConfig implements TargetConfig<CameraX>, Config {
    public static final Config.Option<CameraFactory> OPTION_CAMERA_FACTORY = Config.Option.create("camerax.core.appConfig.cameraFactory", CameraFactory.class);
    public static final Config.Option<CameraDeviceSurfaceManager> OPTION_DEVICE_SURFACE_MANAGER = Config.Option.create("camerax.core.appConfig.deviceSurfaceManager", CameraDeviceSurfaceManager.class);
    public static final Config.Option<UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = Config.Option.create("camerax.core.appConfig.useCaseConfigFactory", UseCaseConfigFactory.class);
    public final OptionsBundle mConfig;

    public static final class Builder implements TargetConfig.Builder<CameraX, Builder>, Config.ExtendableBuilder {
        public final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public AppConfig build() {
            return new AppConfig(OptionsBundle.from(this.mMutableConfig));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCameraFactory(CameraFactory cameraFactory) {
            getMutableConfig().insertOption(AppConfig.OPTION_CAMERA_FACTORY, cameraFactory);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDeviceSurfaceManager(CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
            getMutableConfig().insertOption(AppConfig.OPTION_DEVICE_SURFACE_MANAGER, cameraDeviceSurfaceManager);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory) {
            getMutableConfig().insertOption(AppConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<CameraX> cls = CameraX.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(Class<CameraX> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + UUID.randomUUID());
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }
    }

    public AppConfig(OptionsBundle optionsBundle) {
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory getCameraFactory(@Nullable CameraFactory cameraFactory) {
        return (CameraFactory) this.mConfig.retrieveOption(OPTION_CAMERA_FACTORY, cameraFactory);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager getDeviceSurfaceManager(@Nullable CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        return (CameraDeviceSurfaceManager) this.mConfig.retrieveOption(OPTION_DEVICE_SURFACE_MANAGER, cameraDeviceSurfaceManager);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<CameraX> getTargetClass(@Nullable Class<CameraX> cls) {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getTargetName(@Nullable String str) {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory getUseCaseConfigRepository(@Nullable UseCaseConfigFactory useCaseConfigFactory) {
        return (UseCaseConfigFactory) this.mConfig.retrieveOption(OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Class<CameraX> getTargetClass() {
        return (Class) retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getTargetName() {
        return (String) retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, @Nullable ValueT valuet) {
        return this.mConfig.retrieveOption(option, valuet);
    }
}
