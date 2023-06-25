package p040c.p313b0.p314a.p319i;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(19)
/* renamed from: c.b0.a.i.b */
/* compiled from: DisplayListenerProxy */
public class C4169b {

    /* renamed from: a */
    public ArrayList<DisplayManager.DisplayListener> f8790a;

    /* renamed from: c.b0.a.i.b$a */
    /* compiled from: DisplayListenerProxy */
    public class C4170a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8791a;

        /* renamed from: b */
        public final /* synthetic */ DisplayManager f8792b;

        public C4170a(C4169b bVar, ArrayList arrayList, DisplayManager displayManager) {
            this.f8791a = arrayList;
            this.f8792b = displayManager;
        }

        public void onDisplayAdded(int i) {
            Iterator it = this.f8791a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i);
            }
        }

        public void onDisplayChanged(int i) {
            if (this.f8792b.getDisplay(i) != null) {
                Iterator it = this.f8791a.iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i);
                }
            }
        }

        public void onDisplayRemoved(int i) {
            Iterator it = this.f8791a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i);
            }
        }
    }

    /* renamed from: c */
    public static ArrayList<DisplayManager.DisplayListener> m11433c(DisplayManager displayManager) {
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
    public void mo25522a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> c = m11433c(displayManager);
        c.removeAll(this.f8790a);
        if (!c.isEmpty()) {
            Iterator<DisplayManager.DisplayListener> it = c.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener(it.next());
                displayManager.registerDisplayListener(new C4170a(this, c, displayManager), (Handler) null);
            }
        }
    }

    /* renamed from: b */
    public void mo25523b(DisplayManager displayManager) {
        this.f8790a = m11433c(displayManager);
    }
}
