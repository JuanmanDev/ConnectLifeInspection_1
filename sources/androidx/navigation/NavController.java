package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {
    public static final String KEY_BACK_STACK_ARGS = "android-support-nav:controller:backStackArgs";
    public static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    public static final String KEY_BACK_STACK_UUIDS = "android-support-nav:controller:backStackUUIDs";
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    @NonNull
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    public static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    public static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    public static final String TAG = "NavController";
    public Activity mActivity;
    public final Deque<NavBackStackEntry> mBackStack = new ArrayDeque();
    public Parcelable[] mBackStackArgsToRestore;
    public int[] mBackStackIdsToRestore;
    public String[] mBackStackUUIDsToRestore;
    public final Context mContext;
    public boolean mDeepLinkHandled;
    public boolean mEnableOnBackPressedCallback = true;
    public NavGraph mGraph;
    public NavInflater mInflater;
    public LifecycleOwner mLifecycleOwner;
    public final NavigatorProvider mNavigatorProvider = new NavigatorProvider();
    public Bundle mNavigatorStateToRestore;
    public final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) {
        public void handleOnBackPressed() {
            NavController.this.popBackStack();
        }
    };
    public final CopyOnWriteArrayList<OnDestinationChangedListener> mOnDestinationChangedListeners = new CopyOnWriteArrayList<>();
    public NavControllerViewModel mViewModel;

    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle);
    }

    public NavController(@NonNull Context context) {
        this.mContext = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.mActivity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        NavigatorProvider navigatorProvider = this.mNavigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this.mNavigatorProvider.addNavigator(new ActivityNavigator(this.mContext));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x002d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean dispatchOnDestinationChanged() {
        /*
            r6 = this;
        L_0x0000:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0030
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L_0x0030
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.getDestination()
            int r0 = r0.getId()
            boolean r0 = r6.popBackStackInternal(r0, r1)
            if (r0 == 0) goto L_0x0030
            goto L_0x0000
        L_0x0030:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005f
            java.util.Deque<androidx.navigation.NavBackStackEntry> r0 = r6.mBackStack
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$OnDestinationChangedListener> r2 = r6.mOnDestinationChangedListeners
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$OnDestinationChangedListener r3 = (androidx.navigation.NavController.OnDestinationChangedListener) r3
            androidx.navigation.NavDestination r4 = r0.getDestination()
            android.os.Bundle r5 = r0.getArguments()
            r3.onDestinationChanged(r6, r4, r5)
            goto L_0x0046
        L_0x005e:
            return r1
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.dispatchOnDestinationChanged():boolean");
    }

    @Nullable
    private String findInvalidDestinationDisplayNameInDeepLink(@NonNull int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.mGraph;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            NavDestination findNode = i == 0 ? this.mGraph : navGraph2.findNode(i2);
            if (findNode == null) {
                return NavDestination.getDisplayName(this.mContext, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    navGraph = (NavGraph) findNode;
                    if (!(navGraph.findNode(navGraph.getStartDestination()) instanceof NavGraph)) {
                        break;
                    }
                    findNode = navGraph.findNode(navGraph.getStartDestination());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
        return null;
    }

    private int getDestinationCountOnBackStack() {
        int i = 0;
        for (NavBackStackEntry destination : this.mBackStack) {
            if (!(destination.getDestination() instanceof NavGraph)) {
                i++;
            }
        }
        return i;
    }

    private void onGraphCreated(@Nullable Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.mNavigatorStateToRestore;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Navigator navigator = this.mNavigatorProvider.getNavigator(next);
                Bundle bundle3 = this.mNavigatorStateToRestore.getBundle(next);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        boolean z = false;
        if (this.mBackStackUUIDsToRestore != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mBackStackUUIDsToRestore;
                if (i >= strArr.length) {
                    updateOnBackPressedCallbackEnabled();
                    this.mBackStackUUIDsToRestore = null;
                    this.mBackStackIdsToRestore = null;
                    this.mBackStackArgsToRestore = null;
                    break;
                }
                UUID fromString = UUID.fromString(strArr[i]);
                int i2 = this.mBackStackIdsToRestore[i];
                Bundle bundle4 = (Bundle) this.mBackStackArgsToRestore[i];
                NavDestination findDestination = findDestination(i2);
                if (findDestination != null) {
                    if (bundle4 != null) {
                        bundle4.setClassLoader(this.mContext.getClassLoader());
                    }
                    this.mBackStack.add(new NavBackStackEntry(fromString, findDestination, bundle4, this.mViewModel));
                    i++;
                } else {
                    throw new IllegalStateException("unknown destination during restore: " + this.mContext.getResources().getResourceName(i2));
                }
            }
        }
        if (this.mGraph != null && this.mBackStack.isEmpty()) {
            if (!this.mDeepLinkHandled && (activity = this.mActivity) != null && handleDeepLink(activity.getIntent())) {
                z = true;
            }
            if (!z) {
                navigate((NavDestination) this.mGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
            }
        }
    }

    private void updateOnBackPressedCallbackEnabled() {
        OnBackPressedCallback onBackPressedCallback = this.mOnBackPressedCallback;
        boolean z = true;
        if (!this.mEnableOnBackPressedCallback || getDestinationCountOnBackStack() <= 1) {
            z = false;
        }
        onBackPressedCallback.setEnabled(z);
    }

    public void addOnDestinationChangedListener(@NonNull OnDestinationChangedListener onDestinationChangedListener) {
        if (!this.mBackStack.isEmpty()) {
            NavBackStackEntry peekLast = this.mBackStack.peekLast();
            onDestinationChangedListener.onDestinationChanged(this, peekLast.getDestination(), peekLast.getArguments());
        }
        this.mOnDestinationChangedListeners.add(onDestinationChangedListener);
    }

    @NonNull
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public void enableOnBackPressed(boolean z) {
        this.mEnableOnBackPressedCallback = z;
        updateOnBackPressedCallbackEnabled();
    }

    public NavDestination findDestination(@IdRes int i) {
        NavDestination navDestination;
        NavGraph navGraph;
        NavGraph navGraph2 = this.mGraph;
        if (navGraph2 == null) {
            return null;
        }
        if (navGraph2.getId() == i) {
            return this.mGraph;
        }
        if (this.mBackStack.isEmpty()) {
            navDestination = this.mGraph;
        } else {
            navDestination = this.mBackStack.getLast().getDestination();
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.getParent();
        }
        return navGraph.findNode(i);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public NavDestination getCurrentDestination() {
        if (this.mBackStack.isEmpty()) {
            return null;
        }
        return this.mBackStack.getLast().getDestination();
    }

    @NonNull
    public NavGraph getGraph() {
        NavGraph navGraph = this.mGraph;
        if (navGraph != null) {
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    @NonNull
    public NavInflater getNavInflater() {
        if (this.mInflater == null) {
            this.mInflater = new NavInflater(this.mContext, this.mNavigatorProvider);
        }
        return this.mInflater;
    }

    @NonNull
    public NavigatorProvider getNavigatorProvider() {
        return this.mNavigatorProvider;
    }

    @NonNull
    @Deprecated
    public ViewModelStore getViewModelStore(@IdRes int i) {
        return getViewModelStoreOwner(i).getViewModelStore();
    }

    @NonNull
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i) {
        if (this.mViewModel != null) {
            NavBackStackEntry navBackStackEntry = null;
            Iterator<NavBackStackEntry> descendingIterator = this.mBackStack.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                NavBackStackEntry next = descendingIterator.next();
                NavDestination destination = next.getDestination();
                if ((destination instanceof NavGraph) && destination.getId() == i) {
                    navBackStackEntry = next;
                    break;
                }
            }
            if (navBackStackEntry != null) {
                return navBackStackEntry;
            }
            throw new IllegalArgumentException("No NavGraph with ID " + i + " is on the NavController's back stack");
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
    }

    public boolean handleDeepLink(@Nullable Intent intent) {
        NavGraph navGraph;
        NavDestination.DeepLinkMatch matchDeepLink;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (matchDeepLink = this.mGraph.matchDeepLink(intent.getData())) == null)) {
            intArray = matchDeepLink.getDestination().buildDeepLinkIds();
            bundle.putAll(matchDeepLink.getMatchingArgs());
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String findInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (findInvalidDestinationDisplayNameInDeepLink != null) {
            "Could not find destination " + findInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent;
            return false;
        }
        bundle.putParcelable(KEY_DEEP_LINK_INTENT, intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder.create(this.mContext).addNextIntentWithParentStack(intent).startActivities();
            Activity activity = this.mActivity;
            if (activity != null) {
                activity.finish();
                this.mActivity.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i != 0) {
            if (!this.mBackStack.isEmpty()) {
                popBackStackInternal(this.mGraph.getId(), true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                NavDestination findDestination = findDestination(i4);
                if (findDestination != null) {
                    navigate(findDestination, bundle, new NavOptions.Builder().setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                    i2 = i3;
                } else {
                    throw new IllegalStateException("unknown destination during deep link: " + NavDestination.getDisplayName(this.mContext, i4));
                }
            }
            return true;
        } else {
            NavGraph navGraph2 = this.mGraph;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                NavDestination findNode = i5 == 0 ? this.mGraph : navGraph2.findNode(i6);
                if (findNode != null) {
                    if (i5 != intArray.length - 1) {
                        while (true) {
                            navGraph = (NavGraph) findNode;
                            if (!(navGraph.findNode(navGraph.getStartDestination()) instanceof NavGraph)) {
                                break;
                            }
                            findNode = navGraph.findNode(navGraph.getStartDestination());
                        }
                        navGraph2 = navGraph;
                    } else {
                        navigate(findNode, findNode.addInDefaultArgs(bundle), new NavOptions.Builder().setPopUpTo(this.mGraph.getId(), true).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                    }
                    i5++;
                } else {
                    throw new IllegalStateException("unknown destination during deep link: " + NavDestination.getDisplayName(this.mContext, i6));
                }
            }
            this.mDeepLinkHandled = true;
            return true;
        }
    }

    public void navigate(@IdRes int i) {
        navigate(i, (Bundle) null);
    }

    public boolean navigateUp() {
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        NavDestination currentDestination = getCurrentDestination();
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestination() != id) {
                new NavDeepLinkBuilder(this).setDestination(parent.getId()).createTaskStackBuilder().startActivities();
                Activity activity = this.mActivity;
                if (activity != null) {
                    activity.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    public boolean popBackStack() {
        if (this.mBackStack.isEmpty()) {
            return false;
        }
        return popBackStack(getCurrentDestination().getId(), true);
    }

    public boolean popBackStackInternal(@IdRes int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.mBackStack.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NavBackStackEntry> descendingIterator = this.mBackStack.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            NavDestination destination = descendingIterator.next().getDestination();
            Navigator navigator = this.mNavigatorProvider.getNavigator(destination.getNavigatorName());
            if (z || destination.getId() != i) {
                arrayList.add(navigator);
            }
            if (destination.getId() == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            "Ignoring popBackStack to destination " + NavDestination.getDisplayName(this.mContext, i) + " as it was not found on the current back stack";
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((Navigator) it.next()).popBackStack()) {
            NavBackStackEntry removeLast = this.mBackStack.removeLast();
            NavControllerViewModel navControllerViewModel = this.mViewModel;
            if (navControllerViewModel != null) {
                navControllerViewModel.clear(removeLast.mId);
            }
            z3 = true;
        }
        updateOnBackPressedCallbackEnabled();
        return z3;
    }

    public void removeOnDestinationChangedListener(@NonNull OnDestinationChangedListener onDestinationChangedListener) {
        this.mOnDestinationChangedListeners.remove(onDestinationChangedListener);
    }

    @CallSuper
    public void restoreState(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.mContext.getClassLoader());
            this.mNavigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
            this.mBackStackUUIDsToRestore = bundle.getStringArray(KEY_BACK_STACK_UUIDS);
            this.mBackStackIdsToRestore = bundle.getIntArray(KEY_BACK_STACK_IDS);
            this.mBackStackArgsToRestore = bundle.getParcelableArray(KEY_BACK_STACK_ARGS);
            this.mDeepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
        }
    }

    @CallSuper
    @Nullable
    public Bundle saveState() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.mNavigatorProvider.getNavigators().entrySet()) {
            String str = (String) next.getKey();
            Bundle onSaveState = ((Navigator) next.getValue()).onSaveState();
            if (onSaveState != null) {
                arrayList.add(str);
                bundle2.putBundle(str, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!this.mBackStack.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            String[] strArr = new String[this.mBackStack.size()];
            int[] iArr = new int[this.mBackStack.size()];
            Parcelable[] parcelableArr = new Parcelable[this.mBackStack.size()];
            int i = 0;
            for (NavBackStackEntry next2 : this.mBackStack) {
                strArr[i] = next2.mId.toString();
                iArr[i] = next2.getDestination().getId();
                parcelableArr[i] = next2.getArguments();
                i++;
            }
            bundle.putStringArray(KEY_BACK_STACK_UUIDS, strArr);
            bundle.putIntArray(KEY_BACK_STACK_IDS, iArr);
            bundle.putParcelableArray(KEY_BACK_STACK_ARGS, parcelableArr);
        }
        if (this.mDeepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.mDeepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    public void setGraph(@NavigationRes int i) {
        setGraph(i, (Bundle) null);
    }

    public void setLifecycleOwner(@NonNull LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = lifecycleOwner;
    }

    public void setOnBackPressedDispatcher(@NonNull OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.mLifecycleOwner != null) {
            this.mOnBackPressedCallback.remove();
            onBackPressedDispatcher.addCallback(this.mLifecycleOwner, this.mOnBackPressedCallback);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public void setViewModelStore(@NonNull ViewModelStore viewModelStore) {
        this.mViewModel = NavControllerViewModel.getInstance(viewModelStore);
        for (NavBackStackEntry navControllerViewModel : this.mBackStack) {
            navControllerViewModel.setNavControllerViewModel(this.mViewModel);
        }
    }

    public void navigate(@IdRes int i, @Nullable Bundle bundle) {
        navigate(i, bundle, (NavOptions) null);
    }

    @CallSuper
    public void setGraph(@NavigationRes int i, @Nullable Bundle bundle) {
        setGraph(getNavInflater().inflate(i), bundle);
    }

    public void navigate(@IdRes int i, @Nullable Bundle bundle, @Nullable NavOptions navOptions) {
        navigate(i, bundle, navOptions, (Navigator.Extras) null);
    }

    public boolean popBackStack(@IdRes int i, boolean z) {
        return popBackStackInternal(i, z) && dispatchOnDestinationChanged();
    }

    @CallSuper
    public void setGraph(@NonNull NavGraph navGraph) {
        setGraph(navGraph, (Bundle) null);
    }

    public void navigate(@IdRes int i, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        NavDestination navDestination;
        int i2;
        String str;
        if (this.mBackStack.isEmpty()) {
            navDestination = this.mGraph;
        } else {
            navDestination = this.mBackStack.getLast().getDestination();
        }
        if (navDestination != null) {
            NavAction action = navDestination.getAction(i);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                i2 = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && navOptions != null && navOptions.getPopUpTo() != -1) {
                popBackStack(navOptions.getPopUpTo(), navOptions.isPopUpToInclusive());
            } else if (i2 != 0) {
                NavDestination findDestination = findDestination(i2);
                if (findDestination == null) {
                    String displayName = NavDestination.getDisplayName(this.mContext, i2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("navigation destination ");
                    sb.append(displayName);
                    if (action != null) {
                        str = " referenced from action " + NavDestination.getDisplayName(this.mContext, i);
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" is unknown to this NavController");
                    throw new IllegalArgumentException(sb.toString());
                }
                navigate(findDestination, bundle2, navOptions, extras);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    @CallSuper
    public void setGraph(@NonNull NavGraph navGraph, @Nullable Bundle bundle) {
        NavGraph navGraph2 = this.mGraph;
        if (navGraph2 != null) {
            popBackStackInternal(navGraph2.getId(), true);
        }
        this.mGraph = navGraph;
        onGraphCreated(bundle);
    }

    public void navigate(@NonNull Uri uri) {
        navigate(uri, (NavOptions) null);
    }

    public void navigate(@NonNull Uri uri, @Nullable NavOptions navOptions) {
        navigate(uri, navOptions, (Navigator.Extras) null);
    }

    public void navigate(@NonNull Uri uri, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        NavDestination.DeepLinkMatch matchDeepLink = this.mGraph.matchDeepLink(uri);
        if (matchDeepLink != null) {
            navigate(matchDeepLink.getDestination(), matchDeepLink.getMatchingArgs(), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("navigation destination with deepLink " + uri + " is unknown to this NavController");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[LOOP:0: B:9:0x002f->B:14:0x005c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void navigate(@androidx.annotation.NonNull androidx.navigation.NavDestination r4, @androidx.annotation.Nullable android.os.Bundle r5, @androidx.annotation.Nullable androidx.navigation.NavOptions r6, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x0016
            int r0 = r6.getPopUpTo()
            r1 = -1
            if (r0 == r1) goto L_0x0016
            int r0 = r6.getPopUpTo()
            boolean r1 = r6.isPopUpToInclusive()
            boolean r0 = r3.popBackStackInternal(r0, r1)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            androidx.navigation.NavigatorProvider r1 = r3.mNavigatorProvider
            java.lang.String r2 = r4.getNavigatorName()
            androidx.navigation.Navigator r1 = r1.getNavigator((java.lang.String) r2)
            android.os.Bundle r5 = r4.addInDefaultArgs(r5)
            androidx.navigation.NavDestination r4 = r1.navigate(r4, r5, r6, r7)
            if (r4 == 0) goto L_0x00ad
            boolean r6 = r4 instanceof androidx.navigation.FloatingWindow
            if (r6 != 0) goto L_0x005f
        L_0x002f:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r3.mBackStack
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x005f
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r3.mBackStack
            java.lang.Object r6 = r6.peekLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            boolean r6 = r6 instanceof androidx.navigation.FloatingWindow
            if (r6 == 0) goto L_0x005f
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r3.mBackStack
            java.lang.Object r6 = r6.peekLast()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.navigation.NavDestination r6 = r6.getDestination()
            int r6 = r6.getId()
            r7 = 1
            boolean r6 = r3.popBackStackInternal(r6, r7)
            if (r6 == 0) goto L_0x005f
            goto L_0x002f
        L_0x005f:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r3.mBackStack
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0075
            java.util.Deque<androidx.navigation.NavBackStackEntry> r6 = r3.mBackStack
            androidx.navigation.NavBackStackEntry r7 = new androidx.navigation.NavBackStackEntry
            androidx.navigation.NavGraph r1 = r3.mGraph
            androidx.navigation.NavControllerViewModel r2 = r3.mViewModel
            r7.<init>(r1, r5, r2)
            r6.add(r7)
        L_0x0075:
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            r7 = r4
        L_0x007b:
            if (r7 == 0) goto L_0x0098
            int r1 = r7.getId()
            androidx.navigation.NavDestination r1 = r3.findDestination(r1)
            if (r1 != 0) goto L_0x0098
            androidx.navigation.NavGraph r7 = r7.getParent()
            if (r7 == 0) goto L_0x007b
            androidx.navigation.NavBackStackEntry r1 = new androidx.navigation.NavBackStackEntry
            androidx.navigation.NavControllerViewModel r2 = r3.mViewModel
            r1.<init>(r7, r5, r2)
            r6.addFirst(r1)
            goto L_0x007b
        L_0x0098:
            java.util.Deque<androidx.navigation.NavBackStackEntry> r7 = r3.mBackStack
            r7.addAll(r6)
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            android.os.Bundle r5 = r4.addInDefaultArgs(r5)
            androidx.navigation.NavControllerViewModel r7 = r3.mViewModel
            r6.<init>(r4, r5, r7)
            java.util.Deque<androidx.navigation.NavBackStackEntry> r5 = r3.mBackStack
            r5.add(r6)
        L_0x00ad:
            r3.updateOnBackPressedCallbackEnabled()
            if (r0 != 0) goto L_0x00b4
            if (r4 == 0) goto L_0x00b7
        L_0x00b4:
            r3.dispatchOnDestinationChanged()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public void navigate(@NonNull NavDirections navDirections) {
        navigate(navDirections.getActionId(), navDirections.getArguments());
    }

    public void navigate(@NonNull NavDirections navDirections, @Nullable NavOptions navOptions) {
        navigate(navDirections.getActionId(), navDirections.getArguments(), navOptions);
    }

    public void navigate(@NonNull NavDirections navDirections, @NonNull Navigator.Extras extras) {
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null, extras);
    }
}
