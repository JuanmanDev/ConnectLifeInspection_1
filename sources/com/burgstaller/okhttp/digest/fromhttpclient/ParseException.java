package com.burgstaller.okhttp.digest.fromhttpclient;

public class ParseException extends RuntimeException {
    public static final long serialVersionUID = -7288819855864183578L;

    public ParseException() {
    }

    public ParseException(String str) {
        super(str);
    }
}
