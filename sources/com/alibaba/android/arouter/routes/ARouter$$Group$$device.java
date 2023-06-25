package com.alibaba.android.arouter.routes;

import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_device.activity.AddApplianceFirstActivity;
import com.hisense.juconnect.app_device.activity.AddApplianceSinglePairActivity;
import com.hisense.juconnect.app_device.activity.AddNewWifiInstructionsActivity;
import com.hisense.juconnect.app_device.activity.AddTicketActivity;
import com.hisense.juconnect.app_device.activity.ApplianceManagementActivity;
import com.hisense.juconnect.app_device.activity.AppliancePairedSuccessActivity;
import com.hisense.juconnect.app_device.activity.ApplicationSettingsActivity;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;
import com.hisense.juconnect.app_device.activity.FirmwareUpdateActivity;
import com.hisense.juconnect.app_device.activity.KeyLockActivity;
import com.hisense.juconnect.app_device.activity.ManualHtmlViewActivity;
import com.hisense.juconnect.app_device.activity.ManualListActivity;
import com.hisense.juconnect.app_device.activity.ManualPdfViewActivity;
import com.hisense.juconnect.app_device.activity.NameApplianceActivity;
import com.hisense.juconnect.app_device.activity.NotificationActivity;
import com.hisense.juconnect.app_device.activity.ReportTicketActivity;
import com.hisense.juconnect.app_device.activity.ServiceActivity;
import com.hisense.juconnect.app_device.activity.ShareInfoActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneAddNewApplicationActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneApplianceIdentificationActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneConnectionSettingWifiActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneConnectionSetupGuideActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneConnectionSetupRightActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneEnterCodeManuallyActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneHelpActivity;
import com.hisense.juconnect.app_device.activity.SingleZonePairApplianceGuideActivity;
import com.hisense.juconnect.app_device.activity.SingleZonePairingErrorActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneSetApplianceNameActivity;
import com.hisense.juconnect.app_device.activity.SingleZoneSetApplianceNameErrorActivity;
import com.hisense.juconnect.app_device.activity.TicketDetailActivity;
import com.hisense.juconnect.app_device.activity.WineLabelPictureActivity;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessActivity;
import java.util.HashMap;
import java.util.Map;

public class ARouter$$Group$$device implements IRouteGroup {

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$a */
    /* compiled from: ARouter$$Group$$device */
    public class C3780a extends HashMap<String, Integer> {
        public C3780a(ARouter$$Group$$device aRouter$$Group$$device) {
            put("DevType", 8);
            put("DevId", 8);
            put("WifiId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$b */
    /* compiled from: ARouter$$Group$$device */
    public class C3781b extends HashMap<String, Integer> {
        public C3781b(ARouter$$Group$$device aRouter$$Group$$device) {
            put(KeyConst.KEY_AUIT, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$c */
    /* compiled from: ARouter$$Group$$device */
    public class C3782c extends HashMap<String, Integer> {
        public C3782c(ARouter$$Group$$device aRouter$$Group$$device) {
            put("DevType", 8);
            put("from", 8);
            put("DevId", 8);
            put("WifiId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$d */
    /* compiled from: ARouter$$Group$$device */
    public class C3783d extends HashMap<String, Integer> {
        public C3783d(ARouter$$Group$$device aRouter$$Group$$device) {
            put("ticket_detail", 10);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$e */
    /* compiled from: ARouter$$Group$$device */
    public class C3784e extends HashMap<String, Integer> {
        public C3784e(ARouter$$Group$$device aRouter$$Group$$device) {
            put(EventBusConstKt.APPLIANCENAME, 8);
            put(EventBusConstKt.WIFIID, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$f */
    /* compiled from: ARouter$$Group$$device */
    public class C3785f extends HashMap<String, Integer> {
        public C3785f(ARouter$$Group$$device aRouter$$Group$$device) {
            put("AUID", 8);
            put("CHILDLOCKNOT", 0);
            put("DEVICEID", 8);
            put("LOCKON", 0);
            put("ISTHREEZONE", 0);
            put("CHILDLOCKSET", 0);
            put("SOUNDISOPEN", 0);
            put("ISREMOTE", 0);
            put("WIFIID", 8);
            put("ISOFFLINE", 0);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$g */
    /* compiled from: ARouter$$Group$$device */
    public class C3786g extends HashMap<String, Integer> {
        public C3786g(ARouter$$Group$$device aRouter$$Group$$device) {
            put(EventBusConstKt.APPLIANCENAME, 8);
            put(EventBusConstKt.WIFIID, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$h */
    /* compiled from: ARouter$$Group$$device */
    public class C3787h extends HashMap<String, Integer> {
        public C3787h(ARouter$$Group$$device aRouter$$Group$$device) {
            put("path", 8);
            put(KeyConst.KEY_WINE_SCANNER, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$i */
    /* compiled from: ARouter$$Group$$device */
    public class C3788i extends HashMap<String, Integer> {
        public C3788i(ARouter$$Group$$device aRouter$$Group$$device) {
            put(KeyConst.KEY_WINE_SCANNER, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$j */
    /* compiled from: ARouter$$Group$$device */
    public class C3789j extends HashMap<String, Integer> {
        public C3789j(ARouter$$Group$$device aRouter$$Group$$device) {
            put("path", 8);
            put(KeyConst.KEY_VIVINO_ID, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$k */
    /* compiled from: ARouter$$Group$$device */
    public class C3790k extends HashMap<String, Integer> {
        public C3790k(ARouter$$Group$$device aRouter$$Group$$device) {
            put(NotificationCompat.CATEGORY_EVENT, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$l */
    /* compiled from: ARouter$$Group$$device */
    public class C3791l extends HashMap<String, Integer> {
        public C3791l(ARouter$$Group$$device aRouter$$Group$$device) {
            put(EventBusConstKt.DEVICE_INFO_BUNDLE, 10);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$m */
    /* compiled from: ARouter$$Group$$device */
    public class C3792m extends HashMap<String, Integer> {
        public C3792m(ARouter$$Group$$device aRouter$$Group$$device) {
            put("upgradeInfoList", 9);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$n */
    /* compiled from: ARouter$$Group$$device */
    public class C3793n extends HashMap<String, Integer> {
        public C3793n(ARouter$$Group$$device aRouter$$Group$$device) {
            put("url", 8);
            put("manual_name", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$o */
    /* compiled from: ARouter$$Group$$device */
    public class C3794o extends HashMap<String, Integer> {
        public C3794o(ARouter$$Group$$device aRouter$$Group$$device) {
            put("AUID", 8);
            put("DEVICE_NAME", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$p */
    /* compiled from: ARouter$$Group$$device */
    public class C3795p extends HashMap<String, Integer> {
        public C3795p(ARouter$$Group$$device aRouter$$Group$$device) {
            put("url", 8);
            put("manual_name", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$q */
    /* compiled from: ARouter$$Group$$device */
    public class C3796q extends HashMap<String, Integer> {
        public C3796q(ARouter$$Group$$device aRouter$$Group$$device) {
            put(KeyConst.KEY_AUIT, 8);
            put("formatId", 8);
            put("msgId", 8);
            put("time", 4);
            put(NotificationCompat.CATEGORY_EVENT, 8);
            put("deviceId", 8);
            put("msgLevel", 8);
            put("noid", 4);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$r */
    /* compiled from: ARouter$$Group$$device */
    public class C3797r extends HashMap<String, Integer> {
        public C3797r(ARouter$$Group$$device aRouter$$Group$$device) {
            put(EventBusConstKt.WIFIID, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$device$s */
    /* compiled from: ARouter$$Group$$device */
    public class C3798s extends HashMap<String, Integer> {
        public C3798s(ARouter$$Group$$device aRouter$$Group$$device) {
            put(KeyConst.KEY_AUIT, 8);
        }
    }

    public void loadInto(Map<String, RouteMeta> map) {
        map.put(Paths.Device.AddApplianceFirstActivity, RouteMeta.build(RouteType.ACTIVITY, AddApplianceFirstActivity.class, "/device/addappliancefirstactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.AddApplianceSinglePairActivity, RouteMeta.build(RouteType.ACTIVITY, AddApplianceSinglePairActivity.class, "/device/addappliancesinglepairactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.AddNewWifiInstructionsActivity, RouteMeta.build(RouteType.ACTIVITY, AddNewWifiInstructionsActivity.class, "/device/addnewwifiinstructionsactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.AddTicketActivity, RouteMeta.build(RouteType.ACTIVITY, AddTicketActivity.class, "/device/addticketactivity", EventBusConstKt.DEVICE, new C3790k(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ApplianceManagementActivity, RouteMeta.build(RouteType.ACTIVITY, ApplianceManagementActivity.class, "/device/appliancemanagementactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ApplicationSettingsActivity, RouteMeta.build(RouteType.ACTIVITY, ApplicationSettingsActivity.class, "/device/applicationsettingsactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.DeviceInfoActivity, RouteMeta.build(RouteType.ACTIVITY, DeviceInfoActivity.class, "/device/deviceinfoactivity", EventBusConstKt.DEVICE, new C3791l(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.FirmwareUpdateActivity, RouteMeta.build(RouteType.ACTIVITY, FirmwareUpdateActivity.class, "/device/firmwareupdateactivity", EventBusConstKt.DEVICE, new C3792m(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ManualHtmlActivity, RouteMeta.build(RouteType.ACTIVITY, ManualHtmlViewActivity.class, "/device/manualhtmlviewactivity", EventBusConstKt.DEVICE, new C3793n(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ManualListActivity, RouteMeta.build(RouteType.ACTIVITY, ManualListActivity.class, "/device/manuallistactivity", EventBusConstKt.DEVICE, new C3794o(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ManualPdfActivity, RouteMeta.build(RouteType.ACTIVITY, ManualPdfViewActivity.class, "/device/manualpdfviewactivity", EventBusConstKt.DEVICE, new C3795p(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.NotificationActivity, RouteMeta.build(RouteType.ACTIVITY, NotificationActivity.class, "/device/notificationactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ReportTicketActivity, RouteMeta.build(RouteType.ACTIVITY, ReportTicketActivity.class, "/device/reportticketactivity", EventBusConstKt.DEVICE, new C3796q(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ServiceActivity, RouteMeta.build(RouteType.ACTIVITY, ServiceActivity.class, "/device/serviceactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.ShareInfoActivity, RouteMeta.build(RouteType.ACTIVITY, ShareInfoActivity.class, "/device/shareinfoactivity", EventBusConstKt.DEVICE, new C3797r(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneAddNewApplicationActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneAddNewApplicationActivity.class, "/device/singlezoneaddnewapplicationactivity", EventBusConstKt.DEVICE, new C3798s(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneApplianceIdentificationActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneApplianceIdentificationActivity.class, "/device/singlezoneapplianceidentificationactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneConnectionSettingWifiActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneConnectionSettingWifiActivity.class, "/device/singlezoneconnectionsettingwifiactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneConnectionSetupGuideActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneConnectionSetupGuideActivity.class, "/device/singlezoneconnectionsetupguideactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneConnectionSetupRightActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneConnectionSetupRightActivity.class, "/device/singlezoneconnectionsetuprightactivity", EventBusConstKt.DEVICE, new C3780a(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneEnterCodeManuallyActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneEnterCodeManuallyActivity.class, "/device/singlezoneentercodemanuallyactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneHelpActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneHelpActivity.class, "/device/singlezonehelpactivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZonePairApplianceGuideActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZonePairApplianceGuideActivity.class, "/device/singlezonepairapplianceguideactivity", EventBusConstKt.DEVICE, new C3781b(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZonePairingErrorActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZonePairingErrorActivity.class, "/device/singlezonepairingerroractivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneSetApplianceNameActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneSetApplianceNameActivity.class, "/device/singlezonesetappliancenameactivity", EventBusConstKt.DEVICE, new C3782c(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.SingleZoneSetApplianceNameErrorActivity, RouteMeta.build(RouteType.ACTIVITY, SingleZoneSetApplianceNameErrorActivity.class, "/device/singlezonesetappliancenameerroractivity", EventBusConstKt.DEVICE, (Map<String, Integer>) null, -1, Integer.MIN_VALUE));
        map.put(Paths.Device.TicketDetailActivity, RouteMeta.build(RouteType.ACTIVITY, TicketDetailActivity.class, "/device/ticketdetailactivity", EventBusConstKt.DEVICE, new C3783d(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.AppliancePairedSuccessActivity, RouteMeta.build(RouteType.ACTIVITY, AppliancePairedSuccessActivity.class, Paths.Device.AppliancePairedSuccessActivity, EventBusConstKt.DEVICE, new C3784e(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.KeyLockActivity, RouteMeta.build(RouteType.ACTIVITY, KeyLockActivity.class, Paths.Device.KeyLockActivity, EventBusConstKt.DEVICE, new C3785f(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.NameApplianceActivity, RouteMeta.build(RouteType.ACTIVITY, NameApplianceActivity.class, "/device/nameapplianceactivity", EventBusConstKt.DEVICE, new C3786g(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.WineLabelPictureActivity, RouteMeta.build(RouteType.ACTIVITY, WineLabelPictureActivity.class, Paths.Device.WineLabelPictureActivity, EventBusConstKt.DEVICE, new C3787h(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.WineLabelScannerActivity, RouteMeta.build(RouteType.ACTIVITY, WineLabelScannerActivity.class, Paths.Device.WineLabelScannerActivity, EventBusConstKt.DEVICE, new C3788i(this), -1, Integer.MIN_VALUE));
        map.put(Paths.Device.WineLabelScannerSuccessActivity, RouteMeta.build(RouteType.ACTIVITY, WineLabelScannerSuccessActivity.class, Paths.Device.WineLabelScannerSuccessActivity, EventBusConstKt.DEVICE, new C3789j(this), -1, Integer.MIN_VALUE));
    }
}
