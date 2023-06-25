package p040c.p175p.p176a.p177a.p182l;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: c.p.a.a.l.b */
/* compiled from: FileSource */
public class C2242b implements C2241a {

    /* renamed from: a */
    public File f2288a;

    public C2242b(File file) {
        this.f2288a = file;
    }

    /* renamed from: a */
    public PdfDocument mo17216a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.newDocument(ParcelFileDescriptor.open(this.f2288a, SQLiteDatabase.CREATE_IF_NECESSARY), str);
    }
}
