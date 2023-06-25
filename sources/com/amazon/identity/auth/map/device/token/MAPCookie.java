package com.amazon.identity.auth.map.device.token;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import p040c.p048b.p049a.p050a.p068b.p069a.p070b.C1484b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class MAPCookie implements C1484b, Serializable {
    public static final String COOKIE_ATTRIBUTE_SEPERATOR = ";";
    public static final String COOKIE_DATE_FORMAT = "dd MMM yyyy kk:mm:ss z";
    public static final String COOKIE_NAME_VALUE_SEPERATOR = "=";
    public static final String DOMAIN_PREFIX = "www";
    public static final String DOT = ".";
    public static final String EMPTY_COOKIE = "";
    public static final String GMT = "GMT";
    public static final String KEY_COMMENT = "Comment";
    public static final String KEY_COMMENT_URL = "CommentUrl";
    public static final String KEY_DIRECTED_ID = "DirectedId";
    public static final String KEY_DOMAIN = "Domain";
    public static final String KEY_EXPIRES = "Expires";
    public static final String KEY_HTTP_ONLY = "HttpOnly";
    public static final String KEY_NAME = "Name";
    public static final String KEY_PATH = "Path";
    public static final String KEY_PERSISTANT = "Persistant";
    public static final String KEY_SECURE = "Secure";
    public static final String KEY_VALUE = "Value";
    public static final String KEY_VERSION = "Version";
    public static final String LOG_TAG = MAPCookie.class.getName();
    public static final int NO_VERSION = -1;
    public static final long serialVersionUID = 551200964665L;
    public final Map<String, String> _cookieData;
    public final transient Time _localCreationTimestamp = new Time();
    public int[] _ports;

    public MAPCookie(String str, String str2, String str3, String str4, boolean z) {
        HashMap hashMap = new HashMap();
        this._cookieData = hashMap;
        hashMap.put(KEY_NAME, str);
        this._cookieData.put(KEY_VALUE, str2);
        this._cookieData.put(KEY_DIRECTED_ID, str4);
        this._cookieData.put(KEY_DOMAIN, str3);
        setSecure(z);
        logCookie();
    }

    public static void clearCookieInCookieManager(Context context, MAPCookie mAPCookie, String str, String str2) {
        CookieSyncManager cookieSyncManager;
        try {
            cookieSyncManager = CookieSyncManager.getInstance();
        } catch (IllegalStateException unused) {
            C1485a.m832e(LOG_TAG, "CookieSyncManager not yet created... creating");
            CookieSyncManager.createInstance(context);
            cookieSyncManager = CookieSyncManager.getInstance();
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        cookieSyncManager.sync();
        instance.setCookie(str, getClearSetCookieHeader(mAPCookie));
        cookieSyncManager.sync();
    }

    public static String[] extractCookieStringArray(List<MAPCookie> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MAPCookie setCookieHeader : list) {
            arrayList.add(getSetCookieHeader(setCookieHeader));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(COOKIE_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(GMT));
        return simpleDateFormat.format(date);
    }

    public static final String getClearSetCookieHeader(MAPCookie mAPCookie) {
        StringBuilder sb = new StringBuilder(mAPCookie.getName().trim());
        sb.append(COOKIE_NAME_VALUE_SEPERATOR);
        sb.append("");
        sb.append("; path=/");
        sb.append("; domain=" + mAPCookie.getDomain().trim());
        if (mAPCookie.isSecure()) {
            sb.append("; secure");
        }
        Date expiryDate = mAPCookie.getExpiryDate();
        if (expiryDate != null) {
            sb.append("; expires=");
            if (expiryDate.before(Calendar.getInstance().getTime())) {
                String str = LOG_TAG;
                C1485a.m832e(str, "Cookie " + mAPCookie.getName() + " expired : " + expiryDate);
            }
            sb.append(formatDate(expiryDate));
        }
        return sb.toString();
    }

    public static Date getCookieExpireDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(COOKIE_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(GMT));
        return simpleDateFormat.parse(str);
    }

    public static List<MAPCookie> getCookiesFromCookieManager(Context context, String str, String str2) {
        String cookiesStringFromCookieManager = getCookiesStringFromCookieManager(context, str);
        C1485a.m836i(LOG_TAG, "Extracting cookie list for domain=" + str, "directedId=" + str2);
        ArrayList arrayList = new ArrayList();
        if (cookiesStringFromCookieManager != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(cookiesStringFromCookieManager, COOKIE_ATTRIBUTE_SEPERATOR);
            while (stringTokenizer.hasMoreTokens()) {
                StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken().trim(), COOKIE_NAME_VALUE_SEPERATOR);
                if (stringTokenizer2.hasMoreTokens()) {
                    arrayList.add(new MAPCookie(stringTokenizer2.nextToken(), stringTokenizer2.hasMoreTokens() ? stringTokenizer2.nextToken() : "", str, str2, false));
                }
            }
        } else {
            C1485a.m832e(LOG_TAG, "No cookies in Cookie manager for " + str);
        }
        return arrayList;
    }

    public static String getCookiesStringFromCookieManager(Context context, String str) {
        CookieSyncManager cookieSyncManager;
        try {
            cookieSyncManager = CookieSyncManager.getInstance();
        } catch (IllegalStateException unused) {
            C1485a.m832e(LOG_TAG, "CookieSyncManager not yet created... creating");
            CookieSyncManager.createInstance(context);
            cookieSyncManager = CookieSyncManager.getInstance();
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        cookieSyncManager.sync();
        if (str.startsWith(DOT)) {
            str = DOMAIN_PREFIX + str;
        }
        String cookie = instance.getCookie(str);
        C1485a.m832e(LOG_TAG, "Extracting cookies from CookieManager for domain=" + str);
        return cookie;
    }

    public static final String getSetCookieHeader(MAPCookie mAPCookie) {
        StringBuilder sb = new StringBuilder(mAPCookie.getName().trim());
        sb.append(COOKIE_NAME_VALUE_SEPERATOR);
        sb.append(mAPCookie.getValue().trim());
        sb.append("; path=/");
        sb.append("; domain=" + mAPCookie.getDomain().trim());
        if (mAPCookie.isSecure()) {
            sb.append("; secure");
        }
        Date expiryDate = mAPCookie.getExpiryDate();
        if (expiryDate != null) {
            sb.append("; expires=");
            if (expiryDate.before(Calendar.getInstance().getTime())) {
                String str = LOG_TAG;
                C1485a.m832e(str, "Cookie " + mAPCookie.getName() + " expired : " + expiryDate);
            }
            sb.append(formatDate(expiryDate));
        }
        return sb.toString();
    }

    private void logCookie() {
        C1485a.m836i(LOG_TAG, "Creating Cookie from data. name=" + getName(), "domain:" + getDomain() + " directedId:" + getDirectedId() + " cookie:" + getValue());
    }

    public String getAttribute(String str) {
        return this._cookieData.get(str);
    }

    public String getComment() {
        return getAttribute(KEY_COMMENT);
    }

    public String getCommentURL() {
        return getAttribute(KEY_COMMENT_URL);
    }

    public Map<String, String> getData() {
        return this._cookieData;
    }

    public String getDirectedId() {
        return getAttribute(KEY_DIRECTED_ID);
    }

    public String getDomain() {
        return getAttribute(KEY_DOMAIN);
    }

    public Date getExpiryDate() {
        String attribute = getAttribute(KEY_EXPIRES);
        if (attribute != null) {
            try {
                return getCookieExpireDate(attribute);
            } catch (ParseException e) {
                C1485a.m830c(LOG_TAG, "Date parse error on MAP Cookie", e);
            }
        }
        return null;
    }

    public Time getLocalTimestamp() {
        return this._localCreationTimestamp;
    }

    public String getName() {
        return getAttribute(KEY_NAME);
    }

    public String getPath() {
        return getAttribute(KEY_PATH);
    }

    public int[] getPorts() {
        return this._ports;
    }

    public String getType() {
        return getName();
    }

    public String getValue() {
        return getAttribute(KEY_VALUE);
    }

    public int getVersion() {
        if (TextUtils.isEmpty(getAttribute(KEY_VERSION))) {
            return -1;
        }
        return Integer.parseInt(getAttribute(KEY_VERSION));
    }

    public boolean hasExpired() {
        return isExpired(Calendar.getInstance().getTime());
    }

    public boolean isExpired(Date date) {
        if (getExpiryDate() == null) {
            return false;
        }
        if (date == null) {
            date = Calendar.getInstance().getTime();
        }
        return getExpiryDate().before(date);
    }

    public boolean isHttpOnly() {
        String attribute = getAttribute(KEY_HTTP_ONLY);
        if (TextUtils.isEmpty(attribute)) {
            return false;
        }
        return Boolean.parseBoolean(attribute);
    }

    public boolean isPersistent() {
        return Boolean.parseBoolean(getAttribute(KEY_PERSISTANT));
    }

    public boolean isSecure() {
        return Boolean.parseBoolean(getAttribute(KEY_SECURE));
    }

    public String setAttribute(String str, String str2) {
        return this._cookieData.put(str, str2);
    }

    public void setExpiryDate(String str) {
        setAttribute(KEY_EXPIRES, str);
    }

    public void setHttpOnly(boolean z) {
        this._cookieData.put(KEY_HTTP_ONLY, Boolean.toString(z));
    }

    public void setPath(String str) {
        setAttribute(KEY_PATH, str);
    }

    public void setPorts(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        this._ports = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public void setSecure(boolean z) {
        setAttribute(KEY_SECURE, Boolean.toString(z));
    }

    public MAPCookie(Map<String, String> map) {
        this._cookieData = map;
        logCookie();
    }
}
