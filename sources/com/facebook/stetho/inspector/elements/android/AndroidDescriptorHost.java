package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.inspector.elements.Descriptor;

public interface AndroidDescriptorHost extends Descriptor.Host {
    HighlightableDescriptor getHighlightableDescriptor(Object obj);
}
