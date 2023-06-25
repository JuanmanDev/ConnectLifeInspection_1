package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import p648m.p649a.p650a.p651a.C9602a;

public class DumperContext {
    public final List<String> mArgs;
    public final C9602a mParser;
    public final PrintStream mStderr;
    public final InputStream mStdin;
    public final PrintStream mStdout;

    public DumperContext(DumperContext dumperContext, List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }

    public List<String> getArgsAsList() {
        return this.mArgs;
    }

    public C9602a getParser() {
        return this.mParser;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public DumperContext(InputStream inputStream, PrintStream printStream, PrintStream printStream2, C9602a aVar, List<String> list) {
        this.mStdin = (InputStream) Util.throwIfNull(inputStream);
        this.mStdout = (PrintStream) Util.throwIfNull(printStream);
        this.mStderr = (PrintStream) Util.throwIfNull(printStream2);
        this.mParser = (C9602a) Util.throwIfNull(aVar);
        this.mArgs = (List) Util.throwIfNull(list);
    }
}
