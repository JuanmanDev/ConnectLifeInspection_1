package androidx.test.runner.screenshot;

import android.graphics.Bitmap;
import androidx.test.InstrumentationRegistry;

public class UiAutomationWrapper {
    public Bitmap takeScreenshot() {
        return InstrumentationRegistry.getInstrumentation().getUiAutomation().takeScreenshot();
    }
}
