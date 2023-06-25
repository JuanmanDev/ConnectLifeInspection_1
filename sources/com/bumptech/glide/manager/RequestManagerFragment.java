package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1546g;
import p040c.p077d.p078a.p098l.C1874a;
import p040c.p077d.p078a.p098l.C1889l;

@Deprecated
public class RequestManagerFragment extends Fragment {

    /* renamed from: e */
    public final C1874a f7043e;

    /* renamed from: l */
    public final C1889l f7044l;

    /* renamed from: m */
    public final Set<RequestManagerFragment> f7045m;
    @Nullable

    /* renamed from: n */
    public C1546g f7046n;
    @Nullable

    /* renamed from: o */
    public RequestManagerFragment f7047o;
    @Nullable

    /* renamed from: p */
    public Fragment f7048p;

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C3835a implements C1889l {
        public C3835a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        this(new C1874a());
    }

    /* renamed from: a */
    public final void mo21705a(RequestManagerFragment requestManagerFragment) {
        this.f7045m.add(requestManagerFragment);
    }

    @NonNull
    /* renamed from: b */
    public C1874a mo21706b() {
        return this.f7043e;
    }

    @TargetApi(17)
    @Nullable
    /* renamed from: d */
    public final Fragment mo21707d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f7048p;
    }

    @Nullable
    /* renamed from: e */
    public C1546g mo21708e() {
        return this.f7046n;
    }

    @NonNull
    /* renamed from: f */
    public C1889l mo21709f() {
        return this.f7044l;
    }

    /* renamed from: g */
    public final void mo21710g(@NonNull Activity activity) {
        mo21714k();
        RequestManagerFragment p = C1541c.m1093d(activity).mo15456l().mo16218p(activity);
        this.f7047o = p;
        if (!equals(p)) {
            this.f7047o.mo21705a(this);
        }
    }

    /* renamed from: h */
    public final void mo21711h(RequestManagerFragment requestManagerFragment) {
        this.f7045m.remove(requestManagerFragment);
    }

    /* renamed from: i */
    public void mo21712i(@Nullable Fragment fragment) {
        this.f7048p = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            mo21710g(fragment.getActivity());
        }
    }

    /* renamed from: j */
    public void mo21713j(@Nullable C1546g gVar) {
        this.f7046n = gVar;
    }

    /* renamed from: k */
    public final void mo21714k() {
        RequestManagerFragment requestManagerFragment = this.f7047o;
        if (requestManagerFragment != null) {
            requestManagerFragment.mo21711h(this);
            this.f7047o = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo21710g(activity);
        } catch (IllegalStateException unused) {
            boolean isLoggable = Log.isLoggable("RMFragment", 5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7043e.mo16196c();
        mo21714k();
    }

    public void onDetach() {
        super.onDetach();
        mo21714k();
    }

    public void onStart() {
        super.onStart();
        this.f7043e.mo16197d();
    }

    public void onStop() {
        super.onStop();
        this.f7043e.mo16198e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo21707d() + "}";
    }

    @VisibleForTesting
    @SuppressLint({"ValidFragment"})
    public RequestManagerFragment(@NonNull C1874a aVar) {
        this.f7044l = new C3835a();
        this.f7045m = new HashSet();
        this.f7043e = aVar;
    }
}
