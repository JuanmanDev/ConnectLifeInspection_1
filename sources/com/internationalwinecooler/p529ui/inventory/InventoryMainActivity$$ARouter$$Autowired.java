package com.internationalwinecooler.p529ui.inventory;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.inventory.InventoryMainActivity$$ARouter$$Autowired */
public class InventoryMainActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        InventoryMainActivity inventoryMainActivity = (InventoryMainActivity) obj;
        inventoryMainActivity.deviceAuid = inventoryMainActivity.getIntent().getStringExtra(KeyConst.KEY_AUIT);
        inventoryMainActivity.expired = inventoryMainActivity.getIntent().getBooleanExtra("expired", inventoryMainActivity.expired);
    }
}
