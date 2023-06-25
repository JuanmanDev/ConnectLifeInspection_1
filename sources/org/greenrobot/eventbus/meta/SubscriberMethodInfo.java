package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.ThreadMode;

public class SubscriberMethodInfo {
    public final Class<?> eventType;
    public final String methodName;
    public final int priority;
    public final boolean sticky;
    public final ThreadMode threadMode;

    public SubscriberMethodInfo(String str, Class<?> cls, ThreadMode threadMode2, int i, boolean z) {
        this.methodName = str;
        this.threadMode = threadMode2;
        this.eventType = cls;
        this.priority = i;
        this.sticky = z;
    }

    public SubscriberMethodInfo(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public SubscriberMethodInfo(String str, Class<?> cls, ThreadMode threadMode2) {
        this(str, cls, threadMode2, 0, false);
    }
}
