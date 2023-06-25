package com.amazon.identity.auth.device.interactive;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import p040c.p048b.p049a.p050a.p051a.p062o.C1448b;
import p040c.p048b.p049a.p050a.p051a.p062o.C1454g;
import p040c.p048b.p049a.p050a.p051a.p062o.C1455h;

public final class WorkflowSupportFragment extends Fragment implements C1455h {

    /* renamed from: e */
    public C1448b f6949e = new C1448b(this);

    /* renamed from: l */
    public WeakReference<Context> f6950l;

    /* renamed from: f */
    public Object mo15313f(Bundle bundle) {
        return getFragmentManager().getFragment(bundle, "wrappedFragment");
    }

    public C1454g getState() {
        return this.f6949e;
    }

    /* renamed from: n */
    public Object mo15315n() {
        return this.f6950l.get();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6949e.mo15302f(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f6949e.mo15304h(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p */
    public Object mo15316p() {
        return getActivity();
    }

    /* renamed from: q */
    public void mo21536q(Context context) {
        this.f6950l = new WeakReference<>(context);
    }
}
