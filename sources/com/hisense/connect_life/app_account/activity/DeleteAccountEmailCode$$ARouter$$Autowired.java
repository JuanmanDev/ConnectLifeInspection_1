package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class DeleteAccountEmailCode$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        DeleteAccountEmailCode deleteAccountEmailCode = (DeleteAccountEmailCode) obj;
        deleteAccountEmailCode.emailStr = deleteAccountEmailCode.getIntent().getStringExtra("email");
    }
}
