package kotlin.p639io;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* renamed from: kotlin.io.FilesKt__FileReadWriteKt$readLines$1 */
/* compiled from: FileReadWrite.kt */
public final class FilesKt__FileReadWriteKt$readLines$1 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ ArrayList<String> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__FileReadWriteKt$readLines$1(ArrayList<String> arrayList) {
        super(1);
        this.$result = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
        this.$result.add(str);
    }
}
