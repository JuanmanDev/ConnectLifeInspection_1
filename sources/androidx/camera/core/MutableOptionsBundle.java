package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;
import java.util.Comparator;
import java.util.TreeMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MutableOptionsBundle extends OptionsBundle implements MutableConfig {
    public static final Comparator<Config.Option<?>> ID_COMPARE = new Comparator<Config.Option<?>>() {
        public int compare(Config.Option<?> option, Config.Option<?> option2) {
            return option.getId().compareTo(option2.getId());
        }
    };

    public MutableOptionsBundle(TreeMap<Config.Option<?>, Object> treeMap) {
        super(treeMap);
    }

    public static MutableOptionsBundle create() {
        return new MutableOptionsBundle(new TreeMap(ID_COMPARE));
    }

    public static MutableOptionsBundle from(Config config) {
        TreeMap treeMap = new TreeMap(ID_COMPARE);
        for (Config.Option next : config.listOptions()) {
            treeMap.put(next, config.retrieveOption(next));
        }
        return new MutableOptionsBundle(treeMap);
    }

    public <ValueT> void insertOption(Config.Option<ValueT> option, ValueT valuet) {
        this.mOptions.put(option, valuet);
    }

    @Nullable
    public <ValueT> ValueT removeOption(Config.Option<ValueT> option) {
        return this.mOptions.remove(option);
    }
}
