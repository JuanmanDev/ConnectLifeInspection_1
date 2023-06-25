package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.internationalwinecooler.p529ui.inventory.InventoryFilterActivity;
import com.internationalwinecooler.p529ui.inventory.InventoryMainActivity;
import com.internationalwinecooler.p529ui.inventory.InventorySelectTypeActivity;
import com.internationalwinecooler.p529ui.inventory.InventoryTypeDetailActivity;
import com.internationalwinecooler.p529ui.webview.AddWineWebViewActivity;
import com.internationalwinecooler.p529ui.webview.HumitureWebViewActivity;
import com.internationalwinecooler.p529ui.webview.InventoryWebViewActivity;
import com.internationalwinecooler.p529ui.webview.PropWebViewActivity;
import com.internationalwinecooler.p529ui.webview.SettingWineWebViewActivity;
import com.internationalwinecooler.p529ui.webview.SfWebViewActivity;
import com.internationalwinecooler.p529ui.webview.StatisticsWebViewActivity;
import com.internationalwinecooler.p529ui.webview.TpWebViewActivity;
import com.internationalwinecooler.p529ui.webview.VivinoWebViewActivity;
import java.util.HashMap;
import java.util.Map;

public class ARouter$$Group$$app implements IRouteGroup {

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$a */
    /* compiled from: ARouter$$Group$$app */
    public class C3767a extends HashMap<String, Integer> {
        public C3767a(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$b */
    /* compiled from: ARouter$$Group$$app */
    public class C3768b extends HashMap<String, Integer> {
        public C3768b(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_IMAGE_PATH, 8);
            put(KeyConst.KEY_TARGET_URL, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$c */
    /* compiled from: ARouter$$Group$$app */
    public class C3769c extends HashMap<String, Integer> {
        public C3769c(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$d */
    /* compiled from: ARouter$$Group$$app */
    public class C3770d extends HashMap<String, Integer> {
        public C3770d(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$e */
    /* compiled from: ARouter$$Group$$app */
    public class C3771e extends HashMap<String, Integer> {
        public C3771e(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
            put(KeyConst.KEY_AUID, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$f */
    /* compiled from: ARouter$$Group$$app */
    public class C3772f extends HashMap<String, Integer> {
        public C3772f(ARouter$$Group$$app aRouter$$Group$$app) {
            put("inventoryGrapeTypeList", 9);
            put("inventoryRegionsStringList", 9);
            put("filterModel", 10);
            put("inventoryCountryCodeList", 9);
            put("inventoryWineTypeStringList", 9);
            put("currentFragmentTag", 3);
            put("filterInType", 0);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$g */
    /* compiled from: ARouter$$Group$$app */
    public class C3773g extends HashMap<String, Integer> {
        public C3773g(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_AUIT, 8);
            put("expired", 0);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$h */
    /* compiled from: ARouter$$Group$$app */
    public class C3774h extends HashMap<String, Integer> {
        public C3774h(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_AUIT, 8);
            put("isShowSecond", 0);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$i */
    /* compiled from: ARouter$$Group$$app */
    public class C3775i extends HashMap<String, Integer> {
        public C3775i(ARouter$$Group$$app aRouter$$Group$$app) {
            put("inventoryType", 3);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$j */
    /* compiled from: ARouter$$Group$$app */
    public class C3776j extends HashMap<String, Integer> {
        public C3776j(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_VIVINO_ID, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$k */
    /* compiled from: ARouter$$Group$$app */
    public class C3777k extends HashMap<String, Integer> {
        public C3777k(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_IMAGE_PATH, 8);
            put(KeyConst.KEY_TARGET_URL, 8);
            put(KeyConst.CATORY_ID_, 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$l */
    /* compiled from: ARouter$$Group$$app */
    public class C3778l extends HashMap<String, Integer> {
        public C3778l(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
            put("deviceId", 8);
        }
    }

    /* renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$app$m */
    /* compiled from: ARouter$$Group$$app */
    public class C3779m extends HashMap<String, Integer> {
        public C3779m(ARouter$$Group$$app aRouter$$Group$$app) {
            put(KeyConst.KEY_TARGET_URL, 8);
        }
    }

    public void loadInto(Map<String, RouteMeta> map) {
        map.put(Paths.App.HumitureWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, HumitureWebViewActivity.class, "/app/humiturewebviewactivity", "app", new C3771e(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.InventoryFilterActivity, RouteMeta.build(RouteType.ACTIVITY, InventoryFilterActivity.class, "/app/inventoryfilteractivity", "app", new C3772f(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.InventoryMainActivity, RouteMeta.build(RouteType.ACTIVITY, InventoryMainActivity.class, "/app/inventorymainactivity", "app", new C3773g(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.InventorySelectTypeActivity, RouteMeta.build(RouteType.ACTIVITY, InventorySelectTypeActivity.class, "/app/inventoryselecttypeactivity", "app", new C3774h(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.InventoryTypeDetailActivity, RouteMeta.build(RouteType.ACTIVITY, InventoryTypeDetailActivity.class, "/app/inventorytypedetailactivity", "app", new C3775i(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.VivinoWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, VivinoWebViewActivity.class, "/app/vivinowebviewactivity", "app", new C3776j(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.AddWineWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, AddWineWebViewActivity.class, "/app/addwinewebviewactivity", "app", new C3777k(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.SettingWineWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, SettingWineWebViewActivity.class, "/app/customwinewebviewactivity", "app", new C3778l(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.InventoryWineWebView, RouteMeta.build(RouteType.ACTIVITY, InventoryWebViewActivity.class, "/app/inventorywinewebview", "app", new C3779m(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.PropWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, PropWebViewActivity.class, "/app/propwebviewactivity", "app", new C3767a(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.ScanFailureWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, SfWebViewActivity.class, "/app/scanfailurewebviewactivity", "app", new C3768b(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.StatisticsWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, StatisticsWebViewActivity.class, "/app/statisticswebviewactivity", "app", new C3769c(this), -1, Integer.MIN_VALUE));
        map.put(Paths.App.TakePhotoWebViewActivity, RouteMeta.build(RouteType.ACTIVITY, TpWebViewActivity.class, "/app/takephotowebviewactivity", "app", new C3770d(this), -1, Integer.MIN_VALUE));
    }
}
