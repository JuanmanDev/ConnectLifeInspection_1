package p691no.nordicsemi.android.dfu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p641l.p642a.p643a.p647b.C9599a;
import p691no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;

/* renamed from: no.nordicsemi.android.dfu.DfuServiceListenerHelper */
public class DfuServiceListenerHelper {
    public static LogBroadcastReceiver mLogBroadcastReceiver;
    public static ProgressBroadcastsReceiver mProgressBroadcastReceiver;

    /* renamed from: no.nordicsemi.android.dfu.DfuServiceListenerHelper$LogBroadcastReceiver */
    public static class LogBroadcastReceiver extends BroadcastReceiver {
        public DfuLogListener mGlobalLogListener;
        public final Map<String, DfuLogListener> mListeners;

        public LogBroadcastReceiver() {
            this.mListeners = new HashMap();
        }

        /* access modifiers changed from: private */
        public boolean removeLogListener(DfuLogListener dfuLogListener) {
            if (this.mGlobalLogListener == dfuLogListener) {
                this.mGlobalLogListener = null;
            }
            Iterator<Map.Entry<String, DfuLogListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (next.getValue() == dfuLogListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuLogListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next2 = it2.next();
                if (next2.getValue() == dfuLogListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalLogListener == null && this.mListeners.isEmpty();
        }

        /* access modifiers changed from: private */
        public void setLogListener(DfuLogListener dfuLogListener) {
            this.mGlobalLogListener = dfuLogListener;
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            DfuLogListener dfuLogListener = this.mGlobalLogListener;
            DfuLogListener dfuLogListener2 = this.mListeners.get(stringExtra);
            if (dfuLogListener != null || dfuLogListener2 != null) {
                int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_LOG_LEVEL, 0);
                String stringExtra2 = intent.getStringExtra(DfuBaseService.EXTRA_LOG_MESSAGE);
                if (dfuLogListener != null) {
                    dfuLogListener.onLogEvent(stringExtra, intExtra, stringExtra2);
                }
                if (dfuLogListener2 != null) {
                    dfuLogListener2.onLogEvent(stringExtra, intExtra, stringExtra2);
                }
            }
        }

        /* access modifiers changed from: private */
        public void setLogListener(String str, DfuLogListener dfuLogListener) {
            this.mListeners.put(str, dfuLogListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuLogListener);
        }
    }

    /* renamed from: no.nordicsemi.android.dfu.DfuServiceListenerHelper$ProgressBroadcastsReceiver */
    public static class ProgressBroadcastsReceiver extends BroadcastReceiver {
        public DfuProgressListener mGlobalProgressListener;
        public final Map<String, DfuProgressListener> mListeners;

        public ProgressBroadcastsReceiver() {
            this.mListeners = new HashMap();
        }

        /* access modifiers changed from: private */
        public boolean removeProgressListener(DfuProgressListener dfuProgressListener) {
            if (this.mGlobalProgressListener == dfuProgressListener) {
                this.mGlobalProgressListener = null;
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (next.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next2 = it2.next();
                if (next2.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalProgressListener == null && this.mListeners.isEmpty();
        }

        /* access modifiers changed from: private */
        public void setProgressListener(DfuProgressListener dfuProgressListener) {
            this.mGlobalProgressListener = dfuProgressListener;
        }

        public void onReceive(Context context, Intent intent) {
            String action;
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            if (stringExtra != null) {
                DfuProgressListener dfuProgressListener = this.mGlobalProgressListener;
                DfuProgressListener dfuProgressListener2 = this.mListeners.get(stringExtra);
                if ((dfuProgressListener != null || dfuProgressListener2 != null) && (action = intent.getAction()) != null) {
                    char c = 65535;
                    int hashCode = action.hashCode();
                    if (hashCode != -2021868104) {
                        if (hashCode == -1282379203 && action.equals(DfuBaseService.BROADCAST_ERROR)) {
                            c = 1;
                        }
                    } else if (action.equals(DfuBaseService.BROADCAST_PROGRESS)) {
                        c = 0;
                    }
                    if (c == 0) {
                        int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
                        float floatExtra = intent.getFloatExtra(DfuBaseService.EXTRA_SPEED_B_PER_MS, 0.0f);
                        float floatExtra2 = intent.getFloatExtra(DfuBaseService.EXTRA_AVG_SPEED_B_PER_MS, 0.0f);
                        int intExtra2 = intent.getIntExtra(DfuBaseService.EXTRA_PART_CURRENT, 0);
                        int intExtra3 = intent.getIntExtra(DfuBaseService.EXTRA_PARTS_TOTAL, 0);
                        switch (intExtra) {
                            case -7:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onDeviceDisconnected(stringExtra);
                                    dfuProgressListener.onDfuAborted(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onDeviceDisconnected(stringExtra);
                                    dfuProgressListener2.onDfuAborted(stringExtra);
                                    return;
                                }
                                return;
                            case -6:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onDeviceDisconnected(stringExtra);
                                    dfuProgressListener.onDfuCompleted(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onDeviceDisconnected(stringExtra);
                                    dfuProgressListener2.onDfuCompleted(stringExtra);
                                    return;
                                }
                                return;
                            case -5:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onDeviceDisconnecting(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onDeviceDisconnecting(stringExtra);
                                    return;
                                }
                                return;
                            case -4:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onFirmwareValidating(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onFirmwareValidating(stringExtra);
                                    return;
                                }
                                return;
                            case -3:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onEnablingDfuMode(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onEnablingDfuMode(stringExtra);
                                    return;
                                }
                                return;
                            case -2:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onDeviceConnected(stringExtra);
                                    dfuProgressListener.onDfuProcessStarting(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onDeviceConnected(stringExtra);
                                    dfuProgressListener2.onDfuProcessStarting(stringExtra);
                                    return;
                                }
                                return;
                            case -1:
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onDeviceConnecting(stringExtra);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onDeviceConnecting(stringExtra);
                                    return;
                                }
                                return;
                            default:
                                if (intExtra == 0) {
                                    if (dfuProgressListener != null) {
                                        dfuProgressListener.onDfuProcessStarted(stringExtra);
                                    }
                                    if (dfuProgressListener2 != null) {
                                        dfuProgressListener2.onDfuProcessStarted(stringExtra);
                                    }
                                }
                                if (dfuProgressListener != null) {
                                    dfuProgressListener.onProgressChanged(stringExtra, intExtra, floatExtra, floatExtra2, intExtra2, intExtra3);
                                }
                                if (dfuProgressListener2 != null) {
                                    dfuProgressListener2.onProgressChanged(stringExtra, intExtra, floatExtra, floatExtra2, intExtra2, intExtra3);
                                    return;
                                }
                                return;
                        }
                    } else if (c == 1) {
                        int intExtra4 = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
                        int intExtra5 = intent.getIntExtra(DfuBaseService.EXTRA_ERROR_TYPE, 0);
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onDeviceDisconnected(stringExtra);
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        }
                        if (intExtra5 == 1) {
                            if (dfuProgressListener != null) {
                                dfuProgressListener.onError(stringExtra, intExtra4, intExtra5, C9599a.m25759b(intExtra4));
                            }
                            if (dfuProgressListener2 != null) {
                                dfuProgressListener2.onError(stringExtra, intExtra4, intExtra5, C9599a.m25759b(intExtra4));
                            }
                        } else if (intExtra5 != 3) {
                            if (dfuProgressListener != null) {
                                dfuProgressListener.onError(stringExtra, intExtra4, intExtra5, C9599a.m25758a(intExtra4));
                            }
                            if (dfuProgressListener2 != null) {
                                dfuProgressListener2.onError(stringExtra, intExtra4, intExtra5, C9599a.m25758a(intExtra4));
                            }
                        } else {
                            if (dfuProgressListener != null) {
                                dfuProgressListener.onError(stringExtra, intExtra4, intExtra5, C9599a.m25760c(intExtra4));
                            }
                            if (dfuProgressListener2 != null) {
                                dfuProgressListener2.onError(stringExtra, intExtra4, intExtra5, C9599a.m25760c(intExtra4));
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public void setProgressListener(String str, DfuProgressListener dfuProgressListener) {
            this.mListeners.put(str, dfuProgressListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuProgressListener);
        }
    }

    public static void registerLogListener(@NonNull Context context, @NonNull DfuLogListener dfuLogListener) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            LocalBroadcastManager.getInstance(context).registerReceiver(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(dfuLogListener);
    }

    public static void registerProgressListener(@NonNull Context context, @NonNull DfuProgressListener dfuProgressListener) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            LocalBroadcastManager.getInstance(context).registerReceiver(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(dfuProgressListener);
    }

    public static void unregisterLogListener(@NonNull Context context, @NonNull DfuLogListener dfuLogListener) {
        LogBroadcastReceiver logBroadcastReceiver = mLogBroadcastReceiver;
        if (logBroadcastReceiver != null && logBroadcastReceiver.removeLogListener(dfuLogListener)) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(mLogBroadcastReceiver);
            mLogBroadcastReceiver = null;
        }
    }

    public static void unregisterProgressListener(@NonNull Context context, @NonNull DfuProgressListener dfuProgressListener) {
        ProgressBroadcastsReceiver progressBroadcastsReceiver = mProgressBroadcastReceiver;
        if (progressBroadcastsReceiver != null && progressBroadcastsReceiver.removeProgressListener(dfuProgressListener)) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(mProgressBroadcastReceiver);
            mProgressBroadcastReceiver = null;
        }
    }

    public static void registerLogListener(@NonNull Context context, @NonNull DfuLogListener dfuLogListener, @NonNull String str) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            LocalBroadcastManager.getInstance(context).registerReceiver(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(str, dfuLogListener);
    }

    public static void registerProgressListener(@NonNull Context context, @NonNull DfuProgressListener dfuProgressListener, @NonNull String str) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            LocalBroadcastManager.getInstance(context).registerReceiver(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(str, dfuProgressListener);
    }
}
