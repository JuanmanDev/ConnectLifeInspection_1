package com.facebook.stetho.dumpapp;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import p040c.p200q.p201a.p264c.p294g.p333g.C4569l;

public class GlobalOptions {
    public final Option optionHelp = new Option("h", "help", false, "Print this help");
    public final Option optionListPlugins = new Option(C4569l.f9345A, "list", false, "List available plugins");
    public final Option optionProcess = new Option("p", "process", true, "Specify target process");
    public final Options options;

    public GlobalOptions() {
        Options options2 = new Options();
        this.options = options2;
        options2.addOption(this.optionHelp);
        this.options.addOption(this.optionListPlugins);
        this.options.addOption(this.optionProcess);
    }
}
