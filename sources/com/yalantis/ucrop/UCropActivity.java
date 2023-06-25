package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p040c.p531f0.p532a.p533c.C8827a;
import p040c.p531f0.p532a.p536f.C8850i;

public class UCropActivity extends AppCompatActivity {

    /* renamed from: O */
    public static final Bitmap.CompressFormat f17222O = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    public ViewGroup f17223A;

    /* renamed from: B */
    public ViewGroup f17224B;

    /* renamed from: C */
    public ViewGroup f17225C;

    /* renamed from: D */
    public ViewGroup f17226D;

    /* renamed from: E */
    public List<ViewGroup> f17227E = new ArrayList();

    /* renamed from: F */
    public TextView f17228F;

    /* renamed from: G */
    public TextView f17229G;

    /* renamed from: H */
    public View f17230H;

    /* renamed from: I */
    public Transition f17231I;

    /* renamed from: J */
    public Bitmap.CompressFormat f17232J = f17222O;

    /* renamed from: K */
    public int f17233K = 90;

    /* renamed from: L */
    public int[] f17234L = {1, 2, 3};

    /* renamed from: M */
    public TransformImageView.C8880b f17235M = new C8856a();

    /* renamed from: N */
    public final View.OnClickListener f17236N = new C8862g();

    /* renamed from: e */
    public String f17237e;

    /* renamed from: l */
    public int f17238l;

    /* renamed from: m */
    public int f17239m;

    /* renamed from: n */
    public int f17240n;

    /* renamed from: o */
    public int f17241o;
    @ColorInt

    /* renamed from: p */
    public int f17242p;
    @DrawableRes

    /* renamed from: q */
    public int f17243q;
    @DrawableRes

    /* renamed from: r */
    public int f17244r;

    /* renamed from: s */
    public int f17245s;

    /* renamed from: t */
    public boolean f17246t;

    /* renamed from: u */
    public boolean f17247u = true;

    /* renamed from: v */
    public UCropView f17248v;

    /* renamed from: w */
    public GestureCropImageView f17249w;

    /* renamed from: x */
    public OverlayView f17250x;

    /* renamed from: y */
    public ViewGroup f17251y;

    /* renamed from: z */
    public ViewGroup f17252z;

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    public class C8856a implements TransformImageView.C8880b {
        public C8856a() {
        }

        /* renamed from: a */
        public void mo46075a(float f) {
            UCropActivity.this.mo46055H(f);
        }

        /* renamed from: b */
        public void mo46076b() {
            UCropActivity.this.f17248v.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f17230H.setClickable(false);
            boolean unused = UCropActivity.this.f17247u = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: c */
        public void mo46077c(@NonNull Exception exc) {
            UCropActivity.this.mo46059L(exc);
            UCropActivity.this.finish();
        }

        /* renamed from: d */
        public void mo46078d(float f) {
            UCropActivity.this.mo46061N(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    public class C8857b implements View.OnClickListener {
        public C8857b() {
        }

        public void onClick(View view) {
            UCropActivity.this.f17249w.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).mo46216b(view.isSelected()));
            UCropActivity.this.f17249w.mo46146x();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f17227E) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    public class C8858c implements HorizontalProgressWheelView.C8883a {
        public C8858c() {
        }

        /* renamed from: a */
        public void mo46080a() {
            UCropActivity.this.f17249w.mo46146x();
        }

        /* renamed from: b */
        public void mo46081b(float f, float f2) {
            UCropActivity.this.f17249w.mo46144v(f / 42.0f);
        }

        /* renamed from: c */
        public void mo46082c() {
            UCropActivity.this.f17249w.mo46132r();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    public class C8859d implements View.OnClickListener {
        public C8859d() {
        }

        public void onClick(View view) {
            UCropActivity.this.mo46052E();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    public class C8860e implements View.OnClickListener {
        public C8860e() {
        }

        public void onClick(View view) {
            UCropActivity.this.mo46053F(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    public class C8861f implements HorizontalProgressWheelView.C8883a {
        public C8861f() {
        }

        /* renamed from: a */
        public void mo46080a() {
            UCropActivity.this.f17249w.mo46146x();
        }

        /* renamed from: b */
        public void mo46081b(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.f17249w.mo46119A(UCropActivity.this.f17249w.getCurrentScale() + (f * ((UCropActivity.this.f17249w.getMaxScale() - UCropActivity.this.f17249w.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f17249w.mo46121C(UCropActivity.this.f17249w.getCurrentScale() + (f * ((UCropActivity.this.f17249w.getMaxScale() - UCropActivity.this.f17249w.getMinScale()) / 15000.0f)));
            }
        }

        /* renamed from: c */
        public void mo46082c() {
            UCropActivity.this.f17249w.mo46132r();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    public class C8862g implements View.OnClickListener {
        public C8862g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.mo46064Q(view.getId());
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    public class C8863h implements C8827a {
        public C8863h() {
        }

        /* renamed from: a */
        public void mo45976a(@NonNull Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.mo46060M(uri, uCropActivity.f17249w.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        /* renamed from: b */
        public void mo45977b(@NonNull Throwable th) {
            UCropActivity.this.mo46059L(th);
            UCropActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* renamed from: A */
    public final void mo46048A(int i) {
        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R$id.ucrop_photobox), this.f17231I);
        int i2 = 0;
        this.f17223A.findViewById(R$id.text_view_scale).setVisibility(i == R$id.state_scale ? 0 : 8);
        this.f17251y.findViewById(R$id.text_view_crop).setVisibility(i == R$id.state_aspect_ratio ? 0 : 8);
        View findViewById = this.f17252z.findViewById(R$id.text_view_rotate);
        if (i != R$id.state_rotate) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    /* renamed from: B */
    public void mo46049B() {
        this.f17230H.setClickable(true);
        this.f17247u = true;
        supportInvalidateOptionsMenu();
        this.f17249w.mo46133s(this.f17232J, this.f17233K, new C8863h());
    }

    /* renamed from: C */
    public final void mo46050C() {
        UCropView uCropView = (UCropView) findViewById(R$id.ucrop);
        this.f17248v = uCropView;
        this.f17249w = uCropView.getCropImageView();
        this.f17250x = this.f17248v.getOverlayView();
        this.f17249w.setTransformImageListener(this.f17235M);
        ((ImageView) findViewById(R$id.image_view_logo)).setColorFilter(this.f17245s, PorterDuff.Mode.SRC_ATOP);
        findViewById(R$id.ucrop_frame).setBackgroundColor(this.f17242p);
        if (!this.f17246t) {
            ((RelativeLayout.LayoutParams) findViewById(R$id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            findViewById(R$id.ucrop_frame).requestLayout();
        }
    }

    /* renamed from: D */
    public final void mo46051D(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = f17222O;
        }
        this.f17232J = valueOf;
        this.f17233K = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f17234L = intArrayExtra;
        }
        this.f17249w.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f17249w.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f17249w.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f17250x.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f17250x.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(R$color.ucrop_color_default_dimmed)));
        this.f17250x.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f17250x.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f17250x.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.f17250x.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.f17250x.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f17250x.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f17250x.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f17250x.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        this.f17250x.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.f17251y;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f17249w.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f17249w.setTargetAspectRatio(0.0f);
        } else {
            this.f17249w.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).mo46111b() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).mo46112c());
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f17249w.setMaxResultImageSizeX(intExtra2);
            this.f17249w.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* renamed from: E */
    public final void mo46052E() {
        GestureCropImageView gestureCropImageView = this.f17249w;
        gestureCropImageView.mo46144v(-gestureCropImageView.getCurrentAngle());
        this.f17249w.mo46146x();
    }

    /* renamed from: F */
    public final void mo46053F(int i) {
        this.f17249w.mo46144v((float) i);
        this.f17249w.mo46146x();
    }

    /* renamed from: G */
    public final void mo46054G(int i) {
        GestureCropImageView gestureCropImageView = this.f17249w;
        int[] iArr = this.f17234L;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f17249w;
        int[] iArr2 = this.f17234L;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* renamed from: H */
    public final void mo46055H(float f) {
        TextView textView = this.f17228F;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: I */
    public final void mo46056I(int i) {
        TextView textView = this.f17228F;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: J */
    public final void mo46057J(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        mo46051D(intent);
        if (uri == null || uri2 == null) {
            mo46059L(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.f17249w.mo46204l(uri, uri2);
        } catch (Exception e) {
            mo46059L(e);
            finish();
        }
    }

    /* renamed from: K */
    public final void mo46058K() {
        if (!this.f17246t) {
            mo46054G(0);
        } else if (this.f17251y.getVisibility() == 0) {
            mo46064Q(R$id.state_aspect_ratio);
        } else {
            mo46064Q(R$id.state_scale);
        }
    }

    /* renamed from: L */
    public void mo46059L(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: M */
    public void mo46060M(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    /* renamed from: N */
    public final void mo46061N(float f) {
        TextView textView = this.f17229G;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    /* renamed from: O */
    public final void mo46062O(int i) {
        TextView textView = this.f17229G;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @TargetApi(21)
    /* renamed from: P */
    public final void mo46063P(@ColorInt int i) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    /* renamed from: Q */
    public final void mo46064Q(@IdRes int i) {
        if (this.f17246t) {
            this.f17251y.setSelected(i == R$id.state_aspect_ratio);
            this.f17252z.setSelected(i == R$id.state_rotate);
            this.f17223A.setSelected(i == R$id.state_scale);
            int i2 = 8;
            this.f17224B.setVisibility(i == R$id.state_aspect_ratio ? 0 : 8);
            this.f17225C.setVisibility(i == R$id.state_rotate ? 0 : 8);
            ViewGroup viewGroup = this.f17226D;
            if (i == R$id.state_scale) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
            mo46048A(i);
            if (i == R$id.state_scale) {
                mo46054G(0);
            } else if (i == R$id.state_rotate) {
                mo46054G(1);
            } else {
                mo46054G(2);
            }
        }
    }

    /* renamed from: R */
    public final void mo46065R() {
        mo46063P(this.f17239m);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f17238l);
        toolbar.setTitleTextColor(this.f17241o);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f17241o);
        textView.setText(this.f17237e);
        Drawable mutate = ContextCompat.getDrawable(this, this.f17243q).mutate();
        mutate.setColorFilter(this.f17241o, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    /* renamed from: S */
    public final void mo46066S(@NonNull Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f17240n);
            aspectRatioTextView.setAspectRatio((AspectRatio) it.next());
            linearLayout.addView(frameLayout);
            this.f17227E.add(frameLayout);
        }
        this.f17227E.get(intExtra).setSelected(true);
        for (ViewGroup onClickListener : this.f17227E) {
            onClickListener.setOnClickListener(new C8857b());
        }
    }

    /* renamed from: T */
    public final void mo46067T() {
        this.f17228F = (TextView) findViewById(R$id.text_view_rotate);
        ((HorizontalProgressWheelView) findViewById(R$id.rotate_scroll_wheel)).setScrollingListener(new C8858c());
        ((HorizontalProgressWheelView) findViewById(R$id.rotate_scroll_wheel)).setMiddleLineColor(this.f17240n);
        findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new C8859d());
        findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new C8860e());
        mo46056I(this.f17240n);
    }

    /* renamed from: U */
    public final void mo46068U() {
        this.f17229G = (TextView) findViewById(R$id.text_view_scale);
        ((HorizontalProgressWheelView) findViewById(R$id.scale_scroll_wheel)).setScrollingListener(new C8861f());
        ((HorizontalProgressWheelView) findViewById(R$id.scale_scroll_wheel)).setMiddleLineColor(this.f17240n);
        mo46062O(this.f17240n);
    }

    /* renamed from: V */
    public final void mo46069V() {
        ImageView imageView = (ImageView) findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new C8850i(imageView.getDrawable(), this.f17240n));
        imageView2.setImageDrawable(new C8850i(imageView2.getDrawable(), this.f17240n));
        imageView3.setImageDrawable(new C8850i(imageView3.getDrawable(), this.f17240n));
    }

    /* renamed from: W */
    public final void mo46070W(@NonNull Intent intent) {
        this.f17239m = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f17238l = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f17240n = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor(this, R$color.ucrop_color_active_controls_color));
        this.f17241o = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f17243q = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f17244r = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f17237e = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f17237e = stringExtra;
        this.f17245s = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(this, R$color.ucrop_color_default_logo));
        this.f17246t = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f17242p = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(this, R$color.ucrop_color_crop_background));
        mo46065R();
        mo46050C();
        if (this.f17246t) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R$id.ucrop_photobox)).findViewById(R$id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R$layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.f17231I = autoTransition;
            autoTransition.setDuration(50);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R$id.state_aspect_ratio);
            this.f17251y = viewGroup2;
            viewGroup2.setOnClickListener(this.f17236N);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R$id.state_rotate);
            this.f17252z = viewGroup3;
            viewGroup3.setOnClickListener(this.f17236N);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R$id.state_scale);
            this.f17223A = viewGroup4;
            viewGroup4.setOnClickListener(this.f17236N);
            this.f17224B = (ViewGroup) findViewById(R$id.layout_aspect_ratio);
            this.f17225C = (ViewGroup) findViewById(R$id.layout_rotate_wheel);
            this.f17226D = (ViewGroup) findViewById(R$id.layout_scale_wheel);
            mo46066S(intent);
            mo46067T();
            mo46068U();
            mo46069V();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        mo46070W(intent);
        mo46057J(intent);
        mo46058K();
        mo46074z();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R$id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f17241o, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                String.format("%s - %s", new Object[]{e.getMessage(), getString(R$string.ucrop_mutate_exception_hint)});
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f17244r);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f17241o, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.menu_crop) {
            mo46049B();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.f17247u);
        menu.findItem(R$id.menu_loader).setVisible(this.f17247u);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f17249w;
        if (gestureCropImageView != null) {
            gestureCropImageView.mo46132r();
        }
    }

    /* renamed from: z */
    public final void mo46074z() {
        if (this.f17230H == null) {
            this.f17230H = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R$id.toolbar);
            this.f17230H.setLayoutParams(layoutParams);
            this.f17230H.setClickable(true);
        }
        ((RelativeLayout) findViewById(R$id.ucrop_photobox)).addView(this.f17230H);
    }
}
