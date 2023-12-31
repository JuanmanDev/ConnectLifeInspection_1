package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class ListPopupWindowCompat {

    @RequiresApi(19)
    public static class Api19Impl {
        @DoNotInline
        public static View.OnTouchListener createDragToOpenListener(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }

    @Nullable
    public static View.OnTouchListener createDragToOpenListener(@NonNull ListPopupWindow listPopupWindow, @NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.createDragToOpenListener(listPopupWindow, view);
        }
        return null;
    }
}
