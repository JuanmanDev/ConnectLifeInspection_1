package p040c.p077d.p078a.p081k.p082i;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;

/* renamed from: c.d.a.k.i.h */
/* compiled from: FileDescriptorAssetPathFetcher */
public class C1586h extends C1576b<ParcelFileDescriptor> {
    public C1586h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo15624a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo15632d(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor mo15634f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
