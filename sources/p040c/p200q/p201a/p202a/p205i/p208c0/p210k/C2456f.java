package p040c.p200q.p201a.p202a.p205i.p208c0.p210k;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2487r0;

/* renamed from: c.q.a.a.i.c0.k.f */
/* compiled from: lambda */
public final /* synthetic */ class C2456f implements C2487r0.C2489b {

    /* renamed from: a */
    public final /* synthetic */ String f2859a;

    /* renamed from: b */
    public final /* synthetic */ LogEventDropped.Reason f2860b;

    /* renamed from: c */
    public final /* synthetic */ long f2861c;

    public /* synthetic */ C2456f(String str, LogEventDropped.Reason reason, long j) {
        this.f2859a = str;
        this.f2860b = reason;
        this.f2861c = j;
    }

    public final Object apply(Object obj) {
        return C2487r0.m4376V(this.f2859a, this.f2860b, this.f2861c, (SQLiteDatabase) obj);
    }
}
