package androidx.test.rule.logging;

import android.app.Instrumentation;
import android.app.UiAutomation;
import android.os.ParcelFileDescriptor;
import androidx.test.annotation.Beta;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Beta
public class AtraceLogger {
    public static final String ATRACEHELPER_TAG = "AtraceLogger";
    public static final String ATRACE_DUMP = "atrace --async_dump -b %d -z %s";
    public static final String ATRACE_START = "atrace --async_start -b %d -c %s";
    public static final String ATRACE_STOP = "atrace --async_stop -b %d -z %s";
    public static final int BUFFER_SIZE = 8192;
    public static final String CATEGORY_SEPARATOR = " ";
    public static volatile AtraceLogger loggerInstance;
    public List<ByteArrayOutputStream> atraceDataList;
    public boolean atraceRunning = false;
    public File destAtraceDirectory;
    public IOException dumpIOException;
    public Thread dumpThread;
    public String traceFileName;
    public UiAutomation uiAutomation;

    public class DumpTraceRunnable implements Runnable {
        public int bufferSize;
        public int dumpIntervalInSecs;
        public String traceCategories;

        public DumpTraceRunnable(String str, int i, int i2) {
            this.traceCategories = str;
            this.bufferSize = i;
            this.dumpIntervalInSecs = i2;
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    try {
                        Thread.sleep((long) (this.dumpIntervalInSecs * 1000));
                        String format = String.format(AtraceLogger.ATRACE_DUMP, new Object[]{Integer.valueOf(this.bufferSize), this.traceCategories});
                        long currentTimeMillis = System.currentTimeMillis();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        AtraceLogger.this.writeDataToByteStream(AtraceLogger.this.uiAutomation.executeShellCommand(format), byteArrayOutputStream);
                        AtraceLogger.this.atraceDataList.add(byteArrayOutputStream);
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Time taken by - DumpTraceRunnable ");
                        sb.append(currentTimeMillis2);
                        sb.toString();
                    } catch (InterruptedException unused) {
                    }
                } catch (IOException e) {
                    IOException unused2 = AtraceLogger.this.dumpIOException = e;
                    return;
                }
            }
            String format2 = String.format(AtraceLogger.ATRACE_STOP, new Object[]{Integer.valueOf(this.bufferSize), this.traceCategories});
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AtraceLogger.this.writeDataToByteStream(AtraceLogger.this.uiAutomation.executeShellCommand(format2), byteArrayOutputStream2);
            AtraceLogger.this.atraceDataList.add(byteArrayOutputStream2);
        }
    }

    public AtraceLogger(Instrumentation instrumentation) {
        this.uiAutomation = instrumentation.getUiAutomation();
    }

    /* JADX INFO: finally extract failed */
    private void atraceWrite() {
        File file;
        int i = 0;
        for (ByteArrayOutputStream next : this.atraceDataList) {
            if (this.traceFileName != null) {
                file = new File(this.destAtraceDirectory, String.format("%s-atrace-%d.txt", new Object[]{this.traceFileName, Integer.valueOf(i)}));
            } else {
                file = new File(this.destAtraceDirectory, String.format("atrace-%d.txt", new Object[]{Integer.valueOf(i)}));
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(next.toByteArray());
                fileOutputStream.close();
                i++;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        }
    }

    public static AtraceLogger getAtraceLoggerInstance(Instrumentation instrumentation) {
        if (loggerInstance == null) {
            synchronized (AtraceLogger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new AtraceLogger(instrumentation);
                }
            }
        }
        return loggerInstance;
    }

    /* access modifiers changed from: private */
    public void writeDataToByteStream(ParcelFileDescriptor parcelFileDescriptor, ByteArrayOutputStream byteArrayOutputStream) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = autoCloseInputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            autoCloseInputStream.close();
        }
    }

    /* JADX INFO: finally extract failed */
    public void atraceStart(Set<String> set, int i, int i2, File file, String str) {
        if (this.atraceRunning) {
            throw new IllegalStateException("Attempted multiple atrace start");
        } else if (set.isEmpty()) {
            throw new IllegalArgumentException("Empty categories. Should contain atleast one category");
        } else if (file == null) {
            throw new IllegalArgumentException("Destination directory cannot be null");
        } else if (file.exists() || file.mkdirs()) {
            this.destAtraceDirectory = file;
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : set) {
                stringBuffer.append(append);
                stringBuffer.append(" ");
            }
            if (str != null && !str.isEmpty()) {
                this.traceFileName = str;
            }
            String format = String.format(ATRACE_START, new Object[]{Integer.valueOf(i), stringBuffer.toString()});
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                writeDataToByteStream(this.uiAutomation.executeShellCommand(format), byteArrayOutputStream);
                byteArrayOutputStream.close();
                this.atraceRunning = true;
                this.dumpIOException = null;
                this.atraceDataList = new ArrayList();
                Thread thread = new Thread(new DumpTraceRunnable(stringBuffer.toString(), i, i2));
                this.dumpThread = thread;
                thread.start();
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Unable to create the destination directory");
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void atraceStop() {
        /*
            r5 = this;
            boolean r0 = r5.atraceRunning
            if (r0 == 0) goto L_0x0051
            r0 = 0
            r1 = 0
            java.lang.Thread r2 = r5.dumpThread     // Catch:{ all -> 0x0035 }
            r2.interrupt()     // Catch:{ all -> 0x0035 }
            java.lang.Thread r2 = r5.dumpThread     // Catch:{ all -> 0x0035 }
            r2.join()     // Catch:{ all -> 0x0035 }
            java.io.IOException r2 = r5.dumpIOException     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0032
            r5.atraceWrite()     // Catch:{ all -> 0x0035 }
            java.util.List<java.io.ByteArrayOutputStream> r2 = r5.atraceDataList
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r2.next()
            java.io.ByteArrayOutputStream r3 = (java.io.ByteArrayOutputStream) r3
            r3.close()
            goto L_0x001d
        L_0x002d:
            r5.atraceRunning = r1
            r5.traceFileName = r0
            return
        L_0x0032:
            java.io.IOException r2 = r5.dumpIOException     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            java.util.List<java.io.ByteArrayOutputStream> r3 = r5.atraceDataList
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r3.next()
            java.io.ByteArrayOutputStream r4 = (java.io.ByteArrayOutputStream) r4
            r4.close()
            goto L_0x003c
        L_0x004c:
            r5.atraceRunning = r1
            r5.traceFileName = r0
            throw r2
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ATrace is not running currently. Start atrace beforestopping."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.rule.logging.AtraceLogger.atraceStop():void");
    }
}
