package p040c.p200q.p406e.p426q.p427b;

import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.q.b.c */
/* compiled from: DataMask */
public enum C7137c {
    DATA_MASK_000 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* renamed from: c */
        public boolean mo32855c(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* renamed from: c */
    public abstract boolean mo32855c(int i, int i2);

    /* renamed from: d */
    public final void mo32856d(C7033b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo32855c(i2, i3)) {
                    bVar.mo32532c(i3, i2);
                }
            }
        }
    }
}
