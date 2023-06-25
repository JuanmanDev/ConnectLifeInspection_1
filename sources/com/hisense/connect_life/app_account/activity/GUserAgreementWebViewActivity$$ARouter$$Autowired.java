package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class GUserAgreementWebViewActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        GUserAgreementWebViewActivity gUserAgreementWebViewActivity = (GUserAgreementWebViewActivity) obj;
        gUserAgreementWebViewActivity.title = gUserAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TITLE_TEXT);
        gUserAgreementWebViewActivity.url = gUserAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TARGET_URL);
        gUserAgreementWebViewActivity.from = gUserAgreementWebViewActivity.getIntent().getStringExtra("from");
        gUserAgreementWebViewActivity.agreementUrl = gUserAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.USER_AGREEMENT_URL);
        gUserAgreementWebViewActivity.privacyPolicyUrl = gUserAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.USER_PRIVACY_POLICY);
        gUserAgreementWebViewActivity.userEmail = gUserAgreementWebViewActivity.getIntent().getStringExtra("email");
        gUserAgreementWebViewActivity.userPassword = gUserAgreementWebViewActivity.getIntent().getStringExtra(EventBusConstKt.PSW);
        gUserAgreementWebViewActivity.idToken = gUserAgreementWebViewActivity.getIntent().getStringExtra(EventBusConstKt.ID_TOKEN);
    }
}
