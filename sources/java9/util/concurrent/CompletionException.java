package java9.util.concurrent;

public class CompletionException extends RuntimeException {
    public static final long serialVersionUID = 7830266012832686185L;

    public CompletionException() {
    }

    public CompletionException(String str) {
        super(str);
    }

    public CompletionException(String str, Throwable th) {
        super(str, th);
    }

    public CompletionException(Throwable th) {
        super(th);
    }
}
