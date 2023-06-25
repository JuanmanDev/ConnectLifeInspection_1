package p040c.p200q.p201a.p219b.p235h0.p236f;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: c.q.a.b.h0.f.b */
/* compiled from: EventMessageEncoder */
public final class C2835b {

    /* renamed from: a */
    public final ByteArrayOutputStream f4411a = new ByteArrayOutputStream(512);

    /* renamed from: b */
    public final DataOutputStream f4412b = new DataOutputStream(this.f4411a);

    /* renamed from: b */
    public static void m6057b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    public static void m6058c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    @Nullable
    /* renamed from: a */
    public byte[] mo18907a(EventMessage eventMessage) {
        this.f4411a.reset();
        try {
            m6057b(this.f4412b, eventMessage.f7732e);
            m6057b(this.f4412b, eventMessage.f7733l != null ? eventMessage.f7733l : "");
            m6058c(this.f4412b, 1000);
            m6058c(this.f4412b, 0);
            m6058c(this.f4412b, eventMessage.f7734m);
            m6058c(this.f4412b, eventMessage.f7735n);
            this.f4412b.write(eventMessage.f7736o);
            this.f4412b.flush();
            return this.f4411a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
