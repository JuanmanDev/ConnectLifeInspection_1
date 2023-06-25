package androidx.test.espresso.matcher;

import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.util.Arrays;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9625g;
import p648m.p657c.C9626h;

public final class CursorMatchers {
    public static final MatcherApplier BLOB_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(cursor.getBlob(i));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Blob");
        }
    };
    public static final int COLUMN_NOT_FOUND = -1;
    public static final MatcherApplier DOUBLE_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(Double.valueOf(cursor.getDouble(i)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Double");
        }
    };
    public static final MatcherApplier FLOAT_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(Float.valueOf(cursor.getFloat(i)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Float");
        }
    };
    public static final MatcherApplier INT_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(Integer.valueOf(cursor.getInt(i)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Int");
        }
    };
    public static final MatcherApplier LONG_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(Long.valueOf(cursor.getLong(i)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Long");
        }
    };
    public static final int MULTIPLE_COLUMNS_FOUND = -2;
    public static final MatcherApplier SHORT_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(Short.valueOf(cursor.getShort(i)));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with Short");
        }
    };
    public static final MatcherApplier STRING_MATCHER_APPLIER = new MatcherApplier() {
        public boolean apply(Cursor cursor, int i, C9623e<?> eVar) {
            return eVar.matches(cursor.getString(i));
        }

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("with String");
        }
    };
    public static final int USE_COLUMN_PICKER = -3;

    public static class CursorMatcher extends BoundedMatcher<Object, Cursor> {
        public final MatcherApplier applier;
        public boolean checkColumns;
        public final int columnIndex;
        public final C9623e<String> columnNameMatcher;
        public final C9623e<?> valueMatcher;

        public void describeTo(C9620c cVar) {
            cVar.mo50300c("Rows with column: ");
            int i = this.columnIndex;
            if (i < 0) {
                this.columnNameMatcher.describeTo(cVar);
            } else {
                StringBuilder sb = new StringBuilder(21);
                sb.append(" index = ");
                sb.append(i);
                sb.append(" ");
                cVar.mo50300c(sb.toString());
            }
            this.applier.describeTo(cVar);
            cVar.mo50300c(" ");
            this.valueMatcher.describeTo(cVar);
        }

        public CursorMatcher withStrictColumnChecks(boolean z) {
            this.checkColumns = z;
            return this;
        }

        public boolean matchesSafely(Cursor cursor) {
            int i = this.columnIndex;
            if (i >= 0 || (i = CursorMatchers.findColumnIndex(this.columnNameMatcher, cursor)) >= 0) {
                try {
                    return this.applier.apply(cursor, i, this.valueMatcher);
                } catch (CursorIndexOutOfBoundsException e) {
                    if (!this.checkColumns) {
                        return false;
                    }
                    throw new IllegalArgumentException("Column index is invalid", e);
                }
            } else {
                C9626h hVar = new C9626h();
                this.columnNameMatcher.describeTo(hVar);
                if (i == -1) {
                    if (!this.checkColumns) {
                        return false;
                    }
                    String valueOf = String.valueOf(Arrays.asList(cursor.getColumnNames()));
                    String hVar2 = hVar.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(hVar2).length());
                    sb.append("Couldn't find column in ");
                    sb.append(valueOf);
                    sb.append(" matching ");
                    sb.append(hVar2);
                    throw new IllegalArgumentException(sb.toString());
                } else if (i == -2) {
                    String valueOf2 = String.valueOf(Arrays.asList(cursor.getColumnNames()));
                    String hVar3 = hVar.toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27 + String.valueOf(hVar3).length());
                    sb2.append("Multiple columns in ");
                    sb2.append(valueOf2);
                    sb2.append(" match ");
                    sb2.append(hVar3);
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    String valueOf3 = String.valueOf(Arrays.asList(cursor.getColumnNames()));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                    sb3.append("Couldn't find column in ");
                    sb3.append(valueOf3);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
        }

        public CursorMatcher(int i, C9623e<?> eVar, MatcherApplier matcherApplier) {
            super(Cursor.class);
            boolean z = true;
            this.checkColumns = true;
            Preconditions.checkArgument(i < 0 ? false : z);
            this.columnIndex = i;
            this.valueMatcher = (C9623e) Preconditions.checkNotNull(eVar);
            this.applier = (MatcherApplier) Preconditions.checkNotNull(matcherApplier);
            this.columnNameMatcher = null;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m.c.e<java.lang.String>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CursorMatcher(p648m.p657c.C9623e<java.lang.String> r2, p648m.p657c.C9623e<?> r3, androidx.test.espresso.matcher.CursorMatchers.MatcherApplier r4) {
            /*
                r1 = this;
                java.lang.Class<android.database.Cursor> r0 = android.database.Cursor.class
                r1.<init>(r0)
                r0 = 1
                r1.checkColumns = r0
                java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r2)
                m.c.e r2 = (p648m.p657c.C9623e) r2
                r1.columnNameMatcher = r2
                java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r3)
                m.c.e r2 = (p648m.p657c.C9623e) r2
                r1.valueMatcher = r2
                java.lang.Object r2 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r4)
                androidx.test.espresso.matcher.CursorMatchers$MatcherApplier r2 = (androidx.test.espresso.matcher.CursorMatchers.MatcherApplier) r2
                r1.applier = r2
                r2 = -3
                r1.columnIndex = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.matcher.CursorMatchers.CursorMatcher.<init>(m.c.e, m.c.e, androidx.test.espresso.matcher.CursorMatchers$MatcherApplier):void");
        }
    }

    public interface MatcherApplier extends C9625g {
        boolean apply(Cursor cursor, int i, C9623e<?> eVar);

        /* synthetic */ void describeTo(C9620c cVar);
    }

    public static int findColumnIndex(C9623e<String> eVar, Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        int i = -1;
        for (int i2 = 0; i2 < columnNames.length; i2++) {
            if (eVar.matches(columnNames[i2])) {
                if (i != -1) {
                    return -2;
                }
                i = i2;
            }
        }
        return i;
    }

    public static CursorMatcher withRowBlob(int i, byte[] bArr) {
        return withRowBlob(i, (C9623e<byte[]>) C9624f.m25844i(bArr));
    }

    public static CursorMatcher withRowDouble(int i, double d) {
        return withRowDouble(i, (C9623e<Double>) C9624f.m25844i(Double.valueOf(d)));
    }

    public static CursorMatcher withRowFloat(int i, float f) {
        return withRowFloat(i, (C9623e<Float>) C9624f.m25844i(Float.valueOf(f)));
    }

    public static CursorMatcher withRowInt(int i, int i2) {
        return withRowInt(i, (C9623e<Integer>) C9624f.m25844i(Integer.valueOf(i2)));
    }

    public static CursorMatcher withRowLong(int i, long j) {
        return withRowLong(i, (C9623e<Long>) C9624f.m25844i(Long.valueOf(j)));
    }

    public static CursorMatcher withRowShort(int i, short s) {
        return withRowShort(i, (C9623e<Short>) C9624f.m25844i(Short.valueOf(s)));
    }

    public static CursorMatcher withRowString(int i, String str) {
        return withRowString(i, (C9623e<String>) C9624f.m25844i(str));
    }

    public static CursorMatcher withRowBlob(int i, C9623e<byte[]> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, BLOB_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowDouble(int i, C9623e<Double> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, DOUBLE_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowFloat(int i, C9623e<Float> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, FLOAT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowInt(int i, C9623e<Integer> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, INT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowLong(int i, C9623e<Long> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, LONG_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowShort(int i, C9623e<Short> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, SHORT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowString(int i, C9623e<String> eVar) {
        return new CursorMatcher(i, (C9623e) eVar, STRING_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowBlob(String str, byte[] bArr) {
        return withRowBlob((C9623e<String>) C9624f.m25844i(str), (C9623e<byte[]>) C9624f.m25844i(bArr));
    }

    public static CursorMatcher withRowDouble(String str, double d) {
        return withRowDouble(str, (C9623e<Double>) C9624f.m25844i(Double.valueOf(d)));
    }

    public static CursorMatcher withRowFloat(String str, float f) {
        return withRowFloat(str, (C9623e<Float>) C9624f.m25844i(Float.valueOf(f)));
    }

    public static CursorMatcher withRowInt(String str, int i) {
        return withRowInt(str, (C9623e<Integer>) C9624f.m25844i(Integer.valueOf(i)));
    }

    public static CursorMatcher withRowLong(String str, long j) {
        return withRowLong(str, (C9623e<Long>) C9624f.m25844i(Long.valueOf(j)));
    }

    public static CursorMatcher withRowShort(String str, short s) {
        return withRowShort(str, (C9623e<Short>) C9624f.m25844i(Short.valueOf(s)));
    }

    public static CursorMatcher withRowString(String str, String str2) {
        return withRowString((C9623e<String>) C9624f.m25844i(str), (C9623e<String>) C9624f.m25844i(str2));
    }

    public static CursorMatcher withRowBlob(String str, C9623e<byte[]> eVar) {
        return withRowBlob((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowDouble(String str, C9623e<Double> eVar) {
        return withRowDouble((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowFloat(String str, C9623e<Float> eVar) {
        return withRowFloat((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowInt(String str, C9623e<Integer> eVar) {
        return withRowInt((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowLong(String str, C9623e<Long> eVar) {
        return withRowLong((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowShort(String str, C9623e<Short> eVar) {
        return withRowShort((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowString(String str, C9623e<String> eVar) {
        return withRowString((C9623e<String>) C9624f.m25844i(str), eVar);
    }

    public static CursorMatcher withRowBlob(C9623e<String> eVar, C9623e<byte[]> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, BLOB_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowDouble(C9623e<String> eVar, C9623e<Double> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, DOUBLE_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowFloat(C9623e<String> eVar, C9623e<Float> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, FLOAT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowInt(C9623e<String> eVar, C9623e<Integer> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, INT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowLong(C9623e<String> eVar, C9623e<Long> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, LONG_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowShort(C9623e<String> eVar, C9623e<Short> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, SHORT_MATCHER_APPLIER);
    }

    public static CursorMatcher withRowString(C9623e<String> eVar, C9623e<String> eVar2) {
        return new CursorMatcher((C9623e) eVar, (C9623e) eVar2, STRING_MATCHER_APPLIER);
    }
}
