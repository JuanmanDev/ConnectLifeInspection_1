package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import com.juconnect.vivino.global.UrlConstKt;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001a.p007c.p009b.C0007a;
import p001a.p007c.p009b.C0008b;
import p001a.p007c.p009b.C0009c;
import p001a.p007c.p009b.C0010d;
import p001a.p007c.p009b.C0011e;
import p001a.p007c.p009b.C0012f;
import p001a.p007c.p009b.C0013g;
import p001a.p007c.p009b.C0014h;
import p001a.p007c.p009b.C0015i;
import p001a.p007c.p009b.C0016j;
import p001a.p007c.p009b.C0017k;
import p001a.p007c.p009b.C0018l;
import p001a.p007c.p009b.C0019m;
import p001a.p007c.p009b.C0020n;
import p001a.p007c.p009b.C0021o;
import p001a.p007c.p009b.C0022p;
import p001a.p007c.p009b.C0023q;
import p001a.p007c.p009b.C0024r;
import p001a.p007c.p009b.C0025s;
import p001a.p007c.p009b.C0026t;
import p001a.p007c.p009b.C0029w;

public class IntentSanitizer {
    public static final String TAG = "IntentSanitizer";
    public boolean mAllowAnyComponent;
    public boolean mAllowClipDataText;
    public boolean mAllowIdentifier;
    public boolean mAllowSelector;
    public boolean mAllowSourceBounds;
    public Predicate<String> mAllowedActions;
    public Predicate<String> mAllowedCategories;
    public Predicate<ClipData> mAllowedClipData;
    public Predicate<Uri> mAllowedClipDataUri;
    public Predicate<ComponentName> mAllowedComponents;
    public Predicate<Uri> mAllowedData;
    public Map<String, Predicate<Object>> mAllowedExtras;
    public int mAllowedFlags;
    public Predicate<String> mAllowedPackages;
    public Predicate<String> mAllowedTypes;

    @RequiresApi(15)
    public static class Api15Impl {
        @DoNotInline
        public static Intent getSelector(Intent intent) {
            return intent.getSelector();
        }

        @DoNotInline
        public static void setSelector(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    @RequiresApi(16)
    public static class Api16Impl {

        @RequiresApi(31)
        public static class Api31Impl {
            @DoNotInline
            public static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
                if (item.getHtmlText() != null || item.getIntent() != null || item.getTextLinks() != null) {
                    consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
                }
            }
        }

        public static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() != null || item.getIntent() != null) {
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
        @androidx.annotation.DoNotInline
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void sanitizeClipData(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L_0x0007
                return
            L_0x0007:
                if (r9 == 0) goto L_0x0014
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L_0x0014
                r8.setClipData(r7)
                goto L_0x00de
            L_0x0014:
                r9 = 0
                r0 = 0
                r1 = r0
            L_0x0017:
                int r2 = r7.getItemCount()
                if (r9 >= r2) goto L_0x00d9
                android.content.ClipData$Item r2 = r7.getItemAt(r9)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L_0x002b
                androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl.checkOtherMembers(r9, r2, r12)
                goto L_0x002e
            L_0x002b:
                checkOtherMembers(r9, r2, r12)
            L_0x002e:
                if (r10 == 0) goto L_0x0035
                java.lang.CharSequence r3 = r2.getText()
                goto L_0x005c
            L_0x0035:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L_0x005b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r9)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L_0x005b:
                r3 = r0
            L_0x005c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L_0x0085
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L_0x00b2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r9)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto L_0x00b2
            L_0x0085:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto L_0x00b4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L_0x0096
                goto L_0x00b4
            L_0x0096:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r9)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            L_0x00b2:
                r2 = r0
                goto L_0x00b8
            L_0x00b4:
                android.net.Uri r2 = r2.getUri()
            L_0x00b8:
                if (r3 != 0) goto L_0x00bc
                if (r2 == 0) goto L_0x00d5
            L_0x00bc:
                if (r1 != 0) goto L_0x00cd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r0, r2)
                r1.<init>(r4, r5)
                goto L_0x00d5
            L_0x00cd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r0, r2)
                r1.addItem(r4)
            L_0x00d5:
                int r9 = r9 + 1
                goto L_0x0017
            L_0x00d9:
                if (r1 == 0) goto L_0x00de
                r8.setClipData(r1)
            L_0x00de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.Api16Impl.sanitizeClipData(android.content.Intent, android.content.Intent, androidx.core.util.Predicate, boolean, androidx.core.util.Predicate, androidx.core.util.Consumer):void");
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static String getIdentifier(Intent intent) {
            return intent.getIdentifier();
        }

        @DoNotInline
        public static Intent setIdentifier(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    public static final class Builder {
        public static final int HISTORY_STACK_FLAGS = 2112614400;
        public static final int RECEIVER_FLAGS = 2015363072;
        public boolean mAllowAnyComponent;
        public boolean mAllowClipDataText = false;
        public boolean mAllowIdentifier;
        public boolean mAllowSelector;
        public boolean mAllowSomeComponents;
        public boolean mAllowSourceBounds;
        public Predicate<String> mAllowedActions = C0018l.f21a;
        public Predicate<String> mAllowedCategories = C0014h.f17a;
        public Predicate<ClipData> mAllowedClipData = C0022p.f25a;
        public Predicate<Uri> mAllowedClipDataUri = C0015i.f18a;
        public Predicate<ComponentName> mAllowedComponents = C0013g.f16a;
        public Predicate<Uri> mAllowedData = C0021o.f24a;
        public Map<String, Predicate<Object>> mAllowedExtras = new HashMap();
        public int mAllowedFlags;
        public Predicate<String> mAllowedPackages = C0017k.f20a;
        public Predicate<String> mAllowedTypes = C0019m.f22a;

        /* renamed from: a */
        public static /* synthetic */ boolean m21a(ComponentName componentName) {
            return true;
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m25e(Object obj) {
            return true;
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m26f(Class cls, Predicate predicate, Object obj) {
            return cls.isInstance(obj) && predicate.test(cls.cast(obj));
        }

        /* renamed from: g */
        public static /* synthetic */ boolean m27g(Object obj) {
            return false;
        }

        /* renamed from: j */
        public static /* synthetic */ boolean m30j(String str) {
            return false;
        }

        /* renamed from: k */
        public static /* synthetic */ boolean m31k(Uri uri) {
            return false;
        }

        /* renamed from: l */
        public static /* synthetic */ boolean m32l(String str) {
            return false;
        }

        /* renamed from: m */
        public static /* synthetic */ boolean m33m(String str) {
            return false;
        }

        /* renamed from: n */
        public static /* synthetic */ boolean m34n(String str) {
            return false;
        }

        /* renamed from: o */
        public static /* synthetic */ boolean m35o(ComponentName componentName) {
            return false;
        }

        /* renamed from: p */
        public static /* synthetic */ boolean m36p(Uri uri) {
            return false;
        }

        /* renamed from: q */
        public static /* synthetic */ boolean m37q(ClipData clipData) {
            return false;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAction(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction((Predicate<String>) new C0029w(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = C0024r.f27a;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowCategory(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory((Predicate<String>) new C0029w(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipData(@NonNull Predicate<ClipData> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipData = this.mAllowedClipData.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataUri(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataUriWithAuthority(@NonNull String str) {
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new C0009c(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponent(@NonNull ComponentName componentName) {
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent((Predicate<ComponentName>) new C0007a(componentName));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponentWithPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            return allowComponent((Predicate<ComponentName>) new C0020n(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowData(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedData = this.mAllowedData.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowDataWithAuthority(@NonNull String str) {
            Preconditions.checkNotNull(str);
            allowData(new C0010d(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, C0016j.f19a);
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraOutput(@NonNull String str) {
            allowExtra("output", Uri.class, new C0012f(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraStream(@NonNull Predicate<Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", Uri.class, predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraStreamUriWithAuthority(@NonNull String str) {
            Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new C0025s(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowFlags(int i) {
            this.mAllowedFlags = i | this.mAllowedFlags;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage((Predicate<String>) new C0029w(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowType(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType((Predicate<String>) new C0029w(str));
        }

        @SuppressLint({"SyntheticAccessor"})
        @NonNull
        public IntentSanitizer build() {
            if ((!this.mAllowAnyComponent || !this.mAllowSomeComponents) && (this.mAllowAnyComponent || this.mAllowSomeComponents)) {
                IntentSanitizer intentSanitizer = new IntentSanitizer();
                int unused = intentSanitizer.mAllowedFlags = this.mAllowedFlags;
                Predicate unused2 = intentSanitizer.mAllowedActions = this.mAllowedActions;
                Predicate unused3 = intentSanitizer.mAllowedData = this.mAllowedData;
                Predicate unused4 = intentSanitizer.mAllowedTypes = this.mAllowedTypes;
                Predicate unused5 = intentSanitizer.mAllowedCategories = this.mAllowedCategories;
                Predicate unused6 = intentSanitizer.mAllowedPackages = this.mAllowedPackages;
                boolean unused7 = intentSanitizer.mAllowAnyComponent = this.mAllowAnyComponent;
                Predicate unused8 = intentSanitizer.mAllowedComponents = this.mAllowedComponents;
                Map unused9 = intentSanitizer.mAllowedExtras = this.mAllowedExtras;
                boolean unused10 = intentSanitizer.mAllowClipDataText = this.mAllowClipDataText;
                Predicate unused11 = intentSanitizer.mAllowedClipDataUri = this.mAllowedClipDataUri;
                Predicate unused12 = intentSanitizer.mAllowedClipData = this.mAllowedClipData;
                boolean unused13 = intentSanitizer.mAllowIdentifier = this.mAllowIdentifier;
                boolean unused14 = intentSanitizer.mAllowSelector = this.mAllowSelector;
                boolean unused15 = intentSanitizer.mAllowSourceBounds = this.mAllowSourceBounds;
                return intentSanitizer;
            }
            throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public <T> Builder allowExtra(@NonNull String str, @NonNull Class<T> cls, @NonNull Predicate<T> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, (Predicate<Object>) new C0011e(cls, predicate));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraOutput(@NonNull Predicate<Uri> predicate) {
            allowExtra("output", Uri.class, predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAction(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedActions = this.mAllowedActions.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowCategory(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedCategories = this.mAllowedCategories.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponent(@NonNull Predicate<ComponentName> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowPackage(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedPackages = this.mAllowedPackages.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowType(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedTypes = this.mAllowedTypes.mo6739or(predicate);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtra(@NonNull String str, @NonNull Predicate<Object> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate predicate2 = this.mAllowedExtras.get(str);
            if (predicate2 == null) {
                predicate2 = C0023q.f26a;
            }
            this.mAllowedExtras.put(str, predicate2.mo6739or(predicate));
            return this;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m19a(String str) {
    }

    /* renamed from: b */
    public static /* synthetic */ void m20b(String str) {
        throw new SecurityException(str);
    }

    private void putExtra(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, (String) null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @NonNull
    public Intent sanitize(@NonNull Intent intent, @NonNull Consumer<String> consumer) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((!this.mAllowAnyComponent || component != null) && !this.mAllowedComponents.test(component)) {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName(UrlConstKt.APP_PLATFORM, "java.lang.Void"));
        } else {
            intent2.setComponent(component);
        }
        String str = intent.getPackage();
        if (str == null || this.mAllowedPackages.test(str)) {
            intent2.setPackage(str);
        } else {
            consumer.accept("Package is not allowed: " + str);
        }
        int flags = this.mAllowedFlags | intent.getFlags();
        int i = this.mAllowedFlags;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.mAllowedFlags)));
        }
        String action = intent.getAction();
        if (action == null || this.mAllowedActions.test(action)) {
            intent2.setAction(action);
        } else {
            consumer.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.mAllowedData.test(data)) {
            intent2.setData(data);
        } else {
            consumer.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.mAllowedTypes.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            consumer.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String next : categories) {
                if (this.mAllowedCategories.test(next)) {
                    intent2.addCategory(next);
                } else {
                    consumer.accept("Category is not allowed: " + next);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                if (str2.equals("android.intent.extra.STREAM") && (this.mAllowedFlags & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str2.equals("output") || ((~this.mAllowedFlags) & 3) == 0) {
                    Object obj = extras.get(str2);
                    Predicate predicate = this.mAllowedExtras.get(str2);
                    if (predicate == null || !predicate.test(obj)) {
                        consumer.accept("Extra is not allowed. Key: " + str2 + ". Value: " + obj);
                    } else {
                        putExtra(intent2, str2, obj);
                    }
                } else {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Api16Impl.sanitizeClipData(intent, intent2, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, consumer);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mAllowIdentifier) {
                Api29Impl.setIdentifier(intent2, Api29Impl.getIdentifier(intent));
            } else if (Api29Impl.getIdentifier(intent) != null) {
                consumer.accept("Identifier is not allowed: " + Api29Impl.getIdentifier(intent));
            }
        }
        if (Build.VERSION.SDK_INT >= 15) {
            if (this.mAllowSelector) {
                Api15Impl.setSelector(intent2, Api15Impl.getSelector(intent));
            } else if (Api15Impl.getSelector(intent) != null) {
                consumer.accept("Selector is not allowed: " + Api15Impl.getSelector(intent));
            }
        }
        if (this.mAllowSourceBounds) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent) {
        return sanitize(intent, C0026t.f29e);
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent) {
        return sanitize(intent, C0008b.f10e);
    }

    public IntentSanitizer() {
    }
}
