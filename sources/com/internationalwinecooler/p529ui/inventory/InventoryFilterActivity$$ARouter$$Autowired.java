package com.internationalwinecooler.p529ui.inventory;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.internationalwinecooler.model.WineFilterModel;
import java.util.ArrayList;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.inventory.InventoryFilterActivity$$ARouter$$Autowired */
public class InventoryFilterActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        InventoryFilterActivity inventoryFilterActivity = (InventoryFilterActivity) obj;
        inventoryFilterActivity.currentFragmentTag = inventoryFilterActivity.getIntent().getIntExtra("currentFragmentTag", inventoryFilterActivity.currentFragmentTag);
        inventoryFilterActivity.filterModel = (WineFilterModel) inventoryFilterActivity.getIntent().getParcelableExtra("filterModel");
        inventoryFilterActivity.filterInType = inventoryFilterActivity.getIntent().getBooleanExtra("filterInType", inventoryFilterActivity.filterInType);
        inventoryFilterActivity.grapeTypeList = (ArrayList) inventoryFilterActivity.getIntent().getSerializableExtra("inventoryGrapeTypeList");
        inventoryFilterActivity.countriesList = (ArrayList) inventoryFilterActivity.getIntent().getSerializableExtra("inventoryCountryCodeList");
        inventoryFilterActivity.regionList = (ArrayList) inventoryFilterActivity.getIntent().getSerializableExtra("inventoryRegionsStringList");
        inventoryFilterActivity.wineTypeList = (ArrayList) inventoryFilterActivity.getIntent().getSerializableExtra("inventoryWineTypeStringList");
    }
}
