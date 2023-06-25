package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core-common@@2.0.2 */
public class PlayCoreDialogWrapperActivity extends Activity {
    @Nullable

    /* renamed from: e */
    public ResultReceiver f14994e;

    /* renamed from: a */
    public final void mo36424a() {
        ResultReceiver resultReceiver = this.f14994e;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f14994e) != null) {
            if (i2 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f14994e = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                mo36424a();
                finish();
            }
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                mo36424a();
                finish();
            }
        } else {
            this.f14994e = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f14994e);
    }
}
