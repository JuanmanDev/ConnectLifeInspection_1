package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.AllergiesAndFoodPreferencesActivity;
import kotlin.Triple;

/* renamed from: c.r.a.a.b.l1 */
/* compiled from: lambda */
public final /* synthetic */ class C7210l1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ AllergiesAndFoodPreferencesActivity f13837a;

    public /* synthetic */ C7210l1(AllergiesAndFoodPreferencesActivity allergiesAndFoodPreferencesActivity) {
        this.f13837a = allergiesAndFoodPreferencesActivity;
    }

    public final void onChanged(Object obj) {
        AllergiesAndFoodPreferencesActivity.m26805setListeners$lambda9(this.f13837a, (Triple) obj);
    }
}
