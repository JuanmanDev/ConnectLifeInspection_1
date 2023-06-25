package java9.util.concurrent;

public abstract class RecursiveTask<V> extends ForkJoinTask<V> {
    public static final long serialVersionUID = 5232453952276485270L;
    public V result;

    public abstract V compute();

    public final boolean exec() {
        this.result = compute();
        return true;
    }

    public final V getRawResult() {
        return this.result;
    }

    public final void setRawResult(V v) {
        this.result = v;
    }
}
