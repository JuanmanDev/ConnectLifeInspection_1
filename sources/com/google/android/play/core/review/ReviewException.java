package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p040c.p200q.p201a.p348d.p349a.p350a.p352d.C5818a;

/* compiled from: com.google.android.play:review@@2.0.1 */
public class ReviewException extends ApiException {
    public ReviewException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Review Error(%d): %s", new Object[]{Integer.valueOf(i), C5818a.m16520a(i)})));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
