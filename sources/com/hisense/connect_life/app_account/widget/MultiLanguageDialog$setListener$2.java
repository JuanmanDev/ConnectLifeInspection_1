package com.hisense.connect_life.app_account.widget;

import android.content.Context;
import android.view.View;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageEntity;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MultiLanguageDialog.kt */
public final class MultiLanguageDialog$setListener$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ MultiLanguageDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLanguageDialog$setListener$2(MultiLanguageDialog multiLanguageDialog) {
        super(1);
        this.this$0 = multiLanguageDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        this.this$0.dismiss();
        int i = 0;
        switch (this.this$0.type) {
            case 600:
                int size = this.this$0.languageList.size();
                while (true) {
                    if (i < size) {
                        int i2 = i + 1;
                        if (((LanguageEntity) this.this$0.languageList.get(i)).isSelected()) {
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("i = ", Integer.valueOf(i)));
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("languageType = ", ((LanguageEntity) this.this$0.languageList.get(i)).getLanguageType()));
                            SPManagerKt.setLanguageType(((LanguageEntity) this.this$0.languageList.get(i)).getLanguageType());
                            MultiLanguageUtil.INSTANCE.setConfiguration();
                            HiSmart.Companion.getInstance().languageService().setDefaultLanguage(String.valueOf(i), C85651.INSTANCE, C85662.INSTANCE);
                        } else {
                            i = i2;
                        }
                    }
                }
                Paths.Jump jump = Paths.Jump.INSTANCE;
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                jump.jumpToMain(requireContext);
                return;
            case EventBusConstKt.CHANGE_LANGUAGE /*601*/:
                this.this$0.changeLanguage = true;
                int size2 = this.this$0.languageList.size();
                while (true) {
                    if (i < size2) {
                        int i3 = i + 1;
                        if (((LanguageEntity) this.this$0.languageList.get(i)).isSelected()) {
                            this.this$0.currentItem = i;
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("i = ", Integer.valueOf(i)));
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("languageType = ", ((LanguageEntity) this.this$0.languageList.get(i)).getLanguageType()));
                            MultiLanguageDialog multiLanguageDialog = this.this$0;
                            multiLanguageDialog.languageName = ((LanguageEntity) multiLanguageDialog.languageList.get(i)).getLanguageName();
                            MultiLanguageDialog multiLanguageDialog2 = this.this$0;
                            multiLanguageDialog2.languageType = ((LanguageEntity) multiLanguageDialog2.languageList.get(i)).getLanguageType();
                        } else {
                            i = i3;
                        }
                    }
                }
                this.this$0.dismiss();
                return;
            case EventBusConstKt.COUNTRY_CITY /*602*/:
                this.this$0.changeCity = true;
                String[] access$getCountryCodeArray$p = this.this$0.countryCodeArray;
                String[] strArr = null;
                if (access$getCountryCodeArray$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("countryCodeArray");
                    access$getCountryCodeArray$p = null;
                }
                if (access$getCountryCodeArray$p.length == 0) {
                    i = 1;
                }
                if (i != 0) {
                    this.this$0.countryCode = "";
                } else {
                    MultiLanguageDialog multiLanguageDialog3 = this.this$0;
                    String[] access$getCountryCodeArray$p2 = multiLanguageDialog3.countryCodeArray;
                    if (access$getCountryCodeArray$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("countryCodeArray");
                    } else {
                        strArr = access$getCountryCodeArray$p2;
                    }
                    multiLanguageDialog3.countryCode = strArr[this.this$0.currentItem];
                }
                this.this$0.dismiss();
                return;
            case EventBusConstKt.SELECT_AN_OPTION /*603*/:
                this.this$0.selectAnOption = true;
                int size3 = this.this$0.languageList.size();
                while (true) {
                    if (i < size3) {
                        int i4 = i + 1;
                        if (((LanguageEntity) this.this$0.languageList.get(i)).isSelected()) {
                            MultiLanguageDialog multiLanguageDialog4 = this.this$0;
                            multiLanguageDialog4.languageName = ((LanguageEntity) multiLanguageDialog4.languageList.get(i)).getLanguageName();
                        } else {
                            i = i4;
                        }
                    }
                }
                this.this$0.dismiss();
                return;
            default:
                return;
        }
    }
}
