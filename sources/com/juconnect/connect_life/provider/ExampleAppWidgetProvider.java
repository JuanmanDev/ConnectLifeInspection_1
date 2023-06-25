package com.juconnect.connect_life.provider;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connect_life/provider/ExampleAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "onUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ExampleAppWidgetProvider.kt */
public final class ExampleAppWidgetProvider extends AppWidgetProvider {
    public void onUpdate(@Nullable Context context, @Nullable AppWidgetManager appWidgetManager, @Nullable int[] iArr) {
        String str;
        super.onUpdate(context, appWidgetManager, iArr);
        if (iArr != null) {
            for (int i : iArr) {
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 67108864);
                Intrinsics.checkNotNullExpressionValue(activity, "Intent(context, MainActi…LE)\n                    }");
                if (context == null) {
                    str = null;
                } else {
                    str = context.getPackageName();
                }
                RemoteViews remoteViews = new RemoteViews(str, R.layout.example_appwidget);
                remoteViews.setOnClickPendingIntent(R.id.btn_open_app, activity);
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidget(i, remoteViews);
                }
            }
        }
    }
}
