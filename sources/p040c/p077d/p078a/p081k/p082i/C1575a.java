package p040c.p077d.p078a.p081k.p082i;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;

/* renamed from: c.d.a.k.i.a */
/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class C1575a extends C1593l<AssetFileDescriptor> {
    public C1575a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo15624a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo15625d(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo15626f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
