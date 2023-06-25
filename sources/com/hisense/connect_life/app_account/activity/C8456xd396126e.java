package com.hisense.connect_life.app_account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, mo47991d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1"}, mo47992k = 1, mo47993mv = {1, 6, 0})
/* renamed from: com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity$setListeners$$inlined$doAfterTextChanged$1 */
/* compiled from: TextView.kt */
public final class C8456xd396126e implements TextWatcher {
    public final /* synthetic */ RegisterInputUserInfoActivity this$0;

    public C8456xd396126e(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.this$0 = registerInputUserInfoActivity;
    }

    public void afterTextChanged(@Nullable Editable editable) {
        RegisterInputUserInfoActivity registerInputUserInfoActivity = this.this$0;
        boolean z = ((EditText) registerInputUserInfoActivity._$_findCachedViewById(R$id.register_name)).getText().toString().length() == 0;
        ImageView imageView = (ImageView) this.this$0._$_findCachedViewById(R$id.iv_name_dot);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_name_dot");
        registerInputUserInfoActivity.showDot(z, imageView);
        this.this$0.checkConditions();
        this.this$0.showOffErrorWord();
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
