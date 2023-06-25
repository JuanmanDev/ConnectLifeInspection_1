package p040c.p200q.p201a.p219b.p250l0.p256p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.l0.p.b */
/* compiled from: TtmlNode */
public final class C3078b {
    @Nullable

    /* renamed from: a */
    public final String f5538a;
    @Nullable

    /* renamed from: b */
    public final String f5539b;

    /* renamed from: c */
    public final boolean f5540c;

    /* renamed from: d */
    public final long f5541d;

    /* renamed from: e */
    public final long f5542e;
    @Nullable

    /* renamed from: f */
    public final C3081e f5543f;
    @Nullable

    /* renamed from: g */
    public final String[] f5544g;

    /* renamed from: h */
    public final String f5545h;
    @Nullable

    /* renamed from: i */
    public final String f5546i;

    /* renamed from: j */
    public final HashMap<String, Integer> f5547j;

    /* renamed from: k */
    public final HashMap<String, Integer> f5548k;

    /* renamed from: l */
    public List<C3078b> f5549l;

    public C3078b(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable C3081e eVar, @Nullable String[] strArr, String str3, @Nullable String str4) {
        this.f5538a = str;
        this.f5539b = str2;
        this.f5546i = str4;
        this.f5543f = eVar;
        this.f5544g = strArr;
        this.f5540c = str2 != null;
        this.f5541d = j;
        this.f5542e = j2;
        C3151e.m7757e(str3);
        this.f5545h = str3;
        this.f5547j = new HashMap<>();
        this.f5548k = new HashMap<>();
    }

    /* renamed from: c */
    public static C3078b m7377c(@Nullable String str, long j, long j2, @Nullable C3081e eVar, @Nullable String[] strArr, String str2, @Nullable String str3) {
        return new C3078b(str, (String) null, j, j2, eVar, strArr, str2, str3);
    }

    /* renamed from: d */
    public static C3078b m7378d(String str) {
        return new C3078b((String) null, C3080d.m7393b(str), -9223372036854775807L, -9223372036854775807L, (C3081e) null, (String[]) null, "", (String) null);
    }

    /* renamed from: k */
    public static SpannableStringBuilder m7379k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: a */
    public void mo19730a(C3078b bVar) {
        if (this.f5549l == null) {
            this.f5549l = new ArrayList();
        }
        this.f5549l.add(bVar);
    }

    /* renamed from: b */
    public final void mo19731b(Map<String, C3081e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        C3081e d = C3080d.m7395d(this.f5543f, this.f5544g, map);
        if (d != null) {
            C3080d.m7392a(spannableStringBuilder, i, i2, d);
        }
    }

    /* renamed from: e */
    public final SpannableStringBuilder mo19732e(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int length = spannableStringBuilder.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == 10) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == 10) {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    /* renamed from: f */
    public C3078b mo19733f(int i) {
        List<C3078b> list = this.f5549l;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo19734g() {
        List<C3078b> list = this.f5549l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C3031a> mo19735h(long j, Map<String, C3081e> map, Map<String, C3079c> map2, Map<String, String> map3) {
        long j2 = j;
        Map<String, C3079c> map4 = map2;
        ArrayList<Pair> arrayList = new ArrayList<>();
        mo19739m(j2, this.f5545h, arrayList);
        TreeMap treeMap = new TreeMap();
        mo19741o(j, false, this.f5545h, treeMap);
        mo19740n(j2, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C3079c cVar = map4.get(pair.first);
                arrayList2.add(new C3031a(decodeByteArray, cVar.f5551b, 1, cVar.f5552c, cVar.f5554e, cVar.f5555f, Float.MIN_VALUE));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C3079c cVar2 = map4.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            mo19732e(spannableStringBuilder);
            arrayList2.add(new C3031a((CharSequence) spannableStringBuilder, (Layout.Alignment) null, cVar2.f5552c, cVar2.f5553d, cVar2.f5554e, cVar2.f5551b, Integer.MIN_VALUE, cVar2.f5555f, cVar2.f5556g, cVar2.f5557h));
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void mo19736i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f5538a);
        boolean equals2 = "div".equals(this.f5538a);
        if (z || equals || (equals2 && this.f5546i != null)) {
            long j = this.f5541d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f5542e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f5549l != null) {
            for (int i = 0; i < this.f5549l.size(); i++) {
                this.f5549l.get(i).mo19736i(treeSet, z || equals);
            }
        }
    }

    /* renamed from: j */
    public long[] mo19737j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        mo19736i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public boolean mo19738l(long j) {
        return (this.f5541d == -9223372036854775807L && this.f5542e == -9223372036854775807L) || (this.f5541d <= j && this.f5542e == -9223372036854775807L) || ((this.f5541d == -9223372036854775807L && j < this.f5542e) || (this.f5541d <= j && j < this.f5542e));
    }

    /* renamed from: m */
    public final void mo19739m(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f5545h)) {
            str = this.f5545h;
        }
        if (!mo19738l(j) || !"div".equals(this.f5538a) || this.f5546i == null) {
            for (int i = 0; i < mo19734g(); i++) {
                mo19733f(i).mo19739m(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f5546i));
    }

    /* renamed from: n */
    public final void mo19740n(long j, Map<String, C3081e> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (mo19738l(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.f5548k.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (this.f5547j.containsKey(str)) {
                    i = this.f5547j.get(str).intValue();
                }
                int intValue = ((Integer) next.getValue()).intValue();
                if (i != intValue) {
                    mo19731b(map, map2.get(str), i, intValue);
                }
            }
            while (i < mo19734g()) {
                mo19733f(i).mo19740n(j, map, map2);
                i++;
            }
        }
    }

    /* renamed from: o */
    public final void mo19741o(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f5547j.clear();
        this.f5548k.clear();
        if (!"metadata".equals(this.f5538a)) {
            if (!"".equals(this.f5545h)) {
                str = this.f5545h;
            }
            if (this.f5540c && z) {
                m7379k(str, map).append(this.f5539b);
            } else if ("br".equals(this.f5538a) && z) {
                m7379k(str, map).append(10);
            } else if (mo19738l(j)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f5547j.put(next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
                }
                boolean equals = "p".equals(this.f5538a);
                for (int i = 0; i < mo19734g(); i++) {
                    mo19733f(i).mo19741o(j, z || equals, str, map);
                }
                if (equals) {
                    C3080d.m7394c(m7379k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f5548k.put(next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
                }
            }
        }
    }
}
