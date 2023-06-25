package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class WineLabelPictureActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        WineLabelPictureActivity wineLabelPictureActivity = (WineLabelPictureActivity) obj;
        wineLabelPictureActivity.typeScanner = wineLabelPictureActivity.getIntent().getStringExtra(KeyConst.KEY_WINE_SCANNER);
        wineLabelPictureActivity.pathImage = wineLabelPictureActivity.getIntent().getStringExtra("path");
    }
}
