package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Navigator.Name("fragment")
public class FragmentNavigator extends Navigator<Destination> {
    public static final String KEY_BACK_STACK_IDS = "androidx-nav-fragment:navigator:backStackIds";
    public static final String TAG = "FragmentNavigator";
    public ArrayDeque<Integer> mBackStack = new ArrayDeque<>();
    public final int mContainerId;
    public final Context mContext;
    public final FragmentManager mFragmentManager;

    @NavDestination.ClassType(Fragment.class)
    public static class Destination extends NavDestination {
        public String mClassName;

        public Destination(@NonNull NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
        }

        @NonNull
        public final String getClassName() {
            String str = this.mClassName;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        @CallSuper
        public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            super.onInflate(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0810R.styleable.FragmentNavigator);
            String string = obtainAttributes.getString(C0810R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            obtainAttributes.recycle();
        }

        @NonNull
        public final Destination setClassName(@NonNull String str) {
            this.mClassName = str;
            return this;
        }

        public Destination(@NonNull Navigator<? extends Destination> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
        }
    }

    public static final class Extras implements Navigator.Extras {
        public final LinkedHashMap<View, String> mSharedElements;

        public static final class Builder {
            public final LinkedHashMap<View, String> mSharedElements = new LinkedHashMap<>();

            @NonNull
            public Builder addSharedElement(@NonNull View view, @NonNull String str) {
                this.mSharedElements.put(view, str);
                return this;
            }

            @NonNull
            public Builder addSharedElements(@NonNull Map<View, String> map) {
                for (Map.Entry next : map.entrySet()) {
                    View view = (View) next.getKey();
                    String str = (String) next.getValue();
                    if (!(view == null || str == null)) {
                        addSharedElement(view, str);
                    }
                }
                return this;
            }

            @NonNull
            public Extras build() {
                return new Extras(this.mSharedElements);
            }
        }

        public Extras(Map<View, String> map) {
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.mSharedElements = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        @NonNull
        public Map<View, String> getSharedElements() {
            return Collections.unmodifiableMap(this.mSharedElements);
        }
    }

    public FragmentNavigator(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i) {
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        this.mContainerId = i;
    }

    @NonNull
    private String generateBackStackName(int i, int i2) {
        return i + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + i2;
    }

    private int getDestId(@Nullable String str) {
        String[] split = str != null ? str.split(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR) : new String[0];
        if (split.length == 2) {
            try {
                Integer.parseInt(split[0]);
                return Integer.parseInt(split[1]);
            } catch (NumberFormatException unused) {
                throw new IllegalStateException("Invalid back stack entry on the NavHostFragment's back stack - use getChildFragmentManager() if you need to do custom FragmentTransactions from within Fragments created via your navigation graph.");
            }
        } else {
            throw new IllegalStateException("Invalid back stack entry on the NavHostFragment's back stack - use getChildFragmentManager() if you need to do custom FragmentTransactions from within Fragments created via your navigation graph.");
        }
    }

    @NonNull
    @Deprecated
    public Fragment instantiateFragment(@NonNull Context context, @NonNull FragmentManager fragmentManager, @NonNull String str, @Nullable Bundle bundle) {
        return fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), str);
    }

    public void onRestoreState(@Nullable Bundle bundle) {
        int[] intArray;
        if (bundle != null && (intArray = bundle.getIntArray(KEY_BACK_STACK_IDS)) != null) {
            this.mBackStack.clear();
            for (int valueOf : intArray) {
                this.mBackStack.add(Integer.valueOf(valueOf));
            }
        }
    }

    @Nullable
    public Bundle onSaveState() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.mBackStack.size()];
        Iterator<Integer> it = this.mBackStack.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray(KEY_BACK_STACK_IDS, iArr);
        return bundle;
    }

    public boolean popBackStack() {
        if (this.mBackStack.isEmpty() || this.mFragmentManager.isStateSaved()) {
            return false;
        }
        this.mFragmentManager.popBackStack(generateBackStackName(this.mBackStack.size(), this.mBackStack.peekLast().intValue()), 1);
        this.mBackStack.removeLast();
        return true;
    }

    @NonNull
    public Destination createDestination() {
        return new Destination((Navigator<? extends Destination>) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d A[RETURN] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.fragment.FragmentNavigator.Destination r9, @androidx.annotation.Nullable android.os.Bundle r10, @androidx.annotation.Nullable androidx.navigation.NavOptions r11, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r12) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            boolean r0 = r0.isStateSaved()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = r9.getClassName()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x002c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.mContext
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x002c:
            android.content.Context r3 = r8.mContext
            androidx.fragment.app.FragmentManager r4 = r8.mFragmentManager
            androidx.fragment.app.Fragment r0 = r8.instantiateFragment(r3, r4, r0, r10)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.mFragmentManager
            androidx.fragment.app.FragmentTransaction r10 = r10.beginTransaction()
            r3 = -1
            if (r11 == 0) goto L_0x0045
            int r4 = r11.getEnterAnim()
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            if (r11 == 0) goto L_0x004d
            int r5 = r11.getExitAnim()
            goto L_0x004e
        L_0x004d:
            r5 = r3
        L_0x004e:
            if (r11 == 0) goto L_0x0055
            int r6 = r11.getPopEnterAnim()
            goto L_0x0056
        L_0x0055:
            r6 = r3
        L_0x0056:
            if (r11 == 0) goto L_0x005d
            int r7 = r11.getPopExitAnim()
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            if (r4 != r3) goto L_0x0066
            if (r5 != r3) goto L_0x0066
            if (r6 != r3) goto L_0x0066
            if (r7 == r3) goto L_0x0079
        L_0x0066:
            if (r4 == r3) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r2
        L_0x006a:
            if (r5 == r3) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = r2
        L_0x006e:
            if (r6 == r3) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r6 = r2
        L_0x0072:
            if (r7 == r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            r10.setCustomAnimations(r4, r5, r6, r7)
        L_0x0079:
            int r3 = r8.mContainerId
            r10.replace(r3, r0)
            r10.setPrimaryNavigationFragment(r0)
            int r0 = r9.getId()
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.mBackStack
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r11 == 0) goto L_0x00a6
            if (r3 != 0) goto L_0x00a6
            boolean r11 = r11.shouldLaunchSingleTop()
            if (r11 == 0) goto L_0x00a6
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00a6
            r11 = r4
            goto L_0x00a7
        L_0x00a6:
            r11 = r2
        L_0x00a7:
            if (r3 == 0) goto L_0x00ab
        L_0x00a9:
            r2 = r4
            goto L_0x00ed
        L_0x00ab:
            if (r11 == 0) goto L_0x00de
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            if (r11 <= r4) goto L_0x00ed
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.mBackStack
            int r3 = r3.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.mBackStack
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r8.generateBackStackName(r3, r5)
            r11.popBackStack((java.lang.String) r3, (int) r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            java.lang.String r11 = r8.generateBackStackName(r11, r0)
            r10.addToBackStack(r11)
            goto L_0x00ed
        L_0x00de:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.mBackStack
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.generateBackStackName(r11, r0)
            r10.addToBackStack(r11)
            goto L_0x00a9
        L_0x00ed:
            boolean r11 = r12 instanceof androidx.navigation.fragment.FragmentNavigator.Extras
            if (r11 == 0) goto L_0x011b
            androidx.navigation.fragment.FragmentNavigator$Extras r12 = (androidx.navigation.fragment.FragmentNavigator.Extras) r12
            java.util.Map r11 = r12.getSharedElements()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00ff:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x011b
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r10.addSharedElement(r3, r12)
            goto L_0x00ff
        L_0x011b:
            r10.setReorderingAllowed(r4)
            r10.commit()
            if (r2 == 0) goto L_0x012d
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.mBackStack
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            return r9
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator.navigate(androidx.navigation.fragment.FragmentNavigator$Destination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):androidx.navigation.NavDestination");
    }
}
