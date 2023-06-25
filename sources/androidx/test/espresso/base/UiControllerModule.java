package androidx.test.espresso.base;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.test.espresso.UiController$$CC;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.platform.p033ui.InjectEventSecurityException;
import androidx.test.platform.p033ui.UiController;
import java.util.List;

public class UiControllerModule {

    public static class EspressoUiControllerAdapter implements InterruptableUiController {
        public final UiController platformUiController;

        public boolean injectKeyEvent(KeyEvent keyEvent) {
            try {
                return this.platformUiController.injectKeyEvent(keyEvent);
            } catch (InjectEventSecurityException e) {
                throw new androidx.test.espresso.InjectEventSecurityException((Throwable) e);
            }
        }

        public boolean injectMotionEvent(MotionEvent motionEvent) {
            try {
                return this.platformUiController.injectMotionEvent(motionEvent);
            } catch (InjectEventSecurityException e) {
                throw new androidx.test.espresso.InjectEventSecurityException((Throwable) e);
            }
        }

        public boolean injectMotionEventSequence(Iterable iterable) {
            return UiController$$CC.injectMotionEventSequence$$dflt$$(this, iterable);
        }

        public boolean injectString(String str) {
            try {
                return this.platformUiController.injectString(str);
            } catch (InjectEventSecurityException e) {
                throw new androidx.test.espresso.InjectEventSecurityException((Throwable) e);
            }
        }

        public void interruptEspressoTasks() {
        }

        public void loopMainThreadForAtLeast(long j) {
            this.platformUiController.loopMainThreadForAtLeast(j);
        }

        public void loopMainThreadUntilIdle() {
            this.platformUiController.loopMainThreadUntilIdle();
        }

        public EspressoUiControllerAdapter(UiController uiController) {
            this.platformUiController = uiController;
        }
    }

    public androidx.test.espresso.UiController provideUiController(UiControllerImpl uiControllerImpl) {
        List<UiController> loadService = ServiceLoaderWrapper.loadService(UiController.class);
        if (loadService.isEmpty()) {
            return uiControllerImpl;
        }
        if (loadService.size() == 1) {
            return new EspressoUiControllerAdapter(loadService.get(0));
        }
        throw new IllegalStateException("Found more than one androidx.test.internal.platform.UiController");
    }
}
