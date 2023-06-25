package com.hisense.juconnect.app_device.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/HumitureListAdapter;", "Landroid/widget/BaseAdapter;", "zone", "", "(I)V", "dataList", "", "Lkotlin/Pair;", "", "getZone", "()I", "getCount", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "refreshData", "", "HumitureHolder", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HumitureListAdapter.kt */
public final class HumitureListAdapter extends BaseAdapter {
    @NotNull
    public List<Pair<String, String>> dataList = CollectionsKt__CollectionsKt.emptyList();
    public final int zone;

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/adapter/HumitureListAdapter$HumitureHolder;", "", "view", "Landroid/view/View;", "zone", "", "(Landroid/view/View;I)V", "str", "Landroid/widget/TextView;", "getStr", "()Landroid/widget/TextView;", "setStr", "(Landroid/widget/TextView;)V", "temperatureUnitStr", "getTemperatureUnitStr", "setTemperatureUnitStr", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HumitureListAdapter.kt */
    public static final class HumitureHolder {
        @NotNull
        public TextView str;
        @NotNull
        public TextView temperatureUnitStr;
        @NotNull
        public View view;

        public HumitureHolder(@NotNull View view2, int i) {
            TextView textView;
            TextView textView2;
            Intrinsics.checkNotNullParameter(view2, "view");
            this.view = view2;
            if (i == 1) {
                View findViewById = view2.findViewById(R$id.item_zone_tv);
                Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.item_zone_tv)");
                textView = (TextView) findViewById;
            } else if (i != 2) {
                View findViewById2 = view2.findViewById(R$id.item_humidity_tv);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.item_humidity_tv)");
                textView = (TextView) findViewById2;
            } else {
                View findViewById3 = view2.findViewById(R$id.temperature_unit);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.temperature_unit)");
                textView = (TextView) findViewById3;
            }
            this.temperatureUnitStr = textView;
            if (i == 1) {
                View findViewById4 = this.view.findViewById(R$id.item_zone_tv);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.item_zone_tv)");
                textView2 = (TextView) findViewById4;
            } else if (i != 2) {
                View findViewById5 = this.view.findViewById(R$id.item_humidity_tv);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.item_humidity_tv)");
                textView2 = (TextView) findViewById5;
            } else {
                View findViewById6 = this.view.findViewById(R$id.item_temperature_tv);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.item_temperature_tv)");
                textView2 = (TextView) findViewById6;
            }
            this.str = textView2;
        }

        @NotNull
        public final TextView getStr() {
            return this.str;
        }

        @NotNull
        public final TextView getTemperatureUnitStr() {
            return this.temperatureUnitStr;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setStr(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.str = textView;
        }

        public final void setTemperatureUnitStr(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.temperatureUnitStr = textView;
        }

        public final void setView(@NotNull View view2) {
            Intrinsics.checkNotNullParameter(view2, "<set-?>");
            this.view = view2;
        }
    }

    public HumitureListAdapter(int i) {
        this.zone = i;
    }

    public int getCount() {
        return this.dataList.size();
    }

    @NotNull
    public Object getItem(int i) {
        return this.dataList.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @NotNull
    public View getView(int i, @Nullable View view, @Nullable ViewGroup viewGroup) {
        HumitureHolder humitureHolder;
        Context context;
        Context context2;
        Context context3;
        if (view == null) {
            int i2 = this.zone;
            if (i2 == 1) {
                if (viewGroup == null) {
                    context = null;
                } else {
                    context = viewGroup.getContext();
                }
                view = View.inflate(context, R$layout.item_zone, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(view, "inflate(parent?.context, R.layout.item_zone, null)");
            } else if (i2 != 2) {
                if (viewGroup == null) {
                    context3 = null;
                } else {
                    context3 = viewGroup.getContext();
                }
                view = View.inflate(context3, R$layout.item_humidity, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(view, "inflate(parent?.context,…yout.item_humidity, null)");
            } else {
                if (viewGroup == null) {
                    context2 = null;
                } else {
                    context2 = viewGroup.getContext();
                }
                view = View.inflate(context2, R$layout.item_temperature, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(view, "inflate(parent?.context,…t.item_temperature, null)");
            }
            int i3 = this.zone;
            if (i3 == 1) {
                humitureHolder = new HumitureHolder(view, i3);
            } else if (i3 == 1) {
                humitureHolder = new HumitureHolder(view, i3);
            } else {
                humitureHolder = new HumitureHolder(view, i3);
            }
            view.setTag(humitureHolder);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                humitureHolder = (HumitureHolder) tag;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.hisense.juconnect.app_device.adapter.HumitureListAdapter.HumitureHolder");
            }
        }
        humitureHolder.getStr().setText((CharSequence) this.dataList.get(i).getFirst());
        if (this.zone == 2 && humitureHolder.getTemperatureUnitStr() != null) {
            if (Intrinsics.areEqual(this.dataList.get(i).getSecond(), (Object) "0")) {
                humitureHolder.getTemperatureUnitStr().setText("℃");
            } else {
                humitureHolder.getTemperatureUnitStr().setText("℉");
            }
        }
        return view;
    }

    public final int getZone() {
        return this.zone;
    }

    public final void refreshData(@NotNull List<Pair<String, String>> list) {
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.dataList = list;
        notifyDataSetChanged();
    }
}
