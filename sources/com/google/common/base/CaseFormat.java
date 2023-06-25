package com.google.common.base;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5831c;
import p040c.p200q.p353b.p354a.C5832d;
import p040c.p200q.p353b.p354a.C5836e;
import p040c.p200q.p353b.p354a.C5850m;

public enum CaseFormat {
    LOWER_HYPHEN(C5832d.m16545e('-'), AccountManagerConstants$LOCALE.LOCALE_SEPERATOR) {
        public String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return C5831c.m16542e(str.replace('-', '_'));
            }
            return CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C5831c.m16540c(str);
        }
    },
    LOWER_UNDERSCORE(C5832d.m16545e('_'), "_") {
        public String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return C5831c.m16542e(str);
            }
            return CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C5831c.m16540c(str);
        }
    },
    LOWER_CAMEL(C5832d.m16544c('A', 'Z'), "") {
        public String normalizeFirstWord(String str) {
            return C5831c.m16540c(str);
        }

        public String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_CAMEL(C5832d.m16544c('A', 'Z'), "") {
        public String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_UNDERSCORE(C5832d.m16545e('_'), "_") {
        public String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return C5831c.m16540c(str.replace('_', '-'));
            }
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return C5831c.m16540c(str);
            }
            return CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C5831c.m16542e(str);
        }
    };
    
    public final C5832d wordBoundary;
    public final String wordSeparator;

    /* renamed from: com.google.common.base.CaseFormat$f */
    public static final class C8054f extends C5836e<String, String> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: l */
        public final CaseFormat f14998l;

        /* renamed from: m */
        public final CaseFormat f14999m;

        public C8054f(CaseFormat caseFormat, CaseFormat caseFormat2) {
            C5850m.m16594o(caseFormat);
            this.f14998l = caseFormat;
            C5850m.m16594o(caseFormat2);
            this.f14999m = caseFormat2;
        }

        /* renamed from: d */
        public String mo28944c(String str) {
            return this.f14998l.mo36442to(this.f14999m, str);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8054f)) {
                return false;
            }
            C8054f fVar = (C8054f) obj;
            if (!this.f14998l.equals(fVar.f14998l) || !this.f14999m.equals(fVar.f14999m)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f14998l.hashCode() ^ this.f14999m.hashCode();
        }

        public String toString() {
            return this.f14998l + ".converterTo(" + this.f14999m + ")";
        }
    }

    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return C5831c.m16541d(str.charAt(0)) + C5831c.m16540c(str.substring(1));
    }

    public String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.mo28936d(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (this.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                sb.append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        sb.append(caseFormat.normalizeWord(str.substring(i)));
        return sb.toString();
    }

    public C5836e<String, String> converterTo(CaseFormat caseFormat) {
        return new C8054f(this, caseFormat);
    }

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    /* renamed from: to */
    public final String mo36442to(CaseFormat caseFormat, String str) {
        C5850m.m16594o(caseFormat);
        C5850m.m16594o(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    /* access modifiers changed from: public */
    CaseFormat(C5832d dVar, String str) {
        this.wordBoundary = dVar;
        this.wordSeparator = str;
    }
}
