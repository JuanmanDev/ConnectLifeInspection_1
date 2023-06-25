package com.hisense.connect_life.app_account.activity;

import com.hisense.connect_life.app_account.util.GetHeadPicPopupWindow;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo47991d2 = {"com/hisense/connect_life/app_account/activity/UserProfileActivity$setListeners$3", "Lcom/hisense/connect_life/app_account/util/GetHeadPicPopupWindow$GetHeadPicPopupWindowClickListener;", "selectFromAlbumClick", "", "takePhotosClick", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$setListeners$3 implements GetHeadPicPopupWindow.GetHeadPicPopupWindowClickListener {
    public final /* synthetic */ UserProfileActivity this$0;

    public UserProfileActivity$setListeners$3(UserProfileActivity userProfileActivity) {
        this.this$0 = userProfileActivity;
    }

    public void selectFromAlbumClick() {
        this.this$0.isTakePhoto = false;
        this.this$0.requestStoragePermission();
    }

    public void takePhotosClick() {
        this.this$0.isTakePhoto = true;
        this.this$0.requestCameraPermission();
    }
}
