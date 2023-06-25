package com.hisense.connect_life.app_account.activity;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class UpgradeActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        UpgradeActivity upgradeActivity = (UpgradeActivity) obj;
        upgradeActivity.type = upgradeActivity.getIntent().getStringExtra("type");
        upgradeActivity.version = upgradeActivity.getIntent().getStringExtra("version");
        upgradeActivity.content = upgradeActivity.getIntent().getStringExtra(BrowserServiceFileProvider.CONTENT_SCHEME);
    }
}
