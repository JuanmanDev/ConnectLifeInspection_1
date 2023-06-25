package com.juconnect.connectlife.ju_dist.utils;

import com.juconnect.connectlife.ju_dist.fbean.ResultData;
import com.juconnect.connectlife.ju_dist.fbean.ResultInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/Test;", "", "()V", "name", "", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Test.kt */
public final class Test {
    public final void name() {
        ResultData resultData = new ResultData();
        if (resultData.getResponse() != null) {
            ResultInfo response = resultData.getResponse();
            Intrinsics.checkNotNull(response);
            Integer resultCode = response.getResultCode();
            if (resultCode != null) {
                resultCode.intValue();
            }
        }
    }
}
