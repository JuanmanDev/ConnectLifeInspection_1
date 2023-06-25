package com.google.protobuf;

import java.util.List;
import java.util.Map;
import p040c.p200q.p405d.C6903d1;
import p040c.p200q.p405d.C6917g0;

public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    void mo32134A(int i, List<Integer> list, boolean z);

    /* renamed from: B */
    void mo32135B(int i, List<Boolean> list, boolean z);

    /* renamed from: C */
    <K, V> void mo32136C(int i, C6917g0.C6918a<K, V> aVar, Map<K, V> map);

    /* renamed from: D */
    void mo32137D(int i, List<Integer> list, boolean z);

    /* renamed from: E */
    void mo32138E(int i, List<Long> list, boolean z);

    /* renamed from: F */
    void mo32139F(int i, long j);

    /* renamed from: G */
    void mo32140G(int i, float f);

    @Deprecated
    /* renamed from: H */
    void mo32141H(int i);

    /* renamed from: I */
    void mo32142I(int i, List<Integer> list, boolean z);

    /* renamed from: J */
    void mo32143J(int i, int i2);

    /* renamed from: K */
    void mo32144K(int i, List<Long> list, boolean z);

    /* renamed from: L */
    void mo32145L(int i, List<Integer> list, boolean z);

    /* renamed from: M */
    void mo32146M(int i, List<Double> list, boolean z);

    /* renamed from: N */
    void mo32147N(int i, int i2);

    /* renamed from: O */
    void mo32148O(int i, List<ByteString> list);

    /* renamed from: a */
    void mo32155a(int i, List<?> list, C6903d1 d1Var);

    @Deprecated
    /* renamed from: b */
    void mo32156b(int i, List<?> list, C6903d1 d1Var);

    /* renamed from: c */
    void mo32157c(int i, List<Float> list, boolean z);

    /* renamed from: d */
    void mo32158d(int i, int i2);

    /* renamed from: e */
    void mo32159e(int i, Object obj);

    /* renamed from: f */
    void mo32160f(int i, int i2);

    /* renamed from: g */
    void mo32161g(int i, double d);

    /* renamed from: h */
    void mo32162h(int i, List<Long> list, boolean z);

    /* renamed from: i */
    void mo32163i(int i, List<Long> list, boolean z);

    /* renamed from: j */
    void mo32164j(int i, Object obj, C6903d1 d1Var);

    /* renamed from: k */
    void mo32165k(int i, long j);

    /* renamed from: l */
    FieldOrder mo32166l();

    /* renamed from: m */
    void mo32167m(int i, List<String> list);

    /* renamed from: n */
    void mo32168n(int i, String str);

    /* renamed from: o */
    void mo32169o(int i, long j);

    /* renamed from: p */
    void mo32170p(int i, List<Integer> list, boolean z);

    /* renamed from: q */
    void mo32171q(int i, long j);

    /* renamed from: r */
    void mo32172r(int i, boolean z);

    @Deprecated
    /* renamed from: s */
    void mo32173s(int i, Object obj, C6903d1 d1Var);

    /* renamed from: t */
    void mo32174t(int i, int i2);

    @Deprecated
    /* renamed from: u */
    void mo32175u(int i);

    /* renamed from: v */
    void mo32176v(int i, ByteString byteString);

    /* renamed from: w */
    void mo32177w(int i, int i2);

    /* renamed from: x */
    void mo32178x(int i, List<Long> list, boolean z);

    /* renamed from: y */
    void mo32179y(int i, List<Integer> list, boolean z);

    /* renamed from: z */
    void mo32180z(int i, long j);
}
