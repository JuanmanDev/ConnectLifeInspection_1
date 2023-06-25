package p691no.nordicsemi.android.dfu.internal.scanner;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;

/* renamed from: no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory */
public final class BootloaderScannerFactory {
    public static final int ADDRESS_DIFF = 1;

    public static String getIncrementedAddress(@NonNull String str) {
        String substring = str.substring(0, 15);
        String substring2 = str.substring(15);
        String format = String.format(Locale.US, "%02X", new Object[]{Integer.valueOf((Integer.valueOf(substring2, 16).intValue() + 1) & 255)});
        return substring + format;
    }

    public static BootloaderScanner getScanner(@NonNull String str) {
        String incrementedAddress = getIncrementedAddress(str);
        if (Build.VERSION.SDK_INT >= 21) {
            return new BootloaderScannerLollipop(str, incrementedAddress);
        }
        return new BootloaderScannerJB(str, incrementedAddress);
    }
}
