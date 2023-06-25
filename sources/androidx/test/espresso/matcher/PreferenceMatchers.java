package androidx.test.espresso.matcher;

import android.content.res.Resources;
import android.preference.Preference;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;
import p648m.p657c.C9624f;
import p648m.p657c.C9627i;

public final class PreferenceMatchers {
    public static C9623e<Preference> isEnabled() {
        return new C9627i<Preference>() {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" is an enabled preference");
            }

            public boolean matchesSafely(Preference preference) {
                return preference.isEnabled();
            }
        };
    }

    public static C9623e<Preference> withKey(String str) {
        return withKey((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<Preference> withSummary(final int i) {
        return new C9627i<Preference>() {
            public String expectedText = null;
            public String resourceName = null;

            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" with summary string from resource id: ");
                cVar.mo50301d(Integer.valueOf(i));
                if (this.resourceName != null) {
                    cVar.mo50300c("[");
                    cVar.mo50300c(this.resourceName);
                    cVar.mo50300c("]");
                }
                if (this.expectedText != null) {
                    cVar.mo50300c(" value: ");
                    cVar.mo50300c(this.expectedText);
                }
            }

            public boolean matchesSafely(Preference preference) {
                if (this.expectedText == null) {
                    try {
                        this.expectedText = preference.getContext().getResources().getString(i);
                        this.resourceName = preference.getContext().getResources().getResourceEntryName(i);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                String str = this.expectedText;
                if (str != null) {
                    return str.equals(preference.getSummary().toString());
                }
                return false;
            }
        };
    }

    public static C9623e<Preference> withSummaryText(String str) {
        return withSummaryText((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<Preference> withTitle(final int i) {
        return new C9627i<Preference>() {
            public String expectedText = null;
            public String resourceName = null;

            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" with title string from resource id: ");
                cVar.mo50301d(Integer.valueOf(i));
                if (this.resourceName != null) {
                    cVar.mo50300c("[");
                    cVar.mo50300c(this.resourceName);
                    cVar.mo50300c("]");
                }
                if (this.expectedText != null) {
                    cVar.mo50300c(" value: ");
                    cVar.mo50300c(this.expectedText);
                }
            }

            public boolean matchesSafely(Preference preference) {
                if (this.expectedText == null) {
                    try {
                        this.expectedText = preference.getContext().getResources().getString(i);
                        this.resourceName = preference.getContext().getResources().getResourceEntryName(i);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                if (this.expectedText == null || preference.getTitle() == null) {
                    return false;
                }
                return this.expectedText.equals(preference.getTitle().toString());
            }
        };
    }

    public static C9623e<Preference> withTitleText(String str) {
        return withTitleText((C9623e<String>) C9624f.m25844i(str));
    }

    public static C9623e<Preference> withKey(final C9623e<String> eVar) {
        return new C9627i<Preference>() {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" preference with key matching: ");
                C9623e.this.describeTo(cVar);
            }

            public boolean matchesSafely(Preference preference) {
                return C9623e.this.matches(preference.getKey());
            }
        };
    }

    public static C9623e<Preference> withSummaryText(final C9623e<String> eVar) {
        return new C9627i<Preference>() {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" a preference with summary matching: ");
                C9623e.this.describeTo(cVar);
            }

            public boolean matchesSafely(Preference preference) {
                return C9623e.this.matches(preference.getSummary().toString());
            }
        };
    }

    public static C9623e<Preference> withTitleText(final C9623e<String> eVar) {
        return new C9627i<Preference>() {
            public void describeTo(C9620c cVar) {
                cVar.mo50300c(" a preference with title matching: ");
                C9623e.this.describeTo(cVar);
            }

            public boolean matchesSafely(Preference preference) {
                if (preference.getTitle() == null) {
                    return false;
                }
                return C9623e.this.matches(preference.getTitle().toString());
            }
        };
    }
}
