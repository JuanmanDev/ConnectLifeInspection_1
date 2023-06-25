package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import kotlin.Metadata;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, mo47991d2 = {"Landroidx/navigation/AnimBuilder;", "", "enter", "I", "getEnter", "()I", "setEnter", "(I)V", "exit", "getExit", "setExit", "popEnter", "getPopEnter", "setPopEnter", "popExit", "getPopExit", "setPopExit", "<init>", "()V", "navigation-common-ktx_release"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
@NavOptionsDsl
/* compiled from: NavOptionsBuilder.kt */
public final class AnimBuilder {
    @AnimRes
    @AnimatorRes
    public int enter = -1;
    @AnimRes
    @AnimatorRes
    public int exit = -1;
    @AnimRes
    @AnimatorRes
    public int popEnter = -1;
    @AnimRes
    @AnimatorRes
    public int popExit = -1;

    public final int getEnter() {
        return this.enter;
    }

    public final int getExit() {
        return this.exit;
    }

    public final int getPopEnter() {
        return this.popEnter;
    }

    public final int getPopExit() {
        return this.popExit;
    }

    public final void setEnter(int i) {
        this.enter = i;
    }

    public final void setExit(int i) {
        this.exit = i;
    }

    public final void setPopEnter(int i) {
        this.popEnter = i;
    }

    public final void setPopExit(int i) {
        this.popExit = i;
    }
}
