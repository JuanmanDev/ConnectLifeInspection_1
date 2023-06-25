package p040c.p482v.p493b;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.snackbar.Snackbar;
import com.hisense.juconnect.connectlife.R;
import java.lang.ref.WeakReference;

/* renamed from: c.v.b.b */
/* compiled from: SnackbarUtils */
public class C7644b {

    /* renamed from: a */
    public static WeakReference<Snackbar> f14378a;

    /* renamed from: c.v.b.b$a */
    /* compiled from: SnackbarUtils */
    public class C7645a implements View.OnClickListener {

        /* renamed from: c.v.b.b$a$a */
        /* compiled from: SnackbarUtils */
        public class C7646a extends Snackbar.Callback {
            public C7646a(C7645a aVar) {
            }

            public void onDismissed(Snackbar snackbar, int i) {
                super.onDismissed(snackbar, i);
            }
        }

        public C7645a(C7644b bVar) {
        }

        public void onClick(View view) {
            new C7646a(this);
        }
    }

    public C7644b(@Nullable WeakReference<Snackbar> weakReference) {
        f14378a = weakReference;
    }

    /* renamed from: a */
    public static C7644b m21597a(View view, String str, int i) {
        C7644b bVar = new C7644b(new WeakReference((Snackbar) Snackbar.make(view, (CharSequence) str + "                ", -1).setDuration(i)));
        bVar.mo33067d(-13487566);
        return bVar;
    }

    /* renamed from: b */
    public C7644b mo33065b(int i) {
        if (mo33070g() != null) {
            Button button = (Button) mo33070g().getView().findViewById(R.id.snackbar_action);
            button.setTextSize((float) i);
            button.setTypeface((Typeface) null, 1);
        }
        return this;
    }

    /* renamed from: c */
    public C7644b mo33066c(View view, int i) {
        if (mo33070g() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            view.setLayoutParams(layoutParams);
            ((Snackbar.SnackbarLayout) mo33070g().getView()).addView(view, i);
        }
        return this;
    }

    /* renamed from: d */
    public C7644b mo33067d(@ColorInt int i) {
        if (mo33070g() != null) {
            mo33070g().getView().setBackgroundColor(i);
        }
        return this;
    }

    /* renamed from: e */
    public C7644b mo33068e(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        if (mo33070g() != null) {
            mo33070g().getView().setBackgroundColor(i);
            ((TextView) mo33070g().getView().findViewById(R.id.snackbar_text)).setTextColor(i2);
            ((Button) mo33070g().getView().findViewById(R.id.snackbar_action)).setTextColor(i3);
        }
        return this;
    }

    /* renamed from: f */
    public final GradientDrawable mo33069f(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (!(drawable instanceof ColorDrawable)) {
            return null;
        }
        int color = ((ColorDrawable) drawable).getColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    /* renamed from: g */
    public Snackbar mo33070g() {
        WeakReference<Snackbar> weakReference = f14378a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (Snackbar) f14378a.get();
    }

    /* renamed from: h */
    public C7644b mo33071h(float f) {
        GradientDrawable f2;
        if (!(mo33070g() == null || (f2 = mo33069f(mo33070g().getView().getBackground())) == null)) {
            if (f <= 0.0f) {
                f = 12.0f;
            }
            f2.setCornerRadius(f);
            mo33070g().getView().setBackgroundDrawable(f2);
        }
        return this;
    }

    /* renamed from: i */
    public C7644b mo33072i(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (mo33070g() != null) {
            mo33070g().setAction(charSequence, onClickListener);
        }
        return this;
    }

    /* renamed from: j */
    public C7644b mo33073j(@StringRes int i) {
        if (mo33070g() != null) {
            mo33072i(mo33070g().getView().getResources().getText(i), new C7645a(this));
        }
        return this;
    }

    /* renamed from: k */
    public void mo33074k() {
        if (mo33070g() != null) {
            mo33070g().show();
        }
    }

    /* renamed from: l */
    public C7644b mo33075l(int i) {
        if (mo33070g() != null) {
            ((TextView) mo33070g().getView().findViewById(R.id.snackbar_text)).setTextSize((float) i);
        }
        return this;
    }
}
