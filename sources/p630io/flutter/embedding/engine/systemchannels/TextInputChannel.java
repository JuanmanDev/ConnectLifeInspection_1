package p630io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavInflater;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9013f;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel */
public class TextInputChannel {
    @NonNull

    /* renamed from: a */
    public final C9017j f18536a;
    @Nullable

    /* renamed from: b */
    public C9429e f18537b;

    /* renamed from: c */
    public final C9017j.C9021c f18538c = new C9424a();

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        @NonNull
        public final String encodedName;

        /* access modifiers changed from: public */
        TextCapitalization(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(@NonNull String str) {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword");
        
        @NonNull
        public final String encodedName;

        /* access modifiers changed from: public */
        TextInputType(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(@NonNull String str) {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$a */
    public class C9424a implements C9017j.C9021c {
        public C9424a() {
        }

        public void onMethodCall(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            Bundle bundle;
            if (TextInputChannel.this.f18537b != null) {
                String str = iVar.f17687a;
                Object obj = iVar.f17688b;
                C8896b.m24032d("TextInputChannel", "Received '" + str + "' message.");
                char c = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        TextInputChannel.this.f18537b.show();
                        dVar.success((Object) null);
                        return;
                    case 1:
                        TextInputChannel.this.f18537b.mo46637a();
                        dVar.success((Object) null);
                        return;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.f18537b.mo46638b(jSONArray.getInt(0), C9425b.m25505a(jSONArray.getJSONObject(1)));
                            dVar.success((Object) null);
                            return;
                        } catch (NoSuchFieldException | JSONException e) {
                            dVar.error("error", e.getMessage(), (Object) null);
                            return;
                        }
                    case 3:
                        TextInputChannel.this.f18537b.mo46642f();
                        dVar.success((Object) null);
                        return;
                    case 4:
                        TextInputChannel.this.f18537b.mo46645i(((Integer) obj).intValue());
                        return;
                    case 5:
                        try {
                            TextInputChannel.this.f18537b.mo46639c(C9428d.m25510a((JSONObject) obj));
                            dVar.success((Object) null);
                            return;
                        } catch (JSONException e2) {
                            dVar.error("error", e2.getMessage(), (Object) null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            double d = jSONObject.getDouble("width");
                            double d2 = jSONObject.getDouble("height");
                            JSONArray jSONArray2 = jSONObject.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i = 0; i < 16; i++) {
                                dArr[i] = jSONArray2.getDouble(i);
                            }
                            TextInputChannel.this.f18537b.mo46641e(d, d2, dArr);
                            return;
                        } catch (JSONException e3) {
                            dVar.error("error", e3.getMessage(), (Object) null);
                            return;
                        }
                    case 7:
                        TextInputChannel.this.f18537b.mo46644h();
                        dVar.success((Object) null);
                        return;
                    case 8:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString(NavInflater.TAG_ACTION);
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.f18537b.mo46640d(string, bundle);
                            dVar.success((Object) null);
                            return;
                        } catch (JSONException e4) {
                            dVar.error("error", e4.getMessage(), (Object) null);
                            return;
                        }
                    case 9:
                        TextInputChannel.this.f18537b.mo46643g(((Boolean) obj).booleanValue());
                        dVar.success((Object) null);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$b */
    public static class C9425b {

        /* renamed from: a */
        public final boolean f18540a;

        /* renamed from: b */
        public final boolean f18541b;

        /* renamed from: c */
        public final boolean f18542c;
        @NonNull

        /* renamed from: d */
        public final TextCapitalization f18543d;
        @NonNull

        /* renamed from: e */
        public final C9427c f18544e;
        @Nullable

        /* renamed from: f */
        public final Integer f18545f;
        @Nullable

        /* renamed from: g */
        public final String f18546g;
        @Nullable

        /* renamed from: h */
        public final C9426a f18547h;
        @Nullable

        /* renamed from: i */
        public final C9425b[] f18548i;

        /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$b$a */
        public static class C9426a {

            /* renamed from: a */
            public final String f18549a;

            /* renamed from: b */
            public final String[] f18550b;

            /* renamed from: c */
            public final C9428d f18551c;

            public C9426a(@NonNull String str, @NonNull String[] strArr, @NonNull C9428d dVar) {
                this.f18549a = str;
                this.f18550b = strArr;
                this.f18551c = dVar;
            }

            /* renamed from: a */
            public static C9426a m25507a(@NonNull JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = m25508b(jSONArray.getString(i));
                }
                return new C9426a(string, strArr, C9428d.m25510a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r0.equals("password") != false) goto L_0x01af;
             */
            @androidx.annotation.NonNull
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static java.lang.String m25508b(@androidx.annotation.NonNull java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01a4;
                        case -1917283616: goto L_0x0199;
                        case -1844815832: goto L_0x0190;
                        case -1825589953: goto L_0x0185;
                        case -1821235109: goto L_0x017c;
                        case -1757573738: goto L_0x0173;
                        case -1682373820: goto L_0x016a;
                        case -1658955742: goto L_0x015f;
                        case -1567118045: goto L_0x0154;
                        case -1476752575: goto L_0x014a;
                        case -1413737489: goto L_0x013e;
                        case -1377792129: goto L_0x0133;
                        case -1249512767: goto L_0x0129;
                        case -1186060294: goto L_0x011d;
                        case -1151034798: goto L_0x0113;
                        case -835992323: goto L_0x0107;
                        case -818219584: goto L_0x00fb;
                        case -747304516: goto L_0x00ef;
                        case -613980922: goto L_0x00e6;
                        case -613352043: goto L_0x00dc;
                        case -549230602: goto L_0x00d0;
                        case -265713450: goto L_0x00c6;
                        case 3373707: goto L_0x00ba;
                        case 96619420: goto L_0x00ae;
                        case 253202685: goto L_0x00a3;
                        case 588174851: goto L_0x0098;
                        case 798554127: goto L_0x008c;
                        case 892233837: goto L_0x0080;
                        case 991032982: goto L_0x0076;
                        case 1069376125: goto L_0x006b;
                        case 1216985755: goto L_0x0063;
                        case 1469046696: goto L_0x0057;
                        case 1662667945: goto L_0x004d;
                        case 1921869058: goto L_0x0041;
                        case 2011152728: goto L_0x0037;
                        case 2011773919: goto L_0x002c;
                        default: goto L_0x002a;
                    }
                L_0x002a:
                    goto L_0x01ae
                L_0x002c:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 3
                    goto L_0x01af
                L_0x0037:
                    boolean r2 = r0.equals(r4)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 30
                    goto L_0x01af
                L_0x0041:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 28
                    goto L_0x01af
                L_0x004d:
                    boolean r2 = r0.equals(r5)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 27
                    goto L_0x01af
                L_0x0057:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 17
                    goto L_0x01af
                L_0x0063:
                    boolean r3 = r0.equals(r6)
                    if (r3 == 0) goto L_0x01ae
                    goto L_0x01af
                L_0x006b:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 2
                    goto L_0x01af
                L_0x0076:
                    boolean r2 = r0.equals(r7)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 24
                    goto L_0x01af
                L_0x0080:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 31
                    goto L_0x01af
                L_0x008c:
                    java.lang.String r2 = "familyName"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 14
                    goto L_0x01af
                L_0x0098:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 4
                    goto L_0x01af
                L_0x00a3:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 1
                    goto L_0x01af
                L_0x00ae:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 13
                    goto L_0x01af
                L_0x00ba:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 20
                    goto L_0x01af
                L_0x00c6:
                    boolean r2 = r0.equals(r8)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 35
                    goto L_0x01af
                L_0x00d0:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 32
                    goto L_0x01af
                L_0x00dc:
                    boolean r2 = r0.equals(r9)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 10
                    goto L_0x01af
                L_0x00e6:
                    boolean r2 = r0.equals(r10)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 7
                    goto L_0x01af
                L_0x00ef:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 22
                    goto L_0x01af
                L_0x00fb:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 19
                    goto L_0x01af
                L_0x0107:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 21
                    goto L_0x01af
                L_0x0113:
                    boolean r2 = r0.equals(r11)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 11
                    goto L_0x01af
                L_0x011d:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 29
                    goto L_0x01af
                L_0x0129:
                    boolean r2 = r0.equals(r12)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 16
                    goto L_0x01af
                L_0x0133:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 0
                    goto L_0x01af
                L_0x013e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 18
                    goto L_0x01af
                L_0x014a:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 6
                    goto L_0x01af
                L_0x0154:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 33
                    goto L_0x01af
                L_0x015f:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 15
                    goto L_0x01af
                L_0x016a:
                    boolean r2 = r0.equals(r13)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 8
                    goto L_0x01af
                L_0x0173:
                    boolean r2 = r0.equals(r14)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 12
                    goto L_0x01af
                L_0x017c:
                    boolean r2 = r0.equals(r15)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 23
                    goto L_0x01af
                L_0x0185:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 34
                    goto L_0x01af
                L_0x0190:
                    boolean r2 = r0.equals(r1)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 9
                    goto L_0x01af
                L_0x0199:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 25
                    goto L_0x01af
                L_0x01a4:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L_0x01ae
                    r2 = 5
                    goto L_0x01af
                L_0x01ae:
                    r2 = -1
                L_0x01af:
                    switch(r2) {
                        case 0: goto L_0x0202;
                        case 1: goto L_0x01ff;
                        case 2: goto L_0x01fc;
                        case 3: goto L_0x01f9;
                        case 4: goto L_0x01f6;
                        case 5: goto L_0x01f3;
                        case 6: goto L_0x01f0;
                        case 7: goto L_0x01ef;
                        case 8: goto L_0x01ee;
                        case 9: goto L_0x01ed;
                        case 10: goto L_0x01ec;
                        case 11: goto L_0x01eb;
                        case 12: goto L_0x01ea;
                        case 13: goto L_0x01e7;
                        case 14: goto L_0x01e4;
                        case 15: goto L_0x01e1;
                        case 16: goto L_0x01e0;
                        case 17: goto L_0x01dd;
                        case 18: goto L_0x01da;
                        case 19: goto L_0x01d7;
                        case 20: goto L_0x01d4;
                        case 21: goto L_0x01d1;
                        case 22: goto L_0x01ce;
                        case 23: goto L_0x01cd;
                        case 24: goto L_0x01cc;
                        case 25: goto L_0x01c9;
                        case 26: goto L_0x01c8;
                        case 27: goto L_0x01c7;
                        case 28: goto L_0x01c4;
                        case 29: goto L_0x01c1;
                        case 30: goto L_0x01c0;
                        case 31: goto L_0x01bd;
                        case 32: goto L_0x01ba;
                        case 33: goto L_0x01b7;
                        case 34: goto L_0x01b4;
                        case 35: goto L_0x01b3;
                        default: goto L_0x01b2;
                    }
                L_0x01b2:
                    return r0
                L_0x01b3:
                    return r8
                L_0x01b4:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x01b7:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x01ba:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x01bd:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x01c0:
                    return r4
                L_0x01c1:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x01c4:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01c7:
                    return r5
                L_0x01c8:
                    return r6
                L_0x01c9:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x01cc:
                    return r7
                L_0x01cd:
                    return r15
                L_0x01ce:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x01d1:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x01d4:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x01d7:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x01da:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x01dd:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01e0:
                    return r12
                L_0x01e1:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x01e4:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x01e7:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x01ea:
                    return r14
                L_0x01eb:
                    return r11
                L_0x01ec:
                    return r9
                L_0x01ed:
                    return r1
                L_0x01ee:
                    return r13
                L_0x01ef:
                    return r10
                L_0x01f0:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x01f3:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                L_0x01f6:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x01f9:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01fc:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x01ff:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x0202:
                    java.lang.String r0 = "addressLocality"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.engine.systemchannels.TextInputChannel.C9425b.C9426a.m25508b(java.lang.String):java.lang.String");
            }
        }

        public C9425b(boolean z, boolean z2, boolean z3, @NonNull TextCapitalization textCapitalization, @NonNull C9427c cVar, @Nullable Integer num, @Nullable String str, @Nullable C9426a aVar, @Nullable C9425b[] bVarArr) {
            this.f18540a = z;
            this.f18541b = z2;
            this.f18542c = z3;
            this.f18543d = textCapitalization;
            this.f18544e = cVar;
            this.f18545f = num;
            this.f18546g = str;
            this.f18547h = aVar;
            this.f18548i = bVarArr;
        }

        /* renamed from: a */
        public static C9425b m25505a(@NonNull JSONObject jSONObject) {
            C9425b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                C9426a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    C9425b[] bVarArr2 = new C9425b[length];
                    for (int i = 0; i < length; i++) {
                        bVarArr2[i] = m25505a(jSONArray.getJSONObject(i));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b = m25506b(string);
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                TextCapitalization fromValue = TextCapitalization.fromValue(jSONObject2.getString("textCapitalization"));
                C9427c a = C9427c.m25509a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = C9426a.m25507a(jSONObject2.getJSONObject("autofill"));
                }
                return new C9425b(optBoolean, optBoolean2, optBoolean3, fromValue, a, b, string2, aVar, bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
            if (r11.equals("TextInputAction.newline") != false) goto L_0x0074;
         */
        @androidx.annotation.NonNull
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Integer m25506b(@androidx.annotation.NonNull java.lang.String r11) {
            /*
                int r0 = r11.hashCode()
                r1 = 7
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 6
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                switch(r0) {
                    case -810971940: goto L_0x0069;
                    case -737377923: goto L_0x005f;
                    case -737089298: goto L_0x0055;
                    case -737080013: goto L_0x004b;
                    case -736940669: goto L_0x0041;
                    case 469250275: goto L_0x0037;
                    case 1241689507: goto L_0x002d;
                    case 1539450297: goto L_0x0024;
                    case 2110497650: goto L_0x0019;
                    default: goto L_0x0017;
                }
            L_0x0017:
                goto L_0x0073
            L_0x0019:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = 8
                goto L_0x0074
            L_0x0024:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                goto L_0x0074
            L_0x002d:
                java.lang.String r0 = "TextInputAction.go"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r3
                goto L_0x0074
            L_0x0037:
                java.lang.String r0 = "TextInputAction.search"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r2
                goto L_0x0074
            L_0x0041:
                java.lang.String r0 = "TextInputAction.send"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r6
                goto L_0x0074
            L_0x004b:
                java.lang.String r0 = "TextInputAction.none"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r9
                goto L_0x0074
            L_0x0055:
                java.lang.String r0 = "TextInputAction.next"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r1
                goto L_0x0074
            L_0x005f:
                java.lang.String r0 = "TextInputAction.done"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r4
                goto L_0x0074
            L_0x0069:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r11 = r11.equals(r0)
                if (r11 == 0) goto L_0x0073
                r7 = r5
                goto L_0x0074
            L_0x0073:
                r7 = -1
            L_0x0074:
                switch(r7) {
                    case 0: goto L_0x0097;
                    case 1: goto L_0x0097;
                    case 2: goto L_0x0096;
                    case 3: goto L_0x0091;
                    case 4: goto L_0x008c;
                    case 5: goto L_0x0087;
                    case 6: goto L_0x0082;
                    case 7: goto L_0x007d;
                    case 8: goto L_0x0078;
                    default: goto L_0x0077;
                }
            L_0x0077:
                return r8
            L_0x0078:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
                return r11
            L_0x007d:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                return r11
            L_0x0082:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                return r11
            L_0x0087:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                return r11
            L_0x008c:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                return r11
            L_0x0091:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
                return r11
            L_0x0096:
                return r8
            L_0x0097:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.engine.systemchannels.TextInputChannel.C9425b.m25506b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$c */
    public static class C9427c {
        @NonNull

        /* renamed from: a */
        public final TextInputType f18552a;

        /* renamed from: b */
        public final boolean f18553b;

        /* renamed from: c */
        public final boolean f18554c;

        public C9427c(@NonNull TextInputType textInputType, boolean z, boolean z2) {
            this.f18552a = textInputType;
            this.f18553b = z;
            this.f18554c = z2;
        }

        @NonNull
        /* renamed from: a */
        public static C9427c m25509a(@NonNull JSONObject jSONObject) {
            return new C9427c(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$d */
    public static class C9428d {
        @NonNull

        /* renamed from: a */
        public final String f18555a;

        /* renamed from: b */
        public final int f18556b;

        /* renamed from: c */
        public final int f18557c;

        public C9428d(@NonNull String str, int i, int i2) {
            this.f18555a = str;
            this.f18556b = i;
            this.f18557c = i2;
        }

        /* renamed from: a */
        public static C9428d m25510a(@NonNull JSONObject jSONObject) {
            return new C9428d(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"));
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$e */
    public interface C9429e {
        /* renamed from: a */
        void mo46637a();

        /* renamed from: b */
        void mo46638b(int i, @NonNull C9425b bVar);

        /* renamed from: c */
        void mo46639c(@NonNull C9428d dVar);

        /* renamed from: d */
        void mo46640d(String str, Bundle bundle);

        /* renamed from: e */
        void mo46641e(double d, double d2, double[] dArr);

        /* renamed from: f */
        void mo46642f();

        /* renamed from: g */
        void mo46643g(boolean z);

        /* renamed from: h */
        void mo46644h();

        /* renamed from: i */
        void mo46645i(int i);

        void show();
    }

    public TextInputChannel(@NonNull C8928a aVar) {
        C9017j jVar = new C9017j(aVar, "flutter/textinput", C9013f.f17686a);
        this.f18536a = jVar;
        jVar.mo46575e(this.f18538c);
    }

    /* renamed from: b */
    public static HashMap<Object, Object> m25491b(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    /* renamed from: c */
    public void mo47534c(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'done' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    /* renamed from: d */
    public void mo47535d(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'go' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    /* renamed from: e */
    public void mo47536e(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'newline' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    /* renamed from: f */
    public void mo47537f(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'next' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    /* renamed from: g */
    public void mo47538g(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put(NavInflater.TAG_ACTION, str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f18536a.mo46573c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    /* renamed from: h */
    public void mo47539h(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'previous' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    /* renamed from: i */
    public void mo47540i() {
        this.f18536a.mo46573c("TextInputClient.requestExistingInputState", (Object) null);
    }

    /* renamed from: j */
    public void mo47541j(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'search' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    /* renamed from: k */
    public void mo47542k(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'send' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    /* renamed from: l */
    public void mo47543l(@Nullable C9429e eVar) {
        this.f18537b = eVar;
    }

    /* renamed from: m */
    public void mo47544m(int i) {
        C8896b.m24032d("TextInputChannel", "Sending 'unspecified' message.");
        this.f18536a.mo46573c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    /* renamed from: n */
    public void mo47545n(int i, String str, int i2, int i3, int i4, int i5) {
        C8896b.m24032d("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        HashMap<Object, Object> b = m25491b(str, i2, i3, i4, i5);
        this.f18536a.mo46573c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), b}));
    }

    /* renamed from: o */
    public void mo47546o(int i, HashMap<String, C9428d> hashMap) {
        C8896b.m24032d("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            C9428d dVar = (C9428d) next.getValue();
            hashMap2.put(next.getKey(), m25491b(dVar.f18555a, dVar.f18556b, dVar.f18557c, -1, -1));
        }
        this.f18536a.mo46573c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }
}
