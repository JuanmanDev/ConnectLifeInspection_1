package androidx.constraintlayout.solver.widgets;

public class ResolutionDimension extends ResolutionNode {
    public float value = 0.0f;

    public void remove() {
        this.state = 2;
    }

    public void reset() {
        super.reset();
        this.value = 0.0f;
    }

    public void resolve(int i) {
        if (this.state == 0 || this.value != ((float) i)) {
            this.value = (float) i;
            if (this.state == 1) {
                invalidate();
            }
            didResolve();
        }
    }
}
