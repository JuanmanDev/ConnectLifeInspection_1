package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

public final class MailTo {
    public static final String BCC = "bcc";
    public static final String BODY = "body";

    /* renamed from: CC */
    public static final String f232CC = "cc";
    public static final String MAILTO = "mailto";
    public static final String MAILTO_SCHEME = "mailto:";
    public static final String SUBJECT = "subject";

    /* renamed from: TO */
    public static final String f233TO = "to";
    public HashMap<String, String> mHeaders = new HashMap<>();

    public static boolean isMailTo(@Nullable String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    @NonNull
    public static MailTo parse(@NonNull String str) {
        String str2;
        String str3;
        Preconditions.checkNotNull(str);
        if (isMailTo(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                str3 = Uri.decode(str.substring(7));
                str2 = null;
            } else {
                str3 = Uri.decode(str.substring(7, indexOf2));
                str2 = str.substring(indexOf2 + 1);
            }
            MailTo mailTo = new MailTo();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR, 2);
                    if (split2.length != 0) {
                        mailTo.mHeaders.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String to = mailTo.getTo();
            if (to != null) {
                str3 = str3 + ", " + to;
            }
            mailTo.mHeaders.put(f233TO, str3);
            return mailTo;
        }
        throw new ParseException("Not a mailto scheme");
    }

    @Nullable
    public String getBcc() {
        return this.mHeaders.get(BCC);
    }

    @Nullable
    public String getBody() {
        return this.mHeaders.get(BODY);
    }

    @Nullable
    public String getCc() {
        return this.mHeaders.get(f232CC);
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    @Nullable
    public String getSubject() {
        return this.mHeaders.get(SUBJECT);
    }

    @Nullable
    public String getTo() {
        return this.mHeaders.get(f233TO);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(MAILTO_SCHEME);
        sb.append('?');
        for (Map.Entry next : this.mHeaders.entrySet()) {
            sb.append(Uri.encode((String) next.getKey()));
            sb.append('=');
            sb.append(Uri.encode((String) next.getValue()));
            sb.append(Typography.amp);
        }
        return sb.toString();
    }

    public static boolean isMailTo(@Nullable Uri uri) {
        return uri != null && MAILTO.equals(uri.getScheme());
    }

    @NonNull
    public static MailTo parse(@NonNull Uri uri) {
        return parse(uri.toString());
    }
}
