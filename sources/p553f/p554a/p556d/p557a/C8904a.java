package p553f.p554a.p556d.p557a;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import p553f.p554a.p556d.p558b.p569i.C8975c;
import p553f.p554a.p570e.p572b.C9038c;

/* renamed from: f.a.d.a.a */
/* compiled from: AndroidKeyProcessor */
public class C8904a {

    /* renamed from: e */
    public static long f17440e;
    @NonNull

    /* renamed from: a */
    public final C8975c f17441a;
    @NonNull

    /* renamed from: b */
    public final C9038c f17442b;

    /* renamed from: c */
    public int f17443c;
    @NonNull

    /* renamed from: d */
    public C8905a f17444d;

    /* renamed from: f.a.d.a.a$a */
    /* compiled from: AndroidKeyProcessor */
    public static class C8905a implements C8975c.C8976a {

        /* renamed from: a */
        public final Deque<Map.Entry<Long, KeyEvent>> f17445a = new ArrayDeque();
        @NonNull

        /* renamed from: b */
        public final View f17446b;

        /* renamed from: c */
        public boolean f17447c = false;

        public C8905a(@NonNull View view) {
            this.f17446b = view;
        }

        /* renamed from: a */
        public void mo46307a(long j) {
            mo46310d(mo46311e(j));
        }

        /* renamed from: b */
        public void mo46308b(long j) {
            mo46311e(j);
        }

        /* renamed from: c */
        public void mo46309c(long j, @NonNull KeyEvent keyEvent) {
            if (this.f17445a.size() <= 0 || ((Long) this.f17445a.getFirst().getKey()).longValue() < j) {
                this.f17445a.addLast(new AbstractMap.SimpleImmutableEntry(Long.valueOf(j), keyEvent));
                if (((long) this.f17445a.size()) > 1000) {
                    "There are " + this.f17445a.size() + " keyboard events that have not yet received a response. Are responses being sent?";
                    return;
                }
                return;
            }
            throw new AssertionError("New events must have ids greater than the most recent pending event. New id " + j + " is less than or equal to the last event id of " + this.f17445a.getFirst().getKey());
        }

        /* renamed from: d */
        public void mo46310d(KeyEvent keyEvent) {
            View view = this.f17446b;
            if (view != null) {
                this.f17447c = true;
                view.getRootView().dispatchKeyEvent(keyEvent);
                this.f17447c = false;
            }
        }

        /* renamed from: e */
        public final KeyEvent mo46311e(long j) {
            if (((Long) this.f17445a.getFirst().getKey()).longValue() == j) {
                return (KeyEvent) this.f17445a.removeFirst().getValue();
            }
            throw new AssertionError("Event response received out of order. Should have seen event " + this.f17445a.getFirst().getKey() + " first. Instead, received " + j);
        }
    }

    public C8904a(@NonNull View view, @NonNull C8975c cVar, @NonNull C9038c cVar2) {
        this.f17441a = cVar;
        this.f17442b = cVar2;
        C8905a aVar = new C8905a(view);
        this.f17444d = aVar;
        this.f17441a.mo46520f(aVar);
    }

    @Nullable
    /* renamed from: a */
    public final Character mo46303a(int i) {
        if (i == 0) {
            return null;
        }
        char c = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = i & Integer.MAX_VALUE;
            int i3 = this.f17443c;
            if (i3 != 0) {
                this.f17443c = KeyCharacterMap.getDeadChar(i3, i2);
            } else {
                this.f17443c = i2;
            }
        } else {
            int i4 = this.f17443c;
            if (i4 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                if (deadChar > 0) {
                    c = (char) deadChar;
                }
                this.f17443c = 0;
            }
        }
        return Character.valueOf(c);
    }

    /* renamed from: b */
    public void mo46304b() {
        this.f17441a.mo46520f((C8975c.C8976a) null);
    }

    /* renamed from: c */
    public boolean mo46305c(@NonNull KeyEvent keyEvent) {
        if (this.f17444d.f17447c) {
            return false;
        }
        if (this.f17442b.mo46627p() != null && this.f17442b.mo46626o().isAcceptingText() && this.f17442b.mo46627p().sendKeyEvent(keyEvent)) {
            return true;
        }
        Character a = mo46303a(keyEvent.getUnicodeChar());
        long j = f17440e;
        f17440e = 1 + j;
        C8975c.C8977b bVar = new C8975c.C8977b(keyEvent, a, j);
        this.f17441a.mo46517c(bVar);
        this.f17444d.mo46309c(bVar.f17619m, keyEvent);
        return true;
    }

    /* renamed from: d */
    public boolean mo46306d(@NonNull KeyEvent keyEvent) {
        if (this.f17444d.f17447c) {
            return false;
        }
        Character a = mo46303a(keyEvent.getUnicodeChar());
        long j = f17440e;
        f17440e = 1 + j;
        C8975c.C8977b bVar = new C8975c.C8977b(keyEvent, a, j);
        this.f17441a.mo46518d(bVar);
        this.f17444d.mo46309c(bVar.f17619m, keyEvent);
        return true;
    }
}
