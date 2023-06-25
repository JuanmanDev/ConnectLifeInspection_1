package com.fasterxml.jackson.core.p308io;

import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import p040c.p142n.p143a.p144a.p147j.C2073b;

/* renamed from: com.fasterxml.jackson.core.io.InputDecorator */
public abstract class InputDecorator implements Serializable {
    public static final long serialVersionUID = 1;

    public abstract InputStream decorate(C2073b bVar, InputStream inputStream);

    public abstract InputStream decorate(C2073b bVar, byte[] bArr, int i, int i2);

    public abstract Reader decorate(C2073b bVar, Reader reader);
}
