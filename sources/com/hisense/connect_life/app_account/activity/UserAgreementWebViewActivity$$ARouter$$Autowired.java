package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class UserAgreementWebViewActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        UserAgreementWebViewActivity userAgreementWebViewActivity = (UserAgreementWebViewActivity) obj;
        userAgreementWebViewActivity.title = userAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TITLE_TEXT);
        userAgreementWebViewActivity.url = userAgreementWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TARGET_URL);
    }
}
