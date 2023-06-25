package p001a.p019d.p020a;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: a.d.a.e */
/* compiled from: lambda */
public final /* synthetic */ class C0079e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f116e;

    public /* synthetic */ C0079e(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f116e = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f116e.loadInternal();
    }
}
