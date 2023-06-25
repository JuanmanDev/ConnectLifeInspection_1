package org.apache.commons.cli;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OptionGroup implements Serializable {
    public static final long serialVersionUID = 1;
    public Map optionMap = new HashMap();
    public boolean required;
    public String selected;

    public OptionGroup addOption(Option option) {
        this.optionMap.put(option.getKey(), option);
        return this;
    }

    public Collection getNames() {
        return this.optionMap.keySet();
    }

    public Collection getOptions() {
        return this.optionMap.values();
    }

    public String getSelected() {
        return this.selected;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setSelected(Option option) {
        String str = this.selected;
        if (str == null || str.equals(option.getOpt())) {
            this.selected = option.getOpt();
            return;
        }
        throw new AlreadySelectedException(this, option);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = getOptions().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            Option option = (Option) it.next();
            if (option.getOpt() != null) {
                stringBuffer.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
                stringBuffer.append(option.getOpt());
            } else {
                stringBuffer.append("--");
                stringBuffer.append(option.getLongOpt());
            }
            stringBuffer.append(" ");
            stringBuffer.append(option.getDescription());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
