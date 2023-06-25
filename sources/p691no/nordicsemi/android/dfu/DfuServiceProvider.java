package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import androidx.annotation.NonNull;
import p691no.nordicsemi.android.dfu.DfuCallback;

/* renamed from: no.nordicsemi.android.dfu.DfuServiceProvider */
public class DfuServiceProvider implements DfuCallback {
    public boolean mAborted;
    public BaseDfuImpl mImpl;
    public boolean mPaused;

    public void abort() {
        this.mAborted = true;
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            baseDfuImpl.abort();
        }
    }

    public DfuCallback.DfuGattCallback getGattCallback() {
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            return baseDfuImpl.getGattCallback();
        }
        return null;
    }

    public DfuService getServiceImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService, @NonNull BluetoothGatt bluetoothGatt) {
        try {
            ButtonlessDfuWithBondSharingImpl buttonlessDfuWithBondSharingImpl = new ButtonlessDfuWithBondSharingImpl(intent, dfuBaseService);
            this.mImpl = buttonlessDfuWithBondSharingImpl;
            if (buttonlessDfuWithBondSharingImpl.isClientCompatible(intent, bluetoothGatt)) {
                return this.mImpl;
            }
            ButtonlessDfuWithoutBondSharingImpl buttonlessDfuWithoutBondSharingImpl = new ButtonlessDfuWithoutBondSharingImpl(intent, dfuBaseService);
            this.mImpl = buttonlessDfuWithoutBondSharingImpl;
            if (buttonlessDfuWithoutBondSharingImpl.isClientCompatible(intent, bluetoothGatt)) {
                BaseDfuImpl baseDfuImpl = this.mImpl;
                BaseDfuImpl baseDfuImpl2 = this.mImpl;
                if (baseDfuImpl2 != null) {
                    if (this.mPaused) {
                        baseDfuImpl2.pause();
                    }
                    if (this.mAborted) {
                        this.mImpl.abort();
                    }
                }
                return baseDfuImpl;
            }
            SecureDfuImpl secureDfuImpl = new SecureDfuImpl(intent, dfuBaseService);
            this.mImpl = secureDfuImpl;
            if (secureDfuImpl.isClientCompatible(intent, bluetoothGatt)) {
                BaseDfuImpl baseDfuImpl3 = this.mImpl;
                BaseDfuImpl baseDfuImpl4 = this.mImpl;
                if (baseDfuImpl4 != null) {
                    if (this.mPaused) {
                        baseDfuImpl4.pause();
                    }
                    if (this.mAborted) {
                        this.mImpl.abort();
                    }
                }
                return baseDfuImpl3;
            }
            LegacyButtonlessDfuImpl legacyButtonlessDfuImpl = new LegacyButtonlessDfuImpl(intent, dfuBaseService);
            this.mImpl = legacyButtonlessDfuImpl;
            if (legacyButtonlessDfuImpl.isClientCompatible(intent, bluetoothGatt)) {
                BaseDfuImpl baseDfuImpl5 = this.mImpl;
                BaseDfuImpl baseDfuImpl6 = this.mImpl;
                if (baseDfuImpl6 != null) {
                    if (this.mPaused) {
                        baseDfuImpl6.pause();
                    }
                    if (this.mAborted) {
                        this.mImpl.abort();
                    }
                }
                return baseDfuImpl5;
            }
            LegacyDfuImpl legacyDfuImpl = new LegacyDfuImpl(intent, dfuBaseService);
            this.mImpl = legacyDfuImpl;
            if (legacyDfuImpl.isClientCompatible(intent, bluetoothGatt)) {
                BaseDfuImpl baseDfuImpl7 = this.mImpl;
                BaseDfuImpl baseDfuImpl8 = this.mImpl;
                if (baseDfuImpl8 != null) {
                    if (this.mPaused) {
                        baseDfuImpl8.pause();
                    }
                    if (this.mAborted) {
                        this.mImpl.abort();
                    }
                }
                return baseDfuImpl7;
            }
            if (intent.getBooleanExtra(DfuBaseService.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU, false)) {
                ExperimentalButtonlessDfuImpl experimentalButtonlessDfuImpl = new ExperimentalButtonlessDfuImpl(intent, dfuBaseService);
                this.mImpl = experimentalButtonlessDfuImpl;
                if (experimentalButtonlessDfuImpl.isClientCompatible(intent, bluetoothGatt)) {
                    BaseDfuImpl baseDfuImpl9 = this.mImpl;
                    BaseDfuImpl baseDfuImpl10 = this.mImpl;
                    if (baseDfuImpl10 != null) {
                        if (this.mPaused) {
                            baseDfuImpl10.pause();
                        }
                        if (this.mAborted) {
                            this.mImpl.abort();
                        }
                    }
                    return baseDfuImpl9;
                }
            }
            BaseDfuImpl baseDfuImpl11 = this.mImpl;
            if (baseDfuImpl11 != null) {
                if (this.mPaused) {
                    baseDfuImpl11.pause();
                }
                if (this.mAborted) {
                    this.mImpl.abort();
                }
            }
            return null;
        } finally {
            BaseDfuImpl baseDfuImpl12 = this.mImpl;
            if (baseDfuImpl12 != null) {
                if (this.mPaused) {
                    baseDfuImpl12.pause();
                }
                if (this.mAborted) {
                    this.mImpl.abort();
                }
            }
        }
    }

    public void onBondStateChanged(int i) {
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            baseDfuImpl.onBondStateChanged(i);
        }
    }

    public void pause() {
        this.mPaused = true;
    }

    public void resume() {
        this.mPaused = false;
    }
}
