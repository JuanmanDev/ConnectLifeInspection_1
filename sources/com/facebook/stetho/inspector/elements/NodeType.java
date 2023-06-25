package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.json.annotation.JsonValue;

public enum NodeType {
    ELEMENT_NODE(1),
    TEXT_NODE(3),
    PROCESSING_INSTRUCTION_NODE(7),
    COMMENT_NODE(8),
    DOCUMENT_NODE(9),
    DOCUMENT_TYPE_NODE(10),
    DOCUMENT_FRAGMENT_NODE(11);
    
    public final int mValue;

    /* access modifiers changed from: public */
    NodeType(int i) {
        this.mValue = i;
    }

    @JsonValue
    public int getProtocolValue() {
        return this.mValue;
    }
}
