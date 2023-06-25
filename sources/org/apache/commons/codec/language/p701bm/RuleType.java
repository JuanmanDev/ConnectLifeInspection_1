package org.apache.commons.codec.language.p701bm;

/* renamed from: org.apache.commons.codec.language.bm.RuleType */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES("rules");
    
    public final String name;

    /* access modifiers changed from: public */
    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
