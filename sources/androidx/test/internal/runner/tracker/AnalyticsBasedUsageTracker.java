package androidx.test.internal.runner.tracker;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.test.internal.util.Checks;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class AnalyticsBasedUsageTracker implements UsageTracker {
    public static final String API_LEVEL_PARAM = "&cd2=";
    public static final String APP_NAME_PARAM = "an=";
    public static final String APP_VERSION_PARAM = "&av=";
    public static final String CLIENT_ID_PARAM = "&cid=";
    public static final String MODEL_NAME_PARAM = "&cd3=";
    public static final String SCREEN_NAME_PARAM = "&cd=";
    public static final String SCREEN_RESOLUTION_PARAM = "&sr=";
    public static final String TAG = "InfraTrack";
    public static final String TRACKER_ID_PARAM = "&tid=";
    public static final String UTF_8 = "UTF-8";
    public final URL analyticsURI;
    public final String apiLevel;
    public final String model;
    public final String screenResolution;
    public final String targetPackage;
    public final String trackingId;
    public final Map<String, String> usageTypeToVersion;
    public final String userId;

    public static class Builder {
        public URL analyticsURI;
        public Uri analyticsUri = new Uri.Builder().scheme("https").authority("www.google-analytics.com").path("collect").build();
        public String apiLevel = String.valueOf(Build.VERSION.SDK_INT);
        public boolean hashed;
        public String model = Build.MODEL;
        public String screenResolution;
        public final Context targetContext;
        public String targetPackage;
        public String trackingId = "UA-36650409-3";
        public String userId;

        public Builder(Context context) {
            if (context != null) {
                this.targetContext = context;
                return;
            }
            throw new NullPointerException("Context null!?");
        }

        private boolean hasInternetPermission() {
            return this.targetContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0;
        }

        public UsageTracker buildIfPossible() {
            if (!hasInternetPermission()) {
                return null;
            }
            if (this.targetPackage == null) {
                withTargetPackage(this.targetContext.getPackageName());
            }
            if (this.targetPackage.contains("com.google.analytics")) {
                return null;
            }
            try {
                if (!this.targetPackage.startsWith("com.google.") && !this.targetPackage.startsWith("com.android.")) {
                    if (!this.targetPackage.startsWith("android.support.")) {
                        if (!this.hashed) {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.reset();
                            instance.update(this.targetPackage.getBytes("UTF-8"));
                            String valueOf = String.valueOf(new BigInteger(instance.digest()).toString(16));
                            this.targetPackage = valueOf.length() != 0 ? "sha256-".concat(valueOf) : new String("sha256-");
                        }
                        this.hashed = true;
                    }
                }
                try {
                    this.analyticsURI = new URL(this.analyticsUri.toString());
                    if (this.screenResolution == null) {
                        Display defaultDisplay = ((WindowManager) this.targetContext.getSystemService("window")).getDefaultDisplay();
                        if (defaultDisplay == null) {
                            this.screenResolution = "0x0";
                        } else {
                            this.screenResolution = defaultDisplay.getWidth() + "x" + defaultDisplay.getHeight();
                        }
                    }
                    if (this.userId == null) {
                        this.userId = UUID.randomUUID().toString();
                    }
                    return new AnalyticsBasedUsageTracker(this);
                } catch (MalformedURLException unused) {
                    String valueOf2 = String.valueOf(this.analyticsUri.toString());
                    if (valueOf2.length() != 0) {
                        "Tracking disabled bad url: ".concat(valueOf2);
                    } else {
                        new String("Tracking disabled bad url: ");
                    }
                    return null;
                }
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused2) {
                return null;
            }
        }

        public Builder withAnalyticsUri(Uri uri) {
            Checks.checkNotNull(uri);
            this.analyticsUri = uri;
            return this;
        }

        public Builder withApiLevel(String str) {
            this.apiLevel = str;
            return this;
        }

        public Builder withModel(String str) {
            this.model = str;
            return this;
        }

        public Builder withScreenResolution(String str) {
            this.screenResolution = str;
            return this;
        }

        public Builder withTargetPackage(String str) {
            this.hashed = false;
            this.targetPackage = str;
            return this;
        }

        public Builder withTrackingId(String str) {
            this.trackingId = str;
            return this;
        }

        public Builder withUserId(String str) {
            this.userId = str;
            return this;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:29|30|(2:45|42)|32|46|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = APP_NAME_PARAM + java.net.URLEncoder.encode(r10.targetPackage, "UTF-8") + TRACKER_ID_PARAM + java.net.URLEncoder.encode(r10.trackingId, "UTF-8") + "&v=1" + "&z=" + android.os.SystemClock.uptimeMillis() + CLIENT_ID_PARAM + java.net.URLEncoder.encode(r10.userId, "UTF-8") + SCREEN_RESOLUTION_PARAM + java.net.URLEncoder.encode(r10.screenResolution, "UTF-8") + API_LEVEL_PARAM + java.net.URLEncoder.encode(r10.apiLevel, "UTF-8") + MODEL_NAME_PARAM + java.net.URLEncoder.encode(r10.model, "UTF-8") + "&t=appview" + "&sc=start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3 = java.lang.String.valueOf(r3);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 25);
        r6.append("Analytics post: ");
        r6.append(r3);
        r6.append(" failed. ");
        r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0181, code lost:
        if (r4 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0188, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x018b, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x015e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendUsages() {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.usageTypeToVersion
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.usageTypeToVersion     // Catch:{ all -> 0x0190 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0190 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            return
        L_0x000d:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0190 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.usageTypeToVersion     // Catch:{ all -> 0x0190 }
            r1.<init>(r2)     // Catch:{ all -> 0x0190 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.usageTypeToVersion     // Catch:{ all -> 0x0190 }
            r2.clear()     // Catch:{ all -> 0x0190 }
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
            r2.<init>()     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "an="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.targetPackage     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&tid="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.trackingId     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&v=1"
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&z="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&cid="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.userId     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&sr="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.screenResolution     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&cd2="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.apiLevel     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&cd3="
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = r10.model     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ IOException -> 0x00a0 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&t=appview"
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r3 = "&sc=start"
            r2.append(r3)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x018f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.net.URL r4 = r10.analyticsURI     // Catch:{ IOException -> 0x015d, all -> 0x0159 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x015d, all -> 0x0159 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x015d, all -> 0x0159 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015e }
            r5.<init>()     // Catch:{ IOException -> 0x015e }
            r5.append(r2)     // Catch:{ IOException -> 0x015e }
            java.lang.String r6 = "&cd="
            r5.append(r6)     // Catch:{ IOException -> 0x015e }
            java.lang.Object r6 = r3.getKey()     // Catch:{ IOException -> 0x015e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x015e }
            java.lang.String r7 = "UTF-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r7)     // Catch:{ IOException -> 0x015e }
            r5.append(r6)     // Catch:{ IOException -> 0x015e }
            java.lang.String r6 = "&av="
            r5.append(r6)     // Catch:{ IOException -> 0x015e }
            java.lang.Object r6 = r3.getValue()     // Catch:{ IOException -> 0x015e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x015e }
            java.lang.String r7 = "UTF-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r7)     // Catch:{ IOException -> 0x015e }
            r5.append(r6)     // Catch:{ IOException -> 0x015e }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x015e }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x015e }
            r6 = 3000(0xbb8, float:4.204E-42)
            r4.setConnectTimeout(r6)     // Catch:{ IOException -> 0x015e }
            r6 = 5000(0x1388, float:7.006E-42)
            r4.setReadTimeout(r6)     // Catch:{ IOException -> 0x015e }
            r6 = 1
            r4.setDoOutput(r6)     // Catch:{ IOException -> 0x015e }
            int r6 = r5.length     // Catch:{ IOException -> 0x015e }
            r4.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x015e }
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch:{ IOException -> 0x015e }
            r6.write(r5)     // Catch:{ IOException -> 0x015e }
            int r5 = r4.getResponseCode()     // Catch:{ IOException -> 0x015e }
            int r5 = r5 / 100
            r6 = 2
            if (r5 == r6) goto L_0x0156
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x015e }
            int r6 = r4.getResponseCode()     // Catch:{ IOException -> 0x015e }
            java.lang.String r7 = r4.getResponseMessage()     // Catch:{ IOException -> 0x015e }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x015e }
            int r8 = r8.length()     // Catch:{ IOException -> 0x015e }
            int r8 = r8 + 45
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x015e }
            int r9 = r9.length()     // Catch:{ IOException -> 0x015e }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015e }
            r9.<init>(r8)     // Catch:{ IOException -> 0x015e }
            java.lang.String r8 = "Analytics post: "
            r9.append(r8)     // Catch:{ IOException -> 0x015e }
            r9.append(r5)     // Catch:{ IOException -> 0x015e }
            java.lang.String r5 = " failed. code: "
            r9.append(r5)     // Catch:{ IOException -> 0x015e }
            r9.append(r6)     // Catch:{ IOException -> 0x015e }
            java.lang.String r5 = " - "
            r9.append(r5)     // Catch:{ IOException -> 0x015e }
            r9.append(r7)     // Catch:{ IOException -> 0x015e }
            r9.toString()     // Catch:{ IOException -> 0x015e }
        L_0x0156:
            if (r4 == 0) goto L_0x00a9
            goto L_0x0183
        L_0x0159:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L_0x0189
        L_0x015d:
            r4 = r0
        L_0x015e:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0188 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0188 }
            int r5 = r5.length()     // Catch:{ all -> 0x0188 }
            int r5 = r5 + 25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0188 }
            r6.<init>(r5)     // Catch:{ all -> 0x0188 }
            java.lang.String r5 = "Analytics post: "
            r6.append(r5)     // Catch:{ all -> 0x0188 }
            r6.append(r3)     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = " failed. "
            r6.append(r3)     // Catch:{ all -> 0x0188 }
            r6.toString()     // Catch:{ all -> 0x0188 }
            if (r4 == 0) goto L_0x00a9
        L_0x0183:
            r4.disconnect()
            goto L_0x00a9
        L_0x0188:
            r0 = move-exception
        L_0x0189:
            if (r4 == 0) goto L_0x018e
            r4.disconnect()
        L_0x018e:
            throw r0
        L_0x018f:
            return
        L_0x0190:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.tracker.AnalyticsBasedUsageTracker.sendUsages():void");
    }

    public void trackUsage(String str, String str2) {
        synchronized (this.usageTypeToVersion) {
            this.usageTypeToVersion.put(str, str2);
        }
    }

    public AnalyticsBasedUsageTracker(Builder builder) {
        this.usageTypeToVersion = new HashMap();
        this.trackingId = (String) Checks.checkNotNull(builder.trackingId);
        this.targetPackage = (String) Checks.checkNotNull(builder.targetPackage);
        this.analyticsURI = (URL) Checks.checkNotNull(builder.analyticsURI);
        this.apiLevel = (String) Checks.checkNotNull(builder.apiLevel);
        this.model = (String) Checks.checkNotNull(builder.model);
        this.screenResolution = (String) Checks.checkNotNull(builder.screenResolution);
        this.userId = (String) Checks.checkNotNull(builder.userId);
    }
}
