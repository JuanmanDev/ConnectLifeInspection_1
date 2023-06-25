package androidx.navigation.p030ui;

import android.view.Menu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavGraph;
import androidx.navigation.p030ui.AppBarConfiguration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b¢\u0006\u0004\b\b\u0010\f\u001a:\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\b¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, mo47991d2 = {"Landroid/view/Menu;", "topLevelMenu", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/Function0;", "", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/AppBarConfiguration;", "AppBarConfiguration", "(Landroid/view/Menu;Landroidx/drawerlayout/widget/DrawerLayout;Lkotlin/Function0;)Landroidx/navigation/ui/AppBarConfiguration;", "Landroidx/navigation/NavGraph;", "navGraph", "(Landroidx/navigation/NavGraph;Landroidx/drawerlayout/widget/DrawerLayout;Lkotlin/Function0;)Landroidx/navigation/ui/AppBarConfiguration;", "", "", "topLevelDestinationIds", "(Ljava/util/Set;Landroidx/drawerlayout/widget/DrawerLayout;Lkotlin/Function0;)Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: androidx.navigation.ui.AppBarConfigurationKt */
/* compiled from: AppBarConfiguration.kt */
public final class AppBarConfigurationKt {
    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull NavGraph navGraph, @Nullable DrawerLayout drawerLayout, @NotNull Function0<Boolean> function0) {
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, DrawerLayout drawerLayout, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            drawerLayout = null;
        }
        if ((i & 4) != 0) {
            function0 = AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE;
        }
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull Menu menu, @Nullable DrawerLayout drawerLayout, @NotNull Function0<Boolean> function0) {
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu menu, DrawerLayout drawerLayout, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            drawerLayout = null;
        }
        if ((i & 4) != 0) {
            function0 = AppBarConfigurationKt$AppBarConfiguration$2.INSTANCE;
        }
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull Set<Integer> set, @Nullable DrawerLayout drawerLayout, @NotNull Function0<Boolean> function0) {
        AppBarConfiguration build = new AppBarConfiguration.Builder(set).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set set, DrawerLayout drawerLayout, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            drawerLayout = null;
        }
        if ((i & 4) != 0) {
            function0 = AppBarConfigurationKt$AppBarConfiguration$3.INSTANCE;
        }
        AppBarConfiguration build = new AppBarConfiguration.Builder((Set<Integer>) set).setDrawerLayout(drawerLayout).setFallbackOnNavigateUpListener(new C0823x56421ee5(function0)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }
}
