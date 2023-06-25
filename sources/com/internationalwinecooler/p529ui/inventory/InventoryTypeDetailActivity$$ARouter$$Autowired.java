package com.internationalwinecooler.p529ui.inventory;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.inventory.InventoryTypeDetailActivity$$ARouter$$Autowired */
public class InventoryTypeDetailActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        InventoryTypeDetailActivity inventoryTypeDetailActivity = (InventoryTypeDetailActivity) obj;
        inventoryTypeDetailActivity.inventoryType = inventoryTypeDetailActivity.getIntent().getIntExtra("inventoryType", inventoryTypeDetailActivity.inventoryType);
    }
}
