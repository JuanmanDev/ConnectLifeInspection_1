package com.hjq.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p040c.p472t.p473a.C7564a;
import p040c.p472t.p473a.C7565b;
import p040c.p472t.p473a.C7566c;
import p040c.p472t.p473a.C7567d;
import p040c.p472t.p473a.C7571g;
import p040c.p472t.p473a.C7582r;
import p040c.p472t.p473a.C7583s;
import p040c.p472t.p473a.C7584t;

public final class PermissionFragment extends Fragment implements Runnable {

    /* renamed from: q */
    public static final List<Integer> f16436q = new ArrayList();

    /* renamed from: e */
    public boolean f16437e;

    /* renamed from: l */
    public boolean f16438l;

    /* renamed from: m */
    public boolean f16439m;

    /* renamed from: n */
    public C7567d f16440n;

    /* renamed from: o */
    public C7566c f16441o;

    /* renamed from: p */
    public int f16442p;

    /* renamed from: com.hjq.permissions.PermissionFragment$a */
    public class C8647a implements C7566c {
        public C8647a(PermissionFragment permissionFragment) {
        }
    }

    /* renamed from: com.hjq.permissions.PermissionFragment$b */
    public class C8648b implements C7567d {

        /* renamed from: a */
        public final /* synthetic */ Activity f16443a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f16444b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f16445c;

        /* renamed from: d */
        public final /* synthetic */ int f16446d;

        public C8648b(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i) {
            this.f16443a = activity;
            this.f16444b = arrayList;
            this.f16445c = arrayList2;
            this.f16446d = i;
        }

        /* renamed from: a */
        public /* synthetic */ void mo42926a(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i) {
            PermissionFragment.m23396b(activity, arrayList, new C7582r(this), new C7583s(this, arrayList2, i, arrayList));
        }

        public void onDenied(List<String> list, boolean z) {
            if (PermissionFragment.this.isAdded()) {
                int[] iArr = new int[this.f16445c.size()];
                Arrays.fill(iArr, -1);
                PermissionFragment.this.onRequestPermissionsResult(this.f16446d, (String[]) this.f16445c.toArray(new String[0]), iArr);
            }
        }

        public void onGranted(List<String> list, boolean z) {
            if (z && PermissionFragment.this.isAdded()) {
                C7584t.m21551u(new C7564a(this, this.f16443a, this.f16444b, this.f16445c, this.f16446d), C7565b.m21448f() ? 150 : 0);
            }
        }
    }

    /* renamed from: b */
    public static void m23396b(Activity activity, ArrayList<String> arrayList, C7566c cVar, C7567d dVar) {
        int nextInt;
        PermissionFragment permissionFragment = new PermissionFragment();
        Bundle bundle = new Bundle();
        do {
            nextInt = new Random().nextInt((int) Math.pow(2.0d, 8.0d));
        } while (f16436q.contains(Integer.valueOf(nextInt)));
        f16436q.add(Integer.valueOf(nextInt));
        bundle.putInt("request_code", nextInt);
        bundle.putStringArrayList("request_permissions", arrayList);
        permissionFragment.setArguments(bundle);
        permissionFragment.setRetainInstance(true);
        permissionFragment.mo42917i(true);
        permissionFragment.mo42915g(dVar);
        permissionFragment.mo42916h(cVar);
        permissionFragment.mo42911a(activity);
    }

    /* renamed from: a */
    public void mo42911a(Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    /* renamed from: d */
    public void mo42912d(Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    /* renamed from: e */
    public void mo42913e() {
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity != null && arguments != null) {
            int i = arguments.getInt("request_code");
            ArrayList<String> stringArrayList = arguments.getStringArrayList("request_permissions");
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                if (!C7565b.m21452j()) {
                    int size = stringArrayList.size();
                    int[] iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = C7571g.m21465f(activity, stringArrayList.get(i2)) ? 0 : -1;
                    }
                    onRequestPermissionsResult(i, (String[]) stringArrayList.toArray(new String[0]), iArr);
                } else if (C7565b.m21448f() && stringArrayList.size() >= 2 && C7584t.m21534d(stringArrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    ArrayList arrayList = new ArrayList(stringArrayList);
                    arrayList.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    mo42918j(activity, stringArrayList, arrayList, i);
                } else if (C7565b.m21445c() && stringArrayList.size() >= 2 && C7584t.m21534d(stringArrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    ArrayList arrayList2 = new ArrayList(stringArrayList);
                    arrayList2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    mo42918j(activity, stringArrayList, arrayList2, i);
                } else if (!C7565b.m21445c() || !C7584t.m21534d(stringArrayList, "android.permission.ACCESS_MEDIA_LOCATION") || !C7584t.m21534d(stringArrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    requestPermissions((String[]) stringArrayList.toArray(new String[(stringArrayList.size() - 1)]), i);
                } else {
                    ArrayList arrayList3 = new ArrayList(stringArrayList);
                    arrayList3.remove("android.permission.ACCESS_MEDIA_LOCATION");
                    mo42918j(activity, stringArrayList, arrayList3, i);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo42914f() {
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments != null && activity != null) {
            boolean z = false;
            for (String next : arguments.getStringArrayList("request_permissions")) {
                if (C7571g.m21469j(next) && !C7571g.m21465f(activity, next)) {
                    if (C7565b.m21446d() || !C7584t.m21535e(next, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                        startActivityForResult(C7584t.m21542l(activity, C7584t.m21532b(next)), getArguments().getInt("request_code"));
                        z = true;
                    }
                }
            }
            if (!z) {
                mo42913e();
            }
        }
    }

    /* renamed from: g */
    public void mo42915g(C7567d dVar) {
        this.f16440n = dVar;
    }

    /* renamed from: h */
    public void mo42916h(C7566c cVar) {
        this.f16441o = cVar;
    }

    /* renamed from: i */
    public void mo42917i(boolean z) {
        this.f16439m = z;
    }

    /* renamed from: j */
    public void mo42918j(Activity activity, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i) {
        ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.remove(it.next());
        }
        m23396b(activity, arrayList2, new C8647a(this), new C8648b(activity, arrayList3, arrayList, i));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayList;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity != null && arguments != null && !this.f16438l && i == arguments.getInt("request_code") && (stringArrayList = arguments.getStringArrayList("request_permissions")) != null && !stringArrayList.isEmpty()) {
            this.f16438l = true;
            C7584t.m21550t(stringArrayList, this);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity != null) {
            int requestedOrientation = activity.getRequestedOrientation();
            this.f16442p = requestedOrientation;
            if (requestedOrientation == -1) {
                C7584t.m21547q(activity);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f16440n = null;
    }

    public void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        if (activity != null && this.f16442p == -1 && activity.getRequestedOrientation() != -1) {
            activity.setRequestedOrientation(-1);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0) {
            Bundle arguments = getArguments();
            Activity activity = getActivity();
            if (activity != null && arguments != null && this.f16441o != null && i == arguments.getInt("request_code")) {
                C7567d dVar = this.f16440n;
                this.f16440n = null;
                C7566c cVar = this.f16441o;
                this.f16441o = null;
                C7584t.m21548r(activity, strArr, iArr);
                ArrayList b = C7584t.m21532b(strArr);
                f16436q.remove(Integer.valueOf(i));
                mo42912d(activity);
                List<String> d = C7571g.m21463d(b, iArr);
                if (d.size() == b.size()) {
                    cVar.mo33033c(activity, b, d, true, dVar);
                    return;
                }
                List<String> b2 = C7571g.m21461b(b, iArr);
                cVar.mo33031a(activity, b, b2, C7571g.m21468i(activity, b2), dVar);
                if (!d.isEmpty()) {
                    cVar.mo33033c(activity, b, d, false, dVar);
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f16439m) {
            mo42912d(getActivity());
        } else if (!this.f16437e) {
            this.f16437e = true;
            mo42914f();
        }
    }

    public void run() {
        if (isAdded()) {
            mo42913e();
        }
    }
}
