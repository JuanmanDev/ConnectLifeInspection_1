package com.gigya.android.sdk.p309ui.plugin;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.gigya.android.sdk.R$id;
import com.gigya.android.sdk.R$layout;
import com.gigya.android.sdk.p309ui.HostActivity;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.C2105h;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p172t.p173c.C2192a;
import p040c.p151o.p152a.p153a.p172t.p173c.C2193b;
import p040c.p151o.p152a.p153a.p172t.p173c.C2194c;
import p040c.p151o.p152a.p153a.p172t.p173c.C2195d;
import p040c.p151o.p152a.p153a.p172t.p173c.C2196e;
import p040c.p151o.p152a.p153a.p172t.p173c.C2197f;

@SuppressLint({"ValidFragment"})
/* renamed from: com.gigya.android.sdk.ui.plugin.GigyaPluginFragment */
public class GigyaPluginFragment<A extends C2109a> extends DialogFragment implements C2195d<A>, HostActivity.C3955b {

    /* renamed from: e */
    public C2197f<A> f7221e;

    /* renamed from: l */
    public C2105h<A> f7222l;

    /* renamed from: m */
    public String f7223m;

    /* renamed from: n */
    public boolean f7224n = false;

    /* renamed from: o */
    public WebView f7225o;

    /* renamed from: p */
    public ProgressBar f7226p;

    /* renamed from: q */
    public C2193b f7227q;

    /* renamed from: r */
    public final C2194c f7228r = new C2194c(new C3961c());

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaPluginFragment$a */
    public class C3959a extends C2105h<A> {
        public C3959a() {
        }

        /* renamed from: a */
        public void mo16872a(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16872a(aVar);
        }

        /* renamed from: b */
        public void mo16873b(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16873b(aVar);
        }

        /* renamed from: c */
        public void mo16874c(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16874c(aVar);
        }

        /* renamed from: d */
        public void mo16875d(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16875d(aVar);
        }

        /* renamed from: e */
        public void mo16876e(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16876e(aVar);
        }

        /* renamed from: f */
        public void mo16877f(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16877f(aVar);
        }

        /* renamed from: g */
        public void mo16878g() {
            GigyaPluginFragment.this.f7222l.mo16878g();
        }

        /* renamed from: h */
        public void mo16879h() {
            GigyaPluginFragment.this.f7222l.mo16879h();
        }

        /* renamed from: i */
        public void mo16880i() {
            GigyaPluginFragment.this.f7222l.mo16880i();
        }

        /* renamed from: j */
        public void mo16881j(C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16881j(aVar);
        }

        /* renamed from: k */
        public void mo16882k(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16882k(aVar);
        }

        /* renamed from: l */
        public void mo16883l(@NonNull C2192a aVar, String str) {
            GigyaPluginFragment.this.f7222l.mo16883l(aVar, str);
            boolean y = GigyaPluginFragment.this.mo23443y(aVar);
            if (GigyaPluginFragment.this.getActivity() != null && y) {
                GigyaPluginFragment.this.getActivity().finish();
            }
        }

        /* renamed from: n */
        public void mo16885n() {
            GigyaPluginFragment.this.f7222l.mo16885n();
        }

        /* renamed from: o */
        public void mo16886o(@NonNull C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16886o(aVar);
        }

        /* renamed from: p */
        public void mo16884m(@NonNull A a) {
            GigyaPluginFragment.this.f7222l.mo16884m(a);
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaPluginFragment$b */
    public class C3960b implements Runnable {
        public C3960b() {
        }

        public void run() {
            GigyaPluginFragment.this.f7225o.loadDataWithBaseURL("https://www.gigya.com", GigyaPluginFragment.this.f7223m, "text/html", "utf-8", (String) null);
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaPluginFragment$c */
    public class C3961c implements C2196e {
        public C3961c() {
        }

        /* renamed from: a */
        public void mo17048a() {
            GigyaPluginFragment.this.f7226p.setVisibility(0);
        }

        /* renamed from: b */
        public void mo17049b(C2192a aVar) {
            GigyaPluginFragment.this.f7222l.mo16881j(aVar);
        }

        /* renamed from: c */
        public void mo17050c(Uri uri) {
            GigyaPluginFragment.this.startActivity(new Intent("android.intent.action.VIEW", uri));
        }

        /* renamed from: d */
        public boolean mo17051d(String str) {
            return GigyaPluginFragment.this.f7221e.mo17054c(str);
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaPluginFragment$d */
    public interface C3962d<A extends C2109a> {
        /* renamed from: a */
        void mo23447a(C2192a aVar, String str);

        /* renamed from: b */
        void mo23448b(String str, @Nullable A a);

        /* renamed from: c */
        void mo23449c(String str);
    }

    /* renamed from: A */
    public void mo23438A(View view) {
        this.f7225o = (WebView) view.findViewById(R$id.web_frag_web_view);
        this.f7226p = (ProgressBar) view.findViewById(R$id.web_frag_progress_bar);
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface", "SetJavaScriptEnabled"})
    /* renamed from: B */
    public void mo23439B() {
        this.f7227q = new C2193b(this);
        WebSettings settings = this.f7225o.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        this.f7225o.setWebViewClient(this.f7228r);
        this.f7225o.setWebChromeClient(this.f7227q);
        mo23440v();
    }

    /* renamed from: c */
    public boolean mo23423c() {
        C2105h<A> hVar = this.f7222l;
        if (hVar == null) {
            return true;
        }
        hVar.mo16878g();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        mo23441w(i, i2, intent);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof HostActivity) {
            ((HostActivity) context).addBackPressListener(this);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f7224n = getArguments().getBoolean("arg_obfuscate", false);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        if (onCreateDialog.getWindow() != null) {
            onCreateDialog.getWindow().setSoftInputMode(2);
        }
        return onCreateDialog;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R$layout.gigya_fragment_webview, viewGroup, false);
    }

    public void onDestroyView() {
        C2193b bVar = this.f7227q;
        if (bVar != null) {
            bVar.mo17036a();
        }
        C2197f<A> fVar = this.f7221e;
        if (fVar != null) {
            fVar.mo17055d(this.f7225o);
        }
        super.onDestroyView();
    }

    public void onDetach() {
        if (getContext() instanceof HostActivity) {
            ((HostActivity) getContext()).removeBackPressListener(this);
        }
        super.onDetach();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        mo23442x(i, strArr, iArr);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("arg_style_show_full_screen", false)) {
                window.setLayout(-1, -1);
            }
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        mo23438A(view);
        mo23439B();
        mo23444z(view);
    }

    /* renamed from: v */
    public final void mo23440v() {
        if (this.f7222l == null) {
            C2103f.m3057c("GigyaPluginFragment", "Plugin callback is mandatory - cannot remain null.");
        } else {
            this.f7221e.mo17052a(this.f7224n).mo17053b(this.f7225o, new C3959a(), this.f7226p);
        }
    }

    /* renamed from: w */
    public void mo23441w(int i, int i2, Intent intent) {
        if (Build.VERSION.SDK_INT < 21) {
            super.onActivityResult(i, i2, intent);
        } else if (i != 15) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.f7227q.mo17038c(i2, intent);
        }
    }

    /* renamed from: x */
    public void mo23442x(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    /* renamed from: y */
    public boolean mo23443y(C2192a aVar) {
        Object obj = aVar.mo17035b().get("isFlowFinalized");
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: z */
    public void mo23444z(View view) {
        view.post(new C3960b());
    }
}
