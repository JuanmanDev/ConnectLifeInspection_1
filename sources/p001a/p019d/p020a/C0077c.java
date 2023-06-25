package p001a.p019d.p020a;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: a.d.a.c */
/* compiled from: lambda */
public final /* synthetic */ class C0077c implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ EmojiCompatInitializer.BackgroundDefaultLoader f112e;

    /* renamed from: l */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f113l;

    /* renamed from: m */
    public final /* synthetic */ ThreadPoolExecutor f114m;

    public /* synthetic */ C0077c(EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f112e = backgroundDefaultLoader;
        this.f113l = metadataRepoLoaderCallback;
        this.f114m = threadPoolExecutor;
    }

    public final void run() {
        this.f112e.mo8110a(this.f113l, this.f114m);
    }
}
