package p040c.p151o.p152a.p153a.p172t.p173c;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.hisense.connect_life.hismart.constants.RequestTag;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p040c.p151o.p152a.p153a.C2103f;

/* renamed from: c.o.a.a.t.c.b */
/* compiled from: GigyaPluginFileChooser */
public class C2193b extends WebChromeClient {

    /* renamed from: a */
    public final WeakReference<Fragment> f2179a;

    /* renamed from: b */
    public Bitmap f2180b;

    /* renamed from: c */
    public ValueCallback<Uri[]> f2181c;

    public C2193b(Fragment fragment) {
        this.f2179a = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    public void mo17036a() {
        Bitmap bitmap = this.f2180b;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    /* renamed from: b */
    public final Fragment mo17037b() {
        return (Fragment) this.f2179a.get();
    }

    /* renamed from: c */
    public void mo17038c(int i, Intent intent) {
        Uri[] uriArr;
        if (i == -1) {
            if (intent != null && intent.getDataString() != null) {
                uriArr = new Uri[]{Uri.parse(intent.getDataString())};
                this.f2181c.onReceiveValue(uriArr);
                this.f2181c = null;
            } else if (!(intent == null || intent.getExtras() == null || intent.getExtras().get("data") == null)) {
                if (mo17037b() != null) {
                    Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
                    this.f2180b = bitmap;
                    if (bitmap != null) {
                        try {
                            if (Build.VERSION.SDK_INT <= 28) {
                                File file = new File(mo17037b().getContext().getFilesDir(), "gigya_profile_temp.png");
                                if (file.exists()) {
                                    file.delete();
                                }
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                this.f2180b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                uriArr = new Uri[]{Uri.fromFile(file)};
                            } else {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                this.f2180b.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                uriArr = new Uri[]{Uri.parse(MediaStore.Images.Media.insertImage(mo17037b().getActivity().getContentResolver(), this.f2180b, RequestTag.Title, (String) null))};
                                try {
                                    byteArrayOutputStream.flush();
                                    byteArrayOutputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            uriArr = null;
                            e.printStackTrace();
                            this.f2181c.onReceiveValue(uriArr);
                            this.f2181c = null;
                            this.f2181c.onReceiveValue(uriArr);
                            this.f2181c = null;
                        }
                        this.f2181c.onReceiveValue(uriArr);
                        this.f2181c = null;
                    }
                    return;
                }
                return;
            }
        }
        uriArr = null;
        this.f2181c.onReceiveValue(uriArr);
        this.f2181c = null;
    }

    /* renamed from: d */
    public final void mo17039d() {
        if (mo17037b() != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.setFlags(1);
            Intent addCategory = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE");
            addCategory.setType("image/*");
            Intent intent2 = new Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INTENT", addCategory);
            intent2.putExtra("android.intent.extra.TITLE", "Image Chooser");
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            mo17037b().startActivityForResult(intent2, 15);
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C2103f.m3056b("GigyaPluginFileChooser", "onShowFileChooser: ");
        if (mo17037b() == null) {
            return false;
        }
        ValueCallback<Uri[]> valueCallback2 = this.f2181c;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue((Object) null);
        }
        this.f2181c = valueCallback;
        mo17039d();
        return true;
    }
}
