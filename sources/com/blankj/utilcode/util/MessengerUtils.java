package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MessengerUtils {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C3813a> f6968a = new ConcurrentHashMap<>();

    public static class ServerService extends Service {

        /* renamed from: e */
        public final ConcurrentHashMap<Integer, Messenger> f6969e = new ConcurrentHashMap<>();
        @SuppressLint({"HandlerLeak"})

        /* renamed from: l */
        public final Handler f6970l = new C3812a();

        /* renamed from: m */
        public final Messenger f6971m = new Messenger(this.f6970l);

        /* renamed from: com.blankj.utilcode.util.MessengerUtils$ServerService$a */
        public class C3812a extends Handler {
            public C3812a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ServerService.this.f6969e.put(Integer.valueOf(message.arg1), message.replyTo);
                } else if (i == 1) {
                    ServerService.this.f6969e.remove(Integer.valueOf(message.arg1));
                } else if (i != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.mo21581f(message);
                    ServerService.this.mo21580e(message);
                }
            }
        }

        /* renamed from: e */
        public final void mo21580e(Message message) {
            String string;
            C3813a aVar;
            Bundle data = message.getData();
            if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && (aVar = (C3813a) MessengerUtils.f6968a.get(string)) != null) {
                aVar.mo21585a(data);
            }
        }

        /* renamed from: f */
        public final void mo21581f(Message message) {
            for (Messenger next : this.f6969e.values()) {
                if (next != null) {
                    try {
                        next.send(message);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Nullable
        public IBinder onBind(Intent intent) {
            return this.f6971m.getBinder();
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            Bundle extras;
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                Message obtain = Message.obtain(this.f6970l, 2);
                obtain.replyTo = this.f6971m;
                obtain.setData(extras);
                mo21581f(obtain);
                mo21580e(obtain);
            }
            return 2;
        }
    }

    /* renamed from: com.blankj.utilcode.util.MessengerUtils$a */
    public interface C3813a {
        /* renamed from: a */
        void mo21585a(Bundle bundle);
    }

    static {
        new HashMap();
    }
}
