package com.hisense.juconnect.app_device.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import androidx.test.internal.runner.RunnerArgs;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.room.NotiTitle;
import com.hisense.juconnect.app_device.R$color;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.view.SwipeItemLayout;
import com.juconnect.connectlife.model.NotificationBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1499f;
import p040c.p072c.p073a.p074a.C1527w;
import p040c.p429r.p460b.p461a.p463b.C7534a;

@Metadata(mo47990d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003()*B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0003¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J2\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J*\u0010 \u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010'\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u000eR'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "group", "", "Lcom/hisense/connect_life/hismart/room/NotiTitle;", "child", "Ljava/util/ArrayList;", "Lcom/juconnect/connectlife/model/NotificationBean;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/util/List;)V", "getChild", "()Ljava/util/List;", "getGroup", "onDeleteClickListener", "Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$OnSelectClickListener;", "onSelectClickListener", "", "groupPosition", "", "childPosition", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "setDeleteClickListener", "", "listener", "setSelectClickListener", "ChildViewHolder", "GroupViewHolder", "OnSelectClickListener", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationAdapter.kt */
public final class NotificationAdapter extends BaseExpandableListAdapter {
    @NotNull
    public final List<ArrayList<NotificationBean>> child;
    @NotNull
    public final List<NotiTitle> group;
    @Nullable
    public OnSelectClickListener onDeleteClickListener;
    @Nullable
    public OnSelectClickListener onSelectClickListener;

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$ChildViewHolder;", "", "()V", "notification_deleted", "Landroid/widget/TextView;", "getNotification_deleted", "()Landroid/widget/TextView;", "setNotification_deleted", "(Landroid/widget/TextView;)V", "notification_detail", "getNotification_detail", "setNotification_detail", "notification_ic", "Lcom/hisense/connect_life/core/widget/IconFontView;", "getNotification_ic", "()Lcom/hisense/connect_life/core/widget/IconFontView;", "setNotification_ic", "(Lcom/hisense/connect_life/core/widget/IconFontView;)V", "notification_ll", "Lcom/hisense/juconnect/app_device/view/SwipeItemLayout;", "getNotification_ll", "()Lcom/hisense/juconnect/app_device/view/SwipeItemLayout;", "setNotification_ll", "(Lcom/hisense/juconnect/app_device/view/SwipeItemLayout;)V", "notification_time", "getNotification_time", "setNotification_time", "notification_title", "getNotification_title", "setNotification_title", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NotificationAdapter.kt */
    public static final class ChildViewHolder {
        @Nullable
        public TextView notification_deleted;
        @Nullable
        public TextView notification_detail;
        @Nullable
        public IconFontView notification_ic;
        @Nullable
        public SwipeItemLayout notification_ll;
        @Nullable
        public TextView notification_time;
        @Nullable
        public TextView notification_title;

        @Nullable
        public final TextView getNotification_deleted() {
            return this.notification_deleted;
        }

        @Nullable
        public final TextView getNotification_detail() {
            return this.notification_detail;
        }

        @Nullable
        public final IconFontView getNotification_ic() {
            return this.notification_ic;
        }

        @Nullable
        public final SwipeItemLayout getNotification_ll() {
            return this.notification_ll;
        }

        @Nullable
        public final TextView getNotification_time() {
            return this.notification_time;
        }

        @Nullable
        public final TextView getNotification_title() {
            return this.notification_title;
        }

        public final void setNotification_deleted(@Nullable TextView textView) {
            this.notification_deleted = textView;
        }

        public final void setNotification_detail(@Nullable TextView textView) {
            this.notification_detail = textView;
        }

        public final void setNotification_ic(@Nullable IconFontView iconFontView) {
            this.notification_ic = iconFontView;
        }

        public final void setNotification_ll(@Nullable SwipeItemLayout swipeItemLayout) {
            this.notification_ll = swipeItemLayout;
        }

        public final void setNotification_time(@Nullable TextView textView) {
            this.notification_time = textView;
        }

        public final void setNotification_title(@Nullable TextView textView) {
            this.notification_title = textView;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$GroupViewHolder;", "", "()V", "group_select", "Landroid/widget/TextView;", "getGroup_select", "()Landroid/widget/TextView;", "setGroup_select", "(Landroid/widget/TextView;)V", "group_title", "getGroup_title", "setGroup_title", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NotificationAdapter.kt */
    public static final class GroupViewHolder {
        @Nullable
        public TextView group_select;
        @Nullable
        public TextView group_title;

        @Nullable
        public final TextView getGroup_select() {
            return this.group_select;
        }

        @Nullable
        public final TextView getGroup_title() {
            return this.group_title;
        }

        public final void setGroup_select(@Nullable TextView textView) {
            this.group_select = textView;
        }

        public final void setGroup_title(@Nullable TextView textView) {
            this.group_title = textView;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter$OnSelectClickListener;", "", "onSelectClick", "", "position", "", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NotificationAdapter.kt */
    public interface OnSelectClickListener {
        void onSelectClick(int i);
    }

    public NotificationAdapter(@NotNull List<NotiTitle> list, @NotNull List<? extends ArrayList<NotificationBean>> list2) {
        Intrinsics.checkNotNullParameter(list, "group");
        Intrinsics.checkNotNullParameter(list2, "child");
        this.group = list;
        this.child = list2;
    }

    /* renamed from: getChildView$lambda-2  reason: not valid java name */
    public static final void m27146getChildView$lambda2(NotificationAdapter notificationAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(notificationAdapter, "this$0");
        OnSelectClickListener onSelectClickListener2 = notificationAdapter.onDeleteClickListener;
        if (onSelectClickListener2 != null) {
            onSelectClickListener2.onSelectClick(i);
        }
    }

    @NotNull
    public final List<ArrayList<NotificationBean>> getChild() {
        return this.child;
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    @NotNull
    public View getChildView(int i, int i2, boolean z, @Nullable View view, @NotNull ViewGroup viewGroup) {
        ChildViewHolder childViewHolder;
        DeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_notification, viewGroup, false);
            childViewHolder = new ChildViewHolder();
            Intrinsics.checkNotNull(view);
            View findViewById = view.findViewById(R$id.item_notification_title);
            if (findViewById != null) {
                childViewHolder.setNotification_title((TextView) findViewById);
                View findViewById2 = view.findViewById(R$id.item_notification_detail);
                if (findViewById2 != null) {
                    childViewHolder.setNotification_detail((TextView) findViewById2);
                    View findViewById3 = view.findViewById(R$id.item_notification_deleted);
                    if (findViewById3 != null) {
                        childViewHolder.setNotification_deleted((TextView) findViewById3);
                        View findViewById4 = view.findViewById(R$id.item_notification_ll);
                        if (findViewById4 != null) {
                            childViewHolder.setNotification_ll((SwipeItemLayout) findViewById4);
                            View findViewById5 = view.findViewById(R$id.item_notification_ic);
                            if (findViewById5 != null) {
                                childViewHolder.setNotification_ic((IconFontView) findViewById5);
                                View findViewById6 = view.findViewById(R$id.item_notification_time);
                                if (findViewById6 != null) {
                                    childViewHolder.setNotification_time((TextView) findViewById6);
                                    view.setTag(childViewHolder);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.core.widget.IconFontView");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_device.view.SwipeItemLayout");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                childViewHolder = (ChildViewHolder) tag;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_device.adapter.NotificationAdapter.ChildViewHolder");
            }
        }
        try {
            if ((!this.child.isEmpty()) && (!this.child.get(i).isEmpty()) && this.child.size() > i) {
                TextView notification_title = childViewHolder.getNotification_title();
                Intrinsics.checkNotNull(notification_title);
                notification_title.setText(((NotificationBean) this.child.get(i).get(i2)).getTitle());
                String deviceId = ((NotificationBean) this.child.get(i).get(i2)).getDeviceId();
                String str = null;
                if (deviceId == null) {
                    deviceInfo = null;
                } else {
                    deviceInfo = DeviceCache.Companion.getInstance().getDevice(deviceId);
                }
                if (deviceInfo == null) {
                    TextView notification_detail = childViewHolder.getNotification_detail();
                    Intrinsics.checkNotNull(notification_detail);
                    notification_detail.setText(((NotificationBean) this.child.get(i).get(i2)).getDeviceId());
                } else {
                    TextView notification_detail2 = childViewHolder.getNotification_detail();
                    Intrinsics.checkNotNull(notification_detail2);
                    String deviceId2 = ((NotificationBean) this.child.get(i).get(i2)).getDeviceId();
                    if (deviceId2 != null) {
                        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(deviceId2);
                        if (device != null) {
                            str = device.getDeviceNickName();
                        }
                    }
                    notification_detail2.setText(str);
                }
                TextView notification_time = childViewHolder.getNotification_time();
                Intrinsics.checkNotNull(notification_time);
                notification_time.setText(new SimpleDateFormat("dd/MM,HH:mm").format(new Date(((NotificationBean) this.child.get(i).get(i2)).getInsertTime())));
                Integer select = ((NotificationBean) this.child.get(i).get(i2)).getSelect();
                if (select != null) {
                    if (select.intValue() == 0) {
                        SwipeItemLayout notification_ll = childViewHolder.getNotification_ll();
                        if (notification_ll != null) {
                            notification_ll.setBackgroundColor(C1499f.m915a(R$color.colorWhite));
                        }
                        switch (((NotificationBean) this.child.get(i).get(i2)).getMsgType()) {
                            case KeyConst.MSG_ADD_WINE:
                                IconFontView notification_ic = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic);
                                notification_ic.setText(C1527w.m1063b(R$string.icon_add_wine));
                                IconFontView notification_ic2 = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic2);
                                notification_ic2.setTextColor(C1499f.m915a(R$color.colorBlack));
                                break;
                            case KeyConst.MSG_DEL_WINE:
                                IconFontView notification_ic3 = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic3);
                                notification_ic3.setText(C1527w.m1063b(R$string.icon_add_wine));
                                IconFontView notification_ic4 = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic4);
                                notification_ic4.setTextColor(C1499f.m915a(R$color.colorBlack));
                                break;
                            case KeyConst.MSG_ALARM:
                                IconFontView notification_ic5 = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic5);
                                notification_ic5.setText(C1527w.m1063b(R$string.icon_add_wine));
                                IconFontView notification_ic6 = childViewHolder.getNotification_ic();
                                Intrinsics.checkNotNull(notification_ic6);
                                notification_ic6.setTextColor(C1499f.m915a(R$color.colorAccent));
                                break;
                        }
                    }
                }
                if (select != null) {
                    if (select.intValue() == 1) {
                        SwipeItemLayout notification_ll2 = childViewHolder.getNotification_ll();
                        if (notification_ll2 != null) {
                            notification_ll2.setBackgroundColor(C1499f.m915a(R$color.colorText_e5));
                        }
                        IconFontView notification_ic7 = childViewHolder.getNotification_ic();
                        if (notification_ic7 != null) {
                            notification_ic7.setText(C1527w.m1063b(R$string.icon_apliances_success));
                        }
                        IconFontView notification_ic8 = childViewHolder.getNotification_ic();
                        Intrinsics.checkNotNull(notification_ic8);
                        notification_ic8.setTextColor(C1499f.m915a(R$color.colorBlack));
                    }
                }
            }
        } catch (Exception e) {
            String.valueOf(e);
            e.printStackTrace();
        }
        TextView notification_deleted = childViewHolder.getNotification_deleted();
        Intrinsics.checkNotNull(notification_deleted);
        notification_deleted.setOnClickListener(new C7534a(this, i2));
        return view;
    }

    public int getChildrenCount(int i) {
        return this.child.get(i).size();
    }

    @NotNull
    public final List<NotiTitle> getGroup() {
        return this.group;
    }

    public int getGroupCount() {
        return this.group.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    @NotNull
    public View getGroupView(int i, boolean z, @Nullable View view, @NotNull ViewGroup viewGroup) {
        GroupViewHolder groupViewHolder;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_notification_title, viewGroup, false);
            groupViewHolder = new GroupViewHolder();
            Intrinsics.checkNotNull(view);
            View findViewById = view.findViewById(R$id.notification_title);
            if (findViewById != null) {
                groupViewHolder.setGroup_title((TextView) findViewById);
                View findViewById2 = view.findViewById(R$id.notification_select);
                if (findViewById2 != null) {
                    groupViewHolder.setGroup_select((TextView) findViewById2);
                    view.setTag(groupViewHolder);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                groupViewHolder = (GroupViewHolder) tag;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_device.adapter.NotificationAdapter.GroupViewHolder");
            }
        }
        try {
            TextView group_title = groupViewHolder.getGroup_title();
            Intrinsics.checkNotNull(group_title);
            group_title.setText("");
            int select = this.group.get(i).getSelect();
            if (select == 0) {
                TextView group_select = groupViewHolder.getGroup_select();
                if (group_select != null) {
                    group_select.setVisibility(8);
                }
            } else if (select == 1) {
                TextView group_select2 = groupViewHolder.getGroup_select();
                if (group_select2 != null) {
                    group_select2.setVisibility(0);
                }
            }
            TextView group_select3 = groupViewHolder.getGroup_select();
            Intrinsics.checkNotNull(group_select3);
            JuConnectExtKt.singleClickListener(group_select3, new NotificationAdapter$getGroupView$1(this, i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final void setDeleteClickListener(@NotNull OnSelectClickListener onSelectClickListener2) {
        Intrinsics.checkNotNullParameter(onSelectClickListener2, RunnerArgs.ARGUMENT_LISTENER);
        this.onDeleteClickListener = onSelectClickListener2;
    }

    public final void setSelectClickListener(@NotNull OnSelectClickListener onSelectClickListener2) {
        Intrinsics.checkNotNullParameter(onSelectClickListener2, "onSelectClickListener");
        this.onSelectClickListener = onSelectClickListener2;
    }

    @NotNull
    public Object getChild(int i, int i2) {
        Object obj = this.child.get(i).get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "child[groupPosition][childPosition]");
        return obj;
    }

    @NotNull
    public Object getGroup(int i) {
        return this.group.get(i);
    }
}
