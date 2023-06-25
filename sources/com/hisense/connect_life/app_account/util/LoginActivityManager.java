package com.hisense.connect_life.app_account.util;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/LoginActivityManager;", "", "()V", "activityStack", "Ljava/util/Stack;", "Landroid/app/Activity;", "addActivity", "", "activity", "getLastActivity", "removeActivity", "activityName", "", "removeAllActivity", "removeAllOnlyRetainFirstActivity", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginActivityManager.kt */
public final class LoginActivityManager {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static LoginActivityManager instance;
    @Nullable
    public Stack<Activity> activityStack;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/LoginActivityManager$Companion;", "", "()V", "instance", "Lcom/hisense/connect_life/app_account/util/LoginActivityManager;", "getInstance", "()Lcom/hisense/connect_life/app_account/util/LoginActivityManager;", "get", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LoginActivityManager.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final LoginActivityManager getInstance() {
            if (LoginActivityManager.instance == null) {
                LoginActivityManager.instance = new LoginActivityManager((DefaultConstructorMarker) null);
            }
            return LoginActivityManager.instance;
        }

        @NotNull
        public final LoginActivityManager get() {
            LoginActivityManager instance = getInstance();
            Intrinsics.checkNotNull(instance);
            return instance;
        }
    }

    public LoginActivityManager() {
    }

    public /* synthetic */ LoginActivityManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void addActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (this.activityStack == null) {
            this.activityStack = new Stack<>();
        }
        Stack<Activity> stack = this.activityStack;
        if (stack != null) {
            stack.add(activity);
        }
    }

    @Nullable
    public final Activity getLastActivity() {
        Stack<Activity> stack = this.activityStack;
        if (stack == null) {
            return null;
        }
        return (Activity) stack.lastElement();
    }

    public final void removeActivity(@NotNull Activity activity) {
        Stack<Activity> stack;
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Stack<Activity> stack2 = this.activityStack;
        if (stack2 != null) {
            Integer num = null;
            Integer valueOf = stack2 == null ? null : Integer.valueOf(stack2.size());
            Intrinsics.checkNotNull(valueOf);
            if (valueOf.intValue() > 0 && (stack = this.activityStack) != null) {
                if (stack != null) {
                    num = Integer.valueOf(stack.size());
                }
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    activity.finish();
                    Stack<Activity> stack3 = this.activityStack;
                    if (stack3 != null) {
                        stack3.remove(activity);
                    }
                }
            }
        }
    }

    public final void removeAllActivity() {
        if (this.activityStack != null) {
            while (true) {
                Stack<Activity> stack = this.activityStack;
                Integer valueOf = stack == null ? null : Integer.valueOf(stack.size());
                Intrinsics.checkNotNull(valueOf);
                if (valueOf.intValue() > 0) {
                    Activity lastActivity = getLastActivity();
                    if (lastActivity != null) {
                        removeActivity(lastActivity);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void removeAllOnlyRetainFirstActivity() {
        Integer num;
        Stack<Activity> stack = this.activityStack;
        if (stack != null) {
            if (stack == null) {
                num = null;
            } else {
                num = Integer.valueOf(stack.size());
            }
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            if (2 <= intValue) {
                do {
                    intValue--;
                    Activity lastActivity = getLastActivity();
                    if (lastActivity != null) {
                        removeActivity(lastActivity);
                        continue;
                    }
                } while (2 <= intValue);
            }
        }
    }

    public final void removeActivity(@NotNull String str) {
        Stack<Activity> stack;
        Stack<Activity> stack2;
        Stack<Activity> stack3;
        Intrinsics.checkNotNullParameter(str, "activityName");
        if (!(str.length() == 0) && (stack = this.activityStack) != null) {
            Integer num = null;
            Integer valueOf = stack == null ? null : Integer.valueOf(stack.size());
            Intrinsics.checkNotNull(valueOf);
            if (valueOf.intValue() > 0 && (stack2 = this.activityStack) != null) {
                if (stack2 != null) {
                    num = Integer.valueOf(stack2.size());
                }
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    Stack<Activity> stack4 = this.activityStack;
                    Intrinsics.checkNotNull(stack4);
                    Iterator it = stack4.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "activityStack!!");
                        Activity activity = (Activity) next;
                        if (Intrinsics.areEqual((Object) activity.getLocalClassName(), (Object) str) && (stack3 = this.activityStack) != null) {
                            stack3.remove(activity);
                        }
                    }
                }
            }
        }
    }
}
