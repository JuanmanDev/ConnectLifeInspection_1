package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class ChangeEmailSuccessActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        ChangeEmailSuccessActivity changeEmailSuccessActivity = (ChangeEmailSuccessActivity) obj;
        changeEmailSuccessActivity.newEmail = changeEmailSuccessActivity.getIntent().getStringExtra(KeyConst.LOGIN_EMAILS);
    }
}
