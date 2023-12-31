package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

@RequiresApi(19)
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MetadataListReader {
    public static final int EMJI_TAG = 1164798569;
    public static final int EMJI_TAG_DEPRECATED = 1701669481;
    public static final int META_TABLE_NAME = 1835365473;

    public static class ByteBufferReader implements OpenTypeReader {
        @NonNull
        public final ByteBuffer mByteBuffer;

        public ByteBufferReader(@NonNull ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public long getPosition() {
            return (long) this.mByteBuffer.position();
        }

        public int readTag() {
            return this.mByteBuffer.getInt();
        }

        public long readUnsignedInt() {
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        public int readUnsignedShort() {
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        public void skip(int i) {
            ByteBuffer byteBuffer = this.mByteBuffer;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static class InputStreamOpenTypeReader implements OpenTypeReader {
        @NonNull
        public final byte[] mByteArray;
        @NonNull
        public final ByteBuffer mByteBuffer;
        @NonNull
        public final InputStream mInputStream;
        public long mPosition = 0;

        public InputStreamOpenTypeReader(@NonNull InputStream inputStream) {
            this.mInputStream = inputStream;
            byte[] bArr = new byte[4];
            this.mByteArray = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.mByteBuffer = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void read(@IntRange(from = 0, mo840to = 4) int i) {
            if (this.mInputStream.read(this.mByteArray, 0, i) == i) {
                this.mPosition += (long) i;
                return;
            }
            throw new IOException("read failed");
        }

        public long getPosition() {
            return this.mPosition;
        }

        public int readTag() {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        public long readUnsignedInt() {
            this.mByteBuffer.position(0);
            read(4);
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        public int readUnsignedShort() {
            this.mByteBuffer.position(0);
            read(2);
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        public void skip(int i) {
            while (i > 0) {
                int skip = (int) this.mInputStream.skip((long) i);
                if (skip >= 1) {
                    i -= skip;
                    this.mPosition += (long) skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }
    }

    public static class OffsetInfo {
        public final long mLength;
        public final long mStartOffset;

        public OffsetInfo(long j, long j2) {
            this.mStartOffset = j;
            this.mLength = j2;
        }

        public long getLength() {
            return this.mLength;
        }

        public long getStartOffset() {
            return this.mStartOffset;
        }
    }

    public interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag();

        long readUnsignedInt();

        int readUnsignedShort();

        void skip(int i);
    }

    public static OffsetInfo findOffsetInfo(OpenTypeReader openTypeReader) {
        long j;
        openTypeReader.skip(4);
        int readUnsignedShort = openTypeReader.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            openTypeReader.skip(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int readTag = openTypeReader.readTag();
                openTypeReader.skip(4);
                j = openTypeReader.readUnsignedInt();
                openTypeReader.skip(4);
                if (1835365473 == readTag) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                openTypeReader.skip((int) (j - openTypeReader.getPosition()));
                openTypeReader.skip(12);
                long readUnsignedInt = openTypeReader.readUnsignedInt();
                for (int i2 = 0; ((long) i2) < readUnsignedInt; i2++) {
                    int readTag2 = openTypeReader.readTag();
                    long readUnsignedInt2 = openTypeReader.readUnsignedInt();
                    long readUnsignedInt3 = openTypeReader.readUnsignedInt();
                    if (1164798569 == readTag2 || 1701669481 == readTag2) {
                        return new OffsetInfo(readUnsignedInt2 + j, readUnsignedInt3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList read(InputStream inputStream) {
        InputStreamOpenTypeReader inputStreamOpenTypeReader = new InputStreamOpenTypeReader(inputStream);
        OffsetInfo findOffsetInfo = findOffsetInfo(inputStreamOpenTypeReader);
        inputStreamOpenTypeReader.skip((int) (findOffsetInfo.getStartOffset() - inputStreamOpenTypeReader.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) findOffsetInfo.getLength());
        int read = inputStream.read(allocate.array());
        if (((long) read) == findOffsetInfo.getLength()) {
            return MetadataList.getRootAsMetadataList(allocate);
        }
        throw new IOException("Needed " + findOffsetInfo.getLength() + " bytes, got " + read);
    }

    public static long toUnsignedInt(int i) {
        return ((long) i) & 4294967295L;
    }

    public static int toUnsignedShort(short s) {
        return s & UShort.MAX_VALUE;
    }

    public static MetadataList read(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) findOffsetInfo(new ByteBufferReader(duplicate)).getStartOffset());
        return MetadataList.getRootAsMetadataList(duplicate);
    }

    public static MetadataList read(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        try {
            MetadataList read = read(open);
            if (open != null) {
                open.close();
            }
            return read;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
