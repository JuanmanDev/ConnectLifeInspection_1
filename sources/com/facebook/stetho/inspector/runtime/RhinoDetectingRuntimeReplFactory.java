package com.facebook.stetho.inspector.runtime;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import java.lang.reflect.InvocationTargetException;

public class RhinoDetectingRuntimeReplFactory implements RuntimeReplFactory {
    public final Context mContext;
    public RuntimeException mRhinoJsUnexpectedError;
    public RuntimeReplFactory mRhinoReplFactory;
    public boolean mSearchedForRhinoJs;

    public RhinoDetectingRuntimeReplFactory(Context context) {
        this.mContext = context;
    }

    @Nullable
    public static RuntimeReplFactory findRhinoReplFactory(Context context) {
        try {
            return (RuntimeReplFactory) Class.forName("com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder").getDeclaredMethod("defaultFactory", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (ClassNotFoundException unused) {
            LogUtil.m9809i("Error finding stetho-js-rhino, cannot enable console evaluation!");
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }

    public RuntimeRepl newInstance() {
        if (!this.mSearchedForRhinoJs) {
            this.mSearchedForRhinoJs = true;
            try {
                this.mRhinoReplFactory = findRhinoReplFactory(this.mContext);
            } catch (RuntimeException e) {
                this.mRhinoJsUnexpectedError = e;
            }
        }
        RuntimeReplFactory runtimeReplFactory = this.mRhinoReplFactory;
        if (runtimeReplFactory != null) {
            return runtimeReplFactory.newInstance();
        }
        return new RuntimeRepl() {
            public Object evaluate(String str) {
                if (RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError == null) {
                    return "Not supported without stetho-js-rhino dependency";
                }
                return "stetho-js-rhino threw: " + RhinoDetectingRuntimeReplFactory.this.mRhinoJsUnexpectedError.toString();
            }
        };
    }
}
