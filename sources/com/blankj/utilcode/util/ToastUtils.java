package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.blankj.utilcode.R$id;
import com.blankj.utilcode.R$layout;
import java.lang.reflect.Field;
import p040c.p072c.p073a.p074a.C1493b0;
import p040c.p072c.p073a.p074a.C1535z;

public final class ToastUtils {

    /* renamed from: l */
    public static final ToastUtils f6982l = m9596o();

    /* renamed from: m */
    public static C3824d f6983m;

    /* renamed from: a */
    public String f6984a;

    /* renamed from: b */
    public int f6985b = -1;

    /* renamed from: c */
    public int f6986c = -1;

    /* renamed from: d */
    public int f6987d = -1;

    /* renamed from: e */
    public int f6988e = -16777217;

    /* renamed from: f */
    public int f6989f = -1;

    /* renamed from: g */
    public int f6990g = -16777217;

    /* renamed from: h */
    public int f6991h = -1;

    /* renamed from: i */
    public boolean f6992i = false;

    /* renamed from: j */
    public Drawable[] f6993j = new Drawable[4];

    /* renamed from: k */
    public boolean f6994k = false;

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* renamed from: e */
        public static final int f6995e = C1493b0.m880d(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C1493b0.m885i() - f6995e, Integer.MIN_VALUE), i2);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$a */
    public static class C3819a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ ToastUtils f6996e;

        /* renamed from: l */
        public final /* synthetic */ View f6997l;

        /* renamed from: m */
        public final /* synthetic */ CharSequence f6998m;

        /* renamed from: n */
        public final /* synthetic */ int f6999n;

        public C3819a(ToastUtils toastUtils, View view, CharSequence charSequence, int i) {
            this.f6996e = toastUtils;
            this.f6997l = view;
            this.f6998m = charSequence;
            this.f6999n = i;
        }

        public void run() {
            ToastUtils.m9594l();
            C3824d unused = ToastUtils.f6983m = ToastUtils.m9597p(this.f6996e);
            if (this.f6997l != null) {
                ToastUtils.f6983m.mo21607c(this.f6997l);
            } else {
                ToastUtils.f6983m.mo21606b(this.f6998m);
            }
            ToastUtils.f6983m.mo21610a(this.f6999n);
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$b */
    public static abstract class C3820b implements C3824d {

        /* renamed from: a */
        public Toast f7000a = new Toast(C1535z.m1079a());

        /* renamed from: b */
        public ToastUtils f7001b;

        /* renamed from: c */
        public View f7002c;

        public C3820b(ToastUtils toastUtils) {
            this.f7001b = toastUtils;
            if (toastUtils.f6985b != -1 || this.f7001b.f6986c != -1 || this.f7001b.f6987d != -1) {
                this.f7000a.setGravity(this.f7001b.f6985b, this.f7001b.f6986c, this.f7001b.f6987d);
            }
        }

        /* renamed from: b */
        public void mo21606b(CharSequence charSequence) {
            View i = this.f7001b.mo21597B(charSequence);
            if (i != null) {
                mo21607c(i);
                return;
            }
            View view = this.f7000a.getView();
            this.f7002c = view;
            if (view == null || view.findViewById(16908299) == null) {
                mo21607c(C1493b0.m900x(R$layout.utils_toast_view));
            }
            TextView textView = (TextView) this.f7002c.findViewById(16908299);
            textView.setText(charSequence);
            if (this.f7001b.f6990g != -16777217) {
                textView.setTextColor(this.f7001b.f6990g);
            }
            if (this.f7001b.f6991h != -1) {
                textView.setTextSize((float) this.f7001b.f6991h);
            }
            mo21609d(textView);
        }

        /* renamed from: c */
        public void mo21607c(View view) {
            this.f7002c = view;
            this.f7000a.setView(view);
        }

        @CallSuper
        public void cancel() {
            Toast toast = this.f7000a;
            if (toast != null) {
                toast.cancel();
            }
            this.f7000a = null;
            this.f7002c = null;
        }

        /* renamed from: d */
        public void mo21609d(TextView textView) {
            if (this.f7001b.f6989f != -1) {
                this.f7002c.setBackgroundResource(this.f7001b.f6989f);
                textView.setBackgroundColor(0);
            } else if (this.f7001b.f6988e != -16777217) {
                Drawable background = this.f7002c.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f7001b.f6988e, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f7001b.f6988e, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f7001b.f6988e, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f7002c.setBackgroundColor(this.f7001b.f6988e);
                }
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$c */
    public static final class C3821c extends C3820b {

        /* renamed from: e */
        public static int f7003e;

        /* renamed from: d */
        public C1535z.C1536a f7004d;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$c$a */
        public class C3822a implements Runnable {
            public C3822a() {
            }

            public void run() {
                C3821c.this.cancel();
            }
        }

        /* renamed from: com.blankj.utilcode.util.ToastUtils$c$b */
        public class C3823b extends C1535z.C1536a {

            /* renamed from: a */
            public final /* synthetic */ int f7006a;

            public C3823b(int i) {
                this.f7006a = i;
            }

            /* renamed from: a */
            public void mo15436a(@NonNull Activity activity) {
                if (activity == null) {
                    throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
                } else if (C3821c.this.mo21612h()) {
                    C3821c.this.mo21615k(activity, this.f7006a, false);
                }
            }
        }

        public C3821c(ToastUtils toastUtils) {
            super(toastUtils);
        }

        /* renamed from: a */
        public void mo21610a(int i) {
            if (this.f7000a != null) {
                if (!C1493b0.m896t()) {
                    mo21614j(i);
                    return;
                }
                boolean z = false;
                for (Activity next : C1493b0.m884h()) {
                    if (C1493b0.m895s(next)) {
                        mo21615k(next, f7003e, true);
                        z = true;
                    }
                }
                if (z) {
                    mo21613i();
                    C1493b0.m873C(new C3822a(), i == 0 ? ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS : 3500);
                    f7003e++;
                    return;
                }
                mo21614j(i);
            }
        }

        public void cancel() {
            Window window;
            if (mo21612h()) {
                mo21616l();
                for (Activity next : C1493b0.m884h()) {
                    if (C1493b0.m895s(next) && (window = next.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append("TAG_TOAST");
                        sb.append(f7003e - 1);
                        View findViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (findViewWithTag != null) {
                            try {
                                viewGroup.removeView(findViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            super.cancel();
        }

        /* renamed from: g */
        public final View mo21611g(int i) {
            Bitmap E = C1493b0.m875E(this.f7002c);
            ImageView imageView = new ImageView(C1535z.m1079a());
            imageView.setTag("TAG_TOAST" + i);
            imageView.setImageBitmap(E);
            return imageView;
        }

        /* renamed from: h */
        public final boolean mo21612h() {
            return this.f7004d != null;
        }

        /* renamed from: i */
        public final void mo21613i() {
            C3823b bVar = new C3823b(f7003e);
            this.f7004d = bVar;
            C1493b0.m877a(bVar);
        }

        /* renamed from: j */
        public final void mo21614j(int i) {
            C3825e eVar = new C3825e(this.f7001b);
            eVar.f7000a = this.f7000a;
            eVar.mo21610a(i);
        }

        /* renamed from: k */
        public final void mo21615k(Activity activity, int i, boolean z) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.f7000a.getGravity();
                layoutParams.bottomMargin = this.f7000a.getYOffset() + C1493b0.m891o();
                layoutParams.leftMargin = this.f7000a.getXOffset();
                View g = mo21611g(i);
                if (z) {
                    g.setAlpha(0.0f);
                    g.animate().alpha(1.0f).setDuration(200).start();
                }
                viewGroup.addView(g, layoutParams);
            }
        }

        /* renamed from: l */
        public final void mo21616l() {
            C1493b0.m871A(this.f7004d);
            this.f7004d = null;
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$d */
    public interface C3824d {
        /* renamed from: a */
        void mo21610a(int i);

        /* renamed from: b */
        void mo21606b(CharSequence charSequence);

        /* renamed from: c */
        void mo21607c(View view);

        void cancel();
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$e */
    public static final class C3825e extends C3820b {

        /* renamed from: com.blankj.utilcode.util.ToastUtils$e$a */
        public static class C3826a extends Handler {

            /* renamed from: a */
            public Handler f7008a;

            public C3826a(Handler handler) {
                this.f7008a = handler;
            }

            public void dispatchMessage(@NonNull Message message) {
                if (message != null) {
                    try {
                        this.f7008a.dispatchMessage(message);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new NullPointerException("Argument 'msg' of type Message (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
                }
            }

            public void handleMessage(@NonNull Message message) {
                if (message != null) {
                    this.f7008a.handleMessage(message);
                    return;
                }
                throw new NullPointerException("Argument 'msg' of type Message (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        public C3825e(ToastUtils toastUtils) {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f7000a);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new C3826a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo21610a(int i) {
            Toast toast = this.f7000a;
            if (toast != null) {
                toast.setDuration(i);
                this.f7000a.show();
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.ToastUtils$f */
    public static final class C3827f extends C3820b {

        /* renamed from: d */
        public WindowManager f7009d;

        /* renamed from: e */
        public WindowManager.LayoutParams f7010e;

        /* renamed from: com.blankj.utilcode.util.ToastUtils$f$a */
        public class C3828a implements Runnable {
            public C3828a() {
            }

            public void run() {
                C3827f.this.cancel();
            }
        }

        public C3827f(ToastUtils toastUtils, int i) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f7010e = layoutParams;
            layoutParams.type = i;
        }

        /* renamed from: a */
        public void mo21610a(int i) {
            if (this.f7000a != null) {
                WindowManager.LayoutParams layoutParams = this.f7010e;
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.format = -3;
                layoutParams.windowAnimations = 16973828;
                layoutParams.setTitle("ToastWithoutNotification");
                WindowManager.LayoutParams layoutParams2 = this.f7010e;
                layoutParams2.flags = 152;
                layoutParams2.packageName = C1535z.m1079a().getPackageName();
                this.f7010e.gravity = this.f7000a.getGravity();
                WindowManager.LayoutParams layoutParams3 = this.f7010e;
                if ((layoutParams3.gravity & 7) == 7) {
                    layoutParams3.horizontalWeight = 1.0f;
                }
                WindowManager.LayoutParams layoutParams4 = this.f7010e;
                if ((layoutParams4.gravity & 112) == 112) {
                    layoutParams4.verticalWeight = 1.0f;
                }
                this.f7010e.x = this.f7000a.getXOffset();
                this.f7010e.y = this.f7000a.getYOffset();
                this.f7010e.horizontalMargin = this.f7000a.getHorizontalMargin();
                this.f7010e.verticalMargin = this.f7000a.getVerticalMargin();
                WindowManager windowManager = (WindowManager) C1535z.m1079a().getSystemService("window");
                this.f7009d = windowManager;
                if (windowManager != null) {
                    try {
                        windowManager.addView(this.f7002c, this.f7010e);
                    } catch (Exception unused) {
                    }
                }
                C1493b0.m873C(new C3828a(), i == 0 ? ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS : 3500);
            }
        }

        public void cancel() {
            try {
                if (this.f7009d != null) {
                    this.f7009d.removeViewImmediate(this.f7002c);
                    this.f7009d = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }
    }

    /* renamed from: A */
    public static void m9582A(String str, Object... objArr) {
        m9599v(C1493b0.m882f(str, objArr), 0, f6982l);
    }

    /* renamed from: l */
    public static void m9594l() {
        C3824d dVar = f6983m;
        if (dVar != null) {
            dVar.cancel();
            f6983m = null;
        }
    }

    /* renamed from: n */
    public static CharSequence m9595n(CharSequence charSequence) {
        if (charSequence == null) {
            return "toast null";
        }
        return charSequence.length() == 0 ? "toast nothing" : charSequence;
    }

    /* renamed from: o */
    public static ToastUtils m9596o() {
        return new ToastUtils();
    }

    /* renamed from: p */
    public static C3824d m9597p(ToastUtils toastUtils) {
        if (!toastUtils.f6994k && NotificationManagerCompat.from(C1535z.m1079a()).areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT < 23) {
                return new C3825e(toastUtils);
            }
            if (!C1493b0.m897u()) {
                return new C3825e(toastUtils);
            }
        }
        if (Build.VERSION.SDK_INT < 25) {
            return new C3827f(toastUtils, 2005);
        }
        if (C1493b0.m897u()) {
            if (Build.VERSION.SDK_INT >= 26) {
                new C3827f(toastUtils, 2038);
            } else {
                new C3827f(toastUtils, 2002);
            }
        }
        return new C3821c(toastUtils);
    }

    /* renamed from: u */
    public static void m9598u(@Nullable View view, CharSequence charSequence, int i, ToastUtils toastUtils) {
        C1493b0.m872B(new C3819a(toastUtils, view, charSequence, i));
    }

    /* renamed from: v */
    public static void m9599v(CharSequence charSequence, int i, ToastUtils toastUtils) {
        m9598u((View) null, m9595n(charSequence), i, toastUtils);
    }

    /* renamed from: x */
    public static void m9600x(@StringRes int i) {
        m9599v(C1493b0.m893q(i), 1, f6982l);
    }

    /* renamed from: y */
    public static void m9601y(String str, Object... objArr) {
        m9599v(C1493b0.m882f(str, objArr), 1, f6982l);
    }

    /* renamed from: z */
    public static void m9602z(@StringRes int i) {
        m9599v(C1493b0.m893q(i), 0, f6982l);
    }

    /* renamed from: B */
    public final View mo21597B(CharSequence charSequence) {
        if (!"dark".equals(this.f6984a) && !"light".equals(this.f6984a)) {
            Drawable[] drawableArr = this.f6993j;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View x = C1493b0.m900x(R$layout.utils_toast_view);
        TextView textView = (TextView) x.findViewById(16908299);
        if ("dark".equals(this.f6984a)) {
            ((GradientDrawable) x.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f6993j[0] != null) {
            View findViewById = x.findViewById(R$id.utvLeftIconView);
            ViewCompat.setBackground(findViewById, this.f6993j[0]);
            findViewById.setVisibility(0);
        }
        if (this.f6993j[1] != null) {
            View findViewById2 = x.findViewById(R$id.utvTopIconView);
            ViewCompat.setBackground(findViewById2, this.f6993j[1]);
            findViewById2.setVisibility(0);
        }
        if (this.f6993j[2] != null) {
            View findViewById3 = x.findViewById(R$id.utvRightIconView);
            ViewCompat.setBackground(findViewById3, this.f6993j[2]);
            findViewById3.setVisibility(0);
        }
        if (this.f6993j[3] != null) {
            View findViewById4 = x.findViewById(R$id.utvBottomIconView);
            ViewCompat.setBackground(findViewById4, this.f6993j[3]);
            findViewById4.setVisibility(0);
        }
        return x;
    }

    /* renamed from: m */
    public final int mo21598m() {
        return this.f6992i ? 1 : 0;
    }

    /* renamed from: q */
    public final ToastUtils mo21599q(@ColorInt int i) {
        this.f6988e = i;
        return this;
    }

    /* renamed from: r */
    public final ToastUtils mo21600r(int i, int i2, int i3) {
        this.f6985b = i;
        this.f6986c = i2;
        this.f6987d = i3;
        return this;
    }

    /* renamed from: s */
    public final ToastUtils mo21601s(String str) {
        this.f6984a = str;
        return this;
    }

    /* renamed from: t */
    public final ToastUtils mo21602t(@ColorInt int i) {
        this.f6990g = i;
        return this;
    }

    /* renamed from: w */
    public final void mo21603w(String str, Object... objArr) {
        m9599v(C1493b0.m882f(str, objArr), mo21598m(), this);
    }
}
