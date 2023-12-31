package p691no.nordicsemi.android.dfu.internal.exception;

/* renamed from: no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException */
public class RemoteDfuExtendedErrorException extends RemoteDfuException {
    public static final long serialVersionUID = -6901728550661937942L;
    public final int mError;

    public RemoteDfuExtendedErrorException(String str, int i) {
        super(str, 11);
        this.mError = i;
    }

    public int getExtendedErrorNumber() {
        return this.mError;
    }

    public String getMessage() {
        return super.getMessage() + " (extended error " + this.mError + ")";
    }
}
