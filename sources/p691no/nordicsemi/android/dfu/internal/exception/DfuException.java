package p691no.nordicsemi.android.dfu.internal.exception;

/* renamed from: no.nordicsemi.android.dfu.internal.exception.DfuException */
public class DfuException extends Exception {
    public static final long serialVersionUID = -6901728550661937942L;
    public final int mError;

    public DfuException(String str, int i) {
        super(str);
        this.mError = i;
    }

    public int getErrorNumber() {
        return this.mError;
    }

    public String getMessage() {
        return super.getMessage() + " (error " + (this.mError & -16385) + ")";
    }
}
