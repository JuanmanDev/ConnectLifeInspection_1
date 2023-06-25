package com.amazon.identity.auth.device.workflow;

public enum WorkflowCancellation$Cause {
    USER_TERMINATED;

    public static WorkflowCancellation$Cause fromCode(int i) {
        return USER_TERMINATED;
    }
}
