package okhttp3.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\u0005¨\u0006\f"}, mo47991d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "method", "", "invalidatesCache", "(Ljava/lang/String;)Z", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: HttpMethod.kt */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    @JvmStatic
    public static final boolean permitsRequestBody(@NotNull String str) {
        return !Intrinsics.areEqual((Object) str, (Object) ShareTarget.METHOD_GET) && !Intrinsics.areEqual((Object) str, (Object) "HEAD");
    }

    @JvmStatic
    public static final boolean requiresRequestBody(@NotNull String str) {
        return Intrinsics.areEqual((Object) str, (Object) ShareTarget.METHOD_POST) || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PROPPATCH") || Intrinsics.areEqual((Object) str, (Object) "REPORT");
    }

    public final boolean invalidatesCache(@NotNull String str) {
        return Intrinsics.areEqual((Object) str, (Object) ShareTarget.METHOD_POST) || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "DELETE") || Intrinsics.areEqual((Object) str, (Object) "MOVE");
    }

    public final boolean redirectsToGet(@NotNull String str) {
        return !Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String str) {
        return Intrinsics.areEqual((Object) str, (Object) "PROPFIND");
    }
}
