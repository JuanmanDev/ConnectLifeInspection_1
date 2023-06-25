package com.internationalwinecooler.p529ui.webview;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: com.internationalwinecooler.ui.webview.PropWebViewActivity$$ARouter$$Autowired */
public class PropWebViewActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        PropWebViewActivity propWebViewActivity = (PropWebViewActivity) obj;
        propWebViewActivity.deviceIds = propWebViewActivity.getIntent().getStringExtra("deviceId");
        propWebViewActivity.targetUrl = propWebViewActivity.getIntent().getStringExtra(KeyConst.KEY_TARGET_URL);
    }
}
