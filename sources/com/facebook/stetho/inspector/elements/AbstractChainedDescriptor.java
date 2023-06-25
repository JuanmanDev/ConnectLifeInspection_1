package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Util;

public abstract class AbstractChainedDescriptor<E> extends Descriptor<E> implements ChainedDescriptor<E> {
    public Descriptor<? super E> mSuper;

    public final void getAttributes(E e, AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes(e, attributeAccumulator);
        onGetAttributes(e, attributeAccumulator);
    }

    public final void getChildren(E e, Accumulator<Object> accumulator) {
        this.mSuper.getChildren(e, accumulator);
        onGetChildren(e, accumulator);
    }

    public void getComputedStyles(E e, ComputedStyleAccumulator computedStyleAccumulator) {
        this.mSuper.getComputedStyles(e, computedStyleAccumulator);
        onGetComputedStyles(e, computedStyleAccumulator);
    }

    public final String getLocalName(E e) {
        return onGetLocalName(e);
    }

    public final String getNodeName(E e) {
        return onGetNodeName(e);
    }

    public final NodeType getNodeType(E e) {
        return onGetNodeType(e);
    }

    public final String getNodeValue(E e) {
        return onGetNodeValue(e);
    }

    public final void getStyleRuleNames(E e, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        this.mSuper.getStyleRuleNames(e, styleRuleNameAccumulator);
        onGetStyleRuleNames(e, styleRuleNameAccumulator);
    }

    public final void getStyles(E e, String str, StyleAccumulator styleAccumulator) {
        this.mSuper.getStyles(e, str, styleAccumulator);
        onGetStyles(e, str, styleAccumulator);
    }

    public final Descriptor<? super E> getSuper() {
        return this.mSuper;
    }

    public final void hook(E e) {
        verifyThreadAccess();
        this.mSuper.hook(e);
        onHook(e);
    }

    public void onGetAttributes(E e, AttributeAccumulator attributeAccumulator) {
    }

    public void onGetChildren(E e, Accumulator<Object> accumulator) {
    }

    public void onGetComputedStyles(E e, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public String onGetLocalName(E e) {
        return this.mSuper.getLocalName(e);
    }

    public String onGetNodeName(E e) {
        return this.mSuper.getNodeName(e);
    }

    public NodeType onGetNodeType(E e) {
        return this.mSuper.getNodeType(e);
    }

    public String onGetNodeValue(E e) {
        return this.mSuper.getNodeValue(e);
    }

    public void onGetStyleRuleNames(E e, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public void onGetStyles(E e, String str, StyleAccumulator styleAccumulator) {
    }

    public void onHook(E e) {
    }

    public void onSetAttributesAsText(E e, String str) {
        this.mSuper.setAttributesAsText(e, str);
    }

    public void onSetStyle(E e, String str, String str2, String str3) {
    }

    public void onUnhook(E e) {
    }

    public final void setAttributesAsText(E e, String str) {
        onSetAttributesAsText(e, str);
    }

    public final void setStyle(E e, String str, String str2, String str3) {
        this.mSuper.setStyle(e, str, str2, str3);
        onSetStyle(e, str, str2, str3);
    }

    public void setSuper(Descriptor<? super E> descriptor) {
        Util.throwIfNull(descriptor);
        Descriptor<? super E> descriptor2 = this.mSuper;
        if (descriptor == descriptor2) {
            return;
        }
        if (descriptor2 == null) {
            this.mSuper = descriptor;
            return;
        }
        throw new IllegalStateException();
    }

    public final void unhook(E e) {
        verifyThreadAccess();
        onUnhook(e);
        this.mSuper.unhook(e);
    }
}
