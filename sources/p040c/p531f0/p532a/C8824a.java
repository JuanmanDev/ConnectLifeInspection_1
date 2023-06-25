package p040c.p531f0.p532a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.UCropActivity;

/* renamed from: c.f0.a.a */
/* compiled from: UCrop */
public class C8824a {

    /* renamed from: a */
    public Intent f17148a = new Intent();

    /* renamed from: b */
    public Bundle f17149b;

    /* renamed from: c.f0.a.a$a */
    /* compiled from: UCrop */
    public static class C8825a {

        /* renamed from: a */
        public final Bundle f17150a = new Bundle();

        @NonNull
        /* renamed from: a */
        public Bundle mo45970a() {
            return this.f17150a;
        }

        /* renamed from: b */
        public void mo45971b(boolean z) {
            this.f17150a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        /* renamed from: c */
        public void mo45972c(boolean z) {
            this.f17150a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        /* renamed from: d */
        public void mo45973d(@Nullable String str) {
            this.f17150a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }
    }

    public C8824a(@NonNull Uri uri, @NonNull Uri uri2) {
        Bundle bundle = new Bundle();
        this.f17149b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f17149b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    @Nullable
    /* renamed from: a */
    public static Throwable m23747a(@NonNull Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    @Nullable
    /* renamed from: c */
    public static Uri m23748c(@NonNull Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: d */
    public static C8824a m23749d(@NonNull Uri uri, @NonNull Uri uri2) {
        return new C8824a(uri, uri2);
    }

    /* renamed from: b */
    public Intent mo45964b(@NonNull Context context) {
        this.f17148a.setClass(context, UCropActivity.class);
        this.f17148a.putExtras(this.f17149b);
        return this.f17148a;
    }

    /* renamed from: e */
    public void mo45965e(@NonNull Activity activity) {
        mo45966f(activity, 69);
    }

    /* renamed from: f */
    public void mo45966f(@NonNull Activity activity, int i) {
        activity.startActivityForResult(mo45964b(activity), i);
    }

    /* renamed from: g */
    public C8824a mo45967g(float f, float f2) {
        this.f17149b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.f17149b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    /* renamed from: h */
    public C8824a mo45968h(@IntRange(from = 10) int i, @IntRange(from = 10) int i2) {
        if (i < 10) {
            i = 10;
        }
        if (i2 < 10) {
            i2 = 10;
        }
        this.f17149b.putInt("com.yalantis.ucrop.MaxSizeX", i);
        this.f17149b.putInt("com.yalantis.ucrop.MaxSizeY", i2);
        return this;
    }

    /* renamed from: i */
    public C8824a mo45969i(@NonNull C8825a aVar) {
        this.f17149b.putAll(aVar.mo45970a());
        return this;
    }
}
