package com.hisense.connect_life.app_account.util;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/GetHeadPicPopupWindow;", "Landroid/view/View$OnClickListener;", "()V", "cancel", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "getHeadPicPopupWindowClickListener", "Lcom/hisense/connect_life/app_account/util/GetHeadPicPopupWindow$GetHeadPicPopupWindowClickListener;", "mGetHeadPicPopupWindow", "Landroid/widget/PopupWindow;", "outsideTouchable", "", "select_From_Album", "share_linear_blank", "take_Photos", "addGetHeadPicPopupWindowClickListener", "", "createGetHeadPicWindow", "parentLayout", "Landroid/view/View;", "onClick", "v", "GetHeadPicPopupWindowClickListener", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GetHeadPicPopupWindow.kt */
public final class GetHeadPicPopupWindow implements View.OnClickListener {
    @Nullable
    public TextView cancel;
    @Nullable
    public Context context;
    @Nullable
    public GetHeadPicPopupWindowClickListener getHeadPicPopupWindowClickListener;
    @Nullable
    public PopupWindow mGetHeadPicPopupWindow;
    public final boolean outsideTouchable = true;
    @Nullable
    public TextView select_From_Album;
    @Nullable
    public TextView share_linear_blank;
    @Nullable
    public TextView take_Photos;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/GetHeadPicPopupWindow$GetHeadPicPopupWindowClickListener;", "", "selectFromAlbumClick", "", "takePhotosClick", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: GetHeadPicPopupWindow.kt */
    public interface GetHeadPicPopupWindowClickListener {
        void selectFromAlbumClick();

        void takePhotosClick();
    }

    public final void addGetHeadPicPopupWindowClickListener(@NotNull GetHeadPicPopupWindowClickListener getHeadPicPopupWindowClickListener2) {
        Intrinsics.checkNotNullParameter(getHeadPicPopupWindowClickListener2, "getHeadPicPopupWindowClickListener");
        this.getHeadPicPopupWindowClickListener = getHeadPicPopupWindowClickListener2;
    }

    @NotNull
    public final PopupWindow createGetHeadPicWindow(@NotNull View view, @NotNull Context context2) {
        Intrinsics.checkNotNullParameter(view, "parentLayout");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        Object systemService = context2.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R$layout.headpic_popupwindow, (ViewGroup) null);
            this.take_Photos = (TextView) inflate.findViewById(R$id.take_Photos);
            this.select_From_Album = (TextView) inflate.findViewById(R$id.select_From_Album);
            this.cancel = (TextView) inflate.findViewById(R$id.cancel);
            this.share_linear_blank = (TextView) inflate.findViewById(R$id.share_linear_blank);
            PopupWindow popupWindow = new PopupWindow(inflate, -1, -1);
            this.mGetHeadPicPopupWindow = popupWindow;
            Intrinsics.checkNotNull(popupWindow);
            popupWindow.setFocusable(true);
            PopupWindow popupWindow2 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow2);
            popupWindow2.setOutsideTouchable(this.outsideTouchable);
            PopupWindow popupWindow3 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow3);
            popupWindow3.update();
            PopupWindow popupWindow4 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow4);
            popupWindow4.setBackgroundDrawable(new BitmapDrawable());
            PopupWindow popupWindow5 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow5);
            popupWindow5.setAnimationStyle(R$style.style_headpic_popupwindow);
            PopupWindow popupWindow6 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow6);
            popupWindow6.showAtLocation(view, 80, -1, -1);
            TextView textView = this.take_Photos;
            Intrinsics.checkNotNull(textView);
            textView.setOnClickListener(this);
            TextView textView2 = this.select_From_Album;
            Intrinsics.checkNotNull(textView2);
            textView2.setOnClickListener(this);
            TextView textView3 = this.cancel;
            Intrinsics.checkNotNull(textView3);
            textView3.setOnClickListener(this);
            TextView textView4 = this.share_linear_blank;
            Intrinsics.checkNotNull(textView4);
            textView4.setOnClickListener(this);
            PopupWindow popupWindow7 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow7);
            return popupWindow7;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        PopupWindow popupWindow = this.mGetHeadPicPopupWindow;
        Intrinsics.checkNotNull(popupWindow);
        if (popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.mGetHeadPicPopupWindow;
            Intrinsics.checkNotNull(popupWindow2);
            popupWindow2.dismiss();
        }
        int id = view.getId();
        if (id == R$id.take_Photos) {
            GetHeadPicPopupWindowClickListener getHeadPicPopupWindowClickListener2 = this.getHeadPicPopupWindowClickListener;
            Intrinsics.checkNotNull(getHeadPicPopupWindowClickListener2);
            getHeadPicPopupWindowClickListener2.takePhotosClick();
        } else if (id == R$id.select_From_Album) {
            GetHeadPicPopupWindowClickListener getHeadPicPopupWindowClickListener3 = this.getHeadPicPopupWindowClickListener;
            Intrinsics.checkNotNull(getHeadPicPopupWindowClickListener3);
            getHeadPicPopupWindowClickListener3.selectFromAlbumClick();
        } else if (id != R$id.cancel) {
            int i = R$id.share_linear_blank;
        }
    }
}
