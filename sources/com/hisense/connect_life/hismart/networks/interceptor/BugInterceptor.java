package com.hisense.connect_life.hismart.networks.interceptor;

import android.content.Context;
import android.os.Environment;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.utils.SaveFileUtils;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/interceptor/BugInterceptor;", "Lokhttp3/Interceptor;", "()V", "count", "", "dirPath", "", "getDiskFilesDir", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BugInterceptor.kt */
public final class BugInterceptor implements Interceptor {
    public long count = (System.currentTimeMillis() / ((long) 1000000));
    @Nullable
    public String dirPath;

    private final String getDiskFilesDir() {
        Context context;
        Context context2;
        String str = "";
        File file = null;
        if (Intrinsics.areEqual((Object) "mounted", (Object) Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
            if ((hiSystemParameter == null ? null : hiSystemParameter.getContext()) != null) {
                HiSystemParameter hiSystemParameter2 = HiSmart.Companion.getInstance().getHiSystemParameter();
                if (!(hiSystemParameter2 == null || (context = hiSystemParameter2.getContext()) == null)) {
                    file = context.getExternalFilesDir((String) null);
                }
                Intrinsics.checkNotNull(file);
                str = file.getPath();
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n            if (HiSmar…\n            }\n\n        }");
        } else {
            HiSystemParameter hiSystemParameter3 = HiSmart.Companion.getInstance().getHiSystemParameter();
            if ((hiSystemParameter3 == null ? null : hiSystemParameter3.getContext()) != null) {
                HiSystemParameter hiSystemParameter4 = HiSmart.Companion.getInstance().getHiSystemParameter();
                if (!(hiSystemParameter4 == null || (context2 = hiSystemParameter4.getContext()) == null)) {
                    file = context2.getFilesDir();
                }
                Intrinsics.checkNotNull(file);
                str = file.getPath();
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n            if (HiSmar…\"\n            }\n        }");
        }
        String.valueOf(str);
        return Intrinsics.stringPlus(str, File.separator);
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        String string;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        ResponseBody body = proceed.body();
        String str = "";
        if (!(body == null || (string = body.string()) == null)) {
            str = string;
        }
        this.count++;
        List<String> pathSegments = request.url().pathSegments();
        boolean z = false;
        if ((pathSegments == null || pathSegments.isEmpty()) || !pathSegments.contains("category") || !pathSegments.contains("query")) {
            if (pathSegments == null || pathSegments.isEmpty()) {
                z = true;
            }
            if (!z && pathSegments.contains("queryByDevList")) {
                if (this.dirPath == null) {
                    this.dirPath = getDiskFilesDir();
                }
                Intrinsics.stringPlus("count is ", Long.valueOf(this.count));
                Intrinsics.stringPlus("保存请求的酒列表数据大小is ", Integer.valueOf(str.length()));
                String stringPlus = Intrinsics.stringPlus(str, Long.valueOf(this.count));
                SaveFileUtils.Companion companion = SaveFileUtils.Companion;
                byte[] bytes = stringPlus.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                companion.writeBytesToFile(bytes, new File(this.dirPath, "查询酒列表.txt"));
            }
        } else {
            if (this.dirPath == null) {
                this.dirPath = getDiskFilesDir();
            }
            String stringPlus2 = Intrinsics.stringPlus(str, Long.valueOf(this.count));
            SaveFileUtils.Companion companion2 = SaveFileUtils.Companion;
            byte[] bytes2 = stringPlus2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            companion2.writeBytesToFile(bytes2, new File(this.dirPath, "查询酒品类.txt"));
        }
        Response.Builder newBuilder = proceed.newBuilder();
        ResponseBody.Companion companion3 = ResponseBody.Companion;
        ResponseBody body2 = proceed.body();
        return newBuilder.body(companion3.create(body2 == null ? null : body2.contentType(), str)).build();
    }
}
