package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \t:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0019\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\n"}, mo47991d2 = {"Lokhttp3/CipherSuite;", "", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "toString", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: CipherSuite.kt */
public final class CipherSuite {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Map<String, CipherSuite> INSTANCES = new LinkedHashMap();
    @NotNull
    public static final Comparator<String> ORDER_BY_NAME = new CipherSuite$Companion$ORDER_BY_NAME$1();
    @NotNull
    @JvmField
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256 = Companion.init("TLS_AES_128_CCM_8_SHA256", 4869);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_AES_128_CCM_SHA256 = Companion.init("TLS_AES_128_CCM_SHA256", 4868);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_AES_128_GCM_SHA256 = Companion.init("TLS_AES_128_GCM_SHA256", 4865);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_AES_256_GCM_SHA384 = Companion.init("TLS_AES_256_GCM_SHA384", 4866);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = Companion.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = Companion.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = Companion.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = Companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = Companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = Companion.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = Companion.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = Companion.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = Companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = Companion.init("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = Companion.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = Companion.init("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = Companion.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = Companion.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_FALLBACK_SCSV = Companion.init("TLS_FALLBACK_SCSV", 22016);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = Companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = Companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = Companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = Companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = Companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = Companion.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = Companion.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = Companion.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = Companion.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = Companion.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = Companion.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = Companion.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = Companion.init("TLS_PSK_WITH_RC4_128_SHA", 138);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = Companion.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = Companion.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = Companion.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = Companion.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = Companion.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = Companion.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = Companion.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = Companion.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = Companion.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = Companion.init("SSL_RSA_WITH_NULL_MD5", 1);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = Companion.init("SSL_RSA_WITH_NULL_SHA", 2);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = Companion.init("TLS_RSA_WITH_NULL_SHA256", 59);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = Companion.init("SSL_RSA_WITH_RC4_128_MD5", 4);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = Companion.init("SSL_RSA_WITH_RC4_128_SHA", 5);
    @NotNull
    @JvmField
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = Companion.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    @NotNull
    public final String javaName;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0003\u0018\u0000B\u000b\b\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR,\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0016\u0010 \u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0016\u0010!\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010\"\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0016\u0010#\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010$\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0016\u0010%\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0016\u0010&\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010'\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0016\u0010(\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0016\u0010)\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0016R\u0016\u0010*\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0016\u0010+\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0016R\u0016\u0010,\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0016\u0010-\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0016R\u0016\u0010.\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0016R\u0016\u0010/\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0016R\u0016\u00100\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0016R\u0016\u00101\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0016R\u0016\u00102\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0016R\u0016\u00103\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0016R\u0016\u00104\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0016R\u0016\u00105\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0016R\u0016\u00106\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0016R\u0016\u00107\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0016R\u0016\u00109\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0016R\u0016\u0010:\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0016R\u0016\u0010;\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0016R\u0016\u0010<\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0016R\u0016\u0010=\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0016R\u0016\u0010>\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0016R\u0016\u0010?\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0016R\u0016\u0010@\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0016R\u0016\u0010A\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0016R\u0016\u0010B\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0016R\u0016\u0010C\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0016R\u0016\u0010D\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0016R\u0016\u0010E\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0016R\u0016\u0010F\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0016R\u0016\u0010G\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0016R\u0016\u0010H\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0016R\u0016\u0010I\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0016R\u0016\u0010J\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0016R\u0016\u0010K\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0016R\u0016\u0010L\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0016R\u0016\u0010M\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0016R\u0016\u0010N\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0016R\u0016\u0010O\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0016R\u0016\u0010P\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0016R\u0016\u0010Q\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0016R\u0016\u0010R\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0016R\u0016\u0010S\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0016R\u0016\u0010T\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0016R\u0016\u0010U\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0016R\u0016\u0010V\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0016R\u0016\u0010W\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0016R\u0016\u0010X\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0016R\u0016\u0010Y\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0016R\u0016\u0010Z\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0016R\u0016\u0010[\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0016R\u0016\u0010\\\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0016R\u0016\u0010]\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0016R\u0016\u0010^\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0016R\u0016\u0010_\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0016R\u0016\u0010`\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0016R\u0016\u0010a\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0016R\u0016\u0010b\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0016R\u0016\u0010c\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0016R\u0016\u0010d\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0016R\u0016\u0010e\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\be\u0010\u0016R\u0016\u0010f\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0016R\u0016\u0010g\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0016R\u0016\u0010h\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0016R\u0016\u0010i\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0016R\u0016\u0010j\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0016R\u0016\u0010k\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0016R\u0016\u0010l\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0016R\u0016\u0010m\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0016R\u0016\u0010n\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0016R\u0016\u0010o\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0016R\u0016\u0010p\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0016R\u0016\u0010q\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0016R\u0016\u0010r\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\br\u0010\u0016R\u0016\u0010s\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0016R\u0016\u0010t\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0016R\u0016\u0010u\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0016R\u0016\u0010v\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0016R\u0016\u0010w\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0016R\u0016\u0010x\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0016R\u0016\u0010y\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\by\u0010\u0016R\u0016\u0010z\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0016R\u0016\u0010{\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0016R\u0016\u0010|\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0016R\u0016\u0010}\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0016R\u0016\u0010~\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0016R\u0016\u0010\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016R\u0018\u0010\u0001\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010\u0016¨\u0006\u0001"}, mo47991d2 = {"Lokhttp3/CipherSuite$Companion;", "", "javaName", "Lokhttp3/CipherSuite;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/CipherSuite;", "", "value", "init", "(Ljava/lang/String;I)Lokhttp3/CipherSuite;", "secondaryName", "(Ljava/lang/String;)Ljava/lang/String;", "", "INSTANCES", "Ljava/util/Map;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "getORDER_BY_NAME$okhttp", "()Ljava/util/Comparator;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/CipherSuite;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "<init>", "()V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: CipherSuite.kt */
    public static final class Companion {
        public Companion() {
        }

        /* access modifiers changed from: private */
        public final CipherSuite init(String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, (DefaultConstructorMarker) null);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        private final String secondaryName(String str) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                if (str != null) {
                    String substring = str.substring(4);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    return sb.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (!StringsKt__StringsJVMKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                if (str != null) {
                    String substring2 = str.substring(4);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }

        @JvmStatic
        @NotNull
        public final synchronized CipherSuite forJavaName(@NotNull String str) {
            CipherSuite cipherSuite;
            cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(str);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(secondaryName(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str, (DefaultConstructorMarker) null);
                }
                CipherSuite.INSTANCES.put(str, cipherSuite);
            }
            return cipherSuite;
        }

        @NotNull
        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CipherSuite(String str) {
        this.javaName = str;
    }

    @JvmStatic
    @NotNull
    public static final synchronized CipherSuite forJavaName(@NotNull String str) {
        CipherSuite forJavaName;
        synchronized (CipherSuite.class) {
            forJavaName = Companion.forJavaName(str);
        }
        return forJavaName;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @JvmName(name = "-deprecated_javaName")
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m28877deprecated_javaName() {
        return this.javaName;
    }

    @NotNull
    @JvmName(name = "javaName")
    public final String javaName() {
        return this.javaName;
    }

    @NotNull
    public String toString() {
        return this.javaName;
    }

    public /* synthetic */ CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
