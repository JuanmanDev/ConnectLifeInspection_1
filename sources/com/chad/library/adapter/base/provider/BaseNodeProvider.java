package com.chad.library.adapter.base.provider;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo47991d2 = {"Lcom/chad/library/adapter/base/provider/BaseNodeProvider;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lcom/chad/library/adapter/base/BaseNodeAdapter;", "getAdapter", "()Lcom/chad/library/adapter/base/BaseNodeAdapter;", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseNodeProvider.kt */
public abstract class BaseNodeProvider extends BaseItemProvider<BaseNode> {
    @Nullable
    public BaseNodeAdapter getAdapter() {
        BaseProviderMultiAdapter adapter = super.getAdapter();
        if (!(adapter instanceof BaseNodeAdapter)) {
            adapter = null;
        }
        return (BaseNodeAdapter) adapter;
    }
}
