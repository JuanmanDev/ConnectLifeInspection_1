package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.OneTimeWorkRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\b\u001a\u001f\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\b¨\u0006\b"}, mo47991d2 = {"OneTimeWorkRequestBuilder", "Landroidx/work/OneTimeWorkRequest$Builder;", "W", "Landroidx/work/ListenableWorker;", "setInputMerger", "inputMerger", "Lkotlin/reflect/KClass;", "Landroidx/work/InputMerger;", "work-runtime-ktx_release"}, mo47992k = 2, mo47993mv = {1, 5, 1}, mo47995xi = 48)
/* compiled from: OneTimeWorkRequest.kt */
public final class OneTimeWorkRequestKt {
    @NotNull
    public static final OneTimeWorkRequest.Builder setInputMerger(@NotNull OneTimeWorkRequest.Builder builder, @NotNull @NonNull KClass<? extends InputMerger> kClass) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "inputMerger");
        OneTimeWorkRequest.Builder inputMerger = builder.setInputMerger(JvmClassMappingKt.getJavaClass(kClass));
        Intrinsics.checkNotNullExpressionValue(inputMerger, "setInputMerger(inputMerger.java)");
        return inputMerger;
    }
}
