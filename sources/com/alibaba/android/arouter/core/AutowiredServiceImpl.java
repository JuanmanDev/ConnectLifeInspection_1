package com.alibaba.android.arouter.core;

import android.content.Context;
import android.util.LruCache;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import java.util.ArrayList;
import java.util.List;

@Route(path = "/arouter/service/autowired")
public class AutowiredServiceImpl implements AutowiredService {

    /* renamed from: a */
    public LruCache<String, ISyringe> f6863a;

    /* renamed from: b */
    public List<String> f6864b;

    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (!this.f6864b.contains(name)) {
                ISyringe iSyringe = this.f6863a.get(name);
                if (iSyringe == null) {
                    iSyringe = (ISyringe) Class.forName(obj.getClass().getName() + "$$ARouter$$Autowired").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                iSyringe.inject(obj);
                this.f6863a.put(name, iSyringe);
            }
        } catch (Exception unused) {
            this.f6864b.add(name);
        }
    }

    public void init(Context context) {
        this.f6863a = new LruCache<>(66);
        this.f6864b = new ArrayList();
    }
}
