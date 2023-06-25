package com.amazon.identity.auth.device.workflow;

public enum WorkflowConstants$API {
    RESPONSE_URL("com.amazon.identity.auth.device.workflow.responseUrl"),
    CANCELLATION_CODE("com.amazon.identity.auth.device.workflow.cancellationCode"),
    CANCELLATION_DESCRIPTION("com.amazon.identity.auth.device.workflow.cancellationDescription");
    
    public final String val;

    /* access modifiers changed from: public */
    WorkflowConstants$API(String str) {
        this.val = str;
    }
}
