package p040c.p200q.p405d;

import com.google.protobuf.ByteString;

/* renamed from: c.q.d.i1 */
/* compiled from: TextFormatEscaper */
public final class C6934i1 {

    /* renamed from: c.q.d.i1$a */
    /* compiled from: TextFormatEscaper */
    public static class C6935a implements C6936b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f13270a;

        public C6935a(ByteString byteString) {
            this.f13270a = byteString;
        }

        /* renamed from: a */
        public byte mo32021a(int i) {
            return this.f13270a.byteAt(i);
        }

        public int size() {
            return this.f13270a.size();
        }
    }

    /* renamed from: c.q.d.i1$b */
    /* compiled from: TextFormatEscaper */
    public interface C6936b {
        /* renamed from: a */
        byte mo32021a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m19956a(ByteString byteString) {
        return m19957b(new C6935a(byteString));
    }

    /* renamed from: b */
    public static String m19957b(C6936b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo32021a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m19958c(String str) {
        return m19956a(ByteString.copyFromUtf8(str));
    }
}
