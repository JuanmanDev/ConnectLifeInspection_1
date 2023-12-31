package com.google.zxing;

import java.util.List;
import p040c.p200q.p406e.C7024j;

public enum DecodeHintType {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C7024j.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    
    public final Class<?> valueType;

    /* access modifiers changed from: public */
    DecodeHintType(Class<?> cls) {
        this.valueType = cls;
    }

    public Class<?> getValueType() {
        return this.valueType;
    }
}
