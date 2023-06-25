package p630io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* renamed from: io.flutter.embedding.engine.FlutterOverlaySurface */
public class FlutterOverlaySurface {

    /* renamed from: id */
    public final int f18510id;
    @NonNull
    public final Surface surface;

    public FlutterOverlaySurface(int i, @NonNull Surface surface2) {
        this.f18510id = i;
        this.surface = surface2;
    }

    public int getId() {
        return this.f18510id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
