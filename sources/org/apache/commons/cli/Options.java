package org.apache.commons.cli;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p648m.p649a.p650a.p651a.C9611i;

public class Options implements Serializable {
    public static final long serialVersionUID = 1;
    public Map longOpts = new HashMap();
    public Map optionGroups = new HashMap();
    public List requiredOpts = new ArrayList();
    public Map shortOpts = new HashMap();

    public Options addOption(String str, boolean z, String str2) {
        addOption(str, (String) null, z, str2);
        return this;
    }

    public Options addOptionGroup(OptionGroup optionGroup) {
        if (optionGroup.isRequired()) {
            this.requiredOpts.add(optionGroup);
        }
        for (Option option : optionGroup.getOptions()) {
            option.setRequired(false);
            addOption(option);
            this.optionGroups.put(option.getKey(), optionGroup);
        }
        return this;
    }

    public Option getOption(String str) {
        String b = C9611i.m25801b(str);
        if (this.shortOpts.containsKey(b)) {
            return (Option) this.shortOpts.get(b);
        }
        return (Option) this.longOpts.get(b);
    }

    public OptionGroup getOptionGroup(Option option) {
        return (OptionGroup) this.optionGroups.get(option.getKey());
    }

    public Collection getOptionGroups() {
        return new HashSet(this.optionGroups.values());
    }

    public Collection getOptions() {
        return Collections.unmodifiableCollection(helpOptions());
    }

    public List getRequiredOptions() {
        return this.requiredOpts;
    }

    public boolean hasOption(String str) {
        String b = C9611i.m25801b(str);
        return this.shortOpts.containsKey(b) || this.longOpts.containsKey(b);
    }

    public List helpOptions() {
        return new ArrayList(this.shortOpts.values());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.shortOpts.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.longOpts);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public Options addOption(String str, String str2, boolean z, String str3) {
        addOption(new Option(str, str2, z, str3));
        return this;
    }

    public Options addOption(Option option) {
        String key = option.getKey();
        if (option.hasLongOpt()) {
            this.longOpts.put(option.getLongOpt(), option);
        }
        if (option.isRequired()) {
            if (this.requiredOpts.contains(key)) {
                List list = this.requiredOpts;
                list.remove(list.indexOf(key));
            }
            this.requiredOpts.add(key);
        }
        this.shortOpts.put(key, option);
        return this;
    }
}
