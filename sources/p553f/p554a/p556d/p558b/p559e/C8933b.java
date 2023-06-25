package p553f.p554a.p556d.p558b.p559e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p553f.p554a.C8896b;
import p553f.p554a.p570e.p571a.C9003c;
import p630io.flutter.embedding.engine.FlutterJNI;

/* renamed from: f.a.d.b.e.b */
/* compiled from: DartMessenger */
public class C8933b implements C9003c, C8935c {
    @NonNull

    /* renamed from: e */
    public final FlutterJNI f17524e;
    @NonNull

    /* renamed from: l */
    public final Map<String, C9003c.C9004a> f17525l;
    @NonNull

    /* renamed from: m */
    public final Map<Integer, C9003c.C9005b> f17526m;

    /* renamed from: n */
    public int f17527n = 1;

    /* renamed from: f.a.d.b.e.b$a */
    /* compiled from: DartMessenger */
    public static class C8934a implements C9003c.C9005b {
        @NonNull

        /* renamed from: a */
        public final FlutterJNI f17528a;

        /* renamed from: b */
        public final int f17529b;

        /* renamed from: c */
        public final AtomicBoolean f17530c = new AtomicBoolean(false);

        public C8934a(@NonNull FlutterJNI flutterJNI, int i) {
            this.f17528a = flutterJNI;
            this.f17529b = i;
        }

        /* renamed from: a */
        public void mo46450a(@Nullable ByteBuffer byteBuffer) {
            if (this.f17530c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f17528a.invokePlatformMessageEmptyResponseCallback(this.f17529b);
            } else {
                this.f17528a.invokePlatformMessageResponseCallback(this.f17529b, byteBuffer, byteBuffer.position());
            }
        }
    }

    public C8933b(@NonNull FlutterJNI flutterJNI) {
        this.f17524e = flutterJNI;
        this.f17525l = new HashMap();
        this.f17526m = new HashMap();
    }

    /* renamed from: a */
    public void mo46433a(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable C9003c.C9005b bVar) {
        int i;
        C8896b.m24032d("DartMessenger", "Sending message with callback over channel '" + str + "'");
        if (bVar != null) {
            i = this.f17527n;
            this.f17527n = i + 1;
            this.f17526m.put(Integer.valueOf(i), bVar);
        } else {
            i = 0;
        }
        if (byteBuffer == null) {
            this.f17524e.dispatchEmptyPlatformMessage(str, i);
        } else {
            this.f17524e.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    /* renamed from: b */
    public void mo46434b(@NonNull String str, @Nullable C9003c.C9004a aVar) {
        if (aVar == null) {
            C8896b.m24032d("DartMessenger", "Removing handler for channel '" + str + "'");
            this.f17525l.remove(str);
            return;
        }
        C8896b.m24032d("DartMessenger", "Setting handler for channel '" + str + "'");
        this.f17525l.put(str, aVar);
    }

    /* renamed from: c */
    public void mo46448c(int i, @Nullable byte[] bArr) {
        ByteBuffer byteBuffer;
        C8896b.m24032d("DartMessenger", "Received message reply from Dart.");
        C9003c.C9005b remove = this.f17526m.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                C8896b.m24032d("DartMessenger", "Invoking registered callback for reply from Dart.");
                if (bArr == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bArr);
                }
                remove.mo46450a(byteBuffer);
            } catch (Exception e) {
                C8896b.m24031c("DartMessenger", "Uncaught exception in binary message reply handler", e);
            }
        }
    }

    @UiThread
    /* renamed from: d */
    public void mo46435d(@NonNull String str, @NonNull ByteBuffer byteBuffer) {
        C8896b.m24032d("DartMessenger", "Sending message over channel '" + str + "'");
        mo46433a(str, byteBuffer, (C9003c.C9005b) null);
    }

    /* renamed from: e */
    public void mo46449e(@NonNull String str, @Nullable byte[] bArr, int i) {
        ByteBuffer byteBuffer;
        C8896b.m24032d("DartMessenger", "Received message from Dart over channel '" + str + "'");
        C9003c.C9004a aVar = this.f17525l.get(str);
        if (aVar != null) {
            try {
                C8896b.m24032d("DartMessenger", "Deferring to registered handler to process message.");
                if (bArr == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bArr);
                }
                aVar.mo46443a(byteBuffer, new C8934a(this.f17524e, i));
            } catch (Exception e) {
                C8896b.m24031c("DartMessenger", "Uncaught exception in binary message listener", e);
                this.f17524e.invokePlatformMessageEmptyResponseCallback(i);
            }
        } else {
            C8896b.m24032d("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f17524e.invokePlatformMessageEmptyResponseCallback(i);
        }
    }
}
