package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3378g;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleCallback {
    @NonNull

    /* renamed from: e */
    public final C3381h f8198e;

    public LifecycleCallback(@NonNull C3381h hVar) {
        this.f8198e = hVar;
    }

    @NonNull
    /* renamed from: c */
    public static C3381h m10884c(@NonNull Activity activity) {
        return m10885d(new C3378g(activity));
    }

    @NonNull
    /* renamed from: d */
    public static C3381h m10885d(@NonNull C3378g gVar) {
        if (gVar.mo20549d()) {
            return zzd.m10905s(gVar.mo20547b());
        }
        if (gVar.mo20548c()) {
            return zzb.m10899d(gVar.mo20546a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    public static C3381h getChimeraLifecycleFragmentImpl(C3378g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    /* renamed from: a */
    public void mo24552a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }

    @NonNull
    /* renamed from: b */
    public Activity mo24553b() {
        Activity j = this.f8198e.mo20557j();
        C3495o.m8908j(j);
        return j;
    }

    @MainThread
    /* renamed from: e */
    public void mo20577e(int i, int i2, @NonNull Intent intent) {
    }

    @MainThread
    /* renamed from: f */
    public void mo20578f(@Nullable Bundle bundle) {
    }

    @MainThread
    /* renamed from: g */
    public void mo24554g() {
    }

    @MainThread
    /* renamed from: h */
    public void mo20616h() {
    }

    @MainThread
    /* renamed from: i */
    public void mo20579i(@NonNull Bundle bundle) {
    }

    @MainThread
    /* renamed from: j */
    public void mo20580j() {
    }

    @MainThread
    /* renamed from: k */
    public void mo20581k() {
    }
}
