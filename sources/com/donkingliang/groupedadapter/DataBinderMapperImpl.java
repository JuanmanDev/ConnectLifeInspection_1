package com.donkingliang.groupedadapter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f7148a = new SparseIntArray(0);

    /* renamed from: com.donkingliang.groupedadapter.DataBinderMapperImpl$a */
    public static class C3869a {

        /* renamed from: a */
        public static final SparseArray<String> f7149a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            f7149a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.DataBinderMapperImpl$b */
    public static class C3870b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f7150a = new HashMap<>(0);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i) {
        return C3869a.f7149a.get(i);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f7148a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C3870b.f7150a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f7148a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
