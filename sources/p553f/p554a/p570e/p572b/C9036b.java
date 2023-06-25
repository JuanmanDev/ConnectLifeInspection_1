package p553f.p554a.p570e.p572b;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.internal.ManufacturerUtils;
import p553f.p554a.C8896b;
import p630io.flutter.embedding.engine.FlutterJNI;
import p630io.flutter.embedding.engine.systemchannels.TextInputChannel;

/* renamed from: f.a.e.b.b */
/* compiled from: InputConnectionAdaptor */
public class C9036b extends BaseInputConnection {

    /* renamed from: a */
    public final View f17706a;

    /* renamed from: b */
    public final int f17707b;

    /* renamed from: c */
    public final TextInputChannel f17708c;

    /* renamed from: d */
    public final Editable f17709d;

    /* renamed from: e */
    public final EditorInfo f17710e;

    /* renamed from: f */
    public int f17711f;

    /* renamed from: g */
    public InputMethodManager f17712g;

    /* renamed from: h */
    public final Layout f17713h;

    /* renamed from: i */
    public C9035a f17714i;

    /* renamed from: j */
    public final boolean f17715j;

    /* renamed from: k */
    public boolean f17716k;

    /* renamed from: l */
    public C9037a f17717l;

    /* renamed from: f.a.e.b.b$a */
    /* compiled from: InputConnectionAdaptor */
    public class C9037a {

        /* renamed from: a */
        public int f17718a;

        /* renamed from: b */
        public int f17719b;

        /* renamed from: c */
        public int f17720c;

        /* renamed from: d */
        public int f17721d;

        /* renamed from: e */
        public String f17722e;

        public C9037a(C9036b bVar, Editable editable) {
            this.f17718a = Selection.getSelectionStart(editable);
            this.f17719b = Selection.getSelectionEnd(editable);
            this.f17720c = BaseInputConnection.getComposingSpanStart(editable);
            this.f17721d = BaseInputConnection.getComposingSpanEnd(editable);
            this.f17722e = editable.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9037a)) {
                return false;
            }
            C9037a aVar = (C9037a) obj;
            if (this.f17718a == aVar.f17718a && this.f17719b == aVar.f17719b && this.f17720c == aVar.f17720c && this.f17721d == aVar.f17721d && this.f17722e.equals(aVar.f17722e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((this.f17718a + 31) * 31) + this.f17719b) * 31) + this.f17720c) * 31) + this.f17721d) * 31) + this.f17722e.hashCode();
        }
    }

    public C9036b(View view, int i, TextInputChannel textInputChannel, Editable editable, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f17716k = false;
        this.f17706a = view;
        this.f17707b = i;
        this.f17708c = textInputChannel;
        this.f17709d = editable;
        this.f17710e = editorInfo;
        this.f17711f = 0;
        this.f17714i = new C9035a(flutterJNI);
        this.f17713h = new DynamicLayout(this.f17709d, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f17712g = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f17715j = mo46592b();
    }

    /* renamed from: a */
    public static int m24465a(int i, Editable editable) {
        int max = Math.max(0, Math.min(editable.length(), i));
        if (max != i) {
            C8896b.m24029a("flutter", "Text selection index was clamped (" + i + "->" + max + ") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
        }
        return max;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final boolean mo46592b() {
        if (this.f17712g.getCurrentInputMethodSubtype() == null || Build.VERSION.SDK_INT < 21 || !Build.MANUFACTURER.equals(ManufacturerUtils.SAMSUNG)) {
            return false;
        }
        return Settings.Secure.getString(this.f17706a.getContext().getContentResolver(), "default_input_method").contains("Samsung");
    }

    public boolean beginBatchEdit() {
        this.f17711f++;
        return super.beginBatchEdit();
    }

    /* renamed from: c */
    public void mo46594c() {
        this.f17716k = false;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean clearMetaKeyStates = super.clearMetaKeyStates(i);
        mo46594c();
        return clearMetaKeyStates;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean commitText = super.commitText(charSequence, i);
        mo46594c();
        return commitText;
    }

    /* renamed from: d */
    public final void mo46597d() {
        if (this.f17711f <= 0) {
            C9037a aVar = new C9037a(this, this.f17709d);
            if (!this.f17716k || !aVar.equals(this.f17717l)) {
                this.f17712g.updateSelection(this.f17706a, aVar.f17718a, aVar.f17719b, aVar.f17720c, aVar.f17721d);
                this.f17708c.mo47545n(this.f17707b, aVar.f17722e, aVar.f17718a, aVar.f17719b, aVar.f17720c, aVar.f17721d);
                this.f17716k = true;
                this.f17717l = aVar;
            }
        }
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (Selection.getSelectionStart(this.f17709d) == -1) {
            return true;
        }
        boolean deleteSurroundingText = super.deleteSurroundingText(i, i2);
        mo46594c();
        return deleteSurroundingText;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean deleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
        mo46594c();
        return deleteSurroundingTextInCodePoints;
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f17711f--;
        mo46597d();
        return endBatchEdit;
    }

    public boolean finishComposingText() {
        boolean finishComposingText = super.finishComposingText();
        if (this.f17715j && Build.VERSION.SDK_INT >= 21) {
            CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
            builder.setComposingText(-1, "");
            this.f17712g.updateCursorAnchorInfo(this.f17706a, builder.build());
        }
        mo46594c();
        return finishComposingText;
    }

    public Editable getEditable() {
        return this.f17709d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.selectionStart = Selection.getSelectionStart(this.f17709d);
        extractedText.selectionEnd = Selection.getSelectionEnd(this.f17709d);
        extractedText.text = this.f17709d.toString();
        return extractedText;
    }

    public boolean performContextMenuAction(int i) {
        mo46594c();
        if (i == 16908319) {
            setSelection(0, this.f17709d.length());
            return true;
        } else if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f17709d);
            int selectionEnd = Selection.getSelectionEnd(this.f17709d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f17706a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17709d.subSequence(min, max)));
                this.f17709d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f17709d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f17709d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f17706a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17709d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f17706a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f17706a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f17709d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f17709d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f17709d.delete(min2, max4);
                }
                this.f17709d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    public boolean performEditorAction(int i) {
        mo46594c();
        if (i == 0) {
            this.f17708c.mo47544m(this.f17707b);
        } else if (i == 1) {
            this.f17708c.mo47536e(this.f17707b);
        } else if (i == 2) {
            this.f17708c.mo47535d(this.f17707b);
        } else if (i == 3) {
            this.f17708c.mo47541j(this.f17707b);
        } else if (i == 4) {
            this.f17708c.mo47542k(this.f17707b);
        } else if (i == 5) {
            this.f17708c.mo47537f(this.f17707b);
        } else if (i != 7) {
            this.f17708c.mo47534c(this.f17707b);
        } else {
            this.f17708c.mo47539h(this.f17707b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f17708c.mo47538g(this.f17707b, str, bundle);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        mo46594c();
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                int a = m24465a(Selection.getSelectionStart(this.f17709d), this.f17709d);
                int a2 = m24465a(Selection.getSelectionEnd(this.f17709d), this.f17709d);
                if (a == a2 && a > 0) {
                    a = this.f17714i.mo46584b(this.f17709d, a);
                }
                if (a2 <= a) {
                    return false;
                }
                Selection.setSelection(this.f17709d, a);
                this.f17709d.delete(a, a2);
                mo46597d();
                return true;
            } else if (keyEvent.getKeyCode() == 21) {
                int selectionStart = Selection.getSelectionStart(this.f17709d);
                int selectionEnd = Selection.getSelectionEnd(this.f17709d);
                if (selectionStart != selectionEnd || keyEvent.isShiftPressed()) {
                    setSelection(selectionStart, Math.max(this.f17714i.mo46584b(this.f17709d, selectionEnd), 0));
                } else {
                    int max = Math.max(this.f17714i.mo46584b(this.f17709d, selectionStart), 0);
                    setSelection(max, max);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 22) {
                int selectionStart2 = Selection.getSelectionStart(this.f17709d);
                int selectionEnd2 = Selection.getSelectionEnd(this.f17709d);
                if (selectionStart2 != selectionEnd2 || keyEvent.isShiftPressed()) {
                    setSelection(selectionStart2, Math.min(this.f17714i.mo46583a(this.f17709d, selectionEnd2), this.f17709d.length()));
                } else {
                    int min = Math.min(this.f17714i.mo46583a(this.f17709d, selectionStart2), this.f17709d.length());
                    setSelection(min, min);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 19) {
                if (Selection.getSelectionStart(this.f17709d) != Selection.getSelectionEnd(this.f17709d) || keyEvent.isShiftPressed()) {
                    Selection.extendUp(this.f17709d, this.f17713h);
                    setSelection(Selection.getSelectionStart(this.f17709d), Selection.getSelectionEnd(this.f17709d));
                } else {
                    Selection.moveUp(this.f17709d, this.f17713h);
                    int selectionStart3 = Selection.getSelectionStart(this.f17709d);
                    setSelection(selectionStart3, selectionStart3);
                }
                return true;
            } else if (keyEvent.getKeyCode() == 20) {
                if (Selection.getSelectionStart(this.f17709d) != Selection.getSelectionEnd(this.f17709d) || keyEvent.isShiftPressed()) {
                    Selection.extendDown(this.f17709d, this.f17713h);
                    setSelection(Selection.getSelectionStart(this.f17709d), Selection.getSelectionEnd(this.f17709d));
                } else {
                    Selection.moveDown(this.f17709d, this.f17713h);
                    int selectionStart4 = Selection.getSelectionStart(this.f17709d);
                    setSelection(selectionStart4, selectionStart4);
                }
                return true;
            } else {
                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                    EditorInfo editorInfo = this.f17710e;
                    if ((131072 & editorInfo.inputType) == 0) {
                        performEditorAction(editorInfo.imeOptions & 255);
                        return true;
                    }
                }
                int unicodeChar = keyEvent.getUnicodeChar();
                if (unicodeChar == 0) {
                    return false;
                }
                int max2 = Math.max(0, Selection.getSelectionStart(this.f17709d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f17709d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f17709d.delete(min2, max4);
                }
                this.f17709d.insert(min2, String.valueOf((char) unicodeChar));
                int i = min2 + 1;
                setSelection(i, i);
                return true;
            }
        } else if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        } else {
            int selectionEnd3 = Selection.getSelectionEnd(this.f17709d);
            setSelection(selectionEnd3, selectionEnd3);
            return true;
        }
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean composingRegion = super.setComposingRegion(i, i2);
        mo46594c();
        return composingRegion;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z;
        if (charSequence.length() == 0) {
            z = super.commitText(charSequence, i);
        } else {
            z = super.setComposingText(charSequence, i);
        }
        mo46594c();
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean selection = super.setSelection(i, i2);
        mo46594c();
        mo46597d();
        return selection;
    }

    public C9036b(View view, int i, TextInputChannel textInputChannel, Editable editable, EditorInfo editorInfo) {
        this(view, i, textInputChannel, editable, editorInfo, new FlutterJNI());
    }
}
