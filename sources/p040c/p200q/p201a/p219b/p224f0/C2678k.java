package p040c.p200q.p201a.p219b.p224f0;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.q.a.b.f0.k */
/* compiled from: GaplessInfoHolder */
public final class C2678k {

    /* renamed from: c */
    public static final Pattern f3425c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f3426a = -1;

    /* renamed from: b */
    public int f3427b = -1;

    /* renamed from: a */
    public boolean mo18555a() {
        return (this.f3426a == -1 || this.f3427b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo18556b(String str) {
        Matcher matcher = f3425c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f3426a = parseInt;
            this.f3427b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo18557c(Metadata metadata) {
        for (int i = 0; i < metadata.mo24053b(); i++) {
            Metadata.Entry a = metadata.mo24052a(i);
            if (a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a;
                if ("iTunSMPB".equals(commentFrame.f7755m) && mo18556b(commentFrame.f7756n)) {
                    return true;
                }
            } else if (a instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) a;
                if ("com.apple.iTunes".equals(internalFrame.f7762l) && "iTunSMPB".equals(internalFrame.f7763m) && mo18556b(internalFrame.f7764n)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo18558d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f3426a = i2;
        this.f3427b = i3;
        return true;
    }
}
