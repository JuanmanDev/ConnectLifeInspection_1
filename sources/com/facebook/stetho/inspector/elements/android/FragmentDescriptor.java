package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.android.FragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.DescriptorMap;

public final class FragmentDescriptor extends AbstractChainedDescriptor<Object> implements HighlightableDescriptor<Object> {
    public static final String ID_ATTRIBUTE_NAME = "id";
    public static final String TAG_ATTRIBUTE_NAME = "tag";
    public final FragmentAccessor mAccessor;

    public FragmentDescriptor(FragmentCompat fragmentCompat) {
        this.mAccessor = fragmentCompat.forFragment();
    }

    public static void maybeRegister(DescriptorMap descriptorMap, FragmentCompat fragmentCompat) {
        if (fragmentCompat != null) {
            Class fragmentClass = fragmentCompat.getFragmentClass();
            LogUtil.m9802d("Adding support for %s", fragmentClass.getName());
            descriptorMap.registerDescriptor((Class<?>) fragmentClass, (Descriptor) new FragmentDescriptor(fragmentCompat));
        }
    }

    public static DescriptorMap register(DescriptorMap descriptorMap) {
        maybeRegister(descriptorMap, FragmentCompat.getSupportLibInstance());
        maybeRegister(descriptorMap, FragmentCompat.getFrameworkInstance());
        return descriptorMap;
    }

    public Object getElementToHighlightAtPosition(Object obj, int i, int i2, Rect rect) {
        View view;
        HighlightableDescriptor highlightableDescriptor;
        Descriptor.Host host = getHost();
        if (host instanceof AndroidDescriptorHost) {
            view = this.mAccessor.getView(obj);
            highlightableDescriptor = ((AndroidDescriptorHost) host).getHighlightableDescriptor(view);
        } else {
            view = null;
            highlightableDescriptor = null;
        }
        if (highlightableDescriptor == null) {
            return null;
        }
        return highlightableDescriptor.getElementToHighlightAtPosition(view, i, i2, rect);
    }

    public View getViewAndBoundsForHighlighting(Object obj, Rect rect) {
        return this.mAccessor.getView(obj);
    }

    public void onGetAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
        int id = this.mAccessor.getId(obj);
        if (id != 0) {
            attributeAccumulator.store("id", ResourcesUtil.getIdStringQuietly(obj, this.mAccessor.getResources(obj), id));
        }
        String tag = this.mAccessor.getTag(obj);
        if (tag != null && tag.length() > 0) {
            attributeAccumulator.store(TAG_ATTRIBUTE_NAME, tag);
        }
    }

    public void onGetChildren(Object obj, Accumulator<Object> accumulator) {
        View view = this.mAccessor.getView(obj);
        if (view != null) {
            accumulator.store(view);
        }
    }
}
