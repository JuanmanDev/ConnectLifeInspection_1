package com.hisense.connect_life.core.global;

import android.content.Context;
import com.hisense.connect_life.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/CountryConst;", "", "()V", "Companion", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CountryConst.kt */
public final class CountryConst {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/CountryConst$Companion;", "", "()V", "toCountryMap", "", "context", "Landroid/content/Context;", "country", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: CountryConst.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String toCountryMap(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "country");
            switch (str.hashCode()) {
                case 0:
                    if (str.equals("")) {
                        String string = context.getResources().getString(R$string.all_device);
                        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(R.string.all_device)");
                        return string;
                    }
                    break;
                case 2083:
                    if (str.equals("AD")) {
                        String string2 = context.getResources().getString(R$string.f15749AD);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getString(R.string.AD)");
                        return string2;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        String string3 = context.getResources().getString(R$string.f15750AE);
                        Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getString(R.string.AE)");
                        return string3;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        String string4 = context.getResources().getString(R$string.f15751AF);
                        Intrinsics.checkNotNullExpressionValue(string4, "context.resources.getString(R.string.AF)");
                        return string4;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        String string5 = context.getResources().getString(R$string.f15752AG);
                        Intrinsics.checkNotNullExpressionValue(string5, "context.resources.getString(R.string.AG)");
                        return string5;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        String string6 = context.getResources().getString(R$string.f15753AI);
                        Intrinsics.checkNotNullExpressionValue(string6, "context.resources.getString(R.string.AI)");
                        return string6;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        String string7 = context.getResources().getString(R$string.f15754AL);
                        Intrinsics.checkNotNullExpressionValue(string7, "context.resources.getString(R.string.AL)");
                        return string7;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        String string8 = context.getResources().getString(R$string.f15755AM);
                        Intrinsics.checkNotNullExpressionValue(string8, "context.resources.getString(R.string.AM)");
                        return string8;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        String string9 = context.getResources().getString(R$string.f15756AO);
                        Intrinsics.checkNotNullExpressionValue(string9, "context.resources.getString(R.string.AO)");
                        return string9;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        String string10 = context.getResources().getString(R$string.f15757AR);
                        Intrinsics.checkNotNullExpressionValue(string10, "context.resources.getString(R.string.AR)");
                        return string10;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        String string11 = context.getResources().getString(R$string.f15758AT);
                        Intrinsics.checkNotNullExpressionValue(string11, "context.resources.getString(R.string.AT)");
                        return string11;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        String string12 = context.getResources().getString(R$string.f15759AU);
                        Intrinsics.checkNotNullExpressionValue(string12, "context.resources.getString(R.string.AU)");
                        return string12;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        String string13 = context.getResources().getString(R$string.f15760AZ);
                        Intrinsics.checkNotNullExpressionValue(string13, "context.resources.getString(R.string.AZ)");
                        return string13;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        String string14 = context.getResources().getString(R$string.f15761BB);
                        Intrinsics.checkNotNullExpressionValue(string14, "context.resources.getString(R.string.BB)");
                        return string14;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        String string15 = context.getResources().getString(R$string.f15762BD);
                        Intrinsics.checkNotNullExpressionValue(string15, "context.resources.getString(R.string.BD)");
                        return string15;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        String string16 = context.getResources().getString(R$string.f15763BE);
                        Intrinsics.checkNotNullExpressionValue(string16, "context.resources.getString(R.string.BE)");
                        return string16;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        String string17 = context.getResources().getString(R$string.f15764BF);
                        Intrinsics.checkNotNullExpressionValue(string17, "context.resources.getString(R.string.BF)");
                        return string17;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        String string18 = context.getResources().getString(R$string.f15765BG);
                        Intrinsics.checkNotNullExpressionValue(string18, "context.resources.getString(R.string.BG)");
                        return string18;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        String string19 = context.getResources().getString(R$string.f15766BH);
                        Intrinsics.checkNotNullExpressionValue(string19, "context.resources.getString(R.string.BH)");
                        return string19;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        String string20 = context.getResources().getString(R$string.f15767BI);
                        Intrinsics.checkNotNullExpressionValue(string20, "context.resources.getString(R.string.BI)");
                        return string20;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        String string21 = context.getResources().getString(R$string.f15768BJ);
                        Intrinsics.checkNotNullExpressionValue(string21, "context.resources.getString(R.string.BJ)");
                        return string21;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        String string22 = context.getResources().getString(R$string.f15769BM);
                        Intrinsics.checkNotNullExpressionValue(string22, "context.resources.getString(R.string.BM)");
                        return string22;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        String string23 = context.getResources().getString(R$string.f15771BO);
                        Intrinsics.checkNotNullExpressionValue(string23, "context.resources.getString(R.string.BO)");
                        return string23;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        String string24 = context.getResources().getString(R$string.f15772BR);
                        Intrinsics.checkNotNullExpressionValue(string24, "context.resources.getString(R.string.BR)");
                        return string24;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        String string25 = context.getResources().getString(R$string.f15773BS);
                        Intrinsics.checkNotNullExpressionValue(string25, "context.resources.getString(R.string.BS)");
                        return string25;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        String string26 = context.getResources().getString(R$string.f15774BW);
                        Intrinsics.checkNotNullExpressionValue(string26, "context.resources.getString(R.string.BW)");
                        return string26;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        String string27 = context.getResources().getString(R$string.f15775BY);
                        Intrinsics.checkNotNullExpressionValue(string27, "context.resources.getString(R.string.BY)");
                        return string27;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        String string28 = context.getResources().getString(R$string.f15776BZ);
                        Intrinsics.checkNotNullExpressionValue(string28, "context.resources.getString(R.string.BZ)");
                        return string28;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        String string29 = context.getResources().getString(R$string.f15777CA);
                        Intrinsics.checkNotNullExpressionValue(string29, "context.resources.getString(R.string.CA)");
                        return string29;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        String string30 = context.getResources().getString(R$string.f15778CF);
                        Intrinsics.checkNotNullExpressionValue(string30, "context.resources.getString(R.string.CF)");
                        return string30;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        String string31 = context.getResources().getString(R$string.f15779CG);
                        Intrinsics.checkNotNullExpressionValue(string31, "context.resources.getString(R.string.CG)");
                        return string31;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        String string32 = context.getResources().getString(R$string.f15780CH);
                        Intrinsics.checkNotNullExpressionValue(string32, "context.resources.getString(R.string.CH)");
                        return string32;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        String string33 = context.getResources().getString(R$string.f15781CK);
                        Intrinsics.checkNotNullExpressionValue(string33, "context.resources.getString(R.string.CK)");
                        return string33;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        String string34 = context.getResources().getString(R$string.f15782CL);
                        Intrinsics.checkNotNullExpressionValue(string34, "context.resources.getString(R.string.CL)");
                        return string34;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        String string35 = context.getResources().getString(R$string.f15783CM);
                        Intrinsics.checkNotNullExpressionValue(string35, "context.resources.getString(R.string.CM)");
                        return string35;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        String string36 = context.getResources().getString(R$string.f15784CN);
                        Intrinsics.checkNotNullExpressionValue(string36, "context.resources.getString(R.string.CN)");
                        return string36;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        String string37 = context.getResources().getString(R$string.f15785CO);
                        Intrinsics.checkNotNullExpressionValue(string37, "context.resources.getString(R.string.CO)");
                        return string37;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        String string38 = context.getResources().getString(R$string.f15786CR);
                        Intrinsics.checkNotNullExpressionValue(string38, "context.resources.getString(R.string.CR)");
                        return string38;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        String string39 = context.getResources().getString(R$string.f15787CU);
                        Intrinsics.checkNotNullExpressionValue(string39, "context.resources.getString(R.string.CU)");
                        return string39;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        String string40 = context.getResources().getString(R$string.f15788CY);
                        Intrinsics.checkNotNullExpressionValue(string40, "context.resources.getString(R.string.CY)");
                        return string40;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        String string41 = context.getResources().getString(R$string.f15789CZ);
                        Intrinsics.checkNotNullExpressionValue(string41, "context.resources.getString(R.string.CZ)");
                        return string41;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        String string42 = context.getResources().getString(R$string.f15790DE);
                        Intrinsics.checkNotNullExpressionValue(string42, "context.resources.getString(R.string.DE)");
                        return string42;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        String string43 = context.getResources().getString(R$string.f15791DJ);
                        Intrinsics.checkNotNullExpressionValue(string43, "context.resources.getString(R.string.DJ)");
                        return string43;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        String string44 = context.getResources().getString(R$string.f15792DK);
                        Intrinsics.checkNotNullExpressionValue(string44, "context.resources.getString(R.string.DK)");
                        return string44;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        String string45 = context.getResources().getString(R$string.f15793DO);
                        Intrinsics.checkNotNullExpressionValue(string45, "context.resources.getString(R.string.DO)");
                        return string45;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        String string46 = context.getResources().getString(R$string.f15794DZ);
                        Intrinsics.checkNotNullExpressionValue(string46, "context.resources.getString(R.string.DZ)");
                        return string46;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        String string47 = context.getResources().getString(R$string.f15795EC);
                        Intrinsics.checkNotNullExpressionValue(string47, "context.resources.getString(R.string.EC)");
                        return string47;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        String string48 = context.getResources().getString(R$string.f15796EE);
                        Intrinsics.checkNotNullExpressionValue(string48, "context.resources.getString(R.string.EE)");
                        return string48;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        String string49 = context.getResources().getString(R$string.f15797EG);
                        Intrinsics.checkNotNullExpressionValue(string49, "context.resources.getString(R.string.EG)");
                        return string49;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        String string50 = context.getResources().getString(R$string.f15798ES);
                        Intrinsics.checkNotNullExpressionValue(string50, "context.resources.getString(R.string.ES)");
                        return string50;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        String string51 = context.getResources().getString(R$string.f15799ET);
                        Intrinsics.checkNotNullExpressionValue(string51, "context.resources.getString(R.string.ET)");
                        return string51;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        String string52 = context.getResources().getString(R$string.f15801FJ);
                        Intrinsics.checkNotNullExpressionValue(string52, "context.resources.getString(R.string.FJ)");
                        return string52;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        String string53 = context.getResources().getString(R$string.f15802FR);
                        Intrinsics.checkNotNullExpressionValue(string53, "context.resources.getString(R.string.FR)");
                        return string53;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        String string54 = context.getResources().getString(R$string.f15803GA);
                        Intrinsics.checkNotNullExpressionValue(string54, "context.resources.getString(R.string.GA)");
                        return string54;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        String string55 = context.getResources().getString(R$string.f15804GB);
                        Intrinsics.checkNotNullExpressionValue(string55, "context.resources.getString(R.string.GB)");
                        return string55;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        String string56 = context.getResources().getString(R$string.f15805GD);
                        Intrinsics.checkNotNullExpressionValue(string56, "context.resources.getString(R.string.GD)");
                        return string56;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        String string57 = context.getResources().getString(R$string.f15806GE);
                        Intrinsics.checkNotNullExpressionValue(string57, "context.resources.getString(R.string.GE)");
                        return string57;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        String string58 = context.getResources().getString(R$string.f15807GF);
                        Intrinsics.checkNotNullExpressionValue(string58, "context.resources.getString(R.string.GF)");
                        return string58;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        String string59 = context.getResources().getString(R$string.f15808GH);
                        Intrinsics.checkNotNullExpressionValue(string59, "context.resources.getString(R.string.GH)");
                        return string59;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        String string60 = context.getResources().getString(R$string.f15809GI);
                        Intrinsics.checkNotNullExpressionValue(string60, "context.resources.getString(R.string.GI)");
                        return string60;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        String string61 = context.getResources().getString(R$string.f15810GM);
                        Intrinsics.checkNotNullExpressionValue(string61, "context.resources.getString(R.string.GM)");
                        return string61;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        String string62 = context.getResources().getString(R$string.f15811GN);
                        Intrinsics.checkNotNullExpressionValue(string62, "context.resources.getString(R.string.GN)");
                        return string62;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        String string63 = context.getResources().getString(R$string.f15813GT);
                        Intrinsics.checkNotNullExpressionValue(string63, "context.resources.getString(R.string.GT)");
                        return string63;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        String string64 = context.getResources().getString(R$string.f15814GU);
                        Intrinsics.checkNotNullExpressionValue(string64, "context.resources.getString(R.string.GU)");
                        return string64;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        String string65 = context.getResources().getString(R$string.f15815GY);
                        Intrinsics.checkNotNullExpressionValue(string65, "context.resources.getString(R.string.GY)");
                        return string65;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        String string66 = context.getResources().getString(R$string.f15816HK);
                        Intrinsics.checkNotNullExpressionValue(string66, "context.resources.getString(R.string.HK)");
                        return string66;
                    }
                    break;
                case 2310:
                    if (str.equals("HN")) {
                        String string67 = context.getResources().getString(R$string.f15817HN);
                        Intrinsics.checkNotNullExpressionValue(string67, "context.resources.getString(R.string.HN)");
                        return string67;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        String string68 = context.getResources().getString(R$string.f15818HT);
                        Intrinsics.checkNotNullExpressionValue(string68, "context.resources.getString(R.string.HT)");
                        return string68;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        String string69 = context.getResources().getString(R$string.f15819HU);
                        Intrinsics.checkNotNullExpressionValue(string69, "context.resources.getString(R.string.HU)");
                        return string69;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        String string70 = context.getResources().getString(R$string.f15820ID);
                        Intrinsics.checkNotNullExpressionValue(string70, "context.resources.getString(R.string.ID)");
                        return string70;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        String string71 = context.getResources().getString(R$string.f15821IE);
                        Intrinsics.checkNotNullExpressionValue(string71, "context.resources.getString(R.string.IE)");
                        return string71;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        String string72 = context.getResources().getString(R$string.f15822IL);
                        Intrinsics.checkNotNullExpressionValue(string72, "context.resources.getString(R.string.IL)");
                        return string72;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        String string73 = context.getResources().getString(R$string.f15823IN);
                        Intrinsics.checkNotNullExpressionValue(string73, "context.resources.getString(R.string.IN)");
                        return string73;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        String string74 = context.getResources().getString(R$string.f15824IQ);
                        Intrinsics.checkNotNullExpressionValue(string74, "context.resources.getString(R.string.IQ)");
                        return string74;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        String string75 = context.getResources().getString(R$string.f15825IR);
                        Intrinsics.checkNotNullExpressionValue(string75, "context.resources.getString(R.string.IR)");
                        return string75;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        String string76 = context.getResources().getString(R$string.f15826IS);
                        Intrinsics.checkNotNullExpressionValue(string76, "context.resources.getString(R.string.IS)");
                        return string76;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        String string77 = context.getResources().getString(R$string.f15827IT);
                        Intrinsics.checkNotNullExpressionValue(string77, "context.resources.getString(R.string.IT)");
                        return string77;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        String string78 = context.getResources().getString(R$string.f15828JM);
                        Intrinsics.checkNotNullExpressionValue(string78, "context.resources.getString(R.string.JM)");
                        return string78;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        String string79 = context.getResources().getString(R$string.f15829JO);
                        Intrinsics.checkNotNullExpressionValue(string79, "context.resources.getString(R.string.JO)");
                        return string79;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        String string80 = context.getResources().getString(R$string.f15830JP);
                        Intrinsics.checkNotNullExpressionValue(string80, "context.resources.getString(R.string.JP)");
                        return string80;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        String string81 = context.getResources().getString(R$string.f15831KE);
                        Intrinsics.checkNotNullExpressionValue(string81, "context.resources.getString(R.string.KE)");
                        return string81;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        String string82 = context.getResources().getString(R$string.f15832KG);
                        Intrinsics.checkNotNullExpressionValue(string82, "context.resources.getString(R.string.KG)");
                        return string82;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        String string83 = context.getResources().getString(R$string.f15833KH);
                        Intrinsics.checkNotNullExpressionValue(string83, "context.resources.getString(R.string.KH)");
                        return string83;
                    }
                    break;
                case 2405:
                    if (str.equals("KP")) {
                        String string84 = context.getResources().getString(R$string.f15834KP);
                        Intrinsics.checkNotNullExpressionValue(string84, "context.resources.getString(R.string.KP)");
                        return string84;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        String string85 = context.getResources().getString(R$string.f15835KR);
                        Intrinsics.checkNotNullExpressionValue(string85, "context.resources.getString(R.string.KR)");
                        return string85;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        String string86 = context.getResources().getString(R$string.f15836KW);
                        Intrinsics.checkNotNullExpressionValue(string86, "context.resources.getString(R.string.KW)");
                        return string86;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        String string87 = context.getResources().getString(R$string.f15837KZ);
                        Intrinsics.checkNotNullExpressionValue(string87, "context.resources.getString(R.string.KZ)");
                        return string87;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        String string88 = context.getResources().getString(R$string.f15838LA);
                        Intrinsics.checkNotNullExpressionValue(string88, "context.resources.getString(R.string.LA)");
                        return string88;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        String string89 = context.getResources().getString(R$string.f15839LB);
                        Intrinsics.checkNotNullExpressionValue(string89, "context.resources.getString(R.string.LB)");
                        return string89;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        String string90 = context.getResources().getString(R$string.f15840LC);
                        Intrinsics.checkNotNullExpressionValue(string90, "context.resources.getString(R.string.LC)");
                        return string90;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        String string91 = context.getResources().getString(R$string.f15841LI);
                        Intrinsics.checkNotNullExpressionValue(string91, "context.resources.getString(R.string.LI)");
                        return string91;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        String string92 = context.getResources().getString(R$string.f15842LK);
                        Intrinsics.checkNotNullExpressionValue(string92, "context.resources.getString(R.string.LK)");
                        return string92;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        String string93 = context.getResources().getString(R$string.f15843LR);
                        Intrinsics.checkNotNullExpressionValue(string93, "context.resources.getString(R.string.LR)");
                        return string93;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        String string94 = context.getResources().getString(R$string.f15844LS);
                        Intrinsics.checkNotNullExpressionValue(string94, "context.resources.getString(R.string.LS)");
                        return string94;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        String string95 = context.getResources().getString(R$string.f15845LT);
                        Intrinsics.checkNotNullExpressionValue(string95, "context.resources.getString(R.string.LT)");
                        return string95;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        String string96 = context.getResources().getString(R$string.f15846LU);
                        Intrinsics.checkNotNullExpressionValue(string96, "context.resources.getString(R.string.LU)");
                        return string96;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        String string97 = context.getResources().getString(R$string.f15847LV);
                        Intrinsics.checkNotNullExpressionValue(string97, "context.resources.getString(R.string.LV)");
                        return string97;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        String string98 = context.getResources().getString(R$string.f15848LY);
                        Intrinsics.checkNotNullExpressionValue(string98, "context.resources.getString(R.string.LY)");
                        return string98;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        String string99 = context.getResources().getString(R$string.f15849MA);
                        Intrinsics.checkNotNullExpressionValue(string99, "context.resources.getString(R.string.MA)");
                        return string99;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        String string100 = context.getResources().getString(R$string.f15850MC);
                        Intrinsics.checkNotNullExpressionValue(string100, "context.resources.getString(R.string.MC)");
                        return string100;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        String string101 = context.getResources().getString(R$string.f15851MD);
                        Intrinsics.checkNotNullExpressionValue(string101, "context.resources.getString(R.string.MD)");
                        return string101;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        String string102 = context.getResources().getString(R$string.f15852MG);
                        Intrinsics.checkNotNullExpressionValue(string102, "context.resources.getString(R.string.MG)");
                        return string102;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        String string103 = context.getResources().getString(R$string.f15853ML);
                        Intrinsics.checkNotNullExpressionValue(string103, "context.resources.getString(R.string.ML)");
                        return string103;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        String string104 = context.getResources().getString(R$string.f15854MM);
                        Intrinsics.checkNotNullExpressionValue(string104, "context.resources.getString(R.string.MM)");
                        return string104;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        String string105 = context.getResources().getString(R$string.f15855MN);
                        Intrinsics.checkNotNullExpressionValue(string105, "context.resources.getString(R.string.MN)");
                        return string105;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        String string106 = context.getResources().getString(R$string.f15856MO);
                        Intrinsics.checkNotNullExpressionValue(string106, "context.resources.getString(R.string.MO)");
                        return string106;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        String string107 = context.getResources().getString(R$string.f15857MS);
                        Intrinsics.checkNotNullExpressionValue(string107, "context.resources.getString(R.string.MS)");
                        return string107;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        String string108 = context.getResources().getString(R$string.f15858MT);
                        Intrinsics.checkNotNullExpressionValue(string108, "context.resources.getString(R.string.MT)");
                        return string108;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        String string109 = context.getResources().getString(R$string.f15859MU);
                        Intrinsics.checkNotNullExpressionValue(string109, "context.resources.getString(R.string.MU)");
                        return string109;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        String string110 = context.getResources().getString(R$string.f15860MV);
                        Intrinsics.checkNotNullExpressionValue(string110, "context.resources.getString(R.string.MV)");
                        return string110;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        String string111 = context.getResources().getString(R$string.f15861MW);
                        Intrinsics.checkNotNullExpressionValue(string111, "context.resources.getString(R.string.MW)");
                        return string111;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        String string112 = context.getResources().getString(R$string.f15862MX);
                        Intrinsics.checkNotNullExpressionValue(string112, "context.resources.getString(R.string.MX)");
                        return string112;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        String string113 = context.getResources().getString(R$string.f15863MY);
                        Intrinsics.checkNotNullExpressionValue(string113, "context.resources.getString(R.string.MY)");
                        return string113;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        String string114 = context.getResources().getString(R$string.f15864MZ);
                        Intrinsics.checkNotNullExpressionValue(string114, "context.resources.getString(R.string.MZ)");
                        return string114;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        String string115 = context.getResources().getString(R$string.f15865NA);
                        Intrinsics.checkNotNullExpressionValue(string115, "context.resources.getString(R.string.NA)");
                        return string115;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        String string116 = context.getResources().getString(R$string.f15866NE);
                        Intrinsics.checkNotNullExpressionValue(string116, "context.resources.getString(R.string.NE)");
                        return string116;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        String string117 = context.getResources().getString(R$string.f15867NG);
                        Intrinsics.checkNotNullExpressionValue(string117, "context.resources.getString(R.string.NG)");
                        return string117;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        String string118 = context.getResources().getString(R$string.f15868NI);
                        Intrinsics.checkNotNullExpressionValue(string118, "context.resources.getString(R.string.NI)");
                        return string118;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        String string119 = context.getResources().getString(R$string.f15869NL);
                        Intrinsics.checkNotNullExpressionValue(string119, "context.resources.getString(R.string.NL)");
                        return string119;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        String string120 = context.getResources().getString(R$string.f15870NP);
                        Intrinsics.checkNotNullExpressionValue(string120, "context.resources.getString(R.string.NP)");
                        return string120;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        String string121 = context.getResources().getString(R$string.f15871NR);
                        Intrinsics.checkNotNullExpressionValue(string121, "context.resources.getString(R.string.NR)");
                        return string121;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        String string122 = context.getResources().getString(R$string.f15872NZ);
                        Intrinsics.checkNotNullExpressionValue(string122, "context.resources.getString(R.string.NZ)");
                        return string122;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        String string123 = context.getResources().getString(R$string.f15874OM);
                        Intrinsics.checkNotNullExpressionValue(string123, "context.resources.getString(R.string.OM)");
                        return string123;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        String string124 = context.getResources().getString(R$string.f15875PA);
                        Intrinsics.checkNotNullExpressionValue(string124, "context.resources.getString(R.string.PA)");
                        return string124;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        String string125 = context.getResources().getString(R$string.f15876PE);
                        Intrinsics.checkNotNullExpressionValue(string125, "context.resources.getString(R.string.PE)");
                        return string125;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        String string126 = context.getResources().getString(R$string.f15876PE);
                        Intrinsics.checkNotNullExpressionValue(string126, "context.resources.getString(R.string.PE)");
                        return string126;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        String string127 = context.getResources().getString(R$string.f15878PG);
                        Intrinsics.checkNotNullExpressionValue(string127, "context.resources.getString(R.string.PG)");
                        return string127;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        String string128 = context.getResources().getString(R$string.f15879PH);
                        Intrinsics.checkNotNullExpressionValue(string128, "context.resources.getString(R.string.PH)");
                        return string128;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        String string129 = context.getResources().getString(R$string.f15880PK);
                        Intrinsics.checkNotNullExpressionValue(string129, "context.resources.getString(R.string.PK)");
                        return string129;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        String string130 = context.getResources().getString(R$string.f15881PL);
                        Intrinsics.checkNotNullExpressionValue(string130, "context.resources.getString(R.string.PL)");
                        return string130;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        String string131 = context.getResources().getString(R$string.f15882PR);
                        Intrinsics.checkNotNullExpressionValue(string131, "context.resources.getString(R.string.PR)");
                        return string131;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        String string132 = context.getResources().getString(R$string.f15883PT);
                        Intrinsics.checkNotNullExpressionValue(string132, "context.resources.getString(R.string.PT)");
                        return string132;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        String string133 = context.getResources().getString(R$string.f15884PY);
                        Intrinsics.checkNotNullExpressionValue(string133, "context.resources.getString(R.string.PY)");
                        return string133;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        String string134 = context.getResources().getString(R$string.f15885QA);
                        Intrinsics.checkNotNullExpressionValue(string134, "context.resources.getString(R.string.QA)");
                        return string134;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        String string135 = context.getResources().getString(R$string.f15886RO);
                        Intrinsics.checkNotNullExpressionValue(string135, "context.resources.getString(R.string.RO)");
                        return string135;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        String string136 = context.getResources().getString(R$string.f15887RU);
                        Intrinsics.checkNotNullExpressionValue(string136, "context.resources.getString(R.string.RU)");
                        return string136;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        String string137 = context.getResources().getString(R$string.f15888SA);
                        Intrinsics.checkNotNullExpressionValue(string137, "context.resources.getString(R.string.SA)");
                        return string137;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        String string138 = context.getResources().getString(R$string.f15889SB);
                        Intrinsics.checkNotNullExpressionValue(string138, "context.resources.getString(R.string.SB)");
                        return string138;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        String string139 = context.getResources().getString(R$string.f15890SC);
                        Intrinsics.checkNotNullExpressionValue(string139, "context.resources.getString(R.string.SC)");
                        return string139;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        String string140 = context.getResources().getString(R$string.f15891SD);
                        Intrinsics.checkNotNullExpressionValue(string140, "context.resources.getString(R.string.SD)");
                        return string140;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        String string141 = context.getResources().getString(R$string.f15892SE);
                        Intrinsics.checkNotNullExpressionValue(string141, "context.resources.getString(R.string.SE)");
                        return string141;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        String string142 = context.getResources().getString(R$string.f15893SG);
                        Intrinsics.checkNotNullExpressionValue(string142, "context.resources.getString(R.string.SG)");
                        return string142;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        String string143 = context.getResources().getString(R$string.f15894SI);
                        Intrinsics.checkNotNullExpressionValue(string143, "context.resources.getString(R.string.SI)");
                        return string143;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        String string144 = context.getResources().getString(R$string.f15895SK);
                        Intrinsics.checkNotNullExpressionValue(string144, "context.resources.getString(R.string.SK)");
                        return string144;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        String string145 = context.getResources().getString(R$string.f15896SL);
                        Intrinsics.checkNotNullExpressionValue(string145, "context.resources.getString(R.string.SL)");
                        return string145;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        String string146 = context.getResources().getString(R$string.f15897SM);
                        Intrinsics.checkNotNullExpressionValue(string146, "context.resources.getString(R.string.SM)");
                        return string146;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        String string147 = context.getResources().getString(R$string.f15898SN);
                        Intrinsics.checkNotNullExpressionValue(string147, "context.resources.getString(R.string.SN)");
                        return string147;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        String string148 = context.getResources().getString(R$string.f15899SO);
                        Intrinsics.checkNotNullExpressionValue(string148, "context.resources.getString(R.string.SO)");
                        return string148;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        String string149 = context.getResources().getString(R$string.f15900SR);
                        Intrinsics.checkNotNullExpressionValue(string149, "context.resources.getString(R.string.SR)");
                        return string149;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        String string150 = context.getResources().getString(R$string.f15901ST);
                        Intrinsics.checkNotNullExpressionValue(string150, "context.resources.getString(R.string.ST)");
                        return string150;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        String string151 = context.getResources().getString(R$string.f15902SV);
                        Intrinsics.checkNotNullExpressionValue(string151, "context.resources.getString(R.string.SV)");
                        return string151;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        String string152 = context.getResources().getString(R$string.f15903SY);
                        Intrinsics.checkNotNullExpressionValue(string152, "context.resources.getString(R.string.SY)");
                        return string152;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        String string153 = context.getResources().getString(R$string.f15904SZ);
                        Intrinsics.checkNotNullExpressionValue(string153, "context.resources.getString(R.string.SZ)");
                        return string153;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        String string154 = context.getResources().getString(R$string.f15905TD);
                        Intrinsics.checkNotNullExpressionValue(string154, "context.resources.getString(R.string.TD)");
                        return string154;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        String string155 = context.getResources().getString(R$string.f15906TG);
                        Intrinsics.checkNotNullExpressionValue(string155, "context.resources.getString(R.string.TG)");
                        return string155;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        String string156 = context.getResources().getString(R$string.f15907TH);
                        Intrinsics.checkNotNullExpressionValue(string156, "context.resources.getString(R.string.TH)");
                        return string156;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        String string157 = context.getResources().getString(R$string.f15908TJ);
                        Intrinsics.checkNotNullExpressionValue(string157, "context.resources.getString(R.string.TJ)");
                        return string157;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        String string158 = context.getResources().getString(R$string.f15909TM);
                        Intrinsics.checkNotNullExpressionValue(string158, "context.resources.getString(R.string.TM)");
                        return string158;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        String string159 = context.getResources().getString(R$string.f15910TN);
                        Intrinsics.checkNotNullExpressionValue(string159, "context.resources.getString(R.string.TN)");
                        return string159;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        String string160 = context.getResources().getString(R$string.f15911TO);
                        Intrinsics.checkNotNullExpressionValue(string160, "context.resources.getString(R.string.TO)");
                        return string160;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        String string161 = context.getResources().getString(R$string.f15912TR);
                        Intrinsics.checkNotNullExpressionValue(string161, "context.resources.getString(R.string.TR)");
                        return string161;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        String string162 = context.getResources().getString(R$string.f15913TT);
                        Intrinsics.checkNotNullExpressionValue(string162, "context.resources.getString(R.string.TT)");
                        return string162;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        String string163 = context.getResources().getString(R$string.f15914TW);
                        Intrinsics.checkNotNullExpressionValue(string163, "context.resources.getString(R.string.TW)");
                        return string163;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        String string164 = context.getResources().getString(R$string.f15915TZ);
                        Intrinsics.checkNotNullExpressionValue(string164, "context.resources.getString(R.string.TZ)");
                        return string164;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        String string165 = context.getResources().getString(R$string.f15916UA);
                        Intrinsics.checkNotNullExpressionValue(string165, "context.resources.getString(R.string.UA)");
                        return string165;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        String string166 = context.getResources().getString(R$string.f15917UG);
                        Intrinsics.checkNotNullExpressionValue(string166, "context.resources.getString(R.string.UG)");
                        return string166;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        String string167 = context.getResources().getString(R$string.f15918US);
                        Intrinsics.checkNotNullExpressionValue(string167, "context.resources.getString(R.string.US)");
                        return string167;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        String string168 = context.getResources().getString(R$string.f15919UY);
                        Intrinsics.checkNotNullExpressionValue(string168, "context.resources.getString(R.string.UY)");
                        return string168;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        String string169 = context.getResources().getString(R$string.f15920UZ);
                        Intrinsics.checkNotNullExpressionValue(string169, "context.resources.getString(R.string.UZ)");
                        return string169;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        String string170 = context.getResources().getString(R$string.f15921VC);
                        Intrinsics.checkNotNullExpressionValue(string170, "context.resources.getString(R.string.VC)");
                        return string170;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        String string171 = context.getResources().getString(R$string.f15922VE);
                        Intrinsics.checkNotNullExpressionValue(string171, "context.resources.getString(R.string.VE)");
                        return string171;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        String string172 = context.getResources().getString(R$string.f15923VN);
                        Intrinsics.checkNotNullExpressionValue(string172, "context.resources.getString(R.string.VN)");
                        return string172;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        String string173 = context.getResources().getString(R$string.f15924YE);
                        Intrinsics.checkNotNullExpressionValue(string173, "context.resources.getString(R.string.YE)");
                        return string173;
                    }
                    break;
                case 2844:
                    if (str.equals("YU")) {
                        String string174 = context.getResources().getString(R$string.f15925YU);
                        Intrinsics.checkNotNullExpressionValue(string174, "context.resources.getString(R.string.YU)");
                        return string174;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        String string175 = context.getResources().getString(R$string.f15926ZA);
                        Intrinsics.checkNotNullExpressionValue(string175, "context.resources.getString(R.string.ZA)");
                        return string175;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        String string176 = context.getResources().getString(R$string.f15927ZM);
                        Intrinsics.checkNotNullExpressionValue(string176, "context.resources.getString(R.string.ZM)");
                        return string176;
                    }
                    break;
                case 2872:
                    if (str.equals("ZR")) {
                        String string177 = context.getResources().getString(R$string.f15928ZR);
                        Intrinsics.checkNotNullExpressionValue(string177, "context.resources.getString(R.string.ZR)");
                        return string177;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        String string178 = context.getResources().getString(R$string.f15929ZW);
                        Intrinsics.checkNotNullExpressionValue(string178, "context.resources.getString(R.string.ZW)");
                        return string178;
                    }
                    break;
            }
            String string179 = context.getResources().getString(R$string.all_device);
            Intrinsics.checkNotNullExpressionValue(string179, "context.resources.getString(R.string.all_device)");
            return string179;
        }
    }
}
