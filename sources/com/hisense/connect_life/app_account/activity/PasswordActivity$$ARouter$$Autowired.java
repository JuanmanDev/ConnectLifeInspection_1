package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class PasswordActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        PasswordActivity passwordActivity = (PasswordActivity) obj;
        passwordActivity.email = passwordActivity.getIntent().getStringExtra("email");
        passwordActivity.userName = passwordActivity.getIntent().getStringExtra(EventBusConstKt.USERNAME);
        passwordActivity.firstName = passwordActivity.getIntent().getStringExtra("firstName");
        passwordActivity.lastName = passwordActivity.getIntent().getStringExtra("lastName");
        passwordActivity.userIconBgColor = passwordActivity.getIntent().getIntExtra("userIconBgColor", passwordActivity.userIconBgColor);
        passwordActivity.photoUrl = passwordActivity.getIntent().getStringExtra("photoUrl");
    }
}
