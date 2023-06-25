package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class SurfaceCombination {
    public final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    public static void generateArrangements(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add(iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                generateArrangements(list, i, iArr, i2 + 1);
            }
        }
    }

    private List<int[]> getElementsArrangements(int i) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        if (surfaceConfig == null) {
            return false;
        }
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean isSupported(List<SurfaceConfig> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (list.size() > this.mSurfaceConfigList.size()) {
            return false;
        }
        Iterator<int[]> it = getElementsArrangements(this.mSurfaceConfigList.size()).iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            boolean z = true;
            int i = 0;
            while (i < this.mSurfaceConfigList.size() && (next[i] >= list.size() || ((z = z & this.mSurfaceConfigList.get(i).isSupported(list.get(next[i])))))) {
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        if (surfaceConfig == null) {
            return false;
        }
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
