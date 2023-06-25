package com.chad.library;

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
    public static final SparseIntArray f7058a = new SparseIntArray(0);

    /* renamed from: com.chad.library.DataBinderMapperImpl$a */
    public static class C3837a {

        /* renamed from: a */
        public static final SparseArray<String> f7059a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f7059a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: com.chad.library.DataBinderMapperImpl$b */
    public static class C3838b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f7060a = new HashMap<>(0);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i) {
        return C3837a.f7059a.get(i);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f7058a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C3838b.f7060a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f7058a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
