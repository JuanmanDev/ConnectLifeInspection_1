package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3404o1;
import p040c.p200q.p201a.p264c.p294g.p300f.C3656n;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzb extends Fragment implements C3381h {

    /* renamed from: n */
    public static final WeakHashMap f8201n = new WeakHashMap();

    /* renamed from: e */
    public final Map f8202e = Collections.synchronizedMap(new ArrayMap());

    /* renamed from: l */
    public int f8203l = 0;
    @Nullable

    /* renamed from: m */
    public Bundle f8204m;

    /* renamed from: d */
    public static zzb m10899d(Activity activity) {
        zzb zzb;
        WeakReference weakReference = (WeakReference) f8201n.get(activity);
        if (weakReference != null && (zzb = (zzb) weakReference.get()) != null) {
            return zzb;
        }
        try {
            zzb zzb2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb2 == null || zzb2.isRemoving()) {
                zzb2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzb2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f8201n.put(activity, new WeakReference(zzb2));
            return zzb2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f8202e.values()) {
            a.mo24552a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final void mo20555e(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f8202e.containsKey(str)) {
            this.f8202e.put(str, lifecycleCallback);
            if (this.f8203l > 0) {
                new C3656n(Looper.getMainLooper()).post(new C3404o1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Nullable
    /* renamed from: i */
    public final <T extends LifecycleCallback> T mo20556i(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f8202e.get(str));
    }

    @Nullable
    /* renamed from: j */
    public final Activity mo20557j() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f8202e.values()) {
            e.mo20577e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f8203l = 1;
        this.f8204m = bundle;
        for (Map.Entry entry : this.f8202e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo20578f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f8203l = 5;
        for (LifecycleCallback g : this.f8202e.values()) {
            g.mo24554g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f8203l = 3;
        for (LifecycleCallback h : this.f8202e.values()) {
            h.mo20616h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f8202e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo20579i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f8203l = 2;
        for (LifecycleCallback j : this.f8202e.values()) {
            j.mo20580j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f8203l = 4;
        for (LifecycleCallback k : this.f8202e.values()) {
            k.mo20581k();
        }
    }
}
