package org.junit.internal.runners.model;

import java.util.List;

@Deprecated
public class MultipleFailureException extends org.junit.runners.model.MultipleFailureException {
    public static final long serialVersionUID = 1;

    public MultipleFailureException(List<Throwable> list) {
        super(list);
    }
}
