package org.java_websocket.exceptions;

import androidx.core.view.PointerIconCompat;

public class LimitExceededException extends InvalidDataException {
    public static final long serialVersionUID = 6908339749836826785L;
    public final int limit;

    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }

    public int getLimit() {
        return this.limit;
    }

    public LimitExceededException(int i) {
        super(PointerIconCompat.TYPE_VERTICAL_TEXT);
        this.limit = i;
    }

    public LimitExceededException(String str, int i) {
        super((int) PointerIconCompat.TYPE_VERTICAL_TEXT, str);
        this.limit = i;
    }

    public LimitExceededException(String str) {
        this(str, Integer.MAX_VALUE);
    }
}
