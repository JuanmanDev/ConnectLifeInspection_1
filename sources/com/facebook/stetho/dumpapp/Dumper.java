package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import p648m.p649a.p650a.p651a.C9602a;
import p648m.p649a.p650a.p651a.C9603b;
import p648m.p649a.p650a.p651a.C9605d;

public class Dumper {
    public final Map<String, DumperPlugin> mDumperPlugins;
    public final GlobalOptions mGlobalOptions;
    public final C9602a mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new C9603b());
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        CommandLine a = this.mParser.mo50275a(this.mGlobalOptions.options, strArr, true);
        if (a.hasOption(this.mGlobalOptions.optionHelp.getOpt())) {
            dumpUsage(printStream);
            return 0;
        } else if (a.hasOption(this.mGlobalOptions.optionListPlugins.getOpt())) {
            dumpAvailablePlugins(printStream);
            return 0;
        } else if (!a.getArgList().isEmpty()) {
            dumpPluginOutput(inputStream, printStream, printStream2, a);
            return 0;
        } else {
            dumpUsage(printStream2);
            return 1;
        }
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (DumperPlugin name : this.mDumperPlugins.values()) {
            arrayList.add(name.getName());
        }
        Collections.sort(arrayList);
        for (String println : arrayList) {
            printStream.println(println);
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, CommandLine commandLine) {
        ArrayList arrayList = new ArrayList(commandLine.getArgList());
        if (arrayList.size() >= 1) {
            String str = (String) arrayList.remove(0);
            DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
            if (dumperPlugin != null) {
                dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList));
                return;
            }
            throw new DumpException("No plugin named '" + str + "'");
        }
        throw new DumpException("Expected plugin argument");
    }

    private void dumpUsage(PrintStream printStream) {
        C9605d dVar = new C9605d();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            dVar.mo50283g(printWriter, dVar.mo50282f(), this.mGlobalOptions.options, dVar.mo50280d(), dVar.mo50279c());
        } finally {
            printWriter.flush();
        }
    }

    public static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap hashMap = new HashMap();
        for (DumperPlugin next : iterable) {
            hashMap.put(next.getName(), next);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (ParseException e) {
            printStream2.println(e.getMessage());
            dumpUsage(printStream2);
            return 1;
        } catch (DumpException e2) {
            printStream2.println(e2.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e4.printStackTrace(printStream2);
            return 1;
        }
    }

    public Dumper(Iterable<DumperPlugin> iterable, C9602a aVar) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = aVar;
        this.mGlobalOptions = new GlobalOptions();
    }
}
