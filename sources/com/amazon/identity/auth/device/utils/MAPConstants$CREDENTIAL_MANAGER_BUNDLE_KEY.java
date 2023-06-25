package com.amazon.identity.auth.device.utils;

public enum MAPConstants$CREDENTIAL_MANAGER_BUNDLE_KEY {
    PACKAGE_NAME("com.amazon.identity.auth.device.authorization.packageName"),
    APP_ID("com.amazon.identity.auth.device.authorization.appId"),
    USER_ID("com.amazon.identity.auth.device.authorization.userId"),
    APPS_WITH_SCOPE_LIST("com.amazon.identity.auth.device.authorization.appsWithScopeList"),
    SCOPE_LIST("com.amazon.identity.auth.device.authorization.scopeList"),
    HAS_SCOPE("com.amazon.identity.auth.device.authorization.hasScope"),
    PERMISSION_LIST("com.amazon.identity.auth.device.authorization.permissionList"),
    HAS_PERMISSION("com.amazon.identity.auth.device.authorization.hasPermission"),
    APPS_WITH_PERMISSION_LIST("com.amazon.identity.auth.device.authorization.appsWithPermissionList"),
    APP_VARIANT_ID("com.amazon.identity.auth.device.authorization.appVariantid"),
    PACKAGE_NAMES("com.amazon.identity.auth.device.authorization.packageNames");
    
    public final String val;

    /* access modifiers changed from: public */
    MAPConstants$CREDENTIAL_MANAGER_BUNDLE_KEY(String str) {
        this.val = str;
    }
}
