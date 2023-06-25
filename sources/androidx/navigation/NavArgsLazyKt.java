package androidx.navigation;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"0\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00008\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo47991d2 = {"Landroidx/collection/ArrayMap;", "Lkotlin/reflect/KClass;", "Landroidx/navigation/NavArgs;", "Ljava/lang/reflect/Method;", "methodMap", "Landroidx/collection/ArrayMap;", "getMethodMap", "()Landroidx/collection/ArrayMap;", "", "Ljava/lang/Class;", "Landroid/os/Bundle;", "methodSignature", "[Ljava/lang/Class;", "getMethodSignature", "()[Ljava/lang/Class;", "navigation-common-ktx_release"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: NavArgsLazy.kt */
public final class NavArgsLazyKt {
    @NotNull
    public static final ArrayMap<KClass<? extends NavArgs>, Method> methodMap = new ArrayMap<>();
    @NotNull
    public static final Class<Bundle>[] methodSignature = {Bundle.class};

    @NotNull
    public static final ArrayMap<KClass<? extends NavArgs>, Method> getMethodMap() {
        return methodMap;
    }

    @NotNull
    public static final Class<Bundle>[] getMethodSignature() {
        return methodSignature;
    }
}
