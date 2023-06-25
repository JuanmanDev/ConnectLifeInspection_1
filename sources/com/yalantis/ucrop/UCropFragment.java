package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
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
import p040c.p531f0.p532a.C8826b;
import p040c.p531f0.p532a.p536f.C8850i;

public class UCropFragment extends Fragment {

    /* renamed from: G */
    public static final Bitmap.CompressFormat f17261G = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    public TextView f17262A;

    /* renamed from: B */
    public TextView f17263B;

    /* renamed from: C */
    public View f17264C;

    /* renamed from: D */
    public int[] f17265D = {1, 2, 3};

    /* renamed from: E */
    public TransformImageView.C8880b f17266E = new C8864a();

    /* renamed from: F */
    public final View.OnClickListener f17267F = new C8870g();

    /* renamed from: e */
    public C8826b f17268e;

    /* renamed from: l */
    public int f17269l;
    @ColorInt

    /* renamed from: m */
    public int f17270m;

    /* renamed from: n */
    public int f17271n;

    /* renamed from: o */
    public boolean f17272o;

    /* renamed from: p */
    public Transition f17273p;

    /* renamed from: q */
    public UCropView f17274q;

    /* renamed from: r */
    public GestureCropImageView f17275r;

    /* renamed from: s */
    public OverlayView f17276s;

    /* renamed from: t */
    public ViewGroup f17277t;

    /* renamed from: u */
    public ViewGroup f17278u;

    /* renamed from: v */
    public ViewGroup f17279v;

    /* renamed from: w */
    public ViewGroup f17280w;

    /* renamed from: x */
    public ViewGroup f17281x;

    /* renamed from: y */
    public ViewGroup f17282y;

    /* renamed from: z */
    public List<ViewGroup> f17283z = new ArrayList();

    /* renamed from: com.yalantis.ucrop.UCropFragment$a */
    public class C8864a implements TransformImageView.C8880b {
        public C8864a() {
        }

        /* renamed from: a */
        public void mo46075a(float f) {
            UCropFragment.this.mo46094I(f);
        }

        /* renamed from: b */
        public void mo46076b() {
            UCropFragment.this.f17274q.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.f17264C.setClickable(false);
            UCropFragment.this.f17268e.mo45975b(false);
        }

        /* renamed from: c */
        public void mo46077c(@NonNull Exception exc) {
            UCropFragment.this.f17268e.mo45974a(UCropFragment.this.mo46088C(exc));
        }

        /* renamed from: d */
        public void mo46078d(float f) {
            UCropFragment.this.mo46098M(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$b */
    public class C8865b implements View.OnClickListener {
        public C8865b() {
        }

        public void onClick(View view) {
            UCropFragment.this.f17275r.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).mo46216b(view.isSelected()));
            UCropFragment.this.f17275r.mo46146x();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropFragment.this.f17283z) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$c */
    public class C8866c implements HorizontalProgressWheelView.C8883a {
        public C8866c() {
        }

        /* renamed from: a */
        public void mo46080a() {
            UCropFragment.this.f17275r.mo46146x();
        }

        /* renamed from: b */
        public void mo46081b(float f, float f2) {
            UCropFragment.this.f17275r.mo46144v(f / 42.0f);
        }

        /* renamed from: c */
        public void mo46082c() {
            UCropFragment.this.f17275r.mo46132r();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$d */
    public class C8867d implements View.OnClickListener {
        public C8867d() {
        }

        public void onClick(View view) {
            UCropFragment.this.mo46091F();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$e */
    public class C8868e implements View.OnClickListener {
        public C8868e() {
        }

        public void onClick(View view) {
            UCropFragment.this.mo46092G(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$f */
    public class C8869f implements HorizontalProgressWheelView.C8883a {
        public C8869f() {
        }

        /* renamed from: a */
        public void mo46080a() {
            UCropFragment.this.f17275r.mo46146x();
        }

        /* renamed from: b */
        public void mo46081b(float f, float f2) {
            if (f > 0.0f) {
                UCropFragment.this.f17275r.mo46119A(UCropFragment.this.f17275r.getCurrentScale() + (f * ((UCropFragment.this.f17275r.getMaxScale() - UCropFragment.this.f17275r.getMinScale()) / 15000.0f)));
            } else {
                UCropFragment.this.f17275r.mo46121C(UCropFragment.this.f17275r.getCurrentScale() + (f * ((UCropFragment.this.f17275r.getMaxScale() - UCropFragment.this.f17275r.getMinScale()) / 15000.0f)));
            }
        }

        /* renamed from: c */
        public void mo46082c() {
            UCropFragment.this.f17275r.mo46132r();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$g */
    public class C8870g implements View.OnClickListener {
        public C8870g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropFragment.this.mo46100O(view.getId());
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$h */
    public class C8871h {

        /* renamed from: a */
        public Intent f17291a;

        public C8871h(UCropFragment uCropFragment, int i, Intent intent) {
            this.f17291a = intent;
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* renamed from: A */
    public final void mo46086A(View view) {
        if (this.f17264C == null) {
            this.f17264C = new View(getContext());
            this.f17264C.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f17264C.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R$id.ucrop_photobox)).addView(this.f17264C);
    }

    /* renamed from: B */
    public final void mo46087B(int i) {
        if (getView() != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) getView().findViewById(R$id.ucrop_photobox), this.f17273p);
        }
        int i2 = 0;
        this.f17279v.findViewById(R$id.text_view_scale).setVisibility(i == R$id.state_scale ? 0 : 8);
        this.f17277t.findViewById(R$id.text_view_crop).setVisibility(i == R$id.state_aspect_ratio ? 0 : 8);
        View findViewById = this.f17278u.findViewById(R$id.text_view_rotate);
        if (i != R$id.state_rotate) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    /* renamed from: C */
    public C8871h mo46088C(Throwable th) {
        return new C8871h(this, 96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: D */
    public final void mo46089D(View view) {
        UCropView uCropView = (UCropView) view.findViewById(R$id.ucrop);
        this.f17274q = uCropView;
        this.f17275r = uCropView.getCropImageView();
        this.f17276s = this.f17274q.getOverlayView();
        this.f17275r.setTransformImageListener(this.f17266E);
        ((ImageView) view.findViewById(R$id.image_view_logo)).setColorFilter(this.f17271n, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R$id.ucrop_frame).setBackgroundColor(this.f17270m);
    }

    /* renamed from: E */
    public final void mo46090E(@NonNull Bundle bundle) {
        String string = bundle.getString("com.yalantis.ucrop.CompressionFormatName");
        if (!TextUtils.isEmpty(string)) {
            Bitmap.CompressFormat valueOf = Bitmap.CompressFormat.valueOf(string);
        }
        bundle.getInt("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArray = bundle.getIntArray("com.yalantis.ucrop.AllowedGestures");
        if (intArray != null && intArray.length == 3) {
            this.f17265D = intArray;
        }
        this.f17275r.setMaxBitmapSize(bundle.getInt("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f17275r.setMaxScaleMultiplier(bundle.getFloat("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f17275r.setImageToWrapCropBoundsAnimDuration((long) bundle.getInt("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f17276s.setFreestyleCropEnabled(bundle.getBoolean("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f17276s.setDimmedColor(bundle.getInt("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(R$color.ucrop_color_default_dimmed)));
        this.f17276s.setCircleDimmedLayer(bundle.getBoolean("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f17276s.setShowCropFrame(bundle.getBoolean("com.yalantis.ucrop.ShowCropFrame", true));
        this.f17276s.setCropFrameColor(bundle.getInt("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.f17276s.setCropFrameStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.f17276s.setShowCropGrid(bundle.getBoolean("com.yalantis.ucrop.ShowCropGrid", true));
        this.f17276s.setCropGridRowCount(bundle.getInt("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f17276s.setCropGridColumnCount(bundle.getInt("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f17276s.setCropGridColor(bundle.getInt("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        this.f17276s.setCropGridStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width)));
        float f = bundle.getFloat("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float f2 = bundle.getFloat("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int i = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (f > 0.0f && f2 > 0.0f) {
            ViewGroup viewGroup = this.f17277t;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f17275r.setTargetAspectRatio(f / f2);
        } else if (parcelableArrayList == null || i >= parcelableArrayList.size()) {
            this.f17275r.setTargetAspectRatio(0.0f);
        } else {
            this.f17275r.setTargetAspectRatio(((AspectRatio) parcelableArrayList.get(i)).mo46111b() / ((AspectRatio) parcelableArrayList.get(i)).mo46112c());
        }
        int i2 = bundle.getInt("com.yalantis.ucrop.MaxSizeX", 0);
        int i3 = bundle.getInt("com.yalantis.ucrop.MaxSizeY", 0);
        if (i2 > 0 && i3 > 0) {
            this.f17275r.setMaxResultImageSizeX(i2);
            this.f17275r.setMaxResultImageSizeY(i3);
        }
    }

    /* renamed from: F */
    public final void mo46091F() {
        GestureCropImageView gestureCropImageView = this.f17275r;
        gestureCropImageView.mo46144v(-gestureCropImageView.getCurrentAngle());
        this.f17275r.mo46146x();
    }

    /* renamed from: G */
    public final void mo46092G(int i) {
        this.f17275r.mo46144v((float) i);
        this.f17275r.mo46146x();
    }

    /* renamed from: H */
    public final void mo46093H(int i) {
        GestureCropImageView gestureCropImageView = this.f17275r;
        int[] iArr = this.f17265D;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f17275r;
        int[] iArr2 = this.f17265D;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* renamed from: I */
    public final void mo46094I(float f) {
        TextView textView = this.f17262A;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: J */
    public final void mo46095J(int i) {
        TextView textView = this.f17262A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: K */
    public final void mo46096K(@NonNull Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) bundle.getParcelable("com.yalantis.ucrop.OutputUri");
        mo46090E(bundle);
        if (uri == null || uri2 == null) {
            this.f17268e.mo45974a(mo46088C(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.f17275r.mo46204l(uri, uri2);
        } catch (Exception e) {
            this.f17268e.mo45974a(mo46088C(e));
        }
    }

    /* renamed from: L */
    public final void mo46097L() {
        if (!this.f17272o) {
            mo46093H(0);
        } else if (this.f17277t.getVisibility() == 0) {
            mo46100O(R$id.state_aspect_ratio);
        } else {
            mo46100O(R$id.state_scale);
        }
    }

    /* renamed from: M */
    public final void mo46098M(float f) {
        TextView textView = this.f17263B;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    /* renamed from: N */
    public final void mo46099N(int i) {
        TextView textView = this.f17263B;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: O */
    public final void mo46100O(@IdRes int i) {
        if (this.f17272o) {
            this.f17277t.setSelected(i == R$id.state_aspect_ratio);
            this.f17278u.setSelected(i == R$id.state_rotate);
            this.f17279v.setSelected(i == R$id.state_scale);
            int i2 = 8;
            this.f17280w.setVisibility(i == R$id.state_aspect_ratio ? 0 : 8);
            this.f17281x.setVisibility(i == R$id.state_rotate ? 0 : 8);
            ViewGroup viewGroup = this.f17282y;
            if (i == R$id.state_scale) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
            mo46087B(i);
            if (i == R$id.state_scale) {
                mo46093H(0);
            } else if (i == R$id.state_rotate) {
                mo46093H(1);
            } else {
                mo46093H(2);
            }
        }
    }

    /* renamed from: P */
    public final void mo46101P(@NonNull Bundle bundle, View view) {
        int i = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            i = 2;
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio((String) null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio((String) null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio((String) null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f17269l);
            aspectRatioTextView.setAspectRatio((AspectRatio) it.next());
            linearLayout.addView(frameLayout);
            this.f17283z.add(frameLayout);
        }
        this.f17283z.get(i).setSelected(true);
        for (ViewGroup onClickListener : this.f17283z) {
            onClickListener.setOnClickListener(new C8865b());
        }
    }

    /* renamed from: Q */
    public final void mo46102Q(View view) {
        this.f17262A = (TextView) view.findViewById(R$id.text_view_rotate);
        ((HorizontalProgressWheelView) view.findViewById(R$id.rotate_scroll_wheel)).setScrollingListener(new C8866c());
        ((HorizontalProgressWheelView) view.findViewById(R$id.rotate_scroll_wheel)).setMiddleLineColor(this.f17269l);
        view.findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new C8867d());
        view.findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new C8868e());
        mo46095J(this.f17269l);
    }

    /* renamed from: R */
    public final void mo46103R(View view) {
        this.f17263B = (TextView) view.findViewById(R$id.text_view_scale);
        ((HorizontalProgressWheelView) view.findViewById(R$id.scale_scroll_wheel)).setScrollingListener(new C8869f());
        ((HorizontalProgressWheelView) view.findViewById(R$id.scale_scroll_wheel)).setMiddleLineColor(this.f17269l);
        mo46099N(this.f17269l);
    }

    /* renamed from: S */
    public final void mo46104S(View view) {
        ImageView imageView = (ImageView) view.findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new C8850i(imageView.getDrawable(), this.f17269l));
        imageView2.setImageDrawable(new C8850i(imageView2.getDrawable(), this.f17269l));
        imageView3.setImageDrawable(new C8850i(imageView3.getDrawable(), this.f17269l));
    }

    /* renamed from: T */
    public void mo46105T(View view, Bundle bundle) {
        this.f17269l = bundle.getInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor(getContext(), R$color.ucrop_color_widget_active));
        this.f17271n = bundle.getInt("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(getContext(), R$color.ucrop_color_default_logo));
        this.f17272o = !bundle.getBoolean("com.yalantis.ucrop.HideBottomControls", false);
        this.f17270m = bundle.getInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(getContext(), R$color.ucrop_color_crop_background));
        mo46089D(view);
        this.f17268e.mo45975b(true);
        if (this.f17272o) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R$id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(getContext()).inflate(R$layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.f17273p = autoTransition;
            autoTransition.setDuration(50);
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R$id.state_aspect_ratio);
            this.f17277t = viewGroup2;
            viewGroup2.setOnClickListener(this.f17267F);
            ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R$id.state_rotate);
            this.f17278u = viewGroup3;
            viewGroup3.setOnClickListener(this.f17267F);
            ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R$id.state_scale);
            this.f17279v = viewGroup4;
            viewGroup4.setOnClickListener(this.f17267F);
            this.f17280w = (ViewGroup) view.findViewById(R$id.layout_aspect_ratio);
            this.f17281x = (ViewGroup) view.findViewById(R$id.layout_rotate_wheel);
            this.f17282y = (ViewGroup) view.findViewById(R$id.layout_scale_wheel);
            mo46101P(bundle, view);
            mo46102Q(view);
            mo46103R(view);
            mo46104S(view);
            return;
        }
        ((RelativeLayout.LayoutParams) view.findViewById(R$id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
        view.findViewById(R$id.ucrop_frame).requestLayout();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof C8826b) {
            this.f17268e = (C8826b) getParentFragment();
        } else if (context instanceof C8826b) {
            this.f17268e = (C8826b) context;
        } else {
            throw new IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        mo46105T(inflate, arguments);
        mo46096K(arguments);
        mo46097L();
        mo46086A(inflate);
        return inflate;
    }
}
