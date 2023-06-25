package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.FileProvider;
import p040c.p072c.p073a.p074a.C1535z;

public class UtilsFileProvider extends FileProvider {
    public boolean onCreate() {
        C1535z.m1080b((Application) getContext().getApplicationContext());
        return true;
    }
}
