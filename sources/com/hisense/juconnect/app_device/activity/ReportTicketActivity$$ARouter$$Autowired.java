package com.hisense.juconnect.app_device.activity;

import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.hisense.connect_life.core.global.KeyConst;
import p040c.p041a.p042a.p043a.p045b.C1337a;

public class ReportTicketActivity$$ARouter$$Autowired implements ISyringe {
    public SerializationService serializationService;

    public void inject(Object obj) {
        this.serializationService = (SerializationService) C1337a.m211c().mo15014g(SerializationService.class);
        ReportTicketActivity reportTicketActivity = (ReportTicketActivity) obj;
        reportTicketActivity.time = reportTicketActivity.getIntent().getLongExtra("time", reportTicketActivity.time);
        reportTicketActivity.noid = reportTicketActivity.getIntent().getLongExtra("noid", reportTicketActivity.noid);
        reportTicketActivity.event = reportTicketActivity.getIntent().getStringExtra(NotificationCompat.CATEGORY_EVENT);
        reportTicketActivity.deviceId = reportTicketActivity.getIntent().getStringExtra("deviceId");
        reportTicketActivity.auid = reportTicketActivity.getIntent().getStringExtra(KeyConst.KEY_AUIT);
        reportTicketActivity.formatId = reportTicketActivity.getIntent().getStringExtra("formatId");
        reportTicketActivity.msgLevel = reportTicketActivity.getIntent().getStringExtra("msgLevel");
        reportTicketActivity.msgId = reportTicketActivity.getIntent().getStringExtra("msgId");
    }
}
