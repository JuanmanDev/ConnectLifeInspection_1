package androidx.navigation.p030ui;

import androidx.navigation.NavController;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo47991d2 = {"Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "Landroidx/navigation/NavController;", "navController", "", "setupWithNavController", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;Landroidx/navigation/NavController;)V", "navigation-ui-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: androidx.navigation.ui.BottomNavigationViewKt */
/* compiled from: BottomNavigationView.kt */
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(@NotNull BottomNavigationView bottomNavigationView, @NotNull NavController navController) {
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}
