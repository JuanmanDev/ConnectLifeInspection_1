package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.WineCabinetListModel$getRemoteQueryByDevList$2 */
/* compiled from: WineCabinetListModel.kt */
public final class WineCabinetListModel$getRemoteQueryByDevList$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ MutableLiveData<List<WineBaseInfo>> $remoteLiveDataForH5;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineCabinetListModel$getRemoteQueryByDevList$2(MutableLiveData<List<WineBaseInfo>> mutableLiveData) {
        super(1);
        this.$remoteLiveDataForH5 = mutableLiveData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        this.$remoteLiveDataForH5.postValue(CollectionsKt__CollectionsKt.emptyList());
    }
}
