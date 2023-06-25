package com.juconnect.vivino.global;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"ACTION_OAUTH_TOKEN", "", "ACTION_SCAN_STATUS", "ACTION_SCAN_UPLOAD", "ACTION_SCAN_VINTAGE", "APP_PLATFORM", "APP_VERSION", "IMAGE_TYPE", "MULTIPART_TYPE_IMAGE", "TYPE_GRANT", "URL_HOST_PRODUCTION", "URL_HOST_TEST", "vivino_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UrlConst.kt */
public final class UrlConstKt {
    @NotNull
    public static final String ACTION_OAUTH_TOKEN = "oauth/token";
    @NotNull
    public static final String ACTION_SCAN_STATUS = "scans/label/{processingId}";
    @NotNull
    public static final String ACTION_SCAN_UPLOAD = "scans/label";
    @NotNull
    public static final String ACTION_SCAN_VINTAGE = "vintages/{vintageId}";
    @NotNull
    public static final String APP_PLATFORM = "android";
    @NotNull
    public static final String APP_VERSION = "8.20.0";
    @NotNull
    public static final String IMAGE_TYPE = "jpg";
    @NotNull
    public static final String MULTIPART_TYPE_IMAGE = "image/jpg";
    @NotNull
    public static final String TYPE_GRANT = "client_credentials";
    @NotNull
    public static final String URL_HOST_PRODUCTION = "https://api.vivino.com/";
    @NotNull
    public static final String URL_HOST_TEST = "https://api.stable.vivino.com/";
}
