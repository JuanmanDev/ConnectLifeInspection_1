package p687n.p688a.p689a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;

/* renamed from: n.a.a.d */
/* compiled from: RationaleDialogConfig */
public class C9822d {

    /* renamed from: a */
    public String f19103a;

    /* renamed from: b */
    public String f19104b;

    /* renamed from: c */
    public int f19105c;

    /* renamed from: d */
    public int f19106d;

    /* renamed from: e */
    public String f19107e;

    /* renamed from: f */
    public String[] f19108f;

    public C9822d(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String[] strArr) {
        this.f19103a = str;
        this.f19104b = str2;
        this.f19107e = str3;
        this.f19105c = i;
        this.f19106d = i2;
        this.f19108f = strArr;
    }

    /* renamed from: a */
    public AlertDialog mo50753a(Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        if (this.f19105c > 0) {
            builder = new AlertDialog.Builder(context, this.f19105c);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton(this.f19103a, onClickListener).setNegativeButton(this.f19104b, onClickListener).setMessage(this.f19107e).create();
    }

    /* renamed from: b */
    public androidx.appcompat.app.AlertDialog mo50754b(Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        int i = this.f19105c;
        if (i > 0) {
            builder = new AlertDialog.Builder(context, i);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton((CharSequence) this.f19103a, onClickListener).setNegativeButton((CharSequence) this.f19104b, onClickListener).setMessage((CharSequence) this.f19107e).create();
    }

    /* renamed from: c */
    public Bundle mo50755c() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f19103a);
        bundle.putString("negativeButton", this.f19104b);
        bundle.putString("rationaleMsg", this.f19107e);
        bundle.putInt("theme", this.f19105c);
        bundle.putInt("requestCode", this.f19106d);
        bundle.putStringArray("permissions", this.f19108f);
        return bundle;
    }

    public C9822d(Bundle bundle) {
        this.f19103a = bundle.getString("positiveButton");
        this.f19104b = bundle.getString("negativeButton");
        this.f19107e = bundle.getString("rationaleMsg");
        this.f19105c = bundle.getInt("theme");
        this.f19106d = bundle.getInt("requestCode");
        this.f19108f = bundle.getStringArray("permissions");
    }
}
