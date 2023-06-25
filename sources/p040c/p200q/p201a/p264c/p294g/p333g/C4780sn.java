package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.core.app.Person;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.p368h.C6381g;

/* renamed from: c.q.a.c.g.g.sn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4780sn extends AsyncTask {

    /* renamed from: g */
    public static final C3537a f9622g = new C3537a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a */
    public final String f9623a;

    /* renamed from: b */
    public final String f9624b;

    /* renamed from: c */
    public final WeakReference f9625c;

    /* renamed from: d */
    public final Uri.Builder f9626d;

    /* renamed from: e */
    public final String f9627e;

    /* renamed from: f */
    public final C6331h f9628f;

    public C4780sn(String str, String str2, Intent intent, C6331h hVar, C4832un unVar) {
        C3495o.m8904f(str);
        this.f9623a = str;
        C3495o.m8908j(hVar);
        this.f9628f = hVar;
        C3495o.m8904f(str2);
        C3495o.m8908j(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        C3495o.m8904f(stringExtra);
        Uri.Builder buildUpon = Uri.parse(unVar.mo26744f(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter(Person.KEY_KEY, stringExtra).appendQueryParameter("androidPackageName", str);
        C3495o.m8908j(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f9624b = buildUpon.build().toString();
        this.f9625c = new WeakReference(unVar);
        this.f9626d = unVar.mo26743e(intent, str, str2);
        this.f9627e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* renamed from: b */
    public static byte[] m13088b(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: a */
    public final void onPostExecute(C4754rn rnVar) {
        String str;
        Uri.Builder builder;
        C4832un unVar = (C4832un) this.f9625c.get();
        String str2 = null;
        if (rnVar != null) {
            str2 = rnVar.mo26622c();
            str = rnVar.mo26623d();
        } else {
            str = null;
        }
        if (unVar == null) {
            f9622g.mo20807c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f9626d) == null) {
            unVar.mo26747n(this.f9623a, C6381g.m17909a(str));
        } else {
            builder.authority(str2);
            unVar.mo26746j(this.f9626d.build(), this.f9623a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        f9622g.mo20807c("ConversionException encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0111, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0112, code lost:
        f9622g.mo20807c("Null pointer encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0128, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0129, code lost:
        f9622g.mo20807c("IOException occurred: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df A[Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fa A[ExcHandler: zzvg (r1v8 'e' com.google.android.gms.internal.firebase-auth-api.zzvg A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0111 A[ExcHandler: NullPointerException (r1v4 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.f9627e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0013
            java.lang.String r7 = r6.f9627e
            c.q.a.c.g.g.rn r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4754rn.m13027a(r7)
            goto L_0x013e
        L_0x0013:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = r6.f9624b     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.ref.WeakReference r2 = r6.f9625c     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            c.q.a.c.g.g.un r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4832un) r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.net.HttpURLConnection r1 = r2.mo26745i(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            c.q.a.c.g.g.do r3 = new c.q.a.c.g.g.do     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            android.content.Context r2 = r2.zza()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            c.q.c.h r4 = r6.f9628f     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            c.q.a.c.g.g.bo r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4324bo.m11745a()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r5 = r5.mo25834b()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo25916a(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x00bc
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x0088
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r1 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r1.<init>()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "WEB_INTERNAL_ERROR:"
            r1.append(r3)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            r1.append(r3)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x009d
        L_0x0076:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            byte[] r1 = m13088b(r1, r4)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r1)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4936yn.m13619a(r3, r1)     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x008a, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x009d
        L_0x0088:
            r1 = r0
            goto L_0x009d
        L_0x008a:
            r1 = move-exception
            c.q.a.c.d.k.a r3 = f9622g     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r1 = r4.concat(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo20811g(r1, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x0088
        L_0x009d:
            c.q.a.c.d.k.a r3 = f9622g     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4[r7] = r1     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r4[r5] = r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.mo20807c(r2, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            c.q.a.c.g.g.rn r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4754rn.m13028b(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x013e
        L_0x00bc:
            c.q.a.c.g.g.op r2 = new c.q.a.c.g.g.op     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r2.<init>()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            byte[] r1 = m13088b(r1, r4)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            r2.mo26487a(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.util.List r1 = r2.mo26488b()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
        L_0x00d9:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r2 == 0) goto L_0x013e
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r3 != 0) goto L_0x00f5
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            if (r3 == 0) goto L_0x00d9
        L_0x00f5:
            c.q.a.c.g.g.rn r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4754rn.m13027a(r2)     // Catch:{ IOException -> 0x0128, NullPointerException -> 0x0111, zzvg -> 0x00fa }
            goto L_0x013e
        L_0x00fa:
            r1 = move-exception
            c.q.a.c.d.k.a r2 = f9622g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo20807c(r1, r7)
            goto L_0x013e
        L_0x0111:
            r1 = move-exception
            c.q.a.c.d.k.a r2 = f9622g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo20807c(r1, r7)
            goto L_0x013e
        L_0x0128:
            r1 = move-exception
            c.q.a.c.d.k.a r2 = f9622g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo20807c(r1, r7)
        L_0x013e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4780sn.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* synthetic */ void onCancelled(Object obj) {
        C4754rn rnVar = (C4754rn) obj;
        onPostExecute((C4754rn) null);
    }
}
