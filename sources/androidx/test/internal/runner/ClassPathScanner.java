package androidx.test.internal.runner;

import androidx.annotation.VisibleForTesting;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import dalvik.system.DexFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@VisibleForTesting(otherwise = 3)
public class ClassPathScanner {
    public final Set<String> classPath;

    public static class AcceptAllFilter implements ClassNameFilter {
        public boolean accept(String str) {
            return true;
        }
    }

    public static class ChainedClassNameFilter implements ClassNameFilter {
        public final List<ClassNameFilter> filters = new ArrayList();

        public boolean accept(String str) {
            for (ClassNameFilter accept : this.filters) {
                if (!accept.accept(str)) {
                    return false;
                }
            }
            return true;
        }

        public void add(ClassNameFilter classNameFilter) {
            this.filters.add(classNameFilter);
        }

        public void addAll(ClassNameFilter... classNameFilterArr) {
            this.filters.addAll(Arrays.asList(classNameFilterArr));
        }
    }

    public interface ClassNameFilter {
        boolean accept(String str);
    }

    public static class ExcludeClassNamesFilter implements ClassNameFilter {
        public Set<String> excludedClassNames;

        public ExcludeClassNamesFilter(Set<String> set) {
            this.excludedClassNames = set;
        }

        public boolean accept(String str) {
            return !this.excludedClassNames.contains(str);
        }
    }

    public static class ExcludePackageNameFilter implements ClassNameFilter {
        public final String pkgName;

        public ExcludePackageNameFilter(String str) {
            if (!str.endsWith(MAPCookie.DOT)) {
                this.pkgName = String.format("%s.", new Object[]{str});
                return;
            }
            this.pkgName = str;
        }

        public boolean accept(String str) {
            return !str.startsWith(this.pkgName);
        }
    }

    public static class ExternalClassNameFilter implements ClassNameFilter {
        public boolean accept(String str) {
            return !str.contains("$");
        }
    }

    public static class InclusivePackageNamesFilter implements ClassNameFilter {
        public final Collection<String> pkgNames;

        public InclusivePackageNamesFilter(Collection<String> collection) {
            this.pkgNames = new ArrayList(collection.size());
            for (String next : collection) {
                if (!next.endsWith(MAPCookie.DOT)) {
                    this.pkgNames.add(String.format("%s.", new Object[]{next}));
                } else {
                    this.pkgNames.add(next);
                }
            }
        }

        public boolean accept(String str) {
            for (String startsWith : this.pkgNames) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ClassPathScanner(String... strArr) {
        this((Collection<String>) Arrays.asList(strArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addEntriesFromPath(java.util.Set<java.lang.String> r4, java.lang.String r5, androidx.test.internal.runner.ClassPathScanner.ClassNameFilter r6) {
        /*
            r3 = this;
            r0 = 0
            dalvik.system.DexFile r1 = new dalvik.system.DexFile     // Catch:{ all -> 0x0027 }
            r1.<init>(r5)     // Catch:{ all -> 0x0027 }
            java.util.Enumeration r5 = r3.getDexEntries(r1)     // Catch:{ all -> 0x0024 }
        L_0x000a:
            boolean r0 = r5.hasMoreElements()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r5.nextElement()     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0024 }
            boolean r2 = r6.accept(r0)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x000a
            r4.add(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x000a
        L_0x0020:
            r1.close()
            return
        L_0x0024:
            r4 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0027:
            r4 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()
        L_0x002d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.ClassPathScanner.addEntriesFromPath(java.util.Set, java.lang.String, androidx.test.internal.runner.ClassPathScanner$ClassNameFilter):void");
    }

    public Set<String> getClassPathEntries(ClassNameFilter classNameFilter) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String addEntriesFromPath : this.classPath) {
            addEntriesFromPath(linkedHashSet, addEntriesFromPath, classNameFilter);
        }
        return linkedHashSet;
    }

    @VisibleForTesting
    public Enumeration<String> getDexEntries(DexFile dexFile) {
        return dexFile.entries();
    }

    public ClassPathScanner(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.classPath = hashSet;
        hashSet.addAll(collection);
    }
}
