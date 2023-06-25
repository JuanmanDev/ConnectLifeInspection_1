package com.burgstaller.okhttp.digest.fromhttpclient;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.Serializable;
import p040c.p107e.p108a.p109e.p110d.C1981i;
import p040c.p107e.p108a.p109e.p110d.C1982j;

public class BasicNameValuePair implements C1982j, Cloneable, Serializable {
    public static final long serialVersionUID = -6437800749411518984L;
    public final String name;
    public final String value;

    public BasicNameValuePair(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1982j)) {
            return false;
        }
        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
        if ((!this.name.equals(basicNameValuePair.name) || this.value != basicNameValuePair.value) && ((str = this.value) == null || !str.equals(basicNameValuePair.value))) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return C1981i.m2652d(C1981i.m2652d(17, this.name), this.value);
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
        sb.append(this.value);
        return sb.toString();
    }
}
