package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C7828R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import java.util.ArrayList;
import java.util.List;

public final class IndicatorViewController {
    public static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 167;
    public static final int CAPTION_STATE_ERROR = 1;
    public static final int CAPTION_STATE_HELPER_TEXT = 2;
    public static final int CAPTION_STATE_NONE = 0;
    public static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 217;
    public static final int COUNTER_INDEX = 2;
    public static final int ERROR_INDEX = 0;
    public static final int HELPER_INDEX = 1;
    @Nullable
    public Animator captionAnimator;
    public FrameLayout captionArea;
    public int captionDisplayed;
    public int captionToShow;
    public final float captionTranslationYPx;
    public int captionViewsAdded;
    public final Context context;
    public boolean errorEnabled;
    @Nullable
    public CharSequence errorText;
    public int errorTextAppearance;
    @Nullable
    public TextView errorView;
    @Nullable
    public CharSequence errorViewContentDescription;
    @Nullable
    public ColorStateList errorViewTextColor;
    public CharSequence helperText;
    public boolean helperTextEnabled;
    public int helperTextTextAppearance;
    @Nullable
    public TextView helperTextView;
    @Nullable
    public ColorStateList helperTextViewTextColor;
    public LinearLayout indicatorArea;
    public int indicatorsAdded;
    @NonNull
    public final TextInputLayout textInputView;
    public Typeface typeface;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        Context context2 = textInputLayout.getContext();
        this.context = context2;
        this.textInputView = textInputLayout;
        this.captionTranslationYPx = (float) context2.getResources().getDimensionPixelSize(C7828R.dimen.design_textinput_caption_translate_y);
    }

    private boolean canAdjustIndicatorPadding() {
        return (this.indicatorArea == null || this.textInputView.getEditText() == null) ? false : true;
    }

    private void createCaptionAnimators(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(createCaptionOpacityAnimator(textView, i3 == i));
                if (i3 == i) {
                    list.add(createCaptionTranslationYAnimator(textView));
                }
            }
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.captionTranslationYPx, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return ofFloat;
    }

    @Nullable
    private TextView getCaptionViewFromDisplayState(int i) {
        if (i == 1) {
            return this.errorView;
        }
        if (i != 2) {
            return null;
        }
        return this.helperTextView;
    }

    private boolean isCaptionStateError(int i) {
        if (i != 1 || this.errorView == null || TextUtils.isEmpty(this.errorText)) {
            return false;
        }
        return true;
    }

    private boolean isCaptionStateHelperText(int i) {
        return i == 2 && this.helperTextView != null && !TextUtils.isEmpty(this.helperText);
    }

    private void setCaptionViewVisibilities(int i, int i2) {
        TextView captionViewFromDisplayState;
        TextView captionViewFromDisplayState2;
        if (i != i2) {
            if (!(i2 == 0 || (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2)) == null)) {
                captionViewFromDisplayState2.setVisibility(0);
                captionViewFromDisplayState2.setAlpha(1.0f);
            }
            if (!(i == 0 || (captionViewFromDisplayState = getCaptionViewFromDisplayState(i)) == null)) {
                captionViewFromDisplayState.setVisibility(4);
                if (i == 1) {
                    captionViewFromDisplayState.setText((CharSequence) null);
                }
            }
            this.captionDisplayed = i2;
        }
    }

    private void setTextViewTypeface(@Nullable TextView textView, Typeface typeface2) {
        if (textView != null) {
            textView.setTypeface(typeface2);
        }
    }

    private void setViewGroupGoneIfEmpty(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(@Nullable TextView textView, @Nullable CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.textInputView) && this.textInputView.isEnabled() && (this.captionToShow != this.captionDisplayed || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void updateCaptionViewsVisibility(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.captionAnimator = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                createCaptionAnimators(arrayList2, this.helperTextEnabled, this.helperTextView, 2, i3, i4);
                createCaptionAnimators(arrayList2, this.errorEnabled, this.errorView, 1, i3, i4);
                AnimatorSetCompat.playTogether(animatorSet, arrayList);
                final TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i);
                final TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2);
                final int i5 = i2;
                final int i6 = i;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        int unused = IndicatorViewController.this.captionDisplayed = i5;
                        Animator unused2 = IndicatorViewController.this.captionAnimator = null;
                        TextView textView = captionViewFromDisplayState;
                        if (textView != null) {
                            textView.setVisibility(4);
                            if (i6 == 1 && IndicatorViewController.this.errorView != null) {
                                IndicatorViewController.this.errorView.setText((CharSequence) null);
                            }
                        }
                        TextView textView2 = captionViewFromDisplayState2;
                        if (textView2 != null) {
                            textView2.setTranslationY(0.0f);
                            captionViewFromDisplayState2.setAlpha(1.0f);
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        TextView textView = captionViewFromDisplayState2;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                });
                animatorSet.start();
            } else {
                setCaptionViewVisibilities(i, i2);
            }
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateLabelState(z2);
            this.textInputView.updateTextInputBoxState();
        }
    }

    public void addIndicator(TextView textView, int i) {
        if (this.indicatorArea == null && this.captionArea == null) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.indicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
            this.captionViewsAdded++;
        } else {
            this.indicatorArea.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    public void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            ViewCompat.setPaddingRelative(this.indicatorArea, ViewCompat.getPaddingStart(this.textInputView.getEditText()), 0, ViewCompat.getPaddingEnd(this.textInputView.getEditText()), 0);
        }
    }

    public void cancelCaptionAnimator() {
        Animator animator = this.captionAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    public boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    @Nullable
    public CharSequence getErrorText() {
        return this.errorText;
    }

    @ColorInt
    public int getErrorViewCurrentTextColor() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public ColorStateList getErrorViewTextColors() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence getHelperText() {
        return this.helperText;
    }

    @Nullable
    public ColorStateList getHelperTextViewColors() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextViewCurrentTextColor() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    public boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    public void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            if (!this.helperTextEnabled || TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 0;
            } else {
                this.captionToShow = 2;
            }
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, (CharSequence) null));
    }

    public void hideHelperText() {
        cancelCaptionAnimator();
        if (this.captionDisplayed == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, (CharSequence) null));
    }

    public boolean isCaptionView(int i) {
        return i == 0 || i == 1;
    }

    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    public boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    public void removeIndicator(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.indicatorArea != null) {
            if (!isCaptionView(i) || (frameLayout = this.captionArea) == null) {
                this.indicatorArea.removeView(textView);
            } else {
                int i2 = this.captionViewsAdded - 1;
                this.captionViewsAdded = i2;
                setViewGroupGoneIfEmpty(frameLayout, i2);
                this.captionArea.removeView(textView);
            }
            int i3 = this.indicatorsAdded - 1;
            this.indicatorsAdded = i3;
            setViewGroupGoneIfEmpty(this.indicatorArea, i3);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        if (this.errorEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
                this.errorView = appCompatTextView;
                appCompatTextView.setId(C7828R.C7831id.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.errorView.setTextAlignment(5);
                }
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.errorView.setTypeface(typeface2);
                }
                setErrorTextAppearance(this.errorTextAppearance);
                setErrorViewTextColor(this.errorViewTextColor);
                setErrorContentDescription(this.errorViewContentDescription);
                this.errorView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.errorView, 1);
                addIndicator(this.errorView, 0);
            } else {
                hideError();
                removeIndicator(this.errorView, 0);
                this.errorView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.errorEnabled = z;
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.errorTextAppearance = i;
        TextView textView = this.errorView;
        if (textView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    public void setErrorViewTextColor(@Nullable ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        TextView textView = this.errorView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextAppearance(@StyleRes int i) {
        this.helperTextTextAppearance = i;
        TextView textView = this.helperTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
                this.helperTextView = appCompatTextView;
                appCompatTextView.setId(C7828R.C7831id.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.helperTextView.setTextAlignment(5);
                }
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.helperTextView.setTypeface(typeface2);
                }
                this.helperTextView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
                setHelperTextAppearance(this.helperTextTextAppearance);
                setHelperTextViewTextColor(this.helperTextViewTextColor);
                addIndicator(this.helperTextView, 1);
            } else {
                hideHelperText();
                removeIndicator(this.helperTextView, 1);
                this.helperTextView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.helperTextEnabled = z;
        }
    }

    public void setHelperTextViewTextColor(@Nullable ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        TextView textView = this.helperTextView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTypefaces(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            setTextViewTypeface(this.errorView, typeface2);
            setTextViewTypeface(this.helperTextView, typeface2);
        }
    }

    public void showError(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        if (this.captionDisplayed != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    public void showHelper(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        if (this.captionDisplayed != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }
}
