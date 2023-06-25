package androidx.test.espresso;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.base.IdlingResourceRegistry;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.ListenableFutureTask;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.TreeIterables;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;

public final class Espresso {
    public static final BaseLayerComponent BASE;
    public static final C9623e<View> OVERFLOW_BUTTON_MATCHER = C9624f.m25840e(C9624f.m25836a(ViewMatchers.isDisplayed(), ViewMatchers.withContentDescription("More options")), C9624f.m25836a(ViewMatchers.isDisplayed(), ViewMatchers.withClassName(C9624f.m25843h("OverflowMenuButton"))));
    public static final String TAG = "Espresso";
    public static final int TIMEOUT_SECONDS = 5;
    public static final IdlingResourceRegistry baseRegistry;

    public static class TransitionBridgingViewAction implements ViewAction {
        public TransitionBridgingViewAction() {
        }

        private boolean isTransitioningBetweenActionBars(View view) {
            int i = 0;
            for (View matches : TreeIterables.breadthFirstViewTraversal(view)) {
                if (Espresso.OVERFLOW_BUTTON_MATCHER.matches(matches)) {
                    i++;
                }
            }
            if (i > 1) {
                return true;
            }
            return false;
        }

        public C9623e<View> getConstraints() {
            return ViewMatchers.isRoot();
        }

        public String getDescription() {
            return "Handle transition between action bar and action bar context.";
        }

        public void perform(UiController uiController, View view) {
            int i = 0;
            while (isTransitioningBetweenActionBars(view) && i < 100) {
                i++;
                uiController.loopMainThreadForAtLeast(50);
            }
        }
    }

    static {
        BaseLayerComponent baseLayer = GraphHolder.baseLayer();
        BASE = baseLayer;
        baseRegistry = baseLayer.idlingResourceRegistry();
    }

    public static void closeSoftKeyboard() {
        onView(ViewMatchers.isRoot()).perform(ViewActions.closeSoftKeyboard());
    }

    @Deprecated
    public static List<IdlingResource> getIdlingResources() {
        return baseRegistry.getResources();
    }

    public static boolean hasVirtualOverflowButton(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 14) {
            return i >= 11;
        }
        return !ViewConfiguration.get(context).hasPermanentMenuKey();
    }

    public static DataInteraction onData(C9623e<? extends Object> eVar) {
        return new DataInteraction(eVar);
    }

    public static <T> T onIdle(Callable<T> callable) {
        Executor mainThreadExecutor = BASE.mainThreadExecutor();
        ListenableFutureTask create = ListenableFutureTask.create(new Runnable() {
            public void run() {
                Espresso.BASE.uiController().loopMainThreadUntilIdle();
            }
        }, null);
        FutureTask futureTask = new FutureTask(callable);
        create.addListener(futureTask, mainThreadExecutor);
        mainThreadExecutor.execute(create);
        BASE.controlledLooper().drainMainThreadUntilIdle();
        try {
            create.get();
            return futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof AppNotIdleException) {
                throw ((AppNotIdleException) e2.getCause());
            }
            throw new RuntimeException(e2);
        }
    }

    public static ViewInteraction onView(C9623e<View> eVar) {
        return BASE.plus(new ViewInteractionModule(eVar)).viewInteraction();
    }

    public static void openActionBarOverflowOrOptionsMenu(Context context) {
        waitUntilNextFrame(2);
        if (context.getApplicationInfo().targetSdkVersion < 11) {
            onView(ViewMatchers.isRoot()).perform(ViewActions.pressMenuKey());
        } else if (hasVirtualOverflowButton(context)) {
            onView(ViewMatchers.isRoot()).perform(new TransitionBridgingViewAction());
            onView(OVERFLOW_BUTTON_MATCHER).perform(ViewActions.click());
        } else {
            onView(ViewMatchers.isRoot()).perform(ViewActions.pressMenuKey());
        }
        waitUntilNextFrame(2);
    }

    public static void openContextualActionModeOverflowMenu() {
        onView(ViewMatchers.isRoot()).perform(new TransitionBridgingViewAction());
        onView(OVERFLOW_BUTTON_MATCHER).perform(ViewActions.click(ViewActions.pressBack()));
    }

    public static void pressBack() {
        onView(ViewMatchers.isRoot()).perform(ViewActions.pressBack());
    }

    public static void pressBackUnconditionally() {
        onView(ViewMatchers.isRoot()).perform(ViewActions.pressBackUnconditionally());
    }

    @Deprecated
    public static boolean registerIdlingResources(IdlingResource... idlingResourceArr) {
        if (IdlingRegistry.getInstance().register(idlingResourceArr)) {
            baseRegistry.sync(IdlingRegistry.getInstance().getResources(), IdlingRegistry.getInstance().getLoopers());
            return true;
        } else if (idlingResourceArr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Deprecated
    public static void registerLooperAsIdlingResource(Looper looper) {
        registerLooperAsIdlingResource(looper, false);
    }

    public static void setFailureHandler(FailureHandler failureHandler) {
        BASE.failureHolder().update((FailureHandler) Preconditions.checkNotNull(failureHandler));
    }

    @Deprecated
    public static boolean unregisterIdlingResources(IdlingResource... idlingResourceArr) {
        if (IdlingRegistry.getInstance().unregister(idlingResourceArr)) {
            baseRegistry.sync(IdlingRegistry.getInstance().getResources(), IdlingRegistry.getInstance().getLoopers());
            return true;
        } else if (idlingResourceArr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void waitUntilNextFrame(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            int i2 = 0;
            while (i2 < i) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                InstrumentationRegistry.getInstrumentation().runOnMainSync(new Espresso$$Lambda$0(countDownLatch));
                BASE.controlledLooper().drainMainThreadUntilIdle();
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                    i2++;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    @Deprecated
    public static void registerLooperAsIdlingResource(Looper looper, boolean z) {
        IdlingRegistry.getInstance().registerLooperAsIdlingResource(looper);
        baseRegistry.sync(IdlingRegistry.getInstance().getResources(), IdlingRegistry.getInstance().getLoopers());
    }

    public static void onIdle() {
        onIdle(new Callable<Void>() {
            public Void call() {
                return null;
            }
        });
    }
}
