package p553f.p554a.p570e.p571a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import p553f.p554a.p570e.p575e.C9057g;
import p553f.p554a.p589h.C9173d;

/* renamed from: f.a.e.a.l */
/* compiled from: PluginRegistry */
public interface C9024l {

    /* renamed from: f.a.e.a.l$a */
    /* compiled from: PluginRegistry */
    public interface C9025a {
        /* renamed from: a */
        boolean mo20939a(int i, int i2, Intent intent);
    }

    /* renamed from: f.a.e.a.l$b */
    /* compiled from: PluginRegistry */
    public interface C9026b {
        boolean onNewIntent(Intent intent);
    }

    /* renamed from: f.a.e.a.l$c */
    /* compiled from: PluginRegistry */
    public interface C9027c {
        /* renamed from: a */
        C9027c mo46296a(C9025a aVar);

        /* renamed from: b */
        C9027c mo46297b(C9028d dVar);

        /* renamed from: c */
        Context mo46298c();

        /* renamed from: d */
        Activity mo46299d();

        /* renamed from: e */
        String mo46300e(String str);

        /* renamed from: f */
        C9003c mo46301f();

        /* renamed from: g */
        C9057g mo46302g();
    }

    /* renamed from: f.a.e.a.l$d */
    /* compiled from: PluginRegistry */
    public interface C9028d {
        boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: f.a.e.a.l$e */
    /* compiled from: PluginRegistry */
    public interface C9029e {
        void onUserLeaveHint();
    }

    /* renamed from: f.a.e.a.l$f */
    /* compiled from: PluginRegistry */
    public interface C9030f {
        /* renamed from: b */
        boolean mo46289b(C9173d dVar);
    }

    boolean hasPlugin(String str);

    C9027c registrarFor(String str);

    <T> T valuePublishedByPlugin(String str);
}
