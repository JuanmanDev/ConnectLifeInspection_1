package p040c.p525z.p526a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.z.a.g */
/* compiled from: LoggerPrinter */
public class C7821g implements C7825i {

    /* renamed from: a */
    public final ThreadLocal<String> f14599a = new ThreadLocal<>();

    /* renamed from: b */
    public final List<C7817c> f14600b = new ArrayList();

    /* renamed from: a */
    public void mo33310a(@NonNull String str, @Nullable Object... objArr) {
        mo33325p(3, (Throwable) null, str, objArr);
    }

    /* renamed from: b */
    public C7825i mo33311b(String str) {
        if (str != null) {
            this.f14599a.set(str);
        }
        return this;
    }

    /* renamed from: c */
    public void mo33312c(@NonNull String str, @Nullable Object... objArr) {
        mo33325p(2, (Throwable) null, str, objArr);
    }

    /* renamed from: d */
    public void mo33313d(@Nullable String str) {
        if (C7826j.m21904d(str)) {
            mo33320k("Empty/Null xml content");
            return;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(streamSource, streamResult);
            mo33320k(streamResult.getWriter().toString().replaceFirst(">", ">\n"));
        } catch (TransformerException unused) {
            mo33322m("Invalid xml", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo33314e(@NonNull C7817c cVar) {
        List<C7817c> list = this.f14600b;
        C7826j.m21901a(cVar);
        list.add(cVar);
    }

    /* renamed from: f */
    public void mo33315f(@NonNull String str, @Nullable Object... objArr) {
        mo33325p(5, (Throwable) null, str, objArr);
    }

    /* renamed from: g */
    public void mo33316g(@NonNull String str, @Nullable Object... objArr) {
        mo33325p(7, (Throwable) null, str, objArr);
    }

    /* renamed from: h */
    public void mo33317h(@Nullable String str) {
        if (C7826j.m21904d(str)) {
            mo33320k("Empty/Null json content");
            return;
        }
        try {
            String trim = str.trim();
            if (trim.startsWith("{")) {
                mo33320k(new JSONObject(trim).toString(2));
            } else if (trim.startsWith("[")) {
                mo33320k(new JSONArray(trim).toString(2));
            } else {
                mo33322m("Invalid Json", new Object[0]);
            }
        } catch (JSONException unused) {
            mo33322m("Invalid Json", new Object[0]);
        }
    }

    /* renamed from: i */
    public void mo33318i(@NonNull String str, @Nullable Object... objArr) {
        mo33325p(4, (Throwable) null, str, objArr);
    }

    /* renamed from: j */
    public void mo33319j(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        mo33325p(6, th, str, objArr);
    }

    /* renamed from: k */
    public void mo33320k(@Nullable Object obj) {
        mo33325p(3, (Throwable) null, C7826j.m21905e(obj), new Object[0]);
    }

    @NonNull
    /* renamed from: l */
    public final String mo33321l(@NonNull String str, @Nullable Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    /* renamed from: m */
    public void mo33322m(@NonNull String str, @Nullable Object... objArr) {
        mo33319j((Throwable) null, str, objArr);
    }

    @Nullable
    /* renamed from: n */
    public final String mo33323n() {
        String str = this.f14599a.get();
        if (str == null) {
            return null;
        }
        this.f14599a.remove();
        return str;
    }

    /* renamed from: o */
    public synchronized void mo33324o(int i, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        if (!(th == null || str2 == null)) {
            str2 = str2 + " : " + C7826j.m21903c(th);
        }
        if (th != null && str2 == null) {
            str2 = C7826j.m21903c(th);
        }
        if (C7826j.m21904d(str2)) {
            str2 = "Empty/NULL log message";
        }
        for (C7817c next : this.f14600b) {
            if (next.isLoggable(i, str)) {
                next.log(i, str, str2);
            }
        }
    }

    /* renamed from: p */
    public final synchronized void mo33325p(int i, @Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        C7826j.m21901a(str);
        mo33324o(i, mo33323n(), mo33321l(str, objArr), th);
    }
}
