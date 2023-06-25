package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "", "sortId", "", "(Ljava/lang/String;)V", "addedDateSort", "", "getAddedDateSort", "()Ljava/lang/Integer;", "setAddedDateSort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "letterSort", "getLetterSort", "setLetterSort", "produceYearSort", "getProduceYearSort", "setProduceYearSort", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategory.kt */
public final class SortCondition {
    @Nullable
    public Integer addedDateSort;
    @Nullable
    public Integer letterSort;
    @Nullable
    public Integer produceYearSort;

    public SortCondition(@Nullable String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        this.produceYearSort = 1;
                        return;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        this.produceYearSort = 2;
                        return;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        this.letterSort = 1;
                        return;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        this.letterSort = 2;
                        return;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        this.addedDateSort = 2;
                        return;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        this.addedDateSort = 1;
                        return;
                    }
                    break;
            }
        }
        this.letterSort = 1;
    }

    @Nullable
    public final Integer getAddedDateSort() {
        return this.addedDateSort;
    }

    @Nullable
    public final Integer getLetterSort() {
        return this.letterSort;
    }

    @Nullable
    public final Integer getProduceYearSort() {
        return this.produceYearSort;
    }

    public final void setAddedDateSort(@Nullable Integer num) {
        this.addedDateSort = num;
    }

    public final void setLetterSort(@Nullable Integer num) {
        this.letterSort = num;
    }

    public final void setProduceYearSort(@Nullable Integer num) {
        this.produceYearSort = num;
    }
}
