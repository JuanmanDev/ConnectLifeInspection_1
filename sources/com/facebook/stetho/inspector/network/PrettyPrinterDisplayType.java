package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.protocol.module.Page;

public enum PrettyPrinterDisplayType {
    JSON(Page.ResourceType.XHR),
    HTML(Page.ResourceType.DOCUMENT),
    TEXT(Page.ResourceType.DOCUMENT);
    
    public final Page.ResourceType mResourceType;

    /* access modifiers changed from: public */
    PrettyPrinterDisplayType(Page.ResourceType resourceType) {
        this.mResourceType = resourceType;
    }

    public Page.ResourceType getResourceType() {
        return this.mResourceType;
    }
}
