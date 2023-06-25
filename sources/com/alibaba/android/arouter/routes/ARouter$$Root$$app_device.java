package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.Map;

public class ARouter$$Root$$app_device implements IRouteRoot {
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(EventBusConstKt.DEVICE, ARouter$$Group$$device.class);
    }
}
