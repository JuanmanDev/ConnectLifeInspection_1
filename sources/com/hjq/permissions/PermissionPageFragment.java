package com.hjq.permissions;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.InputDeviceCompat;
import java.util.ArrayList;
import p040c.p472t.p473a.C7568e;
import p040c.p472t.p473a.C7571g;
import p040c.p472t.p473a.C7584t;

public final class PermissionPageFragment extends Fragment implements Runnable {

    /* renamed from: e */
    public C7568e f16448e;

    /* renamed from: l */
    public boolean f16449l;

    /* renamed from: m */
    public boolean f16450m;

    /* renamed from: a */
    public void mo42927a(Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayList;
        if (i == 1025) {
            Activity activity = getActivity();
            Bundle arguments = getArguments();
            if (activity != null && arguments != null && (stringArrayList = arguments.getStringArrayList("request_permissions")) != null && !stringArrayList.isEmpty()) {
                C7584t.m21550t(stringArrayList, this);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f16449l) {
            mo42927a(getActivity());
        } else if (!this.f16450m) {
            this.f16450m = true;
            Bundle arguments = getArguments();
            Activity activity = getActivity();
            if (arguments != null && activity != null) {
                startActivityForResult(C7584t.m21542l(getActivity(), arguments.getStringArrayList("request_permissions")), InputDeviceCompat.SOURCE_GAMEPAD);
            }
        }
    }

    public void run() {
        Activity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            C7568e eVar = this.f16448e;
            this.f16448e = null;
            if (eVar == null) {
                mo42927a(getActivity());
                return;
            }
            ArrayList<String> stringArrayList = getArguments().getStringArrayList("request_permissions");
            if (C7571g.m21462c(activity, stringArrayList).size() == stringArrayList.size()) {
                eVar.mo33034a();
            } else {
                eVar.mo33035b();
            }
        }
    }
}
