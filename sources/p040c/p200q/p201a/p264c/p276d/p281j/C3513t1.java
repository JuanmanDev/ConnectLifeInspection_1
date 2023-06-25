package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;

/* renamed from: c.q.a.c.d.j.t1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3513t1 {

    /* renamed from: a */
    public static final Uri f6513a;

    /* renamed from: b */
    public static final Uri f6514b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f6513a = parse;
        f6514b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m8948a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m8949b(String str, @Nullable String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m8950c(String str) {
        Uri fromParts = Uri.fromParts(RunnerArgs.ARGUMENT_TEST_PACKAGE, "com.google.android.gms", (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
