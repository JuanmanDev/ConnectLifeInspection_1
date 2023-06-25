package com.hisense.connect_life.hismart.networks.parameters;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.app.Person;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.HiSystemSetting;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/RsaSignUtil;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RsaSignUtil.kt */
public final class RsaSignUtil {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String SALT = "D9519A4B756946F081B7BB5B5E8D1197";

    @Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/RsaSignUtil$Companion;", "", "()V", "SALT", "", "appendParam", "", "builder", "Ljava/lang/StringBuilder;", "key", "value", "preNeeded", "", "checkSignForServer", "signatureServerStr", "content", "getPublicKey", "", "obtainSign", "map", "", "rsaDecryptByPublicKey", "data", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: RsaSignUtil.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] getPublicKey() {
            Context context;
            HiSystemSetting hiSystemSetting = HiNetWorks.Companion.getInstance().getHiSystemSetting();
            AssetManager assetManager = null;
            if (!(hiSystemSetting == null || (context = hiSystemSetting.getContext()) == null)) {
                assetManager = context.getAssets();
            }
            if (assetManager == null) {
                return new byte[0];
            }
            InputStream open = assetManager.open("rsa_public_key.key");
            Intrinsics.checkNotNullExpressionValue(open, "am.open(\"rsa_public_key.key\")");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            for (int read = open.read(bArr); read != -1; read = open.read(bArr)) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "out.toByteArray()");
            return byteArray;
        }

        public final void appendParam(@NotNull StringBuilder sb, @NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(sb, "builder");
            Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
            Intrinsics.checkNotNullParameter(str2, "value");
            if (z) {
                sb.append("&");
            }
            sb.append(str);
            sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
            sb.append(str2);
        }

        public final boolean checkSignForServer(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "signatureServerStr");
            Intrinsics.checkNotNullParameter(str2, BrowserServiceFileProvider.CONTENT_SCHEME);
            String str3 = str2 + "D9519A4B756946F081B7BB5B5E8D1197";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            String encodeToString = Base64.encodeToString(Sha256Util.INSTANCE.string2Sha256ByteJava(str3), 1);
            byte[] decode = Base64.decode(str, 1);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signatureServerStr, Base64.NO_PADDING)");
            return !Intrinsics.areEqual((Object) encodeToString, (Object) Base64.encodeToString(rsaDecryptByPublicKey(decode), 1));
        }

        @NotNull
        public final String obtainSign(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            StringBuilder sb = new StringBuilder();
            SortedMap<String, String> sortedMap = MapsKt__MapsJVMKt.toSortedMap(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, String>> it = sortedMap.entrySet().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (!TextUtils.isEmpty((CharSequence) next.getValue()) && !TextUtils.equals((CharSequence) next.getValue(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    z = true;
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            SortedMap sortedMap2 = MapsKt__MapsJVMKt.toSortedMap(linkedHashMap);
            String str = (String) sortedMap2.firstKey();
            for (Map.Entry entry : sortedMap2.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (Intrinsics.areEqual((Object) str2, (Object) str)) {
                    Companion companion = RsaSignUtil.Companion;
                    Intrinsics.checkNotNullExpressionValue(str2, Person.KEY_KEY);
                    companion.appendParam(sb, str2, str3.toString(), false);
                } else {
                    Companion companion2 = RsaSignUtil.Companion;
                    Intrinsics.checkNotNullExpressionValue(str2, Person.KEY_KEY);
                    companion2.appendParam(sb, str2, str3.toString(), true);
                }
            }
            sb.append("D9519A4B756946F081B7BB5B5E8D1197");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            byte[] string2Sha256ByteJava = Sha256Util.INSTANCE.string2Sha256ByteJava(sb2);
            PublicKey publicKey = RsaEncryptUtils.INSTANCE.getPublicKey(getPublicKey());
            RsaEncryptUtils rsaEncryptUtils = RsaEncryptUtils.INSTANCE;
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            String encodeToString = Base64.encodeToString(rsaEncryptUtils.rsaEncryptByPublicKey(string2Sha256ByteJava, encoded), 1);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(paramRsa, Base64.NO_PADDING)");
            return encodeToString;
        }

        @NotNull
        public final byte[] rsaDecryptByPublicKey(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            byte[] encoded = RsaEncryptUtils.INSTANCE.getPublicKey(getPublicKey()).getEncoded();
            RsaEncryptUtils rsaEncryptUtils = RsaEncryptUtils.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey");
            return rsaEncryptUtils.rsaDecryptByPublicKey(bArr, encoded);
        }
    }
}
