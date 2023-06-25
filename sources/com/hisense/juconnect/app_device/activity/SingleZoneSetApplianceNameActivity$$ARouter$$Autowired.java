package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class SingleZoneSetApplianceNameActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity = (SingleZoneSetApplianceNameActivity) obj;
        singleZoneSetApplianceNameActivity.mDevId = singleZoneSetApplianceNameActivity.getIntent().getStringExtra("DevId");
        singleZoneSetApplianceNameActivity.mWifiId = singleZoneSetApplianceNameActivity.getIntent().getStringExtra("WifiId");
        singleZoneSetApplianceNameActivity.mDevType = singleZoneSetApplianceNameActivity.getIntent().getStringExtra("DevType");
        singleZoneSetApplianceNameActivity.myFrom = singleZoneSetApplianceNameActivity.getIntent().getStringExtra("from");
    }
}
