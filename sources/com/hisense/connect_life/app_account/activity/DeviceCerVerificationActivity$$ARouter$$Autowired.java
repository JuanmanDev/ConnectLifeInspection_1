package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class DeviceCerVerificationActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        DeviceCerVerificationActivity deviceCerVerificationActivity = (DeviceCerVerificationActivity) obj;
        deviceCerVerificationActivity.email = deviceCerVerificationActivity.getIntent().getStringExtra("email");
        deviceCerVerificationActivity.password = deviceCerVerificationActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        deviceCerVerificationActivity.userProfile = (UserProfile) deviceCerVerificationActivity.getIntent().getSerializableExtra(EventBusConstKt.USERINFO);
    }
}