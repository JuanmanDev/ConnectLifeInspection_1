package com.gigya.android.sdk.p309ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.C2100c;
import p040c.p151o.p152a.p153a.p172t.C2191b;
import p040c.p151o.p152a.p153a.p174u.C2206g;

/* renamed from: com.gigya.android.sdk.ui.HostActivity */
public class HostActivity extends AppCompatActivity {

    /* renamed from: e */
    public C3954a f7205e;

    /* renamed from: l */
    public int f7206l = -1;

    /* renamed from: m */
    public FrameLayout f7207m;

    /* renamed from: n */
    public ProgressBar f7208n;

    /* renamed from: o */
    public final List<C3955b> f7209o = new ArrayList();

    /* renamed from: com.gigya.android.sdk.ui.HostActivity$a */
    public static abstract class C3954a {
        /* renamed from: a */
        public void mo16986a(AppCompatActivity appCompatActivity, int i, int i2, @Nullable Intent intent) {
        }

        /* renamed from: b */
        public abstract void mo16987b(AppCompatActivity appCompatActivity, @Nullable Bundle bundle);

        /* renamed from: c */
        public void mo23421c(AppCompatActivity appCompatActivity, Intent intent) {
        }

        /* renamed from: d */
        public void mo17007d(AppCompatActivity appCompatActivity) {
        }

        /* renamed from: e */
        public void mo23422e(AppCompatActivity appCompatActivity) {
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.HostActivity$b */
    public interface C3955b {
        /* renamed from: c */
        boolean mo23423c();
    }

    /* renamed from: q */
    public static void m9833q(Context context, C3954a aVar) {
        Intent intent = new Intent(context, HostActivity.class);
        intent.putExtra("lifecycleCallbacks_id", C2191b.m3322a(aVar));
        intent.setFlags(268500992);
        context.startActivity(intent);
    }

    public void addBackPressListener(@NonNull C3955b bVar) {
        this.f7209o.add(bVar);
    }

    public void finish() {
        C2191b.m3324c(this.f7206l);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3954a aVar = this.f7205e;
        if (aVar != null) {
            aVar.mo16986a(this, i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (this.f7209o.size() == 0) {
            super.onBackPressed();
        }
        for (C3955b c : this.f7209o) {
            c.mo23423c();
        }
        super.onBackPressed();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mo23419r();
        this.f7207m = new FrameLayout(this);
        mo23418p();
        setContentView((View) this.f7207m);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            int intExtra = getIntent().getIntExtra("lifecycleCallbacks_id", -1);
            this.f7206l = intExtra;
            if (intExtra == -1) {
                finish();
                return;
            }
            this.f7205e = C2191b.m3326e(intExtra);
        }
        C3954a aVar = this.f7205e;
        if (aVar != null) {
            aVar.mo16987b(this, bundle);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C3954a aVar = this.f7205e;
        if (aVar != null) {
            aVar.mo23421c(this, intent);
        }
    }

    public void onResume() {
        super.onResume();
        C3954a aVar = this.f7205e;
        if (aVar != null) {
            aVar.mo17007d(this);
        }
    }

    public void onStart() {
        super.onStart();
        C3954a aVar = this.f7205e;
        if (aVar != null) {
            aVar.mo23422e(this);
        }
    }

    /* renamed from: p */
    public final void mo23418p() {
        ProgressBar progressBar = new ProgressBar(this, (AttributeSet) null, 16842873);
        this.f7208n = progressBar;
        progressBar.setIndeterminate(true);
        this.f7208n.setVisibility(8);
        this.f7207m.addView(this.f7208n, new FrameLayout.LayoutParams(-2, -2));
    }

    /* renamed from: r */
    public final void mo23419r() {
        try {
            if (((C2098a) C2100c.m3048a().mo16935g(C2098a.class)).mo16859h()) {
                C2206g.m3358a(getWindow());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeBackPressListener(@NonNull C3955b bVar) {
        this.f7209o.remove(bVar);
    }
}
