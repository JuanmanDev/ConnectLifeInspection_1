package com.hisense.connect_life.core.multilingual;

import android.annotation.SuppressLint;
import androidx.room.RoomMasterTable;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.websocket.WebSocketHandler;
import com.hisense.connect_life.core.global.SPManagerKt;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p691no.nordicsemi.android.dfu.BuildConfig;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\b\u0010\u001b\u001a\u00020\u0004H\u0007J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0003J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/core/multilingual/LanguageListManager;", "", "()V", "TAG", "", "languageCodeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLanguageCodeList", "()Ljava/util/ArrayList;", "languageList", "Lcom/hisense/connect_life/core/multilingual/LanguageEntity;", "languageNameList", "getLanguageNameList", "languageTypeList", "getLanguageTypeList", "getIndexByCode", "", "code", "getIndexByLanguageName", "languageName", "getIndexByTypeCode", "typeCode", "getLanguageCode", "getLanguageCodeByType", "type", "getLanguageName", "getLanguageType", "getLocale", "Ljava/util/Locale;", "getSetLanguageStatus", "getSysLanguageStatus", "initLanguage", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageListManager.kt */
public final class LanguageListManager {
    @NotNull
    public static final LanguageListManager INSTANCE = new LanguageListManager();
    @NotNull
    public static final String TAG = "LanguageListManager";
    @NotNull
    public static final ArrayList<String> languageCodeList = CollectionsKt__CollectionsKt.arrayListOf("1", "0", "27", "30", "37", "12", "38", "29", "32", "28", "26", "33", "14", "39", "19", "36", "18", "20", "21", "25", "35", "31", "10", "11", "5", "6", "8", "34", "7", "3", CrashDumperPlugin.OPTION_KILL_DEFAULT, WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13, "2", "41", RoomMasterTable.DEFAULT_ID, "43", BuildConfig.VERSION_CODE);
    @NotNull
    public static final ArrayList<LanguageEntity> languageList = new ArrayList<>();
    @NotNull
    public static final ArrayList<String> languageNameList = CollectionsKt__CollectionsKt.arrayListOf("English", "简体中文", "繁體中文 ", "हिंदी", "Română", "Polski", "български", "Bahasa Melayu", "Bahasa Indonesia", "Српски", "Hrvatski", "ภาษาไทย", "한국어", "Magyar", "Svenska", "Қазақ", "Norsk", "Suomi", "Dansk", "Slovenščina", "Slovenčina", "Čeština", "Nederlands", "Deutsch", "Pусский", "Français", "Português", "Українська", "Español", "עִברִית", "Italiano", "日本語", "العربية", "Türkçe", "Македонски", "Ελληνικά", "فارسی");
    @NotNull
    public static final ArrayList<String> languageTypeList = CollectionsKt__CollectionsKt.arrayListOf(LanguageConstKt.f15944en, LanguageConstKt.zh_CN, LanguageConstKt.zh_TW_HK, LanguageConstKt.f15950hi, LanguageConstKt.f15965ro, LanguageConstKt.f15963pl, LanguageConstKt.f15939bg, LanguageConstKt.f15959ms, "id", LanguageConstKt.sr_BA, LanguageConstKt.f15951hr, LanguageConstKt.f15970th, LanguageConstKt.f15956ko, LanguageConstKt.f15952hu, LanguageConstKt.f15969sv, LanguageConstKt.f15957kz, LanguageConstKt.f15960nb, LanguageConstKt.f15947fi, LanguageConstKt.f15941da, LanguageConstKt.f15968sl, LanguageConstKt.f15967sk, LanguageConstKt.f15940cs, LanguageConstKt.f15961nl, LanguageConstKt.f15942de, LanguageConstKt.f15966ru, LanguageConstKt.f15948fr, LanguageConstKt.f15964pt, LanguageConstKt.f15973uk, LanguageConstKt.f15945es, LanguageConstKt.f15949he, LanguageConstKt.f15954it, LanguageConstKt.f15955ja, LanguageConstKt.f15971tr, LanguageConstKt.f15938ar, LanguageConstKt.f15958mk, LanguageConstKt.f15943el, LanguageConstKt.f15946fa);

    private final int getSetLanguageStatus() {
        int i = 0;
        int i2 = 0;
        for (T next : languageList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) ((LanguageEntity) next).getLanguageType(), (Object) SPManagerKt.getLanguageType())) {
                i = i2;
            }
            i2 = i3;
        }
        return i;
    }

    @SuppressLint({"DefaultLocale"})
    private final int getSysLanguageStatus() {
        int size = languageList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String lowerCase = languageList.get(i).getLanguageType().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String locale = MultiLanguageUtil.INSTANCE.getConfigLocale().toString();
            Intrinsics.checkNotNullExpressionValue(locale, "MultiLanguageUtil.getCon…              .toString()");
            String lowerCase2 = locale.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual((Object) lowerCase, (Object) StringsKt__StringsJVMKt.replace$default(lowerCase2, "_", AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, false, 4, (Object) null))) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public final int getIndexByCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        int i = 0;
        if (str.length() == 0) {
            return -1;
        }
        for (T next : languageCodeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final int getIndexByLanguageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        int i = 0;
        if (str.length() == 0) {
            return -1;
        }
        for (T next : languageNameList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final int getIndexByTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "typeCode");
        int i = 0;
        if (str.length() == 0) {
            return -1;
        }
        for (T next : languageTypeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @NotNull
    @SuppressLint({"DefaultLocale"})
    public final String getLanguageCode() {
        int size = languageNameList.size();
        String str = "";
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str2 = languageTypeList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "languageTypeList[i]");
            String lowerCase = str2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String locale = MultiLanguageUtil.INSTANCE.getConfigLocale().toString();
            Intrinsics.checkNotNullExpressionValue(locale, "MultiLanguageUtil.getConfigLocale().toString()");
            String lowerCase2 = locale.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual((Object) lowerCase, (Object) StringsKt__StringsJVMKt.replace$default(lowerCase2, "_", AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, false, 4, (Object) null))) {
                String str3 = languageCodeList.get(i);
                Intrinsics.checkNotNullExpressionValue(str3, "languageCodeList[i]");
                return str3;
            }
            String str4 = languageCodeList.get(0);
            Intrinsics.checkNotNullExpressionValue(str4, "languageCodeList[0]");
            String str5 = str4;
            i = i2;
            str = str5;
        }
        return str;
    }

    @NotNull
    public final String getLanguageCodeByType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        int i = 0;
        for (T next : languageTypeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) (String) next, (CharSequence) str, false, 2, (Object) null)) {
                String str2 = INSTANCE.getLanguageCodeList().get(i);
                Intrinsics.checkNotNullExpressionValue(str2, "languageCodeList[index]");
                return str2;
            }
            i = i2;
        }
        String str3 = languageCodeList.get(0);
        Intrinsics.checkNotNullExpressionValue(str3, "languageCodeList[index]");
        return str3;
    }

    @NotNull
    public final ArrayList<String> getLanguageCodeList() {
        return languageCodeList;
    }

    @NotNull
    @SuppressLint({"DefaultLocale"})
    public final String getLanguageName() {
        int i = 0;
        String str = "";
        if (SPManagerKt.getLanguageType().length() == 0) {
            int size = languageNameList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 1;
                String str2 = languageTypeList.get(i2);
                Intrinsics.checkNotNullExpressionValue(str2, "languageTypeList[i]");
                String lowerCase = str2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                String locale = MultiLanguageUtil.INSTANCE.getConfigLocale().toString();
                Intrinsics.checkNotNullExpressionValue(locale, "MultiLanguageUtil.getCon…              .toString()");
                String lowerCase2 = locale.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual((Object) lowerCase, (Object) StringsKt__StringsJVMKt.replace$default(lowerCase2, "_", AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, false, 4, (Object) null))) {
                    str = languageNameList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(str, "languageNameList[i]");
                    break;
                }
                String str3 = languageNameList.get(0);
                Intrinsics.checkNotNullExpressionValue(str3, "languageNameList[0]");
                String str4 = str3;
                i2 = i3;
                str = str4;
            }
        } else {
            for (T next : languageTypeList) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) (String) next, (Object) SPManagerKt.getLanguageType())) {
                    String str5 = INSTANCE.getLanguageNameList().get(i);
                    Intrinsics.checkNotNullExpressionValue(str5, "languageNameList[index]");
                    str = str5;
                }
                i = i4;
            }
        }
        return str;
    }

    @NotNull
    public final ArrayList<String> getLanguageNameList() {
        return languageNameList;
    }

    @NotNull
    @SuppressLint({"DefaultLocale"})
    public final String getLanguageType() {
        String str;
        Locale configLocale = MultiLanguageUtil.INSTANCE.getConfigLocale();
        String lowerCase = configLocale.getLanguage().toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        String locale = configLocale.toString();
        Intrinsics.checkNotNullExpressionValue(locale, "configLocale.toString()");
        String lowerCase2 = locale.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
        StringsKt__StringsJVMKt.replace$default(lowerCase2, "_", AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, false, 4, (Object) null);
        int size = languageNameList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = "";
                break;
            }
            int i2 = i + 1;
            String str2 = languageTypeList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "languageTypeList[i]");
            String lowerCase3 = str2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
            String lowerCase4 = configLocale.getCountry().toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase()");
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                String str3 = languageTypeList.get(i);
                Intrinsics.checkNotNullExpressionValue(str3, "languageTypeList[i]");
                String lowerCase5 = str3.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase()");
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase5, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    Intrinsics.stringPlus("select language2: ", languageTypeList.get(i));
                    String str4 = languageTypeList.get(i);
                    Intrinsics.checkNotNullExpressionValue(str4, "languageTypeList[i]");
                    str = str4;
                    break;
                }
            }
            i = i2;
        }
        boolean z = true;
        if (str.length() == 0) {
            int size2 = languageNameList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                int i4 = i3 + 1;
                String str5 = languageTypeList.get(i3);
                Intrinsics.checkNotNullExpressionValue(str5, "languageTypeList[i]");
                String lowerCase6 = str5.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual((Object) lowerCase6, (Object) lowerCase)) {
                    Intrinsics.stringPlus("select language1: ", languageTypeList.get(i3));
                    String str6 = languageTypeList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(str6, "languageTypeList[i]");
                    str = str6;
                    break;
                }
                i3 = i4;
            }
        }
        if (str.length() == 0) {
            int size3 = languageNameList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                int i6 = i5 + 1;
                String str7 = languageTypeList.get(i5);
                Intrinsics.checkNotNullExpressionValue(str7, "languageTypeList[i]");
                String lowerCase7 = str7.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase()");
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    Intrinsics.stringPlus("select language3: ", languageTypeList.get(i5));
                    String str8 = languageTypeList.get(i5);
                    Intrinsics.checkNotNullExpressionValue(str8, "languageTypeList[i]");
                    str = str8;
                    break;
                }
                i5 = i6;
            }
        }
        if (str.length() != 0) {
            z = false;
        }
        if (!z) {
            return str;
        }
        Intrinsics.stringPlus("select language4: ", languageTypeList.get(0));
        String str9 = languageTypeList.get(0);
        Intrinsics.checkNotNullExpressionValue(str9, "languageTypeList[0]");
        return str9;
    }

    @NotNull
    public final ArrayList<String> getLanguageTypeList() {
        return languageTypeList;
    }

    @NotNull
    public final Locale getLocale() {
        return MultiLanguageUtil.INSTANCE.getConfigLocale();
    }

    @NotNull
    public final ArrayList<LanguageEntity> initLanguage() {
        languageList.clear();
        int size = languageTypeList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = languageNameList.get(i);
            Intrinsics.checkNotNullExpressionValue(str, "languageNameList[i]");
            String str2 = languageTypeList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "languageTypeList[i]");
            String str3 = languageCodeList.get(i);
            Intrinsics.checkNotNullExpressionValue(str3, "languageCodeList[i]");
            languageList.add(new LanguageEntity(str, str2, str3, false, 8, (DefaultConstructorMarker) null));
            i = i2;
        }
        if (SPManagerKt.getLanguageType().length() == 0) {
            z = true;
        }
        if (z) {
            languageList.get(getSysLanguageStatus()).setSelected(true);
        } else {
            languageList.get(getSetLanguageStatus()).setSelected(true);
        }
        return languageList;
    }
}
