package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

@InverseBindingMethods({@InverseBindingMethod(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RadioGroupBindingAdapter {
    @BindingAdapter({"android:checkedButton"})
    public static void setCheckedButton(RadioGroup radioGroup, int i) {
        if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void setListeners(RadioGroup radioGroup, final RadioGroup.OnCheckedChangeListener onCheckedChangeListener, final InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioGroup.OnCheckedChangeListener onCheckedChangeListener = onCheckedChangeListener;
                    if (onCheckedChangeListener != null) {
                        onCheckedChangeListener.onCheckedChanged(radioGroup, i);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
