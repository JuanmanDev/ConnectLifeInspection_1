package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p308io.SerializedString;
import java.io.Serializable;
import p040c.p142n.p143a.p144a.C2065e;
import p040c.p142n.p143a.p144a.C2066f;

public class DefaultPrettyPrinter implements C2065e, Object<DefaultPrettyPrinter> {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    public static final long serialVersionUID = 1;
    public C3953a _arrayIndenter;
    public transient int _nesting;
    public C3953a _objectIndenter;
    public final C2066f _rootSeparator;
    public boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
            jsonGenerator.mo16780b(' ');
        }
    }

    @Deprecated
    public static class Lf2SpacesIndenter extends DefaultIndenter {
        @Deprecated
        public static final Lf2SpacesIndenter instance = new Lf2SpacesIndenter();

        @Deprecated
        public Lf2SpacesIndenter() {
            super("  ", DefaultIndenter.SYS_LF);
        }

        @Deprecated
        public Lf2SpacesIndenter(String str) {
            super("  ", str);
        }

        public Lf2SpacesIndenter withLinefeed(String str) {
            if (str.equals(getEol())) {
                return this;
            }
            return new Lf2SpacesIndenter(str);
        }
    }

    public static class NopIndenter implements C3953a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) {
        }
    }

    /* renamed from: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$a */
    public interface C3953a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i);
    }

    public DefaultPrettyPrinter() {
        this((C2066f) DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(C3953a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._arrayIndenter = aVar;
    }

    public void indentObjectsWith(C3953a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._objectIndenter = aVar;
    }

    @Deprecated
    public void spacesInObjectEntries(boolean z) {
        this._spacesInObjectEntries = z;
    }

    public DefaultPrettyPrinter withArrayIndenter(C3953a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._arrayIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(C3953a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._objectIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withRootSeparator(C2066f fVar) {
        C2066f fVar2 = this._rootSeparator;
        return (fVar2 == fVar || (fVar != null && fVar.equals(fVar2))) ? this : new DefaultPrettyPrinter(this, fVar);
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b(',');
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo16780b(' ');
        }
        jsonGenerator.mo16780b(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo16780b(' ');
        }
        jsonGenerator.mo16780b('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b(',');
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        if (this._spacesInObjectEntries) {
            jsonGenerator.mo16782d(" : ");
        } else {
            jsonGenerator.mo16780b(':');
        }
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        C2066f fVar = this._rootSeparator;
        if (fVar != null) {
            jsonGenerator.mo16781c(fVar);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.mo16780b('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.mo16780b('{');
        if (!this._objectIndenter.isInline()) {
            this._nesting++;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultPrettyPrinter(String str) {
        this((C2066f) str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter createInstance() {
        return new DefaultPrettyPrinter(this);
    }

    public DefaultPrettyPrinter(C2066f fVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._nesting = 0;
        this._rootSeparator = fVar;
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, C2066f fVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._nesting = 0;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._rootSeparator = fVar;
    }
}
