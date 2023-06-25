package com.fasterxml.jackson.core.p308io;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import p040c.p142n.p143a.p144a.p147j.C2073b;

/* renamed from: com.fasterxml.jackson.core.io.OutputDecorator */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(C2073b bVar, OutputStream outputStream);

    public abstract Writer decorate(C2073b bVar, Writer writer);
}
