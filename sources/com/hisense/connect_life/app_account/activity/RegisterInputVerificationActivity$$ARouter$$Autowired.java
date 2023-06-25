package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class RegisterInputVerificationActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        RegisterInputVerificationActivity registerInputVerificationActivity = (RegisterInputVerificationActivity) obj;
        registerInputVerificationActivity.email = registerInputVerificationActivity.getIntent().getStringExtra("email");
        registerInputVerificationActivity.password = registerInputVerificationActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        registerInputVerificationActivity.userProfile = (UserProfile) registerInputVerificationActivity.getIntent().getSerializableExtra(EventBusConstKt.USERINFO);
        registerInputVerificationActivity.origin = registerInputVerificationActivity.getIntent().getStringExtra(EventBusConstKt.ORIGIN);
        registerInputVerificationActivity.thirdPlatformId = registerInputVerificationActivity.getIntent().getStringExtra("thirdPlatformId");
        registerInputVerificationActivity.thirdLoginType = registerInputVerificationActivity.getIntent().getStringExtra("thirdLoginType");
        registerInputVerificationActivity.token = registerInputVerificationActivity.getIntent().getStringExtra(FirebaseMessagingService.EXTRA_TOKEN);
    }
}
