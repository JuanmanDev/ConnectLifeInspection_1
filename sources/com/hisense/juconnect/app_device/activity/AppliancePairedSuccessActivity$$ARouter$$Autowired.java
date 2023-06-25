package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class AppliancePairedSuccessActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        AppliancePairedSuccessActivity appliancePairedSuccessActivity = (AppliancePairedSuccessActivity) obj;
        appliancePairedSuccessActivity.wifiId = appliancePairedSuccessActivity.getIntent().getStringExtra(EventBusConstKt.WIFIID);
        appliancePairedSuccessActivity.deviceId = appliancePairedSuccessActivity.getIntent().getStringExtra("deviceId");
        appliancePairedSuccessActivity.applianceName = appliancePairedSuccessActivity.getIntent().getStringExtra(EventBusConstKt.APPLIANCENAME);
    }
}
