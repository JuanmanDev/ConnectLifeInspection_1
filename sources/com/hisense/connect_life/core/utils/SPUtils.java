package com.hisense.connect_life.core.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.Person;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J\u0018\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00152\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0001J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/SPUtils;", "", "()V", "FILE_NAME", "", "getFILE_NAME", "()Ljava/lang/String;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "clear", "", "contains", "", "key", "get", "defaultObject", "getAll", "", "init", "put", "object", "remove", "SharedPreferencesCompat", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* compiled from: SPUtils.kt */
public final class SPUtils {
    @NotNull
    public static final String FILE_NAME = "FlutterSharedPreferences";
    @NotNull
    public static final SPUtils INSTANCE = new SPUtils();
    public static Context context;

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/SPUtils$SharedPreferencesCompat;", "", "()V", "sApplyMethod", "Ljava/lang/reflect/Method;", "apply", "", "editor", "Landroid/content/SharedPreferences$Editor;", "findApplyMethod", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: SPUtils.kt */
    public static final class SharedPreferencesCompat {
        @NotNull
        public static final SharedPreferencesCompat INSTANCE;
        @Nullable
        public static final Method sApplyMethod;

        static {
            SharedPreferencesCompat sharedPreferencesCompat = new SharedPreferencesCompat();
            INSTANCE = sharedPreferencesCompat;
            sApplyMethod = sharedPreferencesCompat.findApplyMethod();
        }

        private final Method findApplyMethod() {
            try {
                return SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        public final void apply(@NotNull SharedPreferences.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            try {
                if (sApplyMethod != null) {
                    sApplyMethod.invoke(editor, new Object[0]);
                    return;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
            editor.commit();
        }
    }

    public final void clear(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        SharedPreferences.Editor edit = context2.getSharedPreferences(FILE_NAME, 0).edit();
        edit.clear();
        SharedPreferencesCompat sharedPreferencesCompat = SharedPreferencesCompat.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        sharedPreferencesCompat.apply(edit);
    }

    public final boolean contains(@NotNull Context context2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        return context2.getSharedPreferences(FILE_NAME, 0).contains(Intrinsics.stringPlus("flutter.", str));
    }

    @Nullable
    public final Object get(@NotNull String str, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(obj, "defaultObject");
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(FILE_NAME, 0);
        String stringPlus = Intrinsics.stringPlus("flutter.", str);
        if (obj instanceof String) {
            return sharedPreferences.getString(stringPlus, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(stringPlus, ((Number) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(stringPlus, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(stringPlus, ((Number) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(stringPlus, ((Number) obj).longValue()));
        }
        return null;
    }

    @NotNull
    public final Map<String, ?> getAll(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Map<String, ?> all = context2.getSharedPreferences(FILE_NAME, 0).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sp.all");
        return all;
    }

    @NotNull
    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @NotNull
    public final String getFILE_NAME() {
        return FILE_NAME;
    }

    public final void init(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        setContext(context2);
    }

    public final void put(@NotNull String str, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(obj, "object");
        SharedPreferences.Editor edit = getContext().getSharedPreferences(FILE_NAME, 0).edit();
        String stringPlus = Intrinsics.stringPlus("flutter.", str);
        if (obj instanceof String) {
            edit.putString(stringPlus, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(stringPlus, ((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(stringPlus, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(stringPlus, ((Number) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(stringPlus, ((Number) obj).longValue());
        } else {
            edit.putString(stringPlus, obj.toString());
        }
        SharedPreferencesCompat sharedPreferencesCompat = SharedPreferencesCompat.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        sharedPreferencesCompat.apply(edit);
    }

    public final void remove(@NotNull Context context2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        SharedPreferences.Editor edit = context2.getSharedPreferences(FILE_NAME, 0).edit();
        edit.remove(Intrinsics.stringPlus("flutter.", str));
        SharedPreferencesCompat sharedPreferencesCompat = SharedPreferencesCompat.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        sharedPreferencesCompat.apply(edit);
    }

    public final void setContext(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        context = context2;
    }

    public final void remove(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        SharedPreferences.Editor edit = getContext().getSharedPreferences(FILE_NAME, 0).edit();
        edit.remove(Intrinsics.stringPlus("flutter.", str));
        SharedPreferencesCompat sharedPreferencesCompat = SharedPreferencesCompat.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        sharedPreferencesCompat.apply(edit);
    }
}
