package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR.\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00128\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo47991d2 = {"Landroidx/navigation/NavArgumentBuilder;", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "Landroidx/navigation/NavType;", "_type", "Landroidx/navigation/NavType;", "Landroidx/navigation/NavArgument$Builder;", "builder", "Landroidx/navigation/NavArgument$Builder;", "", "value", "defaultValue", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "", "nullable", "Z", "getNullable", "()Z", "setNullable", "(Z)V", "getType", "()Landroidx/navigation/NavType;", "setType", "(Landroidx/navigation/NavType;)V", "type", "<init>", "()V", "navigation-common-ktx_release"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@NavDestinationDsl
/* compiled from: NavDestinationBuilder.kt */
public final class NavArgumentBuilder {
    public NavType<?> _type;
    public final NavArgument.Builder builder = new NavArgument.Builder();
    @Nullable
    public Object defaultValue;
    public boolean nullable;

    @NotNull
    public final NavArgument build() {
        NavArgument build = this.builder.build();
        Intrinsics.checkExpressionValueIsNotNull(build, "builder.build()");
        return build;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    @NotNull
    public final NavType<?> getType() {
        NavType<?> navType = this._type;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void setDefaultValue(@Nullable Object obj) {
        this.defaultValue = obj;
        this.builder.setDefaultValue(obj);
    }

    public final void setNullable(boolean z) {
        this.nullable = z;
        this.builder.setIsNullable(z);
    }

    public final void setType(@NotNull NavType<?> navType) {
        this._type = navType;
        this.builder.setType(navType);
    }
}
