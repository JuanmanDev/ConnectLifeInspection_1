package p040c.p200q.p201a.p219b.p234g0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.b.g0.b */
/* compiled from: MediaCodecSelector */
public interface C2824b {

    /* renamed from: a */
    public static final C2824b f4396a = new C2825a();

    /* renamed from: c.q.a.b.g0.b$a */
    /* compiled from: MediaCodecSelector */
    public static class C2825a implements C2824b {
        @Nullable
        /* renamed from: a */
        public C2823a mo18896a() {
            return MediaCodecUtil.m10461k();
        }

        /* renamed from: b */
        public List<C2823a> mo18897b(String str, boolean z) {
            List<C2823a> h = MediaCodecUtil.m10458h(str, z);
            if (h.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.singletonList(h.get(0));
        }
    }

    @Nullable
    /* renamed from: a */
    C2823a mo18896a();

    /* renamed from: b */
    List<C2823a> mo18897b(String str, boolean z);
}
