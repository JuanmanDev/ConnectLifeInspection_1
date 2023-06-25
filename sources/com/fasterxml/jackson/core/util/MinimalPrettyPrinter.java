package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Serializable;
import p040c.p142n.p143a.p144a.C2065e;

public class MinimalPrettyPrinter implements C2065e, Serializable {
    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    public static final long serialVersionUID = -562765100295218442L;
    public String _rootValueSeparator;

    public MinimalPrettyPrinter() {
        this(" ");
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b(',');
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.mo16780b(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.mo16780b('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b(',');
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b(':');
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.mo16782d(str);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b('{');
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = " ";
        this._rootValueSeparator = str;
    }
}
