package com.amazon.identity.auth.device.authorization;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import com.amazon.identity.auth.device.workflow.WorkflowActivity;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

@SuppressLint({"Registered"})
public class AuthorizationActivity extends Activity {

    /* renamed from: e */
    public static final String f6899e = AuthorizationActivity.class.getName();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1485a.m828a(f6899e, "onCreate");
        WorkflowActivity.m9557a(getIntent().getData(), this, f6899e);
        C1485a.m828a(f6899e, "finish");
        finish();
    }
}
