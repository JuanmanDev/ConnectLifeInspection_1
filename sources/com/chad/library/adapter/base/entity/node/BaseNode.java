package com.chad.library.adapter.base.entity.node;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\b&\u0018\u0000B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo47991d2 = {"Lcom/chad/library/adapter/base/entity/node/BaseNode;", "", "getChildNode", "()Ljava/util/List;", "childNode", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseNode.kt */
public abstract class BaseNode {
    @Nullable
    public abstract List<BaseNode> getChildNode();
}
