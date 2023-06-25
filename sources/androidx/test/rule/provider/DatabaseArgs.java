package androidx.test.rule.provider;

import java.io.File;

public final class DatabaseArgs {
    public static final String TAG = "DatabaseArgs";
    public File dBCmdFile;
    public String[] dBCmds;
    public File dBDataFile;
    public String dBName;

    public DatabaseArgs(String str) {
        this.dBName = str;
    }

    public void addDBCmds(String... strArr) {
        String[] strArr2 = this.dBCmds;
        if (strArr2 == null) {
            this.dBCmds = strArr;
            return;
        }
        String[] strArr3 = new String[(strArr2.length + strArr.length)];
        System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
        System.arraycopy(strArr, 0, strArr3, this.dBCmds.length, strArr.length);
        this.dBCmds = strArr3;
    }

    public File getDBCmdFile() {
        return this.dBCmdFile;
    }

    public String[] getDBCmds() {
        return this.dBCmds;
    }

    public File getDBDataFile() {
        return this.dBDataFile;
    }

    public String getDBName() {
        return this.dBName;
    }

    public boolean hasDBCmdFile() {
        return this.dBCmdFile != null;
    }

    public boolean hasDBCmds() {
        return this.dBCmds != null;
    }

    public boolean hasDBDataFile() {
        return this.dBDataFile != null;
    }

    public void setDBCmdFile(File file) {
        if (this.dBCmdFile != null) {
            String.format("Command file for database %s already set", new Object[]{this.dBName});
        }
        this.dBCmdFile = file;
    }

    public void setDBCmds(String... strArr) {
        if (this.dBCmds != null) {
            String.format("Commands for database %s already set", new Object[]{this.dBName});
        }
        this.dBCmds = strArr;
    }

    public void setDBDataFile(File file) {
        if (this.dBDataFile != null) {
            String.format("Data file to restore for database %s already set", new Object[]{this.dBName});
        }
        this.dBDataFile = file;
    }
}
