package p691no.nordicsemi.android.dfu.internal.exception;

/* renamed from: no.nordicsemi.android.dfu.internal.exception.RemoteDfuException */
public class RemoteDfuException extends Exception {
    public static final long serialVersionUID = -6901728550661937942L;
    public final int mState;

    public RemoteDfuException(String str, int i) {
        super(str);
        this.mState = i;
    }

    public int getErrorNumber() {
        return this.mState;
    }

    public String getMessage() {
        return super.getMessage() + " (error " + this.mState + ")";
    }
}
