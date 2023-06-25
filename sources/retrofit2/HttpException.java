package retrofit2;

import p692o.C9909p;
import p692o.C9916u;

public class HttpException extends RuntimeException {
    public final int code;
    public final String message;
    public final transient C9909p<?> response;

    public HttpException(C9909p<?> pVar) {
        super(getMessage(pVar));
        this.code = pVar.mo51318b();
        this.message = pVar.mo51320e();
        this.response = pVar;
    }

    public static String getMessage(C9909p<?> pVar) {
        C9916u.m26580b(pVar, "response == null");
        return "HTTP " + pVar.mo51318b() + " " + pVar.mo51320e();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public C9909p<?> response() {
        return this.response;
    }
}
