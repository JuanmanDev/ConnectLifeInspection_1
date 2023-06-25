package okio;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Î\u0001B\b¢\u0006\u0005\bÍ\u0001\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0006J+\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0016J'\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u0018\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0004\b-\u0010*J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001aH\u0002¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a¢\u0006\u0004\b7\u00105J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020(H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020(2\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010<J'\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020(2\u0006\u0010;\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010>J\u0017\u00109\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u0010@J\u001f\u00109\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010AJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010@J\u001f\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\bC\u0010AJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020!H\u0016¢\u0006\u0004\bG\u0010%J\r\u0010H\u001a\u00020\u001a¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0001H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\bN\u0010OJ/\u0010N\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020.H\u0016¢\u0006\u0004\bN\u0010QJ\u0017\u0010T\u001a\u00020.2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010T\u001a\u00020.2\u0006\u0010S\u001a\u00020VH\u0016¢\u0006\u0004\bT\u0010WJ'\u0010T\u001a\u00020.2\u0006\u0010S\u001a\u00020V2\u0006\u0010\u0012\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020.H\u0016¢\u0006\u0004\bT\u0010XJ\u001f\u0010T\u001a\u00020\f2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\bT\u0010YJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010S\u001a\u00020ZH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001a\u00020]2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020(H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020VH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001a\u00020V2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\bc\u0010eJ\u000f\u0010f\u001a\u00020\u001aH\u0016¢\u0006\u0004\bf\u0010IJ\u0017\u0010f\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\fH\u0016¢\u0006\u0004\bh\u0010\u000eJ\u0015\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020D¢\u0006\u0004\bj\u0010kJ\u001d\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020D2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\bj\u0010lJ'\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u00020D2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010m\u001a\u00020!H\u0002¢\u0006\u0004\bj\u0010nJ\u0017\u0010o\u001a\u00020\u00072\u0006\u0010S\u001a\u00020VH\u0016¢\u0006\u0004\bo\u0010pJ\u001f\u0010o\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\bo\u0010qJ\u000f\u0010r\u001a\u00020\fH\u0016¢\u0006\u0004\br\u0010\u000eJ\u000f\u0010s\u001a\u00020.H\u0016¢\u0006\u0004\bs\u00100J\u000f\u0010t\u001a\u00020.H\u0016¢\u0006\u0004\bt\u00100J\u000f\u0010u\u001a\u00020\fH\u0016¢\u0006\u0004\bu\u0010\u000eJ\u000f\u0010v\u001a\u00020\fH\u0016¢\u0006\u0004\bv\u0010\u000eJ\u000f\u0010x\u001a\u00020wH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020wH\u0016¢\u0006\u0004\bz\u0010yJ\u0017\u0010}\u001a\u00020\u00182\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010~J\u001f\u0010}\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010J\u001b\u0010\u0001\u001a\u00020]2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0005\b\u0001\u0010`J\u0012\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b\u0001\u00100J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020.2\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010IJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010IJ\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010IJ\u0011\u0010\u0001\u001a\u00020\fH\u0007¢\u0006\u0005\b\u0001\u0010\u000eJ\u001a\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010IJ\u0018\u0010\u0001\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010 \u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010¢\u0001\u001a\u00020.2\u0007\u0010¡\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b¢\u0001\u0010UJ\u001b\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010¡\u0001\u001a\u00020VH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J+\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010¡\u0001\u001a\u00020V2\u0006\u0010\u0012\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020.H\u0016¢\u0006\u0006\b¢\u0001\u0010¤\u0001J\"\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010¡\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0005\b¢\u0001\u0010qJ\u001b\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010¥\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0006\b¢\u0001\u0010¦\u0001J+\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010¥\u0001\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020.H\u0016¢\u0006\u0006\b¢\u0001\u0010§\u0001J$\u0010¢\u0001\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030¨\u00012\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0006\b¢\u0001\u0010©\u0001J\u001c\u0010ª\u0001\u001a\u00020\f2\b\u0010¡\u0001\u001a\u00030¨\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010¬\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u00020.H\u0016¢\u0006\u0006\b¬\u0001\u0010­\u0001J\u001b\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001b\u0010±\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001b\u0010³\u0001\u001a\u00020\u00002\u0007\u0010²\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b³\u0001\u0010­\u0001J\u001b\u0010´\u0001\u001a\u00020\u00002\u0007\u0010²\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b´\u0001\u0010­\u0001J\u001b\u0010µ\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\bµ\u0001\u0010°\u0001J\u001b\u0010¶\u0001\u001a\u00020\u00002\u0007\u0010®\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\b¶\u0001\u0010°\u0001J\u001b\u0010¸\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b¸\u0001\u0010­\u0001J\u001b\u0010¹\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b¹\u0001\u0010­\u0001J#\u0010»\u0001\u001a\u00020\u00002\u0007\u0010º\u0001\u001a\u00020\u00182\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J5\u0010»\u0001\u001a\u00020\u00002\u0007\u0010º\u0001\u001a\u00020\u00182\u0007\u0010½\u0001\u001a\u00020.2\u0007\u0010¾\u0001\u001a\u00020.2\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0006\b»\u0001\u0010¿\u0001J$\u0010À\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001b\u0010Â\u0001\u001a\u00020\u00002\u0007\u0010º\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J-\u0010Â\u0001\u001a\u00020\u00002\u0007\u0010º\u0001\u001a\u00020\u00182\u0007\u0010½\u0001\u001a\u00020.2\u0007\u0010¾\u0001\u001a\u00020.H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ä\u0001J\u001b\u0010Æ\u0001\u001a\u00020\u00002\u0007\u0010Å\u0001\u001a\u00020.H\u0016¢\u0006\u0006\bÆ\u0001\u0010­\u0001R\u0017\u0010\u0005\u001a\u00020\u00008V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u0006R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R1\u0010\u0001\u001a\u00020\f2\u0007\u0010Ê\u0001\u001a\u00020\f8G@@X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010Ë\u0001\u001a\u0005\b\u0001\u0010\u000e\"\u0006\bÌ\u0001\u0010\u0001¨\u0006Ï\u0001"}, mo47991d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "Ljava/lang/Cloneable;", "Ljava/nio/channels/ByteChannel;", "buffer", "()Lokio/Buffer;", "", "clear", "()V", "clone", "close", "", "completeSegmentByteCount", "()J", "copy", "Ljava/io/OutputStream;", "out", "offset", "byteCount", "copyTo", "(Ljava/io/OutputStream;JJ)Lokio/Buffer;", "(Lokio/Buffer;J)Lokio/Buffer;", "(Lokio/Buffer;JJ)Lokio/Buffer;", "", "algorithm", "Lokio/ByteString;", "digest", "(Ljava/lang/String;)Lokio/ByteString;", "emit", "emitCompleteSegments", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "exhausted", "()Z", "flush", "pos", "", "getByte", "(J)B", "get", "index", "-deprecated_getByte", "", "hashCode", "()I", "key", "hmac", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "b", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "md5", "()Lokio/ByteString;", "outputStream", "()Ljava/io/OutputStream;", "peek", "()Lokio/BufferedSource;", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "Ljava/nio/ByteBuffer;", "sink", "read", "(Ljava/nio/ByteBuffer;)I", "", "([B)I", "([BII)I", "(Lokio/Buffer;J)J", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readAndWriteUnsafe", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "readByte", "()B", "readByteArray", "()[B", "(J)[B", "readByteString", "(J)Lokio/ByteString;", "readDecimalLong", "input", "readFrom", "(Ljava/io/InputStream;)Lokio/Buffer;", "(Ljava/io/InputStream;J)Lokio/Buffer;", "forever", "(Ljava/io/InputStream;JZ)V", "readFully", "([B)V", "(Lokio/Buffer;J)V", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "", "readShort", "()S", "readShortLe", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUnsafe", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "(J)Z", "require", "(J)V", "Lokio/Options;", "options", "select", "(Lokio/Options;)I", "sha1", "sha256", "sha512", "-deprecated_size", "size", "skip", "snapshot", "(I)Lokio/ByteString;", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "toString", "minimumCapacity", "Lokio/Segment;", "writableSegment$okio", "(I)Lokio/Segment;", "writableSegment", "source", "write", "([B)Lokio/Buffer;", "([BII)Lokio/Buffer;", "byteString", "(Lokio/ByteString;)Lokio/Buffer;", "(Lokio/ByteString;II)Lokio/Buffer;", "Lokio/Source;", "(Lokio/Source;J)Lokio/Buffer;", "writeAll", "(Lokio/Source;)J", "writeByte", "(I)Lokio/Buffer;", "v", "writeDecimalLong", "(J)Lokio/Buffer;", "writeHexadecimalUnsignedLong", "i", "writeInt", "writeIntLe", "writeLong", "writeLongLe", "s", "writeShort", "writeShortLe", "string", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;", "beginIndex", "endIndex", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;", "writeTo", "(Ljava/io/OutputStream;J)Lokio/Buffer;", "writeUtf8", "(Ljava/lang/String;)Lokio/Buffer;", "(Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "writeUtf8CodePoint", "getBuffer", "head", "Lokio/Segment;", "<set-?>", "J", "setSize$okio", "<init>", "UnsafeCursor", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Buffer.kt */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    @Nullable
    @JvmField
    public Segment head;
    public long size;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006#"}, mo47991d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "", "close", "()V", "", "minByteCount", "", "expandBuffer", "(I)J", "next", "()I", "newSize", "resizeBuffer", "(J)J", "offset", "seek", "(J)I", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "", "data", "[B", "end", "I", "J", "", "readWrite", "Z", "Lokio/Segment;", "segment", "Lokio/Segment;", "start", "<init>", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: Buffer.kt */
    public static final class UnsafeCursor implements Closeable {
        @Nullable
        @JvmField
        public Buffer buffer;
        @Nullable
        @JvmField
        public byte[] data;
        @JvmField
        public int end = -1;
        @JvmField
        public long offset = -1;
        @JvmField
        public boolean readWrite;
        public Segment segment;
        @JvmField
        public int start = -1;

        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final long expandBuffer(int i) {
            boolean z = true;
            if (i > 0) {
                if (i > 8192) {
                    z = false;
                }
                if (z) {
                    Buffer buffer2 = this.buffer;
                    if (buffer2 == null) {
                        throw new IllegalStateException("not attached to a buffer".toString());
                    } else if (this.readWrite) {
                        long size = buffer2.size();
                        Segment writableSegment$okio = buffer2.writableSegment$okio(i);
                        int i2 = 8192 - writableSegment$okio.limit;
                        writableSegment$okio.limit = 8192;
                        long j = (long) i2;
                        buffer2.setSize$okio(size + j);
                        this.segment = writableSegment$okio;
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        this.start = 8192 - i2;
                        this.end = 8192;
                        return j;
                    } else {
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                } else {
                    throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
                }
            } else {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
            }
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                Intrinsics.throwNpe();
            }
            if (j != buffer2.size()) {
                long j2 = this.offset;
                return seek(j2 == -1 ? 0 : j2 + ((long) (this.end - this.start)));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long resizeBuffer(long j) {
            long j2 = j;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.readWrite) {
                long size = buffer2.size();
                int i = (j2 > size ? 1 : (j2 == size ? 0 : -1));
                int i2 = 1;
                if (i <= 0) {
                    if (j2 >= 0) {
                        long j3 = size - j2;
                        while (true) {
                            if (j3 > 0) {
                                Segment segment2 = buffer2.head;
                                if (segment2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                Segment segment3 = segment2.prev;
                                if (segment3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                int i3 = segment3.limit;
                                long j4 = (long) (i3 - segment3.pos);
                                if (j4 > j3) {
                                    segment3.limit = i3 - ((int) j3);
                                    break;
                                }
                                buffer2.head = segment3.pop();
                                SegmentPool.INSTANCE.recycle(segment3);
                                j3 -= j4;
                            } else {
                                break;
                            }
                        }
                        this.segment = null;
                        this.offset = j2;
                        this.data = null;
                        this.start = -1;
                        this.end = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                    }
                } else if (i > 0) {
                    long j5 = j2 - size;
                    boolean z = true;
                    while (j5 > 0) {
                        Segment writableSegment$okio = buffer2.writableSegment$okio(i2);
                        int min = (int) Math.min(j5, (long) (8192 - writableSegment$okio.limit));
                        int i4 = writableSegment$okio.limit + min;
                        writableSegment$okio.limit = i4;
                        j5 -= (long) min;
                        if (z) {
                            this.segment = writableSegment$okio;
                            this.offset = size;
                            this.data = writableSegment$okio.data;
                            this.start = i4 - min;
                            this.end = i4;
                            z = false;
                        }
                        i2 = 1;
                    }
                }
                buffer2.setSize$okio(j2);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public final int seek(long j) {
            Segment segment2;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < ((long) -1) || j > buffer2.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer2.size())}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j == -1 || j == buffer2.size()) {
                this.segment = null;
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            } else {
                long j2 = 0;
                long size = buffer2.size();
                Segment segment3 = buffer2.head;
                Segment segment4 = this.segment;
                if (segment4 != null) {
                    long j3 = this.offset;
                    int i = this.start;
                    if (segment4 == null) {
                        Intrinsics.throwNpe();
                    }
                    long j4 = j3 - ((long) (i - segment4.pos));
                    if (j4 > j) {
                        segment2 = segment3;
                        segment3 = this.segment;
                        size = j4;
                    } else {
                        segment2 = this.segment;
                        j2 = j4;
                    }
                } else {
                    segment2 = segment3;
                }
                if (size - j > j - j2) {
                    while (true) {
                        if (segment2 == null) {
                            Intrinsics.throwNpe();
                        }
                        int i2 = segment2.limit;
                        int i3 = segment2.pos;
                        if (j < ((long) (i2 - i3)) + j2) {
                            break;
                        }
                        j2 += (long) (i2 - i3);
                        segment2 = segment2.next;
                    }
                } else {
                    while (size > j) {
                        if (segment3 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment3 = segment3.prev;
                        if (segment3 == null) {
                            Intrinsics.throwNpe();
                        }
                        size -= (long) (segment3.limit - segment3.pos);
                    }
                    j2 = size;
                    segment2 = segment3;
                }
                if (this.readWrite) {
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (segment2.shared) {
                        Segment unsharedCopy = segment2.unsharedCopy();
                        if (buffer2.head == segment2) {
                            buffer2.head = unsharedCopy;
                        }
                        segment2 = segment2.push(unsharedCopy);
                        Segment segment5 = segment2.prev;
                        if (segment5 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment5.pop();
                    }
                }
                this.segment = segment2;
                this.offset = j;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                this.data = segment2.data;
                int i4 = segment2.pos + ((int) (j - j2));
                this.start = i4;
                int i5 = segment2.limit;
                this.end = i5;
                return i5 - i4;
            }
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    private final ByteString digest(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            instance.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i2 = segment2.pos;
                instance.update(bArr2, i2, segment2.limit - i2);
                segment2 = segment2.next;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
            }
        }
        byte[] digest = instance.digest();
        Intrinsics.checkExpressionValueIsNotNull(digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                instance.update(segment.data, segment.pos, segment.limit - segment.pos);
                Segment segment2 = segment.next;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                while (segment2 != segment) {
                    instance.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                    segment2 = segment2.next;
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                }
            }
            byte[] doFinal = instance.doFinal();
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m28986deprecated_getByte(long j) {
        return getByte(j);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final long m28987deprecated_size() {
        return this.size;
    }

    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size2 = size();
        if (size2 == 0) {
            return 0;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.throwNpe();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.throwNpe();
        }
        int i = segment2.limit;
        if (i < 8192 && segment2.owner) {
            size2 -= (long) (i - segment2.pos);
        }
        return size2;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @NotNull
    @JvmOverloads
    public final Buffer copyTo(@NotNull OutputStream outputStream) {
        return copyTo$default(this, outputStream, 0, 0, 6, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j) {
        return copyTo$default(this, outputStream, j, 0, 4, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j, long j2) {
        Util.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            segment = segment.next;
        }
        while (j2 > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i3 = (int) (((long) segment.pos) + j);
            int min = (int) Math.min((long) (segment.limit - i3), j2);
            outputStream.write(segment.data, i3, min);
            j2 -= (long) min;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    @NotNull
    public Buffer emit() {
        return this;
    }

    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x008b
        L_0x000b:
            boolean r4 = r1 instanceof okio.Buffer
            if (r4 != 0) goto L_0x0011
            goto L_0x008b
        L_0x0011:
            long r4 = r20.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r6 = r1.size()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0021
            goto L_0x008b
        L_0x0021:
            long r4 = r20.size()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            goto L_0x0008
        L_0x002c:
            okio.Segment r4 = r0.head
            if (r4 != 0) goto L_0x0033
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0033:
            okio.Segment r1 = r1.head
            if (r1 != 0) goto L_0x003a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003a:
            int r5 = r4.pos
            int r8 = r1.pos
            r9 = r6
        L_0x003f:
            long r11 = r20.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0053:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006f
            byte[] r15 = r4.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0066
            goto L_0x008b
        L_0x0066:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0053
        L_0x006f:
            int r13 = r4.limit
            if (r5 != r13) goto L_0x007c
            okio.Segment r4 = r4.next
            if (r4 != 0) goto L_0x007a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x007a:
            int r5 = r4.pos
        L_0x007c:
            int r13 = r1.limit
            if (r8 != r13) goto L_0x0089
            okio.Segment r1 = r1.next
            if (r1 != 0) goto L_0x0087
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0087:
            int r8 = r1.pos
        L_0x0089:
            long r9 = r9 + r11
            goto L_0x003f
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.equals(java.lang.Object):boolean");
    }

    public boolean exhausted() {
        return this.size == 0;
    }

    public void flush() {
    }

    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long j) {
        Util.checkOffsetAndCount(size(), j, 1);
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.throwNpe();
            return null.data[(int) ((((long) null.pos) + j) - -1)];
        } else if (size() - j < j) {
            long size2 = size();
            while (size2 > j) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                size2 -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - size2)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (segment.limit - segment.pos)) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j2 = j3;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - j2)];
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
        } while (segment != this.head);
        return i;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    public long indexOf(byte b) {
        return indexOf(b, 0, Long.MAX_VALUE);
    }

    public long indexOfElement(@NotNull ByteString byteString) {
        return indexOfElement(byteString, 0);
    }

    @NotNull
    public InputStream inputStream() {
        return new Buffer$inputStream$1(this);
    }

    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @NotNull
    public OutputStream outputStream() {
        return new Buffer$outputStream$1(this);
    }

    @NotNull
    public BufferedSource peek() {
        return Okio.buffer((Source) new PeekSource(this));
    }

    public boolean rangeEquals(long j, @NotNull ByteString byteString) {
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public int read(@NotNull ByteBuffer byteBuffer) {
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i = segment.pos + min;
        segment.pos = i;
        this.size -= (long) min;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.INSTANCE.recycle(segment);
        }
        return min;
    }

    public long readAll(@NotNull Sink sink) {
        long size2 = size();
        if (size2 > 0) {
            sink.write(this, size2);
        }
        return size2;
    }

    @NotNull
    @JvmOverloads
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, (UnsafeCursor) null, 1, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public byte readByte() {
        if (size() != 0) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            setSize$okio(size() - 1);
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r10 != r11) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r0.head = r16.pop();
        okio.SegmentPool.INSTANCE.recycle(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        r16.pos = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r7 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r17.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d5
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0011:
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0018
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0018:
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L_0x001e:
            r12 = 1
            if (r10 >= r11) goto L_0x00aa
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0075
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0075
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0048
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0042
            long r7 = (long) r14
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0083
        L_0x0048:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeDecimalLong((long) r3)
            okio.Buffer r1 = r1.writeByte((int) r13)
            if (r6 != 0) goto L_0x005a
            r1.readByte()
        L_0x005a:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.readUtf8()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0075:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x008b
            if (r5 != 0) goto L_0x008b
            r6 = 1
            long r1 = r1 - r6
            r6 = r12
        L_0x0083:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x001e
        L_0x008b:
            if (r5 == 0) goto L_0x008f
            r7 = r12
            goto L_0x00ad
        L_0x008f:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = okio.Util.toHexString((byte) r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00aa:
            r15 = r7
            r16 = r8
        L_0x00ad:
            if (r10 != r11) goto L_0x00bd
            okio.Segment r8 = r16.pop()
            r0.head = r8
            okio.SegmentPool r8 = okio.SegmentPool.INSTANCE
            r9 = r16
            r8.recycle(r9)
            goto L_0x00c1
        L_0x00bd:
            r9 = r16
            r9.pos = r10
        L_0x00c1:
            if (r7 != 0) goto L_0x00c7
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0011
        L_0x00c7:
            long r1 = r17.size()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.setSize$okio(r1)
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            long r3 = -r3
        L_0x00d4:
            return r3
        L_0x00d5:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream) {
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public void readFully(@NotNull Buffer buffer, long j) {
        if (size() >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r8 != r9) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r14.head = r6.pop();
        okio.SegmentPool.INSTANCE.recycle(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        r6.pos = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r1 != false) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readHexadecimalUnsignedLong() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L_0x0014
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0014:
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L_0x001a:
            if (r8 >= r9) goto L_0x009c
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x002b
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x002b
            int r11 = r10 - r11
            goto L_0x0045
        L_0x002b:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x003a
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x003a
        L_0x0035:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0045
        L_0x003a:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007d
            goto L_0x0035
        L_0x0045:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0055
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001a
        L_0x0055:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong((long) r4)
            okio.Buffer r0 = r0.writeByte((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007d:
            if (r0 == 0) goto L_0x0081
            r1 = 1
            goto L_0x009c
        L_0x0081:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString((byte) r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009c:
            if (r8 != r9) goto L_0x00aa
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool r7 = okio.SegmentPool.INSTANCE
            r7.recycle(r6)
            goto L_0x00ac
        L_0x00aa:
            r6.pos = r8
        L_0x00ac:
            if (r1 != 0) goto L_0x00b2
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L_0x000d
        L_0x00b2:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        L_0x00bc:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    public int readInt() {
        if (size() >= 4) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            setSize$okio(size() - 4);
            if (i6 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public int readIntLe() {
        return Util.reverseBytes(readInt());
    }

    public long readLong() {
        if (size() >= 8) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            setSize$okio(size() - 8);
            if (i10 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public long readLongLe() {
        return Util.reverseBytes(readLong());
    }

    public short readShort() {
        if (size() >= 2) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            setSize$okio(size() - 2);
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public short readShortLe() {
        return Util.reverseBytes(readShort());
    }

    @NotNull
    public String readString(@NotNull Charset charset) {
        return readString(this.size, charset);
    }

    @NotNull
    @JvmOverloads
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, (UnsafeCursor) null, 1, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @NotNull
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    public int readUtf8CodePoint() {
        byte b;
        int i;
        byte b2;
        if (size() != 0) {
            byte b3 = getByte(0);
            int i2 = 1;
            if ((b3 & ByteCompanionObject.MIN_VALUE) == 0) {
                b2 = b3 & ByteCompanionObject.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((b3 & 224) == 192) {
                b2 = b3 & 31;
                i = 2;
                b = 128;
            } else if ((b3 & 240) == 224) {
                b2 = b3 & 15;
                i = 3;
                b = 2048;
            } else if ((b3 & 248) == 240) {
                b2 = b3 & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            long j = (long) i;
            if (size() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte b4 = getByte(j2);
                    if ((b4 & ExifInterface.MARKER_SOF0) == 128) {
                        b2 = (b2 << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
                        i2++;
                    } else {
                        skip(j2);
                        return Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + size() + " (to read code point prefixed 0x" + Util.toHexString(b3) + ')');
        }
        throw new EOFException();
    }

    @Nullable
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return BufferKt.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @NotNull
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) {
        return this.size >= j;
    }

    public void require(long j) {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    public int select(@NotNull Options options) {
        int selectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, (Object) null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip((long) options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName(name = "size")
    public final long size() {
        return this.size;
    }

    public void skip(long j) {
        while (j > 0) {
            Segment segment = this.head;
            if (segment != null) {
                int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
                long j2 = (long) min;
                setSize$okio(size() - j2);
                j -= j2;
                int i = segment.pos + min;
                segment.pos = i;
                if (i == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.INSTANCE.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.INSTANCE.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            Segment segment2 = segment.prev;
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            if (segment2.limit + i > 8192 || !segment2.owner) {
                return segment2.push(SegmentPool.INSTANCE.take());
            }
            return segment2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public long writeAll(@NotNull Source source) {
        long j = 0;
        while (true) {
            long read = source.read(this, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @NotNull
    @JvmOverloads
    public final Buffer writeTo(@NotNull OutputStream outputStream) {
        return writeTo$default(this, outputStream, 0, 2, (Object) null);
    }

    @NotNull
    @JvmOverloads
    public final Buffer writeTo(@NotNull OutputStream outputStream, long j) {
        Util.checkOffsetAndCount(this.size, 0, j);
        Segment segment = this.head;
        while (j > 0) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
            outputStream.write(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            long j2 = (long) min;
            this.size -= j2;
            j -= j2;
            if (i == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.INSTANCE.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public long indexOfElement(@NotNull ByteString byteString, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = 0;
        if (j >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j2 -= (long) (segment.limit - segment.pos);
                }
                if (segment == null) {
                    return -1;
                }
                if (byteString.size() == 2) {
                    byte b = byteString.getByte(0);
                    byte b2 = byteString.getByte(1);
                    while (j2 < size()) {
                        byte[] bArr = segment.data;
                        i2 = (int) ((((long) segment.pos) + j) - j2);
                        int i4 = segment.limit;
                        while (i2 < i4) {
                            byte b3 = bArr[i2];
                            if (!(b3 == b || b3 == b2)) {
                                i2++;
                            }
                        }
                        j2 += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.throwNpe();
                        }
                        j = j2;
                    }
                    return -1;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j2 < size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((((long) segment.pos) + j) - j2);
                    int i5 = segment.limit;
                    while (i < i5) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 == b5) {
                                i3 = segment.pos;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i++;
                    }
                    j2 += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (segment.limit - segment.pos)) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j3 = j4;
            }
            if (segment == null) {
                return -1;
            }
            if (byteString.size() == 2) {
                byte b6 = byteString.getByte(0);
                byte b7 = byteString.getByte(1);
                while (j2 < size()) {
                    byte[] bArr3 = segment.data;
                    int i6 = (int) ((((long) segment.pos) + j) - j2);
                    int i7 = segment.limit;
                    while (i2 < i7) {
                        byte b8 = bArr3[i2];
                        if (!(b8 == b6 || b8 == b7)) {
                            i6 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (segment.limit - segment.pos));
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < size()) {
                byte[] bArr4 = segment.data;
                int i8 = (int) ((((long) segment.pos) + j) - j2);
                int i9 = segment.limit;
                while (i < i9) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 == b10) {
                            i3 = segment.pos;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i8 = i + 1;
                }
                j3 = j2 + ((long) (segment.limit - segment.pos));
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j = j3;
            }
            return -1;
            i3 = segment.pos;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    public boolean rangeEquals(long j, @NotNull ByteString byteString, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || size() - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public byte[] readByteArray(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @NotNull
    public ByteString readByteString(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(readByteArray(j));
        } else {
            ByteString snapshot = snapshot((int) j);
            skip(j);
            return snapshot;
        }
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream, long j) {
        if (j >= 0) {
            readFrom(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @NotNull
    public String readString(long j, @NotNull Charset charset) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.size < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i2 = segment.pos;
            if (((long) i2) + j > ((long) segment.limit)) {
                return new String(readByteArray(j), charset);
            }
            int i3 = (int) j;
            String str = new String(segment.data, i2, i3, charset);
            int i4 = segment.pos + i3;
            segment.pos = i4;
            this.size -= j;
            if (i4 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            return str;
        }
    }

    @NotNull
    public String readUtf8(long j) {
        return readString(j, Charsets.UTF_8);
    }

    @NotNull
    public String readUtf8LineStrict(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this, indexOf);
            }
            if (j2 < size() && getByte(j2 - 1) == ((byte) 13) && getByte(j2) == b) {
                return BufferKt.readUtf8Line(this, j2);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0, Math.min((long) 32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @NotNull
    public Buffer writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2 A[LOOP:0: B:67:0x00ee->B:69:0x00f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0104  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.Buffer writeDecimalLong(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000e
            r13 = 48
            okio.Buffer r13 = r12.writeByte((int) r13)
            goto L_0x011a
        L_0x000e:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x0020
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001f
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r13 = r12.writeUtf8((java.lang.String) r13)
            goto L_0x011a
        L_0x001f:
            r3 = r4
        L_0x0020:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x006a
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004c
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0040
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003d
            goto L_0x00e1
        L_0x003d:
            r4 = 2
            goto L_0x00e1
        L_0x0040:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r2 = 3
            goto L_0x0049
        L_0x0048:
            r2 = 4
        L_0x0049:
            r4 = r2
            goto L_0x00e1
        L_0x004c:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005e
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            r2 = 5
            goto L_0x0049
        L_0x005c:
            r2 = 6
            goto L_0x0049
        L_0x005e:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0067
            r2 = 7
            goto L_0x0049
        L_0x0067:
            r2 = 8
            goto L_0x0049
        L_0x006a:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0097
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0088
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0086
            r4 = 9
            goto L_0x00e1
        L_0x0086:
            r4 = r5
            goto L_0x00e1
        L_0x0088:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r2 = 11
            goto L_0x0049
        L_0x0094:
            r2 = 12
            goto L_0x0049
        L_0x0097:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00bb
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ac
            r4 = 13
            goto L_0x00e1
        L_0x00ac:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r2 = 14
            goto L_0x0049
        L_0x00b8:
            r2 = 15
            goto L_0x0049
        L_0x00bb:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d3
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            r4 = 16
            goto L_0x00e1
        L_0x00d0:
            r4 = 17
            goto L_0x00e1
        L_0x00d3:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00df
            r4 = 18
            goto L_0x00e1
        L_0x00df:
            r4 = 19
        L_0x00e1:
            if (r3 == 0) goto L_0x00e5
            int r4 = r4 + 1
        L_0x00e5:
            okio.Segment r2 = r12.writableSegment$okio(r4)
            byte[] r6 = r2.data
            int r7 = r2.limit
            int r7 = r7 + r4
        L_0x00ee:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0102
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = okio.internal.BufferKt.getHEX_DIGIT_BYTES()
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00ee
        L_0x0102:
            if (r3 == 0) goto L_0x010b
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x010b:
            int r13 = r2.limit
            int r13 = r13 + r4
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            r13 = r12
        L_0x011a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.writeDecimalLong(long):okio.Buffer");
    }

    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + ((long) i));
        return this;
    }

    @NotNull
    public Buffer writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @NotNull
    public Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytes(i));
    }

    @NotNull
    public Buffer writeLong(long j) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        writableSegment$okio.limit = i8 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @NotNull
    public Buffer writeLongLe(long j) {
        return writeLong(Util.reverseBytes(j));
    }

    @NotNull
    public Buffer writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @NotNull
    public Buffer writeShortLe(int i) {
        return writeShort((int) Util.reverseBytes((short) i));
    }

    @NotNull
    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            setSize$okio(size() + 3);
        } else if (i <= 1114111) {
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit = i4 + 4;
            setSize$okio(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i));
        }
        return this;
    }

    public long indexOf(@NotNull ByteString byteString) {
        return indexOf(byteString, 0);
    }

    @NotNull
    public Buffer writeString(@NotNull String str, @NotNull Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @NotNull
    public Buffer writeUtf8(@NotNull String str) {
        return writeUtf8(str, 0, str.length());
    }

    private final void readFrom(InputStream inputStream, long j, boolean z) {
        while (true) {
            if (j > 0 || z) {
                Segment writableSegment$okio = writableSegment$okio(1);
                int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, (long) (8192 - writableSegment$okio.limit)));
                if (read == -1) {
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        this.head = writableSegment$okio.pop();
                        SegmentPool.INSTANCE.recycle(writableSegment$okio);
                    }
                    if (!z) {
                        throw new EOFException();
                    }
                    return;
                }
                writableSegment$okio.limit += read;
                long j2 = (long) read;
                this.size += j2;
                j -= j2;
            } else {
                return;
            }
        }
    }

    public long indexOf(byte b, long j, long j2) {
        Segment segment;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (segment = this.head) == null) {
                return -1;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j3 -= (long) (segment.limit - segment.pos);
                }
                if (segment == null) {
                    return -1;
                }
                while (j3 < j2) {
                    byte[] bArr = segment.data;
                    int min = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                    i = (int) ((((long) segment.pos) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.throwNpe();
                    }
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (segment.limit - segment.pos)) + j4;
                if (j5 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j4 = j5;
            }
            if (segment == null) {
                return -1;
            }
            while (j3 < j2) {
                byte[] bArr2 = segment.data;
                int min2 = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                int i2 = (int) ((((long) segment.pos) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (segment.limit - segment.pos));
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                j = j4;
            }
            return -1;
            return ((long) (i - segment.pos)) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @NotNull
    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0, (long) i);
        Segment segment = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (segment == null) {
                Intrinsics.throwNpe();
            }
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        Segment segment2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            if (segment2 == null) {
                Intrinsics.throwNpe();
            }
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public Buffer writeString(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (Intrinsics.areEqual((Object) charset, (Object) Charsets.UTF_8)) {
                    return writeUtf8(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    @NotNull
    public Buffer writeUtf8(@NotNull String str, int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            Segment writableSegment$okio = writableSegment$okio(1);
                            byte[] bArr = writableSegment$okio.data;
                            int i3 = writableSegment$okio.limit - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = writableSegment$okio.limit;
                            int i6 = (i3 + i4) - i5;
                            writableSegment$okio.limit = i5 + i6;
                            setSize$okio(size() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                Segment writableSegment$okio2 = writableSegment$okio(2);
                                byte[] bArr2 = writableSegment$okio2.data;
                                int i7 = writableSegment$okio2.limit;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                writableSegment$okio2.limit = i7 + 2;
                                setSize$okio(size() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                Segment writableSegment$okio3 = writableSegment$okio(3);
                                byte[] bArr3 = writableSegment$okio3.data;
                                int i8 = writableSegment$okio3.limit;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                writableSegment$okio3.limit = i8 + 3;
                                setSize$okio(size() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    writeByte(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    Segment writableSegment$okio4 = writableSegment$okio(4);
                                    byte[] bArr4 = writableSegment$okio4.data;
                                    int i11 = writableSegment$okio4.limit;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    writableSegment$okio4.limit = i11 + 4;
                                    setSize$okio(size() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public void readFully(@NotNull byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int write(@NotNull ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += (long) remaining;
        return remaining;
    }

    public int read(@NotNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j) {
        return copyTo(buffer, j, this.size - j);
    }

    public int read(@NotNull byte[] bArr, int i, int i2) {
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i3 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + min);
        segment.pos += min;
        setSize$okio(size() - ((long) min));
        if (segment.pos != segment.limit) {
            return min;
        }
        this.head = segment.pop();
        SegmentPool.INSTANCE.recycle(segment);
        return min;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j, long j2) {
        Util.checkOffsetAndCount(size(), j, j2);
        if (j2 != 0) {
            buffer.setSize$okio(buffer.size() + j2);
            Segment segment = this.head;
            while (true) {
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                segment = segment.next;
            }
            while (j2 > 0) {
                if (segment == null) {
                    Intrinsics.throwNpe();
                }
                Segment sharedCopy = segment.sharedCopy();
                int i3 = sharedCopy.pos + ((int) j);
                sharedCopy.pos = i3;
                sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    if (segment2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment3 = segment2.prev;
                    if (segment3 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment3.push(sharedCopy);
                }
                j2 -= (long) (sharedCopy.limit - sharedCopy.pos);
                segment = segment.next;
                j = 0;
            }
        }
        return this;
    }

    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i, int i2) {
        byteString.write$okio(this, i, i2);
        return this;
    }

    @NotNull
    public Buffer write(@NotNull byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    @NotNull
    public Buffer write(@NotNull byte[] bArr, int i, int i2) {
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            ArraysKt___ArraysJvmKt.copyInto(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        setSize$okio(size() + j);
        return this;
    }

    public long read(@NotNull Buffer buffer, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (size() == 0) {
            return -1;
        } else {
            if (j > size()) {
                j = size();
            }
            buffer.write(this, j);
            return j;
        }
    }

    @NotNull
    public Buffer write(@NotNull Source source, long j) {
        while (j > 0) {
            long read = source.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public long indexOf(@NotNull ByteString byteString, long j) {
        long j2 = j;
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                Segment segment = this.head;
                if (segment != null) {
                    if (size() - j2 < j2) {
                        long size2 = size();
                        while (size2 > j2) {
                            segment = segment.prev;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            size2 -= (long) (segment.limit - segment.pos);
                        }
                        if (segment != null) {
                            byte[] internalArray$okio = byteString.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size3 = byteString.size();
                            long size4 = (size() - ((long) size3)) + 1;
                            while (size2 < size4) {
                                byte[] bArr = segment.data;
                                long j4 = size2;
                                int min = (int) Math.min((long) segment.limit, (((long) segment.pos) + size4) - size2);
                                for (int i = (int) ((((long) segment.pos) + j2) - j4); i < min; i++) {
                                    if (bArr[i] == b && BufferKt.rangeEquals(segment, i + 1, internalArray$okio, 1, size3)) {
                                        return ((long) (i - segment.pos)) + j4;
                                    }
                                }
                                size2 = j4 + ((long) (segment.limit - segment.pos));
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j2 = size2;
                            }
                        }
                    } else {
                        while (true) {
                            long j5 = ((long) (segment.limit - segment.pos)) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.throwNpe();
                            }
                            j3 = j5;
                        }
                        if (segment != null) {
                            byte[] internalArray$okio2 = byteString.internalArray$okio();
                            byte b2 = internalArray$okio2[0];
                            int size5 = byteString.size();
                            long size6 = (size() - ((long) size5)) + 1;
                            while (j3 < size6) {
                                byte[] bArr2 = segment.data;
                                long j6 = size6;
                                int min2 = (int) Math.min((long) segment.limit, (((long) segment.pos) + size6) - j3);
                                for (int i2 = (int) ((((long) segment.pos) + j2) - j3); i2 < min2; i2++) {
                                    if (bArr2[i2] == b2) {
                                        if (BufferKt.rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size5)) {
                                            return ((long) (i2 - segment.pos)) + j3;
                                        }
                                    }
                                }
                                j3 += (long) (segment.limit - segment.pos);
                                segment = segment.next;
                                if (segment == null) {
                                    Intrinsics.throwNpe();
                                }
                                j2 = j3;
                                size6 = j6;
                            }
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public void write(@NotNull Buffer buffer, long j) {
        Segment segment;
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size(), 0, j);
            while (j > 0) {
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    Intrinsics.throwNpe();
                }
                int i = segment2.limit;
                Segment segment3 = buffer.head;
                if (segment3 == null) {
                    Intrinsics.throwNpe();
                }
                if (j < ((long) (i - segment3.pos))) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        if (segment4 == null) {
                            Intrinsics.throwNpe();
                        }
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j) - ((long) (segment.shared ? 0 : segment.pos)) <= ((long) 8192)) {
                            Segment segment5 = buffer.head;
                            if (segment5 == null) {
                                Intrinsics.throwNpe();
                            }
                            segment5.writeTo(segment, (int) j);
                            buffer.setSize$okio(buffer.size() - j);
                            setSize$okio(size() + j);
                            return;
                        }
                    }
                    Segment segment6 = buffer.head;
                    if (segment6 == null) {
                        Intrinsics.throwNpe();
                    }
                    buffer.head = segment6.split((int) j);
                }
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    Intrinsics.throwNpe();
                }
                long j2 = (long) (segment7.limit - segment7.pos);
                buffer.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    if (segment8 == null) {
                        Intrinsics.throwNpe();
                    }
                    Segment segment9 = segment8.prev;
                    if (segment9 == null) {
                        Intrinsics.throwNpe();
                    }
                    segment9.push(segment7).compact();
                }
                buffer.setSize$okio(buffer.size() - j2);
                setSize$okio(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
