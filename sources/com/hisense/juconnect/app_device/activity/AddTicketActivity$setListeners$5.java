package com.hisense.juconnect.app_device.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import com.hisense.juconnect.app_device.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/AddTicketActivity$setListeners$5", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddTicketActivity.kt */
public final class AddTicketActivity$setListeners$5 implements TextWatcher {
    public final /* synthetic */ AddTicketActivity this$0;

    public AddTicketActivity$setListeners$5(AddTicketActivity addTicketActivity) {
        this.this$0 = addTicketActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        ImageView imageView = (ImageView) this.this$0._$_findCachedViewById(R$id.summary_image);
        Intrinsics.checkNotNullExpressionValue(imageView, "summary_image");
        Editable text = ((EditText) this.this$0._$_findCachedViewById(R$id.ticket_title)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "ticket_title.text");
        int i4 = 0;
        if (!(text.length() == 0)) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        this.this$0.setEditNoInputShow();
    }
}
