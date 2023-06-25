package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import java.util.ArrayList;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class FirmwareUpdateActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        FirmwareUpdateActivity firmwareUpdateActivity = (FirmwareUpdateActivity) obj;
        firmwareUpdateActivity.upgradeInfoList = (ArrayList) firmwareUpdateActivity.getIntent().getSerializableExtra("upgradeInfoList");
    }
}
