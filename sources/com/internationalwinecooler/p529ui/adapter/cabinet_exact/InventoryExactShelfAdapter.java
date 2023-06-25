package com.internationalwinecooler.p529ui.adapter.cabinet_exact;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.AutoScrollHelper;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.websocket.WebSocketHandler;
import com.hisense.connect_life.core.utils.Holder;
import com.hisense.connect_life.core.widget.InventoryExactPositionTextView;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.juconnect.connect_life.R$id;
import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p482v.p483a.p484d.p485a.C7597a;
import p040c.p482v.p483a.p484d.p485a.C7598b;
import p040c.p482v.p483a.p484d.p485a.C7599c;

@Metadata(mo47990d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0006H\u0017J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000bJ0\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002J0\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u00100\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J0\u00101\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u00102\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u00103\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0014\u00104\u001a\u00020\u0018*\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00065"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/adapter/cabinet_exact/InventoryExactShelfAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/hisense/connect_life/core/utils/Holder;", "context", "Landroid/content/Context;", "zoneType", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "dataList", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "mContext", "prelongTim", "", "getPrelongTim", "()J", "setPrelongTim", "(J)V", "getZoneType", "()I", "getItemCount", "initWineState", "", "holder", "isFristClick", "", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "setExactWineInfo", "cuBlackResId", "cuGreenResId", "textColor", "textView", "Lcom/hisense/connect_life/core/widget/InventoryExactPositionTextView;", "wineInventoryBean", "setExactWineInfoA1", "setItemView", "setItemViewc5", "setNoWinePositionShow", "setNoWinePositionShows", "setOffstageOnItemView", "setOffstageOnPositionShows", "setTwoExactWineInfoA1", "setTwoItemView", "setTwoNoWinePositionShows", "setLick", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.adapter.cabinet_exact.InventoryExactShelfAdapter */
/* compiled from: InventoryExactShelfAdapter.kt */
public final class InventoryExactShelfAdapter extends RecyclerView.Adapter<Holder> {
    @NotNull
    public final Context context;
    public List<? extends List<WineInventoryBean>> dataList;
    @NotNull
    public final Context mContext;
    public long prelongTim;
    public final int zoneType;

    public InventoryExactShelfAdapter(@NotNull Context context2, int i) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.zoneType = i;
        this.mContext = context2;
    }

    private final void initWineState(Holder holder) {
        Holder holder2 = holder;
        InventoryExactPositionTextView inventoryExactPositionTextView = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f1);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView, "holder.itemView.text_f1");
        setNoWinePositionShows(inventoryExactPositionTextView, 0);
        InventoryExactPositionTextView inventoryExactPositionTextView2 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f2);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView2, "holder.itemView.text_f2");
        setNoWinePositionShows(inventoryExactPositionTextView2, 1);
        InventoryExactPositionTextView inventoryExactPositionTextView3 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView3, "holder.itemView.text_f3");
        setNoWinePositionShows(inventoryExactPositionTextView3, 2);
        InventoryExactPositionTextView inventoryExactPositionTextView4 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView4, "holder.itemView.text_f4");
        setNoWinePositionShows(inventoryExactPositionTextView4, 3);
        InventoryExactPositionTextView inventoryExactPositionTextView5 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView5, "holder.itemView.text_f5");
        setNoWinePositionShows(inventoryExactPositionTextView5, 4);
        InventoryExactPositionTextView inventoryExactPositionTextView6 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView6, "holder.itemView.text_f6");
        setNoWinePositionShows(inventoryExactPositionTextView6, 5);
        InventoryExactPositionTextView inventoryExactPositionTextView7 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_f7);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView7, "holder.itemView.text_f7");
        setNoWinePositionShows(inventoryExactPositionTextView7, 6);
        InventoryExactPositionTextView inventoryExactPositionTextView8 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b1);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView8, "holder.itemView.text_b1");
        setNoWinePositionShows(inventoryExactPositionTextView8, 7);
        InventoryExactPositionTextView inventoryExactPositionTextView9 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b2);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView9, "holder.itemView.text_b2");
        setNoWinePositionShows(inventoryExactPositionTextView9, 8);
        InventoryExactPositionTextView inventoryExactPositionTextView10 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView10, "holder.itemView.text_b3");
        setNoWinePositionShows(inventoryExactPositionTextView10, 9);
        InventoryExactPositionTextView inventoryExactPositionTextView11 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView11, "holder.itemView.text_b4");
        setNoWinePositionShows(inventoryExactPositionTextView11, 10);
        InventoryExactPositionTextView inventoryExactPositionTextView12 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView12, "holder.itemView.text_b5");
        setNoWinePositionShows(inventoryExactPositionTextView12, 11);
        InventoryExactPositionTextView inventoryExactPositionTextView13 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_b6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView13, "holder.itemView.text_b6");
        setNoWinePositionShows(inventoryExactPositionTextView13, 12);
        InventoryExactPositionTextView inventoryExactPositionTextView14 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c1);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView14, "holder.itemView.text_c1");
        setNoWinePositionShow(inventoryExactPositionTextView14, 0);
        InventoryExactPositionTextView inventoryExactPositionTextView15 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c2);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView15, "holder.itemView.text_c2");
        setNoWinePositionShow(inventoryExactPositionTextView15, 1);
        InventoryExactPositionTextView inventoryExactPositionTextView16 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView16, "holder.itemView.text_c3");
        setNoWinePositionShow(inventoryExactPositionTextView16, 2);
        InventoryExactPositionTextView inventoryExactPositionTextView17 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView17, "holder.itemView.text_c4");
        setNoWinePositionShow(inventoryExactPositionTextView17, 3);
        InventoryExactPositionTextView inventoryExactPositionTextView18 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView18, "holder.itemView.text_c5");
        setNoWinePositionShow(inventoryExactPositionTextView18, 4);
        InventoryExactPositionTextView inventoryExactPositionTextView19 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView19, "holder.itemView.text_c6");
        setNoWinePositionShow(inventoryExactPositionTextView19, 5);
        InventoryExactPositionTextView inventoryExactPositionTextView20 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c7);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView20, "holder.itemView.text_c7");
        setNoWinePositionShow(inventoryExactPositionTextView20, 6);
        InventoryExactPositionTextView inventoryExactPositionTextView21 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c8);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView21, "holder.itemView.text_c8");
        setNoWinePositionShow(inventoryExactPositionTextView21, 7);
        InventoryExactPositionTextView inventoryExactPositionTextView22 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c9);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView22, "holder.itemView.text_c9");
        setNoWinePositionShow(inventoryExactPositionTextView22, 8);
        InventoryExactPositionTextView inventoryExactPositionTextView23 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c10);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView23, "holder.itemView.text_c10");
        setNoWinePositionShow(inventoryExactPositionTextView23, 9);
        InventoryExactPositionTextView inventoryExactPositionTextView24 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c11);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView24, "holder.itemView.text_c11");
        setNoWinePositionShow(inventoryExactPositionTextView24, 10);
        InventoryExactPositionTextView inventoryExactPositionTextView25 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c12);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView25, "holder.itemView.text_c12");
        setNoWinePositionShow(inventoryExactPositionTextView25, 11);
        InventoryExactPositionTextView inventoryExactPositionTextView26 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c13);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView26, "holder.itemView.text_c13");
        setNoWinePositionShow(inventoryExactPositionTextView26, 12);
        InventoryExactPositionTextView inventoryExactPositionTextView27 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c14);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView27, "holder.itemView.text_c14");
        setNoWinePositionShow(inventoryExactPositionTextView27, 13);
        InventoryExactPositionTextView inventoryExactPositionTextView28 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c15);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView28, "holder.itemView.text_c15");
        setNoWinePositionShow(inventoryExactPositionTextView28, 14);
        InventoryExactPositionTextView inventoryExactPositionTextView29 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c16);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView29, "holder.itemView.text_c16");
        setNoWinePositionShow(inventoryExactPositionTextView29, 15);
        InventoryExactPositionTextView inventoryExactPositionTextView30 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c17);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView30, "holder.itemView.text_c17");
        setNoWinePositionShow(inventoryExactPositionTextView30, 16);
        InventoryExactPositionTextView inventoryExactPositionTextView31 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c18);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView31, "holder.itemView.text_c18");
        setNoWinePositionShow(inventoryExactPositionTextView31, 17);
        InventoryExactPositionTextView inventoryExactPositionTextView32 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c19);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView32, "holder.itemView.text_c19");
        setNoWinePositionShow(inventoryExactPositionTextView32, 18);
        InventoryExactPositionTextView inventoryExactPositionTextView33 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c20);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView33, "holder.itemView.text_c20");
        setNoWinePositionShow(inventoryExactPositionTextView33, 19);
        InventoryExactPositionTextView inventoryExactPositionTextView34 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c21);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView34, "holder.itemView.text_c21");
        setNoWinePositionShow(inventoryExactPositionTextView34, 20);
        InventoryExactPositionTextView inventoryExactPositionTextView35 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c22);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView35, "holder.itemView.text_c22");
        setNoWinePositionShow(inventoryExactPositionTextView35, 21);
        InventoryExactPositionTextView inventoryExactPositionTextView36 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c23);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView36, "holder.itemView.text_c23");
        setNoWinePositionShow(inventoryExactPositionTextView36, 22);
        InventoryExactPositionTextView inventoryExactPositionTextView37 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c24);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView37, "holder.itemView.text_c24");
        setNoWinePositionShow(inventoryExactPositionTextView37, 23);
        InventoryExactPositionTextView inventoryExactPositionTextView38 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c25);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView38, "holder.itemView.text_c25");
        setNoWinePositionShow(inventoryExactPositionTextView38, 24);
        InventoryExactPositionTextView inventoryExactPositionTextView39 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c26);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView39, "holder.itemView.text_c26");
        setNoWinePositionShow(inventoryExactPositionTextView39, 25);
        InventoryExactPositionTextView inventoryExactPositionTextView40 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c27);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView40, "holder.itemView.text_c27");
        setNoWinePositionShow(inventoryExactPositionTextView40, 26);
        InventoryExactPositionTextView inventoryExactPositionTextView41 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c28);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView41, "holder.itemView.text_c28");
        setNoWinePositionShow(inventoryExactPositionTextView41, 27);
        InventoryExactPositionTextView inventoryExactPositionTextView42 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c29);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView42, "holder.itemView.text_c29");
        setNoWinePositionShow(inventoryExactPositionTextView42, 28);
        InventoryExactPositionTextView inventoryExactPositionTextView43 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c30);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView43, "holder.itemView.text_c30");
        setNoWinePositionShow(inventoryExactPositionTextView43, 29);
        InventoryExactPositionTextView inventoryExactPositionTextView44 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c31);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView44, "holder.itemView.text_c31");
        setNoWinePositionShow(inventoryExactPositionTextView44, 30);
        InventoryExactPositionTextView inventoryExactPositionTextView45 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c32);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView45, "holder.itemView.text_c32");
        setNoWinePositionShow(inventoryExactPositionTextView45, 31);
        InventoryExactPositionTextView inventoryExactPositionTextView46 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c33);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView46, "holder.itemView.text_c33");
        setNoWinePositionShow(inventoryExactPositionTextView46, 32);
        InventoryExactPositionTextView inventoryExactPositionTextView47 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c34);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView47, "holder.itemView.text_c34");
        setNoWinePositionShow(inventoryExactPositionTextView47, 33);
        InventoryExactPositionTextView inventoryExactPositionTextView48 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c35);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView48, "holder.itemView.text_c35");
        setNoWinePositionShow(inventoryExactPositionTextView48, 34);
        InventoryExactPositionTextView inventoryExactPositionTextView49 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.text_c36);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView49, "holder.itemView.text_c36");
        setNoWinePositionShow(inventoryExactPositionTextView49, 35);
        InventoryExactPositionTextView inventoryExactPositionTextView50 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_f3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView50, "holder.itemView.two_text_f3");
        setTwoNoWinePositionShows(inventoryExactPositionTextView50, 0);
        InventoryExactPositionTextView inventoryExactPositionTextView51 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_f4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView51, "holder.itemView.two_text_f4");
        setTwoNoWinePositionShows(inventoryExactPositionTextView51, 1);
        InventoryExactPositionTextView inventoryExactPositionTextView52 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_f5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView52, "holder.itemView.two_text_f5");
        setTwoNoWinePositionShows(inventoryExactPositionTextView52, 2);
        InventoryExactPositionTextView inventoryExactPositionTextView53 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_f6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView53, "holder.itemView.two_text_f6");
        setTwoNoWinePositionShows(inventoryExactPositionTextView53, 3);
        InventoryExactPositionTextView inventoryExactPositionTextView54 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_b3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView54, "holder.itemView.two_text_b3");
        setTwoNoWinePositionShows(inventoryExactPositionTextView54, 4);
        InventoryExactPositionTextView inventoryExactPositionTextView55 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_b4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView55, "holder.itemView.two_text_b4");
        setTwoNoWinePositionShows(inventoryExactPositionTextView55, 5);
        InventoryExactPositionTextView inventoryExactPositionTextView56 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_b5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView56, "holder.itemView.two_text_b5");
        setTwoNoWinePositionShows(inventoryExactPositionTextView56, 6);
        InventoryExactPositionTextView inventoryExactPositionTextView57 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.two_text_b6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView57, "holder.itemView.two_text_b6");
        setTwoNoWinePositionShows(inventoryExactPositionTextView57, 7);
        InventoryExactPositionTextView inventoryExactPositionTextView58 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView58, "holder.itemView.offstage_on_text_f3");
        setOffstageOnPositionShows(inventoryExactPositionTextView58, 0);
        InventoryExactPositionTextView inventoryExactPositionTextView59 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView59, "holder.itemView.offstage_on_text_f4");
        setOffstageOnPositionShows(inventoryExactPositionTextView59, 1);
        InventoryExactPositionTextView inventoryExactPositionTextView60 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView60, "holder.itemView.offstage_on_text_f5");
        setOffstageOnPositionShows(inventoryExactPositionTextView60, 2);
        InventoryExactPositionTextView inventoryExactPositionTextView61 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView61, "holder.itemView.offstage_on_text_f6");
        setOffstageOnPositionShows(inventoryExactPositionTextView61, 3);
        InventoryExactPositionTextView inventoryExactPositionTextView62 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b3);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView62, "holder.itemView.offstage_on_text_b3");
        setOffstageOnPositionShows(inventoryExactPositionTextView62, 4);
        InventoryExactPositionTextView inventoryExactPositionTextView63 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b4);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView63, "holder.itemView.offstage_on_text_b4");
        setOffstageOnPositionShows(inventoryExactPositionTextView63, 5);
        InventoryExactPositionTextView inventoryExactPositionTextView64 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b5);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView64, "holder.itemView.offstage_on_text_b5");
        setOffstageOnPositionShows(inventoryExactPositionTextView64, 6);
        InventoryExactPositionTextView inventoryExactPositionTextView65 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b6);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView65, "holder.itemView.offstage_on_text_b6");
        setOffstageOnPositionShows(inventoryExactPositionTextView65, 7);
        InventoryExactPositionTextView inventoryExactPositionTextView66 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f9);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView66, "holder.itemView.offstage_on_text_f9");
        setOffstageOnPositionShows(inventoryExactPositionTextView66, 8);
        InventoryExactPositionTextView inventoryExactPositionTextView67 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f10);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView67, "holder.itemView.offstage_on_text_f10");
        setOffstageOnPositionShows(inventoryExactPositionTextView67, 9);
        InventoryExactPositionTextView inventoryExactPositionTextView68 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_f11);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView68, "holder.itemView.offstage_on_text_f11");
        setOffstageOnPositionShows(inventoryExactPositionTextView68, 10);
        InventoryExactPositionTextView inventoryExactPositionTextView69 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b12);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView69, "holder.itemView.offstage_on_text_b12");
        setOffstageOnPositionShows(inventoryExactPositionTextView69, 11);
        InventoryExactPositionTextView inventoryExactPositionTextView70 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b13);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView70, "holder.itemView.offstage_on_text_b13");
        setOffstageOnPositionShows(inventoryExactPositionTextView70, 12);
        InventoryExactPositionTextView inventoryExactPositionTextView71 = (InventoryExactPositionTextView) holder2.itemView.findViewById(R$id.offstage_on_text_b14);
        Intrinsics.checkNotNullExpressionValue(inventoryExactPositionTextView71, "holder.itemView.offstage_on_text_b14");
        setOffstageOnPositionShows(inventoryExactPositionTextView71, 13);
    }

    private final boolean isFristClick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.prelongTim) < 500) {
            return true;
        }
        this.prelongTim = currentTimeMillis;
        return false;
    }

    private final void setExactWineInfo(int i, int i2, int i3, InventoryExactPositionTextView inventoryExactPositionTextView, WineInventoryBean wineInventoryBean) {
        inventoryExactPositionTextView.setHasWine(true);
        if (wineInventoryBean.isFavorite() != null) {
            Boolean isFavorite = wineInventoryBean.isFavorite();
            Intrinsics.checkNotNull(isFavorite);
            if (isFavorite.booleanValue()) {
                inventoryExactPositionTextView.setBackgroundResource(i2);
                inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(R.color.colorButton));
                inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
                inventoryExactPositionTextView.setOnClickListener(new C7598b(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
            }
        }
        inventoryExactPositionTextView.setBackgroundResource(i);
        inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(i3));
        inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
        inventoryExactPositionTextView.setOnClickListener(new C7598b(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
    }

    /* renamed from: setExactWineInfo$lambda-10$lambda-9  reason: not valid java name */
    public static final void m27179setExactWineInfo$lambda10$lambda9(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3, View view) {
        InventoryExactShelfAdapter inventoryExactShelfAdapter2 = inventoryExactShelfAdapter;
        InventoryExactPositionTextView inventoryExactPositionTextView3 = inventoryExactPositionTextView;
        InventoryExactPositionTextView inventoryExactPositionTextView4 = inventoryExactPositionTextView2;
        WineInventoryBean wineInventoryBean2 = wineInventoryBean;
        Intrinsics.checkNotNullParameter(inventoryExactShelfAdapter2, "this$0");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView3, "$textView");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView4, "$this_apply");
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "$wineInventoryBean");
        if (!inventoryExactShelfAdapter.isFristClick() && (inventoryExactShelfAdapter2.mContext instanceof InventoryMainActivity)) {
            inventoryExactPositionTextView3.setTextColor(inventoryExactPositionTextView2.getResources().getColor(R.color.white));
            if (wineInventoryBean.isFavorite() != null) {
                Boolean isFavorite = wineInventoryBean.isFavorite();
                Intrinsics.checkNotNull(isFavorite);
                if (isFavorite.booleanValue()) {
                    String exactPosition = wineInventoryBean.getExactPosition();
                    if (exactPosition != null) {
                        int hashCode = exactPosition.hashCode();
                        switch (hashCode) {
                            case 48:
                                if (exactPosition.equals("0")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 49:
                                if (exactPosition.equals("1")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 50:
                                if (exactPosition.equals("2")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 51:
                                if (exactPosition.equals("3")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 52:
                                if (exactPosition.equals("4")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 53:
                                if (exactPosition.equals("5")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 54:
                                if (exactPosition.equals("6")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 55:
                                if (exactPosition.equals("7")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 56:
                                if (exactPosition.equals("8")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 57:
                                if (exactPosition.equals(CrashDumperPlugin.OPTION_KILL_DEFAULT)) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite_selcted);
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1567:
                                        if (exactPosition.equals("10")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1568:
                                        if (exactPosition.equals("11")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1569:
                                        if (exactPosition.equals("12")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1570:
                                        if (exactPosition.equals(WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13)) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1571:
                                        if (exactPosition.equals("14")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1572:
                                        if (exactPosition.equals("15")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1573:
                                        if (exactPosition.equals("16")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1574:
                                        if (exactPosition.equals("17")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case AutoScrollHelper.DEFAULT_MAXIMUM_VELOCITY_DIPS:
                                        if (exactPosition.equals("18")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1576:
                                        if (exactPosition.equals("19")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1598:
                                                if (exactPosition.equals("20")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1599:
                                                if (exactPosition.equals("21")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1600:
                                                if (exactPosition.equals("22")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1601:
                                                if (exactPosition.equals("23")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1602:
                                                if (exactPosition.equals("24")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1603:
                                                if (exactPosition.equals("25")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1604:
                                                if (exactPosition.equals("26")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1605:
                                                if (exactPosition.equals("27")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1606:
                                                if (exactPosition.equals("28")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1607:
                                                if (exactPosition.equals("29")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 1629:
                                                        if (exactPosition.equals("30")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                    case 1630:
                                                        if (exactPosition.equals("31")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                    case 1631:
                                                        if (exactPosition.equals("32")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                    case 1632:
                                                        if (exactPosition.equals("33")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                    case 1633:
                                                        if (exactPosition.equals("34")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                    case 1634:
                                                        if (exactPosition.equals("35")) {
                                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                                            break;
                                                        }
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    ((InventoryMainActivity) inventoryExactShelfAdapter2.mContext).showWineDetail(wineInventoryBean2, new InventoryExactShelfAdapter$setExactWineInfo$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
                }
            }
            String exactPosition2 = wineInventoryBean.getExactPosition();
            if (exactPosition2 != null) {
                int hashCode2 = exactPosition2.hashCode();
                switch (hashCode2) {
                    case 48:
                        if (exactPosition2.equals("0")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_selcted);
                            break;
                        }
                        break;
                    case 49:
                        if (exactPosition2.equals("1")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_selcted);
                            break;
                        }
                        break;
                    case 50:
                        if (exactPosition2.equals("2")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                            break;
                        }
                        break;
                    case 51:
                        if (exactPosition2.equals("3")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                            break;
                        }
                        break;
                    case 52:
                        if (exactPosition2.equals("4")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                            break;
                        }
                        break;
                    case 53:
                        if (exactPosition2.equals("5")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                            break;
                        }
                        break;
                    case 54:
                        if (exactPosition2.equals("6")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                            break;
                        }
                        break;
                    case 55:
                        if (exactPosition2.equals("7")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                            break;
                        }
                        break;
                    case 56:
                        if (exactPosition2.equals("8")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                            break;
                        }
                        break;
                    case 57:
                        if (exactPosition2.equals(CrashDumperPlugin.OPTION_KILL_DEFAULT)) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_selcted);
                            break;
                        }
                        break;
                    default:
                        switch (hashCode2) {
                            case 1567:
                                if (exactPosition2.equals("10")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_selcted);
                                    break;
                                }
                                break;
                            case 1568:
                                if (exactPosition2.equals("11")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                                    break;
                                }
                                break;
                            case 1569:
                                if (exactPosition2.equals("12")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                                    break;
                                }
                                break;
                            case 1570:
                                if (exactPosition2.equals(WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13)) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                                    break;
                                }
                                break;
                            case 1571:
                                if (exactPosition2.equals("14")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                                    break;
                                }
                                break;
                            case 1572:
                                if (exactPosition2.equals("15")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                                    break;
                                }
                                break;
                            case 1573:
                                if (exactPosition2.equals("16")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                                    break;
                                }
                                break;
                            case 1574:
                                if (exactPosition2.equals("17")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                                    break;
                                }
                                break;
                            case AutoScrollHelper.DEFAULT_MAXIMUM_VELOCITY_DIPS:
                                if (exactPosition2.equals("18")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_selcted);
                                    break;
                                }
                                break;
                            case 1576:
                                if (exactPosition2.equals("19")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_selcted);
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode2) {
                                    case 1598:
                                        if (exactPosition2.equals("20")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                                            break;
                                        }
                                        break;
                                    case 1599:
                                        if (exactPosition2.equals("21")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                                            break;
                                        }
                                        break;
                                    case 1600:
                                        if (exactPosition2.equals("22")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                                            break;
                                        }
                                        break;
                                    case 1601:
                                        if (exactPosition2.equals("23")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                                            break;
                                        }
                                        break;
                                    case 1602:
                                        if (exactPosition2.equals("24")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                                            break;
                                        }
                                        break;
                                    case 1603:
                                        if (exactPosition2.equals("25")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                                            break;
                                        }
                                        break;
                                    case 1604:
                                        if (exactPosition2.equals("26")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                                            break;
                                        }
                                        break;
                                    case 1605:
                                        if (exactPosition2.equals("27")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_selcted);
                                            break;
                                        }
                                        break;
                                    case 1606:
                                        if (exactPosition2.equals("28")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_selcted);
                                            break;
                                        }
                                        break;
                                    case 1607:
                                        if (exactPosition2.equals("29")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode2) {
                                            case 1629:
                                                if (exactPosition2.equals("30")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1630:
                                                if (exactPosition2.equals("31")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1631:
                                                if (exactPosition2.equals("32")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1632:
                                                if (exactPosition2.equals("33")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1633:
                                                if (exactPosition2.equals("34")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                                                    break;
                                                }
                                                break;
                                            case 1634:
                                                if (exactPosition2.equals("35")) {
                                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                }
            }
            ((InventoryMainActivity) inventoryExactShelfAdapter2.mContext).showWineDetail(wineInventoryBean2, new InventoryExactShelfAdapter$setExactWineInfo$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
        }
    }

    private final void setExactWineInfoA1(int i, int i2, int i3, InventoryExactPositionTextView inventoryExactPositionTextView, WineInventoryBean wineInventoryBean) {
        inventoryExactPositionTextView.setHasWine(true);
        if (wineInventoryBean.isFavorite() != null) {
            Boolean isFavorite = wineInventoryBean.isFavorite();
            Intrinsics.checkNotNull(isFavorite);
            if (isFavorite.booleanValue()) {
                inventoryExactPositionTextView.setBackgroundResource(i2);
                inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(R.color.colorButton));
                inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
                inventoryExactPositionTextView.setOnClickListener(new C7597a(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
            }
        }
        inventoryExactPositionTextView.setBackgroundResource(i);
        inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(i3));
        inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
        inventoryExactPositionTextView.setOnClickListener(new C7597a(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
    }

    /* renamed from: setExactWineInfoA1$lambda-12$lambda-11  reason: not valid java name */
    public static final void m27180setExactWineInfoA1$lambda12$lambda11(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3, View view) {
        InventoryExactShelfAdapter inventoryExactShelfAdapter2 = inventoryExactShelfAdapter;
        InventoryExactPositionTextView inventoryExactPositionTextView3 = inventoryExactPositionTextView;
        InventoryExactPositionTextView inventoryExactPositionTextView4 = inventoryExactPositionTextView2;
        WineInventoryBean wineInventoryBean2 = wineInventoryBean;
        Intrinsics.checkNotNullParameter(inventoryExactShelfAdapter2, "this$0");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView3, "$textView");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView4, "$this_apply");
        Intrinsics.checkNotNullParameter(wineInventoryBean2, "$wineInventoryBean");
        if (!inventoryExactShelfAdapter.isFristClick() && (inventoryExactShelfAdapter2.mContext instanceof InventoryMainActivity)) {
            inventoryExactPositionTextView3.setTextColor(inventoryExactPositionTextView2.getResources().getColor(R.color.white));
            Object obj = "1";
            if (wineInventoryBean.isFavorite() != null) {
                Boolean isFavorite = wineInventoryBean.isFavorite();
                Intrinsics.checkNotNull(isFavorite);
                if (isFavorite.booleanValue()) {
                    inventoryExactShelfAdapter2.setLick(inventoryExactPositionTextView4, wineInventoryBean2);
                    String exactPosition = wineInventoryBean.getExactPosition();
                    if (exactPosition != null) {
                        int hashCode = exactPosition.hashCode();
                        switch (hashCode) {
                            case 48:
                                if (exactPosition.equals("0")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r1_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 49:
                                if (exactPosition.equals(obj)) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 50:
                                if (exactPosition.equals("2")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 51:
                                if (exactPosition.equals("3")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 52:
                                if (exactPosition.equals("4")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 53:
                                if (exactPosition.equals("5")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 54:
                                if (exactPosition.equals("6")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r7_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 55:
                                if (exactPosition.equals("7")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r1_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 56:
                                if (exactPosition.equals("8")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 57:
                                if (exactPosition.equals(CrashDumperPlugin.OPTION_KILL_DEFAULT)) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1567:
                                        if (exactPosition.equals("10")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1568:
                                        if (exactPosition.equals("11")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                    case 1569:
                                        if (exactPosition.equals("12")) {
                                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r6_full_favourite_selcted);
                                            break;
                                        }
                                        break;
                                }
                        }
                    }
                    ((InventoryMainActivity) inventoryExactShelfAdapter2.mContext).showWineDetail(wineInventoryBean, new InventoryExactShelfAdapter$setExactWineInfoA1$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
                }
            }
            Object obj2 = obj;
            String exactPosition2 = wineInventoryBean.getExactPosition();
            if (exactPosition2 != null) {
                int hashCode2 = exactPosition2.hashCode();
                switch (hashCode2) {
                    case 48:
                        if (exactPosition2.equals("0")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r1_selcted);
                            break;
                        }
                        break;
                    case 49:
                        if (exactPosition2.equals(obj2)) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r2_selcted);
                            break;
                        }
                        break;
                    case 50:
                        if (exactPosition2.equals("2")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                            break;
                        }
                        break;
                    case 51:
                        if (exactPosition2.equals("3")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                            break;
                        }
                        break;
                    case 52:
                        if (exactPosition2.equals("4")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                            break;
                        }
                        break;
                    case 53:
                        if (exactPosition2.equals("5")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                            break;
                        }
                        break;
                    case 54:
                        if (exactPosition2.equals("6")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_down_r7_selcted);
                            break;
                        }
                        break;
                    case 55:
                        if (exactPosition2.equals("7")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r1_selcted);
                            break;
                        }
                        break;
                    case 56:
                        if (exactPosition2.equals("8")) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r2_selcted);
                            break;
                        }
                        break;
                    case 57:
                        if (exactPosition2.equals(CrashDumperPlugin.OPTION_KILL_DEFAULT)) {
                            inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                            break;
                        }
                        break;
                    default:
                        switch (hashCode2) {
                            case 1567:
                                if (exactPosition2.equals("10")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                                    break;
                                }
                                break;
                            case 1568:
                                if (exactPosition2.equals("11")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                                    break;
                                }
                                break;
                            case 1569:
                                if (exactPosition2.equals("12")) {
                                    inventoryExactPositionTextView4.setBackgroundResource(R.mipmap.bottle_up_r6_selcted);
                                    break;
                                }
                                break;
                        }
                }
            }
            ((InventoryMainActivity) inventoryExactShelfAdapter2.mContext).showWineDetail(wineInventoryBean, new InventoryExactShelfAdapter$setExactWineInfoA1$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r20 = r1;
        r21 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0282, code lost:
        r18 = com.hisense.juconnect.connectlife.R.color.colorBlack;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ab, code lost:
        if (r8.equals("11") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02b3, code lost:
        if (r8.equals("10") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ba, code lost:
        if (r8.equals(com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin.OPTION_KILL_DEFAULT) == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c1, code lost:
        if (r8.equals("8") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c8, code lost:
        if (r8.equals("7") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cf, code lost:
        if (r8.equals("6") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02d6, code lost:
        if (r8.equals("5") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02dd, code lost:
        if (r8.equals("4") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r1_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r7_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        r20 = r1;
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        r21 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
        r21 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r2_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0140, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setItemView(com.hisense.connect_life.core.utils.Holder r26, com.juconnect.connectlife.model.WineInventoryBean r27) {
        /*
            r25 = this;
            r0 = r26
            boolean r1 = r27.isFilteredOut()
            java.lang.String r9 = "12"
            java.lang.String r10 = "11"
            java.lang.String r11 = "10"
            java.lang.String r12 = "9"
            java.lang.String r13 = "8"
            java.lang.String r14 = "7"
            java.lang.String r15 = "6"
            java.lang.String r2 = "5"
            java.lang.String r3 = "4"
            java.lang.String r4 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "0"
            r18 = 2131034191(0x7f05004f, float:1.7678893E38)
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = r27.getExactPosition()
            if (r1 == 0) goto L_0x0108
            int r19 = r1.hashCode()
            switch(r19) {
                case 48: goto L_0x0104;
                case 49: goto L_0x00f3;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00cf;
                case 52: goto L_0x00bd;
                case 53: goto L_0x00af;
                case 54: goto L_0x00a0;
                case 55: goto L_0x0091;
                case 56: goto L_0x0082;
                case 57: goto L_0x0073;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r19) {
                case 1567: goto L_0x0064;
                case 1568: goto L_0x0054;
                case 1569: goto L_0x003c;
                default: goto L_0x0035;
            }
        L_0x0035:
            r1 = 2131623939(0x7f0e0003, float:1.8875044E38)
            r17 = 2131623940(0x7f0e0004, float:1.8875046E38)
            goto L_0x004c
        L_0x003c:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0044
            goto L_0x0108
        L_0x0044:
            r1 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r8 = 2131624000(0x7f0e0040, float:1.8875167E38)
            r17 = r8
        L_0x004c:
            r20 = r1
            r21 = r17
        L_0x0050:
            r22 = r18
            goto L_0x0310
        L_0x0054:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x005c
            goto L_0x0108
        L_0x005c:
            r1 = 2131623994(0x7f0e003a, float:1.8875155E38)
        L_0x005f:
            r8 = 2131623995(0x7f0e003b, float:1.8875157E38)
            goto L_0x00ca
        L_0x0064:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x006c
            goto L_0x0108
        L_0x006c:
            r1 = 2131623989(0x7f0e0035, float:1.8875145E38)
        L_0x006f:
            r8 = 2131623990(0x7f0e0036, float:1.8875147E38)
            goto L_0x00ca
        L_0x0073:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x007b
            goto L_0x0108
        L_0x007b:
            r1 = 2131623984(0x7f0e0030, float:1.8875135E38)
        L_0x007e:
            r8 = 2131623985(0x7f0e0031, float:1.8875137E38)
            goto L_0x00ca
        L_0x0082:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x008a
            goto L_0x0108
        L_0x008a:
            r1 = 2131623979(0x7f0e002b, float:1.8875125E38)
        L_0x008d:
            r8 = 2131623980(0x7f0e002c, float:1.8875127E38)
            goto L_0x00ca
        L_0x0091:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0099
            goto L_0x0108
        L_0x0099:
            r1 = 2131623974(0x7f0e0026, float:1.8875115E38)
        L_0x009c:
            r8 = 2131623975(0x7f0e0027, float:1.8875117E38)
            goto L_0x00ca
        L_0x00a0:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00a8
            goto L_0x0108
        L_0x00a8:
            r1 = 2131623969(0x7f0e0021, float:1.8875104E38)
        L_0x00ab:
            r8 = 2131623970(0x7f0e0022, float:1.8875107E38)
            goto L_0x00ca
        L_0x00af:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b6
            goto L_0x0108
        L_0x00b6:
            r1 = 2131623964(0x7f0e001c, float:1.8875094E38)
        L_0x00b9:
            r8 = 2131623965(0x7f0e001d, float:1.8875096E38)
            goto L_0x00ca
        L_0x00bd:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00c4
            goto L_0x0108
        L_0x00c4:
            r1 = 2131623959(0x7f0e0017, float:1.8875084E38)
        L_0x00c7:
            r8 = 2131623960(0x7f0e0018, float:1.8875086E38)
        L_0x00ca:
            r20 = r1
            r21 = r8
            goto L_0x0050
        L_0x00cf:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d6
            goto L_0x0108
        L_0x00d6:
            r1 = 2131623955(0x7f0e0013, float:1.8875076E38)
            r21 = r1
            r22 = r18
            r20 = 2131623954(0x7f0e0012, float:1.8875074E38)
            goto L_0x0310
        L_0x00e2:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00e9
            goto L_0x0108
        L_0x00e9:
            r22 = r18
            r20 = 2131623949(0x7f0e000d, float:1.8875064E38)
        L_0x00ee:
            r21 = 2131623950(0x7f0e000e, float:1.8875066E38)
            goto L_0x0310
        L_0x00f3:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            goto L_0x0108
        L_0x00fa:
            r22 = r18
            r20 = 2131623944(0x7f0e0008, float:1.8875054E38)
        L_0x00ff:
            r21 = 2131623945(0x7f0e0009, float:1.8875056E38)
            goto L_0x0310
        L_0x0104:
            boolean r1 = r1.equals(r7)
        L_0x0108:
            r22 = r18
            r20 = 2131623939(0x7f0e0003, float:1.8875044E38)
        L_0x010d:
            r21 = 2131623940(0x7f0e0004, float:1.8875046E38)
            goto L_0x0310
        L_0x0112:
            java.lang.String r1 = r27.getExactPosition()
            java.lang.String r8 = "-1"
            boolean r1 = android.text.TextUtils.equals(r1, r8)
            r8 = 2131034171(0x7f05003b, float:1.7678852E38)
            if (r1 == 0) goto L_0x01d8
            java.lang.String r1 = r27.getExactPosition()
            if (r1 == 0) goto L_0x0285
            int r8 = r1.hashCode()
            switch(r8) {
                case 48: goto L_0x01d2;
                case 49: goto L_0x01c5;
                case 50: goto L_0x01b8;
                case 51: goto L_0x01ab;
                case 52: goto L_0x019e;
                case 53: goto L_0x0191;
                case 54: goto L_0x0184;
                case 55: goto L_0x0177;
                case 56: goto L_0x016a;
                case 57: goto L_0x015d;
                default: goto L_0x012e;
            }
        L_0x012e:
            switch(r8) {
                case 1567: goto L_0x0150;
                case 1568: goto L_0x0143;
                case 1569: goto L_0x0135;
                default: goto L_0x0131;
            }
        L_0x0131:
            r8 = 2131623939(0x7f0e0003, float:1.8875044E38)
            goto L_0x0140
        L_0x0135:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x013d
            goto L_0x0285
        L_0x013d:
            r8 = 2131623999(0x7f0e003f, float:1.8875165E38)
        L_0x0140:
            r1 = r8
            goto L_0x0288
        L_0x0143:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x014b
            goto L_0x0285
        L_0x014b:
            r1 = 2131623994(0x7f0e003a, float:1.8875155E38)
            goto L_0x0288
        L_0x0150:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0158
            goto L_0x0285
        L_0x0158:
            r1 = 2131623989(0x7f0e0035, float:1.8875145E38)
            goto L_0x0288
        L_0x015d:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0165
            goto L_0x0285
        L_0x0165:
            r1 = 2131623984(0x7f0e0030, float:1.8875135E38)
            goto L_0x0288
        L_0x016a:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0172
            goto L_0x0285
        L_0x0172:
            r1 = 2131623979(0x7f0e002b, float:1.8875125E38)
            goto L_0x0288
        L_0x0177:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x017f
            goto L_0x0285
        L_0x017f:
            r1 = 2131623974(0x7f0e0026, float:1.8875115E38)
            goto L_0x0288
        L_0x0184:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x018c
            goto L_0x0285
        L_0x018c:
            r1 = 2131623969(0x7f0e0021, float:1.8875104E38)
            goto L_0x0288
        L_0x0191:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0199
            goto L_0x0285
        L_0x0199:
            r1 = 2131623964(0x7f0e001c, float:1.8875094E38)
            goto L_0x0288
        L_0x019e:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x01a6
            goto L_0x0285
        L_0x01a6:
            r1 = 2131623959(0x7f0e0017, float:1.8875084E38)
            goto L_0x0288
        L_0x01ab:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01b3
            goto L_0x0285
        L_0x01b3:
            r1 = 2131623954(0x7f0e0012, float:1.8875074E38)
            goto L_0x0288
        L_0x01b8:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x01c0
            goto L_0x0285
        L_0x01c0:
            r1 = 2131623949(0x7f0e000d, float:1.8875064E38)
            goto L_0x0288
        L_0x01c5:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01cd
            goto L_0x0285
        L_0x01cd:
            r1 = 2131623944(0x7f0e0008, float:1.8875054E38)
            goto L_0x0288
        L_0x01d2:
            boolean r1 = r1.equals(r7)
            goto L_0x0285
        L_0x01d8:
            java.lang.String r1 = r27.getExactPosition()
            if (r1 == 0) goto L_0x0285
            int r16 = r1.hashCode()
            switch(r16) {
                case 48: goto L_0x0278;
                case 49: goto L_0x026d;
                case 50: goto L_0x0262;
                case 51: goto L_0x0257;
                case 52: goto L_0x024c;
                case 53: goto L_0x0241;
                case 54: goto L_0x0236;
                case 55: goto L_0x022b;
                case 56: goto L_0x021e;
                case 57: goto L_0x0211;
                default: goto L_0x01e5;
            }
        L_0x01e5:
            switch(r16) {
                case 1567: goto L_0x0204;
                case 1568: goto L_0x01f7;
                case 1569: goto L_0x01ea;
                default: goto L_0x01e8;
            }
        L_0x01e8:
            goto L_0x0285
        L_0x01ea:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x01f2
            goto L_0x0285
        L_0x01f2:
            r1 = 2131623998(0x7f0e003e, float:1.8875163E38)
            goto L_0x0282
        L_0x01f7:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x01ff
            goto L_0x0285
        L_0x01ff:
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x0282
        L_0x0204:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x020c
            goto L_0x0285
        L_0x020c:
            r1 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x0282
        L_0x0211:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0219
            goto L_0x0285
        L_0x0219:
            r1 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x0282
        L_0x021e:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0226
            goto L_0x0285
        L_0x0226:
            r1 = 2131623978(0x7f0e002a, float:1.8875123E38)
            goto L_0x0282
        L_0x022b:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0232
            goto L_0x0285
        L_0x0232:
            r1 = 2131623973(0x7f0e0025, float:1.8875113E38)
            goto L_0x0282
        L_0x0236:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x023d
            goto L_0x0285
        L_0x023d:
            r1 = 2131623968(0x7f0e0020, float:1.8875102E38)
            goto L_0x0282
        L_0x0241:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0248
            goto L_0x0285
        L_0x0248:
            r1 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x0282
        L_0x024c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0253
            goto L_0x0285
        L_0x0253:
            r1 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x0282
        L_0x0257:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x025e
            goto L_0x0285
        L_0x025e:
            r1 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x0282
        L_0x0262:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0269
            goto L_0x0285
        L_0x0269:
            r1 = 2131623948(0x7f0e000c, float:1.8875062E38)
            goto L_0x0282
        L_0x026d:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0274
            goto L_0x0285
        L_0x0274:
            r1 = 2131623943(0x7f0e0007, float:1.8875052E38)
            goto L_0x0282
        L_0x0278:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x027f
            goto L_0x0285
        L_0x027f:
            r1 = 2131623938(0x7f0e0002, float:1.8875042E38)
        L_0x0282:
            r18 = r8
            goto L_0x0288
        L_0x0285:
            r1 = 2131623939(0x7f0e0003, float:1.8875044E38)
        L_0x0288:
            java.lang.String r8 = r27.getExactPosition()
            if (r8 == 0) goto L_0x030a
            int r16 = r8.hashCode()
            switch(r16) {
                case 48: goto L_0x0306;
                case 49: goto L_0x02f9;
                case 50: goto L_0x02ec;
                case 51: goto L_0x02e0;
                case 52: goto L_0x02d9;
                case 53: goto L_0x02d2;
                case 54: goto L_0x02cb;
                case 55: goto L_0x02c4;
                case 56: goto L_0x02bd;
                case 57: goto L_0x02b6;
                default: goto L_0x0295;
            }
        L_0x0295:
            switch(r16) {
                case 1567: goto L_0x02af;
                case 1568: goto L_0x02a7;
                case 1569: goto L_0x029a;
                default: goto L_0x0298;
            }
        L_0x0298:
            goto L_0x030a
        L_0x029a:
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x02a2
            goto L_0x030a
        L_0x02a2:
            r8 = 2131624000(0x7f0e0040, float:1.8875167E38)
            goto L_0x00ca
        L_0x02a7:
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x005f
            goto L_0x030a
        L_0x02af:
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x006f
            goto L_0x030a
        L_0x02b6:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x007e
            goto L_0x030a
        L_0x02bd:
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x008d
            goto L_0x030a
        L_0x02c4:
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x009c
            goto L_0x030a
        L_0x02cb:
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x00ab
            goto L_0x030a
        L_0x02d2:
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x00b9
            goto L_0x030a
        L_0x02d9:
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x00c7
            goto L_0x030a
        L_0x02e0:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x02e7
            goto L_0x030a
        L_0x02e7:
            r8 = 2131623955(0x7f0e0013, float:1.8875076E38)
            goto L_0x00ca
        L_0x02ec:
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x02f3
            goto L_0x030a
        L_0x02f3:
            r20 = r1
            r22 = r18
            goto L_0x00ee
        L_0x02f9:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0300
            goto L_0x030a
        L_0x0300:
            r20 = r1
            r22 = r18
            goto L_0x00ff
        L_0x0306:
            boolean r8 = r8.equals(r7)
        L_0x030a:
            r20 = r1
            r22 = r18
            goto L_0x010d
        L_0x0310:
            java.lang.String r1 = r27.getExactPosition()
            if (r1 == 0) goto L_0x04d4
            int r8 = r1.hashCode()
            switch(r8) {
                case 48: goto L_0x04b5;
                case 49: goto L_0x0495;
                case 50: goto L_0x0475;
                case 51: goto L_0x0454;
                case 52: goto L_0x0432;
                case 53: goto L_0x0410;
                case 54: goto L_0x03ee;
                case 55: goto L_0x03cc;
                case 56: goto L_0x03aa;
                case 57: goto L_0x0388;
                default: goto L_0x031d;
            }
        L_0x031d:
            switch(r8) {
                case 1567: goto L_0x0366;
                case 1568: goto L_0x0344;
                case 1569: goto L_0x0322;
                default: goto L_0x0320;
            }
        L_0x0320:
            goto L_0x04d4
        L_0x0322:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x032a
            goto L_0x04d4
        L_0x032a:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0344:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x034c
            goto L_0x04d4
        L_0x034c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0366:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x036e
            goto L_0x04d4
        L_0x036e:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0388:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0390
            goto L_0x04d4
        L_0x0390:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x03aa:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x03b2
            goto L_0x04d4
        L_0x03b2:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b2
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x03cc:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x03d4
            goto L_0x04d4
        L_0x03d4:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_b1
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_b1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x03ee:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x03f6
            goto L_0x04d4
        L_0x03f6:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f7
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f7"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0410:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0418
            goto L_0x04d4
        L_0x0418:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0432:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x043a
            goto L_0x04d4
        L_0x043a:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0454:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x045c
            goto L_0x04d4
        L_0x045c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0475:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x047c
            goto L_0x04d4
        L_0x047c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x0495:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x049c
            goto L_0x04d4
        L_0x049c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f2
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
            goto L_0x04d4
        L_0x04b5:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x04bc
            goto L_0x04d4
        L_0x04bc:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_f1
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.text_f1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r19 = r25
            r23 = r0
            r24 = r27
            r19.setExactWineInfoA1(r20, r21, r22, r23, r24)
        L_0x04d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setItemView(com.hisense.connect_life.core.utils.Holder, com.juconnect.connectlife.model.WineInventoryBean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0204, code lost:
        if (r1.equals("35") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020e, code lost:
        if (r1.equals("34") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0212, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021b, code lost:
        if (r1.equals("33") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0225, code lost:
        if (r1.equals("32") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022f, code lost:
        if (r1.equals("31") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0239, code lost:
        if (r1.equals("30") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0243, code lost:
        if (r1.equals("29") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024d, code lost:
        if (r1.equals("28") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (r1.equals("35") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0253, code lost:
        r1 = r1.equals(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025f, code lost:
        if (r1.equals("26") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0269, code lost:
        if (r1.equals("25") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0273, code lost:
        if (r1.equals("24") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x027d, code lost:
        if (r1.equals("23") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0287, code lost:
        if (r1.equals("22") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0291, code lost:
        if (r1.equals("21") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029b, code lost:
        if (r1.equals("20") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a5, code lost:
        if (r1.equals("19") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b2, code lost:
        if (r1.equals("17") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02bc, code lost:
        if (r1.equals("16") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c6, code lost:
        if (r1.equals("15") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d0, code lost:
        if (r1.equals("14") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02da, code lost:
        if (r1.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e4, code lost:
        if (r1.equals("12") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ee, code lost:
        if (r1.equals("11") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f8, code lost:
        if (r1.equals("10") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0306, code lost:
        if (r1.equals("8") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0310, code lost:
        if (r1.equals("7") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031a, code lost:
        if (r1.equals("6") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x031e, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0327, code lost:
        if (r1.equals("5") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x032b, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        if (r1.equals("4") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0338, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0341, code lost:
        if (r1.equals("3") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0345, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034e, code lost:
        if (r1.equals("2") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0352, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035a, code lost:
        if (r1.equals("1") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035e, code lost:
        r5 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0386, code lost:
        if (r1.equals("35") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0390, code lost:
        if (r1.equals("34") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r1.equals("33") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x039a, code lost:
        if (r1.equals("33") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a4, code lost:
        if (r1.equals("32") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ae, code lost:
        if (r1.equals("31") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b8, code lost:
        if (r1.equals("30") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03c2, code lost:
        if (r1.equals("29") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03cc, code lost:
        if (r1.equals("28") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03d6, code lost:
        if (r1.equals("27") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e0, code lost:
        if (r1.equals("26") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03ea, code lost:
        if (r1.equals("25") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f4, code lost:
        if (r1.equals("24") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r1.equals("32") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03fe, code lost:
        if (r1.equals("23") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0408, code lost:
        if (r1.equals("22") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0412, code lost:
        if (r1.equals("21") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x041c, code lost:
        if (r1.equals("20") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0426, code lost:
        if (r1.equals("19") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0430, code lost:
        if (r1.equals("18") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x043a, code lost:
        if (r1.equals("17") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0444, code lost:
        if (r1.equals("16") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x044e, code lost:
        if (r1.equals("15") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0458, code lost:
        if (r1.equals("14") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r1.equals("31") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0462, code lost:
        if (r1.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x046c, code lost:
        if (r1.equals("12") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0476, code lost:
        if (r1.equals("11") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0480, code lost:
        if (r1.equals("10") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x048a, code lost:
        if (r1.equals(com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin.OPTION_KILL_DEFAULT) == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0494, code lost:
        if (r1.equals("8") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0498, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04a3, code lost:
        if (r1.equals("7") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04a7, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b1, code lost:
        if (r1.equals("6") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04b4, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04be, code lost:
        if (r1.equals("5") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (r1.equals("30") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c1, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04cb, code lost:
        if (r1.equals("4") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04ce, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04d8, code lost:
        if (r1.equals("3") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04db, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04e5, code lost:
        if (r1.equals("2") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04e8, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04f0, code lost:
        if (r1.equals("1") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04f3, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04fb, code lost:
        if (r1.equals("0") == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04fe, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r2_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0501, code lost:
        r5 = r1;
        r22 = com.hisense.juconnect.connectlife.R.color.colorBlack;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r1.equals("29") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0525, code lost:
        if (r1.equals("35") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x052f, code lost:
        if (r1.equals("34") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0539, code lost:
        if (r1.equals("33") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0543, code lost:
        if (r1.equals("32") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x054d, code lost:
        if (r1.equals("31") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0557, code lost:
        if (r1.equals("30") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0561, code lost:
        if (r1.equals("29") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r1.equals("28") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x056b, code lost:
        if (r1.equals("28") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0571, code lost:
        r1 = r1.equals(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x057d, code lost:
        if (r1.equals("26") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0587, code lost:
        if (r1.equals("25") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0591, code lost:
        if (r1.equals("24") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x059b, code lost:
        if (r1.equals("23") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a5, code lost:
        if (r1.equals("22") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05af, code lost:
        if (r1.equals("21") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05b9, code lost:
        if (r1.equals("20") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05c3, code lost:
        if (r1.equals("19") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        r1 = r1.equals(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05d0, code lost:
        if (r1.equals("17") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05da, code lost:
        if (r1.equals("16") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05e4, code lost:
        if (r1.equals("15") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05ee, code lost:
        if (r1.equals("14") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05f8, code lost:
        if (r1.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0602, code lost:
        if (r1.equals("12") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x060c, code lost:
        if (r1.equals("11") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0616, code lost:
        if (r1.equals("10") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0624, code lost:
        if (r1.equals("8") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1.equals("26") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x062e, code lost:
        if (r1.equals("7") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0632, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x063b, code lost:
        if (r1.equals("6") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0644, code lost:
        if (r1.equals("5") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0647, code lost:
        r7 = r5;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0651, code lost:
        if (r1.equals("4") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0654, code lost:
        r7 = r5;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x065e, code lost:
        if (r1.equals("3") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0661, code lost:
        r7 = r5;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x066b, code lost:
        if (r1.equals("2") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x066e, code lost:
        r7 = r5;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0677, code lost:
        if (r1.equals("1") == false) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x067a, code lost:
        r7 = r5;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        if (r1.equals("25") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        if (r1.equals("24") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r1.equals("23") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        if (r1.equals("22") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f3, code lost:
        if (r1.equals("21") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        if (r1.equals("20") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        if (r1.equals("19") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        if (r1.equals("17") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        if (r1.equals("16") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0128, code lost:
        if (r1.equals("15") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0132, code lost:
        if (r1.equals("14") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        if (r1.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r1.equals("12") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0150, code lost:
        if (r1.equals("11") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r1.equals("10") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        if (r1.equals("8") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016c, code lost:
        r7 = r5;
        r9 = r22;
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017a, code lost:
        if (r1.equals("7") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017e, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0187, code lost:
        if (r1.equals("6") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018a, code lost:
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0192, code lost:
        if (r1.equals("5") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0195, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_favourite;
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019e, code lost:
        if (r1.equals("4") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_favourite;
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01aa, code lost:
        if (r1.equals("3") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ad, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_favourite;
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if (r1.equals("2") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b9, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_favourite;
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c2, code lost:
        if (r1.equals("1") == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c5, code lost:
        r8 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_favourite;
        r7 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_disabled;
     */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x068e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setItemViewc5(com.hisense.connect_life.core.utils.Holder r25, com.juconnect.connectlife.model.WineInventoryBean r26) {
        /*
            r24 = this;
            r0 = r25
            boolean r1 = r26.isFilteredOut()
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            r5 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r6 = 2131623995(0x7f0e003b, float:1.8875157E38)
            r7 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r8 = 2131623960(0x7f0e0018, float:1.8875086E38)
            r9 = 2131623959(0x7f0e0017, float:1.8875084E38)
            r10 = 2131623990(0x7f0e0036, float:1.8875147E38)
            r11 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r12 = 2131623955(0x7f0e0013, float:1.8875076E38)
            r13 = 2131623954(0x7f0e0012, float:1.8875074E38)
            r14 = 2131623985(0x7f0e0031, float:1.8875137E38)
            r15 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r16 = 2131623950(0x7f0e000e, float:1.8875066E38)
            r17 = 2131623949(0x7f0e000d, float:1.8875064E38)
            r18 = 2131623980(0x7f0e002c, float:1.8875127E38)
            r19 = 2131623979(0x7f0e002b, float:1.8875125E38)
            r20 = 2131623945(0x7f0e0009, float:1.8875056E38)
            r21 = 2131623944(0x7f0e0008, float:1.8875054E38)
            r22 = 2131034191(0x7f05004f, float:1.7678893E38)
            if (r1 == 0) goto L_0x01d6
            java.lang.String r1 = r26.getExactPosition()
            if (r1 == 0) goto L_0x01ce
            int r23 = r1.hashCode()
            switch(r23) {
                case 48: goto L_0x01ca;
                case 49: goto L_0x01be;
                case 50: goto L_0x01b0;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0198;
                case 53: goto L_0x018c;
                case 54: goto L_0x0181;
                case 55: goto L_0x0174;
                case 56: goto L_0x0162;
                case 57: goto L_0x015e;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r23) {
                case 1567: goto L_0x0154;
                case 1568: goto L_0x014a;
                case 1569: goto L_0x0140;
                case 1570: goto L_0x0136;
                case 1571: goto L_0x012c;
                case 1572: goto L_0x0122;
                case 1573: goto L_0x0118;
                case 1574: goto L_0x010e;
                case 1575: goto L_0x010b;
                case 1576: goto L_0x0101;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r23) {
                case 1598: goto L_0x00f7;
                case 1599: goto L_0x00ed;
                case 1600: goto L_0x00e3;
                case 1601: goto L_0x00d9;
                case 1602: goto L_0x00cf;
                case 1603: goto L_0x00c5;
                case 1604: goto L_0x00bb;
                case 1605: goto L_0x00b3;
                case 1606: goto L_0x00a9;
                case 1607: goto L_0x009f;
                default: goto L_0x0055;
            }
        L_0x0055:
            switch(r23) {
                case 1629: goto L_0x0095;
                case 1630: goto L_0x008b;
                case 1631: goto L_0x0081;
                case 1632: goto L_0x0077;
                case 1633: goto L_0x0067;
                case 1634: goto L_0x005d;
                default: goto L_0x0058;
            }
        L_0x0058:
            r4 = r20
            r5 = r21
            goto L_0x0073
        L_0x005d:
            java.lang.String r6 = "35"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x016c
            goto L_0x01ce
        L_0x0067:
            java.lang.String r4 = "34"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0071
            goto L_0x01ce
        L_0x0071:
            r4 = r6
            r5 = r7
        L_0x0073:
            r8 = r4
        L_0x0074:
            r7 = r5
            goto L_0x01d2
        L_0x0077:
            java.lang.String r4 = "33"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x018a
            goto L_0x01ce
        L_0x0081:
            java.lang.String r4 = "32"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0195
            goto L_0x01ce
        L_0x008b:
            java.lang.String r4 = "31"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01a1
            goto L_0x01ce
        L_0x0095:
            java.lang.String r4 = "30"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01ad
            goto L_0x01ce
        L_0x009f:
            java.lang.String r4 = "29"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x00a9:
            java.lang.String r4 = "28"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01c5
            goto L_0x01ce
        L_0x00b3:
            java.lang.String r4 = "27"
        L_0x00b5:
            boolean r1 = r1.equals(r4)
            goto L_0x01ce
        L_0x00bb:
            java.lang.String r6 = "26"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x016c
            goto L_0x01ce
        L_0x00c5:
            java.lang.String r4 = "25"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x017e
            goto L_0x01ce
        L_0x00cf:
            java.lang.String r4 = "24"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x018a
            goto L_0x01ce
        L_0x00d9:
            java.lang.String r4 = "23"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0195
            goto L_0x01ce
        L_0x00e3:
            java.lang.String r4 = "22"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01a1
            goto L_0x01ce
        L_0x00ed:
            java.lang.String r4 = "21"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01ad
            goto L_0x01ce
        L_0x00f7:
            java.lang.String r4 = "20"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x0101:
            java.lang.String r4 = "19"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01c5
            goto L_0x01ce
        L_0x010b:
            java.lang.String r4 = "18"
            goto L_0x00b5
        L_0x010e:
            java.lang.String r6 = "17"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x016c
            goto L_0x01ce
        L_0x0118:
            java.lang.String r4 = "16"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x017e
            goto L_0x01ce
        L_0x0122:
            java.lang.String r4 = "15"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x018a
            goto L_0x01ce
        L_0x012c:
            java.lang.String r4 = "14"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0195
            goto L_0x01ce
        L_0x0136:
            java.lang.String r4 = "13"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01a1
            goto L_0x01ce
        L_0x0140:
            java.lang.String r4 = "12"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01ad
            goto L_0x01ce
        L_0x014a:
            java.lang.String r4 = "11"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x0154:
            java.lang.String r4 = "10"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01c5
            goto L_0x01ce
        L_0x015e:
            java.lang.String r4 = "9"
            goto L_0x00b5
        L_0x0162:
            java.lang.String r6 = "8"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x016c
            goto L_0x01ce
        L_0x016c:
            r7 = r5
            r9 = r22
            r8 = 2131623965(0x7f0e001d, float:1.8875096E38)
            goto L_0x0688
        L_0x0174:
            java.lang.String r4 = "7"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x017e
            goto L_0x01ce
        L_0x017e:
            r8 = r6
            goto L_0x01d2
        L_0x0181:
            java.lang.String r4 = "6"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x018a
            goto L_0x01ce
        L_0x018a:
            r7 = r9
            goto L_0x01d2
        L_0x018c:
            java.lang.String r4 = "5"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0195
            goto L_0x01ce
        L_0x0195:
            r8 = r10
            r7 = r11
            goto L_0x01d2
        L_0x0198:
            java.lang.String r4 = "4"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01a1
            goto L_0x01ce
        L_0x01a1:
            r8 = r12
            r7 = r13
            goto L_0x01d2
        L_0x01a4:
            java.lang.String r4 = "3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01ad
            goto L_0x01ce
        L_0x01ad:
            r8 = r14
            r7 = r15
            goto L_0x01d2
        L_0x01b0:
            java.lang.String r4 = "2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x01b9:
            r8 = r16
            r7 = r17
            goto L_0x01d2
        L_0x01be:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c5
            goto L_0x01ce
        L_0x01c5:
            r8 = r18
            r7 = r19
            goto L_0x01d2
        L_0x01ca:
            boolean r1 = r1.equals(r3)
        L_0x01ce:
            r8 = r20
            r7 = r21
        L_0x01d2:
            r9 = r22
            goto L_0x0688
        L_0x01d6:
            java.lang.String r1 = r26.getExactPosition()
            java.lang.String r4 = "-1"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            r4 = 2131034171(0x7f05003b, float:1.7678852E38)
            if (r1 == 0) goto L_0x0368
            java.lang.String r1 = r26.getExactPosition()
            if (r1 == 0) goto L_0x0505
            int r4 = r1.hashCode()
            switch(r4) {
                case 48: goto L_0x0362;
                case 49: goto L_0x0356;
                case 50: goto L_0x0348;
                case 51: goto L_0x033b;
                case 52: goto L_0x032e;
                case 53: goto L_0x0321;
                case 54: goto L_0x0314;
                case 55: goto L_0x030a;
                case 56: goto L_0x0300;
                case 57: goto L_0x02fc;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            switch(r4) {
                case 1567: goto L_0x02f2;
                case 1568: goto L_0x02e8;
                case 1569: goto L_0x02de;
                case 1570: goto L_0x02d4;
                case 1571: goto L_0x02ca;
                case 1572: goto L_0x02c0;
                case 1573: goto L_0x02b6;
                case 1574: goto L_0x02ac;
                case 1575: goto L_0x02a9;
                case 1576: goto L_0x029f;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            switch(r4) {
                case 1598: goto L_0x0295;
                case 1599: goto L_0x028b;
                case 1600: goto L_0x0281;
                case 1601: goto L_0x0277;
                case 1602: goto L_0x026d;
                case 1603: goto L_0x0263;
                case 1604: goto L_0x0259;
                case 1605: goto L_0x0251;
                case 1606: goto L_0x0247;
                case 1607: goto L_0x023d;
                default: goto L_0x01f8;
            }
        L_0x01f8:
            switch(r4) {
                case 1629: goto L_0x0233;
                case 1630: goto L_0x0229;
                case 1631: goto L_0x021f;
                case 1632: goto L_0x0215;
                case 1633: goto L_0x0208;
                case 1634: goto L_0x01fe;
                default: goto L_0x01fb;
            }
        L_0x01fb:
            r7 = r21
            goto L_0x0212
        L_0x01fe:
            java.lang.String r4 = "35"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0507
            goto L_0x0505
        L_0x0208:
            java.lang.String r4 = "34"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0212
            goto L_0x0505
        L_0x0212:
            r5 = r7
            goto L_0x0507
        L_0x0215:
            java.lang.String r4 = "33"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x031e
            goto L_0x0505
        L_0x021f:
            java.lang.String r4 = "32"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x032b
            goto L_0x0505
        L_0x0229:
            java.lang.String r4 = "31"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0338
            goto L_0x0505
        L_0x0233:
            java.lang.String r4 = "30"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0345
            goto L_0x0505
        L_0x023d:
            java.lang.String r4 = "29"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0352
            goto L_0x0505
        L_0x0247:
            java.lang.String r4 = "28"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x035e
            goto L_0x0505
        L_0x0251:
            java.lang.String r4 = "27"
        L_0x0253:
            boolean r1 = r1.equals(r4)
            goto L_0x0505
        L_0x0259:
            java.lang.String r4 = "26"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0507
            goto L_0x0505
        L_0x0263:
            java.lang.String r4 = "25"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0212
            goto L_0x0505
        L_0x026d:
            java.lang.String r4 = "24"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x031e
            goto L_0x0505
        L_0x0277:
            java.lang.String r4 = "23"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x032b
            goto L_0x0505
        L_0x0281:
            java.lang.String r4 = "22"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0338
            goto L_0x0505
        L_0x028b:
            java.lang.String r4 = "21"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0345
            goto L_0x0505
        L_0x0295:
            java.lang.String r4 = "20"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0352
            goto L_0x0505
        L_0x029f:
            java.lang.String r4 = "19"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x035e
            goto L_0x0505
        L_0x02a9:
            java.lang.String r4 = "18"
            goto L_0x0253
        L_0x02ac:
            java.lang.String r4 = "17"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0507
            goto L_0x0505
        L_0x02b6:
            java.lang.String r4 = "16"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0212
            goto L_0x0505
        L_0x02c0:
            java.lang.String r4 = "15"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x031e
            goto L_0x0505
        L_0x02ca:
            java.lang.String r4 = "14"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x032b
            goto L_0x0505
        L_0x02d4:
            java.lang.String r4 = "13"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0338
            goto L_0x0505
        L_0x02de:
            java.lang.String r4 = "12"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0345
            goto L_0x0505
        L_0x02e8:
            java.lang.String r4 = "11"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0352
            goto L_0x0505
        L_0x02f2:
            java.lang.String r4 = "10"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x035e
            goto L_0x0505
        L_0x02fc:
            java.lang.String r4 = "9"
            goto L_0x0253
        L_0x0300:
            java.lang.String r4 = "8"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0507
            goto L_0x0505
        L_0x030a:
            java.lang.String r4 = "7"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0212
            goto L_0x0505
        L_0x0314:
            java.lang.String r4 = "6"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x031e
            goto L_0x0505
        L_0x031e:
            r5 = r9
            goto L_0x0507
        L_0x0321:
            java.lang.String r4 = "5"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x032b
            goto L_0x0505
        L_0x032b:
            r5 = r11
            goto L_0x0507
        L_0x032e:
            java.lang.String r4 = "4"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0338
            goto L_0x0505
        L_0x0338:
            r5 = r13
            goto L_0x0507
        L_0x033b:
            java.lang.String r4 = "3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0345
            goto L_0x0505
        L_0x0345:
            r5 = r15
            goto L_0x0507
        L_0x0348:
            java.lang.String r4 = "2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0352
            goto L_0x0505
        L_0x0352:
            r5 = r17
            goto L_0x0507
        L_0x0356:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x035e
            goto L_0x0505
        L_0x035e:
            r5 = r19
            goto L_0x0507
        L_0x0362:
            boolean r1 = r1.equals(r3)
            goto L_0x0505
        L_0x0368:
            java.lang.String r1 = r26.getExactPosition()
            if (r1 == 0) goto L_0x0505
            int r5 = r1.hashCode()
            switch(r5) {
                case 48: goto L_0x04f7;
                case 49: goto L_0x04ec;
                case 50: goto L_0x04df;
                case 51: goto L_0x04d2;
                case 52: goto L_0x04c5;
                case 53: goto L_0x04b8;
                case 54: goto L_0x04ab;
                case 55: goto L_0x049d;
                case 56: goto L_0x048e;
                case 57: goto L_0x0484;
                default: goto L_0x0375;
            }
        L_0x0375:
            switch(r5) {
                case 1567: goto L_0x047a;
                case 1568: goto L_0x0470;
                case 1569: goto L_0x0466;
                case 1570: goto L_0x045c;
                case 1571: goto L_0x0452;
                case 1572: goto L_0x0448;
                case 1573: goto L_0x043e;
                case 1574: goto L_0x0434;
                case 1575: goto L_0x042a;
                case 1576: goto L_0x0420;
                default: goto L_0x0378;
            }
        L_0x0378:
            switch(r5) {
                case 1598: goto L_0x0416;
                case 1599: goto L_0x040c;
                case 1600: goto L_0x0402;
                case 1601: goto L_0x03f8;
                case 1602: goto L_0x03ee;
                case 1603: goto L_0x03e4;
                case 1604: goto L_0x03da;
                case 1605: goto L_0x03d0;
                case 1606: goto L_0x03c6;
                case 1607: goto L_0x03bc;
                default: goto L_0x037b;
            }
        L_0x037b:
            switch(r5) {
                case 1629: goto L_0x03b2;
                case 1630: goto L_0x03a8;
                case 1631: goto L_0x039e;
                case 1632: goto L_0x0394;
                case 1633: goto L_0x038a;
                case 1634: goto L_0x0380;
                default: goto L_0x037e;
            }
        L_0x037e:
            goto L_0x0505
        L_0x0380:
            java.lang.String r5 = "35"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0498
            goto L_0x0505
        L_0x038a:
            java.lang.String r5 = "34"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04a7
            goto L_0x0505
        L_0x0394:
            java.lang.String r5 = "33"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04b4
            goto L_0x0505
        L_0x039e:
            java.lang.String r5 = "32"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04c1
            goto L_0x0505
        L_0x03a8:
            java.lang.String r5 = "31"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04ce
            goto L_0x0505
        L_0x03b2:
            java.lang.String r5 = "30"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04db
            goto L_0x0505
        L_0x03bc:
            java.lang.String r5 = "29"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04e8
            goto L_0x0505
        L_0x03c6:
            java.lang.String r5 = "28"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04f3
            goto L_0x0505
        L_0x03d0:
            java.lang.String r5 = "27"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04fe
            goto L_0x0505
        L_0x03da:
            java.lang.String r5 = "26"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0498
            goto L_0x0505
        L_0x03e4:
            java.lang.String r5 = "25"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04a7
            goto L_0x0505
        L_0x03ee:
            java.lang.String r5 = "24"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04b4
            goto L_0x0505
        L_0x03f8:
            java.lang.String r5 = "23"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04c1
            goto L_0x0505
        L_0x0402:
            java.lang.String r5 = "22"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04ce
            goto L_0x0505
        L_0x040c:
            java.lang.String r5 = "21"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04db
            goto L_0x0505
        L_0x0416:
            java.lang.String r5 = "20"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04e8
            goto L_0x0505
        L_0x0420:
            java.lang.String r5 = "19"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04f3
            goto L_0x0505
        L_0x042a:
            java.lang.String r5 = "18"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04fe
            goto L_0x0505
        L_0x0434:
            java.lang.String r5 = "17"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0498
            goto L_0x0505
        L_0x043e:
            java.lang.String r5 = "16"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04a7
            goto L_0x0505
        L_0x0448:
            java.lang.String r5 = "15"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04b4
            goto L_0x0505
        L_0x0452:
            java.lang.String r5 = "14"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04c1
            goto L_0x0505
        L_0x045c:
            java.lang.String r5 = "13"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04ce
            goto L_0x0505
        L_0x0466:
            java.lang.String r5 = "12"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04db
            goto L_0x0505
        L_0x0470:
            java.lang.String r5 = "11"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04e8
            goto L_0x0505
        L_0x047a:
            java.lang.String r5 = "10"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04f3
            goto L_0x0505
        L_0x0484:
            java.lang.String r5 = "9"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04fe
            goto L_0x0505
        L_0x048e:
            java.lang.String r5 = "8"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0498
            goto L_0x0505
        L_0x0498:
            r1 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x0501
        L_0x049d:
            java.lang.String r5 = "7"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04a7
            goto L_0x0505
        L_0x04a7:
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x0501
        L_0x04ab:
            java.lang.String r5 = "6"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04b4
            goto L_0x0505
        L_0x04b4:
            r1 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x0501
        L_0x04b8:
            java.lang.String r5 = "5"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04c1
            goto L_0x0505
        L_0x04c1:
            r1 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x0501
        L_0x04c5:
            java.lang.String r5 = "4"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04ce
            goto L_0x0505
        L_0x04ce:
            r1 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x0501
        L_0x04d2:
            java.lang.String r5 = "3"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04db
            goto L_0x0505
        L_0x04db:
            r1 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x0501
        L_0x04df:
            java.lang.String r5 = "2"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x04e8
            goto L_0x0505
        L_0x04e8:
            r1 = 2131623948(0x7f0e000c, float:1.8875062E38)
            goto L_0x0501
        L_0x04ec:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04f3
            goto L_0x0505
        L_0x04f3:
            r1 = 2131623978(0x7f0e002a, float:1.8875123E38)
            goto L_0x0501
        L_0x04f7:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x04fe
            goto L_0x0505
        L_0x04fe:
            r1 = 2131623943(0x7f0e0007, float:1.8875052E38)
        L_0x0501:
            r5 = r1
            r22 = r4
            goto L_0x0507
        L_0x0505:
            r5 = r21
        L_0x0507:
            java.lang.String r1 = r26.getExactPosition()
            if (r1 == 0) goto L_0x0683
            int r4 = r1.hashCode()
            switch(r4) {
                case 48: goto L_0x067f;
                case 49: goto L_0x0673;
                case 50: goto L_0x0665;
                case 51: goto L_0x0658;
                case 52: goto L_0x064b;
                case 53: goto L_0x063e;
                case 54: goto L_0x0635;
                case 55: goto L_0x0628;
                case 56: goto L_0x061e;
                case 57: goto L_0x061a;
                default: goto L_0x0514;
            }
        L_0x0514:
            switch(r4) {
                case 1567: goto L_0x0610;
                case 1568: goto L_0x0606;
                case 1569: goto L_0x05fc;
                case 1570: goto L_0x05f2;
                case 1571: goto L_0x05e8;
                case 1572: goto L_0x05de;
                case 1573: goto L_0x05d4;
                case 1574: goto L_0x05ca;
                case 1575: goto L_0x05c7;
                case 1576: goto L_0x05bd;
                default: goto L_0x0517;
            }
        L_0x0517:
            switch(r4) {
                case 1598: goto L_0x05b3;
                case 1599: goto L_0x05a9;
                case 1600: goto L_0x059f;
                case 1601: goto L_0x0595;
                case 1602: goto L_0x058b;
                case 1603: goto L_0x0581;
                case 1604: goto L_0x0577;
                case 1605: goto L_0x056f;
                case 1606: goto L_0x0565;
                case 1607: goto L_0x055b;
                default: goto L_0x051a;
            }
        L_0x051a:
            switch(r4) {
                case 1629: goto L_0x0551;
                case 1630: goto L_0x0547;
                case 1631: goto L_0x053d;
                case 1632: goto L_0x0533;
                case 1633: goto L_0x0529;
                case 1634: goto L_0x051f;
                default: goto L_0x051d;
            }
        L_0x051d:
            goto L_0x0683
        L_0x051f:
            java.lang.String r4 = "35"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x016c
            goto L_0x0683
        L_0x0529:
            java.lang.String r4 = "34"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0632
            goto L_0x0683
        L_0x0533:
            java.lang.String r4 = "33"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0074
            goto L_0x0683
        L_0x053d:
            java.lang.String r4 = "32"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0647
            goto L_0x0683
        L_0x0547:
            java.lang.String r4 = "31"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0654
            goto L_0x0683
        L_0x0551:
            java.lang.String r4 = "30"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0661
            goto L_0x0683
        L_0x055b:
            java.lang.String r4 = "29"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x066e
            goto L_0x0683
        L_0x0565:
            java.lang.String r4 = "28"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x067a
            goto L_0x0683
        L_0x056f:
            java.lang.String r4 = "27"
        L_0x0571:
            boolean r1 = r1.equals(r4)
            goto L_0x0683
        L_0x0577:
            java.lang.String r4 = "26"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x016c
            goto L_0x0683
        L_0x0581:
            java.lang.String r4 = "25"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0632
            goto L_0x0683
        L_0x058b:
            java.lang.String r4 = "24"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0074
            goto L_0x0683
        L_0x0595:
            java.lang.String r4 = "23"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0647
            goto L_0x0683
        L_0x059f:
            java.lang.String r4 = "22"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0654
            goto L_0x0683
        L_0x05a9:
            java.lang.String r4 = "21"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0661
            goto L_0x0683
        L_0x05b3:
            java.lang.String r4 = "20"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x066e
            goto L_0x0683
        L_0x05bd:
            java.lang.String r4 = "19"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x067a
            goto L_0x0683
        L_0x05c7:
            java.lang.String r4 = "18"
            goto L_0x0571
        L_0x05ca:
            java.lang.String r4 = "17"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x016c
            goto L_0x0683
        L_0x05d4:
            java.lang.String r4 = "16"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0632
            goto L_0x0683
        L_0x05de:
            java.lang.String r4 = "15"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0074
            goto L_0x0683
        L_0x05e8:
            java.lang.String r4 = "14"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0647
            goto L_0x0683
        L_0x05f2:
            java.lang.String r4 = "13"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0654
            goto L_0x0683
        L_0x05fc:
            java.lang.String r4 = "12"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0661
            goto L_0x0683
        L_0x0606:
            java.lang.String r4 = "11"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x066e
            goto L_0x0683
        L_0x0610:
            java.lang.String r4 = "10"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x067a
            goto L_0x0683
        L_0x061a:
            java.lang.String r4 = "9"
            goto L_0x0571
        L_0x061e:
            java.lang.String r4 = "8"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x016c
            goto L_0x0683
        L_0x0628:
            java.lang.String r4 = "7"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0632
            goto L_0x0683
        L_0x0632:
            r7 = r5
            goto L_0x017e
        L_0x0635:
            java.lang.String r4 = "6"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0074
            goto L_0x0683
        L_0x063e:
            java.lang.String r4 = "5"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0647
            goto L_0x0683
        L_0x0647:
            r7 = r5
            r8 = r10
            goto L_0x01d2
        L_0x064b:
            java.lang.String r4 = "4"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0654
            goto L_0x0683
        L_0x0654:
            r7 = r5
            r8 = r12
            goto L_0x01d2
        L_0x0658:
            java.lang.String r4 = "3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0661
            goto L_0x0683
        L_0x0661:
            r7 = r5
            r8 = r14
            goto L_0x01d2
        L_0x0665:
            java.lang.String r4 = "2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x066e
            goto L_0x0683
        L_0x066e:
            r7 = r5
            r8 = r16
            goto L_0x01d2
        L_0x0673:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x067a
            goto L_0x0683
        L_0x067a:
            r7 = r5
            r8 = r18
            goto L_0x01d2
        L_0x067f:
            boolean r1 = r1.equals(r3)
        L_0x0683:
            r7 = r5
            r8 = r20
            goto L_0x01d2
        L_0x0688:
            java.lang.String r1 = r26.getExactPosition()
            if (r1 == 0) goto L_0x0bc7
            int r4 = r1.hashCode()
            switch(r4) {
                case 48: goto L_0x0ba6;
                case 49: goto L_0x0b85;
                case 50: goto L_0x0b62;
                case 51: goto L_0x0b3e;
                case 52: goto L_0x0b19;
                case 53: goto L_0x0af4;
                case 54: goto L_0x0acf;
                case 55: goto L_0x0aaa;
                case 56: goto L_0x0a85;
                case 57: goto L_0x0a60;
                default: goto L_0x0695;
            }
        L_0x0695:
            switch(r4) {
                case 1567: goto L_0x0a3b;
                case 1568: goto L_0x0a16;
                case 1569: goto L_0x09f1;
                case 1570: goto L_0x09cc;
                case 1571: goto L_0x09a7;
                case 1572: goto L_0x0982;
                case 1573: goto L_0x095d;
                case 1574: goto L_0x0938;
                case 1575: goto L_0x0913;
                case 1576: goto L_0x08ee;
                default: goto L_0x0698;
            }
        L_0x0698:
            switch(r4) {
                case 1598: goto L_0x08c9;
                case 1599: goto L_0x08a4;
                case 1600: goto L_0x087f;
                case 1601: goto L_0x085a;
                case 1602: goto L_0x0835;
                case 1603: goto L_0x0810;
                case 1604: goto L_0x07eb;
                case 1605: goto L_0x07c6;
                case 1606: goto L_0x07a1;
                case 1607: goto L_0x077c;
                default: goto L_0x069b;
            }
        L_0x069b:
            switch(r4) {
                case 1629: goto L_0x0757;
                case 1630: goto L_0x0732;
                case 1631: goto L_0x070d;
                case 1632: goto L_0x06e8;
                case 1633: goto L_0x06c3;
                case 1634: goto L_0x06a0;
                default: goto L_0x069e;
            }
        L_0x069e:
            goto L_0x0bc7
        L_0x06a0:
            java.lang.String r2 = "35"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06aa
            goto L_0x0bc7
        L_0x06aa:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c36
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c36"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            goto L_0x0bc7
        L_0x06c3:
            java.lang.String r2 = "34"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06cd
            goto L_0x0bc7
        L_0x06cd:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c35
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c35"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x06e8:
            java.lang.String r2 = "33"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06f2
            goto L_0x0bc7
        L_0x06f2:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c34
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c34"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x070d:
            java.lang.String r2 = "32"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0717
            goto L_0x0bc7
        L_0x0717:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c33
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c33"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0732:
            java.lang.String r2 = "31"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x073c
            goto L_0x0bc7
        L_0x073c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c32
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c32"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0757:
            java.lang.String r2 = "30"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0761
            goto L_0x0bc7
        L_0x0761:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c31
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c31"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x077c:
            java.lang.String r2 = "29"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0786
            goto L_0x0bc7
        L_0x0786:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c30
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c30"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x07a1:
            java.lang.String r2 = "28"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07ab
            goto L_0x0bc7
        L_0x07ab:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c29
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c29"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x07c6:
            java.lang.String r2 = "27"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07d0
            goto L_0x0bc7
        L_0x07d0:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c28
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c28"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x07eb:
            java.lang.String r2 = "26"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07f5
            goto L_0x0bc7
        L_0x07f5:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c27
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c27"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0810:
            java.lang.String r2 = "25"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x081a
            goto L_0x0bc7
        L_0x081a:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c26
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c26"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0835:
            java.lang.String r2 = "24"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x083f
            goto L_0x0bc7
        L_0x083f:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c25
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c25"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x085a:
            java.lang.String r2 = "23"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0864
            goto L_0x0bc7
        L_0x0864:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c24
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c24"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x087f:
            java.lang.String r2 = "22"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0889
            goto L_0x0bc7
        L_0x0889:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c23
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c23"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x08a4:
            java.lang.String r2 = "21"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x08ae
            goto L_0x0bc7
        L_0x08ae:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c22
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c22"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x08c9:
            java.lang.String r2 = "20"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x08d3
            goto L_0x0bc7
        L_0x08d3:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c21
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c21"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x08ee:
            java.lang.String r2 = "19"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x08f8
            goto L_0x0bc7
        L_0x08f8:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c20
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c20"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0913:
            java.lang.String r2 = "18"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x091d
            goto L_0x0bc7
        L_0x091d:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c19
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c19"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0938:
            java.lang.String r2 = "17"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0942
            goto L_0x0bc7
        L_0x0942:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c18
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c18"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x095d:
            java.lang.String r2 = "16"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0967
            goto L_0x0bc7
        L_0x0967:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c17
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c17"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0982:
            java.lang.String r2 = "15"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x098c
            goto L_0x0bc7
        L_0x098c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c16
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c16"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x09a7:
            java.lang.String r2 = "14"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09b1
            goto L_0x0bc7
        L_0x09b1:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c15
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c15"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x09cc:
            java.lang.String r2 = "13"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09d6
            goto L_0x0bc7
        L_0x09d6:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c14
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c14"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x09f1:
            java.lang.String r2 = "12"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09fb
            goto L_0x0bc7
        L_0x09fb:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c13
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c13"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0a16:
            java.lang.String r2 = "11"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0a20
            goto L_0x0bc7
        L_0x0a20:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c12
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c12"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0a3b:
            java.lang.String r2 = "10"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0a45
            goto L_0x0bc7
        L_0x0a45:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c11
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c11"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0a60:
            java.lang.String r2 = "9"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0a6a
            goto L_0x0bc7
        L_0x0a6a:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c10
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c10"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0a85:
            java.lang.String r2 = "8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0a8f
            goto L_0x0bc7
        L_0x0a8f:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c9
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c9"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0aaa:
            java.lang.String r2 = "7"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0ab4
            goto L_0x0bc7
        L_0x0ab4:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c8
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0acf:
            java.lang.String r2 = "6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0ad9
            goto L_0x0bc7
        L_0x0ad9:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c7
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c7"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0af4:
            java.lang.String r2 = "5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0afe
            goto L_0x0bc7
        L_0x0afe:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c6
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0b19:
            java.lang.String r2 = "4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0b23
            goto L_0x0bc7
        L_0x0b23:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c5
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0b3e:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0b48
            goto L_0x0bc7
        L_0x0b48:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c4
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0b62:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0b6b
            goto L_0x0bc7
        L_0x0b6b:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c3
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0b85:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0b8c
            goto L_0x0bc7
        L_0x0b8c:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c2
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0ba6:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0bad
            goto L_0x0bc7
        L_0x0bad:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.text_c1
            android.view.View r0 = r0.findViewById(r1)
            r10 = r0
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r10 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r10
            java.lang.String r0 = "holder.itemView.text_c1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = r24
            r11 = r26
            r6.setExactWineInfo(r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0bc9
        L_0x0bc7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0bc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setItemViewc5(com.hisense.connect_life.core.utils.Holder, com.juconnect.connectlife.model.WineInventoryBean):void");
    }

    private final void setLick(InventoryExactPositionTextView inventoryExactPositionTextView, WineInventoryBean wineInventoryBean) {
        String exactPosition = wineInventoryBean.getExactPosition();
        if (exactPosition != null) {
            int hashCode = exactPosition.hashCode();
            switch (hashCode) {
                case 48:
                    if (exactPosition.equals("0")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r1_full_favourite);
                        return;
                    }
                    return;
                case 49:
                    if (exactPosition.equals("1")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r2_full_favourite);
                        return;
                    }
                    return;
                case 50:
                    if (exactPosition.equals("2")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite);
                        return;
                    }
                    return;
                case 51:
                    if (exactPosition.equals("3")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite);
                        return;
                    }
                    return;
                case 52:
                    if (exactPosition.equals("4")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite);
                        return;
                    }
                    return;
                case 53:
                    if (exactPosition.equals("5")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite);
                        return;
                    }
                    return;
                case 54:
                    if (exactPosition.equals("6")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_down_r7_full_favourite);
                        return;
                    }
                    return;
                case 55:
                    if (exactPosition.equals("7")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r1_full_favourite);
                        return;
                    }
                    return;
                case 56:
                    if (exactPosition.equals("8")) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r2_full_favourite);
                        return;
                    }
                    return;
                case 57:
                    if (exactPosition.equals(CrashDumperPlugin.OPTION_KILL_DEFAULT)) {
                        inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite);
                        return;
                    }
                    return;
                default:
                    switch (hashCode) {
                        case 1567:
                            if (exactPosition.equals("10")) {
                                inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite);
                                return;
                            }
                            return;
                        case 1568:
                            if (exactPosition.equals("11")) {
                                inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite);
                                return;
                            }
                            return;
                        case 1569:
                            if (exactPosition.equals("12")) {
                                inventoryExactPositionTextView.setBackgroundResource(R.mipmap.bottle_up_r6_full_favourite);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    private final void setNoWinePositionShow(InventoryExactPositionTextView inventoryExactPositionTextView, int i) {
        int i2 = R.mipmap.bottle_down_r6_full_active;
        switch (i) {
            case 1:
            case 10:
            case 19:
            case 28:
                i2 = R.mipmap.bottle_up_r2_full_active;
                break;
            case 2:
            case 11:
            case 20:
            case 29:
                i2 = R.mipmap.bottle_down_r3_full_active;
                break;
            case 3:
            case 12:
            case 21:
            case 30:
                i2 = R.mipmap.bottle_up_r3_full_active;
                break;
            case 4:
            case 13:
            case 22:
            case 31:
                i2 = R.mipmap.bottle_down_r4_full_active;
                break;
            case 5:
            case 14:
            case 23:
            case 32:
                i2 = R.mipmap.bottle_up_r4_full_active;
                break;
            case 6:
            case 15:
            case 24:
            case 33:
                i2 = R.mipmap.bottle_down_r5_full_active;
                break;
            case 7:
            case 16:
            case 25:
            case 34:
                i2 = R.mipmap.bottle_up_r5_full_active;
                break;
            case 8:
            case 17:
            case 26:
            case 35:
                break;
            default:
                i2 = R.mipmap.bottle_down_r2_full_active;
                break;
        }
        if (this.context instanceof InventoryMainActivity) {
            switch (i) {
                case 0:
                case 9:
                case 18:
                case 27:
                    i2 = R.mipmap.bottle_down_r2_full_disabled;
                    break;
                case 1:
                case 10:
                case 19:
                case 28:
                    i2 = R.mipmap.bottle_up_r2_full_disabled;
                    break;
                case 2:
                case 11:
                case 20:
                case 29:
                    i2 = R.mipmap.bottle_down_r3_full_disabled;
                    break;
                case 3:
                case 12:
                case 21:
                case 30:
                    i2 = R.mipmap.bottle_up_r3_full_disabled;
                    break;
                case 4:
                case 13:
                case 22:
                case 31:
                    i2 = R.mipmap.bottle_down_r4_full_disabled;
                    break;
                case 5:
                case 14:
                case 23:
                case 32:
                    i2 = R.mipmap.bottle_up_r4_full_disabled;
                    break;
                case 6:
                case 15:
                case 24:
                case 33:
                    i2 = R.mipmap.bottle_down_r5_full_disabled;
                    break;
                case 7:
                case 16:
                case 25:
                case 34:
                    i2 = R.mipmap.bottle_up_r5_full_disabled;
                    break;
                case 8:
                case 17:
                case 26:
                case 35:
                    i2 = R.mipmap.bottle_down_r6_full_disabled;
                    break;
            }
        }
        if (!inventoryExactPositionTextView.getHasWine()) {
            inventoryExactPositionTextView.setBackgroundResource(i2);
            inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(R.color.colorText_c4));
            inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r2_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r1_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r7_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r2_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r1_full_disabled;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setNoWinePositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = 2131623938(0x7f0e0002, float:1.8875042E38)
            switch(r20) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0037;
                case 2: goto L_0x0033;
                case 3: goto L_0x002f;
                case 4: goto L_0x002b;
                case 5: goto L_0x0027;
                case 6: goto L_0x0023;
                case 7: goto L_0x001f;
                case 8: goto L_0x001b;
                case 9: goto L_0x0017;
                case 10: goto L_0x0013;
                case 11: goto L_0x000f;
                case 12: goto L_0x000b;
                default: goto L_0x0008;
            }
        L_0x0008:
            r2 = r18
            goto L_0x003b
        L_0x000b:
            r1 = 2131623998(0x7f0e003e, float:1.8875163E38)
            goto L_0x0008
        L_0x000f:
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x0008
        L_0x0013:
            r1 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x0008
        L_0x0017:
            r1 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x0008
        L_0x001b:
            r1 = 2131623978(0x7f0e002a, float:1.8875123E38)
            goto L_0x0008
        L_0x001f:
            r1 = 2131623973(0x7f0e0025, float:1.8875113E38)
            goto L_0x0008
        L_0x0023:
            r1 = 2131623968(0x7f0e0020, float:1.8875102E38)
            goto L_0x0008
        L_0x0027:
            r1 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x0008
        L_0x002b:
            r1 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x0008
        L_0x002f:
            r1 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x0008
        L_0x0033:
            r1 = 2131623948(0x7f0e000c, float:1.8875062E38)
            goto L_0x0008
        L_0x0037:
            r1 = 2131623943(0x7f0e0007, float:1.8875052E38)
            goto L_0x0008
        L_0x003b:
            android.content.Context r3 = r2.context
            boolean r4 = r3 instanceof com.internationalwinecooler.p529ui.inventory.InventoryMainActivity
            r5 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r6 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r7 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r8 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r9 = 2131623979(0x7f0e002b, float:1.8875125E38)
            r10 = 2131623974(0x7f0e0026, float:1.8875115E38)
            r11 = 2131623969(0x7f0e0021, float:1.8875104E38)
            r12 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r13 = 2131623959(0x7f0e0017, float:1.8875084E38)
            r14 = 2131623954(0x7f0e0012, float:1.8875074E38)
            r15 = 2131623949(0x7f0e000d, float:1.8875064E38)
            r16 = 2131623944(0x7f0e0008, float:1.8875054E38)
            r17 = 2131623939(0x7f0e0003, float:1.8875044E38)
            if (r4 == 0) goto L_0x0093
            com.internationalwinecooler.ui.inventory.InventoryMainActivity r3 = (com.internationalwinecooler.p529ui.inventory.InventoryMainActivity) r3
            int r3 = r3.getSelectFilterCount()
            if (r3 <= 0) goto L_0x0074
            switch(r20) {
                case 0: goto L_0x0091;
                case 1: goto L_0x008e;
                case 2: goto L_0x008c;
                case 3: goto L_0x008a;
                case 4: goto L_0x0088;
                case 5: goto L_0x0086;
                case 6: goto L_0x0084;
                case 7: goto L_0x0082;
                case 8: goto L_0x0080;
                case 9: goto L_0x007e;
                case 10: goto L_0x007c;
                case 11: goto L_0x007a;
                case 12: goto L_0x0078;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x0093
        L_0x0074:
            switch(r20) {
                case 0: goto L_0x0091;
                case 1: goto L_0x008e;
                case 2: goto L_0x008c;
                case 3: goto L_0x008a;
                case 4: goto L_0x0088;
                case 5: goto L_0x0086;
                case 6: goto L_0x0084;
                case 7: goto L_0x0082;
                case 8: goto L_0x0080;
                case 9: goto L_0x007e;
                case 10: goto L_0x007c;
                case 11: goto L_0x007a;
                case 12: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x0093
        L_0x0078:
            r1 = r5
            goto L_0x0093
        L_0x007a:
            r1 = r6
            goto L_0x0093
        L_0x007c:
            r1 = r7
            goto L_0x0093
        L_0x007e:
            r1 = r8
            goto L_0x0093
        L_0x0080:
            r1 = r9
            goto L_0x0093
        L_0x0082:
            r1 = r10
            goto L_0x0093
        L_0x0084:
            r1 = r11
            goto L_0x0093
        L_0x0086:
            r1 = r12
            goto L_0x0093
        L_0x0088:
            r1 = r13
            goto L_0x0093
        L_0x008a:
            r1 = r14
            goto L_0x0093
        L_0x008c:
            r1 = r15
            goto L_0x0093
        L_0x008e:
            r1 = r16
            goto L_0x0093
        L_0x0091:
            r1 = r17
        L_0x0093:
            boolean r3 = r19.getHasWine()
            if (r3 != 0) goto L_0x00b2
            r0.setBackgroundResource(r1)
            android.content.res.Resources r1 = r19.getResources()
            r3 = 2131034191(0x7f05004f, float:1.7678893E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            r1 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r1)
            r0.setTypeface(r1)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setNoWinePositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cf, code lost:
        if (r0.equals("7") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d2, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r6_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01da, code lost:
        if (r0.equals("6") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dd, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e5, code lost:
        if (r0.equals("5") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e8, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fb, code lost:
        if (r0.equals("3") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01fe, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0206, code lost:
        if (r0.equals("2") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0211, code lost:
        if (r0.equals("1") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0214, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_active;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0222, code lost:
        r22 = com.hisense.juconnect.connectlife.R.color.colorBlack;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023d, code lost:
        if (r1.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0245, code lost:
        if (r1.equals("12") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x024d, code lost:
        if (r1.equals("11") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0255, code lost:
        if (r1.equals("10") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025d, code lost:
        if (r1.equals(com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin.OPTION_KILL_DEFAULT) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0265, code lost:
        if (r1.equals("8") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x026d, code lost:
        if (r1.equals("7") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0271, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r6_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0279, code lost:
        if (r1.equals("6") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x027c, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0284, code lost:
        if (r1.equals("5") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0287, code lost:
        r1 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029a, code lost:
        if (r1.equals("3") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x029d, code lost:
        r17 = r0;
        r19 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02a7, code lost:
        if (r1.equals("2") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02aa, code lost:
        r17 = r0;
        r19 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b4, code lost:
        if (r1.equals("1") == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b7, code lost:
        r17 = r0;
        r19 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c7, code lost:
        r17 = r0;
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r17 = r1;
        r18 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r19 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        if (r0.equals("12") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (r0.equals("11") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
        if (r0.equals("10") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r0.equals(com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin.OPTION_KILL_DEFAULT) == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        if (r0.equals("8") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        if (r0.equals("6") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013f, code lost:
        if (r0.equals("5") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r0.equals("3") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015d, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0166, code lost:
        if (r0.equals("2") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016a, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0173, code lost:
        if (r0.equals("1") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0177, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019f, code lost:
        if (r0.equals(com.facebook.stetho.websocket.WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13) == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a7, code lost:
        if (r0.equals("12") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01af, code lost:
        if (r0.equals("11") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b7, code lost:
        if (r0.equals("10") == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bf, code lost:
        if (r0.equals(com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin.OPTION_KILL_DEFAULT) == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.equals("8") == false) goto L_0x0225;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setOffstageOnItemView(com.hisense.connect_life.core.utils.Holder r27, com.juconnect.connectlife.model.WineInventoryBean r28) {
        /*
            r26 = this;
            r0 = r27
            boolean r1 = r28.isFilteredOut()
            java.lang.String r8 = "13"
            java.lang.String r9 = "12"
            java.lang.String r10 = "11"
            java.lang.String r11 = "10"
            java.lang.String r12 = "9"
            java.lang.String r13 = "8"
            java.lang.String r14 = "7"
            java.lang.String r15 = "6"
            java.lang.String r2 = "5"
            java.lang.String r3 = "4"
            java.lang.String r4 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "0"
            r22 = 2131034191(0x7f05004f, float:1.7678893E38)
            r23 = 2131623939(0x7f0e0003, float:1.8875044E38)
            r24 = 2131623940(0x7f0e0004, float:1.8875046E38)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x00c3
            int r25 = r1.hashCode()
            switch(r25) {
                case 48: goto L_0x00ae;
                case 49: goto L_0x009d;
                case 50: goto L_0x008c;
                case 51: goto L_0x007b;
                case 52: goto L_0x006d;
                case 53: goto L_0x005f;
                case 54: goto L_0x0050;
                case 55: goto L_0x0040;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = r23
            r16 = r24
            goto L_0x00bb
        L_0x0040:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0048
            goto L_0x00c3
        L_0x0048:
            r1 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r16 = 2131624000(0x7f0e0040, float:1.8875167E38)
            goto L_0x00bb
        L_0x0050:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0058
            goto L_0x00c3
        L_0x0058:
            r1 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r16 = 2131623995(0x7f0e003b, float:1.8875157E38)
            goto L_0x00bb
        L_0x005f:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0066
            goto L_0x00c3
        L_0x0066:
            r1 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r16 = 2131623990(0x7f0e0036, float:1.8875147E38)
            goto L_0x00bb
        L_0x006d:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0074
            goto L_0x00c3
        L_0x0074:
            r1 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r16 = 2131623985(0x7f0e0031, float:1.8875137E38)
            goto L_0x00bb
        L_0x007b:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0082
            goto L_0x00c3
        L_0x0082:
            r19 = r22
            r17 = 2131623964(0x7f0e001c, float:1.8875094E38)
        L_0x0087:
            r18 = 2131623965(0x7f0e001d, float:1.8875096E38)
            goto L_0x02d3
        L_0x008c:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0093
            goto L_0x00c3
        L_0x0093:
            r19 = r22
            r17 = 2131623959(0x7f0e0017, float:1.8875084E38)
        L_0x0098:
            r18 = 2131623960(0x7f0e0018, float:1.8875086E38)
            goto L_0x02d3
        L_0x009d:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00a4
            goto L_0x00c3
        L_0x00a4:
            r19 = r22
            r17 = 2131623954(0x7f0e0012, float:1.8875074E38)
        L_0x00a9:
            r18 = 2131623955(0x7f0e0013, float:1.8875076E38)
            goto L_0x02d3
        L_0x00ae:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00b5
            goto L_0x00c3
        L_0x00b5:
            r1 = 2131623949(0x7f0e000d, float:1.8875064E38)
            r16 = 2131623950(0x7f0e000e, float:1.8875066E38)
        L_0x00bb:
            r17 = r1
            r18 = r16
        L_0x00bf:
            r19 = r22
            goto L_0x02d3
        L_0x00c3:
            r19 = r22
            r17 = r23
        L_0x00c7:
            r18 = r24
            goto L_0x02d3
        L_0x00cb:
            java.lang.String r1 = r28.getExactPosition()
            java.lang.String r0 = "-1"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r1 = 2131034171(0x7f05003b, float:1.7678852E38)
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = r28.getExactPosition()
            if (r0 == 0) goto L_0x0225
            int r1 = r0.hashCode()
            switch(r1) {
                case 48: goto L_0x017c;
                case 49: goto L_0x016f;
                case 50: goto L_0x0162;
                case 51: goto L_0x0155;
                case 52: goto L_0x0148;
                case 53: goto L_0x013b;
                case 54: goto L_0x012e;
                case 55: goto L_0x0121;
                case 56: goto L_0x0119;
                case 57: goto L_0x0111;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            switch(r1) {
                case 1567: goto L_0x0109;
                case 1568: goto L_0x0101;
                case 1569: goto L_0x00f9;
                case 1570: goto L_0x00ec;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x0225
        L_0x00ec:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x00f4
            goto L_0x0225
        L_0x00f4:
            r23 = 2131623999(0x7f0e003f, float:1.8875165E38)
            goto L_0x0225
        L_0x00f9:
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0136
            goto L_0x0225
        L_0x0101:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0143
            goto L_0x0225
        L_0x0109:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x015d
            goto L_0x0225
        L_0x0111:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x016a
            goto L_0x0225
        L_0x0119:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0177
            goto L_0x0225
        L_0x0121:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0129
            goto L_0x0225
        L_0x0129:
            r0 = 2131623999(0x7f0e003f, float:1.8875165E38)
            goto L_0x0227
        L_0x012e:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0136
            goto L_0x0225
        L_0x0136:
            r0 = 2131623994(0x7f0e003a, float:1.8875155E38)
            goto L_0x0227
        L_0x013b:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0143
            goto L_0x0225
        L_0x0143:
            r0 = 2131623989(0x7f0e0035, float:1.8875145E38)
            goto L_0x0227
        L_0x0148:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0150
            goto L_0x0225
        L_0x0150:
            r0 = 2131623984(0x7f0e0030, float:1.8875135E38)
            goto L_0x0227
        L_0x0155:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x015d
            goto L_0x0225
        L_0x015d:
            r0 = 2131623964(0x7f0e001c, float:1.8875094E38)
            goto L_0x0227
        L_0x0162:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x016a
            goto L_0x0225
        L_0x016a:
            r0 = 2131623959(0x7f0e0017, float:1.8875084E38)
            goto L_0x0227
        L_0x016f:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0177
            goto L_0x0225
        L_0x0177:
            r0 = 2131623954(0x7f0e0012, float:1.8875074E38)
            goto L_0x0227
        L_0x017c:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0184
            goto L_0x0225
        L_0x0184:
            r0 = 2131623949(0x7f0e000d, float:1.8875064E38)
            goto L_0x0227
        L_0x0189:
            java.lang.String r0 = r28.getExactPosition()
            if (r0 == 0) goto L_0x0225
            int r17 = r0.hashCode()
            switch(r17) {
                case 48: goto L_0x0218;
                case 49: goto L_0x020d;
                case 50: goto L_0x0202;
                case 51: goto L_0x01f7;
                case 52: goto L_0x01ec;
                case 53: goto L_0x01e1;
                case 54: goto L_0x01d6;
                case 55: goto L_0x01cb;
                case 56: goto L_0x01c3;
                case 57: goto L_0x01bb;
                default: goto L_0x0196;
            }
        L_0x0196:
            switch(r17) {
                case 1567: goto L_0x01b3;
                case 1568: goto L_0x01ab;
                case 1569: goto L_0x01a3;
                case 1570: goto L_0x019b;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0225
        L_0x019b:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0225
        L_0x01a3:
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0225
        L_0x01ab:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x01e8
            goto L_0x0225
        L_0x01b3:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01fe
            goto L_0x0225
        L_0x01bb:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0209
            goto L_0x0225
        L_0x01c3:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0214
            goto L_0x0225
        L_0x01cb:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0225
        L_0x01d2:
            r0 = 2131623998(0x7f0e003e, float:1.8875163E38)
            goto L_0x0222
        L_0x01d6:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0225
        L_0x01dd:
            r0 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x0222
        L_0x01e1:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e8
            goto L_0x0225
        L_0x01e8:
            r0 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x0222
        L_0x01ec:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01f3
            goto L_0x0225
        L_0x01f3:
            r0 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x0222
        L_0x01f7:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01fe
            goto L_0x0225
        L_0x01fe:
            r0 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x0222
        L_0x0202:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0209
            goto L_0x0225
        L_0x0209:
            r0 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x0222
        L_0x020d:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0214
            goto L_0x0225
        L_0x0214:
            r0 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x0222
        L_0x0218:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x021f
            goto L_0x0225
        L_0x021f:
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
        L_0x0222:
            r22 = r1
            goto L_0x0227
        L_0x0225:
            r0 = r23
        L_0x0227:
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x02cd
            int r17 = r1.hashCode()
            switch(r17) {
                case 48: goto L_0x02bd;
                case 49: goto L_0x02b0;
                case 50: goto L_0x02a3;
                case 51: goto L_0x0296;
                case 52: goto L_0x028b;
                case 53: goto L_0x0280;
                case 54: goto L_0x0275;
                case 55: goto L_0x0269;
                case 56: goto L_0x0261;
                case 57: goto L_0x0259;
                default: goto L_0x0234;
            }
        L_0x0234:
            switch(r17) {
                case 1567: goto L_0x0251;
                case 1568: goto L_0x0249;
                case 1569: goto L_0x0241;
                case 1570: goto L_0x0239;
                default: goto L_0x0237;
            }
        L_0x0237:
            goto L_0x02cd
        L_0x0239:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0271
            goto L_0x02cd
        L_0x0241:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x027c
            goto L_0x02cd
        L_0x0249:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0287
            goto L_0x02cd
        L_0x0251:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x029d
            goto L_0x02cd
        L_0x0259:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x02aa
            goto L_0x02cd
        L_0x0261:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x02b7
            goto L_0x02cd
        L_0x0269:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0271
            goto L_0x02cd
        L_0x0271:
            r1 = 2131624000(0x7f0e0040, float:1.8875167E38)
            goto L_0x02c7
        L_0x0275:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x027c
            goto L_0x02cd
        L_0x027c:
            r1 = 2131623995(0x7f0e003b, float:1.8875157E38)
            goto L_0x02c7
        L_0x0280:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0287
            goto L_0x02cd
        L_0x0287:
            r1 = 2131623990(0x7f0e0036, float:1.8875147E38)
            goto L_0x02c7
        L_0x028b:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0292
            goto L_0x02cd
        L_0x0292:
            r1 = 2131623985(0x7f0e0031, float:1.8875137E38)
            goto L_0x02c7
        L_0x0296:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x029d
            goto L_0x02cd
        L_0x029d:
            r17 = r0
            r19 = r22
            goto L_0x0087
        L_0x02a3:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x02aa
            goto L_0x02cd
        L_0x02aa:
            r17 = r0
            r19 = r22
            goto L_0x0098
        L_0x02b0:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02b7
            goto L_0x02cd
        L_0x02b7:
            r17 = r0
            r19 = r22
            goto L_0x00a9
        L_0x02bd:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x02c4
            goto L_0x02cd
        L_0x02c4:
            r1 = 2131623950(0x7f0e000e, float:1.8875066E38)
        L_0x02c7:
            r17 = r0
            r18 = r1
            goto L_0x00bf
        L_0x02cd:
            r17 = r0
            r19 = r22
            goto L_0x00c7
        L_0x02d3:
            java.lang.String r0 = r28.getExactPosition()
            if (r0 == 0) goto L_0x04d6
            int r1 = r0.hashCode()
            switch(r1) {
                case 48: goto L_0x04b5;
                case 49: goto L_0x0493;
                case 50: goto L_0x0471;
                case 51: goto L_0x044d;
                case 52: goto L_0x0429;
                case 53: goto L_0x0405;
                case 54: goto L_0x03e1;
                case 55: goto L_0x03bd;
                case 56: goto L_0x0399;
                case 57: goto L_0x0375;
                default: goto L_0x02e0;
            }
        L_0x02e0:
            switch(r1) {
                case 1567: goto L_0x0351;
                case 1568: goto L_0x032d;
                case 1569: goto L_0x0309;
                case 1570: goto L_0x02e5;
                default: goto L_0x02e3;
            }
        L_0x02e3:
            goto L_0x04d6
        L_0x02e5:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02ed
            goto L_0x04d6
        L_0x02ed:
            r1 = r27
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b14
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b14"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0309:
            r1 = r27
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0313
            goto L_0x04d6
        L_0x0313:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b13
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b13"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x032d:
            r1 = r27
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0337
            goto L_0x04d6
        L_0x0337:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b12
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b12"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0351:
            r1 = r27
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x035b
            goto L_0x04d6
        L_0x035b:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f11
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f11"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0375:
            r1 = r27
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x037f
            goto L_0x04d6
        L_0x037f:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f10
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f10"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0399:
            r1 = r27
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x03a3
            goto L_0x04d6
        L_0x03a3:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f9
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f9"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x03bd:
            r1 = r27
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x03c7
            goto L_0x04d6
        L_0x03c7:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x03e1:
            r1 = r27
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x03eb
            goto L_0x04d6
        L_0x03eb:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0405:
            r1 = r27
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x040f
            goto L_0x04d6
        L_0x040f:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0429:
            r1 = r27
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0433
            goto L_0x04d6
        L_0x0433:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_b3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_b3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x044d:
            r1 = r27
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0457
            goto L_0x04d6
        L_0x0457:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0471:
            r1 = r27
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x047a
            goto L_0x04d6
        L_0x047a:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x0493:
            r1 = r27
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x049c
            goto L_0x04d6
        L_0x049c:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x04d6
        L_0x04b5:
            r1 = r27
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x04be
            goto L_0x04d6
        L_0x04be:
            android.view.View r0 = r1.itemView
            int r1 = com.juconnect.connect_life.R$id.offstage_on_text_f3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.offstage_on_text_f3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
        L_0x04d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setOffstageOnItemView(com.hisense.connect_life.core.utils.Holder, com.juconnect.connectlife.model.WineInventoryBean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_disabled;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setOffstageOnPositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView r12, int r13) {
        /*
            r11 = this;
            r0 = 2131623998(0x7f0e003e, float:1.8875163E38)
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            r2 = 2131623988(0x7f0e0034, float:1.8875143E38)
            r3 = 2131623963(0x7f0e001b, float:1.8875092E38)
            r4 = 2131623958(0x7f0e0016, float:1.8875082E38)
            r5 = 2131623953(0x7f0e0011, float:1.8875072E38)
            switch(r13) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0025;
                case 2: goto L_0x0023;
                case 3: goto L_0x0021;
                case 4: goto L_0x001d;
                case 5: goto L_0x001b;
                case 6: goto L_0x0019;
                case 7: goto L_0x002a;
                case 8: goto L_0x0025;
                case 9: goto L_0x0023;
                case 10: goto L_0x0021;
                case 11: goto L_0x001b;
                case 12: goto L_0x0019;
                case 13: goto L_0x002a;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 2131623938(0x7f0e0002, float:1.8875042E38)
            goto L_0x002a
        L_0x0019:
            r0 = r1
            goto L_0x002a
        L_0x001b:
            r0 = r2
            goto L_0x002a
        L_0x001d:
            r0 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x002a
        L_0x0021:
            r0 = r3
            goto L_0x002a
        L_0x0023:
            r0 = r4
            goto L_0x002a
        L_0x0025:
            r0 = r5
            goto L_0x002a
        L_0x0027:
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
        L_0x002a:
            android.content.Context r1 = r11.context
            boolean r2 = r1 instanceof com.internationalwinecooler.p529ui.inventory.InventoryMainActivity
            r3 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r4 = 2131623949(0x7f0e000d, float:1.8875064E38)
            r5 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r6 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r7 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r8 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r9 = 2131623959(0x7f0e0017, float:1.8875084E38)
            r10 = 2131623954(0x7f0e0012, float:1.8875074E38)
            if (r2 == 0) goto L_0x0067
            com.internationalwinecooler.ui.inventory.InventoryMainActivity r1 = (com.internationalwinecooler.p529ui.inventory.InventoryMainActivity) r1
            int r1 = r1.getSelectFilterCount()
            if (r1 <= 0) goto L_0x0054
            switch(r13) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0064;
                case 2: goto L_0x0062;
                case 3: goto L_0x0060;
                case 4: goto L_0x005e;
                case 5: goto L_0x005c;
                case 6: goto L_0x005a;
                case 7: goto L_0x0058;
                case 8: goto L_0x0064;
                case 9: goto L_0x0062;
                case 10: goto L_0x0060;
                case 11: goto L_0x005c;
                case 12: goto L_0x005a;
                case 13: goto L_0x0058;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0067
        L_0x0054:
            switch(r13) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0064;
                case 2: goto L_0x0062;
                case 3: goto L_0x0060;
                case 4: goto L_0x005e;
                case 5: goto L_0x005c;
                case 6: goto L_0x005a;
                case 7: goto L_0x0058;
                case 8: goto L_0x0064;
                case 9: goto L_0x0062;
                case 10: goto L_0x0060;
                case 11: goto L_0x005c;
                case 12: goto L_0x005a;
                case 13: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0067
        L_0x0058:
            r0 = r5
            goto L_0x0067
        L_0x005a:
            r0 = r6
            goto L_0x0067
        L_0x005c:
            r0 = r7
            goto L_0x0067
        L_0x005e:
            r0 = r3
            goto L_0x0067
        L_0x0060:
            r0 = r8
            goto L_0x0067
        L_0x0062:
            r0 = r9
            goto L_0x0067
        L_0x0064:
            r0 = r10
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            boolean r13 = r12.getHasWine()
            if (r13 != 0) goto L_0x0086
            r12.setBackgroundResource(r0)
            android.content.res.Resources r13 = r12.getResources()
            r0 = 2131034191(0x7f05004f, float:1.7678893E38)
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            r13 = 0
            android.graphics.Typeface r13 = android.graphics.Typeface.defaultFromStyle(r13)
            r12.setTypeface(r13)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setOffstageOnPositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView, int):void");
    }

    private final void setTwoExactWineInfoA1(int i, int i2, int i3, InventoryExactPositionTextView inventoryExactPositionTextView, WineInventoryBean wineInventoryBean) {
        inventoryExactPositionTextView.setHasWine(true);
        if (wineInventoryBean.isFavorite() != null) {
            Boolean isFavorite = wineInventoryBean.isFavorite();
            Intrinsics.checkNotNull(isFavorite);
            if (isFavorite.booleanValue()) {
                inventoryExactPositionTextView.setBackgroundResource(i2);
                inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(R.color.colorButton));
                inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
                inventoryExactPositionTextView.setOnClickListener(new C7599c(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
            }
        }
        inventoryExactPositionTextView.setBackgroundResource(i);
        inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView.getResources().getColor(i3));
        inventoryExactPositionTextView.setTypeface(Typeface.defaultFromStyle(1));
        inventoryExactPositionTextView.setOnClickListener(new C7599c(this, inventoryExactPositionTextView, inventoryExactPositionTextView, wineInventoryBean, i2, i, i3));
    }

    /* renamed from: setTwoExactWineInfoA1$lambda-14$lambda-13  reason: not valid java name */
    public static final void m27181setTwoExactWineInfoA1$lambda14$lambda13(InventoryExactShelfAdapter inventoryExactShelfAdapter, InventoryExactPositionTextView inventoryExactPositionTextView, InventoryExactPositionTextView inventoryExactPositionTextView2, WineInventoryBean wineInventoryBean, int i, int i2, int i3, View view) {
        Intrinsics.checkNotNullParameter(inventoryExactShelfAdapter, "this$0");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView, "$textView");
        Intrinsics.checkNotNullParameter(inventoryExactPositionTextView2, "$this_apply");
        Intrinsics.checkNotNullParameter(wineInventoryBean, "$wineInventoryBean");
        if (!inventoryExactShelfAdapter.isFristClick() && (inventoryExactShelfAdapter.mContext instanceof InventoryMainActivity)) {
            inventoryExactPositionTextView.setTextColor(inventoryExactPositionTextView2.getResources().getColor(R.color.white));
            if (wineInventoryBean.isFavorite() != null) {
                Boolean isFavorite = wineInventoryBean.isFavorite();
                Intrinsics.checkNotNull(isFavorite);
                if (isFavorite.booleanValue()) {
                    inventoryExactShelfAdapter.setLick(inventoryExactPositionTextView2, wineInventoryBean);
                    String exactPosition = wineInventoryBean.getExactPosition();
                    if (exactPosition != null) {
                        switch (exactPosition.hashCode()) {
                            case 48:
                                if (exactPosition.equals("0")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 49:
                                if (exactPosition.equals("1")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r4_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 50:
                                if (exactPosition.equals("2")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r5_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 51:
                                if (exactPosition.equals("3")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r6_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 52:
                                if (exactPosition.equals("4")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r3_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 53:
                                if (exactPosition.equals("5")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r4_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 54:
                                if (exactPosition.equals("6")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r5_full_favourite_selcted);
                                    break;
                                }
                                break;
                            case 55:
                                if (exactPosition.equals("7")) {
                                    inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r6_full_favourite_selcted);
                                    break;
                                }
                                break;
                        }
                    }
                    ((InventoryMainActivity) inventoryExactShelfAdapter.mContext).showWineDetail(wineInventoryBean, new InventoryExactShelfAdapter$setTwoExactWineInfoA1$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
                }
            }
            String exactPosition2 = wineInventoryBean.getExactPosition();
            if (exactPosition2 != null) {
                switch (exactPosition2.hashCode()) {
                    case 48:
                        if (exactPosition2.equals("0")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r3_selcted);
                            break;
                        }
                        break;
                    case 49:
                        if (exactPosition2.equals("1")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r4_selcted);
                            break;
                        }
                        break;
                    case 50:
                        if (exactPosition2.equals("2")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r5_selcted);
                            break;
                        }
                        break;
                    case 51:
                        if (exactPosition2.equals("3")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_down_r6_selcted);
                            break;
                        }
                        break;
                    case 52:
                        if (exactPosition2.equals("4")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r3_selcted);
                            break;
                        }
                        break;
                    case 53:
                        if (exactPosition2.equals("5")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r4_selcted);
                            break;
                        }
                        break;
                    case 54:
                        if (exactPosition2.equals("6")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r5_selcted);
                            break;
                        }
                        break;
                    case 55:
                        if (exactPosition2.equals("7")) {
                            inventoryExactPositionTextView2.setBackgroundResource(R.mipmap.bottle_up_r6_selcted);
                            break;
                        }
                        break;
                }
            }
            ((InventoryMainActivity) inventoryExactShelfAdapter.mContext).showWineDetail(wineInventoryBean, new InventoryExactShelfAdapter$setTwoExactWineInfoA1$1$1$1(wineInventoryBean, inventoryExactPositionTextView2, i, i2, i3));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d7, code lost:
        if (r8.equals("6") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r19 = r22;
        r18 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_favourite;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b2, code lost:
        r22 = com.hisense.juconnect.connectlife.R.color.colorBlack;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTwoItemView(com.hisense.connect_life.core.utils.Holder r27, com.juconnect.connectlife.model.WineInventoryBean r28) {
        /*
            r26 = this;
            r0 = r27
            boolean r1 = r28.isFilteredOut()
            r9 = 2131623959(0x7f0e0017, float:1.8875084E38)
            r10 = 2131623955(0x7f0e0013, float:1.8875076E38)
            r11 = 2131623954(0x7f0e0012, float:1.8875074E38)
            r12 = 2131623950(0x7f0e000e, float:1.8875066E38)
            r13 = 2131623949(0x7f0e000d, float:1.8875064E38)
            java.lang.String r14 = "7"
            java.lang.String r15 = "6"
            java.lang.String r2 = "5"
            java.lang.String r3 = "4"
            java.lang.String r4 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "0"
            r22 = 2131034191(0x7f05004f, float:1.7678893E38)
            r23 = 2131623939(0x7f0e0003, float:1.8875044E38)
            r24 = 2131623940(0x7f0e0004, float:1.8875046E38)
            if (r1 == 0) goto L_0x00cc
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x00c4
            int r25 = r1.hashCode()
            switch(r25) {
                case 48: goto L_0x00b5;
                case 49: goto L_0x00a9;
                case 50: goto L_0x0099;
                case 51: goto L_0x0088;
                case 52: goto L_0x0077;
                case 53: goto L_0x0066;
                case 54: goto L_0x0053;
                case 55: goto L_0x0041;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = r23
            goto L_0x0226
        L_0x0041:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0049
            goto L_0x00c4
        L_0x0049:
            r1 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r8 = 2131624000(0x7f0e0040, float:1.8875167E38)
            r24 = r8
            goto L_0x0226
        L_0x0053:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x005b
            goto L_0x00c4
        L_0x005b:
            r1 = 2131623994(0x7f0e003a, float:1.8875155E38)
        L_0x005e:
            r8 = 2131623995(0x7f0e003b, float:1.8875157E38)
        L_0x0061:
            r17 = r1
            r18 = r8
            goto L_0x00c0
        L_0x0066:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006d
            goto L_0x00c4
        L_0x006d:
            r19 = r22
            r17 = 2131623989(0x7f0e0035, float:1.8875145E38)
        L_0x0072:
            r18 = 2131623990(0x7f0e0036, float:1.8875147E38)
            goto L_0x022c
        L_0x0077:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x007e
            goto L_0x00c4
        L_0x007e:
            r19 = r22
            r17 = 2131623984(0x7f0e0030, float:1.8875135E38)
        L_0x0083:
            r18 = 2131623985(0x7f0e0031, float:1.8875137E38)
            goto L_0x022c
        L_0x0088:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008f
            goto L_0x00c4
        L_0x008f:
            r19 = r22
            r17 = 2131623964(0x7f0e001c, float:1.8875094E38)
        L_0x0094:
            r18 = 2131623965(0x7f0e001d, float:1.8875096E38)
            goto L_0x022c
        L_0x0099:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00a0
            goto L_0x00c4
        L_0x00a0:
            r17 = r9
        L_0x00a2:
            r19 = r22
            r18 = 2131623960(0x7f0e0018, float:1.8875086E38)
            goto L_0x022c
        L_0x00a9:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00b0
            goto L_0x00c4
        L_0x00b0:
            r18 = r10
            r17 = r11
            goto L_0x00c0
        L_0x00b5:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00bc
            goto L_0x00c4
        L_0x00bc:
            r18 = r12
            r17 = r13
        L_0x00c0:
            r19 = r22
            goto L_0x022c
        L_0x00c4:
            r19 = r22
            r17 = r23
        L_0x00c8:
            r18 = r24
            goto L_0x022c
        L_0x00cc:
            java.lang.String r1 = r28.getExactPosition()
            java.lang.String r8 = "-1"
            boolean r1 = android.text.TextUtils.equals(r1, r8)
            r8 = 2131034171(0x7f05003b, float:1.7678852E38)
            if (r1 == 0) goto L_0x014c
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x01b5
            int r8 = r1.hashCode()
            switch(r8) {
                case 48: goto L_0x0141;
                case 49: goto L_0x0136;
                case 50: goto L_0x012b;
                case 51: goto L_0x011e;
                case 52: goto L_0x0111;
                case 53: goto L_0x0104;
                case 54: goto L_0x00f7;
                case 55: goto L_0x00ea;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            goto L_0x01b5
        L_0x00ea:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00f2
            goto L_0x01b5
        L_0x00f2:
            r23 = 2131623999(0x7f0e003f, float:1.8875165E38)
            goto L_0x01b5
        L_0x00f7:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00ff
            goto L_0x01b5
        L_0x00ff:
            r1 = 2131623994(0x7f0e003a, float:1.8875155E38)
            goto L_0x01b7
        L_0x0104:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010c
            goto L_0x01b5
        L_0x010c:
            r1 = 2131623989(0x7f0e0035, float:1.8875145E38)
            goto L_0x01b7
        L_0x0111:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0119
            goto L_0x01b5
        L_0x0119:
            r1 = 2131623984(0x7f0e0030, float:1.8875135E38)
            goto L_0x01b7
        L_0x011e:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0126
            goto L_0x01b5
        L_0x0126:
            r1 = 2131623964(0x7f0e001c, float:1.8875094E38)
            goto L_0x01b7
        L_0x012b:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0133
            goto L_0x01b5
        L_0x0133:
            r1 = r9
            goto L_0x01b7
        L_0x0136:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x013e
            goto L_0x01b5
        L_0x013e:
            r1 = r11
            goto L_0x01b7
        L_0x0141:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0149
            goto L_0x01b5
        L_0x0149:
            r1 = r13
            goto L_0x01b7
        L_0x014c:
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x01b5
            int r9 = r1.hashCode()
            switch(r9) {
                case 48: goto L_0x01a8;
                case 49: goto L_0x019d;
                case 50: goto L_0x0192;
                case 51: goto L_0x0187;
                case 52: goto L_0x017c;
                case 53: goto L_0x0171;
                case 54: goto L_0x0166;
                case 55: goto L_0x015b;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x01b5
        L_0x015b:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0162
            goto L_0x01b5
        L_0x0162:
            r1 = 2131623998(0x7f0e003e, float:1.8875163E38)
            goto L_0x01b2
        L_0x0166:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x016d
            goto L_0x01b5
        L_0x016d:
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x01b2
        L_0x0171:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0178
            goto L_0x01b5
        L_0x0178:
            r1 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x01b2
        L_0x017c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0183
            goto L_0x01b5
        L_0x0183:
            r1 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x01b2
        L_0x0187:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x018e
            goto L_0x01b5
        L_0x018e:
            r1 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x01b2
        L_0x0192:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0199
            goto L_0x01b5
        L_0x0199:
            r1 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x01b2
        L_0x019d:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01a4
            goto L_0x01b5
        L_0x01a4:
            r1 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x01b2
        L_0x01a8:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x01af
            goto L_0x01b5
        L_0x01af:
            r1 = 2131623948(0x7f0e000c, float:1.8875062E38)
        L_0x01b2:
            r22 = r8
            goto L_0x01b7
        L_0x01b5:
            r1 = r23
        L_0x01b7:
            java.lang.String r8 = r28.getExactPosition()
            if (r8 == 0) goto L_0x0226
            int r9 = r8.hashCode()
            switch(r9) {
                case 48: goto L_0x0219;
                case 49: goto L_0x020c;
                case 50: goto L_0x0201;
                case 51: goto L_0x01f4;
                case 52: goto L_0x01e7;
                case 53: goto L_0x01da;
                case 54: goto L_0x01d3;
                case 55: goto L_0x01c6;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            goto L_0x0226
        L_0x01c6:
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x01ce
            goto L_0x0226
        L_0x01ce:
            r8 = 2131624000(0x7f0e0040, float:1.8875167E38)
            goto L_0x0061
        L_0x01d3:
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x005e
            goto L_0x0226
        L_0x01da:
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x01e1
            goto L_0x0226
        L_0x01e1:
            r17 = r1
            r19 = r22
            goto L_0x0072
        L_0x01e7:
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x01ee
            goto L_0x0226
        L_0x01ee:
            r17 = r1
            r19 = r22
            goto L_0x0083
        L_0x01f4:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x01fb
            goto L_0x0226
        L_0x01fb:
            r17 = r1
            r19 = r22
            goto L_0x0094
        L_0x0201:
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0208
            goto L_0x0226
        L_0x0208:
            r17 = r1
            goto L_0x00a2
        L_0x020c:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0213
            goto L_0x0226
        L_0x0213:
            r17 = r1
            r18 = r10
            goto L_0x00c0
        L_0x0219:
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0220
            goto L_0x0226
        L_0x0220:
            r17 = r1
            r18 = r12
            goto L_0x00c0
        L_0x0226:
            r17 = r1
            r19 = r22
            goto L_0x00c8
        L_0x022c:
            java.lang.String r1 = r28.getExactPosition()
            if (r1 == 0) goto L_0x0343
            int r8 = r1.hashCode()
            switch(r8) {
                case 48: goto L_0x0324;
                case 49: goto L_0x0304;
                case 50: goto L_0x02e4;
                case 51: goto L_0x02c3;
                case 52: goto L_0x02a1;
                case 53: goto L_0x027f;
                case 54: goto L_0x025d;
                case 55: goto L_0x023b;
                default: goto L_0x0239;
            }
        L_0x0239:
            goto L_0x0343
        L_0x023b:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0243
            goto L_0x0343
        L_0x0243:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_b6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_b6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x025d:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0265
            goto L_0x0343
        L_0x0265:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_b5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_b5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x027f:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0287
            goto L_0x0343
        L_0x0287:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_b4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_b4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x02a1:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02a9
            goto L_0x0343
        L_0x02a9:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_b3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_b3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x02c3:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x02cb
            goto L_0x0343
        L_0x02cb:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_f6
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_f6"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x02e4:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x02eb
            goto L_0x0343
        L_0x02eb:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_f5
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_f5"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x0304:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x030b
            goto L_0x0343
        L_0x030b:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_f4
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_f4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
            goto L_0x0343
        L_0x0324:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x032b
            goto L_0x0343
        L_0x032b:
            android.view.View r0 = r0.itemView
            int r1 = com.juconnect.connect_life.R$id.two_text_f3
            android.view.View r0 = r0.findViewById(r1)
            com.hisense.connect_life.core.widget.InventoryExactPositionTextView r0 = (com.hisense.connect_life.core.widget.InventoryExactPositionTextView) r0
            java.lang.String r1 = "holder.itemView.two_text_f3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r16 = r26
            r20 = r0
            r21 = r28
            r16.setTwoExactWineInfoA1(r17, r18, r19, r20, r21)
        L_0x0343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setTwoItemView(com.hisense.connect_life.core.utils.Holder, com.juconnect.connectlife.model.WineInventoryBean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_up_r3_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r6_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r5_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r4_full_disabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r0 = com.hisense.juconnect.connectlife.R.mipmap.bottle_down_r3_full_disabled;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTwoNoWinePositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView r12, int r13) {
        /*
            r11 = this;
            switch(r13) {
                case 0: goto L_0x0023;
                case 1: goto L_0x001f;
                case 2: goto L_0x001b;
                case 3: goto L_0x0017;
                case 4: goto L_0x0013;
                case 5: goto L_0x000f;
                case 6: goto L_0x000b;
                case 7: goto L_0x0007;
                default: goto L_0x0003;
            }
        L_0x0003:
            r0 = 2131623938(0x7f0e0002, float:1.8875042E38)
            goto L_0x0026
        L_0x0007:
            r0 = 2131623998(0x7f0e003e, float:1.8875163E38)
            goto L_0x0026
        L_0x000b:
            r0 = 2131623993(0x7f0e0039, float:1.8875153E38)
            goto L_0x0026
        L_0x000f:
            r0 = 2131623988(0x7f0e0034, float:1.8875143E38)
            goto L_0x0026
        L_0x0013:
            r0 = 2131623983(0x7f0e002f, float:1.8875133E38)
            goto L_0x0026
        L_0x0017:
            r0 = 2131623963(0x7f0e001b, float:1.8875092E38)
            goto L_0x0026
        L_0x001b:
            r0 = 2131623958(0x7f0e0016, float:1.8875082E38)
            goto L_0x0026
        L_0x001f:
            r0 = 2131623953(0x7f0e0011, float:1.8875072E38)
            goto L_0x0026
        L_0x0023:
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
        L_0x0026:
            android.content.Context r1 = r11.context
            boolean r2 = r1 instanceof com.internationalwinecooler.p529ui.inventory.InventoryMainActivity
            r3 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r4 = 2131623994(0x7f0e003a, float:1.8875155E38)
            r5 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r6 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r7 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r8 = 2131623959(0x7f0e0017, float:1.8875084E38)
            r9 = 2131623954(0x7f0e0012, float:1.8875074E38)
            r10 = 2131623949(0x7f0e000d, float:1.8875064E38)
            if (r2 == 0) goto L_0x0063
            com.internationalwinecooler.ui.inventory.InventoryMainActivity r1 = (com.internationalwinecooler.p529ui.inventory.InventoryMainActivity) r1
            int r1 = r1.getSelectFilterCount()
            if (r1 <= 0) goto L_0x0050
            switch(r13) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0060;
                case 2: goto L_0x005e;
                case 3: goto L_0x005c;
                case 4: goto L_0x005a;
                case 5: goto L_0x0058;
                case 6: goto L_0x0056;
                case 7: goto L_0x0054;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0063
        L_0x0050:
            switch(r13) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0060;
                case 2: goto L_0x005e;
                case 3: goto L_0x005c;
                case 4: goto L_0x005a;
                case 5: goto L_0x0058;
                case 6: goto L_0x0056;
                case 7: goto L_0x0054;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0063
        L_0x0054:
            r0 = r3
            goto L_0x0063
        L_0x0056:
            r0 = r4
            goto L_0x0063
        L_0x0058:
            r0 = r5
            goto L_0x0063
        L_0x005a:
            r0 = r6
            goto L_0x0063
        L_0x005c:
            r0 = r7
            goto L_0x0063
        L_0x005e:
            r0 = r8
            goto L_0x0063
        L_0x0060:
            r0 = r9
            goto L_0x0063
        L_0x0062:
            r0 = r10
        L_0x0063:
            boolean r13 = r12.getHasWine()
            if (r13 != 0) goto L_0x0082
            r12.setBackgroundResource(r0)
            android.content.res.Resources r13 = r12.getResources()
            r0 = 2131034191(0x7f05004f, float:1.7678893E38)
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            r13 = 0
            android.graphics.Typeface r13 = android.graphics.Typeface.defaultFromStyle(r13)
            r12.setTypeface(r13)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.internationalwinecooler.p529ui.adapter.cabinet_exact.InventoryExactShelfAdapter.setTwoNoWinePositionShows(com.hisense.connect_life.core.widget.InventoryExactPositionTextView, int):void");
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public int getItemCount() {
        List<? extends List<WineInventoryBean>> list = this.dataList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataList");
            list = null;
        }
        return list.size();
    }

    public final long getPrelongTim() {
        return this.prelongTim;
    }

    public final int getZoneType() {
        return this.zoneType;
    }

    public final void setData(@NotNull List<? extends List<WineInventoryBean>> list) {
        Intrinsics.checkNotNullParameter(list, "dataList");
        this.dataList = list;
    }

    public final void setPrelongTim(long j) {
        this.prelongTim = j;
    }

    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull Holder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<? extends List<WineInventoryBean>> list = null;
        switch (this.zoneType) {
            case 1:
                ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, Integer.valueOf(i + 1)));
                List<? extends List<WineInventoryBean>> list2 = this.dataList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataList");
                    list2 = null;
                }
                if (!list2.isEmpty()) {
                    List<? extends List<WineInventoryBean>> list3 = this.dataList;
                    if (list3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list3 = null;
                    }
                    if (!((Collection) list3.get(i)).isEmpty()) {
                        List<? extends List<WineInventoryBean>> list4 = this.dataList;
                        if (list4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        } else {
                            list = list4;
                        }
                        for (WineInventoryBean itemView : (Iterable) list.get(i)) {
                            setItemView(holder, itemView);
                        }
                    }
                }
                initWineState(holder);
                return;
            case 2:
                ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus("B", Integer.valueOf(i + 1)));
                List<? extends List<WineInventoryBean>> list5 = this.dataList;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataList");
                    list5 = null;
                }
                if (!list5.isEmpty()) {
                    List<? extends List<WineInventoryBean>> list6 = this.dataList;
                    if (list6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list6 = null;
                    }
                    if (!((Collection) list6.get(i)).isEmpty()) {
                        List<? extends List<WineInventoryBean>> list7 = this.dataList;
                        if (list7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        } else {
                            list = list7;
                        }
                        for (WineInventoryBean itemView2 : (Iterable) list.get(i)) {
                            setItemView(holder, itemView2);
                        }
                    }
                }
                initWineState(holder);
                return;
            case 3:
                if (i < 4) {
                    ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(0);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                    List<? extends List<WineInventoryBean>> list8 = this.dataList;
                    if (list8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list8 = null;
                    }
                    if (!list8.isEmpty()) {
                        List<? extends List<WineInventoryBean>> list9 = this.dataList;
                        if (list9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            list9 = null;
                        }
                        if (!((Collection) list9.get(i)).isEmpty()) {
                            List<? extends List<WineInventoryBean>> list10 = this.dataList;
                            if (list10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            } else {
                                list = list10;
                            }
                            for (WineInventoryBean itemView3 : (Iterable) list.get(i)) {
                                setItemView(holder, itemView3);
                            }
                        }
                    }
                } else {
                    ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(0);
                    List<? extends List<WineInventoryBean>> list11 = this.dataList;
                    if (list11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list11 = null;
                    }
                    if (!list11.isEmpty()) {
                        List<? extends List<WineInventoryBean>> list12 = this.dataList;
                        if (list12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            list12 = null;
                        }
                        if (!((Collection) list12.get(i)).isEmpty()) {
                            List<? extends List<WineInventoryBean>> list13 = this.dataList;
                            if (list13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            } else {
                                list = list13;
                            }
                            for (WineInventoryBean itemViewc5 : (Iterable) list.get(i)) {
                                setItemViewc5(holder, itemViewc5);
                            }
                        }
                    }
                }
                if (i > 3) {
                    ((TextView) holder.itemView.findViewById(R$id.textA)).setText("C5-1");
                } else {
                    ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus("C", Integer.valueOf(i + 1)));
                }
                initWineState(holder);
                return;
            case 4:
                if (i <= 1) {
                    ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.two_shelf_layout)).setVisibility(0);
                    List<? extends List<WineInventoryBean>> list14 = this.dataList;
                    if (list14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list14 = null;
                    }
                    if (!list14.isEmpty()) {
                        List<? extends List<WineInventoryBean>> list15 = this.dataList;
                        if (list15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            list15 = null;
                        }
                        if (!((Collection) list15.get(i)).isEmpty()) {
                            List<? extends List<WineInventoryBean>> list16 = this.dataList;
                            if (list16 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            } else {
                                list = list16;
                            }
                            for (WineInventoryBean twoItemView : (Iterable) list.get(i)) {
                                setTwoItemView(holder, twoItemView);
                            }
                        }
                    }
                    ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, Integer.valueOf(i + 1)));
                } else if (i >= 3) {
                    ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.two_shelf_layout)).setVisibility(0);
                    List<? extends List<WineInventoryBean>> list17 = this.dataList;
                    if (list17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list17 = null;
                    }
                    if (!list17.isEmpty()) {
                        List<? extends List<WineInventoryBean>> list18 = this.dataList;
                        if (list18 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            list18 = null;
                        }
                        if (!((Collection) list18.get(i)).isEmpty()) {
                            List<? extends List<WineInventoryBean>> list19 = this.dataList;
                            if (list19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            } else {
                                list = list19;
                            }
                            for (WineInventoryBean twoItemView2 : (Iterable) list.get(i)) {
                                setTwoItemView(holder, twoItemView2);
                            }
                        }
                    }
                    ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, Integer.valueOf(i + 1)));
                } else {
                    ((TextView) holder.itemView.findViewById(R$id.textA)).setText('A' + (i + 1) + "-1");
                    ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                    ((RelativeLayout) holder.itemView.findViewById(R$id.offstage_on_shelf_layout)).setVisibility(0);
                    List<? extends List<WineInventoryBean>> list20 = this.dataList;
                    if (list20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list20 = null;
                    }
                    if (!list20.isEmpty()) {
                        List<? extends List<WineInventoryBean>> list21 = this.dataList;
                        if (list21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            list21 = null;
                        }
                        if (!((Collection) list21.get(i)).isEmpty()) {
                            List<? extends List<WineInventoryBean>> list22 = this.dataList;
                            if (list22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dataList");
                            } else {
                                list = list22;
                            }
                            for (WineInventoryBean offstageOnItemView : (Iterable) list.get(i)) {
                                setOffstageOnItemView(holder, offstageOnItemView);
                            }
                        }
                    }
                }
                initWineState(holder);
                return;
            case 5:
                ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                ((RelativeLayout) holder.itemView.findViewById(R$id.two_shelf_layout)).setVisibility(0);
                ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, Integer.valueOf(i + 1)));
                List<? extends List<WineInventoryBean>> list23 = this.dataList;
                if (list23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataList");
                    list23 = null;
                }
                if (!list23.isEmpty()) {
                    List<? extends List<WineInventoryBean>> list24 = this.dataList;
                    if (list24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list24 = null;
                    }
                    if (!((Collection) list24.get(i)).isEmpty()) {
                        List<? extends List<WineInventoryBean>> list25 = this.dataList;
                        if (list25 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        } else {
                            list = list25;
                        }
                        for (WineInventoryBean twoItemView3 : (Iterable) list.get(i)) {
                            setTwoItemView(holder, twoItemView3);
                        }
                    }
                }
                initWineState(holder);
                return;
            case 6:
                ((RelativeLayout) holder.itemView.findViewById(R$id.shelf_layout)).setVisibility(8);
                ((RelativeLayout) holder.itemView.findViewById(R$id.c5_shelf_layout)).setVisibility(8);
                ((RelativeLayout) holder.itemView.findViewById(R$id.two_shelf_layout)).setVisibility(0);
                ((TextView) holder.itemView.findViewById(R$id.textA)).setText(Intrinsics.stringPlus("B", Integer.valueOf(i + 1)));
                List<? extends List<WineInventoryBean>> list26 = this.dataList;
                if (list26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataList");
                    list26 = null;
                }
                if (!list26.isEmpty()) {
                    List<? extends List<WineInventoryBean>> list27 = this.dataList;
                    if (list27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        list27 = null;
                    }
                    if (!((Collection) list27.get(i)).isEmpty()) {
                        List<? extends List<WineInventoryBean>> list28 = this.dataList;
                        if (list28 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dataList");
                        } else {
                            list = list28;
                        }
                        for (WineInventoryBean twoItemView4 : (Iterable) list.get(i)) {
                            setTwoItemView(holder, twoItemView4);
                        }
                    }
                }
                initWineState(holder);
                return;
            default:
                return;
        }
    }

    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inventory_exact_shelt_item_layout, viewGroup, false));
    }
}
