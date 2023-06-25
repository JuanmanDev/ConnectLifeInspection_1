package com.hisense.connect_life.app_account.activity;

import androidx.core.content.FileProvider;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class RegisterInputUserInfoActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        RegisterInputUserInfoActivity registerInputUserInfoActivity = (RegisterInputUserInfoActivity) obj;
        registerInputUserInfoActivity.origin = registerInputUserInfoActivity.getIntent().getStringExtra(EventBusConstKt.ORIGIN);
        registerInputUserInfoActivity.email = registerInputUserInfoActivity.getIntent().getStringExtra("email");
        registerInputUserInfoActivity.psw = registerInputUserInfoActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        registerInputUserInfoActivity.thirdPlatformId = registerInputUserInfoActivity.getIntent().getStringExtra("thirdPlatformId");
        registerInputUserInfoActivity.thirdLoginType = registerInputUserInfoActivity.getIntent().getStringExtra("thirdLoginType");
        registerInputUserInfoActivity.token = registerInputUserInfoActivity.getIntent().getStringExtra(FirebaseMessagingService.EXTRA_TOKEN);
        registerInputUserInfoActivity.f15744id = registerInputUserInfoActivity.getIntent().getStringExtra("id");
        registerInputUserInfoActivity.displayName = registerInputUserInfoActivity.getIntent().getStringExtra(FileProvider.DISPLAYNAME_FIELD);
        registerInputUserInfoActivity.photoUrl = registerInputUserInfoActivity.getIntent().getStringExtra("photoUrl");
        registerInputUserInfoActivity.thirdCallBackParams = registerInputUserInfoActivity.getIntent().getStringExtra("thirdCallBackParams");
    }
}
