package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.os.Environment;
import androidx.core.provider.DocumentsContractCompat;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.ArgsHelper;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FilesDumperPlugin implements DumperPlugin {
    public static final String NAME = "files";
    public final Context mContext;

    public FilesDumperPlugin(Context context) {
        this.mContext = context;
    }

    private void addFiles(ZipOutputStream zipOutputStream, byte[] bArr, File[] fileArr) {
        for (File file : fileArr) {
            if (file.isDirectory()) {
                addFiles(zipOutputStream, bArr, file.listFiles());
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(relativizePath(getBaseDir(this.mContext).getParentFile(), file)));
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    copy(fileInputStream, zipOutputStream, bArr);
                } finally {
                    fileInputStream.close();
                }
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private void doDownload(PrintStream printStream, Iterator<String> it) {
        OutputStream fileOutputStream;
        ZipOutputStream zipOutputStream;
        String nextArg = ArgsHelper.nextArg(it, "Must specify output file or '-'");
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(resolvePossibleAppStoragePath(this.mContext, it.next()));
        }
        try {
            fileOutputStream = AccountManagerConstants$LOCALE.LOCALE_SEPERATOR.equals(nextArg) ? printStream : new FileOutputStream(resolvePossibleSdcardPath(nextArg));
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
            byte[] bArr = new byte[2048];
            if (arrayList.size() > 0) {
                addFiles(zipOutputStream, bArr, (File[]) arrayList.toArray(new File[arrayList.size()]));
            } else {
                addFiles(zipOutputStream, bArr, getBaseDir(this.mContext).listFiles());
            }
            zipOutputStream.close();
        } catch (IOException e) {
            Util.close(fileOutputStream, false);
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            try {
                zipOutputStream.close();
            } catch (IOException unused) {
                Util.close(fileOutputStream, true);
            }
            throw th;
        }
    }

    private void doLs(PrintStream printStream) {
        File baseDir = getBaseDir(this.mContext);
        if (baseDir.isDirectory()) {
            printDirectoryText(baseDir, "", printStream);
        }
    }

    private void doTree(PrintStream printStream) {
        printDirectoryVisual(getBaseDir(this.mContext), 0, printStream);
    }

    private void doUsage(PrintStream printStream) {
        printStream.println("Usage: dumpapp files " + "<command> [command-options]");
        printStream.println("       dumpapp files " + "ls");
        printStream.println("       dumpapp files " + DocumentsContractCompat.PATH_TREE);
        printStream.println("       dumpapp files " + "download <output.zip> [<path>...]");
        printStream.println();
        printStream.println("dumpapp files ls: List files similar to the ls command");
        printStream.println();
        printStream.println("dumpapp files tree: List files similar to the tree command");
        printStream.println();
        printStream.println("dumpapp files download: Fetch internal application storage");
        printStream.println("    <output.zip>: Output location or '-' for stdout");
        printStream.println("    <path>: Fetch only those paths named (directories fetch recursively)");
    }

    public static File getBaseDir(Context context) {
        return context.getFilesDir().getParentFile();
    }

    public static void printDirectoryText(File file, String str, PrintStream printStream) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                printDirectoryText(file2, str + file2.getName() + "/", printStream);
            } else {
                printStream.println(str + file2.getName());
            }
        }
    }

    public static void printDirectoryVisual(File file, int i, PrintStream printStream) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            printHeaderVisual(i, printStream);
            printStream.print("+---");
            printStream.print(file2.getName());
            printStream.println();
            if (file2.isDirectory()) {
                printDirectoryVisual(file2, i + 1, printStream);
            }
        }
    }

    public static void printHeaderVisual(int i, PrintStream printStream) {
        for (int i2 = 0; i2 < i; i2++) {
            printStream.print("|   ");
        }
    }

    public static String relativizePath(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        return absolutePath2.startsWith(absolutePath) ? absolutePath2.substring(absolutePath.length() + 1) : absolutePath2;
    }

    public static File resolvePossibleAppStoragePath(Context context, String str) {
        if (str.startsWith("/")) {
            return new File(str);
        }
        return new File(getBaseDir(context), str);
    }

    public static File resolvePossibleSdcardPath(String str) {
        if (str.startsWith("/")) {
            return new File(str);
        }
        return new File(Environment.getExternalStorageDirectory(), str);
    }

    public void dump(DumperContext dumperContext) {
        Iterator<String> it = dumperContext.getArgsAsList().iterator();
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, "");
        if ("ls".equals(nextOptionalArg)) {
            doLs(dumperContext.getStdout());
        } else if (DocumentsContractCompat.PATH_TREE.equals(nextOptionalArg)) {
            doTree(dumperContext.getStdout());
        } else if ("download".equals(nextOptionalArg)) {
            doDownload(dumperContext.getStdout(), it);
        } else {
            doUsage(dumperContext.getStdout());
            if (!"".equals(nextOptionalArg)) {
                throw new DumpUsageException("Unknown command: " + nextOptionalArg);
            }
        }
    }

    public String getName() {
        return NAME;
    }
}
