package p040c.p077d.p078a.p081k.p082i;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: c.d.a.k.i.m */
/* compiled from: StreamAssetPathFetcher */
public class C1594m extends C1576b<InputStream> {
    public C1594m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo15624a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo15632d(InputStream inputStream) {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo15634f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
