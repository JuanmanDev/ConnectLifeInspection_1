package p553f.p554a.p570e.p575e;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p630io.flutter.view.AccessibilityBridge;

/* renamed from: f.a.e.e.c */
/* compiled from: AccessibilityEventsDelegate */
public class C9051c {

    /* renamed from: a */
    public AccessibilityBridge f17757a;

    /* renamed from: a */
    public boolean mo46656a(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge = this.f17757a;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.mo47599r(view, view2, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo46657b(@Nullable AccessibilityBridge accessibilityBridge) {
        this.f17757a = accessibilityBridge;
    }
}
