package p692o;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.p */
/* compiled from: Response */
public final class C9909p<T> {

    /* renamed from: a */
    public final Response f19255a;

    /* renamed from: b */
    public final T f19256b;

    /* renamed from: c */
    public final ResponseBody f19257c;

    public C9909p(Response response, T t, ResponseBody responseBody) {
        this.f19255a = response;
        this.f19256b = t;
        this.f19257c = responseBody;
    }

    /* renamed from: c */
    public static <T> C9909p<T> m26553c(ResponseBody responseBody, Response response) {
        C9916u.m26580b(responseBody, "body == null");
        C9916u.m26580b(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new C9909p<>(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static <T> C9909p<T> m26554f(T t, Response response) {
        C9916u.m26580b(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new C9909p<>(response, t, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T mo51317a() {
        return this.f19256b;
    }

    /* renamed from: b */
    public int mo51318b() {
        return this.f19255a.code();
    }

    /* renamed from: d */
    public boolean mo51319d() {
        return this.f19255a.isSuccessful();
    }

    /* renamed from: e */
    public String mo51320e() {
        return this.f19255a.message();
    }

    public String toString() {
        return this.f19255a.toString();
    }
}
