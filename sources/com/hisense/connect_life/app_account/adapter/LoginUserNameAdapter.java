package com.hisense.connect_life.app_account.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0018H\u0016J\u000e\u0010'\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0004\n\u0002\u0010\u0019¨\u0006*"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/adapter/LoginUserNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "context", "Landroid/content/Context;", "loginUserInfoList", "", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "value", "", "deleteStatus", "getDeleteStatus", "()Z", "setDeleteStatus", "(Z)V", "getLoginUserInfoList", "()Ljava/util/List;", "onItemClickListener", "Lcom/hisense/connect_life/app_account/adapter/LoginUserNameAdapter$OnItemClickListener;", "userBgArray", "", "", "[Ljava/lang/Integer;", "getItemCount", "getSpellName", "", "firstName", "lastName", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "userPhotoShow", "OnItemClickListener", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginUserNameAdapter.kt */
public final class LoginUserNameAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final Context context;
    public boolean deleteStatus;
    @NotNull
    public final List<LoginUserInfo> loginUserInfoList;
    @Nullable
    public OnItemClickListener onItemClickListener;
    @NotNull
    public final Integer[] userBgArray = {Integer.valueOf(R$color.user_bg_1), Integer.valueOf(R$color.user_bg_2), Integer.valueOf(R$color.user_bg_3), Integer.valueOf(R$color.user_bg_4), Integer.valueOf(R$color.user_bg_5), Integer.valueOf(R$color.user_bg_6), Integer.valueOf(R$color.user_bg_7), Integer.valueOf(R$color.user_bg_8), Integer.valueOf(R$color.user_bg_9), Integer.valueOf(R$color.user_bg_10)};

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/adapter/LoginUserNameAdapter$OnItemClickListener;", "", "onDeleteItemClick", "", "position", "", "loginUserInfo", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "userIconBg", "onItemClick", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: LoginUserNameAdapter.kt */
    public interface OnItemClickListener {
        void onDeleteItemClick(int i, @NotNull LoginUserInfo loginUserInfo, int i2);

        void onItemClick(int i, @NotNull LoginUserInfo loginUserInfo, int i2);
    }

    public LoginUserNameAdapter(@NotNull Context context2, @NotNull List<LoginUserInfo> list) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(list, "loginUserInfoList");
        this.context = context2;
        this.loginUserInfoList = list;
    }

    private final String getSpellName(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) str, (Object) "null") || Intrinsics.areEqual((Object) str2, (Object) "null")) {
            return "UN";
        }
        char charAt = str.charAt(0);
        return Intrinsics.stringPlus(charAt + "", Character.valueOf(str2.charAt(0)));
    }

    private final void userPhotoShow(Holder holder, int i) {
        String photo_url = this.loginUserInfoList.get(i).getPhoto_url();
        if (TextUtils.isEmpty(photo_url) || Intrinsics.areEqual((Object) photo_url, (Object) "null")) {
            ImageView imageView = (ImageView) holder.itemView.findViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.user_image");
            imageView.setVisibility(8);
            TextView textView = (TextView) holder.itemView.findViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.user_text");
            textView.setVisibility(0);
            Integer[] numArr = this.userBgArray;
            ((CardView) holder.itemView.findViewById(R$id.user_card_view)).setCardBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), this.userBgArray[i >= numArr.length ? i - numArr.length : i].intValue()));
            ((TextView) holder.itemView.findViewById(R$id.user_text)).setText(getSpellName(this.loginUserInfoList.get(i).getFirst_name(), this.loginUserInfoList.get(i).getLast_name()));
            return;
        }
        ImageView imageView2 = (ImageView) holder.itemView.findViewById(R$id.user_image);
        Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.user_image");
        imageView2.setVisibility(0);
        TextView textView2 = (TextView) holder.itemView.findViewById(R$id.user_text);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.user_text");
        textView2.setVisibility(8);
        ((C1544f) C1541c.m1099u(this.context).mo15512s(photo_url).mo16283b0(((CardView) holder.itemView.findViewById(R$id.user_card_view)).getWidth(), ((CardView) holder.itemView.findViewById(R$id.user_card_view)).getHeight())).mo15478D0((ImageView) holder.itemView.findViewById(R$id.user_image));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getDeleteStatus() {
        return this.deleteStatus;
    }

    public int getItemCount() {
        return this.loginUserInfoList.size();
    }

    @NotNull
    public final List<LoginUserInfo> getLoginUserInfoList() {
        return this.loginUserInfoList;
    }

    public final void setDeleteStatus(boolean z) {
        this.deleteStatus = z;
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener2) {
        Intrinsics.checkNotNullParameter(onItemClickListener2, "onItemClickListener");
        this.onItemClickListener = onItemClickListener2;
    }

    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        userPhotoShow(holder, i);
        if (TextUtils.isEmpty(this.loginUserInfoList.get(i).getFirst_name()) || TextUtils.isEmpty(this.loginUserInfoList.get(i).getLast_name()) || Intrinsics.areEqual((Object) this.loginUserInfoList.get(i).getFirst_name(), (Object) "null") || Intrinsics.areEqual((Object) this.loginUserInfoList.get(i).getLast_name(), (Object) "null")) {
            ((TextView) holder.itemView.findViewById(R$id.user_name)).setText(this.loginUserInfoList.get(i).getEmail());
        } else {
            ((TextView) holder.itemView.findViewById(R$id.user_name)).setText(this.loginUserInfoList.get(i).getFirst_name() + ' ' + this.loginUserInfoList.get(i).getLast_name());
        }
        ((TextView) holder.itemView.findViewById(R$id.tv_delete)).setVisibility(!this.deleteStatus ? 8 : 0);
        CardView cardView = (CardView) holder.itemView.findViewById(R$id.user_card_view);
        Intrinsics.checkNotNullExpressionValue(cardView, "holder.itemView.user_card_view");
        JuConnectExtKt.singleClickListener(cardView, new LoginUserNameAdapter$onBindViewHolder$1(this, i));
        TextView textView = (TextView) holder.itemView.findViewById(R$id.tv_delete);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tv_delete");
        JuConnectExtKt.singleClickListener(textView, new LoginUserNameAdapter$onBindViewHolder$2(this, i));
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.login_users_name_item, viewGroup, false));
    }
}
