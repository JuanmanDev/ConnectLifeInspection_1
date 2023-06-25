package androidx.navigation.p030ui;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, mo47991d2 = {"Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "", "setupWithNavController", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/drawerlayout/widget/DrawerLayout;)V", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)V", "navigation-ui-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* renamed from: androidx.navigation.ui.CollapsingToolbarLayoutKt */
/* compiled from: CollapsingToolbarLayout.kt */
public final class CollapsingToolbarLayoutKt {
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull com.google.android.material.appbar.CollapsingToolbarLayout r3, @org.jetbrains.annotations.NotNull androidx.appcompat.widget.Toolbar r4, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r5, @org.jetbrains.annotations.Nullable androidx.drawerlayout.widget.DrawerLayout r6) {
        /*
            androidx.navigation.NavGraph r0 = r5.getGraph()
            java.lang.String r1 = "navController.graph"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.p030ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>((androidx.navigation.NavGraph) r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r2.setDrawerLayout(r6)
            if (r1 == 0) goto L_0x001c
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L_0x001c:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.p030ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r6.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r6 = r6.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r0)
            androidx.navigation.p030ui.NavigationUI.setupWithNavController((com.google.android.material.appbar.CollapsingToolbarLayout) r3, (androidx.appcompat.widget.Toolbar) r4, (androidx.navigation.NavController) r5, (androidx.navigation.p030ui.AppBarConfiguration) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p030ui.CollapsingToolbarLayoutKt.setupWithNavController(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.drawerlayout.widget.DrawerLayout):void");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void setupWithNavController$default(com.google.android.material.appbar.CollapsingToolbarLayout r1, androidx.appcompat.widget.Toolbar r2, androidx.navigation.NavController r3, androidx.navigation.p030ui.AppBarConfiguration r4, int r5, java.lang.Object r6) {
        /*
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0030
            androidx.navigation.NavGraph r4 = r3.getGraph()
            java.lang.String r5 = "navController.graph"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r5 = 0
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r6 = androidx.navigation.p030ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>((androidx.navigation.NavGraph) r4)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r0.setDrawerLayout(r5)
            if (r6 == 0) goto L_0x0021
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r5 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r5.<init>(r6)
            r6 = r5
        L_0x0021:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r6 = (androidx.navigation.p030ui.AppBarConfiguration.OnNavigateUpListener) r6
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r4.setFallbackOnNavigateUpListener(r6)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            java.lang.String r5 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
        L_0x0030:
            setupWithNavController((com.google.android.material.appbar.CollapsingToolbarLayout) r1, (androidx.appcompat.widget.Toolbar) r2, (androidx.navigation.NavController) r3, (androidx.navigation.p030ui.AppBarConfiguration) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p030ui.CollapsingToolbarLayoutKt.setupWithNavController$default(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.navigation.ui.AppBarConfiguration, int, java.lang.Object):void");
    }

    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull NavController navController, @NotNull AppBarConfiguration appBarConfiguration) {
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }
}
