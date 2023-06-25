package com.internationalwinecooler.p529ui.inventory;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.inventory.InventorySelectTypeActivity$$ARouter$$Autowired */
public class InventorySelectTypeActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        InventorySelectTypeActivity inventorySelectTypeActivity = (InventorySelectTypeActivity) obj;
        inventorySelectTypeActivity.isShowSecond = inventorySelectTypeActivity.getIntent().getBooleanExtra("isShowSecond", inventorySelectTypeActivity.isShowSecond);
        inventorySelectTypeActivity.deviceAuid = inventorySelectTypeActivity.getIntent().getStringExtra(KeyConst.KEY_AUIT);
    }
}
