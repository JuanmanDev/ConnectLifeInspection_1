package androidx.navigation.p030ui;

import androidx.navigation.NavController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, mo47991d2 = {"Landroidx/navigation/NavController;", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "", "navigateUp", "(Landroidx/navigation/NavController;Landroidx/drawerlayout/widget/DrawerLayout;)Z", "Landroidx/navigation/ui/AppBarConfiguration;", "appBarConfiguration", "(Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)Z", "navigation-ui-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: androidx.navigation.ui.NavControllerKt */
/* compiled from: NavController.kt */
public final class NavControllerKt {
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean navigateUp(@org.jetbrains.annotations.NotNull androidx.navigation.NavController r3, @org.jetbrains.annotations.Nullable androidx.drawerlayout.widget.DrawerLayout r4) {
        /*
            androidx.navigation.NavGraph r0 = r3.getGraph()
            java.lang.String r1 = "graph"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.p030ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>((androidx.navigation.NavGraph) r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r2.setDrawerLayout(r4)
            if (r1 == 0) goto L_0x001c
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L_0x001c:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.p030ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r4.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            boolean r3 = androidx.navigation.p030ui.NavigationUI.navigateUp((androidx.navigation.NavController) r3, (androidx.navigation.p030ui.AppBarConfiguration) r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p030ui.NavControllerKt.navigateUp(androidx.navigation.NavController, androidx.drawerlayout.widget.DrawerLayout):boolean");
    }

    public static final boolean navigateUp(@NotNull NavController navController, @NotNull AppBarConfiguration appBarConfiguration) {
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
