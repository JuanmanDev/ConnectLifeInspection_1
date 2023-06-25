package com.juconnect.connect_life.model;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/juconnect/connect_life/model/FirmwareManualsInfo;", "Ljava/util/ArrayList;", "Lcom/juconnect/connect_life/model/FirmwareManualsInfoItem;", "Lkotlin/collections/ArrayList;", "()V", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirmwareManualsInfo.kt */
public final class FirmwareManualsInfo extends ArrayList<FirmwareManualsInfoItem> {
    public /* bridge */ boolean contains(FirmwareManualsInfoItem firmwareManualsInfoItem) {
        return super.contains(firmwareManualsInfoItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(FirmwareManualsInfoItem firmwareManualsInfoItem) {
        return super.indexOf(firmwareManualsInfoItem);
    }

    public /* bridge */ int lastIndexOf(FirmwareManualsInfoItem firmwareManualsInfoItem) {
        return super.lastIndexOf(firmwareManualsInfoItem);
    }

    public final /* bridge */ FirmwareManualsInfoItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ FirmwareManualsInfoItem removeAt(int i) {
        return (FirmwareManualsInfoItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof FirmwareManualsInfoItem)) {
            return false;
        }
        return contains((FirmwareManualsInfoItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof FirmwareManualsInfoItem)) {
            return -1;
        }
        return indexOf((FirmwareManualsInfoItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof FirmwareManualsInfoItem)) {
            return -1;
        }
        return lastIndexOf((FirmwareManualsInfoItem) obj);
    }

    public /* bridge */ boolean remove(FirmwareManualsInfoItem firmwareManualsInfoItem) {
        return super.remove(firmwareManualsInfoItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof FirmwareManualsInfoItem)) {
            return false;
        }
        return remove((FirmwareManualsInfoItem) obj);
    }
}
