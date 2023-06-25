package com.juconnect.connect_life.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.hisense.connect_life.core.global.AppConfig;
import com.juconnect.connect_life.MainActivity;
import com.juconnect.connect_life.global.AccountChannel;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import kotlin.Metadata;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connect_life/receiver/NotificationClickReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationClickReceiver.kt */
public final class NotificationClickReceiver extends BroadcastReceiver {
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String stringExtra = intent == null ? null : intent.getStringExtra(AppConfig.NOTIFY_MSG_CONTENT);
        Intent intent2 = new Intent(context, MainActivity.class);
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (context != null) {
            context.startActivity(intent2);
        }
        C9017j methodChannel = AccountChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c(GeneralMethodConstant.CLICK_NOTIFY_OPEN_PAGE, stringExtra);
        }
    }
}
