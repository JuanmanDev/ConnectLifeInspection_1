package com.hisense.juconnect.app_device.fragment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.base.BaseFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.DateUtil;
import com.hisense.connect_life.hismart.room.NotiTitle;
import com.hisense.connect_life.hismart.room.Notification;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.activity.NotificationActivity;
import com.hisense.juconnect.app_device.adapter.NotificationAdapter;
import com.hisense.juconnect.app_device.event.GetMessage;
import com.juconnect.connectlife.model.NotificationBean;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p464c.C7539e;
import p040c.p429r.p460b.p461a.p464c.C7540f;
import p040c.p429r.p460b.p461a.p464c.C7543i;

@Metadata(mo47990d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010j\u001a\u00020kJ\u0010\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020nH\u0002J\u0006\u0010o\u001a\u00020kJ\b\u0010p\u001a\u00020qH\u0002J\u0006\u0010r\u001a\u00020kJ\u0010\u0010s\u001a\u00020k2\u0006\u0010t\u001a\u00020!H\u0014J\u0006\u0010u\u001a\u00020.J\u0010\u0010v\u001a\u00020k2\u0006\u0010w\u001a\u00020\u0006H\u0002J\b\u0010L\u001a\u00020kH\u0002J\u0010\u0010x\u001a\u00020k2\u0006\u0010y\u001a\u00020zH\u0016J\b\u0010{\u001a\u00020kH\u0016J\u0010\u0010|\u001a\u00020k2\u0006\u0010}\u001a\u00020~H\u0007J\u0012\u0010\u001a\u00020k2\b\u0010\u0001\u001a\u00030\u0001H\u0007J\u0012\u0010\u0001\u001a\u00020k2\u0007\u0010\u0001\u001a\u00020.H\u0016J\t\u0010\u0001\u001a\u00020kH\u0002J\t\u0010\u0001\u001a\u00020kH\u0002J\u0012\u0010\u0001\u001a\u00020k2\u0007\u0010\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0001\u001a\u00020kH\u0002J\t\u0010\u0001\u001a\u00020kH\u0002J+\u0010\u0001\u001a\u00020k2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u00072\u0007\u0010\u0001\u001a\u00020\u0006H\u0002J\u001b\u0010\u0001\u001a\u00020k2\u0007\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u0006H\u0004J\u001b\u0010\u0001\u001a\u00020k2\u0007\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0001\u001a\u00020kH\u0014J\t\u0010\u0001\u001a\u00020kH\u0002J\u0007\u0010\u0001\u001a\u00020kRB\u0010\u0003\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR@\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0004j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0007`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010&\u001a\u0012\u0012\u0004\u0012\u00020'0\u0004j\b\u0012\u0004\u0012\u00020'`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001a\u0010*\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR*\u00105\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR*\u00108\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR \u0010;\u001a\b\u0012\u0004\u0012\u00020\r0<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020\r0<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R \u0010D\u001a\b\u0012\u0004\u0012\u00020\r0<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\u0014\u0010G\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0012R*\u0010I\u001a\u0012\u0012\u0004\u0012\u00020.0\u0004j\b\u0012\u0004\u0012\u00020.`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR\u001a\u0010L\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010/\"\u0004\bN\u00101R\u001a\u0010O\u001a\u00020PX.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010[\u001a\u0004\u0018\u00010\\X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001a\u0010d\u001a\u00020eX.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006\u0001"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/NotificationBaseFragment;", "Lcom/hisense/connect_life/core/base/BaseFragment;", "()V", "checkedList", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Lkotlin/collections/ArrayList;", "getCheckedList", "()Ljava/util/ArrayList;", "setCheckedList", "(Ljava/util/ArrayList;)V", "childList", "Lcom/juconnect/connectlife/model/NotificationBean;", "getChildList", "setChildList", "current", "getCurrent", "()I", "setCurrent", "(I)V", "currentFragmentIndex", "getCurrentFragmentIndex", "setCurrentFragmentIndex", "expandableListView", "Landroid/widget/ExpandableListView;", "getExpandableListView", "()Landroid/widget/ExpandableListView;", "setExpandableListView", "(Landroid/widget/ExpandableListView;)V", "firstLoadCounts", "getFirstLoadCounts", "footerView", "Landroid/view/View;", "getFooterView", "()Landroid/view/View;", "setFooterView", "(Landroid/view/View;)V", "groupList", "Lcom/hisense/connect_life/hismart/room/NotiTitle;", "getGroupList", "setGroupList", "index", "getIndex", "setIndex", "isLoading", "", "()Z", "setLoading", "(Z)V", "list1", "getList1", "setList1", "list2", "getList2", "setList2", "list3", "getList3", "setList3", "list_day", "", "getList_day", "()Ljava/util/List;", "setList_day", "(Ljava/util/List;)V", "list_month", "getList_month", "setList_month", "list_week", "getList_week", "setList_week", "loadMoreCounts", "getLoadMoreCounts", "lv_selected", "getLv_selected", "setLv_selected", "notMore", "getNotMore", "setNotMore", "notificationAdapter", "Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter;", "getNotificationAdapter", "()Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter;", "setNotificationAdapter", "(Lcom/hisense/juconnect/app_device/adapter/NotificationAdapter;)V", "notificationEmptyView", "Landroid/widget/TextView;", "getNotificationEmptyView", "()Landroid/widget/TextView;", "setNotificationEmptyView", "(Landroid/widget/TextView;)V", "parentActivity", "Lcom/hisense/juconnect/app_device/activity/NotificationActivity;", "getParentActivity", "()Lcom/hisense/juconnect/app_device/activity/NotificationActivity;", "setParentActivity", "(Lcom/hisense/juconnect/app_device/activity/NotificationActivity;)V", "selected", "getSelected", "setSelected", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "AllSeleted", "", "addNotiTitleAndExpandGroup", "titleString", "", "deleteNotification", "getWeekStartTime", "", "hideSelected", "initWidgets", "view", "isHideSelectText", "loadMore", "step", "onAttach", "activity", "Landroid/app/Activity;", "onDestroy", "onEvent", "message", "", "onGetMessage", "zoneWineBindEvent", "Lcom/hisense/juconnect/app_device/event/GetMessage;", "onHiddenChanged", "hidden", "queryAlertdData", "queryAllData", "queryData", "size", "queryInventoryData", "refreshAdapter", "selectData", "list", "position", "setItemChecked", "groupPosition", "childPosition", "setItemClickGotoReportTicket", "setListeners", "setNoDataShow", "showSelected", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationBaseFragment.kt */
public abstract class NotificationBaseFragment extends BaseFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @NotNull
    public ArrayList<Pair<Integer, Integer>> checkedList = new ArrayList<>();
    @NotNull
    public ArrayList<ArrayList<NotificationBean>> childList = new ArrayList<>();
    public int current;
    public int currentFragmentIndex;
    public ExpandableListView expandableListView;
    public final int firstLoadCounts;
    @Nullable
    public View footerView;
    @NotNull
    public ArrayList<NotiTitle> groupList = new ArrayList<>();
    public int index;
    public boolean isLoading;
    @NotNull
    public ArrayList<NotificationBean> list1 = new ArrayList<>();
    @NotNull
    public ArrayList<NotificationBean> list2 = new ArrayList<>();
    @NotNull
    public ArrayList<NotificationBean> list3 = new ArrayList<>();
    @NotNull
    public List<NotificationBean> list_day = new ArrayList();
    @NotNull
    public List<NotificationBean> list_month = new ArrayList();
    @NotNull
    public List<NotificationBean> list_week = new ArrayList();
    public final int loadMoreCounts;
    @NotNull
    public ArrayList<Boolean> lv_selected;
    public boolean notMore;
    public NotificationAdapter notificationAdapter;
    public TextView notificationEmptyView;
    @Nullable
    public NotificationActivity parentActivity;
    public boolean selected;
    public SwipeRefreshLayout swipeRefreshLayout;

    public NotificationBaseFragment() {
        Boolean bool = Boolean.FALSE;
        this.lv_selected = CollectionsKt__CollectionsKt.arrayListOf(bool, bool, bool);
        this.current = -1;
        this.index = -1;
        this.firstLoadCounts = 10;
        this.loadMoreCounts = 10;
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void addNotiTitleAndExpandGroup(String str) {
        boolean z;
        int size = this.groupList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            int i2 = i + 1;
            if (Intrinsics.areEqual((Object) this.groupList.get(i).getTitle(), (Object) str)) {
                z = true;
                break;
            }
            i = i2;
        }
        if (!z) {
            this.groupList.add(new NotiTitle(str, 0));
        }
    }

    private final long getWeekStartTime() {
        if (DateUtil.INSTANCE.getTimesWeekmorning() < DateUtil.INSTANCE.getTimesMonthmorning()) {
            return DateUtil.INSTANCE.getTimesMonthmorning();
        }
        return DateUtil.INSTANCE.getTimesWeekmorning();
    }

    private final void loadMore(int i) {
        int i2 = this.current;
        if (i2 == 0) {
            String string = getString(R$string.no_more_notifications);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_more_notifications)");
            showString(string);
        } else if (i2 == 1) {
            int size = this.list_day.size();
            int i3 = this.index;
            if (i < size - i3) {
                int i4 = i3 + i;
                while (i3 < i4) {
                    this.list1.add(this.list_day.get(i3));
                    i3++;
                }
                this.index += i;
            } else {
                int size2 = this.list_day.size();
                int i5 = this.index;
                if (size2 - i5 > 0) {
                    int size3 = this.list_day.size();
                    while (i5 < size3) {
                        this.list1.add(this.list_day.get(i5));
                        i5++;
                    }
                    if (!this.list_week.isEmpty()) {
                        if (!this.list_month.isEmpty()) {
                            int size4 = i - (this.list_day.size() - this.index);
                            if (this.list_week.size() <= size4) {
                                int size5 = this.list_week.size();
                                for (int i6 = 0; i6 < size5; i6++) {
                                    this.list2.add(this.list_week.get(i6));
                                }
                                this.childList.add(this.list2);
                                String string2 = getString(R$string.this_week);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.this_week)");
                                addNotiTitleAndExpandGroup(string2);
                                int size6 = (i - size4) - this.list_week.size();
                                if (this.list_month.size() < size6) {
                                    for (NotificationBean add : this.list_month) {
                                        this.list3.add(add);
                                    }
                                    this.current = 0;
                                    String string3 = getString(R$string.this_month);
                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.this_month)");
                                    addNotiTitleAndExpandGroup(string3);
                                    this.childList.add(this.list3);
                                    int groupCount = getNotificationAdapter().getGroupCount();
                                    for (int i7 = 0; i7 < groupCount; i7++) {
                                        getExpandableListView().expandGroup(i7);
                                    }
                                } else {
                                    for (int i8 = 0; i8 < size6; i8++) {
                                        this.list3.add(this.list_week.get(i8));
                                    }
                                    this.index = size6;
                                    this.current = 3;
                                    String string4 = getString(R$string.this_month);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.this_month)");
                                    addNotiTitleAndExpandGroup(string4);
                                    this.childList.add(this.list3);
                                    int groupCount2 = getNotificationAdapter().getGroupCount();
                                    for (int i9 = 0; i9 < groupCount2; i9++) {
                                        getExpandableListView().expandGroup(i9);
                                    }
                                }
                            } else {
                                for (int i10 = 0; i10 < size4; i10++) {
                                    this.list2.add(this.list_week.get(i10));
                                }
                                this.index = size4;
                                this.current = 2;
                                String string5 = getString(R$string.this_week);
                                Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.this_week)");
                                addNotiTitleAndExpandGroup(string5);
                                this.childList.add(this.list2);
                                int groupCount3 = getNotificationAdapter().getGroupCount();
                                for (int i11 = 0; i11 < groupCount3; i11++) {
                                    getExpandableListView().expandGroup(i11);
                                }
                            }
                        } else {
                            int size7 = i - (this.list_day.size() - this.index);
                            if (this.list_week.size() <= size7) {
                                int size8 = this.list_week.size();
                                for (int i12 = 0; i12 < size8; i12++) {
                                    this.list2.add(this.list_week.get(i12));
                                }
                                getExpandableListView().removeFooterView(this.footerView);
                                String string6 = getString(R$string.no_more_notifications);
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.no_more_notifications)");
                                showString(string6);
                            } else {
                                for (int i13 = 0; i13 < size7; i13++) {
                                    this.list2.add(this.list_week.get(i13));
                                }
                                this.index = size7;
                            }
                            String string7 = getString(R$string.this_week);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.this_week)");
                            addNotiTitleAndExpandGroup(string7);
                            this.childList.add(this.list2);
                            int groupCount4 = getNotificationAdapter().getGroupCount();
                            for (int i14 = 0; i14 < groupCount4; i14++) {
                                getExpandableListView().expandGroup(i14);
                            }
                            this.current = 2;
                        }
                    } else if (!this.list_month.isEmpty()) {
                        int size9 = i - (this.list_day.size() - this.index);
                        if (this.list_month.size() <= size9) {
                            int size10 = this.list_month.size();
                            for (int i15 = 0; i15 < size10; i15++) {
                                this.list3.add(this.list_month.get(i15));
                            }
                            getExpandableListView().removeFooterView(this.footerView);
                            String string8 = getString(R$string.no_more_notifications);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.no_more_notifications)");
                            showString(string8);
                        } else {
                            for (int i16 = 0; i16 < size9; i16++) {
                                this.list3.add(this.list_month.get(i16));
                            }
                            this.index = size9;
                        }
                        String string9 = getString(R$string.this_month);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.this_month)");
                        addNotiTitleAndExpandGroup(string9);
                        this.childList.add(this.list3);
                        int groupCount5 = getNotificationAdapter().getGroupCount();
                        for (int i17 = 0; i17 < groupCount5; i17++) {
                            getExpandableListView().expandGroup(i17);
                        }
                        this.current = 3;
                    } else {
                        this.current = 0;
                        getExpandableListView().removeFooterView(this.footerView);
                        String string10 = getString(R$string.no_more_notifications);
                        Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.no_more_notifications)");
                        showString(string10);
                    }
                }
            }
        } else if (i2 == 2) {
            int size11 = this.list_week.size();
            int i18 = this.index;
            if (i < size11 - i18) {
                int i19 = i18 + i;
                while (i18 < i19) {
                    this.list2.add(this.list_week.get(i18));
                    i18++;
                }
                if (this.index == 0) {
                    String string11 = getString(R$string.this_week);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.this_week)");
                    addNotiTitleAndExpandGroup(string11);
                    this.childList.add(this.list2);
                    int groupCount6 = getNotificationAdapter().getGroupCount();
                    for (int i20 = 0; i20 < groupCount6; i20++) {
                        getExpandableListView().expandGroup(i20);
                    }
                }
                this.index += i;
            } else {
                int size12 = this.list_week.size();
                int i21 = this.index;
                if (size12 - i21 > 0) {
                    int size13 = this.list_week.size();
                    while (i21 < size13) {
                        this.list2.add(this.list_week.get(i21));
                        i21++;
                    }
                    if (!this.list_month.isEmpty()) {
                        int size14 = i - (this.list_week.size() - this.index);
                        if (this.list_month.size() <= size14) {
                            int size15 = this.list_month.size();
                            for (int i22 = 0; i22 < size15; i22++) {
                                this.list3.add(this.list_month.get(i22));
                            }
                            getExpandableListView().removeFooterView(this.footerView);
                            String string12 = getString(R$string.no_more_notifications);
                            Intrinsics.checkNotNullExpressionValue(string12, "getString(R.string.no_more_notifications)");
                            showString(string12);
                        } else {
                            for (int i23 = 0; i23 < size14; i23++) {
                                this.list3.add(this.list_month.get(i23));
                            }
                            this.index = size14;
                        }
                        String string13 = getString(R$string.this_month);
                        Intrinsics.checkNotNullExpressionValue(string13, "getString(R.string.this_month)");
                        addNotiTitleAndExpandGroup(string13);
                        this.childList.add(this.list3);
                        int groupCount7 = getNotificationAdapter().getGroupCount();
                        for (int i24 = 0; i24 < groupCount7; i24++) {
                            getExpandableListView().expandGroup(i24);
                        }
                        this.current = 3;
                    } else {
                        this.current = 0;
                        getExpandableListView().removeFooterView(this.footerView);
                        String string14 = getString(R$string.no_more_notifications);
                        Intrinsics.checkNotNullExpressionValue(string14, "getString(R.string.no_more_notifications)");
                        showString(string14);
                    }
                }
            }
        } else if (i2 == 3) {
            int size16 = this.list_month.size();
            int i25 = this.index;
            if (i < size16 - i25) {
                int i26 = i25 + i;
                while (i25 < i26) {
                    this.list3.add(this.list_month.get(i25));
                    i25++;
                }
                this.index += i;
            } else {
                int size17 = this.list_month.size();
                while (i25 < size17) {
                    this.list3.add(this.list_month.get(i25));
                    i25++;
                }
                String string15 = getString(R$string.this_month);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(R.string.this_month)");
                addNotiTitleAndExpandGroup(string15);
                this.childList.add(this.list3);
                int groupCount8 = getNotificationAdapter().getGroupCount();
                for (int i27 = 0; i27 < groupCount8; i27++) {
                    getExpandableListView().expandGroup(i27);
                }
                this.current = 0;
                getExpandableListView().removeFooterView(this.footerView);
                String string16 = getString(R$string.no_more_notifications);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(R.string.no_more_notifications)");
                showString(string16);
            }
        }
        refreshAdapter();
        this.isLoading = false;
    }

    private final void notMore() {
        this.notMore = true;
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), (CoroutineStart) null, new NotificationBaseFragment$notMore$1(this, (Continuation<? super NotificationBaseFragment$notMore$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void queryAlertdData() {
        this.list_day.clear();
        this.list_week.clear();
        this.list_month.clear();
        for (T wineInventoryBean : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getAlarm(SPManagerKt.getCustomerId(), DateUtil.INSTANCE.getTimesmorning(), DateUtil.INSTANCE.getTimesnight(), KeyConst.MSG_ALARM))) {
            getList_day().add(Notification.Companion.toWineInventoryBean(wineInventoryBean));
        }
        for (T wineInventoryBean2 : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getAlarm(SPManagerKt.getCustomerId(), getWeekStartTime(), DateUtil.INSTANCE.getTimesmorning(), KeyConst.MSG_ALARM))) {
            getList_week().add(Notification.Companion.toWineInventoryBean(wineInventoryBean2));
        }
        for (T wineInventoryBean3 : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getAlarm(SPManagerKt.getCustomerId(), DateUtil.INSTANCE.getTimesMonthmorning(), DateUtil.INSTANCE.getTimesWeekmorning(), KeyConst.MSG_ALARM))) {
            getList_month().add(Notification.Companion.toWineInventoryBean(wineInventoryBean3));
        }
    }

    /* access modifiers changed from: private */
    public final void queryAllData() {
        this.list_day.clear();
        this.list_week.clear();
        this.list_month.clear();
        for (T wineInventoryBean : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getAll())) {
            getList_day().add(Notification.Companion.toWineInventoryBean(wineInventoryBean));
        }
    }

    /* access modifiers changed from: private */
    public final void queryData(int i) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new NotificationBaseFragment$queryData$1(this, i, (Continuation<? super NotificationBaseFragment$queryData$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void queryInventoryData() {
        this.list_day.clear();
        this.list_week.clear();
        this.list_month.clear();
        for (T wineInventoryBean : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getInventory(SPManagerKt.getCustomerId(), DateUtil.INSTANCE.getTimesmorning(), DateUtil.INSTANCE.getTimesnight(), KeyConst.MSG_ALARM))) {
            getList_day().add(Notification.Companion.toWineInventoryBean(wineInventoryBean));
        }
        for (T wineInventoryBean2 : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getInventory(SPManagerKt.getCustomerId(), getWeekStartTime(), DateUtil.INSTANCE.getTimesmorning(), KeyConst.MSG_ALARM))) {
            getList_week().add(Notification.Companion.toWineInventoryBean(wineInventoryBean2));
        }
        for (T wineInventoryBean3 : CollectionsKt___CollectionsKt.reversed(NotificationRoom.Companion.notificationProvider().getInventory(SPManagerKt.getCustomerId(), DateUtil.INSTANCE.getTimesMonthmorning(), DateUtil.INSTANCE.getTimesWeekmorning(), KeyConst.MSG_ALARM))) {
            getList_month().add(Notification.Companion.toWineInventoryBean(wineInventoryBean3));
        }
    }

    /* access modifiers changed from: private */
    public final void refreshAdapter() {
        getNotificationAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public final void selectData(ArrayList<NotificationBean> arrayList, int i) {
        int i2 = 0;
        if (!this.lv_selected.get(i).booleanValue()) {
            this.lv_selected.set(i, Boolean.TRUE);
            int size = arrayList.size();
            while (i2 < size) {
                int i3 = i2 + 1;
                arrayList.get(i2).setSelect(1);
                Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                if (!this.checkedList.contains(pair)) {
                    this.checkedList.add(pair);
                }
                i2 = i3;
            }
            return;
        }
        this.lv_selected.set(i, Boolean.FALSE);
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.get(i4).setSelect(0);
            this.checkedList.remove(new Pair(Integer.valueOf(i), Integer.valueOf(i4)));
        }
    }

    private final void setItemClickGotoReportTicket(int i, int i2) {
        NotificationBean notificationBean = (NotificationBean) this.childList.get(i).get(i2);
        if (notificationBean != null) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.ReportTicketActivity);
            a.withLong("time", notificationBean.getInsertTime()).withString(NotificationCompat.CATEGORY_EVENT, notificationBean.getTitle()).withLong("noid", notificationBean.getNoid()).withString("deviceId", notificationBean.getDeviceId()).withString("formatId", String.valueOf(notificationBean.getFormatId())).withString("msgLevel", String.valueOf(notificationBean.getMsgLevel())).withString("msgId", notificationBean.getMsgId().toString()).withString(KeyConst.KEY_AUIT, notificationBean.getContent());
            a.navigation();
        }
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final boolean m27160setListeners$lambda1(ExpandableListView expandableListView2, View view, int i, long j) {
        return true;
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final boolean m27161setListeners$lambda2(NotificationBaseFragment notificationBaseFragment, ExpandableListView expandableListView2, View view, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(notificationBaseFragment, "this$0");
        if (notificationBaseFragment.selected) {
            notificationBaseFragment.setItemChecked(i, i2);
            return true;
        }
        notificationBaseFragment.setItemClickGotoReportTicket(i, i2);
        return true;
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27162setListeners$lambda3(NotificationBaseFragment notificationBaseFragment) {
        Intrinsics.checkNotNullParameter(notificationBaseFragment, "this$0");
        notificationBaseFragment.queryData(notificationBaseFragment.firstLoadCounts);
    }

    /* access modifiers changed from: private */
    public final void setNoDataShow() {
        if (this.childList.size() == 0) {
            getExpandableListView().setVisibility(8);
            getNotificationEmptyView().setVisibility(0);
            return;
        }
        getExpandableListView().setVisibility(0);
        getNotificationEmptyView().setVisibility(8);
    }

    public final void AllSeleted() {
        int size = this.childList.get(0).size();
        for (int i = 0; i < size; i++) {
            setItemChecked(0, i);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void deleteNotification() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        this.selected = false;
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new NotificationBaseFragment$deleteNotification$1(this, objectRef, (Continuation<? super NotificationBaseFragment$deleteNotification$1>) null), 2, (Object) null);
    }

    @NotNull
    public final ArrayList<Pair<Integer, Integer>> getCheckedList() {
        return this.checkedList;
    }

    @NotNull
    public final ArrayList<ArrayList<NotificationBean>> getChildList() {
        return this.childList;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getCurrentFragmentIndex() {
        return this.currentFragmentIndex;
    }

    @NotNull
    public final ExpandableListView getExpandableListView() {
        ExpandableListView expandableListView2 = this.expandableListView;
        if (expandableListView2 != null) {
            return expandableListView2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandableListView");
        return null;
    }

    public final int getFirstLoadCounts() {
        return this.firstLoadCounts;
    }

    @Nullable
    public final View getFooterView() {
        return this.footerView;
    }

    @NotNull
    public final ArrayList<NotiTitle> getGroupList() {
        return this.groupList;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ArrayList<NotificationBean> getList1() {
        return this.list1;
    }

    @NotNull
    public final ArrayList<NotificationBean> getList2() {
        return this.list2;
    }

    @NotNull
    public final ArrayList<NotificationBean> getList3() {
        return this.list3;
    }

    @NotNull
    public final List<NotificationBean> getList_day() {
        return this.list_day;
    }

    @NotNull
    public final List<NotificationBean> getList_month() {
        return this.list_month;
    }

    @NotNull
    public final List<NotificationBean> getList_week() {
        return this.list_week;
    }

    public final int getLoadMoreCounts() {
        return this.loadMoreCounts;
    }

    @NotNull
    public final ArrayList<Boolean> getLv_selected() {
        return this.lv_selected;
    }

    public final boolean getNotMore() {
        return this.notMore;
    }

    @NotNull
    public final NotificationAdapter getNotificationAdapter() {
        NotificationAdapter notificationAdapter2 = this.notificationAdapter;
        if (notificationAdapter2 != null) {
            return notificationAdapter2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationAdapter");
        return null;
    }

    @NotNull
    public final TextView getNotificationEmptyView() {
        TextView textView = this.notificationEmptyView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationEmptyView");
        return null;
    }

    @Nullable
    public final NotificationActivity getParentActivity() {
        return this.parentActivity;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final SwipeRefreshLayout getSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            return swipeRefreshLayout2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        return null;
    }

    public final void hideSelected() {
        this.selected = false;
        getSwipeRefreshLayout().setEnabled(true);
        for (NotiTitle select : this.groupList) {
            select.setSelect(0);
        }
        for (Pair pair : this.checkedList) {
            ((NotificationBean) getChildList().get(((Number) pair.getFirst()).intValue()).get(((Number) pair.getSecond()).intValue())).setSelect(0);
        }
        for (ArrayList<NotificationBean> it : this.childList) {
            for (NotificationBean select2 : it) {
                select2.setSelect(0);
            }
        }
        this.checkedList.clear();
        refreshAdapter();
    }

    public void initWidgets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        EventBus.getDefault().register(this);
        setNotificationAdapter(new NotificationAdapter(this.groupList, this.childList));
        getExpandableListView().setAdapter(getNotificationAdapter());
        this.footerView = LayoutInflater.from(getActivity()).inflate(R$layout.notification_footer_view, (ViewGroup) null);
        queryData(this.firstLoadCounts);
    }

    public final boolean isHideSelectText() {
        return !this.groupList.isEmpty();
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public void onAttach(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        super.onAttach(activity);
        if (activity instanceof NotificationActivity) {
            this.parentActivity = (NotificationActivity) activity;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
        if (Intrinsics.areEqual(obj, (Object) 104)) {
            queryData(this.firstLoadCounts);
        } else if (Intrinsics.areEqual(obj, (Object) Integer.valueOf(EventBusConstKt.NOT_MORE))) {
            notMore();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onGetMessage(@NotNull GetMessage getMessage) {
        Intrinsics.checkNotNullParameter(getMessage, "zoneWineBindEvent");
        queryData(this.firstLoadCounts);
        if (this.isLoading) {
            loadMore(this.loadMoreCounts);
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            queryData(this.firstLoadCounts);
        }
    }

    public final void setCheckedList(@NotNull ArrayList<Pair<Integer, Integer>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.checkedList = arrayList;
    }

    public final void setChildList(@NotNull ArrayList<ArrayList<NotificationBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.childList = arrayList;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final void setCurrentFragmentIndex(int i) {
        this.currentFragmentIndex = i;
    }

    public final void setExpandableListView(@NotNull ExpandableListView expandableListView2) {
        Intrinsics.checkNotNullParameter(expandableListView2, "<set-?>");
        this.expandableListView = expandableListView2;
    }

    public final void setFooterView(@Nullable View view) {
        this.footerView = view;
    }

    public final void setGroupList(@NotNull ArrayList<NotiTitle> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.groupList = arrayList;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setItemChecked(int i, int i2) {
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = 0;
        if (!this.checkedList.contains(pair)) {
            ((NotificationBean) this.childList.get(i).get(i2)).setSelect(1);
            this.checkedList.add(pair);
        } else {
            ((NotificationBean) this.childList.get(i).get(i2)).setSelect(0);
            this.checkedList.remove(pair);
        }
        int size = this.childList.get(i).size();
        while (true) {
            if (i3 >= size) {
                break;
            }
            int i4 = i3 + 1;
            this.lv_selected.set(i, Boolean.TRUE);
            Integer select = ((NotificationBean) this.childList.get(i).get(i3)).getSelect();
            if (select != null && select.intValue() == 0) {
                this.lv_selected.set(i, Boolean.FALSE);
                break;
            }
            i3 = i4;
        }
        NotificationActivity notificationActivity = this.parentActivity;
        if (notificationActivity != null) {
            notificationActivity.logSelectCount(this.checkedList.size());
        }
        refreshAdapter();
    }

    public final void setList1(@NotNull ArrayList<NotificationBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list1 = arrayList;
    }

    public final void setList2(@NotNull ArrayList<NotificationBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list2 = arrayList;
    }

    public final void setList3(@NotNull ArrayList<NotificationBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list3 = arrayList;
    }

    public final void setList_day(@NotNull List<NotificationBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list_day = list;
    }

    public final void setList_month(@NotNull List<NotificationBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list_month = list;
    }

    public final void setList_week(@NotNull List<NotificationBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list_week = list;
    }

    public void setListeners() {
        View view = this.footerView;
        if (view != null) {
            JuConnectExtKt.singleClickListener(view, new NotificationBaseFragment$setListeners$1$1(this));
        }
        getExpandableListView().setOnGroupClickListener(C7540f.f14239a);
        getExpandableListView().setOnChildClickListener(new C7543i(this));
        getNotificationAdapter().setSelectClickListener(new NotificationBaseFragment$setListeners$4(this));
        getNotificationAdapter().setDeleteClickListener(new NotificationBaseFragment$setListeners$5(this));
        getExpandableListView().setOnScrollListener(new NotificationBaseFragment$setListeners$6(this));
        getSwipeRefreshLayout().setOnRefreshListener(new C7539e(this));
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setLv_selected(@NotNull ArrayList<Boolean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.lv_selected = arrayList;
    }

    public final void setNotMore(boolean z) {
        this.notMore = z;
    }

    public final void setNotificationAdapter(@NotNull NotificationAdapter notificationAdapter2) {
        Intrinsics.checkNotNullParameter(notificationAdapter2, "<set-?>");
        this.notificationAdapter = notificationAdapter2;
    }

    public final void setNotificationEmptyView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.notificationEmptyView = textView;
    }

    public final void setParentActivity(@Nullable NotificationActivity notificationActivity) {
        this.parentActivity = notificationActivity;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setSwipeRefreshLayout(@NotNull SwipeRefreshLayout swipeRefreshLayout2) {
        Intrinsics.checkNotNullParameter(swipeRefreshLayout2, "<set-?>");
        this.swipeRefreshLayout = swipeRefreshLayout2;
    }

    public final void showSelected() {
        this.selected = true;
        getSwipeRefreshLayout().setEnabled(false);
        for (NotiTitle select : this.groupList) {
            select.setSelect(1);
        }
        refreshAdapter();
    }
}
