package p691no.nordicsemi.android.dfu.internal.manifest;

import com.google.gson.annotations.SerializedName;

/* renamed from: no.nordicsemi.android.dfu.internal.manifest.SoftDeviceBootloaderFileInfo */
public class SoftDeviceBootloaderFileInfo extends FileInfo {
    @SerializedName("bl_size")
    public int bootloaderSize;
    @SerializedName("sd_size")
    public int softdeviceSize;

    public int getBootloaderSize() {
        return this.bootloaderSize;
    }

    public int getSoftdeviceSize() {
        return this.softdeviceSize;
    }
}
