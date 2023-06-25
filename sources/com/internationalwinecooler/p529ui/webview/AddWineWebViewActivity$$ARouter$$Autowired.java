package com.internationalwinecooler.p529ui.webview;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.webview.AddWineWebViewActivity$$ARouter$$Autowired */
public class AddWineWebViewActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        AddWineWebViewActivity addWineWebViewActivity = (AddWineWebViewActivity) obj;
        addWineWebViewActivity.targetUrl = addWineWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TARGET_URL);
        addWineWebViewActivity.pathImage = addWineWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_IMAGE_PATH);
        addWineWebViewActivity.cId = addWineWebViewActivity.getIntent().getStringExtra(KeyConst.CATORY_ID_);
    }
}
