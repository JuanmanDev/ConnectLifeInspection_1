package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UShort;
import kotlin.text.Typography;

public class FlexBuffers {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends Sized {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f243bb.data());
            wrap.position(this.end);
            wrap.limit(this.end + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f243bb.get(this.end + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f243bb.get(this.end + i);
            }
            return bArr;
        }

        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public String toString() {
            return this.f243bb.getString(this.end, size());
        }

        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.f243bb.getString(this.end, size()));
            sb.append(Typography.quote);
            return sb;
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {
        public static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.end;
            int i2 = 0;
            do {
                b = this.f243bb.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (key.end == this.end && key.byteWidth == this.byteWidth) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public String toString() {
            int i = this.end;
            while (this.f243bb.get(i) != 0) {
                i++;
            }
            int i2 = this.end;
            return this.f243bb.getString(i2, i - i2);
        }
    }

    public static class KeyVector {
        public final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f243bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, typedVector.end + (i * typedVector.byteWidth), typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb);
                if (i != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Map extends Vector {
        public static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int compareTo = keyVector.get(i2).compareTo(bArr);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else if (compareTo <= 0) {
                    return i2;
                } else {
                    size = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f243bb;
            int access$200 = FlexBuffers.indirect(readBuf, i, this.byteWidth);
            ReadBuf readBuf2 = this.f243bb;
            int i2 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, access$200, FlexBuffers.readInt(readBuf2, i + i2, i2), 4));
        }

        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i = 0; i < size; i++) {
                sb.append(Typography.quote);
                sb.append(keys.get(i).toString());
                sb.append("\" : ");
                sb.append(values.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f243bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            if (binarySearch < 0 || binarySearch >= size) {
                return Reference.NULL_REFERENCE;
            }
            return get(binarySearch);
        }
    }

    public static abstract class Object {

        /* renamed from: bb */
        public ReadBuf f243bb;
        public int byteWidth;
        public int end;

        public Object(ReadBuf readBuf, int i, int i2) {
            this.f243bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    public static class Reference {
        public static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* renamed from: bb */
        public ReadBuf f244bb;
        public int byteWidth;
        public int end;
        public int parentWidth;
        public int type;

        public Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f244bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                if (this.f244bb.get(this.end) != 0) {
                    return true;
                }
                return false;
            } else if (asUInt() != 0) {
                return true;
            } else {
                return false;
            }
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return FlexBuffers.readDouble(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return (double) FlexBuffers.readInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    ReadBuf readBuf = this.f244bb;
                    return (double) FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 7) {
                    ReadBuf readBuf2 = this.f244bb;
                    return (double) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 8) {
                    ReadBuf readBuf3 = this.f244bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                } else if (i == 10) {
                    return (double) asVector().size();
                } else {
                    if (i != 26) {
                        return 0.0d;
                    }
                }
            }
            return (double) FlexBuffers.readUInt(this.f244bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return (int) FlexBuffers.readUInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (int) FlexBuffers.readDouble(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Integer.parseInt(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f244bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 7) {
                ReadBuf readBuf2 = this.f244bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            } else if (i == 8) {
                ReadBuf readBuf3 = this.f244bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 10) {
                return asVector().size();
            } else {
                if (i != 26) {
                    return 0;
                }
                return FlexBuffers.readInt(this.f244bb, this.end, this.parentWidth);
            }
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f244bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readLong(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return FlexBuffers.readUInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0;
                }
            } else if (i == 6) {
                ReadBuf readBuf = this.f244bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 7) {
                ReadBuf readBuf2 = this.f244bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            } else if (i == 8) {
                ReadBuf readBuf3 = this.f244bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 10) {
                return (long) asVector().size();
            } else {
                if (i != 26) {
                    return 0;
                }
                return (long) FlexBuffers.readInt(this.f244bb, this.end, this.parentWidth);
            }
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f244bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int access$200 = FlexBuffers.indirect(this.f244bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f244bb;
                int i = this.byteWidth;
                return this.f244bb.getString(access$200, (int) FlexBuffers.readUInt(readBuf, access$200 - i, i));
            } else if (!isKey()) {
                return "";
            } else {
                int access$2002 = FlexBuffers.indirect(this.f244bb, this.end, this.byteWidth);
                int i2 = access$2002;
                while (this.f244bb.get(i2) != 0) {
                    i2++;
                }
                return this.f244bb.getString(access$2002, i2 - access$2002);
            }
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return FlexBuffers.readUInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readLong(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return (long) asVector().size();
            }
            if (i == 26) {
                return (long) FlexBuffers.readInt(this.f244bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f244bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            } else if (i == 7) {
                ReadBuf readBuf2 = this.f244bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            } else if (i != 8) {
                return 0;
            } else {
                ReadBuf readBuf3 = this.f244bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
            }
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f244bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                ReadBuf readBuf2 = this.f244bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            } else if (!FlexBuffers.isTypedVector(i)) {
                return Vector.empty();
            } else {
                ReadBuf readBuf3 = this.f244bb;
                return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            }
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i = this.type;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.type;
            return i == 1 || i == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i = this.type;
            return i == 2 || i == 7;
        }

        public boolean isVector() {
            int i = this.type;
            return i == 10 || i == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.f244bb = readBuf;
            this.end = i;
            this.parentWidth = i2;
            this.byteWidth = i3;
            this.type = i4;
        }

        public StringBuilder toString(StringBuilder sb) {
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append(Typography.quote);
                        StringBuilder key = asKey.toString(sb);
                        key.append(Typography.quote);
                        return key;
                    case 5:
                        sb.append(Typography.quote);
                        sb.append(asString());
                        sb.append(Typography.quote);
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    public static abstract class Sized extends Object {
        public final int size;

        public Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = FlexBuffers.readInt(this.f243bb, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        public static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        public final int elemType;

        public TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i) {
            if (i >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f243bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b) {
            return b & 255;
        }

        public static long intToUnsignedLong(int i) {
            return ((long) i) & 4294967295L;
        }

        public static int shortToUnsignedInt(short s) {
            return s & UShort.MAX_VALUE;
        }
    }

    public static class Vector extends Sized {
        public static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i) {
            long size = (long) size();
            long j = (long) i;
            if (j >= size) {
                return Reference.NULL_REFERENCE;
            }
            int byteToUnsignedInt = Unsigned.byteToUnsignedInt(this.f243bb.get((int) (((long) this.end) + (size * ((long) this.byteWidth)) + j)));
            return new Reference(this.f243bb, this.end + (i * this.byteWidth), this.byteWidth, byteToUnsignedInt);
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    public static int indirect(ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - readUInt(readBuf, i, i2));
    }

    public static boolean isTypeInline(int i) {
        return i <= 3 || i == 26;
    }

    public static boolean isTypedVector(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    public static boolean isTypedVectorElementType(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    public static double readDouble(ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return (double) readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    public static int readInt(ReadBuf readBuf, int i, int i2) {
        return (int) readLong(readBuf, i, i2);
    }

    public static long readLong(ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else if (i2 == 4) {
            i3 = readBuf.getInt(i);
        } else if (i2 != 8) {
            return -1;
        } else {
            return readBuf.getLong(i);
        }
        return (long) i3;
    }

    public static long readUInt(ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return (long) Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return (long) Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1;
        }
        return readBuf.getLong(i);
    }

    public static int toTypedVector(int i, int i2) {
        if (i2 == 0) {
            return (i - 1) + 11;
        }
        if (i2 == 2) {
            return (i - 1) + 16;
        }
        if (i2 == 3) {
            return (i - 1) + 19;
        }
        if (i2 != 4) {
            return 0;
        }
        return (i - 1) + 22;
    }

    public static int toTypedVectorElementType(int i) {
        return (i - 11) + 1;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int limit = readBuf.limit() - 1;
        byte b = readBuf.get(limit);
        int i = limit - 1;
        return new Reference(readBuf, i - b, b, Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }
}
