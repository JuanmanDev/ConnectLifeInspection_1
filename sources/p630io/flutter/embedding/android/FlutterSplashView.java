package p630io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p557a.C8914g;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p630io.flutter.embedding.android.FlutterView;

/* renamed from: io.flutter.embedding.android.FlutterSplashView */
public final class FlutterSplashView extends FrameLayout {

    /* renamed from: t */
    public static String f18455t = "FlutterSplashView";
    @Nullable

    /* renamed from: e */
    public C8914g f18456e;
    @Nullable

    /* renamed from: l */
    public FlutterView f18457l;
    @Nullable

    /* renamed from: m */
    public View f18458m;
    @Nullable

    /* renamed from: n */
    public Bundle f18459n;
    @Nullable

    /* renamed from: o */
    public String f18460o;
    @Nullable

    /* renamed from: p */
    public String f18461p;
    @NonNull

    /* renamed from: q */
    public final FlutterView.C9413d f18462q;
    @NonNull

    /* renamed from: r */
    public final C8969b f18463r;
    @NonNull

    /* renamed from: s */
    public final Runnable f18464s;

    @Keep
    /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new C9403a();
        public String previousCompletedSplashIsolate;
        public Bundle splashScreenState;

        /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState$a */
        public static class C9403a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(SavedState.class.getClassLoader());
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$a */
    public class C9404a implements FlutterView.C9413d {
        public C9404a() {
        }

        /* renamed from: a */
        public void mo47406a() {
        }

        /* renamed from: b */
        public void mo47407b(@NonNull C8916a aVar) {
            FlutterSplashView.this.f18457l.mo47452s(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.mo47393g(flutterSplashView.f18457l, FlutterSplashView.this.f18456e);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$b */
    public class C9405b implements C8969b {
        public C9405b() {
        }

        /* renamed from: a */
        public void mo46342a() {
        }

        /* renamed from: b */
        public void mo46343b() {
            if (FlutterSplashView.this.f18456e != null) {
                FlutterSplashView.this.mo47397k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$c */
    public class C9406c implements Runnable {
        public C9406c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f18458m);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f18461p = flutterSplashView2.f18460o;
        }
    }

    public FlutterSplashView(@NonNull Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: g */
    public void mo47393g(@NonNull FlutterView flutterView, @Nullable C8914g gVar) {
        FlutterView flutterView2 = this.f18457l;
        if (flutterView2 != null) {
            flutterView2.mo47453t(this.f18463r);
            removeView(this.f18457l);
        }
        View view = this.f18458m;
        if (view != null) {
            removeView(view);
        }
        this.f18457l = flutterView;
        addView(flutterView);
        this.f18456e = gVar;
        if (gVar == null) {
            return;
        }
        if (mo47395i()) {
            C8896b.m24032d(f18455t, "Showing splash screen UI.");
            View createSplashView = gVar.createSplashView(getContext(), this.f18459n);
            this.f18458m = createSplashView;
            addView(createSplashView);
            flutterView.mo47431h(this.f18463r);
        } else if (mo47396j()) {
            C8896b.m24032d(f18455t, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View createSplashView2 = gVar.createSplashView(getContext(), this.f18459n);
            this.f18458m = createSplashView2;
            addView(createSplashView2);
            mo47397k();
        } else if (!flutterView.mo47451r()) {
            C8896b.m24032d(f18455t, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            flutterView.mo47428g(this.f18462q);
        }
    }

    /* renamed from: h */
    public final boolean mo47394h() {
        FlutterView flutterView = this.f18457l;
        if (flutterView == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (flutterView.mo47451r()) {
            return this.f18457l.getAttachedFlutterEngine().mo46371h().mo46438i() != null && this.f18457l.getAttachedFlutterEngine().mo46371h().mo46438i().equals(this.f18461p);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: i */
    public final boolean mo47395i() {
        FlutterView flutterView = this.f18457l;
        return flutterView != null && flutterView.mo47451r() && !this.f18457l.mo47449p() && !mo47394h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f18456e;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47396j() {
        /*
            r1 = this;
            io.flutter.embedding.android.FlutterView r0 = r1.f18457l
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.mo47451r()
            if (r0 == 0) goto L_0x001c
            f.a.d.a.g r0 = r1.f18456e
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.doesSplashViewRememberItsTransition()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.mo47398l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.android.FlutterSplashView.mo47396j():boolean");
    }

    /* renamed from: k */
    public final void mo47397k() {
        this.f18460o = this.f18457l.getAttachedFlutterEngine().mo46371h().mo46438i();
        String str = f18455t;
        C8896b.m24032d(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f18460o);
        this.f18456e.transitionToFlutter(this.f18464s);
    }

    /* renamed from: l */
    public final boolean mo47398l() {
        FlutterView flutterView = this.f18457l;
        if (flutterView == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (flutterView.mo47451r()) {
            return this.f18457l.mo47449p() && !mo47394h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f18461p = savedState.previousCompletedSplashIsolate;
        this.f18459n = savedState.splashScreenState;
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f18461p;
        C8914g gVar = this.f18456e;
        Bundle unused2 = savedState.splashScreenState = gVar != null ? gVar.saveSplashScreenState() : null;
        return savedState;
    }

    public FlutterSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlutterSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18462q = new C9404a();
        this.f18463r = new C9405b();
        this.f18464s = new C9406c();
        setSaveEnabled(true);
    }
}
