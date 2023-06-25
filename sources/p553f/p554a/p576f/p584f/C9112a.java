package p553f.p554a.p576f.p584f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import androidx.core.app.Person;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: f.a.f.f.a */
/* compiled from: SharedPreferencesPlugin */
public class C9112a implements C9017j.C9021c {

    /* renamed from: e */
    public final SharedPreferences f17864e;

    /* renamed from: f.a.f.f.a$a */
    /* compiled from: SharedPreferencesPlugin */
    public class C9113a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ SharedPreferences.Editor f17865a;

        /* renamed from: b */
        public final /* synthetic */ C9017j.C9022d f17866b;

        public C9113a(C9112a aVar, SharedPreferences.Editor editor, C9017j.C9022d dVar) {
            this.f17865a = editor;
            this.f17866b = dVar;
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(this.f17865a.commit());
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            this.f17866b.success(bool);
        }
    }

    public C9112a(Context context) {
        this.f17864e = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    /* renamed from: e */
    public static void m24708e(C9024l.C9027c cVar) {
        new C9017j(cVar.mo46301f(), "plugins.flutter.io/shared_preferences").mo46575e(new C9112a(cVar.mo46298c()));
    }

    /* renamed from: a */
    public final void mo46819a(SharedPreferences.Editor editor, C9017j.C9022d dVar) {
        new C9113a(this, editor, dVar).execute(new Void[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo46820b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            r3 = 0
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r2.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.lang.Object r5 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            r1.close()
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x001d:
            r5 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            goto L_0x0029
        L_0x0022:
            r5 = move-exception
        L_0x0023:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0020 }
            r1.<init>(r5)     // Catch:{ all -> 0x0020 }
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()
        L_0x002e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p584f.C9112a.mo46820b(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo46821c(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            r2.writeObject(r4)     // Catch:{ all -> 0x001e }
            r2.flush()     // Catch:{ all -> 0x001e }
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x001e }
            r0 = 0
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ all -> 0x001e }
            r2.close()
            return r4
        L_0x001e:
            r4 = move-exception
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r4 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p584f.C9112a.mo46821c(java.util.List):java.lang.String");
    }

    /* renamed from: d */
    public final Map<String, Object> mo46822d() {
        BigInteger bigInteger;
        Map<String, ?> all = this.f17864e.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith("flutter.")) {
                Object obj = all.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj = mo46820b(str.substring(40));
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str.substring(44), 36);
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj = Double.valueOf(str.substring(40));
                    }
                    hashMap.put(next, obj);
                } else {
                    if (obj instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        SharedPreferences.Editor remove = this.f17864e.edit().remove(next);
                        bigInteger = arrayList;
                        if (!remove.putString(next, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + mo46821c(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                    }
                    hashMap.put(next, obj);
                }
                obj = bigInteger;
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        String str = (String) iVar.mo46571a(Person.KEY_KEY);
        try {
            String str2 = iVar.f17687a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = 8;
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo46819a(this.f17864e.edit().putBoolean(str, ((Boolean) iVar.mo46571a("value")).booleanValue()), dVar);
                    return;
                case 1:
                    String d = Double.toString(((Number) iVar.mo46571a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f17864e.edit();
                    mo46819a(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d), dVar);
                    return;
                case 2:
                    Number number = (Number) iVar.mo46571a("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.f17864e.edit();
                        mo46819a(edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36)), dVar);
                        return;
                    }
                    mo46819a(this.f17864e.edit().putLong(str, number.longValue()), dVar);
                    return;
                case 3:
                    String str3 = (String) iVar.mo46571a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                            mo46819a(this.f17864e.edit().putString(str, str3), dVar);
                            return;
                        }
                    }
                    dVar.error("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", (Object) null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f17864e.edit();
                    mo46819a(edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + mo46821c((List) iVar.mo46571a("value"))), dVar);
                    return;
                case 5:
                    dVar.success(Boolean.TRUE);
                    return;
                case 6:
                    dVar.success(mo46822d());
                    return;
                case 7:
                    mo46819a(this.f17864e.edit().remove(str), dVar);
                    return;
                case 8:
                    Set<String> keySet = mo46822d().keySet();
                    SharedPreferences.Editor edit4 = this.f17864e.edit();
                    for (String remove : keySet) {
                        edit4.remove(remove);
                    }
                    mo46819a(edit4, dVar);
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
        } catch (IOException e) {
            dVar.error("IOException encountered", iVar.f17687a, e);
        }
        dVar.error("IOException encountered", iVar.f17687a, e);
    }
}
