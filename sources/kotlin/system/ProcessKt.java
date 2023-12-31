package kotlin.system;

import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b¨\u0006\u0004"}, mo47991d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@JvmName(name = "ProcessKt")
/* compiled from: Process.kt */
public final class ProcessKt {
    @InlineOnly
    public static final Void exitProcess(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
