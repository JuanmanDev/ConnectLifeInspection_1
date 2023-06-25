package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class OptionsBundle implements Config {
    public static final OptionsBundle EMPTY_BUNDLE = new OptionsBundle(new TreeMap(new Comparator<Config.Option<?>>() {
        public int compare(Config.Option<?> option, Config.Option<?> option2) {
            return option.getId().compareTo(option2.getId());
        }
    }));
    public final TreeMap<Config.Option<?>, Object> mOptions;

    public OptionsBundle(TreeMap<Config.Option<?>, Object> treeMap) {
        this.mOptions = treeMap;
    }

    public static OptionsBundle emptyBundle() {
        return EMPTY_BUNDLE;
    }

    public static OptionsBundle from(Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(new Comparator<Config.Option<?>>() {
            public int compare(Config.Option<?> option, Config.Option<?> option2) {
                return option.getId().compareTo(option2.getId());
            }
        });
        for (Config.Option next : config.listOptions()) {
            treeMap.put(next, config.retrieveOption(next));
        }
        return new OptionsBundle(treeMap);
    }

    public boolean containsOption(Config.Option<?> option) {
        return this.mOptions.containsKey(option);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void findOptions(java.lang.String r4, androidx.camera.core.Config.OptionMatcher r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.Config$Option r0 = androidx.camera.core.Config.Option.create(r4, r0)
            java.util.TreeMap<androidx.camera.core.Config$Option<?>, java.lang.Object> r1 = r3.mOptions
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.Config$Option r2 = (androidx.camera.core.Config.Option) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.Config$Option r1 = (androidx.camera.core.Config.Option) r1
            boolean r1 = r5.onOptionMatched(r1)
            if (r1 != 0) goto L_0x0014
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.OptionsBundle.findOptions(java.lang.String, androidx.camera.core.Config$OptionMatcher):void");
    }

    public Set<Config.Option<?>> listOptions() {
        return Collections.unmodifiableSet(this.mOptions.keySet());
    }

    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option) {
        ValueT retrieveOption = retrieveOption(option, (Object) null);
        if (retrieveOption != null) {
            return retrieveOption;
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    @Nullable
    public <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, @Nullable ValueT valuet) {
        ValueT valuet2 = this.mOptions.get(option);
        return valuet2 == null ? valuet : valuet2;
    }
}
