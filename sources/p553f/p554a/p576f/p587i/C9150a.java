package p553f.p554a.p576f.p587i;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(19)
/* renamed from: f.a.f.i.a */
/* compiled from: DisplayListenerProxy */
public class C9150a {

    /* renamed from: a */
    public ArrayList<DisplayManager.DisplayListener> f17925a;

    /* renamed from: f.a.f.i.a$a */
    /* compiled from: DisplayListenerProxy */
    public class C9151a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f17926a;

        /* renamed from: b */
        public final /* synthetic */ DisplayManager f17927b;

        public C9151a(C9150a aVar, ArrayList arrayList, DisplayManager displayManager) {
            this.f17926a = arrayList;
            this.f17927b = displayManager;
        }

        public void onDisplayAdded(int i) {
            Iterator it = this.f17926a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i);
            }
        }

        public void onDisplayChanged(int i) {
            if (this.f17927b.getDisplay(i) != null) {
                Iterator it = this.f17926a.iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i);
                }
            }
        }

        public void onDisplayRemoved(int i) {
            Iterator it = this.f17926a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i);
            }
        }
    }

    /* renamed from: c */
    public static ArrayList<DisplayManager.DisplayListener> m24813c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) declaredField2.get(obj)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            "Could not extract WebView's display listeners. " + e;
            return new ArrayList<>();
        }
    }

    /* renamed from: a */
    public void mo46881a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> c = m24813c(displayManager);
        c.removeAll(this.f17925a);
        if (!c.isEmpty()) {
            Iterator<DisplayManager.DisplayListener> it = c.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener(it.next());
                displayManager.registerDisplayListener(new C9151a(this, c, displayManager), (Handler) null);
            }
        }
    }

    /* renamed from: b */
    public void mo46882b(DisplayManager displayManager) {
        this.f17925a = m24813c(displayManager);
    }
}
