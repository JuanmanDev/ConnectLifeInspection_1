package androidx.camera.core;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ThreadConfig {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Handler> OPTION_CALLBACK_HANDLER = Config.Option.create("camerax.core.thread.callbackHandler", Handler.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Builder<B> {
        B setCallbackHandler(Handler handler);
    }

    Handler getCallbackHandler();

    @Nullable
    Handler getCallbackHandler(@Nullable Handler handler);
}
