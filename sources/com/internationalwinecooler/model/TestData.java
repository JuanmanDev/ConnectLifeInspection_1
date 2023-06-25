package com.internationalwinecooler.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo47991d2 = {"Lcom/internationalwinecooler/model/TestData;", "", "A", "", "B", "c", "(III)V", "getA", "()I", "getB", "getC", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TestData.kt */
public final class TestData {

    /* renamed from: A */
    public final int f16454A;

    /* renamed from: B */
    public final int f16455B;

    /* renamed from: c */
    public final int f16456c;

    public TestData(int i, int i2, int i3) {
        this.f16454A = i;
        this.f16455B = i2;
        this.f16456c = i3;
    }

    public static /* synthetic */ TestData copy$default(TestData testData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = testData.f16454A;
        }
        if ((i4 & 2) != 0) {
            i2 = testData.f16455B;
        }
        if ((i4 & 4) != 0) {
            i3 = testData.f16456c;
        }
        return testData.copy(i, i2, i3);
    }

    public final int component1() {
        return this.f16454A;
    }

    public final int component2() {
        return this.f16455B;
    }

    public final int component3() {
        return this.f16456c;
    }

    @NotNull
    public final TestData copy(int i, int i2, int i3) {
        return new TestData(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestData)) {
            return false;
        }
        TestData testData = (TestData) obj;
        return this.f16454A == testData.f16454A && this.f16455B == testData.f16455B && this.f16456c == testData.f16456c;
    }

    public final int getA() {
        return this.f16454A;
    }

    public final int getB() {
        return this.f16455B;
    }

    public final int getC() {
        return this.f16456c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f16454A) * 31) + Integer.hashCode(this.f16455B)) * 31) + Integer.hashCode(this.f16456c);
    }

    @NotNull
    public String toString() {
        return "TestData(A=" + this.f16454A + ", B=" + this.f16455B + ", c=" + this.f16456c + ')';
    }
}
