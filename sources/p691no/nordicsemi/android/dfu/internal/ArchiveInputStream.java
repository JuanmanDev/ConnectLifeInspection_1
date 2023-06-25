package p691no.nordicsemi.android.dfu.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p691no.nordicsemi.android.dfu.internal.manifest.Manifest;
import p691no.nordicsemi.android.dfu.internal.manifest.ManifestFile;

/* renamed from: no.nordicsemi.android.dfu.internal.ArchiveInputStream */
public class ArchiveInputStream extends InputStream {
    public static final String APPLICATION_BIN = "application.bin";
    public static final String APPLICATION_HEX = "application.hex";
    public static final String APPLICATION_INIT = "application.dat";
    public static final String BOOTLOADER_BIN = "bootloader.bin";
    public static final String BOOTLOADER_HEX = "bootloader.hex";
    public static final String MANIFEST = "manifest.json";
    public static final String SOFTDEVICE_BIN = "softdevice.bin";
    public static final String SOFTDEVICE_HEX = "softdevice.hex";
    public static final String SYSTEM_INIT = "system.dat";
    public static final String TAG = "DfuArchiveInputStream";
    public byte[] applicationBytes;
    public byte[] applicationInitBytes;
    public int applicationSize;
    public byte[] bootloaderBytes;
    public int bootloaderSize;
    public int bytesRead;
    public int bytesReadFromCurrentSource;
    public int bytesReadFromMarkedSource;
    public final CRC32 crc32;
    public byte[] currentSource;
    public final Map<String, byte[]> entries;
    public Manifest manifest;
    public byte[] markedSource;
    public byte[] softDeviceAndBootloaderBytes;
    public byte[] softDeviceBytes;
    public int softDeviceSize;
    public byte[] systemInitBytes;
    public int type;
    public final ZipInputStream zipInputStream;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0292 A[SYNTHETIC, Splitter:B:100:0x0292] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0225 A[Catch:{ all -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0235 A[Catch:{ all -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025c A[Catch:{ all -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x026c A[Catch:{ all -> 0x029a }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:79:0x0217=Splitter:B:79:0x0217, B:12:0x003d=Splitter:B:12:0x003d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ArchiveInputStream(java.io.InputStream r5, int r6, int r7) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r5.available()
            r1 = 10485760(0xa00000, float:1.469368E-38)
            if (r0 > r1) goto L_0x02a7
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r5)
            r4.zipInputStream = r0
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32
            r5.<init>()
            r4.crc32 = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.entries = r5
            r5 = 0
            r4.bytesRead = r5
            r4.bytesReadFromCurrentSource = r5
            r4.parseZip(r6)     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            r0 = 1
            if (r6 == 0) goto L_0x01d3
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r6 = r6.getApplicationInfo()     // Catch:{ all -> 0x029a }
            java.lang.String r1 = " not found."
            if (r6 == 0) goto L_0x008c
            if (r7 == 0) goto L_0x003d
            r6 = r7 & 4
            if (r6 <= 0) goto L_0x008c
        L_0x003d:
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r6 = r6.getApplicationInfo()     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.applicationBytes = r2     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getDatFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.applicationInitBytes = r2     // Catch:{ all -> 0x029a }
            byte[] r2 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x006e
            byte[] r6 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.applicationSize = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            r6 = r0
            goto L_0x008d
        L_0x006e:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r7.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "Application file "
            r7.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            r7.append(r6)     // Catch:{ all -> 0x029a }
            r7.append(r1)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x029a }
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x008c:
            r6 = r5
        L_0x008d:
            no.nordicsemi.android.dfu.internal.manifest.Manifest r2 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r2 = r2.getBootloaderInfo()     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x00f6
            if (r7 == 0) goto L_0x009b
            r2 = r7 & 2
            if (r2 <= 0) goto L_0x00f6
        L_0x009b:
            byte[] r6 = r4.systemInitBytes     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x00ee
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r6 = r6.getBootloaderInfo()     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.bootloaderBytes = r2     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getDatFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.systemInitBytes = r2     // Catch:{ all -> 0x029a }
            byte[] r2 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x00d0
            byte[] r6 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.bootloaderSize = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            r6 = r0
            goto L_0x00f6
        L_0x00d0:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r7.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "Bootloader file "
            r7.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            r7.append(r6)     // Catch:{ all -> 0x029a }
            r7.append(r1)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x029a }
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x00ee:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "Manifest: softdevice and bootloader specified. Use softdevice_bootloader instead."
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x00f6:
            no.nordicsemi.android.dfu.internal.manifest.Manifest r2 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r2 = r2.getSoftdeviceInfo()     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0153
            if (r7 == 0) goto L_0x0104
            r2 = r7 & 1
            if (r2 <= 0) goto L_0x0153
        L_0x0104:
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.FileInfo r6 = r6.getSoftdeviceInfo()     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.softDeviceBytes = r2     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r6.getDatFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.systemInitBytes = r2     // Catch:{ all -> 0x029a }
            byte[] r2 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0135
            byte[] r6 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.softDeviceSize = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            r6 = r0
            goto L_0x0153
        L_0x0135:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r7.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "SoftDevice file "
            r7.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            r7.append(r6)     // Catch:{ all -> 0x029a }
            r7.append(r1)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x029a }
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x0153:
            no.nordicsemi.android.dfu.internal.manifest.Manifest r2 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.SoftDeviceBootloaderFileInfo r2 = r2.getSoftdeviceBootloaderInfo()     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x01c6
            if (r7 == 0) goto L_0x0165
            r2 = r7 & 1
            if (r2 <= 0) goto L_0x01c6
            r7 = r7 & 2
            if (r7 <= 0) goto L_0x01c6
        L_0x0165:
            byte[] r6 = r4.systemInitBytes     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x01be
            no.nordicsemi.android.dfu.internal.manifest.Manifest r6 = r4.manifest     // Catch:{ all -> 0x029a }
            no.nordicsemi.android.dfu.internal.manifest.SoftDeviceBootloaderFileInfo r6 = r6.getSoftdeviceBootloaderInfo()     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r7 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x029a }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x029a }
            r4.softDeviceAndBootloaderBytes = r7     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r7 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r6.getDatFileName()     // Catch:{ all -> 0x029a }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x029a }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x029a }
            r4.systemInitBytes = r7     // Catch:{ all -> 0x029a }
            byte[] r7 = r4.softDeviceAndBootloaderBytes     // Catch:{ all -> 0x029a }
            if (r7 == 0) goto L_0x01a0
            int r7 = r6.getSoftdeviceSize()     // Catch:{ all -> 0x029a }
            r4.softDeviceSize = r7     // Catch:{ all -> 0x029a }
            int r6 = r6.getBootloaderSize()     // Catch:{ all -> 0x029a }
            r4.bootloaderSize = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.softDeviceAndBootloaderBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            goto L_0x01c7
        L_0x01a0:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r7.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "File "
            r7.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r6.getBinFileName()     // Catch:{ all -> 0x029a }
            r7.append(r6)     // Catch:{ all -> 0x029a }
            r7.append(r1)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x029a }
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x01be:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "Manifest: The softdevice_bootloader may not be used together with softdevice or bootloader."
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x01c6:
            r0 = r6
        L_0x01c7:
            if (r0 == 0) goto L_0x01cb
            goto L_0x0283
        L_0x01cb:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "Manifest file must specify at least one file."
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x01d3:
            if (r7 == 0) goto L_0x01d9
            r6 = r7 & 4
            if (r6 <= 0) goto L_0x020e
        L_0x01d9:
            java.util.Map<java.lang.String, byte[]> r6 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "application.hex"
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x029a }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x029a }
            r4.applicationBytes = r6     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x01f3
            java.util.Map<java.lang.String, byte[]> r6 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "application.bin"
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x029a }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x029a }
            r4.applicationBytes = r6     // Catch:{ all -> 0x029a }
        L_0x01f3:
            byte[] r6 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            if (r6 == 0) goto L_0x020e
            byte[] r6 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.applicationSize = r6     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r6 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "application.dat"
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x029a }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x029a }
            r4.applicationInitBytes = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.applicationBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            r6 = r0
            goto L_0x020f
        L_0x020e:
            r6 = r5
        L_0x020f:
            java.lang.String r1 = "system.dat"
            if (r7 == 0) goto L_0x0217
            r2 = r7 & 2
            if (r2 <= 0) goto L_0x0249
        L_0x0217:
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "bootloader.hex"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.bootloaderBytes = r2     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0231
            java.util.Map<java.lang.String, byte[]> r2 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "bootloader.bin"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x029a }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x029a }
            r4.bootloaderBytes = r2     // Catch:{ all -> 0x029a }
        L_0x0231:
            byte[] r2 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0249
            byte[] r6 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.bootloaderSize = r6     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r6 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x029a }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x029a }
            r4.systemInitBytes = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.bootloaderBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            r6 = r0
        L_0x0249:
            if (r7 == 0) goto L_0x024e
            r7 = r7 & r0
            if (r7 <= 0) goto L_0x0280
        L_0x024e:
            java.util.Map<java.lang.String, byte[]> r7 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "softdevice.hex"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x029a }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x029a }
            r4.softDeviceBytes = r7     // Catch:{ all -> 0x029a }
            if (r7 != 0) goto L_0x0268
            java.util.Map<java.lang.String, byte[]> r7 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "softdevice.bin"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x029a }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x029a }
            r4.softDeviceBytes = r7     // Catch:{ all -> 0x029a }
        L_0x0268:
            byte[] r7 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            if (r7 == 0) goto L_0x0280
            byte[] r6 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            int r6 = r6.length     // Catch:{ all -> 0x029a }
            r4.softDeviceSize = r6     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.String, byte[]> r6 = r4.entries     // Catch:{ all -> 0x029a }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x029a }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x029a }
            r4.systemInitBytes = r6     // Catch:{ all -> 0x029a }
            byte[] r6 = r4.softDeviceBytes     // Catch:{ all -> 0x029a }
            r4.currentSource = r6     // Catch:{ all -> 0x029a }
            goto L_0x0281
        L_0x0280:
            r0 = r6
        L_0x0281:
            if (r0 == 0) goto L_0x0292
        L_0x0283:
            r4.mark(r5)     // Catch:{ all -> 0x029a }
            int r5 = r4.getContentType()
            r4.type = r5
            java.util.zip.ZipInputStream r5 = r4.zipInputStream
            r5.close()
            return
        L_0x0292:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "The ZIP file must contain an Application, a Soft Device and/or a Bootloader."
            r5.<init>(r6)     // Catch:{ all -> 0x029a }
            throw r5     // Catch:{ all -> 0x029a }
        L_0x029a:
            r5 = move-exception
            int r6 = r4.getContentType()
            r4.type = r6
            java.util.zip.ZipInputStream r6 = r4.zipInputStream
            r6.close()
            throw r5
        L_0x02a7:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "File too large: "
            r7.append(r0)
            int r5 = r5.available()
            r7.append(r5)
            java.lang.String r5 = " bytes (max 10 MB)"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.internal.ArchiveInputStream.<init>(java.io.InputStream, int, int):void");
    }

    private void parseZip(int i) {
        byte[] bArr = new byte[1024];
        String str = null;
        while (true) {
            ZipEntry nextEntry = this.zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String validateFilename = validateFilename(nextEntry.getName(), MAPCookie.DOT);
            if (nextEntry.isDirectory()) {
                "A directory found in the ZIP: " + validateFilename + "!";
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = this.zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (validateFilename.toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(byteArray, i);
                    byteArray = new byte[hexInputStream.available()];
                    hexInputStream.read(byteArray);
                    hexInputStream.close();
                }
                if (!MANIFEST.equals(validateFilename)) {
                    this.entries.put(validateFilename, byteArray);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    str = new String(byteArray, StandardCharsets.UTF_8);
                } else {
                    str = new String(byteArray, "UTF-8");
                }
            }
        }
        if (this.entries.isEmpty()) {
            throw new FileNotFoundException("No files found in the ZIP. Check if the URI provided is valid and the ZIP contains required files on root level, not in a directory.");
        } else if (str != null) {
            this.manifest = ((ManifestFile) new Gson().fromJson(str, ManifestFile.class)).getManifest();
        }
    }

    private int rawRead(@NonNull byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.currentSource.length - this.bytesReadFromCurrentSource);
        System.arraycopy(this.currentSource, this.bytesReadFromCurrentSource, bArr, i, min);
        this.bytesReadFromCurrentSource += min;
        this.bytesRead += min;
        this.crc32.update(bArr, i, min);
        return min;
    }

    private byte[] startNextFile() {
        byte[] bArr;
        if (this.currentSource != this.softDeviceBytes || (bArr = this.bootloaderBytes) == null || (this.type & 2) <= 0) {
            byte[] bArr2 = this.currentSource;
            byte[] bArr3 = this.applicationBytes;
            if (bArr2 == bArr3 || bArr3 == null || (this.type & 4) <= 0) {
                bArr = null;
                this.currentSource = null;
            } else {
                this.currentSource = bArr3;
                bArr = bArr3;
            }
        } else {
            this.currentSource = bArr;
        }
        this.bytesReadFromCurrentSource = 0;
        return bArr;
    }

    private String validateFilename(@NonNull String str, @NonNull String str2) {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath.substring(1);
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }

    public int applicationImageSize() {
        if ((this.type & 4) > 0) {
            return this.applicationSize;
        }
        return 0;
    }

    public int available() {
        int softDeviceImageSize;
        int i;
        byte[] bArr = this.softDeviceAndBootloaderBytes;
        if (bArr == null || this.softDeviceSize != 0 || this.bootloaderSize != 0 || (this.type & 3) <= 0) {
            softDeviceImageSize = softDeviceImageSize() + bootloaderImageSize() + applicationImageSize();
            i = this.bytesRead;
        } else {
            softDeviceImageSize = bArr.length + applicationImageSize();
            i = this.bytesRead;
        }
        return softDeviceImageSize - i;
    }

    public int bootloaderImageSize() {
        if ((this.type & 2) > 0) {
            return this.bootloaderSize;
        }
        return 0;
    }

    public void close() {
        this.softDeviceBytes = null;
        this.bootloaderBytes = null;
        this.applicationBytes = null;
        this.softDeviceAndBootloaderBytes = null;
        this.applicationSize = 0;
        this.bootloaderSize = 0;
        this.softDeviceSize = 0;
        this.currentSource = null;
        this.bytesReadFromCurrentSource = 0;
        this.bytesRead = 0;
        this.zipInputStream.close();
    }

    public void fullReset() {
        byte[] bArr;
        byte[] bArr2 = this.softDeviceBytes;
        if (!(bArr2 == null || (bArr = this.bootloaderBytes) == null || this.currentSource != bArr)) {
            this.currentSource = bArr2;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
    }

    public byte[] getApplicationInit() {
        return this.applicationInitBytes;
    }

    public int getBytesRead() {
        return this.bytesRead;
    }

    public int getContentType() {
        this.type = 0;
        if (this.softDeviceAndBootloaderBytes != null) {
            this.type = 0 | 3;
        }
        if (this.softDeviceSize > 0) {
            this.type |= 1;
        }
        if (this.bootloaderSize > 0) {
            this.type |= 2;
        }
        if (this.applicationSize > 0) {
            this.type |= 4;
        }
        return this.type;
    }

    public long getCrc32() {
        return this.crc32.getValue();
    }

    public byte[] getSystemInit() {
        return this.systemInitBytes;
    }

    public boolean isSecureDfuRequired() {
        Manifest manifest2 = this.manifest;
        return manifest2 != null && manifest2.isSecureDfuRequired();
    }

    public void mark(int i) {
        this.markedSource = this.currentSource;
        this.bytesReadFromMarkedSource = this.bytesReadFromCurrentSource;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public void reset() {
        byte[] bArr;
        this.currentSource = this.markedSource;
        int i = this.bytesReadFromMarkedSource;
        this.bytesReadFromCurrentSource = i;
        this.bytesRead = i;
        this.crc32.reset();
        if (this.currentSource == this.bootloaderBytes && (bArr = this.softDeviceBytes) != null) {
            this.crc32.update(bArr);
            this.bytesRead += this.softDeviceSize;
        }
        this.crc32.update(this.currentSource, 0, this.bytesReadFromCurrentSource);
    }

    public int setContentType(int i) {
        byte[] bArr;
        this.type = i;
        int i2 = i & 4;
        if (i2 > 0 && this.applicationBytes == null) {
            this.type = i & -5;
        }
        int i3 = i & 3;
        if (i3 == 3) {
            if (this.softDeviceBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
            if (this.bootloaderBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
        } else if (this.softDeviceAndBootloaderBytes != null) {
            this.type &= -4;
        }
        if (i3 > 0 && (bArr = this.softDeviceAndBootloaderBytes) != null) {
            this.currentSource = bArr;
        } else if ((i & 1) > 0) {
            this.currentSource = this.softDeviceBytes;
        } else if ((i & 2) > 0) {
            this.currentSource = this.bootloaderBytes;
        } else if (i2 > 0) {
            this.currentSource = this.applicationBytes;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
        return this.type;
    }

    public long skip(long j) {
        return 0;
    }

    public int softDeviceImageSize() {
        if ((this.type & 1) > 0) {
            return this.softDeviceSize;
        }
        return 0;
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int rawRead = rawRead(bArr, i, i2);
        return (i2 <= rawRead || startNextFile() == null) ? rawRead : rawRead + rawRead(bArr, i + rawRead, i2 - rawRead);
    }
}
