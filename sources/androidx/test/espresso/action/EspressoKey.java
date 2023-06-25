package androidx.test.espresso.action;

import android.os.Build;
import android.view.KeyEvent;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.remote.annotation.RemoteMsgConstructor;
import androidx.test.espresso.remote.annotation.RemoteMsgField;
import java.util.Locale;

public final class EspressoKey {
    @RemoteMsgField(order = 0)
    public final int keyCode;
    @RemoteMsgField(order = 1)
    public final int metaState;

    public static class Builder {
        public int builderKeyCode = -1;
        public boolean isAltPressed;
        public boolean isCtrlPressed;
        public boolean isShiftPressed;

        /* access modifiers changed from: private */
        public int getMetaState() {
            int i = this.isShiftPressed ? 1 : 0;
            if (this.isAltPressed) {
                i |= 2;
            }
            return (!this.isCtrlPressed || Build.VERSION.SDK_INT < 11) ? i : i | 4096;
        }

        public EspressoKey build() {
            int i = this.builderKeyCode;
            Preconditions.checkState(i > 0 && i < KeyEvent.getMaxKeyCode(), "Invalid key code: %s", this.builderKeyCode);
            return new EspressoKey(this);
        }

        public Builder withAltPressed(boolean z) {
            this.isAltPressed = z;
            return this;
        }

        public Builder withCtrlPressed(boolean z) {
            this.isCtrlPressed = z;
            return this;
        }

        public Builder withKeyCode(int i) {
            this.builderKeyCode = i;
            return this;
        }

        public Builder withShiftPressed(boolean z) {
            this.isShiftPressed = z;
            return this;
        }
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public int getMetaState() {
        return this.metaState;
    }

    public String toString() {
        return String.format(Locale.ROOT, "keyCode: %s, metaState: %s", new Object[]{Integer.valueOf(this.keyCode), Integer.valueOf(this.metaState)});
    }

    public EspressoKey(Builder builder) {
        this(builder.builderKeyCode, builder.getMetaState());
    }

    @RemoteMsgConstructor
    public EspressoKey(int i, int i2) {
        this.keyCode = i;
        this.metaState = i2;
    }
}
