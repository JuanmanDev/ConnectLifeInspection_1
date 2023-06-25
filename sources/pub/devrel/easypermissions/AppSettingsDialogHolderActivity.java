package pub.devrel.easypermissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.test.internal.runner.RunnerArgs;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* renamed from: e */
    public AlertDialog f19474e;

    /* renamed from: l */
    public int f19475l;

    /* renamed from: p */
    public static Intent m26766p(Context context, AppSettingsDialog appSettingsDialog) {
        Intent intent = new Intent(context, AppSettingsDialogHolderActivity.class);
        intent.putExtra("extra_app_settings", appSettingsDialog);
        return intent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(RunnerArgs.ARGUMENT_TEST_PACKAGE, getPackageName(), (String) null));
            data.addFlags(this.f19475l);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog a = AppSettingsDialog.m26757a(getIntent(), this);
        this.f19475l = a.mo53733b();
        this.f19474e = a.mo53737e(this, this);
    }

    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f19474e;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f19474e.dismiss();
        }
    }
}
