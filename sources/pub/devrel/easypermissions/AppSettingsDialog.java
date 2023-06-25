package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import net.sqlcipher.database.SQLiteDatabase;

public class AppSettingsDialog implements Parcelable {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new C9996a();
    @StyleRes

    /* renamed from: e */
    public final int f19456e;

    /* renamed from: l */
    public final String f19457l;

    /* renamed from: m */
    public final String f19458m;

    /* renamed from: n */
    public final String f19459n;

    /* renamed from: o */
    public final String f19460o;

    /* renamed from: p */
    public final int f19461p;

    /* renamed from: q */
    public final int f19462q;

    /* renamed from: r */
    public Object f19463r;

    /* renamed from: s */
    public Context f19464s;

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$a */
    public static class C9996a implements Parcelable.Creator<AppSettingsDialog> {
        /* renamed from: a */
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel, (C9996a) null);
        }

        /* renamed from: b */
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }
    }

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$b */
    public static class C9997b {

        /* renamed from: a */
        public final Object f19465a;

        /* renamed from: b */
        public final Context f19466b;
        @StyleRes

        /* renamed from: c */
        public int f19467c = -1;

        /* renamed from: d */
        public String f19468d;

        /* renamed from: e */
        public String f19469e;

        /* renamed from: f */
        public String f19470f;

        /* renamed from: g */
        public String f19471g;

        /* renamed from: h */
        public int f19472h = -1;

        /* renamed from: i */
        public boolean f19473i = false;

        public C9997b(@NonNull Activity activity) {
            this.f19465a = activity;
            this.f19466b = activity;
        }

        @NonNull
        /* renamed from: a */
        public AppSettingsDialog mo53744a() {
            this.f19468d = TextUtils.isEmpty(this.f19468d) ? this.f19466b.getString(R$string.rationale_ask_again) : this.f19468d;
            this.f19469e = TextUtils.isEmpty(this.f19469e) ? this.f19466b.getString(R$string.title_settings_dialog) : this.f19469e;
            this.f19470f = TextUtils.isEmpty(this.f19470f) ? this.f19466b.getString(17039370) : this.f19470f;
            this.f19471g = TextUtils.isEmpty(this.f19471g) ? this.f19466b.getString(17039360) : this.f19471g;
            int i = this.f19472h;
            if (i <= 0) {
                i = 16061;
            }
            this.f19472h = i;
            int i2 = 0;
            if (this.f19473i) {
                i2 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            return new AppSettingsDialog(this.f19465a, this.f19467c, this.f19468d, this.f19469e, this.f19470f, this.f19471g, this.f19472h, i2, (C9996a) null);
        }
    }

    public /* synthetic */ AppSettingsDialog(Parcel parcel, C9996a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static AppSettingsDialog m26757a(Intent intent, Activity activity) {
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras();
            appSettingsDialog = new C9997b(activity).mo53744a();
        }
        appSettingsDialog.mo53734c(activity);
        return appSettingsDialog;
    }

    /* renamed from: b */
    public int mo53733b() {
        return this.f19462q;
    }

    /* renamed from: c */
    public final void mo53734c(Object obj) {
        this.f19463r = obj;
        if (obj instanceof Activity) {
            this.f19464s = (Activity) obj;
        } else if (obj instanceof Fragment) {
            this.f19464s = ((Fragment) obj).getContext();
        } else {
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    /* renamed from: d */
    public void mo53735d() {
        mo53738f(AppSettingsDialogHolderActivity.m26766p(this.f19464s, this));
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public AlertDialog mo53737e(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder;
        int i = this.f19456e;
        if (i != -1) {
            builder = new AlertDialog.Builder(this.f19464s, i);
        } else {
            builder = new AlertDialog.Builder(this.f19464s);
        }
        return builder.setCancelable(false).setTitle((CharSequence) this.f19458m).setMessage((CharSequence) this.f19457l).setPositiveButton((CharSequence) this.f19459n, onClickListener).setNegativeButton((CharSequence) this.f19460o, onClickListener2).show();
    }

    /* renamed from: f */
    public final void mo53738f(Intent intent) {
        Object obj = this.f19463r;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.f19461p);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.f19461p);
        }
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f19456e);
        parcel.writeString(this.f19457l);
        parcel.writeString(this.f19458m);
        parcel.writeString(this.f19459n);
        parcel.writeString(this.f19460o);
        parcel.writeInt(this.f19461p);
        parcel.writeInt(this.f19462q);
    }

    public /* synthetic */ AppSettingsDialog(Object obj, int i, String str, String str2, String str3, String str4, int i2, int i3, C9996a aVar) {
        this(obj, i, str, str2, str3, str4, i2, i3);
    }

    public AppSettingsDialog(Parcel parcel) {
        this.f19456e = parcel.readInt();
        this.f19457l = parcel.readString();
        this.f19458m = parcel.readString();
        this.f19459n = parcel.readString();
        this.f19460o = parcel.readString();
        this.f19461p = parcel.readInt();
        this.f19462q = parcel.readInt();
    }

    public AppSettingsDialog(@NonNull Object obj, @StyleRes int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3) {
        mo53734c(obj);
        this.f19456e = i;
        this.f19457l = str;
        this.f19458m = str2;
        this.f19459n = str3;
        this.f19460o = str4;
        this.f19461p = i2;
        this.f19462q = i3;
    }
}
