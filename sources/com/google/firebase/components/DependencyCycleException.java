package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import p040c.p200q.p363c.p369m.C6439o;

public class DependencyCycleException extends DependencyException {
    public final List<C6439o<?>> componentsInCycle;

    public DependencyCycleException(List<C6439o<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<C6439o<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
