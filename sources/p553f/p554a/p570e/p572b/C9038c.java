package p553f.p554a.p570e.p572b;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.internal.ManufacturerUtils;
import java.util.HashMap;
import p553f.p554a.p570e.p575e.C9060j;
import p630io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p630io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;

/* renamed from: f.a.e.b.c */
/* compiled from: TextInputPlugin */
public class C9038c {
    @NonNull

    /* renamed from: a */
    public final View f17723a;
    @NonNull

    /* renamed from: b */
    public final InputMethodManager f17724b;
    @NonNull

    /* renamed from: c */
    public final AutofillManager f17725c;
    @NonNull

    /* renamed from: d */
    public final TextInputChannel f17726d;
    @NonNull

    /* renamed from: e */
    public C9041c f17727e = new C9041c(C9041c.C9042a.NO_TARGET, 0);
    @Nullable

    /* renamed from: f */
    public TextInputChannel.C9425b f17728f;
    @Nullable

    /* renamed from: g */
    public SparseArray<TextInputChannel.C9425b> f17729g;
    @Nullable

    /* renamed from: h */
    public Editable f17730h;

    /* renamed from: i */
    public boolean f17731i;
    @Nullable

    /* renamed from: j */
    public InputConnection f17732j;
    @NonNull

    /* renamed from: k */
    public C9060j f17733k;
    @Nullable

    /* renamed from: l */
    public Rect f17734l;

    /* renamed from: m */
    public final boolean f17735m;

    /* renamed from: n */
    public ImeSyncDeferringInsetsCallback f17736n;

    /* renamed from: o */
    public boolean f17737o;

    /* renamed from: f.a.e.b.c$a */
    /* compiled from: TextInputPlugin */
    public class C9039a implements TextInputChannel.C9429e {
        public C9039a() {
        }

        /* renamed from: a */
        public void mo46637a() {
            C9038c cVar = C9038c.this;
            cVar.mo46628q(cVar.f17723a);
        }

        /* renamed from: b */
        public void mo46638b(int i, TextInputChannel.C9425b bVar) {
            C9038c.this.mo46615C(i, bVar);
        }

        /* renamed from: c */
        public void mo46639c(TextInputChannel.C9428d dVar) {
            C9038c cVar = C9038c.this;
            cVar.mo46616D(cVar.f17723a, dVar);
        }

        /* renamed from: d */
        public void mo46640d(String str, Bundle bundle) {
            C9038c.this.mo46613A(str, bundle);
        }

        /* renamed from: e */
        public void mo46641e(double d, double d2, double[] dArr) {
            C9038c.this.mo46636z(d, d2, dArr);
        }

        /* renamed from: f */
        public void mo46642f() {
            C9038c.this.mo46633w();
        }

        /* renamed from: g */
        public void mo46643g(boolean z) {
            if (Build.VERSION.SDK_INT >= 26 && C9038c.this.f17725c != null) {
                if (z) {
                    C9038c.this.f17725c.commit();
                } else {
                    C9038c.this.f17725c.cancel();
                }
            }
        }

        /* renamed from: h */
        public void mo46644h() {
            C9038c.this.mo46623l();
        }

        /* renamed from: i */
        public void mo46645i(int i) {
            C9038c.this.mo46614B(i);
        }

        public void show() {
            C9038c cVar = C9038c.this;
            cVar.mo46617E(cVar.f17723a);
        }
    }

    /* renamed from: f.a.e.b.c$b */
    /* compiled from: TextInputPlugin */
    public class C9040b implements C9043d {

        /* renamed from: a */
        public final /* synthetic */ boolean f17739a;

        /* renamed from: b */
        public final /* synthetic */ double[] f17740b;

        /* renamed from: c */
        public final /* synthetic */ double[] f17741c;

        public C9040b(C9038c cVar, boolean z, double[] dArr, double[] dArr2) {
            this.f17739a = z;
            this.f17740b = dArr;
            this.f17741c = dArr2;
        }

        /* renamed from: a */
        public void mo46647a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.f17739a) {
                double[] dArr = this.f17740b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.f17740b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.f17741c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            double[] dArr4 = this.f17741c;
            if (d5 < dArr4[2]) {
                dArr4[2] = d5;
            } else if (d5 > dArr4[3]) {
                dArr4[3] = d5;
            }
        }
    }

    /* renamed from: f.a.e.b.c$c */
    /* compiled from: TextInputPlugin */
    public static class C9041c {
        @NonNull

        /* renamed from: a */
        public C9042a f17742a;

        /* renamed from: b */
        public int f17743b;

        /* renamed from: f.a.e.b.c$c$a */
        /* compiled from: TextInputPlugin */
        public enum C9042a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            PLATFORM_VIEW
        }

        public C9041c(@NonNull C9042a aVar, int i) {
            this.f17742a = aVar;
            this.f17743b = i;
        }
    }

    /* renamed from: f.a.e.b.c$d */
    /* compiled from: TextInputPlugin */
    public interface C9043d {
        /* renamed from: a */
        void mo46647a(double d, double d2);
    }

    @SuppressLint({"NewApi"})
    public C9038c(View view, @NonNull TextInputChannel textInputChannel, @NonNull C9060j jVar) {
        int i = 0;
        this.f17723a = view;
        this.f17724b = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17725c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.f17725c = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            i = (this.f17723a.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : i;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (this.f17723a.getWindowSystemUiVisibility() & 4) == 0 ? i | WindowInsets.Type.statusBars() : i, WindowInsets.Type.ime());
            this.f17736n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f17726d = textInputChannel;
        textInputChannel.mo47543l(new C9039a());
        textInputChannel.mo47540i();
        this.f17733k = jVar;
        jVar.mo46710t(this);
        this.f17735m = mo46629s();
    }

    /* renamed from: r */
    public static int m24477r(TextInputChannel.C9427c cVar, boolean z, boolean z2, boolean z3, TextInputChannel.TextCapitalization textCapitalization) {
        TextInputChannel.TextInputType textInputType = cVar.f18552a;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i = 2;
            if (cVar.f18553b) {
                i = 4098;
            }
            return cVar.f18554c ? i | 8192 : i;
        } else if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        } else {
            int i2 = 1;
            if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
                i2 = 131073;
            } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS) {
                i2 = 33;
            } else if (textInputType == TextInputChannel.TextInputType.URL) {
                i2 = 17;
            } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
                i2 = 145;
            } else if (textInputType == TextInputChannel.TextInputType.NAME) {
                i2 = 97;
            } else if (textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS) {
                i2 = 113;
            }
            if (z) {
                i2 = i2 | 524288 | 128;
            } else {
                if (z2) {
                    i2 |= 32768;
                }
                if (!z3) {
                    i2 |= 524288;
                }
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
                return i2 | 4096;
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
                return i2 | 8192;
            }
            return textCapitalization == TextInputChannel.TextCapitalization.SENTENCES ? i2 | 16384 : i2;
        }
    }

    /* renamed from: A */
    public void mo46613A(String str, Bundle bundle) {
        this.f17724b.sendAppPrivateCommand(this.f17723a, str, bundle);
    }

    /* renamed from: B */
    public final void mo46614B(int i) {
        this.f17723a.requestFocus();
        this.f17727e = new C9041c(C9041c.C9042a.PLATFORM_VIEW, i);
        this.f17724b.restartInput(this.f17723a);
        this.f17731i = false;
    }

    @VisibleForTesting
    /* renamed from: C */
    public void mo46615C(int i, TextInputChannel.C9425b bVar) {
        this.f17727e = new C9041c(C9041c.C9042a.FRAMEWORK_CLIENT, i);
        mo46619G(bVar);
        this.f17730h = Editable.Factory.getInstance().newEditable("");
        this.f17731i = true;
        mo46618F();
        this.f17734l = null;
    }

    @VisibleForTesting
    /* renamed from: D */
    public void mo46616D(View view, TextInputChannel.C9428d dVar) {
        if (!dVar.f18555a.equals(this.f17730h.toString())) {
            Editable editable = this.f17730h;
            editable.replace(0, editable.length(), dVar.f18555a);
        }
        mo46632v(this.f17730h.toString());
        mo46620i(dVar);
        InputConnection p = mo46627p();
        if (p != null && (p instanceof C9036b)) {
            ((C9036b) p).mo46594c();
        }
        if (this.f17735m || this.f17731i) {
            this.f17724b.restartInput(view);
            this.f17731i = false;
            return;
        }
        this.f17724b.updateSelection(this.f17723a, Math.max(Selection.getSelectionStart(this.f17730h), 0), Math.max(Selection.getSelectionEnd(this.f17730h), 0), BaseInputConnection.getComposingSpanStart(this.f17730h), BaseInputConnection.getComposingSpanEnd(this.f17730h));
    }

    /* renamed from: E */
    public final void mo46617E(View view) {
        view.requestFocus();
        this.f17724b.showSoftInput(view, 0);
    }

    /* renamed from: F */
    public void mo46618F() {
        this.f17737o = false;
    }

    /* renamed from: G */
    public final void mo46619G(TextInputChannel.C9425b bVar) {
        mo46634x();
        this.f17728f = bVar;
        TextInputChannel.C9425b[] bVarArr = bVar.f18548i;
        if (bVar.f18547h == null) {
            this.f17729g = null;
            return;
        }
        SparseArray<TextInputChannel.C9425b> sparseArray = new SparseArray<>();
        this.f17729g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f18547h.f18549a.hashCode(), bVar);
            return;
        }
        for (TextInputChannel.C9425b bVar2 : bVarArr) {
            TextInputChannel.C9425b.C9426a aVar = bVar2.f18547h;
            if (aVar != null) {
                this.f17729g.put(aVar.f18549a.hashCode(), bVar2);
            }
        }
    }

    /* renamed from: i */
    public final void mo46620i(TextInputChannel.C9428d dVar) {
        int i = dVar.f18556b;
        int i2 = dVar.f18557c;
        if (i < 0 || i > this.f17730h.length() || i2 < 0 || i2 > this.f17730h.length()) {
            Selection.removeSelection(this.f17730h);
        } else {
            Selection.setSelection(this.f17730h, i, i2);
        }
    }

    /* renamed from: j */
    public void mo46621j(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.C9425b.C9426a aVar;
        TextInputChannel.C9425b.C9426a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (aVar = this.f17728f.f18547h) != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < sparseArray.size(); i++) {
                TextInputChannel.C9425b bVar = this.f17729g.get(sparseArray.keyAt(i));
                if (!(bVar == null || (aVar2 = bVar.f18547h) == null)) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    TextInputChannel.C9428d dVar = new TextInputChannel.C9428d(charSequence, charSequence.length(), charSequence.length());
                    if (aVar2.f18549a.equals(aVar.f18549a)) {
                        mo46616D(this.f17723a, dVar);
                    }
                    hashMap.put(aVar2.f18549a, dVar);
                }
            }
            this.f17726d.mo47546o(this.f17727e.f17743b, hashMap);
        }
    }

    /* renamed from: k */
    public void mo46622k(int i) {
        C9041c cVar = this.f17727e;
        if (cVar.f17742a == C9041c.C9042a.PLATFORM_VIEW && cVar.f17743b == i) {
            this.f17727e = new C9041c(C9041c.C9042a.NO_TARGET, 0);
            mo46628q(this.f17723a);
            this.f17724b.restartInput(this.f17723a);
            this.f17731i = false;
        }
    }

    /* renamed from: l */
    public final void mo46623l() {
        if (this.f17727e.f17742a != C9041c.C9042a.PLATFORM_VIEW) {
            this.f17727e = new C9041c(C9041c.C9042a.NO_TARGET, 0);
            mo46618F();
            mo46634x();
            this.f17734l = null;
        }
    }

    /* renamed from: m */
    public InputConnection mo46624m(View view, EditorInfo editorInfo) {
        int i;
        C9041c cVar = this.f17727e;
        C9041c.C9042a aVar = cVar.f17742a;
        if (aVar == C9041c.C9042a.NO_TARGET) {
            this.f17732j = null;
            return null;
        } else if (aVar != C9041c.C9042a.PLATFORM_VIEW) {
            TextInputChannel.C9425b bVar = this.f17728f;
            int r = m24477r(bVar.f18544e, bVar.f18540a, bVar.f18541b, bVar.f18542c, bVar.f18543d);
            editorInfo.inputType = r;
            editorInfo.imeOptions = 33554432;
            Integer num = this.f17728f.f18545f;
            if (num == null) {
                i = (r & 131072) != 0 ? 1 : 6;
            } else {
                i = num.intValue();
            }
            String str = this.f17728f.f18546g;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = i;
            }
            editorInfo.imeOptions = i | editorInfo.imeOptions;
            C9036b bVar2 = new C9036b(view, this.f17727e.f17743b, this.f17726d, this.f17730h, editorInfo);
            editorInfo.initialSelStart = Selection.getSelectionStart(this.f17730h);
            editorInfo.initialSelEnd = Selection.getSelectionEnd(this.f17730h);
            this.f17732j = bVar2;
            return bVar2;
        } else if (this.f17737o) {
            return this.f17732j;
        } else {
            InputConnection onCreateInputConnection = this.f17733k.mo46686c(Integer.valueOf(cVar.f17743b)).onCreateInputConnection(editorInfo);
            this.f17732j = onCreateInputConnection;
            return onCreateInputConnection;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: n */
    public void mo46625n() {
        this.f17733k.mo46689C();
        this.f17726d.mo47543l((TextInputChannel.C9429e) null);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f17736n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    @NonNull
    /* renamed from: o */
    public InputMethodManager mo46626o() {
        return this.f17724b;
    }

    @Nullable
    /* renamed from: p */
    public InputConnection mo46627p() {
        return this.f17732j;
    }

    /* renamed from: q */
    public final void mo46628q(View view) {
        mo46634x();
        this.f17724b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: s */
    public final boolean mo46629s() {
        if (this.f17724b.getCurrentInputMethodSubtype() == null || Build.VERSION.SDK_INT < 21 || !Build.MANUFACTURER.equals(ManufacturerUtils.SAMSUNG)) {
            return false;
        }
        return Settings.Secure.getString(this.f17723a.getContext().getContentResolver(), "default_input_method").contains("Samsung");
    }

    /* renamed from: t */
    public void mo46630t() {
        if (this.f17727e.f17742a == C9041c.C9042a.PLATFORM_VIEW) {
            this.f17737o = true;
        }
    }

    /* renamed from: u */
    public final boolean mo46631u() {
        return this.f17729g != null;
    }

    /* renamed from: v */
    public final void mo46632v(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f17725c != null && mo46631u()) {
            this.f17725c.notifyValueChanged(this.f17723a, this.f17728f.f18547h.f18549a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* renamed from: w */
    public final void mo46633w() {
        if (Build.VERSION.SDK_INT >= 26 && this.f17725c != null && mo46631u()) {
            String str = this.f17728f.f18547h.f18549a;
            int[] iArr = new int[2];
            this.f17723a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f17734l);
            rect.offset(iArr[0], iArr[1]);
            this.f17725c.notifyViewEntered(this.f17723a, str.hashCode(), rect);
        }
    }

    /* renamed from: x */
    public final void mo46634x() {
        AutofillManager autofillManager;
        TextInputChannel.C9425b bVar;
        TextInputChannel.C9425b.C9426a aVar;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f17725c) != null && (bVar = this.f17728f) != null && (aVar = bVar.f18547h) != null) {
            autofillManager.notifyViewExited(this.f17723a, aVar.f18549a.hashCode());
        }
    }

    /* renamed from: y */
    public void mo46635y(ViewStructure viewStructure, int i) {
        Rect rect;
        if (Build.VERSION.SDK_INT >= 26 && mo46631u()) {
            String str = this.f17728f.f18547h.f18549a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < this.f17729g.size(); i2++) {
                int keyAt = this.f17729g.keyAt(i2);
                TextInputChannel.C9425b.C9426a aVar = this.f17729g.valueAt(i2).f18547h;
                if (aVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    newChild.setAutofillValue(AutofillValue.forText(aVar.f18551c.f18555a));
                    newChild.setAutofillHints(aVar.f18550b);
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    if (str.hashCode() != keyAt || (rect = this.f17734l) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f17734l.height());
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo46636z(double d, double d2, double[] dArr) {
        double d3 = d;
        double d4 = d2;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d5 = dArr2[12] / dArr2[15];
        dArr3[1] = d5;
        dArr3[0] = d5;
        double d6 = dArr2[13] / dArr2[15];
        dArr3[3] = d6;
        dArr3[2] = d6;
        C9040b bVar = new C9040b(this, z, dArr2, dArr3);
        bVar.mo46647a(d3, 0.0d);
        bVar.mo46647a(d3, d4);
        bVar.mo46647a(0.0d, d4);
        Float valueOf = Float.valueOf(this.f17723a.getContext().getResources().getDisplayMetrics().density);
        this.f17734l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }
}
