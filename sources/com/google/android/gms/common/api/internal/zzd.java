package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3407p1;
import p040c.p200q.p201a.p264c.p294g.p300f.C3656n;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzd extends Fragment implements C3381h {

    /* renamed from: n */
    public static final WeakHashMap f8205n = new WeakHashMap();

    /* renamed from: e */
    public final Map f8206e = Collections.synchronizedMap(new ArrayMap());

    /* renamed from: l */
    public int f8207l = 0;
    @Nullable

    /* renamed from: m */
    public Bundle f8208m;

    /* renamed from: s */
    public static zzd m10905s(FragmentActivity fragmentActivity) {
        zzd zzd;
        WeakReference weakReference = (WeakReference) f8205n.get(fragmentActivity);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.isRemoving()) {
                zzd2 = new zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) zzd2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f8205n.put(fragmentActivity, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f8206e.values()) {
            a.mo24552a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final void mo20555e(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f8206e.containsKey(str)) {
            this.f8206e.put(str, lifecycleCallback);
            if (this.f8207l > 0) {
                new C3656n(Looper.getMainLooper()).post(new C3407p1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Nullable
    /* renamed from: i */
    public final <T extends LifecycleCallback> T mo20556i(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f8206e.get(str));
    }

    @Nullable
    /* renamed from: j */
    public final /* synthetic */ Activity mo20557j() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f8206e.values()) {
            e.mo20577e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f8207l = 1;
        this.f8208m = bundle;
        for (Map.Entry entry : this.f8206e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo20578f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f8207l = 5;
        for (LifecycleCallback g : this.f8206e.values()) {
            g.mo24554g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f8207l = 3;
        for (LifecycleCallback h : this.f8206e.values()) {
            h.mo20616h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f8206e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo20579i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f8207l = 2;
        for (LifecycleCallback j : this.f8206e.values()) {
            j.mo20580j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f8207l = 4;
        for (LifecycleCallback k : this.f8206e.values()) {
            k.mo20581k();
        }
    }
}
