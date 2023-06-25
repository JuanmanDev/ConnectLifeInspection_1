package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p241k0.p246e0.C2950g;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2968d;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2970e;
import p040c.p200q.p201a.p219b.p241k0.p246e0.p247q.C2975h;
import p040c.p200q.p201a.p219b.p260n0.C3135r;

public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final String url;

        public PlaylistResetException(String str) {
            this.url = str;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final String url;

        public PlaylistStuckException(String str) {
            this.url = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a */
    public interface C4042a {
        /* renamed from: a */
        HlsPlaylistTracker mo19397a(C2950g gVar, C3135r rVar, C2975h hVar);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b */
    public interface C4043b {
        /* renamed from: c */
        void mo19347c();

        /* renamed from: k */
        boolean mo19349k(C2968d.C2969a aVar, long j);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$c */
    public interface C4044c {
        /* renamed from: c */
        void mo19355c(C2970e eVar);
    }

    /* renamed from: a */
    void mo19410a(C4043b bVar);

    /* renamed from: b */
    long mo19411b();

    /* renamed from: c */
    boolean mo19412c();

    /* renamed from: d */
    void mo19413d(C2968d.C2969a aVar);

    @Nullable
    /* renamed from: e */
    C2968d mo19414e();

    /* renamed from: f */
    void mo19415f(Uri uri, C3017v.C3018a aVar, C4044c cVar);

    /* renamed from: g */
    void mo19416g();

    /* renamed from: h */
    void mo19417h(C4043b bVar);

    /* renamed from: i */
    boolean mo19418i(C2968d.C2969a aVar);

    @Nullable
    /* renamed from: j */
    C2970e mo19419j(C2968d.C2969a aVar, boolean z);

    /* renamed from: m */
    void mo19420m(C2968d.C2969a aVar);

    void stop();
}
