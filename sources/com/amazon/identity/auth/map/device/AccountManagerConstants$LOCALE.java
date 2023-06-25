package com.amazon.identity.auth.map.device;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;

public enum AccountManagerConstants$LOCALE {
    US("us"),
    DE(LanguageConstKt.f15942de),
    UK(LanguageConstKt.f15973uk),
    JP("jp"),
    FR(LanguageConstKt.f15948fr),
    CA("ca"),
    ES(LanguageConstKt.f15945es),
    CN("cn");
    
    public static final String LOCALE_SEPERATOR = "-";
    public final String mLocale;

    /* access modifiers changed from: public */
    AccountManagerConstants$LOCALE(String str) {
        this.mLocale = str;
    }

    public String toUrlString() {
        if (equals(US)) {
            return "";
        }
        return this.mLocale + LOCALE_SEPERATOR;
    }
}
