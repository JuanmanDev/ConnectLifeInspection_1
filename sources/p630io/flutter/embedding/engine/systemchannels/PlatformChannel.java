package p630io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompatJellybean;
import androidx.core.view.ViewCompat;
import androidx.webkit.internal.AssetHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9013f;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel */
public class PlatformChannel {
    @NonNull

    /* renamed from: a */
    public final C9017j f18520a;
    @Nullable

    /* renamed from: b */
    public C9421d f18521b;
    @VisibleForTesting
    @NonNull

    /* renamed from: c */
    public final C9017j.C9021c f18522c = new C9418a();

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        
        @NonNull
        public String encodedName;

        /* access modifiers changed from: public */
        Brightness(@NonNull String str) {
            this.encodedName = str;
        }

        @NonNull
        public static Brightness fromValue(@NonNull String str) {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat */
    public enum ClipboardContentFormat {
        PLAIN_TEXT(AssetHelper.DEFAULT_MIME_TYPE);
        
        @NonNull
        public String encodedName;

        /* access modifiers changed from: public */
        ClipboardContentFormat(@NonNull String str) {
            this.encodedName = str;
        }

        @NonNull
        public static ClipboardContentFormat fromValue(@NonNull String str) {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        
        @NonNull
        public String encodedName;

        /* access modifiers changed from: public */
        DeviceOrientation(@NonNull String str) {
            this.encodedName = str;
        }

        @NonNull
        public static DeviceOrientation fromValue(@NonNull String str) {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType */
    public enum HapticFeedbackType {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        
        @Nullable
        public final String encodedName;

        /* access modifiers changed from: public */
        HapticFeedbackType(@Nullable String str) {
            this.encodedName = str;
        }

        @NonNull
        public static HapticFeedbackType fromValue(@Nullable String str) {
            String str2;
            for (HapticFeedbackType hapticFeedbackType : values()) {
                if ((hapticFeedbackType.encodedName == null && str == null) || ((str2 = hapticFeedbackType.encodedName) != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SoundType */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        
        @NonNull
        public final String encodedName;

        /* access modifiers changed from: public */
        SoundType(@NonNull String str) {
            this.encodedName = str;
        }

        @NonNull
        public static SoundType fromValue(@NonNull String str) {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        
        @NonNull
        public String encodedName;

        /* access modifiers changed from: public */
        SystemUiOverlay(@NonNull String str) {
            this.encodedName = str;
        }

        @NonNull
        public static SystemUiOverlay fromValue(@NonNull String str) {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$a */
    public class C9418a implements C9017j.C9021c {
        public C9418a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:51|52) */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            r7.error("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00e6 */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0107 A[Catch:{ JSONException -> 0x01f1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0114 A[Catch:{ JSONException -> 0x01f1 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(@androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9016i r6, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f17687a
                java.lang.Object r6 = r6.f17688b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                p553f.p554a.C8896b.m24032d(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x01f1 }
                switch(r4) {
                    case -766342101: goto L_0x009d;
                    case -720677196: goto L_0x0092;
                    case -548468504: goto L_0x0088;
                    case -247230243: goto L_0x007e;
                    case -215273374: goto L_0x0074;
                    case 241845679: goto L_0x006a;
                    case 875995648: goto L_0x005f;
                    case 1390477857: goto L_0x0055;
                    case 1514180520: goto L_0x004a;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x01f1 }
            L_0x0033:
                goto L_0x00a6
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 2
                goto L_0x00a6
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 4
                goto L_0x00a6
            L_0x004a:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 8
                goto L_0x00a6
            L_0x0055:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 6
                goto L_0x00a6
            L_0x005f:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 10
                goto L_0x00a6
            L_0x006a:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 5
                goto L_0x00a6
            L_0x0074:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 0
                goto L_0x00a6
            L_0x007e:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 1
                goto L_0x00a6
            L_0x0088:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 3
                goto L_0x00a6
            L_0x0092:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 9
                goto L_0x00a6
            L_0x009d:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x01f1 }
                if (r1 == 0) goto L_0x00a6
                r2 = 7
            L_0x00a6:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x01d5;
                    case 1: goto L_0x01b9;
                    case 2: goto L_0x0199;
                    case 3: goto L_0x0179;
                    case 4: goto L_0x0157;
                    case 5: goto L_0x0149;
                    case 6: goto L_0x0127;
                    case 7: goto L_0x0119;
                    case 8: goto L_0x00dd;
                    case 9: goto L_0x00c9;
                    case 10: goto L_0x00b0;
                    default: goto L_0x00ab;
                }
            L_0x00ab:
                r7.notImplemented()     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x00b0:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r6 = r6.f18521b     // Catch:{ JSONException -> 0x01f1 }
                boolean r6 = r6.mo46679j()     // Catch:{ JSONException -> 0x01f1 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f1 }
                r1.<init>()     // Catch:{ JSONException -> 0x01f1 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x01f1 }
                r7.success(r1)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x00c9:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01f1 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ JSONException -> 0x01f1 }
                r1.mo46672c(r6)     // Catch:{ JSONException -> 0x01f1 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x00dd:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x01f1 }
                if (r6 == 0) goto L_0x00fa
                io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x00e6 }
                goto L_0x00fb
            L_0x00e6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01f1 }
                r2.<init>()     // Catch:{ JSONException -> 0x01f1 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x01f1 }
                r2.append(r6)     // Catch:{ JSONException -> 0x01f1 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
            L_0x00fa:
                r6 = r3
            L_0x00fb:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r2 = r2.f18521b     // Catch:{ JSONException -> 0x01f1 }
                java.lang.CharSequence r6 = r2.mo46680k(r6)     // Catch:{ JSONException -> 0x01f1 }
                if (r6 == 0) goto L_0x0114
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f1 }
                r2.<init>()     // Catch:{ JSONException -> 0x01f1 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x01f1 }
                r7.success(r2)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0114:
                r7.success(r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0119:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r6 = r6.f18521b     // Catch:{ JSONException -> 0x01f1 }
                r6.mo46670a()     // Catch:{ JSONException -> 0x01f1 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0127:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$e r6 = r1.mo47526h(r6)     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                r1.mo46673d(r6)     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                r7.success(r3)     // Catch:{ JSONException -> 0x013f, NoSuchFieldException -> 0x013d }
                goto L_0x020a
            L_0x013d:
                r6 = move-exception
                goto L_0x0140
            L_0x013f:
                r6 = move-exception
            L_0x0140:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0149:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01f1 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r6 = r6.f18521b     // Catch:{ JSONException -> 0x01f1 }
                r6.mo46675f()     // Catch:{ JSONException -> 0x01f1 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0157:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                java.util.List r6 = r1.mo47527i(r6)     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                r1.mo46671b(r6)     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                r7.success(r3)     // Catch:{ JSONException -> 0x016f, NoSuchFieldException -> 0x016d }
                goto L_0x020a
            L_0x016d:
                r6 = move-exception
                goto L_0x0170
            L_0x016f:
                r6 = move-exception
            L_0x0170:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0179:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x018f }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x018f }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$c r6 = r1.mo47524f(r6)     // Catch:{ JSONException -> 0x018f }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x018f }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ JSONException -> 0x018f }
                r1.mo46677h(r6)     // Catch:{ JSONException -> 0x018f }
                r7.success(r3)     // Catch:{ JSONException -> 0x018f }
                goto L_0x020a
            L_0x018f:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x0199:
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                int r6 = r1.mo47525g(r6)     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                r1.mo46676g(r6)     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                r7.success(r3)     // Catch:{ JSONException -> 0x01b0, NoSuchFieldException -> 0x01ae }
                goto L_0x020a
            L_0x01ae:
                r6 = move-exception
                goto L_0x01b1
            L_0x01b0:
                r6 = move-exception
            L_0x01b1:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x01b9:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01cc }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x01cc }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ NoSuchFieldException -> 0x01cc }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ NoSuchFieldException -> 0x01cc }
                r1.mo46678i(r6)     // Catch:{ NoSuchFieldException -> 0x01cc }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x01cc }
                goto L_0x020a
            L_0x01cc:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x01d5:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01e8 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SoundType r6 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x01e8 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.this     // Catch:{ NoSuchFieldException -> 0x01e8 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$d r1 = r1.f18521b     // Catch:{ NoSuchFieldException -> 0x01e8 }
                r1.mo46674e(r6)     // Catch:{ NoSuchFieldException -> 0x01e8 }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x01e8 }
                goto L_0x020a
            L_0x01e8:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x01f1 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x01f1 }
                goto L_0x020a
            L_0x01f1:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.error(r0, r6, r3)
            L_0x020a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.engine.systemchannels.PlatformChannel.C9418a.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$b */
    public static /* synthetic */ class C9419b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18524a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f18525b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay[] r0 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18525b = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f18525b     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation[] r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f18524a = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r3 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f18524a     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r2 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f18524a     // Catch:{ NoSuchFieldError -> 0x0043 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f18524a     // Catch:{ NoSuchFieldError -> 0x004e }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r1 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.engine.systemchannels.PlatformChannel.C9419b.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$c */
    public static class C9420c {

        /* renamed from: a */
        public final int f18526a;
        @NonNull

        /* renamed from: b */
        public final String f18527b;

        public C9420c(int i, @NonNull String str) {
            this.f18526a = i;
            this.f18527b = str;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$d */
    public interface C9421d {
        /* renamed from: a */
        void mo46670a();

        /* renamed from: b */
        void mo46671b(@NonNull List<SystemUiOverlay> list);

        /* renamed from: c */
        void mo46672c(@NonNull String str);

        /* renamed from: d */
        void mo46673d(@NonNull C9422e eVar);

        /* renamed from: e */
        void mo46674e(@NonNull SoundType soundType);

        /* renamed from: f */
        void mo46675f();

        /* renamed from: g */
        void mo46676g(int i);

        /* renamed from: h */
        void mo46677h(@NonNull C9420c cVar);

        /* renamed from: i */
        void mo46678i(@NonNull HapticFeedbackType hapticFeedbackType);

        /* renamed from: j */
        boolean mo46679j();

        @Nullable
        /* renamed from: k */
        CharSequence mo46680k(@Nullable ClipboardContentFormat clipboardContentFormat);
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$e */
    public static class C9422e {
        @Nullable

        /* renamed from: a */
        public final Integer f18528a;
        @Nullable

        /* renamed from: b */
        public final Brightness f18529b;
        @Nullable

        /* renamed from: c */
        public final Integer f18530c;
        @Nullable

        /* renamed from: d */
        public final Brightness f18531d;
        @Nullable

        /* renamed from: e */
        public final Integer f18532e;

        public C9422e(@Nullable Integer num, @Nullable Brightness brightness, @Nullable Integer num2, @Nullable Brightness brightness2, @Nullable Integer num3) {
            this.f18528a = num;
            this.f18529b = brightness;
            this.f18530c = num2;
            this.f18531d = brightness2;
            this.f18532e = num3;
        }
    }

    public PlatformChannel(@NonNull C8928a aVar) {
        C9017j jVar = new C9017j(aVar, "flutter/platform", C9013f.f17686a);
        this.f18520a = jVar;
        jVar.mo46575e(this.f18522c);
    }

    @NonNull
    /* renamed from: f */
    public final C9420c mo47524f(@NonNull JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= ViewCompat.MEASURED_STATE_MASK;
        }
        return new C9420c(i, jSONObject.getString(NotificationCompatJellybean.KEY_LABEL));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47525g(@androidx.annotation.NonNull org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r4 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.fromValue(r4)
            int[] r8 = p630io.flutter.embedding.engine.systemchannels.PlatformChannel.C9419b.f18524a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.embedding.engine.systemchannels.PlatformChannel.mo47525g(org.json.JSONArray):int");
    }

    @NonNull
    /* renamed from: h */
    public final C9422e mo47526h(@NonNull JSONObject jSONObject) {
        Integer num = null;
        Brightness fromValue = !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        Brightness fromValue2 = !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null;
        Integer valueOf2 = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        }
        return new C9422e(valueOf2, fromValue2, valueOf, fromValue, num);
    }

    @NonNull
    /* renamed from: i */
    public final List<SystemUiOverlay> mo47527i(@NonNull JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = C9419b.f18525b[SystemUiOverlay.fromValue(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            } else if (i2 == 2) {
                arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public void mo47528j(@Nullable C9421d dVar) {
        this.f18521b = dVar;
    }
}
