package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ExtendableUseCaseConfigFactory implements UseCaseConfigFactory {
    public final Map<Class<?>, ConfigProvider<?>> mDefaultProviders = new HashMap();

    @Nullable
    public <C extends UseCaseConfig<?>> C getConfig(Class<C> cls, CameraX.LensFacing lensFacing) {
        ConfigProvider configProvider = this.mDefaultProviders.get(cls);
        if (configProvider != null) {
            return (UseCaseConfig) configProvider.getConfig(lensFacing);
        }
        return null;
    }

    public <C extends Config> void installDefaultProvider(Class<C> cls, ConfigProvider<C> configProvider) {
        this.mDefaultProviders.put(cls, configProvider);
    }
}
