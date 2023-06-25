package org.apache.commons.codec.language.p701bm;

/* renamed from: org.apache.commons.codec.language.bm.NameType */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");
    
    public final String name;

    /* access modifiers changed from: public */
    NameType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
