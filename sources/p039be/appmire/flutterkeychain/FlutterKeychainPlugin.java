package p039be.appmire.flutterkeychain;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0006J\f\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006¨\u0006\r"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/FlutterKeychainPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "()V", "onMethodCall", "", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "key", "", "value", "Companion", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: be.appmire.flutterkeychain.FlutterKeychainPlugin */
/* compiled from: FlutterKeychainPlugin.kt */
public final class FlutterKeychainPlugin implements C9017j.C9021c {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static StringEncryptor encryptor;
    public static SharedPreferences preferences;

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo47991d2 = {"Lbe/appmire/flutterkeychain/FlutterKeychainPlugin$Companion;", "", "()V", "encryptor", "Lbe/appmire/flutterkeychain/StringEncryptor;", "preferences", "Landroid/content/SharedPreferences;", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "flutter_keychain_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* renamed from: be.appmire.flutterkeychain.FlutterKeychainPlugin$Companion */
    /* compiled from: FlutterKeychainPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            try {
                SharedPreferences sharedPreferences = cVar.mo46298c().getSharedPreferences("FlutterKeychain", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "registrar.context().getS…n\", Context.MODE_PRIVATE)");
                FlutterKeychainPlugin.preferences = sharedPreferences;
                SharedPreferences access$getPreferences$cp = FlutterKeychainPlugin.preferences;
                if (access$getPreferences$cp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preferences");
                    access$getPreferences$cp = null;
                }
                Context c = cVar.mo46298c();
                Intrinsics.checkNotNullExpressionValue(c, "registrar.context()");
                FlutterKeychainPlugin.encryptor = new AesStringEncryptor(access$getPreferences$cp, new RsaKeyStoreKeyWrapper(c));
                new C9017j(cVar.mo46301f(), "plugin.appmire.be/flutter_keychain").mo46575e(new FlutterKeychainPlugin());
            } catch (Exception unused) {
            }
        }
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    @Nullable
    public final String key(@NotNull C9016i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return (String) iVar.mo46571a(Person.KEY_KEY);
    }

    public void onMethodCall(@NotNull C9016i iVar, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        try {
            String str = iVar.f17687a;
            if (str != null) {
                StringEncryptor stringEncryptor = null;
                switch (str.hashCode()) {
                    case -934610812:
                        if (!str.equals("remove")) {
                            break;
                        } else {
                            SharedPreferences sharedPreferences = preferences;
                            if (sharedPreferences == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                                sharedPreferences = null;
                            }
                            sharedPreferences.edit().remove(key(iVar)).commit();
                            dVar.success((Object) null);
                            return;
                        }
                    case 102230:
                        if (!str.equals("get")) {
                            break;
                        } else {
                            SharedPreferences sharedPreferences2 = preferences;
                            if (sharedPreferences2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                                sharedPreferences2 = null;
                            }
                            String string = sharedPreferences2.getString(key(iVar), (String) null);
                            StringEncryptor stringEncryptor2 = encryptor;
                            if (stringEncryptor2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("encryptor");
                            } else {
                                stringEncryptor = stringEncryptor2;
                            }
                            dVar.success(stringEncryptor.decrypt(string));
                            return;
                        }
                    case 111375:
                        if (!str.equals("put")) {
                            break;
                        } else {
                            StringEncryptor stringEncryptor3 = encryptor;
                            if (stringEncryptor3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("encryptor");
                                stringEncryptor3 = null;
                            }
                            String encrypt = stringEncryptor3.encrypt(value(iVar));
                            SharedPreferences sharedPreferences3 = preferences;
                            if (sharedPreferences3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                                sharedPreferences3 = null;
                            }
                            sharedPreferences3.edit().putString(key(iVar), encrypt).commit();
                            dVar.success((Object) null);
                            return;
                        }
                    case 94746189:
                        if (!str.equals("clear")) {
                            break;
                        } else {
                            SharedPreferences sharedPreferences4 = preferences;
                            if (sharedPreferences4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                                sharedPreferences4 = null;
                            }
                            sharedPreferences4.edit().clear().commit();
                            dVar.success((Object) null);
                            return;
                        }
                }
            }
            dVar.notImplemented();
        } catch (Exception e) {
            e.getMessage();
            dVar.error("flutter_keychain", e.getMessage(), e);
        }
    }

    @Nullable
    public final String value(@NotNull C9016i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return (String) iVar.mo46571a("value");
    }
}
