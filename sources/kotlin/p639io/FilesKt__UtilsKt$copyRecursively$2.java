package kotlin.p639io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p040c.p077d.p078a.p080j.C1564e;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo47991d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
/* compiled from: Utils.kt */
public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements Function2<File, IOException, Unit> {
    public final /* synthetic */ Function2<File, IOException, OnErrorAction> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__UtilsKt$copyRecursively$2(Function2<? super File, ? super IOException, ? extends OnErrorAction> function2) {
        super(2);
        this.$onError = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((File) obj, (IOException) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull File file, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(file, "f");
        Intrinsics.checkNotNullParameter(iOException, C1564e.f893u);
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}
