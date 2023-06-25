package p039be.appmire.flutterkeychain;

import java.security.Key;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/KeyWrapper;", "", "unwrap", "Ljava/security/Key;", "wrappedKey", "", "algorithm", "", "wrap", "key", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: be.appmire.flutterkeychain.KeyWrapper */
/* compiled from: FlutterKeychainPlugin.kt */
public interface KeyWrapper {
    @NotNull
    Key unwrap(@NotNull byte[] bArr, @NotNull String str);

    @NotNull
    byte[] wrap(@NotNull Key key);
}
