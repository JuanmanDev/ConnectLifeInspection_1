package p039be.appmire.flutterkeychain;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0006"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/StringEncryptor;", "", "decrypt", "", "input", "encrypt", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: be.appmire.flutterkeychain.StringEncryptor */
/* compiled from: FlutterKeychainPlugin.kt */
public interface StringEncryptor {
    @Nullable
    String decrypt(@Nullable String str);

    @Nullable
    String encrypt(@Nullable String str);
}
