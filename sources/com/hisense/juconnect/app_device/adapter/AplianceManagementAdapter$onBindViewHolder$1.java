package com.hisense.juconnect.app_device.adapter;

import android.view.View;
import com.hisense.juconnect.app_device.adapter.AplianceManagementAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AplianceManagementAdapter.kt */
public final class AplianceManagementAdapter$onBindViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ AplianceManagementAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AplianceManagementAdapter$onBindViewHolder$1(int i, AplianceManagementAdapter aplianceManagementAdapter) {
        super(1);
        this.$position = i;
        this.this$0 = aplianceManagementAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        int i = this.$position;
        if (i <= 0) {
            return;
        }
        if (i <= this.this$0.getData().size()) {
            AplianceManagementAdapter.OnItemClickListener access$getOnItemClickListener$p = this.this$0.onItemClickListener;
            if (access$getOnItemClickListener$p != null) {
                access$getOnItemClickListener$p.onItemClick(this.$position - 1, this.this$0.getData().get(this.$position - 1));
                return;
            }
            return;
        }
        AplianceManagementAdapter.FooterClickListener access$getFooterClickListener$p = this.this$0.footerClickListener;
        if (access$getFooterClickListener$p != null) {
            access$getFooterClickListener$p.footerClickListener();
        }
    }
}
