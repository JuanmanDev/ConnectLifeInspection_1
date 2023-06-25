package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p308io.CharacterEscapes;
import com.fasterxml.jackson.core.p308io.InputDecorator;
import com.fasterxml.jackson.core.p308io.OutputDecorator;
import com.fasterxml.jackson.core.p308io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;
import p040c.p142n.p143a.p144a.C2062b;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.C2066f;
import p040c.p142n.p143a.p144a.p146i.C2071a;
import p040c.p142n.p143a.p144a.p147j.C2073b;
import p040c.p142n.p143a.p144a.p147j.C2077f;
import p040c.p142n.p143a.p144a.p148k.C2078a;
import p040c.p142n.p143a.p144a.p148k.C2083f;
import p040c.p142n.p143a.p144a.p148k.C2084g;
import p040c.p142n.p143a.p144a.p148k.C2085h;
import p040c.p142n.p143a.p144a.p148k.C2087j;
import p040c.p142n.p143a.p144a.p149l.C2088a;
import p040c.p142n.p143a.p144a.p149l.C2091b;
import p040c.p142n.p143a.p144a.p150m.C2094a;

public class JsonFactory implements Serializable {
    public static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    public static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final C2066f DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    public static final String FORMAT_NAME_JSON = "JSON";
    public static final ThreadLocal<SoftReference<C2094a>> _recyclerRef = new ThreadLocal<>();
    public static final long serialVersionUID = 3306684576057132431L;
    public CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public InputDecorator _inputDecorator;
    public C2064d _objectCodec;
    public OutputDecorator _outputDecorator;
    public int _parserFeatures;
    public final transient C2088a _rootByteSymbols;
    public final transient C2091b _rootCharSymbols;
    public C2066f _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true);
        
        public final boolean _defaultState;

        /* access modifiers changed from: public */
        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((C2064d) null);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (JsonFactory.class != cls) {
            throw new IllegalStateException("Failed copy(): " + JsonFactory.class.getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    public C2073b _createContext(Object obj, boolean z) {
        return new C2073b(_getBufferRecycler(), obj, z);
    }

    public JsonGenerator _createGenerator(Writer writer, C2073b bVar) {
        C2087j jVar = new C2087j(bVar, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            jVar.mo16773i(characterEscapes);
        }
        C2066f fVar = this._rootValueSeparator;
        if (fVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            jVar.mo16775m(fVar);
        }
        return jVar;
    }

    public JsonParser _createParser(InputStream inputStream, C2073b bVar) {
        return new C2078a(bVar, inputStream).mo16767c(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, C2073b bVar) {
        C2085h hVar = new C2085h(bVar, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            hVar.mo16773i(characterEscapes);
        }
        C2066f fVar = this._rootValueSeparator;
        if (fVar != DEFAULT_ROOT_VALUE_SEPARATOR) {
            hVar.mo16775m(fVar);
        }
        return hVar;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C2073b bVar) {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new C2077f(bVar, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream _decorate(java.io.InputStream r2, p040c.p142n.p143a.p144a.p147j.C2073b r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.InputStream r3 = r0.decorate((p040c.p142n.p143a.p144a.p147j.C2073b) r3, (java.io.InputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.InputStream, c.n.a.a.j.b):java.io.InputStream");
    }

    public C2094a _getBufferRecycler() {
        C2094a aVar;
        SoftReference softReference = _recyclerRef.get();
        if (softReference == null) {
            aVar = null;
        } else {
            aVar = (C2094a) softReference.get();
        }
        if (aVar != null) {
            return aVar;
        }
        C2094a aVar2 = new C2094a();
        _recyclerRef.set(new SoftReference(aVar2));
        return aVar2;
    }

    public InputStream _optimizedStreamFromURL(URL url) {
        String host;
        if (!"file".equals(url.getProtocol()) || (((host = url.getHost()) != null && host.length() != 0) || url.getPath().indexOf(37) >= 0)) {
            return url.openStream();
        }
        return new FileInputStream(url.getPath());
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(C2062b bVar) {
        String formatName = getFormatName();
        return formatName != null && formatName.equals(bVar.mo16694a());
    }

    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (C2064d) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        C2073b _createContext = _createContext(outputStream, false);
        _createContext.mo16729q(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) {
        return createParser(file);
    }

    public JsonParser createParser(File file) {
        C2073b _createContext = _createContext(file, true);
        return _createParser(_decorate((InputStream) new FileInputStream(file), _createContext), _createContext);
    }

    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public C2064d getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        if (JsonFactory.class == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public String getRootValueSeparator() {
        C2066f fVar = this._rootValueSeparator;
        if (fVar == null) {
            return null;
        }
        return fVar.getValue();
    }

    public MatchStrength hasFormat(C2071a aVar) {
        if (JsonFactory.class == JsonFactory.class) {
            return hasJSONFormat(aVar);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(C2071a aVar) {
        return C2078a.m2940h(aVar);
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(C2064d dVar) {
        this._objectCodec = dVar;
        return this;
    }

    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public Version version() {
        return C2083f.f1987a;
    }

    public JsonFactory(C2064d dVar) {
        this._rootCharSymbols = C2091b.m2994b();
        this._rootByteSymbols = C2088a.m2986a();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = dVar;
    }

    public JsonParser _createParser(Reader reader, C2073b bVar) {
        return new C2084g(bVar, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.mo16806f(this._factoryFeatures));
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) {
        return createParser(url);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, C2073b bVar, boolean z) {
        return new C2084g(bVar, this._parserFeatures, (Reader) null, this._objectCodec, this._rootCharSymbols.mo16806f(this._factoryFeatures), cArr, i, i + i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Reader _decorate(java.io.Reader r2, p040c.p142n.p143a.p144a.p147j.C2073b r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Reader r3 = r0.decorate((p040c.p142n.p143a.p144a.p147j.C2073b) r3, (java.io.Reader) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Reader, c.n.a.a.j.b):java.io.Reader");
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) {
        return createParser(inputStream);
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, C2073b bVar) {
        return new C2078a(bVar, bArr, i, i2).mo16767c(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonEncoding) {
        return createGenerator(file, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) {
        return createParser(reader);
    }

    public JsonParser createParser(URL url) {
        C2073b _createContext = _createContext(url, true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.OutputStream _decorate(java.io.OutputStream r2, p040c.p142n.p143a.p144a.p147j.C2073b r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.OutputStream r3 = r0.decorate((p040c.p142n.p143a.p144a.p147j.C2073b) r3, (java.io.OutputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.OutputStream, c.n.a.a.j.b):java.io.OutputStream");
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) {
        return createParser(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Writer _decorate(java.io.Writer r2, p040c.p142n.p143a.p144a.p147j.C2073b r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Writer r3 = r0.decorate((p040c.p142n.p143a.p144a.p147j.C2073b) r3, (java.io.Writer) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Writer, c.n.a.a.j.b):java.io.Writer");
    }

    public JsonGenerator createGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) {
        return createParser(str);
    }

    public JsonParser createParser(InputStream inputStream) {
        C2073b _createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(Writer writer) {
        C2073b _createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    public JsonParser createParser(Reader reader) {
        C2073b _createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public JsonFactory(JsonFactory jsonFactory, C2064d dVar) {
        this._rootCharSymbols = C2091b.m2994b();
        this._rootByteSymbols = C2088a.m2986a();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        C2073b _createContext = _createContext(fileOutputStream, true);
        _createContext.mo16729q(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate((OutputStream) fileOutputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonParser createParser(byte[] bArr) {
        InputStream decorate;
        C2073b _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length)) == null) {
            return _createParser(bArr, 0, bArr.length, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) {
        InputStream decorate;
        C2073b _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, i, i2)) == null) {
            return _createParser(bArr, i, i2, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser((Reader) new StringReader(str));
        }
        C2073b _createContext = _createContext(str, true);
        char[] g = _createContext.mo16719g(length);
        str.getChars(0, length, g, 0);
        return _createParser(g, 0, length, _createContext, true);
    }

    public JsonParser createParser(char[] cArr) {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) {
        if (this._inputDecorator != null) {
            return createParser((Reader) new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(cArr, true), false);
    }
}
