package com.hisense.connect_life.app_account.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.widget.CheckboxItem;
import com.hisense.connect_life.hismart.constants.RequestTag;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAdditionData;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7210l1;
import p040c.p429r.p430a.p431a.p432b.C7258x1;

@Metadata(mo47990d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0017J\b\u0010#\u001a\u00020\u001eH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0014J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0017J\b\u0010)\u001a\u00020\u001eH\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/AllergiesAndFoodPreferencesActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "mAdditionalData", "", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAdditionData;", "getMAdditionalData", "()Ljava/util/List;", "setMAdditionalData", "(Ljava/util/List;)V", "mUserProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "getMUserProfile", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "setMUserProfile", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;)V", "preferences", "", "", "getPreferences", "viewList", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "getViewList", "()Ljava/util/ArrayList;", "setViewList", "(Ljava/util/ArrayList;)V", "addWidgets", "", "bindLayout", "", "cancelOnClick", "view", "finish", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "leftTopBackButtonOnClick", "saveOnClick", "setListeners", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AllergiesAndFoodPreferencesActivity.kt */
public final class AllergiesAndFoodPreferencesActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public List<UpAdditionData> mAdditionalData = new ArrayList();
    @Nullable
    public UserProfile mUserProfile;
    @NotNull
    public final List<String> preferences = CollectionsKt__CollectionsKt.listOf("None", "lactoseAllergy", "wheatAllergy", "nutsAllergy", "crustaceansAllergy", "fishAllergy", "mustarsdAllergy", "sesameSeedsAllergy", "eggAllergy", "soyAllergy", "glutenAllergy", "celeryAllergy", "sulphurDioxideAllergy", "mollucsAllergy", "cerealsGlutenAllergy", "None", "hallal", "vegetarian", "noPork", "noChicken", "lowCarb", "vegan", "noBeef", "noFish");
    @NotNull
    public ArrayList<View> viewList = new ArrayList<>();

    public AllergiesAndFoodPreferencesActivity() {
    }

    private final void addWidgets() {
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_allergies_none));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_lactose_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_wheat_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_nuts_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_crustaceans_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_fish_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_mustarsd_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_sesame_seeds_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_egg_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_soy_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_gluten_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_celery_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_sulphur_dioxide_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_mollucs_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_cereals_gluten_allergy));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_preference_none));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_hallal));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_vegetarian));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_no_pork));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_no_chicken));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_low_carb));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_vegan));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_no_beef));
        this.viewList.add((CheckboxItem) _$_findCachedViewById(R$id.cbl_no_fish));
    }

    /* renamed from: setListeners$lambda-8$lambda-7  reason: not valid java name */
    public static final void m26804setListeners$lambda8$lambda7(AllergiesAndFoodPreferencesActivity allergiesAndFoodPreferencesActivity, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Intrinsics.checkNotNullParameter(allergiesAndFoodPreferencesActivity, "this$0");
        if (view != null) {
            view.hashCode() + " clicked";
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.checkbox_tile_checkbox);
            boolean z20 = true;
            checkBox.setChecked(!checkBox.isChecked());
            int id = view.getId();
            if (id == ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_allergies_none)).getId()) {
                if (checkBox.isChecked()) {
                    int i = 0;
                    for (T next : allergiesAndFoodPreferencesActivity.viewList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        View view2 = (View) next;
                        if (1 <= i && i < 15) {
                            ((CheckBox) view2.findViewById(R$id.checkbox_tile_checkbox)).setChecked(false);
                        }
                        i = i2;
                    }
                }
            } else if (id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_preference_none)).getId()) {
                if (id == ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_lactose_allergy)).getId() || id == ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_wheat_allergy)).getId()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_nuts_allergy)).getId()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_crustaceans_allergy)).getId()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_fish_allergy)).getId()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_mustarsd_allergy)).getId()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_sesame_seeds_allergy)).getId()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (!z6 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_egg_allergy)).getId()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!z7 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_soy_allergy)).getId()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!z8 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_gluten_allergy)).getId()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!z9 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_celery_allergy)).getId()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_sulphur_dioxide_allergy)).getId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_mollucs_allergy)).getId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_cereals_gluten_allergy)).getId()) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13) {
                    if (id == ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_hallal)).getId() || id == ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_vegetarian)).getId()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_no_pork)).getId()) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (!z15 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_no_chicken)).getId()) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (!z16 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_low_carb)).getId()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (!z17 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_vegan)).getId()) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (!z18 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_no_beef)).getId()) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!z19 && id != ((CheckboxItem) allergiesAndFoodPreferencesActivity._$_findCachedViewById(R$id.cbl_no_fish)).getId()) {
                        z20 = false;
                    }
                    if (z20 && checkBox.isChecked()) {
                        int i3 = 0;
                        for (T next2 : allergiesAndFoodPreferencesActivity.viewList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            View view3 = (View) next2;
                            if (i3 == 15) {
                                ((CheckBox) view3.findViewById(R$id.checkbox_tile_checkbox)).setChecked(false);
                            }
                            i3 = i4;
                        }
                    }
                } else if (checkBox.isChecked()) {
                    int i5 = 0;
                    for (T next3 : allergiesAndFoodPreferencesActivity.viewList) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        View view4 = (View) next3;
                        if (i5 == 0) {
                            ((CheckBox) view4.findViewById(R$id.checkbox_tile_checkbox)).setChecked(false);
                        }
                        i5 = i6;
                    }
                }
            } else if (checkBox.isChecked()) {
                int i7 = 0;
                for (T next4 : allergiesAndFoodPreferencesActivity.viewList) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    View view5 = (View) next4;
                    if (16 <= i7 && i7 < 24) {
                        ((CheckBox) view5.findViewById(R$id.checkbox_tile_checkbox)).setChecked(false);
                    }
                    i7 = i8;
                }
            }
        }
    }

    /* renamed from: setListeners$lambda-9  reason: not valid java name */
    public static final void m26805setListeners$lambda9(AllergiesAndFoodPreferencesActivity allergiesAndFoodPreferencesActivity, Triple triple) {
        AllergiesAndFoodPreferencesActivity allergiesAndFoodPreferencesActivity2 = allergiesAndFoodPreferencesActivity;
        Intrinsics.checkNotNullParameter(allergiesAndFoodPreferencesActivity2, "this$0");
        if (((Boolean) triple.getFirst()).booleanValue()) {
            try {
                UserProfile userProfile = (UserProfile) triple.getThird();
                UserProfile userProfile2 = null;
                if ((userProfile == null ? null : userProfile.getPhoneNumbers()) == null) {
                    UserProfile userProfile3 = (UserProfile) triple.getThird();
                    if (userProfile3 != null) {
                        userProfile3.setPhoneNumbers(CollectionsKt__CollectionsKt.emptyList());
                    }
                }
                UserProfile userProfile4 = (UserProfile) triple.getThird();
                if (userProfile4 != null) {
                    userProfile2 = UserProfile.copy$default(userProfile4, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                }
                allergiesAndFoodPreferencesActivity2.mUserProfile = userProfile2;
            } catch (Exception e) {
                e.printStackTrace();
            }
            allergiesAndFoodPreferencesActivity2.showString(R$string.success);
            allergiesAndFoodPreferencesActivity.finish();
            EventBus.getDefault().post(allergiesAndFoodPreferencesActivity2.mUserProfile);
            return;
        }
        allergiesAndFoodPreferencesActivity2.showString(R$string.update_userprofile_failed);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.activity_allergies_and_food_preferences;
    }

    public final void cancelOnClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        finish();
    }

    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("respond", "Hello,Alice!I'm Bob.");
        Bundle bundle = new Bundle();
        bundle.putSerializable("userProfile", this.mUserProfile);
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.finish();
    }

    @NotNull
    public final List<UpAdditionData> getMAdditionalData() {
        return this.mAdditionalData;
    }

    @Nullable
    public final UserProfile getMUserProfile() {
        return this.mUserProfile;
    }

    @NotNull
    public final List<String> getPreferences() {
        return this.preferences;
    }

    @NotNull
    public final ArrayList<View> getViewList() {
        return this.viewList;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        List<UpAdditionData> list;
        addWidgets();
        UserProfile userProfile = (UserProfile) getIntent().getSerializableExtra("userProfile");
        this.mUserProfile = userProfile;
        List<UpAdditionData> list2 = null;
        if (userProfile == null) {
            list = null;
        } else {
            list = userProfile.getAdditionalData();
        }
        if (list != null) {
            UserProfile userProfile2 = this.mUserProfile;
            if (userProfile2 != null) {
                list2 = userProfile2.getAdditionalData();
            }
            Intrinsics.checkNotNull(list2);
            this.mAdditionalData = list2;
        }
        int i = 0;
        if (this.mAdditionalData.size() == 0) {
            while (i < 24) {
                int i2 = i + 1;
                if (i < 15) {
                    this.mAdditionalData.add(new UpAdditionData("Allergies", this.preferences.get(i), "0"));
                } else {
                    this.mAdditionalData.add(new UpAdditionData("FOOD PREFERENCES", this.preferences.get(i), "0"));
                }
                i = i2;
            }
        } else {
            Intrinsics.stringPlus("mAdditionalData 初始大小", Integer.valueOf(this.mAdditionalData.size()));
            Intrinsics.stringPlus("mAdditionalData is ", this.mAdditionalData);
            if (this.mAdditionalData.size() == 23) {
                List<UpAdditionData> list3 = this.mAdditionalData;
                String string = getString(R$string.setting_no);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.setting_no)");
                list3.add(0, new UpAdditionData("Allergies", string, "0"));
                List<UpAdditionData> list4 = this.mAdditionalData;
                String string2 = getString(R$string.setting_no);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.setting_no)");
                list4.add(15, new UpAdditionData("FOOD PREFERENCES", string2, "0"));
            }
            ArrayList arrayList = new ArrayList();
            for (UpAdditionData upAdditionData : this.mAdditionalData) {
                if (Intrinsics.areEqual((Object) "Allergies", (Object) upAdditionData.getGroup()) || Intrinsics.areEqual((Object) "FOOD PREFERENCES", (Object) upAdditionData.getGroup())) {
                    arrayList.add(upAdditionData);
                }
            }
            if (arrayList.size() == 0) {
                int i3 = 0;
                while (i3 < 24) {
                    int i4 = i3 + 1;
                    if (i3 < 15) {
                        arrayList.add(new UpAdditionData("Allergies", this.preferences.get(i3), "0"));
                    } else {
                        arrayList.add(new UpAdditionData("FOOD PREFERENCES", this.preferences.get(i3), "0"));
                    }
                    i3 = i4;
                }
            }
            this.mAdditionalData.clear();
            this.mAdditionalData.addAll(arrayList);
            for (UpAdditionData next : this.mAdditionalData) {
                20540 + i + next.getName() + next.getValue();
                ((CheckBox) this.viewList.get(i).findViewById(R$id.checkbox_tile_checkbox)).setChecked(Intrinsics.areEqual((Object) next.getValue(), (Object) "1"));
                i++;
            }
        }
        Intrinsics.stringPlus("userProfile is ", this.mUserProfile);
    }

    public final void leftTopBackButtonOnClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        finish();
    }

    public final void saveOnClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserProfile userProfile = this.mUserProfile;
        if (userProfile != null) {
            Intrinsics.stringPlus("mAdditionalData size", Integer.valueOf(getMAdditionalData().size()));
            Iterator<View> it = getViewList().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (((CheckBox) it.next().findViewById(R$id.checkbox_tile_checkbox)).isChecked()) {
                    getMAdditionalData().get(i).setValue("1");
                } else {
                    getMAdditionalData().get(i).setValue("0");
                }
                i = i2;
            }
            userProfile.setAdditionalData(getMAdditionalData());
        }
        UserProfile userProfile2 = this.mUserProfile;
        if (userProfile2 != null) {
            ((AccountViewModel) getMViewModel()).updateUserProfile(userProfile2, RequestTag.AllergiesAndFoodPreferences);
        }
    }

    public void setListeners() {
        for (View view : this.viewList) {
            ((CheckBox) view.findViewById(R$id.checkbox_tile_checkbox)).setClickable(false);
            view.setOnClickListener(new C7258x1(this));
        }
        ((AccountViewModel) getMViewModel()).getUpdateUpLiveData().observe(this, new C7210l1(this));
    }

    public final void setMAdditionalData(@NotNull List<UpAdditionData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mAdditionalData = list;
    }

    public final void setMUserProfile(@Nullable UserProfile userProfile) {
        this.mUserProfile = userProfile;
    }

    public final void setViewList(@NotNull ArrayList<View> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.viewList = arrayList;
    }
}
