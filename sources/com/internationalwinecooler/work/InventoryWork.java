package com.internationalwinecooler.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.internationalwinecooler.viewmodel.InventoryWineViewModel;
import com.internationalwinecooler.viewmodel.WineCategoryViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo47991d2 = {"Lcom/internationalwinecooler/work/InventoryWork;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "inventoryWineViewModel", "Lcom/internationalwinecooler/viewmodel/InventoryWineViewModel;", "getInventoryWineViewModel", "()Lcom/internationalwinecooler/viewmodel/InventoryWineViewModel;", "inventoryWineViewModel$delegate", "Lkotlin/Lazy;", "wineCategoryViewModel", "Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "getWineCategoryViewModel", "()Lcom/internationalwinecooler/viewmodel/WineCategoryViewModel;", "wineCategoryViewModel$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryWork.kt */
public final class InventoryWork extends Worker {
    @NotNull
    public final Lazy inventoryWineViewModel$delegate = LazyKt__LazyJVMKt.lazy(InventoryWork$inventoryWineViewModel$2.INSTANCE);
    @NotNull
    public final Lazy wineCategoryViewModel$delegate = LazyKt__LazyJVMKt.lazy(InventoryWork$wineCategoryViewModel$2.INSTANCE);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InventoryWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    private final InventoryWineViewModel getInventoryWineViewModel() {
        return (InventoryWineViewModel) this.inventoryWineViewModel$delegate.getValue();
    }

    private final WineCategoryViewModel getWineCategoryViewModel() {
        return (WineCategoryViewModel) this.wineCategoryViewModel$delegate.getValue();
    }

    @NotNull
    public ListenableWorker.Result doWork() {
        WineCategoryViewModel.getWineCategory$default(getWineCategoryViewModel(), false, (String) null, 3, (Object) null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success, "success()");
        return success;
    }
}
