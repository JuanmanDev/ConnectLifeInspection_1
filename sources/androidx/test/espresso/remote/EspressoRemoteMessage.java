package androidx.test.espresso.remote;

public interface EspressoRemoteMessage {

    public interface From<T, M> {
        T fromProto(M m);
    }

    /* renamed from: androidx.test.espresso.remote.EspressoRemoteMessage$To */
    public interface C1099To<M> {
        M toProto();
    }
}
