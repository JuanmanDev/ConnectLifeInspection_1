package com.hisense.juconnect.app_device.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class KeyLockActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        KeyLockActivity keyLockActivity = (KeyLockActivity) obj;
        keyLockActivity.deviceAuid = keyLockActivity.getIntent().getStringExtra("AUID");
        keyLockActivity.deviceid = keyLockActivity.getIntent().getStringExtra("DEVICEID");
        keyLockActivity.wifiId = keyLockActivity.getIntent().getStringExtra("WIFIID");
        keyLockActivity.isKeyLockOn = keyLockActivity.getIntent().getBooleanExtra("LOCKON", keyLockActivity.isKeyLockOn);
        keyLockActivity.isThreeZone = keyLockActivity.getIntent().getBooleanExtra("ISTHREEZONE", keyLockActivity.isThreeZone);
        keyLockActivity.isRemote = keyLockActivity.getIntent().getBooleanExtra("ISREMOTE", keyLockActivity.isRemote);
        keyLockActivity.isOffline = keyLockActivity.getIntent().getBooleanExtra("ISOFFLINE", keyLockActivity.isOffline);
        keyLockActivity.ChildLockNot = keyLockActivity.getIntent().getBooleanExtra("CHILDLOCKNOT", keyLockActivity.ChildLockNot);
        keyLockActivity.soundIsOpen = keyLockActivity.getIntent().getBooleanExtra("SOUNDISOPEN", keyLockActivity.soundIsOpen);
        keyLockActivity.ChildLockSet = keyLockActivity.getIntent().getBooleanExtra("CHILDLOCKSET", keyLockActivity.ChildLockSet);
    }
}
