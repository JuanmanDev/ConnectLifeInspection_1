package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0187R;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

public class PopupMenu {
    public final View mAnchor;
    public final Context mContext;
    public View.OnTouchListener mDragListener;
    public final MenuBuilder mMenu;
    public OnMenuItemClickListener mMenuItemClickListener;
    public OnDismissListener mOnDismissListener;
    public final MenuPopupHelper mPopup;

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                public ShowableListMenu getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                public boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                public boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    @NonNull
    public Menu getMenu() {
        return this.mMenu;
    }

    @NonNull
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContext);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ListView getMenuListView() {
        if (!this.mPopup.isShowing()) {
            return null;
        }
        return this.mPopup.getListView();
    }

    public void inflate(@MenuRes int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setForceShowIcon(boolean z) {
        this.mPopup.setForceShowIcon(z);
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public void setOnDismissListener(@Nullable OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.show();
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i) {
        this(context, view, i, C0187R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i, @AttrRes int i2, @StyleRes int i3) {
        this.mContext = context;
        this.mAnchor = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.mMenu = menuBuilder;
        menuBuilder.setCallback(new MenuBuilder.Callback() {
            public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }

            public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            }
        });
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, this.mMenu, view, false, i2, i3);
        this.mPopup = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        this.mPopup.setOnDismissListener(new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                PopupMenu popupMenu = PopupMenu.this;
                OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(popupMenu);
                }
            }
        });
    }
}
