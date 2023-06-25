package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p394v.p396q.C6783c;

public class PersistedInstallation {

    /* renamed from: a */
    public File f15434a;
    @NonNull

    /* renamed from: b */
    public final C6331h f15435b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull C6331h hVar) {
        this.f15435b = hVar;
    }

    /* renamed from: a */
    public final File mo37436a() {
        if (this.f15434a == null) {
            synchronized (this) {
                if (this.f15434a == null) {
                    File filesDir = this.f15435b.mo30404j().getFilesDir();
                    this.f15434a = new File(filesDir, "PersistedInstallation." + this.f15435b.mo30407p() + ".json");
                }
            }
        }
        return this.f15434a;
    }

    @NonNull
    /* renamed from: b */
    public C6783c mo37437b(@NonNull C6783c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", cVar.mo31488d());
            jSONObject.put("Status", cVar.mo31492g().ordinal());
            jSONObject.put("AuthToken", cVar.mo31486b());
            jSONObject.put("RefreshToken", cVar.mo31491f());
            jSONObject.put("TokenCreationEpochInSecs", cVar.mo31493h());
            jSONObject.put("ExpiresInSecs", cVar.mo31487c());
            jSONObject.put("FisError", cVar.mo31489e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f15435b.mo30404j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(mo37436a())) {
                return cVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: c */
    public final JSONObject mo37438c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(mo37436a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: d */
    public C6783c mo37439d() {
        JSONObject c = mo37438c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        String optString4 = c.optString("FisError", (String) null);
        C6783c.C6784a a = C6783c.m19208a();
        a.mo31500d(optString);
        a.mo31503g(RegistrationStatus.values()[optInt]);
        a.mo31498b(optString2);
        a.mo31502f(optString3);
        a.mo31504h(optLong);
        a.mo31499c(optLong2);
        a.mo31501e(optString4);
        return a.mo31497a();
    }
}
