package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p260n0.C3115b;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public interface HttpDataSource extends C3122h {

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, C3125j jVar) {
            super("Invalid content type: " + str, jVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;
        @Nullable
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int i, Map<String, List<String>> map, C3125j jVar) {
            this(i, (String) null, map, jVar);
        }

        public InvalidResponseCodeException(int i, @Nullable String str, Map<String, List<String>> map, C3125j jVar) {
            super("Response code: " + i, jVar, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$a */
    public static abstract class C4054a implements C3122h.C3123a {

        /* renamed from: a */
        public final C4055b f7917a = new C4055b();

        /* renamed from: b */
        public final HttpDataSource mo19884a() {
            return mo19920c(this.f7917a);
        }

        /* renamed from: c */
        public abstract HttpDataSource mo19920c(C4055b bVar);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b */
    public static final class C4055b {

        /* renamed from: a */
        public final Map<String, String> f7918a = new HashMap();

        /* renamed from: b */
        public Map<String, String> f7919b;

        /* renamed from: a */
        public synchronized Map<String, String> mo24270a() {
            if (this.f7919b == null) {
                this.f7919b = Collections.unmodifiableMap(new HashMap(this.f7918a));
            }
            return this.f7919b;
        }
    }

    static {
        C3115b bVar = C3115b.f5704a;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m10663a(String str) {
        String l0 = C3152e0.m7810l0(str);
        return !TextUtils.isEmpty(l0) && (!l0.contains("text") || l0.contains("text/vtt")) && !l0.contains("html") && !l0.contains("xml");
    }

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final C3125j dataSpec;
        public final int type;

        public HttpDataSourceException(C3125j jVar, int i) {
            this.dataSpec = jVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, C3125j jVar, int i) {
            super(str);
            this.dataSpec = jVar;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, C3125j jVar, int i) {
            super(iOException);
            this.dataSpec = jVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, C3125j jVar, int i) {
            super(str, iOException);
            this.dataSpec = jVar;
            this.type = i;
        }
    }
}
