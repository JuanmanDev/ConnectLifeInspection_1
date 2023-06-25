package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import java.util.Map;
import p040c.p200q.p201a.p219b.p223e0.C2652k;

@TargetApi(16)
public interface DrmSession<T extends C2652k> {

    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    Map<String, String> mo18439a();

    /* renamed from: b */
    T mo18440b();

    /* renamed from: c */
    DrmSessionException mo18441c();

    int getState();
}
