package p001a.p019d.p020a;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: a.d.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C0076b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f111e;

    public /* synthetic */ C0076b(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f111e = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f111e.createMetadata();
    }
}
