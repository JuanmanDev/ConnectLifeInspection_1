package p040c.p301y.p302b.p303a;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.juconnect.connectlife.ju_ble.model.WifiBean;
import java.util.Arrays;
import java.util.Random;
import p040c.p301y.p302b.p303a.p304s.C3700h;

/* renamed from: c.y.b.a.n */
/* compiled from: BLEHandlerThread */
public class C3675n extends HandlerThread {

    /* renamed from: n */
    public static C3675n f6620n;

    /* renamed from: o */
    public static C3700h f6621o;

    /* renamed from: p */
    public static WifiBean f6622p;

    /* renamed from: e */
    public String f6623e;

    /* renamed from: l */
    public String f6624l;

    /* renamed from: m */
    public Handler f6625m;

    /* renamed from: c.y.b.a.n$a */
    /* compiled from: BLEHandlerThread */
    public class C3676a extends Handler {
        public C3676a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 2:
                    C3675n.f6621o.mo21048U();
                    return;
                case 3:
                    C3700h.f6681D = C3677o.f6627a;
                    C3675n.f6621o.mo21031C((BluetoothDevice) message.obj);
                    return;
                case 4:
                    C3700h.f6681D = C3677o.f6627a;
                    C3675n.f6622p = (WifiBean) message.obj;
                    C3675n.f6621o.mo21045R(C3675n.m9210d(C3675n.f6622p.getBssid(), C3675n.f6622p.getPassword()));
                    return;
                case 5:
                    C3700h.f6681D = C3677o.f6629c;
                    C3675n.f6621o.mo21045R(new byte[]{0, 5, 0, 1, 0});
                    return;
                case 6:
                    C3675n.this.f6623e = (String) message.obj;
                    C3700h.f6681D = C3677o.f6630d;
                    C3675n.f6621o.mo21045R(new byte[]{0, 6, 0, 1, 0});
                    return;
                case 7:
                    C3675n.this.f6624l = (String) message.obj;
                    C3700h.f6681D = C3677o.f6628b;
                    C3675n.f6621o.mo21045R(new byte[]{0, 3, 0, 1, 0});
                    return;
                case 8:
                    C3700h.f6681D = C3677o.f6627a;
                    C3675n.f6621o.mo21045R(C3675n.m9210d(C3675n.f6622p.getBssid(), C3675n.f6622p.getPassword()));
                    return;
                default:
                    return;
            }
        }
    }

    public C3675n(String str) {
        super(str);
    }

    /* renamed from: a */
    public static byte[] m9208a(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 8 - i;
        int i4 = bArr[0] >>> i3;
        while (i2 < bArr.length - 1) {
            int i5 = i2 + 1;
            bArr[i2] = (byte) (((bArr[i2] & 255) << i) | (bArr[i5] >>> i3));
            i2 = i5;
        }
        bArr[bArr.length - 1] = (byte) ((bArr[bArr.length - 1] & 255) << i);
        bArr[bArr.length - 1] = (byte) (bArr[bArr.length - 1] | i4);
        return bArr;
    }

    /* renamed from: b */
    public static C3675n m9209b() {
        synchronized (C3675n.class) {
            if (f6620n == null) {
                f6620n = new C3675n("BLEHandlerThread");
            }
        }
        return f6620n;
    }

    /* renamed from: d */
    public static byte[] m9210d(String str, String str2) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2.getBytes();
        "bssidByte = " + Arrays.toString(bytes);
        "passwordByte = " + Arrays.toString(bytes2);
        byte[] bArr = new byte[(bytes.length + 1 + 1 + bytes2.length)];
        bArr[0] = (byte) str.length();
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        bArr[bytes.length + 1] = (byte) str2.length();
        System.arraycopy(bytes2, 0, bArr, bytes.length + 2, bytes2.length);
        "rData = " + bArr;
        int nextDouble = (int) ((new Random().nextDouble() * 10.0d) % 8.0d);
        if (nextDouble == 0) {
            nextDouble++;
        }
        "move = " + nextDouble;
        m9208a(bArr, nextDouble);
        "rData2 = " + bArr;
        int length = bArr.length + 3 + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) length;
        bArr2[1] = 0;
        bArr2[2] = (byte) nextDouble;
        "jointData: 循环左移" + nextDouble;
        System.arraycopy(bArr, 0, bArr2, 3, bArr.length);
        "aData = " + bArr2;
        int i = 0;
        byte b = 0;
        while (true) {
            int i2 = length - 1;
            if (i < i2) {
                b = (byte) (b ^ bArr2[i]);
                i++;
            } else {
                bArr2[i2] = b;
                "^= aData = " + bArr2;
                byte[] bArr3 = new byte[(length + 4)];
                byte[] bArr4 = {0, 2, 0, 0};
                bArr4[2] = (byte) (length / 256);
                bArr4[3] = (byte) (length % 256);
                "headData = " + bArr4;
                System.arraycopy(bArr4, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, 0, bArr3, 4, length);
                "sendData = " + Arrays.toString(bArr3);
                "sendData:" + Arrays.toString(bArr3);
                return bArr3;
            }
        }
    }

    /* renamed from: c */
    public Handler mo20950c() {
        Handler handler = this.f6625m;
        if (handler != null) {
            return handler;
        }
        C3676a aVar = new C3676a(Looper.myLooper());
        this.f6625m = aVar;
        return aVar;
    }
}
