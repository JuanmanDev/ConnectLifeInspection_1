package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.WeakHashMap;

public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    public static final WeakHashMap<Context, DisplayManagerCompat> sInstances = new WeakHashMap<>();
    public final Context mContext;

    @RequiresApi(17)
    public static class Api17Impl {
        @DoNotInline
        public static Display getDisplay(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @DoNotInline
        public static Display[] getDisplays(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
        DisplayManagerCompat displayManagerCompat;
        synchronized (sInstances) {
            displayManagerCompat = sInstances.get(context);
            if (displayManagerCompat == null) {
                displayManagerCompat = new DisplayManagerCompat(context);
                sInstances.put(context, displayManagerCompat);
            }
        }
        return displayManagerCompat;
    }

    @Nullable
    public Display getDisplay(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.getDisplay((DisplayManager) this.mContext.getSystemService("display"), i);
        }
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == i) {
            return defaultDisplay;
        }
        return null;
    }

    @NonNull
    public Display[] getDisplays() {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.getDisplays((DisplayManager) this.mContext.getSystemService("display"));
        }
        return new Display[]{((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()};
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Api17Impl.getDisplays((DisplayManager) this.mContext.getSystemService("display"));
        }
        if (str == null) {
            return new Display[0];
        }
        return new Display[]{((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()};
    }
}
