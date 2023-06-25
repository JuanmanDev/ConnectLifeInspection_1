package com.juconnect.connectlife.ju_ble;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/NotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationActivity.kt */
public final class NotificationActivity extends AppCompatActivity {
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            Postcard a = C1337a.m211c().mo15011a(Paths.App.MainActivity);
            a.withFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            Bundle extras = getIntent().getExtras();
            Intrinsics.checkNotNull(extras);
            a.with(extras);
            a.navigation();
        }
        finish();
    }
}
