package p691no.nordicsemi.android.dfu.internal.manifest;

import com.google.gson.annotations.SerializedName;

/* renamed from: no.nordicsemi.android.dfu.internal.manifest.Manifest */
public class Manifest {
    public FileInfo application;
    public FileInfo bootloader;
    @SerializedName("bootloader_application")
    public FileInfo bootloaderApplication;
    public FileInfo softdevice;
    @SerializedName("softdevice_application")
    public FileInfo softdeviceApplication;
    @SerializedName("softdevice_bootloader")
    public SoftDeviceBootloaderFileInfo softdeviceBootloader;
    @SerializedName("softdevice_bootloader_application")
    public FileInfo softdeviceBootloaderApplication;

    public FileInfo getApplicationInfo() {
        FileInfo fileInfo = this.application;
        if (fileInfo != null) {
            return fileInfo;
        }
        FileInfo fileInfo2 = this.softdeviceApplication;
        if (fileInfo2 != null) {
            return fileInfo2;
        }
        FileInfo fileInfo3 = this.bootloaderApplication;
        if (fileInfo3 != null) {
            return fileInfo3;
        }
        return this.softdeviceBootloaderApplication;
    }

    public FileInfo getBootloaderInfo() {
        return this.bootloader;
    }

    public SoftDeviceBootloaderFileInfo getSoftdeviceBootloaderInfo() {
        return this.softdeviceBootloader;
    }

    public FileInfo getSoftdeviceInfo() {
        return this.softdevice;
    }

    public boolean isSecureDfuRequired() {
        return (this.bootloaderApplication == null && this.softdeviceApplication == null && this.softdeviceBootloaderApplication == null) ? false : true;
    }
}
