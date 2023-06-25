package com.juconnect.connect_life;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p321d0.p322a.C4233c;
import p540d.p541a.p542a.p543a.C8884a;
import p630io.flutter.app.FlutterActivity;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connect_life/EmbeddingV1Activity;", "Lio/flutter/app/FlutterActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: EmbeddingV1Activity.kt */
public final class EmbeddingV1Activity extends FlutterActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C4233c.m11520N(registrarFor("com.tekartik.sqflite"));
        C8884a.m24009b(registrarFor("dev.flutter.plugins.e2e.E2EPlugin"));
    }
}
