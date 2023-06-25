package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class LoginResetFirstActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        LoginResetFirstActivity loginResetFirstActivity = (LoginResetFirstActivity) obj;
        loginResetFirstActivity.emailStr = loginResetFirstActivity.getIntent().getStringExtra("email");
        loginResetFirstActivity.isLogin = loginResetFirstActivity.getIntent().getStringExtra(EventBusConstKt.LOGIN);
        loginResetFirstActivity.deleteAccountTag = loginResetFirstActivity.getIntent().getStringExtra("DELETE_ACCOUNT");
    }
}
