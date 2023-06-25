package p040c.p537g0.p538a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import p553f.p554a.p570e.p571a.C9016i;

/* renamed from: c.g0.a.c */
/* compiled from: Share */
public class C8853c {

    /* renamed from: a */
    public Context f17213a;

    /* renamed from: b */
    public C9016i f17214b;

    public C8853c(Context context) {
        this.f17213a = context;
    }

    /* renamed from: a */
    public final boolean mo46041a() {
        return ContextCompat.checkSelfPermission(this.f17213a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public final void mo46042b() {
        Context context = this.f17213a;
        if (context instanceof Activity) {
            ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    /* renamed from: c */
    public void mo46043c() {
        mo46044d(this.f17214b);
    }

    /* renamed from: d */
    public void mo46044d(C9016i iVar) {
        if (iVar != null) {
            this.f17214b = iVar;
            List<String> list = (List) iVar.mo46571a("list");
            String str = (String) iVar.mo46571a("type");
            String str2 = (String) iVar.mo46571a("sharePanelTitle");
            String str3 = (String) iVar.mo46571a(MailTo.SUBJECT);
            String str4 = (String) iVar.mo46571a("extraText");
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Non-empty list expected");
            }
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent();
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.SUBJECT", str3);
            if ("text".equals(str)) {
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", (String) list.get(0));
                intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            } else if (!C8855e.m23845e(list) || mo46041a()) {
                intent.putExtra("android.intent.extra.TEXT", str4);
                for (String file : list) {
                    arrayList.add(C8855e.m23841a(this.f17213a, new File(file)));
                }
                if ("image".equals(str)) {
                    intent.setType("image/*");
                } else if ("video".equals(str)) {
                    intent.setType("video/*");
                } else {
                    intent.setType("application/*");
                }
                if (arrayList.size() == 1) {
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
                } else {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                }
            } else {
                mo46042b();
                return;
            }
            mo46045e(intent, str2, arrayList);
        }
    }

    /* renamed from: e */
    public final void mo46045e(Intent intent, String str, ArrayList<Uri> arrayList) {
        Intent createChooser = Intent.createChooser(intent, str);
        C8855e.m23842b(this.f17213a, arrayList, createChooser);
        Context context = this.f17213a;
        if (context instanceof Activity) {
            context.startActivity(createChooser);
            return;
        }
        createChooser.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.f17213a.startActivity(createChooser);
    }
}
