package p040c.p200q.p406e;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: c.q.e.h */
/* compiled from: Result */
public final class C7022h {

    /* renamed from: a */
    public final String f13420a;

    /* renamed from: b */
    public final byte[] f13421b;

    /* renamed from: c */
    public C7023i[] f13422c;

    /* renamed from: d */
    public final BarcodeFormat f13423d;

    /* renamed from: e */
    public Map<ResultMetadataType, Object> f13424e;

    public C7022h(String str, byte[] bArr, C7023i[] iVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, iVarArr, barcodeFormat, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo32477a(C7023i[] iVarArr) {
        C7023i[] iVarArr2 = this.f13422c;
        if (iVarArr2 == null) {
            this.f13422c = iVarArr;
        } else if (iVarArr != null && iVarArr.length > 0) {
            C7023i[] iVarArr3 = new C7023i[(iVarArr2.length + iVarArr.length)];
            System.arraycopy(iVarArr2, 0, iVarArr3, 0, iVarArr2.length);
            System.arraycopy(iVarArr, 0, iVarArr3, iVarArr2.length, iVarArr.length);
            this.f13422c = iVarArr3;
        }
    }

    /* renamed from: b */
    public BarcodeFormat mo32478b() {
        return this.f13423d;
    }

    /* renamed from: c */
    public byte[] mo32479c() {
        return this.f13421b;
    }

    /* renamed from: d */
    public Map<ResultMetadataType, Object> mo32480d() {
        return this.f13424e;
    }

    /* renamed from: e */
    public C7023i[] mo32481e() {
        return this.f13422c;
    }

    /* renamed from: f */
    public String mo32482f() {
        return this.f13420a;
    }

    /* renamed from: g */
    public void mo32483g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f13424e;
            if (map2 == null) {
                this.f13424e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo32484h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f13424e == null) {
            this.f13424e = new EnumMap(ResultMetadataType.class);
        }
        this.f13424e.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f13420a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7022h(String str, byte[] bArr, C7023i[] iVarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, iVarArr, barcodeFormat, j);
    }

    public C7022h(String str, byte[] bArr, int i, C7023i[] iVarArr, BarcodeFormat barcodeFormat, long j) {
        this.f13420a = str;
        this.f13421b = bArr;
        this.f13422c = iVarArr;
        this.f13423d = barcodeFormat;
        this.f13424e = null;
    }
}
