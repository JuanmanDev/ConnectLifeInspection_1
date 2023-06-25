package com.p530ju.lib.datacommunication.network.http.core;

import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7664d;

/* renamed from: com.ju.lib.datacommunication.network.http.core.HttpException */
public class HttpException extends Exception {
    public static final long serialVersionUID = -259187862179187092L;
    public final int mCode;
    public C7664d.C7668d mTrace;

    public HttpException(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }

    public C7664d.C7668d getTrace() {
        return this.mTrace;
    }

    public void setTrace(C7664d.C7668d dVar) {
        this.mTrace = dVar;
    }

    public String toString() {
        String message = getMessage();
        String name = HttpException.class.getName();
        if (message == null) {
            return name + ": code = " + this.mCode;
        }
        return name + ": code = " + this.mCode + ", msg = " + message;
    }

    public HttpException() {
        this(-1);
    }

    public HttpException(int i, String str, Throwable th) {
        super(str, th);
        this.mCode = i;
    }

    public HttpException(int i, String str) {
        super(str);
        this.mCode = i;
    }

    public HttpException(int i, Throwable th) {
        super(th);
        this.mCode = i;
    }
}
