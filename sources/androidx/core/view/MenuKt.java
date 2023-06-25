package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavInflater;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a3\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\bø\u0001\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, mo47991d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Menu.kt */
public final class MenuKt {
    public static final boolean contains(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual((Object) menu.getItem(i), (Object) menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@NotNull Menu menu, @NotNull Function1<? super MenuItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(function1, NavInflater.TAG_ACTION);
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            function1.invoke(item);
        }
    }

    public static final void forEachIndexed(@NotNull Menu menu, @NotNull Function2<? super Integer, ? super MenuItem, Unit> function2) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(function2, NavInflater.TAG_ACTION);
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            function2.invoke(valueOf, item);
        }
    }

    @NotNull
    public static final MenuItem get(@NotNull Menu menu, int i) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        MenuItem item = menu.getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
        return item;
    }

    @NotNull
    public static final Sequence<MenuItem> getChildren(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return new MenuKt$children$1(menu);
    }

    public static final int getSize(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size() != 0;
    }

    @NotNull
    public static final Iterator<MenuItem> iterator(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(@NotNull Menu menu, int i) {
        Unit unit;
        Intrinsics.checkNotNullParameter(menu, "<this>");
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
