package p040c.p472t.p473a;

import com.hjq.permissions.PermissionFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.t.a.s */
/* compiled from: PermissionFragment */
public class C7583s implements C7567d {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f14273a;

    /* renamed from: b */
    public final /* synthetic */ int f14274b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f14275c;

    /* renamed from: d */
    public final /* synthetic */ PermissionFragment.C8648b f14276d;

    public C7583s(PermissionFragment.C8648b bVar, ArrayList arrayList, int i, ArrayList arrayList2) {
        this.f14276d = bVar;
        this.f14273a = arrayList;
        this.f14274b = i;
        this.f14275c = arrayList2;
    }

    public void onDenied(List<String> list, boolean z) {
        if (PermissionFragment.this.isAdded()) {
            int[] iArr = new int[this.f14273a.size()];
            for (int i = 0; i < this.f14273a.size(); i++) {
                iArr[i] = C7584t.m21534d(this.f14275c, (String) this.f14273a.get(i)) ? -1 : 0;
            }
            PermissionFragment.this.onRequestPermissionsResult(this.f14274b, (String[]) this.f14273a.toArray(new String[0]), iArr);
        }
    }

    public void onGranted(List<String> list, boolean z) {
        if (z && PermissionFragment.this.isAdded()) {
            int[] iArr = new int[this.f14273a.size()];
            Arrays.fill(iArr, 0);
            PermissionFragment.this.onRequestPermissionsResult(this.f14274b, (String[]) this.f14273a.toArray(new String[0]), iArr);
        }
    }
}
