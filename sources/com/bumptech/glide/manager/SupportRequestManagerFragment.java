package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashSet;
import java.util.Set;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1546g;
import p040c.p077d.p078a.p098l.C1874a;
import p040c.p077d.p078a.p098l.C1889l;

public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: e */
    public final C1874a f7050e;

    /* renamed from: l */
    public final C1889l f7051l;

    /* renamed from: m */
    public final Set<SupportRequestManagerFragment> f7052m;
    @Nullable

    /* renamed from: n */
    public SupportRequestManagerFragment f7053n;
    @Nullable

    /* renamed from: o */
    public C1546g f7054o;
    @Nullable

    /* renamed from: p */
    public Fragment f7055p;

    /* renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C3836a implements C1889l {
        public C3836a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new C1874a());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mo21727v(getActivity());
        } catch (IllegalStateException unused) {
            boolean isLoggable = Log.isLoggable("SupportRMFragment", 5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7050e.mo16196c();
        mo21731z();
    }

    public void onDetach() {
        super.onDetach();
        this.f7055p = null;
        mo21731z();
    }

    public void onStart() {
        super.onStart();
        this.f7050e.mo16197d();
    }

    public void onStop() {
        super.onStop();
        this.f7050e.mo16198e();
    }

    /* renamed from: q */
    public final void mo21722q(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f7052m.add(supportRequestManagerFragment);
    }

    @NonNull
    /* renamed from: r */
    public C1874a mo21723r() {
        return this.f7050e;
    }

    @Nullable
    /* renamed from: s */
    public final Fragment mo21724s() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f7055p;
    }

    @Nullable
    /* renamed from: t */
    public C1546g mo21725t() {
        return this.f7054o;
    }

    public String toString() {
        return super.toString() + "{parent=" + mo21724s() + "}";
    }

    @NonNull
    /* renamed from: u */
    public C1889l mo21726u() {
        return this.f7051l;
    }

    /* renamed from: v */
    public final void mo21727v(@NonNull FragmentActivity fragmentActivity) {
        mo21731z();
        SupportRequestManagerFragment r = C1541c.m1093d(fragmentActivity).mo15456l().mo16220r(fragmentActivity);
        this.f7053n = r;
        if (!equals(r)) {
            this.f7053n.mo21722q(this);
        }
    }

    /* renamed from: w */
    public final void mo21728w(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f7052m.remove(supportRequestManagerFragment);
    }

    /* renamed from: x */
    public void mo21729x(@Nullable Fragment fragment) {
        this.f7055p = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            mo21727v(fragment.getActivity());
        }
    }

    /* renamed from: y */
    public void mo21730y(@Nullable C1546g gVar) {
        this.f7054o = gVar;
    }

    /* renamed from: z */
    public final void mo21731z() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f7053n;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.mo21728w(this);
            this.f7053n = null;
        }
    }

    @VisibleForTesting
    @SuppressLint({"ValidFragment"})
    public SupportRequestManagerFragment(@NonNull C1874a aVar) {
        this.f7051l = new C3836a();
        this.f7052m = new HashSet();
        this.f7050e = aVar;
    }
}
