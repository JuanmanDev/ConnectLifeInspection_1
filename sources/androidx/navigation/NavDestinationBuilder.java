package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001B!\u0012\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000+\u0012\b\b\u0001\u0010 \u001a\u00020\u0003¢\u0006\u0004\b0\u00101J.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000+8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, mo47991d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "actionId", "Lkotlin/Function1;", "Landroidx/navigation/NavActionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "actionBuilder", "action", "(ILkotlin/Function1;)V", "", "name", "Landroidx/navigation/NavArgumentBuilder;", "argumentBuilder", "argument", "(Ljava/lang/String;Lkotlin/Function1;)V", "build", "()Landroidx/navigation/NavDestination;", "uriPattern", "deepLink", "(Ljava/lang/String;)V", "", "Landroidx/navigation/NavAction;", "actions", "Ljava/util/Map;", "Landroidx/navigation/NavArgument;", "arguments", "", "deepLinks", "Ljava/util/List;", "id", "I", "getId", "()I", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "<init>", "(Landroidx/navigation/Navigator;I)V", "navigation-common-ktx_release"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@NavDestinationDsl
/* compiled from: NavDestinationBuilder.kt */
public class NavDestinationBuilder<D extends NavDestination> {
    public Map<Integer, NavAction> actions = new LinkedHashMap();
    public Map<String, NavArgument> arguments = new LinkedHashMap();
    public List<String> deepLinks = new ArrayList();

    /* renamed from: id */
    public final int f256id;
    @Nullable
    public CharSequence label;
    @NotNull
    public final Navigator<? extends D> navigator;

    public NavDestinationBuilder(@NotNull Navigator<? extends D> navigator2, @IdRes int i) {
        this.navigator = navigator2;
        this.f256id = i;
    }

    public final void action(int i, @NotNull Function1<? super NavActionBuilder, Unit> function1) {
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(i);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        function1.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_ktx_release());
    }

    public final void argument(@NotNull String str, @NotNull Function1<? super NavArgumentBuilder, Unit> function1) {
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        function1.invoke(navArgumentBuilder);
        map.put(str, navArgumentBuilder.build());
    }

    @NotNull
    public D build() {
        D createDestination = this.navigator.createDestination();
        createDestination.setId(this.f256id);
        createDestination.setLabel(this.label);
        for (Map.Entry next : this.arguments.entrySet()) {
            createDestination.addArgument((String) next.getKey(), (NavArgument) next.getValue());
        }
        for (String addDeepLink : this.deepLinks) {
            createDestination.addDeepLink(addDeepLink);
        }
        for (Map.Entry next2 : this.actions.entrySet()) {
            createDestination.putAction(((Number) next2.getKey()).intValue(), (NavAction) next2.getValue());
        }
        return createDestination;
    }

    public final void deepLink(@NotNull String str) {
        this.deepLinks.add(str);
    }

    public final int getId() {
        return this.f256id;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.label;
    }

    @NotNull
    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }
}
