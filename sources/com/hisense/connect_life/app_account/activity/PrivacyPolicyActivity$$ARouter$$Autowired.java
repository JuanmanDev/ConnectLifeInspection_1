package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class PrivacyPolicyActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        PrivacyPolicyActivity privacyPolicyActivity = (PrivacyPolicyActivity) obj;
        privacyPolicyActivity.origin = privacyPolicyActivity.getIntent().getStringExtra(EventBusConstKt.ORIGIN);
        privacyPolicyActivity.termsConditionsUrl = privacyPolicyActivity.getIntent().getStringExtra("termsConditionsUrl");
        privacyPolicyActivity.vidaaPrivacyPolicyUrl = privacyPolicyActivity.getIntent().getStringExtra("vidaaPrivacyPolicyUrl");
        privacyPolicyActivity.connetlifePrivacyPolicyUrl = privacyPolicyActivity.getIntent().getStringExtra("connetlifePrivacyPolicyUrl");
        privacyPolicyActivity.loginEmail = privacyPolicyActivity.getIntent().getStringExtra("email");
        privacyPolicyActivity.loginPassWord = privacyPolicyActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        privacyPolicyActivity.idToken = privacyPolicyActivity.getIntent().getStringExtra(EventBusConstKt.ID_TOKEN);
        privacyPolicyActivity.thirdId = privacyPolicyActivity.getIntent().getStringExtra(EventBusConstKt.THIRD_ID);
        privacyPolicyActivity.thirdPlatformId = privacyPolicyActivity.getIntent().getStringExtra("thirdPlatformId");
    }
}
