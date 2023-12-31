package org.apache.commons.cli;

import java.util.Iterator;
import java.util.List;

public class MissingOptionException extends ParseException {
    public List missingOptions;

    public MissingOptionException(String str) {
        super(str);
    }

    public static String createMessage(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public List getMissingOptions() {
        return this.missingOptions;
    }

    public MissingOptionException(List list) {
        this(createMessage(list));
        this.missingOptions = list;
    }
}
