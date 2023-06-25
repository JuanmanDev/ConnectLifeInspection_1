package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

public class TestTimedOutException extends Exception {
    public static final long serialVersionUID = 31935685163547539L;
    public final TimeUnit timeUnit;
    public final long timeout;

    public TestTimedOutException(long j, TimeUnit timeUnit2) {
        super(String.format("test timed out after %d %s", new Object[]{Long.valueOf(j), timeUnit2.name().toLowerCase()}));
        this.timeUnit = timeUnit2;
        this.timeout = j;
    }

    public TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public long getTimeout() {
        return this.timeout;
    }
}
