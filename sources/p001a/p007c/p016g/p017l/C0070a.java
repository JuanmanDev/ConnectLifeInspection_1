package p001a.p007c.p016g.p017l;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: a.c.g.l.a */
/* compiled from: lambda */
public final /* synthetic */ class C0070a implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a */
    public final /* synthetic */ View f105a;

    public /* synthetic */ C0070a(View view) {
        this.f105a = view;
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.m86a(this.f105a, inputContentInfoCompat, i, bundle);
    }
}
