package com.hisense.juconnect.app_device.activity;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class DeviceInfoActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        DeviceInfoActivity deviceInfoActivity = (DeviceInfoActivity) obj;
        deviceInfoActivity.bundle = (Bundle) deviceInfoActivity.getIntent().getParcelableExtra(EventBusConstKt.DEVICE_INFO_BUNDLE);
    }
}
