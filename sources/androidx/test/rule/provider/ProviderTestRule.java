package androidx.test.rule.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.test.mock.MockContentResolver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

@Beta
public class ProviderTestRule implements C9741c {
    public static final String TAG = "ProviderTestRule";
    public final DelegatingContext context;
    public final Set<DatabaseArgs> databaseArgsSet;
    public final Set<WeakReference<ContentProvider>> providersRef;
    public final ContentResolver resolver;

    public static class Builder {
        public static final String DEFAULT_PREFIX = "test.";
        public final Map<String, DatabaseArgs> databaseArgsMap = new HashMap();
        public String prefix = DEFAULT_PREFIX;
        public final Map<String, Class<? extends ContentProvider>> providerClasses = new HashMap();

        public <T extends ContentProvider> Builder(@NonNull Class<T> cls, @NonNull String str) {
            Checks.checkNotNull(cls);
            Checks.checkNotNull(str);
            this.providerClasses.put(str, cls);
        }

        private ContentProvider createProvider(String str, Class<? extends ContentProvider> cls, MockContentResolver mockContentResolver, Context context) {
            try {
                ContentProvider contentProvider = (ContentProvider) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                ProviderInfo providerInfo = new ProviderInfo();
                providerInfo.authority = str;
                contentProvider.attachInfo(context, providerInfo);
                mockContentResolver.addProvider(providerInfo.authority, contentProvider);
                return contentProvider;
            } catch (NoSuchMethodException e) {
                String valueOf = String.valueOf(cls.toString());
                if (valueOf.length() != 0) {
                    "NoSuchMethodException occurred when trying create new Instance for ".concat(valueOf);
                } else {
                    new String("NoSuchMethodException occurred when trying create new Instance for ");
                }
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                String valueOf2 = String.valueOf(cls.toString());
                if (valueOf2.length() != 0) {
                    "InvocationTargetException occurred when trying create new Instance for ".concat(valueOf2);
                } else {
                    new String("InvocationTargetException occurred when trying create new Instance for ");
                }
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                String valueOf3 = String.valueOf(cls.toString());
                if (valueOf3.length() != 0) {
                    "IllegalAccessException occurred when trying create new Instance for ".concat(valueOf3);
                } else {
                    new String("IllegalAccessException occurred when trying create new Instance for ");
                }
                throw new RuntimeException(e3);
            } catch (InstantiationException e4) {
                String valueOf4 = String.valueOf(cls.toString());
                if (valueOf4.length() != 0) {
                    "InstantiationException occurred when trying create new Instance for ".concat(valueOf4);
                } else {
                    new String("InstantiationException occurred when trying create new Instance for ");
                }
                throw new RuntimeException(e4);
            }
        }

        private DatabaseArgs getDatabaseArgs(String str) {
            if (this.databaseArgsMap.containsKey(str)) {
                return this.databaseArgsMap.get(str);
            }
            DatabaseArgs databaseArgs = new DatabaseArgs(str);
            this.databaseArgsMap.put(str, databaseArgs);
            return databaseArgs;
        }

        public <T extends ContentProvider> Builder addProvider(@NonNull Class<T> cls, @NonNull String str) {
            Checks.checkNotNull(cls);
            Checks.checkNotNull(str);
            Checks.checkState(this.providerClasses.size() > 0, "No existing provider yet while trying to add more");
            Checks.checkState(!this.providerClasses.containsKey(str), String.format("ContentProvider with authority %s already exists.", new Object[]{str}));
            this.providerClasses.put(str, cls);
            return this;
        }

        public ProviderTestRule build() {
            HashSet hashSet = new HashSet();
            MockContentResolver mockContentResolver = new MockContentResolver();
            DelegatingContext delegatingContext = new DelegatingContext(InstrumentationRegistry.getInstrumentation().getTargetContext(), this.prefix, mockContentResolver);
            for (Map.Entry next : this.providerClasses.entrySet()) {
                hashSet.add(new WeakReference(createProvider((String) next.getKey(), (Class) next.getValue(), mockContentResolver, delegatingContext)));
            }
            return new ProviderTestRule(hashSet, new HashSet(this.databaseArgsMap.values()), mockContentResolver, delegatingContext);
        }

        public Builder setDatabaseCommands(@NonNull String str, @NonNull String... strArr) {
            Checks.checkNotNull(str);
            Checks.checkNotNull(strArr);
            getDatabaseArgs(str).setDBCmds(strArr);
            return this;
        }

        public Builder setDatabaseCommandsFile(@NonNull String str, @NonNull File file) {
            Checks.checkNotNull(str);
            Checks.checkNotNull(file);
            getDatabaseArgs(str).setDBCmdFile(file);
            return this;
        }

        public Builder setDatabaseFile(@NonNull String str, @NonNull File file) {
            Checks.checkNotNull(str);
            Checks.checkNotNull(file);
            getDatabaseArgs(str).setDBDataFile(file);
            return this;
        }

        public Builder setPrefix(@NonNull String str) {
            Checks.checkArgument(!TextUtils.isEmpty(str), "The prefix cannot be null or empty");
            this.prefix = str;
            return this;
        }
    }

    public class ProviderStatement extends C9785g {
        public final C9785g base;

        public ProviderStatement(C9785g gVar) {
            this.base = gVar;
        }

        public void evaluate() {
            try {
                ProviderTestRule.this.setUpProviders();
                this.base.evaluate();
            } finally {
                ProviderTestRule.this.cleanUpProviders();
            }
        }
    }

    @VisibleForTesting
    public ProviderTestRule(Set<WeakReference<ContentProvider>> set, Set<DatabaseArgs> set2, ContentResolver contentResolver, DelegatingContext delegatingContext) {
        this.providersRef = set;
        this.databaseArgsSet = set2;
        this.resolver = contentResolver;
        this.context = delegatingContext;
    }

    /* access modifiers changed from: private */
    public void cleanUpProviders() {
        if (Build.VERSION.SDK_INT >= 11) {
            for (WeakReference<ContentProvider> weakReference : this.providersRef) {
                ContentProvider contentProvider = (ContentProvider) weakReference.get();
                if (contentProvider != null) {
                    contentProvider.shutdown();
                }
            }
        }
        for (DatabaseArgs dBName : this.databaseArgsSet) {
            String dBName2 = dBName.getDBName();
            if (dBName2 != null) {
                this.context.deleteDatabase(dBName2);
            }
        }
        afterProviderCleanedUp();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void collectDBCmdsFromFile(androidx.test.rule.provider.DatabaseArgs r8) {
        /*
            r7 = this;
            java.io.File r0 = r8.getDBCmdFile()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004a }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004a }
            r5.<init>(r0)     // Catch:{ IOException -> 0x004a }
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch:{ IOException -> 0x004a }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x004a }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004a }
        L_0x001f:
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            if (r2 == 0) goto L_0x002f
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            if (r4 != 0) goto L_0x001f
            r1.add(r2)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            goto L_0x001f
        L_0x002f:
            r3.close()
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r8.addDBCmds(r0)
            return
        L_0x0042:
            r8 = move-exception
            r2 = r3
            goto L_0x0057
        L_0x0045:
            r8 = move-exception
            r2 = r3
            goto L_0x004b
        L_0x0048:
            r8 = move-exception
            goto L_0x0057
        L_0x004a:
            r8 = move-exception
        L_0x004b:
            java.lang.String r1 = "Cannot open command file %s to read"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0048 }
            java.lang.String.format(r1, r3)     // Catch:{ all -> 0x0048 }
            throw r8     // Catch:{ all -> 0x0048 }
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()
        L_0x005c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.rule.provider.ProviderTestRule.collectDBCmdsFromFile(androidx.test.rule.provider.DatabaseArgs):void");
    }

    private void copyFile(File file, File file2) {
        File parentFile = file2.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            FileChannel channel = new FileInputStream(file).getChannel();
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel.transferTo(0, channel.size(), channel2);
                channel.close();
                channel2.close();
            } catch (IOException e) {
                String.format("error happened copying file from %s to %s", new Object[]{file, file2});
                throw e;
            } catch (Throwable th) {
                channel.close();
                channel2.close();
                throw th;
            }
        } else {
            throw new IOException(String.format("error happened creating parent dir for file %s", new Object[]{file2}));
        }
    }

    private void restoreDBDataFromFile(DatabaseArgs databaseArgs) {
        File dBDataFile = databaseArgs.getDBDataFile();
        Checks.checkState(dBDataFile.exists(), String.format("The database file %s doesn't exist!", new Object[]{dBDataFile}));
        String dBName = databaseArgs.getDBName();
        copyFile(dBDataFile, this.context.getDatabasePath(dBName));
        this.context.addDatabase(dBName);
    }

    private void setUpProvider(DatabaseArgs databaseArgs) {
        if (databaseArgs.hasDBDataFile()) {
            restoreDBDataFromFile(databaseArgs);
        }
        if (databaseArgs.hasDBCmdFile()) {
            collectDBCmdsFromFile(databaseArgs);
        }
        if (databaseArgs.hasDBCmds()) {
            runDatabaseCommands(databaseArgs.getDBName(), databaseArgs.getDBCmds());
        }
    }

    /* access modifiers changed from: private */
    public void setUpProviders() {
        beforeProviderSetup();
        for (DatabaseArgs upProvider : this.databaseArgsSet) {
            setUpProvider(upProvider);
        }
    }

    public void afterProviderCleanedUp() {
    }

    public C9785g apply(C9785g gVar, Description description) {
        return new ProviderStatement(gVar);
    }

    public void beforeProviderSetup() {
    }

    public ContentResolver getResolver() {
        return this.resolver;
    }

    public void revokePermission(@NonNull String str) {
        Checks.checkArgument(!TextUtils.isEmpty(str), "permission cannot be null or empty");
        this.context.addRevokedPermission(str);
    }

    public void runDatabaseCommands(@NonNull String str, @NonNull String... strArr) {
        Checks.checkNotNull(str);
        Checks.checkNotNull(strArr);
        if (strArr.length > 0) {
            SQLiteDatabase openOrCreateDatabase = this.context.openOrCreateDatabase(str, 0, (SQLiteDatabase.CursorFactory) null);
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        openOrCreateDatabase.execSQL(str2);
                    } catch (SQLiteException e) {
                        String.format("Error executing sql command %s, possibly wrong or duplicated commands (e.g. same table insertion command without checking current table existence).", new Object[]{str2});
                        throw e;
                    }
                }
            }
        }
    }
}
