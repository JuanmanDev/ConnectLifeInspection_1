package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class MethodInvoker {
    public static final List<TypedMethodInvoker<?>> invokers = Arrays.asList(new TypedMethodInvoker[]{new StringMethodInvoker(), new CharSequenceMethodInvoker(), new IntegerMethodInvoker(), new FloatMethodInvoker(), new BooleanMethodInvoker()});

    public static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean> {
        public BooleanMethodInvoker() {
            super(Boolean.TYPE);
        }

        public Boolean convertArgument(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    public static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence> {
        public CharSequenceMethodInvoker() {
            super(CharSequence.class);
        }

        public CharSequence convertArgument(String str) {
            return str;
        }
    }

    public static class FloatMethodInvoker extends TypedMethodInvoker<Float> {
        public FloatMethodInvoker() {
            super(Float.TYPE);
        }

        public Float convertArgument(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    }

    public static class IntegerMethodInvoker extends TypedMethodInvoker<Integer> {
        public IntegerMethodInvoker() {
            super(Integer.TYPE);
        }

        public Integer convertArgument(String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    public static class StringMethodInvoker extends TypedMethodInvoker<String> {
        public StringMethodInvoker() {
            super(String.class);
        }

        public String convertArgument(String str) {
            return str;
        }
    }

    public static abstract class TypedMethodInvoker<T> {
        public final Class<T> mArgType;

        public TypedMethodInvoker(Class<T> cls) {
            this.mArgType = cls;
        }

        public abstract T convertArgument(String str);

        public boolean invoke(Object obj, String str, String str2) {
            try {
                obj.getClass().getMethod(str, new Class[]{this.mArgType}).invoke(obj, new Object[]{convertArgument(str2)});
                return true;
            } catch (NoSuchMethodException unused) {
                return false;
            } catch (InvocationTargetException e) {
                LogUtil.m9817w("InvocationTargetException: " + e.getMessage());
                return false;
            } catch (IllegalAccessException e2) {
                LogUtil.m9817w("IllegalAccessException: " + e2.getMessage());
                return false;
            } catch (IllegalArgumentException e3) {
                LogUtil.m9817w("IllegalArgumentException: " + e3.getMessage());
                return false;
            }
        }
    }

    public void invoke(Object obj, String str, String str2) {
        Util.throwIfNull(obj, str, str2);
        int size = invokers.size();
        int i = 0;
        while (i < size) {
            if (!invokers.get(i).invoke(obj, str, str2)) {
                i++;
            } else {
                return;
            }
        }
        LogUtil.m9817w("Method with name " + str + " not found for any of the MethodInvoker supported argument types.");
    }
}
