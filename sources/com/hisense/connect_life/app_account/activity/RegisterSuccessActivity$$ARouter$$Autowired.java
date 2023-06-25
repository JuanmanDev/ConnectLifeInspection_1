package com.hisense.connect_life.app_account.activity;

import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class RegisterSuccessActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        RegisterSuccessActivity registerSuccessActivity = (RegisterSuccessActivity) obj;
        registerSuccessActivity.name = registerSuccessActivity.getIntent().getStringExtra("name");
        registerSuccessActivity.email = registerSuccessActivity.getIntent().getStringExtra("email");
        registerSuccessActivity.psw = registerSuccessActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        registerSuccessActivity.firstName = registerSuccessActivity.getIntent().getStringExtra("firstName");
        registerSuccessActivity.lastName = registerSuccessActivity.getIntent().getStringExtra("lastName");
        registerSuccessActivity.thirdPlatformId = registerSuccessActivity.getIntent().getStringExtra("thirdPlatformId");
        registerSuccessActivity.thirdLoginType = registerSuccessActivity.getIntent().getStringExtra("thirdLoginType");
        registerSuccessActivity.token = registerSuccessActivity.getIntent().getStringExtra(FirebaseMessagingService.EXTRA_TOKEN);
        registerSuccessActivity.f15746id = registerSuccessActivity.getIntent().getStringExtra("id");
        registerSuccessActivity.displayName = registerSuccessActivity.getIntent().getStringExtra(FileProvider.DISPLAYNAME_FIELD);
        registerSuccessActivity.photoUrl = registerSuccessActivity.getIntent().getStringExtra("photoUrl");
        registerSuccessActivity.thirdCallBackParams = registerSuccessActivity.getIntent().getStringExtra("thirdCallBackParams");
    }
}
