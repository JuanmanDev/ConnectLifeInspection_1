package p630io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@Keep
/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack */
public class FlutterMutatorsStack {
    public List<Path> finalClippingPaths = new ArrayList();
    public Matrix finalMatrix = new Matrix();
    @NonNull
    public List<C9417a> mutators = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$FlutterMutatorType */
    public enum FlutterMutatorType {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<C9417a> getMutators() {
        return this.mutators;
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C9417a(this, rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        C9417a aVar = new C9417a(this, matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.mo47522a());
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$a */
    public class C9417a {
        @Nullable

        /* renamed from: a */
        public Matrix f18518a;
        @Nullable

        /* renamed from: b */
        public Rect f18519b;

        public C9417a(FlutterMutatorsStack flutterMutatorsStack, Rect rect) {
            FlutterMutatorType flutterMutatorType = FlutterMutatorType.CLIP_RECT;
            this.f18519b = rect;
        }

        /* renamed from: a */
        public Matrix mo47522a() {
            return this.f18518a;
        }

        public C9417a(FlutterMutatorsStack flutterMutatorsStack, Matrix matrix) {
            FlutterMutatorType flutterMutatorType = FlutterMutatorType.TRANSFORM;
            this.f18518a = matrix;
        }
    }
}
