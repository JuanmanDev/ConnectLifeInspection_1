package com.hisense.juconnect.app_device.activity;

import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class AddTicketActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        AddTicketActivity addTicketActivity = (AddTicketActivity) obj;
        addTicketActivity.deviceId = addTicketActivity.getIntent().getStringExtra("deviceId");
        addTicketActivity.event = addTicketActivity.getIntent().getStringExtra(NotificationCompat.CATEGORY_EVENT);
    }
}
