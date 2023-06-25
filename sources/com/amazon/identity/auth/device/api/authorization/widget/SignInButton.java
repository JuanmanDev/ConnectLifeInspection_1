package com.amazon.identity.auth.device.api.authorization.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.HashMap;
import java.util.Map;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class SignInButton extends ImageButton {

    /* renamed from: m */
    public static final String f6895m = SignInButton.class.getName();

    /* renamed from: n */
    public static final Map<String, Integer> f6896n = new HashMap();

    /* renamed from: e */
    public Style f6897e = Style.LOGIN_WITH_AMAZON;

    /* renamed from: l */
    public Color f6898l = Color.GOLD;

    public enum Color {
        GOLD("gold"),
        GRAY("gry"),
        DARK_GRAY("dark_gray");
        
        public final String name;

        /* access modifiers changed from: public */
        Color(String str) {
            this.name = str;
        }
    }

    public enum Style {
        A_WITH_SMILE("a"),
        LOGIN(EventBusConstKt.LOGIN),
        LOGIN_WITH_AMAZON("loginwithamazon");
        
        public final String name;

        /* access modifiers changed from: public */
        Style(String str) {
            this.name = str;
        }
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo21429a();
    }

    private String getButtonDescription() {
        return String.format("Button configuration = { style:%s color:%s pressed:%b }", new Object[]{this.f6897e.toString(), this.f6898l.toString(), Boolean.valueOf(isPressed())});
    }

    private String getButtonNameForCurrentState() {
        StringBuilder sb = new StringBuilder();
        sb.append("btnlwa");
        sb.append("_");
        sb.append(this.f6898l.name);
        sb.append("_");
        sb.append(this.f6897e.name);
        if (isPressed()) {
            sb.append("_");
            sb.append("pressed");
        }
        return sb.toString();
    }

    private int getResourceIdForCurrentState() {
        String buttonNameForCurrentState = getButtonNameForCurrentState();
        Integer num = f6896n.get(buttonNameForCurrentState);
        if (num == null) {
            num = Integer.valueOf(getResources().getIdentifier(String.format("%s:drawable/%s", new Object[]{getContext().getPackageName(), buttonNameForCurrentState}), (String) null, (String) null));
            if (num.intValue() != 0) {
                f6896n.put(buttonNameForCurrentState, num);
            } else {
                String str = f6895m;
                C1485a.m829b(str, "Could not find the resource ID for the image named \"" + buttonNameForCurrentState + "\". It must be added to the drawables resources  (" + getButtonDescription() + ")");
            }
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final void mo21429a() {
        setImageResource(getResourceIdForCurrentState());
    }

    public void setColor(Color color) {
        this.f6898l = color;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        mo21429a();
    }

    public void setStyle(Style style) {
        this.f6897e = style;
    }
}
