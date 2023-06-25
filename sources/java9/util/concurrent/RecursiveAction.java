package java9.util.concurrent;

public abstract class RecursiveAction extends ForkJoinTask<Void> {
    public static final long serialVersionUID = 5232453952276485070L;

    public abstract void compute();

    public final boolean exec() {
        compute();
        return true;
    }

    public final Void getRawResult() {
        return null;
    }

    public final void setRawResult(Void voidR) {
    }
}
