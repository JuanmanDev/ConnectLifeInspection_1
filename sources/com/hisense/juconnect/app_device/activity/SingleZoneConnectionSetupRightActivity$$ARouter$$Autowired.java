package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class SingleZoneConnectionSetupRightActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        SingleZoneConnectionSetupRightActivity singleZoneConnectionSetupRightActivity = (SingleZoneConnectionSetupRightActivity) obj;
        singleZoneConnectionSetupRightActivity.mDevId = singleZoneConnectionSetupRightActivity.getIntent().getStringExtra("DevId");
        singleZoneConnectionSetupRightActivity.mWifiId = singleZoneConnectionSetupRightActivity.getIntent().getStringExtra("WifiId");
        singleZoneConnectionSetupRightActivity.mDevType = singleZoneConnectionSetupRightActivity.getIntent().getStringExtra("DevType");
    }
}
