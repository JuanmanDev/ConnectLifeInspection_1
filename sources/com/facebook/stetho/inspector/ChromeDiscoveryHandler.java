package com.facebook.stetho.inspector;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.app.NotificationCompatJellybean;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import androidx.webkit.internal.AssetHelper;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.server.http.LightHttpBody;
import com.facebook.stetho.server.http.LightHttpRequest;
import com.facebook.stetho.server.http.LightHttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChromeDiscoveryHandler implements HttpHandler {
    public static final String PAGE_ID = "1";
    public static final String PATH_ACTIVATE = "/json/activate/1";
    public static final String PATH_PAGE_LIST = "/json";
    public static final String PATH_VERSION = "/json/version";
    public static final String PROTOCOL_VERSION = "1.1";
    public static final String USER_AGENT = "Stetho";
    public static final String WEBKIT_REV = "@188492";
    public static final String WEBKIT_VERSION = "537.36 (@188492)";
    public final Context mContext;
    public final String mInspectorPath;
    public LightHttpBody mPageListResponse;
    public LightHttpBody mVersionResponse;

    public ChromeDiscoveryHandler(Context context, String str) {
        this.mContext = context;
        this.mInspectorPath = str;
    }

    private CharSequence getAppLabel() {
        return this.mContext.getPackageManager().getApplicationLabel(this.mContext.getApplicationInfo());
    }

    private String getAppLabelAndVersion() {
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = this.mContext.getPackageManager();
        sb.append(getAppLabel());
        sb.append('/');
        try {
            sb.append(packageManager.getPackageInfo(this.mContext.getPackageName(), 0).versionName);
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void handleActivate(LightHttpResponse lightHttpResponse) {
        setSuccessfulResponse(lightHttpResponse, LightHttpBody.create("Target activation ignored\n", AssetHelper.DEFAULT_MIME_TYPE));
    }

    private void handlePageList(LightHttpResponse lightHttpResponse) {
        if (this.mPageListResponse == null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put(NotificationCompatJellybean.KEY_TITLE, makeTitle());
            jSONObject.put("id", "1");
            jSONObject.put(BundleJUnitUtils.KEY_DESCRIPTION, "");
            jSONObject.put("webSocketDebuggerUrl", "ws://" + this.mInspectorPath);
            jSONObject.put("devtoolsFrontendUrl", new Uri.Builder().scheme("http").authority("chrome-devtools-frontend.appspot.com").appendEncodedPath("serve_rev").appendEncodedPath(WEBKIT_REV).appendEncodedPath("devtools.html").appendQueryParameter("ws", this.mInspectorPath).build().toString());
            jSONArray.put(jSONObject);
            this.mPageListResponse = LightHttpBody.create(jSONArray.toString(), "application/json");
        }
        setSuccessfulResponse(lightHttpResponse, this.mPageListResponse);
    }

    private void handleVersion(LightHttpResponse lightHttpResponse) {
        if (this.mVersionResponse == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("WebKit-Version", WEBKIT_VERSION);
            jSONObject.put("User-Agent", USER_AGENT);
            jSONObject.put("Protocol-Version", PROTOCOL_VERSION);
            jSONObject.put("Browser", getAppLabelAndVersion());
            jSONObject.put("Android-Package", this.mContext.getPackageName());
            this.mVersionResponse = LightHttpBody.create(jSONObject.toString(), "application/json");
        }
        setSuccessfulResponse(lightHttpResponse, this.mVersionResponse);
    }

    private String makeTitle() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAppLabel());
        sb.append(" (powered by Stetho)");
        String processName = ProcessUtil.getProcessName();
        int indexOf = processName.indexOf(58);
        if (indexOf >= 0) {
            sb.append(processName.substring(indexOf));
        }
        return sb.toString();
    }

    public static void setSuccessfulResponse(LightHttpResponse lightHttpResponse, LightHttpBody lightHttpBody) {
        lightHttpResponse.code = 200;
        lightHttpResponse.reasonPhrase = "OK";
        lightHttpResponse.body = lightHttpBody;
    }

    public boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) {
        String path = lightHttpRequest.uri.getPath();
        try {
            if (PATH_VERSION.equals(path)) {
                handleVersion(lightHttpResponse);
                return true;
            } else if (PATH_PAGE_LIST.equals(path)) {
                handlePageList(lightHttpResponse);
                return true;
            } else if (PATH_ACTIVATE.equals(path)) {
                handleActivate(lightHttpResponse);
                return true;
            } else {
                lightHttpResponse.code = HttpStatus.HTTP_NOT_IMPLEMENTED;
                lightHttpResponse.reasonPhrase = "Not implemented";
                lightHttpResponse.body = LightHttpBody.create("No support for " + path + "\n", AssetHelper.DEFAULT_MIME_TYPE);
                return true;
            }
        } catch (JSONException e) {
            lightHttpResponse.code = 500;
            lightHttpResponse.reasonPhrase = "Internal server error";
            lightHttpResponse.body = LightHttpBody.create(e.toString() + "\n", AssetHelper.DEFAULT_MIME_TYPE);
            return true;
        }
    }

    public void register(HandlerRegistry handlerRegistry) {
        handlerRegistry.register(new ExactPathMatcher(PATH_PAGE_LIST), this);
        handlerRegistry.register(new ExactPathMatcher(PATH_VERSION), this);
        handlerRegistry.register(new ExactPathMatcher(PATH_ACTIVATE), this);
    }
}
