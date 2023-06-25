package p691no.nordicsemi.android.dfu.internal.scanner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p691no.nordicsemi.android.dfu.DfuDeviceSelector;

/* renamed from: no.nordicsemi.android.dfu.internal.scanner.BootloaderScanner */
public interface BootloaderScanner {
    @Nullable
    String searchUsing(@NonNull DfuDeviceSelector dfuDeviceSelector, long j);
}
