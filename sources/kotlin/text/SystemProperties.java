package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: StringBuilderJVM.kt */
public final class SystemProperties {
    @NotNull
    public static final SystemProperties INSTANCE = new SystemProperties();
    @NotNull
    @JvmField
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        LINE_SEPARATOR = property;
    }
}
