package com.hisense.juconnect.app_device.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.hismart.room.Notification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hisense/connect_life/hismart/room/Notification;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageViewModel.kt */
public final class MessageViewModel$unReadMessageLiveData$2 extends Lambda implements Function0<MutableLiveData<List<? extends Notification>>> {
    public static final MessageViewModel$unReadMessageLiveData$2 INSTANCE = new MessageViewModel$unReadMessageLiveData$2();

    public MessageViewModel$unReadMessageLiveData$2() {
        super(0);
    }

    @NotNull
    public final MutableLiveData<List<Notification>> invoke() {
        return new MutableLiveData<>();
    }
}
