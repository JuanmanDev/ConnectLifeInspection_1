package p040c.p537g0.p538a;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.app.NotificationCompat;
import androidx.test.internal.runner.RunnerArgs;
import androidx.webkit.internal.AssetHelper;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.g0.a.b */
/* compiled from: MimeUtils */
public class C8852b {

    /* renamed from: a */
    public static final Map<String, String> f17212a = new HashMap();

    static {
        m23832a("epub", "application/epub+zip");
        m23832a("ogx", "application/ogg");
        m23832a("odp", "application/vnd.oasis.opendocument.presentation");
        m23832a("otp", "application/vnd.oasis.opendocument.presentation-template");
        m23832a("yt", "application/vnd.youtube.yt");
        m23832a("hwp", "application/x-hwp");
        m23832a("3gpp", "video/3gpp");
        m23832a("3gp", "video/3gpp");
        m23832a("3gpp2", "video/3gpp2");
        m23832a("3g2", "video/3gpp2");
        m23832a("oga", "audio/ogg");
        m23832a("ogg", "audio/ogg");
        m23832a("spx", "audio/ogg");
        m23832a("dng", "image/x-adobe-dng");
        m23832a("cr2", "image/x-canon-cr2");
        m23832a("raf", "image/x-fuji-raf");
        m23832a("nef", "image/x-nikon-nef");
        m23832a("nrw", "image/x-nikon-nrw");
        m23832a("orf", "image/x-olympus-orf");
        m23832a("rw2", "image/x-panasonic-rw2");
        m23832a("pef", "image/x-pentax-pef");
        m23832a("srw", "image/x-samsung-srw");
        m23832a("arw", "image/x-sony-arw");
        m23832a("ogv", "video/ogg");
        m23832a("tgz", "application/x-gtar-compressed");
        m23832a("taz", "application/x-gtar-compressed");
        m23832a("csv", "text/csv");
        m23832a("gz", "application/gzip");
        m23832a("cab", "application/vnd.ms-cab-compressed");
        m23832a("7z", "application/x-7z-compressed");
        m23832a("bz", "application/x-bzip");
        m23832a("bz2", "application/x-bzip2");
        m23832a("z", "application/x-compress");
        m23832a("jar", "application/x-java-archive");
        m23832a("lzma", "application/x-lzma");
        m23832a("xz", "application/x-xz");
        m23832a("m3u", "audio/x-mpegurl");
        m23832a("m3u8", "audio/x-mpegurl");
        m23832a("p7b", "application/x-pkcs7-certificates");
        m23832a("spc", "application/x-pkcs7-certificates");
        m23832a("p7c", "application/pkcs7-mime");
        m23832a("p7s", "application/pkcs7-signature");
        m23832a(LanguageConstKt.f15945es, "application/ecmascript");
        m23832a("js", "application/javascript");
        m23832a("json", "application/json");
        m23832a("ts", "application/typescript");
        m23832a("perl", "text/x-perl");
        m23832a(LanguageConstKt.f15963pl, "text/x-perl");
        m23832a("pm", "text/x-perl");
        m23832a("py", "text/x-python");
        m23832a("py3", "text/x-python");
        m23832a("py3x", "text/x-python");
        m23832a("pyx", "text/x-python");
        m23832a("wsgi", "text/x-python");
        m23832a("rb", "text/ruby");
        m23832a("sh", "application/x-sh");
        m23832a("yaml", "text/x-yaml");
        m23832a("yml", "text/x-yaml");
        m23832a("asm", "text/x-asm");
        m23832a("s", "text/x-asm");
        m23832a(LanguageConstKt.f15940cs, "text/x-csharp");
        m23832a("azw", "application/vnd.amazon.ebook");
        m23832a("ibooks", "application/x-ibooks+zip");
        m23832a("mobi", "application/x-mobipocket-ebook");
        m23832a("woff", "font/woff");
        m23832a("woff2", "font/woff2");
        m23832a(NotificationCompat.CATEGORY_MESSAGE, "application/vnd.ms-outlook");
        m23832a("eml", "message/rfc822");
        m23832a("eot", "application/vnd.ms-fontobject");
        m23832a("ttf", "font/ttf");
        m23832a("otf", "font/otf");
        m23832a("ttc", "font/collection");
        m23832a("markdown", "text/markdown");
        m23832a("md", "text/markdown");
        m23832a("mkd", "text/markdown");
        m23832a("conf", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("ini", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("list", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a(RunnerArgs.ARGUMENT_LOG_ONLY, AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("prop", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("properties", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("rc", AssetHelper.DEFAULT_MIME_TYPE);
        m23832a("flv", "video/x-flv");
    }

    /* renamed from: a */
    public static void m23832a(String str, String str2) {
        if (!f17212a.containsKey(str)) {
            f17212a.put(str, str2);
        }
    }

    /* renamed from: b */
    public static String m23833b(File file) {
        int lastIndexOf = file.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String lowerCase = file.getName().substring(lastIndexOf + 1).toLowerCase();
        String str = f17212a.get(lowerCase);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
            return mimeTypeFromExtension;
        }
        return "application/octet-stream";
    }
}
