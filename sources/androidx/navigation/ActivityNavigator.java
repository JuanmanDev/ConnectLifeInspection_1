package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sqlcipher.database.SQLiteDatabase;

@Navigator.Name("activity")
public class ActivityNavigator extends Navigator<Destination> {
    public static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    public static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    public static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    public static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    public Context mContext;
    public Activity mHostActivity;

    @NavDestination.ClassType(Activity.class)
    public static class Destination extends NavDestination {
        public String mDataPattern;
        public Intent mIntent;

        public Destination(@NonNull NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
        }

        @Nullable
        public final String getAction() {
            Intent intent = this.mIntent;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        @Nullable
        public final ComponentName getComponent() {
            Intent intent = this.mIntent;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        @Nullable
        public final Uri getData() {
            Intent intent = this.mIntent;
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }

        @Nullable
        public final String getDataPattern() {
            return this.mDataPattern;
        }

        @Nullable
        public final Intent getIntent() {
            return this.mIntent;
        }

        @Nullable
        public final String getTargetPackage() {
            Intent intent = this.mIntent;
            if (intent == null) {
                return null;
            }
            return intent.getPackage();
        }

        @CallSuper
        public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            super.onInflate(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0801R.styleable.ActivityNavigator);
            String string = obtainAttributes.getString(C0801R.styleable.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace(NavInflater.APPLICATION_ID_PLACEHOLDER, context.getPackageName());
            }
            setTargetPackage(string);
            String string2 = obtainAttributes.getString(C0801R.styleable.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                setComponentName(new ComponentName(context, string2));
            }
            setAction(obtainAttributes.getString(C0801R.styleable.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(C0801R.styleable.ActivityNavigator_data);
            if (string3 != null) {
                setData(Uri.parse(string3));
            }
            setDataPattern(obtainAttributes.getString(C0801R.styleable.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        @NonNull
        public final Destination setAction(@Nullable String str) {
            if (this.mIntent == null) {
                this.mIntent = new Intent();
            }
            this.mIntent.setAction(str);
            return this;
        }

        @NonNull
        public final Destination setComponentName(@Nullable ComponentName componentName) {
            if (this.mIntent == null) {
                this.mIntent = new Intent();
            }
            this.mIntent.setComponent(componentName);
            return this;
        }

        @NonNull
        public final Destination setData(@Nullable Uri uri) {
            if (this.mIntent == null) {
                this.mIntent = new Intent();
            }
            this.mIntent.setData(uri);
            return this;
        }

        @NonNull
        public final Destination setDataPattern(@Nullable String str) {
            this.mDataPattern = str;
            return this;
        }

        @NonNull
        public final Destination setIntent(@Nullable Intent intent) {
            this.mIntent = intent;
            return this;
        }

        @NonNull
        public final Destination setTargetPackage(@Nullable String str) {
            if (this.mIntent == null) {
                this.mIntent = new Intent();
            }
            this.mIntent.setPackage(str);
            return this;
        }

        public boolean supportsActions() {
            return false;
        }

        public Destination(@NonNull Navigator<? extends Destination> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
        }
    }

    public static final class Extras implements Navigator.Extras {
        public final ActivityOptionsCompat mActivityOptions;
        public final int mFlags;

        public static final class Builder {
            public ActivityOptionsCompat mActivityOptions;
            public int mFlags;

            @NonNull
            public Builder addFlags(int i) {
                this.mFlags = i | this.mFlags;
                return this;
            }

            @NonNull
            public Extras build() {
                return new Extras(this.mFlags, this.mActivityOptions);
            }

            @NonNull
            public Builder setActivityOptions(@NonNull ActivityOptionsCompat activityOptionsCompat) {
                this.mActivityOptions = activityOptionsCompat;
                return this;
            }
        }

        public Extras(int i, @Nullable ActivityOptionsCompat activityOptionsCompat) {
            this.mFlags = i;
            this.mActivityOptions = activityOptionsCompat;
        }

        @Nullable
        public ActivityOptionsCompat getActivityOptions() {
            return this.mActivityOptions;
        }

        public int getFlags() {
            return this.mFlags;
        }
    }

    public ActivityNavigator(@NonNull Context context) {
        this.mContext = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.mHostActivity = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public static void applyPopAnimationsToPendingTransition(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra != -1 || intExtra2 != -1) {
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                activity.overridePendingTransition(intExtra, intExtra2);
            }
        }
    }

    @NonNull
    public final Context getContext() {
        return this.mContext;
    }

    public boolean popBackStack() {
        Activity activity = this.mHostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @NonNull
    public Destination createDestination() {
        return new Destination((Navigator<? extends Destination>) this);
    }

    @Nullable
    public NavDestination navigate(@NonNull Destination destination, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        Intent intent;
        int intExtra;
        if (destination.getIntent() != null) {
            Intent intent2 = new Intent(destination.getIntent());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String dataPattern = destination.getDataPattern();
                if (!TextUtils.isEmpty(dataPattern)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + dataPattern);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = extras instanceof Extras;
            if (z) {
                intent2.addFlags(((Extras) extras).getFlags());
            }
            if (!(this.mContext instanceof Activity)) {
                intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.mHostActivity;
            int i = 0;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) == 0)) {
                intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
            }
            intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
            if (navOptions != null) {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, navOptions.getPopEnterAnim());
                intent2.putExtra(EXTRA_POP_EXIT_ANIM, navOptions.getPopExitAnim());
            }
            if (z) {
                ActivityOptionsCompat activityOptions = ((Extras) extras).getActivityOptions();
                if (activityOptions != null) {
                    ContextCompat.startActivity(this.mContext, intent2, activityOptions.toBundle());
                } else {
                    this.mContext.startActivity(intent2);
                }
            } else {
                this.mContext.startActivity(intent2);
            }
            if (navOptions == null || this.mHostActivity == null) {
                return null;
            }
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if (enterAnim == -1 && exitAnim == -1) {
                return null;
            }
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim != -1) {
                i = exitAnim;
            }
            this.mHostActivity.overridePendingTransition(enterAnim, i);
            return null;
        }
        throw new IllegalStateException("Destination " + destination.getId() + " does not have an Intent set.");
    }
}
