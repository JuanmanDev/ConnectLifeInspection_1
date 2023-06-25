package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p699io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b*\u0001?\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0004mnopB9\b\u0000\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010f\u001a\u000207\u0012\u0006\u0010]\u001a\u00020\u0011\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J#\u0010\r\u001a\u00020\u00032\n\u0010\b\u001a\u00060\u0007R\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0005J'\u0010\u0013\u001a\b\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u001e\u0010\u0018\u001a\b\u0018\u00010\u0017R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u0005J\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010\u0005J\u0015\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\u001b\u0010.\u001a\u00020\t2\n\u0010+\u001a\u00060*R\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u000002¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0003¢\u0006\u0004\b5\u0010\u0005J\u0017\u00106\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b6\u0010%R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010B\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bB\u0010;\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010ER\u0019\u0010G\u001a\u00020F8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010L\u001a\u00020K8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010R\u001a\u00020F8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010HR\u0016\u0010S\u001a\u00020F8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010HR\u0016\u0010T\u001a\u00020F8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010HR\u0018\u0010U\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060*R\u00020\u00000W8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R*\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00118F@FX\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u00101\"\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010;R\u0016\u0010c\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010;R\u0016\u0010d\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0016\u0010e\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u00109R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010^R\u001c\u0010f\u001a\u0002078\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bf\u00109\u001a\u0004\bg\u0010h¨\u0006q"}, mo47991d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "checkNotClosed", "()V", "close", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "delete", "", "key", "", "expectedSequenceNumber", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "evictAll", "flush", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "()Z", "journalRebuildRequired", "Lokio/BufferedSink;", "newJournalWriter", "()Lokio/BufferedSink;", "processJournal", "readJournal", "line", "readJournalLine", "(Ljava/lang/String;)V", "rebuildJournal$okhttp", "rebuildJournal", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "removeOldestEntry", "size", "()J", "", "snapshots", "()Ljava/util/Iterator;", "trimToSize", "validateKey", "", "appVersion", "I", "civilizedFileSystem", "Z", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", "maxSize", "J", "getMaxSize", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {
    @JvmField
    public static final long ANY_SEQUENCE_NUMBER = -1;
    @NotNull
    @JvmField
    public static final String CLEAN = CLEAN;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final String DIRTY = DIRTY;
    @NotNull
    @JvmField
    public static final String JOURNAL_FILE = JOURNAL_FILE;
    @NotNull
    @JvmField
    public static final String JOURNAL_FILE_BACKUP = JOURNAL_FILE_BACKUP;
    @NotNull
    @JvmField
    public static final String JOURNAL_FILE_TEMP = JOURNAL_FILE_TEMP;
    @NotNull
    @JvmField
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    @NotNull
    @JvmField
    public static final String MAGIC = MAGIC;
    @NotNull
    @JvmField
    public static final String READ = READ;
    @NotNull
    @JvmField
    public static final String REMOVE = REMOVE;
    @NotNull
    @JvmField
    public static final String VERSION_1 = "1";
    public final int appVersion;
    public boolean civilizedFileSystem;
    public final TaskQueue cleanupQueue;
    public final DiskLruCache$cleanupTask$1 cleanupTask;
    public boolean closed;
    @NotNull
    public final File directory;
    @NotNull
    public final FileSystem fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public BufferedSink journalWriter;
    @NotNull
    public final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    public long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    public long nextSequenceNumber;
    public int redundantOpCount;
    public long size;
    public final int valueCount;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0007XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0014"}, mo47991d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0007\b\u0004\u0018\u0000B\u0015\b\u0000\u0012\n\u0010\u0014\u001a\u00060\u0012R\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u00060\u0012R\u00020\u00138\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo47991d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "abort", "()V", "commit", "detach$okhttp", "detach", "", "index", "Lokio/Sink;", "newSink", "(I)Lokio/Sink;", "Lokio/Source;", "newSource", "(I)Lokio/Source;", "", "done", "Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        public boolean done;
        @NotNull
        public final Entry entry;
        @Nullable
        public final boolean[] written;

        public Editor(@NotNull Entry entry2) {
            this.entry = entry2;
            this.written = entry2.getReadable$okhttp() ? null : new boolean[DiskLruCache.this.getValueCount$okhttp()];
        }

        public final void abort() {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        DiskLruCache.this.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        DiskLruCache.this.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (!Intrinsics.areEqual((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                return;
            }
            if (DiskLruCache.this.civilizedFileSystem) {
                DiskLruCache.this.completeEdit$okhttp(this, false);
            } else {
                this.entry.setZombie$okhttp(true);
            }
        }

        @NotNull
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        @Nullable
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:24|25|26|27) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r5 = okio.Okio.blackhole();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004f */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.Sink newSink(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x0061 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0055
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0061 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0061 }
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0061 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                okio.Sink r5 = okio.Okio.blackhole()     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)
                return r5
            L_0x001c:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0061 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0061 }
                if (r1 != 0) goto L_0x002d
                boolean[] r1 = r4.written     // Catch:{ all -> 0x0061 }
                if (r1 != 0) goto L_0x002b
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0061 }
            L_0x002b:
                r1[r5] = r2     // Catch:{ all -> 0x0061 }
            L_0x002d:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0061 }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0061 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0061 }
                okhttp3.internal.cache.DiskLruCache r2 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ FileNotFoundException -> 0x004f }
                okhttp3.internal.io.FileSystem r2 = r2.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x004f }
                okio.Sink r1 = r2.sink(r1)     // Catch:{ FileNotFoundException -> 0x004f }
                okhttp3.internal.cache.FaultHidingSink r2 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x0061 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0061 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0061 }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)
                return r2
            L_0x004f:
                okio.Sink r5 = okio.Okio.blackhole()     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)
                return r5
            L_0x0055:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0061 }
                r1.<init>(r5)     // Catch:{ all -> 0x0061 }
                throw r1     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):okio.Sink");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            return null;
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.Source newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x004f }
                r2 = 0
                if (r1 == 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x004f }
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x004f }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0041
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x004f }
                boolean r1 = r1.getZombie$okhttp()     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0029
                goto L_0x0041
            L_0x0029:
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch:{ FileNotFoundException -> 0x003f }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x003f }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x003f }
                okio.Source r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x003f }
            L_0x003f:
                monitor-exit(r0)
                return r2
            L_0x0041:
                monitor-exit(r0)
                return r2
            L_0x0043:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004f }
                r1.<init>(r5)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):okio.Source");
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0004\u0018\u0000B\u0011\b\u0000\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0014\u001a\b\u0018\u00010\u0010R\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\b\u0018\u00010 R\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010)\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010.\u001a\u00020-8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u0002088\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>¨\u0006K"}, mo47991d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "strings", "", "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lokio/Source;", "newSource", "(I)Lokio/Source;", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "writeLengths", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        @NotNull
        public final List<File> cleanFiles = new ArrayList();
        @Nullable
        public Editor currentEditor;
        @NotNull
        public final List<File> dirtyFiles = new ArrayList();
        @NotNull
        public final String key;
        @NotNull
        public final long[] lengths;
        public int lockingSourceCount;
        public boolean readable;
        public long sequenceNumber;
        public boolean zombie;

        public Entry(@NotNull String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(this.key);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = DiskLruCache.this.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(DiskLruCache.this.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(DiskLruCache.this.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final Source newSource(int i) {
            Source source = DiskLruCache.this.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (DiskLruCache.this.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new DiskLruCache$Entry$newSource$1(this, source, source);
        }

        @NotNull
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @Nullable
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        @NotNull
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @NotNull
        public final String getKey$okhttp() {
            return this.key;
        }

        @NotNull
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@NotNull List<String> list) {
            if (list.size() == DiskLruCache.this.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw null;
                }
            } else {
                invalidLengths(list);
                throw null;
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            } else if (!this.readable) {
                return null;
            } else {
                if (!DiskLruCache.this.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<Source> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = DiskLruCache.this.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (Source closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        DiskLruCache.this.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(@NotNull BufferedSink bufferedSink) {
            for (long writeDecimalLong : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo47991d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "close", "()V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "", "getLength", "(I)J", "Lokio/Source;", "getSource", "(I)Lokio/Source;", "", "key", "()Ljava/lang/String;", "Ljava/lang/String;", "", "lengths", "[J", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        public final String key;
        public final long[] lengths;
        public final long sequenceNumber;
        public final List<Source> sources;

        public Snapshot(@NotNull String str, long j, @NotNull List<? extends Source> list, @NotNull long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (Source closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        @Nullable
        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        @NotNull
        public final Source getSource(int i) {
            return this.sources.get(i);
        }

        @NotNull
        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(@NotNull FileSystem fileSystem2, @NotNull File file, int i, int i2, long j, @NotNull TaskRunner taskRunner) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        boolean z = false;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, Util.okHttpName + " Cache");
        if (j > 0) {
            if (this.valueCount > 0 ? true : z) {
                this.journalFile = new File(this.directory, JOURNAL_FILE);
                this.journalFileTmp = new File(this.directory, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(this.directory, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final BufferedSink newJournalWriter() {
        return Okio.buffer((Sink) new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.redundantOpCount = r7 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.exhausted() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer((okio.Source) r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.valueCount     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.readUtf8LineStrict()     // Catch:{ EOFException -> 0x0064 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.exhausted()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            okio.BufferedSink r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00b2 }
            r0 = 0
            kotlin.p639io.CloseableKt.closeFinally(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) {
        String str2;
        String str3 = str;
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            int i = indexOf$default + 1;
            int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
            if (indexOf$default2 == -1) {
                if (str3 != null) {
                    str2 = str3.substring(i);
                    Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
                    if (indexOf$default == REMOVE.length() && StringsKt__StringsJVMKt.startsWith$default(str3, REMOVE, false, 2, (Object) null)) {
                        this.lruEntries.remove(str2);
                        return;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str3 != null) {
                str2 = str3.substring(i, indexOf$default2);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf$default2 != -1 && indexOf$default == CLEAN.length() && StringsKt__StringsJVMKt.startsWith$default(str3, CLEAN, false, 2, (Object) null)) {
                int i2 = indexOf$default2 + 1;
                if (str3 != null) {
                    String substring = str3.substring(i2);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                    List split$default = StringsKt__StringsKt.split$default((CharSequence) substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp((Editor) null);
                    entry.setLengths$okhttp(split$default);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (indexOf$default2 == -1 && indexOf$default == DIRTY.length() && StringsKt__StringsJVMKt.startsWith$default(str3, DIRTY, false, 2, (Object) null)) {
                entry.setCurrentEditor$okhttp(new Editor(entry));
            } else if (indexOf$default2 != -1 || indexOf$default != READ.length() || !StringsKt__StringsJVMKt.startsWith$default(str3, READ, false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    private final boolean removeOldestEntry() {
        for (Entry next : this.lruEntries.values()) {
            if (!next.getZombie$okhttp()) {
                Intrinsics.checkExpressionValueIsNotNull(next, "toEvict");
                removeEntry$okhttp(next);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matches(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
        }
    }

    public synchronized void close() {
        Editor currentEditor$okhttp;
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                Intrinsics.checkExpressionValueIsNotNull(values, "lruEntries.values");
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    for (Entry entry : (Entry[]) array) {
                        if (!(entry.getCurrentEditor$okhttp() == null || (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) == null)) {
                            currentEditor$okhttp.detach$okhttp();
                        }
                    }
                    trimToSize();
                    BufferedSink bufferedSink = this.journalWriter;
                    if (bufferedSink == null) {
                        Intrinsics.throwNpe();
                    }
                    bufferedSink.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0134, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch:{ all -> 0x0141 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0141 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r9)     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x0135
            r1 = 0
            if (r10 == 0) goto L_0x005e
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x005e
            int r2 = r8.valueCount     // Catch:{ all -> 0x0141 }
            r3 = r1
        L_0x001b:
            if (r3 >= r2) goto L_0x005e
            boolean[] r4 = r9.getWritten$okhttp()     // Catch:{ all -> 0x0141 }
            if (r4 != 0) goto L_0x0026
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0141 }
        L_0x0026:
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0141 }
            if (r4 == 0) goto L_0x0044
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0141 }
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0141 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0141 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0141 }
            boolean r4 = r4.exists(r5)     // Catch:{ all -> 0x0141 }
            if (r4 != 0) goto L_0x0041
            r9.abort()     // Catch:{ all -> 0x0141 }
            monitor-exit(r8)
            return
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0044:
            r9.abort()     // Catch:{ all -> 0x0141 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r10.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0141 }
            r10.append(r3)     // Catch:{ all -> 0x0141 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0141 }
            r9.<init>(r10)     // Catch:{ all -> 0x0141 }
            throw r9     // Catch:{ all -> 0x0141 }
        L_0x005e:
            int r9 = r8.valueCount     // Catch:{ all -> 0x0141 }
        L_0x0060:
            if (r1 >= r9) goto L_0x00ac
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0141 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0141 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0141 }
            if (r10 == 0) goto L_0x00a4
            boolean r3 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0141 }
            if (r3 != 0) goto L_0x00a4
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0141 }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x0141 }
            if (r3 == 0) goto L_0x00a9
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x0141 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0141 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0141 }
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch:{ all -> 0x0141 }
            r4.rename(r2, r3)     // Catch:{ all -> 0x0141 }
            long[] r2 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0141 }
            r4 = r2[r1]     // Catch:{ all -> 0x0141 }
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch:{ all -> 0x0141 }
            long r2 = r2.size(r3)     // Catch:{ all -> 0x0141 }
            long[] r6 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0141 }
            r6[r1] = r2     // Catch:{ all -> 0x0141 }
            long r6 = r8.size     // Catch:{ all -> 0x0141 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch:{ all -> 0x0141 }
            goto L_0x00a9
        L_0x00a4:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch:{ all -> 0x0141 }
            r3.delete(r2)     // Catch:{ all -> 0x0141 }
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x00ac:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch:{ all -> 0x0141 }
            boolean r9 = r0.getZombie$okhttp()     // Catch:{ all -> 0x0141 }
            if (r9 == 0) goto L_0x00bb
            r8.removeEntry$okhttp(r0)     // Catch:{ all -> 0x0141 }
            monitor-exit(r8)
            return
        L_0x00bb:
            int r9 = r8.redundantOpCount     // Catch:{ all -> 0x0141 }
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch:{ all -> 0x0141 }
            okio.BufferedSink r9 = r8.journalWriter     // Catch:{ all -> 0x0141 }
            if (r9 != 0) goto L_0x00c8
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0141 }
        L_0x00c8:
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0141 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f2
            if (r10 == 0) goto L_0x00d5
            goto L_0x00f2
        L_0x00d5:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0141 }
            r10.remove(r1)     // Catch:{ all -> 0x0141 }
            java.lang.String r10 = REMOVE     // Catch:{ all -> 0x0141 }
            okio.BufferedSink r10 = r9.writeUtf8(r10)     // Catch:{ all -> 0x0141 }
            r10.writeByte(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r10 = r0.getKey$okhttp()     // Catch:{ all -> 0x0141 }
            r9.writeUtf8(r10)     // Catch:{ all -> 0x0141 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0141 }
            goto L_0x0117
        L_0x00f2:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x0141 }
            okio.BufferedSink r1 = r9.writeUtf8(r1)     // Catch:{ all -> 0x0141 }
            r1.writeByte(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0141 }
            r9.writeUtf8(r1)     // Catch:{ all -> 0x0141 }
            r0.writeLengths$okhttp(r9)     // Catch:{ all -> 0x0141 }
            r9.writeByte(r3)     // Catch:{ all -> 0x0141 }
            if (r10 == 0) goto L_0x0117
            long r1 = r8.nextSequenceNumber     // Catch:{ all -> 0x0141 }
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch:{ all -> 0x0141 }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x0141 }
        L_0x0117:
            r9.flush()     // Catch:{ all -> 0x0141 }
            long r9 = r8.size     // Catch:{ all -> 0x0141 }
            long r0 = r8.maxSize     // Catch:{ all -> 0x0141 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0128
            boolean r9 = r8.journalRebuildRequired()     // Catch:{ all -> 0x0141 }
            if (r9 == 0) goto L_0x0133
        L_0x0128:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch:{ all -> 0x0141 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch:{ all -> 0x0141 }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0141 }
        L_0x0133:
            monitor-exit(r8)
            return
        L_0x0135:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0141 }
            r10.<init>(r9)     // Catch:{ all -> 0x0141 }
            throw r10     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @Nullable
    @JvmOverloads
    public final Editor edit(@NotNull String str) {
        return edit$default(this, str, 0, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return null;
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.NotNull java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.initialize()     // Catch:{ all -> 0x008c }
            r9.checkNotClosed()     // Catch:{ all -> 0x008c }
            r9.validateKey(r10)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x008c }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x008c }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x008c }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0023
            long r3 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x008c }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0025
        L_0x0023:
            monitor-exit(r9)
            return r2
        L_0x0025:
            if (r0 == 0) goto L_0x002c
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x008c }
            goto L_0x002d
        L_0x002c:
            r11 = r2
        L_0x002d:
            if (r11 == 0) goto L_0x0031
            monitor-exit(r9)
            return r2
        L_0x0031:
            if (r0 == 0) goto L_0x003b
            int r11 = r0.getLockingSourceCount$okhttp()     // Catch:{ all -> 0x008c }
            if (r11 == 0) goto L_0x003b
            monitor-exit(r9)
            return r2
        L_0x003b:
            boolean r11 = r9.mostRecentTrimFailed     // Catch:{ all -> 0x008c }
            if (r11 != 0) goto L_0x007f
            boolean r11 = r9.mostRecentRebuildFailed     // Catch:{ all -> 0x008c }
            if (r11 == 0) goto L_0x0044
            goto L_0x007f
        L_0x0044:
            okio.BufferedSink r11 = r9.journalWriter     // Catch:{ all -> 0x008c }
            if (r11 != 0) goto L_0x004b
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x008c }
        L_0x004b:
            java.lang.String r12 = DIRTY     // Catch:{ all -> 0x008c }
            okio.BufferedSink r12 = r11.writeUtf8(r12)     // Catch:{ all -> 0x008c }
            r1 = 32
            okio.BufferedSink r12 = r12.writeByte(r1)     // Catch:{ all -> 0x008c }
            okio.BufferedSink r12 = r12.writeUtf8(r10)     // Catch:{ all -> 0x008c }
            r1 = 10
            r12.writeByte(r1)     // Catch:{ all -> 0x008c }
            r11.flush()     // Catch:{ all -> 0x008c }
            boolean r11 = r9.hasJournalErrors     // Catch:{ all -> 0x008c }
            if (r11 == 0) goto L_0x0069
            monitor-exit(r9)
            return r2
        L_0x0069:
            if (r0 != 0) goto L_0x0075
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x008c }
            r0.<init>(r10)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch:{ all -> 0x008c }
            r11.put(r10, r0)     // Catch:{ all -> 0x008c }
        L_0x0075:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x008c }
            r10.<init>(r0)     // Catch:{ all -> 0x008c }
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x008c }
            monitor-exit(r9)
            return r10
        L_0x007f:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch:{ all -> 0x008c }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.cleanupTask     // Catch:{ all -> 0x008c }
            r5 = 0
            r7 = 2
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x008c }
            monitor-exit(r9)
            return r2
        L_0x008c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final synchronized void evictAll() {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            for (Entry entry : (Entry[]) array) {
                Intrinsics.checkExpressionValueIsNotNull(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            if (bufferedSink == null) {
                Intrinsics.throwNpe();
            }
            bufferedSink.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        return r0;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.initialize()     // Catch:{ all -> 0x0059 }
            r7.checkNotClosed()     // Catch:{ all -> 0x0059 }
            r7.validateKey(r8)     // Catch:{ all -> 0x0059 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0059 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0059 }
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.String r2 = "lruEntries[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ all -> 0x0059 }
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            int r1 = r7.redundantOpCount     // Catch:{ all -> 0x0059 }
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch:{ all -> 0x0059 }
            okio.BufferedSink r1 = r7.journalWriter     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x002d
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0059 }
        L_0x002d:
            java.lang.String r2 = READ     // Catch:{ all -> 0x0059 }
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch:{ all -> 0x0059 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0059 }
            okio.BufferedSink r8 = r1.writeUtf8(r8)     // Catch:{ all -> 0x0059 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0059 }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x0053
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch:{ all -> 0x0059 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch:{ all -> 0x0059 }
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0059 }
        L_0x0053:
            monitor-exit(r7)
            return r0
        L_0x0055:
            monitor-exit(r7)
            return r1
        L_0x0057:
            monitor-exit(r7)
            return r1
        L_0x0059:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    @NotNull
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    @NotNull
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        if (Util.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.p639io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            okio.BufferedSink r0 = r7.journalWriter     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c5 }
        L_0x0008:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c5 }
            okio.Sink r0 = r0.sink(r1)     // Catch:{ all -> 0x00c5 }
            okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r0)     // Catch:{ all -> 0x00c5 }
            r1 = 0
            java.lang.String r2 = MAGIC     // Catch:{ all -> 0x00be }
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch:{ all -> 0x00be }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = VERSION_1     // Catch:{ all -> 0x00be }
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.appVersion     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.valueCount     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r7.lruEntries     // Catch:{ all -> 0x00be }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00be }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00be }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00be }
            r6 = 32
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = DIRTY     // Catch:{ all -> 0x00be }
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch:{ all -> 0x00be }
            r5.writeByte(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.writeUtf8(r4)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0072:
            java.lang.String r5 = CLEAN     // Catch:{ all -> 0x00be }
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch:{ all -> 0x00be }
            r5.writeByte(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r4.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.writeUtf8(r5)     // Catch:{ all -> 0x00be }
            r4.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0089:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00be }
            kotlin.p639io.CloseableKt.closeFinally(r0, r1)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a1
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.delete(r1)     // Catch:{ all -> 0x00c5 }
            okio.BufferedSink r0 = r7.newJournalWriter()     // Catch:{ all -> 0x00c5 }
            r7.journalWriter = r0     // Catch:{ all -> 0x00c5 }
            r0 = 0
            r7.hasJournalErrors = r0     // Catch:{ all -> 0x00c5 }
            r7.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r7)
            return
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            kotlin.p639io.CloseableKt.closeFinally(r0, r1)     // Catch:{ all -> 0x00c5 }
            throw r2     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x002e }
            r5.checkNotClosed()     // Catch:{ all -> 0x002e }
            r5.validateKey(r6)     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002e }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x002e }
            r0 = 0
            if (r6 == 0) goto L_0x002c
            java.lang.String r1 = "lruEntries[key] ?: return false"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)     // Catch:{ all -> 0x002e }
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x002a
            long r1 = r5.size     // Catch:{ all -> 0x002e }
            long r3 = r5.maxSize     // Catch:{ all -> 0x002e }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002a
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x002e }
        L_0x002a:
            monitor-exit(r5)
            return r6
        L_0x002c:
            monitor-exit(r5)
            return r0
        L_0x002e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(@NotNull Entry entry) {
        BufferedSink bufferedSink;
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey$okhttp());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey$okhttp());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    @NotNull
    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
