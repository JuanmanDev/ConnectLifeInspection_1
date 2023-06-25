package net.sqlcipher.database;

public class DatabaseObjectNotClosedException extends RuntimeException {

    /* renamed from: s */
    public static final String f19110s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(f19110s);
    }
}
