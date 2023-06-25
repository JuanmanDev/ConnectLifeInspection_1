package com.gigya.android.sdk.p309ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.gigya.android.sdk.R$id;
import com.gigya.android.sdk.R$layout;
import java.util.Map;

/* renamed from: com.gigya.android.sdk.ui.WebViewFragment */
public abstract class WebViewFragment extends DialogFragment {

    /* renamed from: e */
    public WebView f7215e;

    /* renamed from: l */
    public ProgressBar f7216l;
    @Nullable

    /* renamed from: m */
    public String f7217m;
    @Nullable

    /* renamed from: n */
    public String f7218n;
    @Nullable

    /* renamed from: o */
    public String f7219o;
    @Nullable

    /* renamed from: p */
    public String f7220p;

    /* renamed from: com.gigya.android.sdk.ui.WebViewFragment$a */
    public interface C3958a {
        /* renamed from: a */
        void mo23436a(Map<String, Object> map);

        /* renamed from: b */
        void mo23437b();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mo23434q();
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
        if (getActivity() == null) {
            return null;
        }
        return layoutInflater.inflate(R$layout.gigya_fragment_webview, viewGroup, false);
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
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7215e = (WebView) view.findViewById(R$id.web_frag_web_view);
        this.f7216l = (ProgressBar) view.findViewById(R$id.web_frag_progress_bar);
        TextView textView = (TextView) view.findViewById(R$id.web_frag_title_text);
        if (this.f7220p != null) {
            textView.setVisibility(0);
            textView.setText(this.f7220p);
        } else {
            textView.setVisibility(8);
        }
        mo23435r();
    }

    /* renamed from: q */
    public abstract void mo23434q();

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: r */
    public void mo23435r() {
        WebSettings settings = this.f7215e.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
    }
}
