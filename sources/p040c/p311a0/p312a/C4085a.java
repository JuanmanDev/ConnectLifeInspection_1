package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.UShort;
import p040c.p311a0.p312a.C4099e;
import p040c.p311a0.p312a.C4117m;

/* renamed from: c.a0.a.a */
/* compiled from: AdvertisementParser */
public class C4085a {
    /* renamed from: a */
    public static C4099e m11044a(byte[] bArr) {
        UUID uuid;
        int i;
        long j;
        ByteBuffer order = ByteBuffer.wrap(bArr).asReadOnlyBuffer().order(ByteOrder.LITTLE_ENDIAN);
        C4099e.C4100a U = C4099e.m11093U();
        boolean z = false;
        while (true) {
            byte b = order.get() & 255;
            if (b == 0) {
                return (C4099e) U.build();
            }
            if (b <= order.remaining()) {
                byte b2 = order.get() & 255;
                int i2 = b - 1;
                if (b2 != 22) {
                    if (b2 != 255) {
                        if (!(b2 == 32 || b2 == 33)) {
                            switch (b2) {
                                case 8:
                                case 9:
                                    if (z) {
                                        order.position(order.position() + i2);
                                        break;
                                    } else {
                                        byte[] bArr2 = new byte[i2];
                                        order.get(bArr2);
                                        try {
                                            U.mo25321J(new String(bArr2, "UTF-8"));
                                            if (b2 != 9) {
                                                break;
                                            } else {
                                                z = true;
                                                break;
                                            }
                                        } catch (UnsupportedEncodingException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                case 10:
                                    C4117m.C4118a J = C4117m.m11230J();
                                    J.mo25391F(order.get());
                                    U.mo25322K(J);
                                    break;
                                default:
                                    order.position(order.position() + i2);
                                    break;
                            }
                        }
                    } else if (i2 >= 2) {
                        short s = order.getShort();
                        int i3 = i2 - 2;
                        if (i3 > 0) {
                            byte[] bArr3 = new byte[i3];
                            order.get(bArr3);
                            U.mo25318G(s, ByteString.copyFrom(bArr3));
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Not enough data for Manufacturer specific data.");
                    }
                }
                if (b2 == 22 || b2 == 32) {
                    if (b2 == 22) {
                        j = (long) (order.getShort() & UShort.MAX_VALUE);
                        i = i2 - 2;
                    } else {
                        j = (long) (order.getInt() & -1);
                        i = i2 - 4;
                    }
                    uuid = UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", new Object[]{Long.valueOf(j)}));
                } else {
                    uuid = new UUID(order.getLong(), order.getLong());
                    i = i2 - 16;
                }
                byte[] bArr4 = new byte[i];
                order.get(bArr4);
                U.mo25319H(uuid.toString(), ByteString.copyFrom(bArr4));
            } else {
                throw new ArrayIndexOutOfBoundsException("Not enough data.");
            }
        }
    }
}
