package junit.framework;

import p627i.p629b.C9384b;

public class ComparisonFailure extends AssertionFailedError {
    public static final int MAX_CONTEXT_LENGTH = 20;
    public static final long serialVersionUID = 1;
    public String fActual;
    public String fExpected;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public String getActual() {
        return this.fActual;
    }

    public String getExpected() {
        return this.fExpected;
    }

    public String getMessage() {
        return new C9384b(20, this.fExpected, this.fActual).mo47289b(super.getMessage());
    }
}
