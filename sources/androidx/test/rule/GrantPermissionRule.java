package androidx.test.rule;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.content.PermissionGranter;
import androidx.test.internal.util.Checks;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

@Beta
public class GrantPermissionRule implements C9741c {
    public PermissionGranter permissionGranter;

    public class RequestPermissionStatement extends C9785g {
        public final C9785g base;

        public RequestPermissionStatement(C9785g gVar) {
            this.base = gVar;
        }

        public void evaluate() {
            GrantPermissionRule.this.permissionGranter.requestPermissions();
            this.base.evaluate();
        }
    }

    public GrantPermissionRule() {
        this((PermissionGranter) ServiceLoaderWrapper.loadSingleService(PermissionGranter.class, GrantPermissionRule$$Lambda$0.$instance));
    }

    public static GrantPermissionRule grant(String... strArr) {
        GrantPermissionRule grantPermissionRule = new GrantPermissionRule();
        grantPermissionRule.grantPermissions(strArr);
        return grantPermissionRule;
    }

    private void grantPermissions(String... strArr) {
        Set<String> satisfyPermissionDependencies = satisfyPermissionDependencies(strArr);
        this.permissionGranter.addPermissions((String[]) satisfyPermissionDependencies.toArray(new String[satisfyPermissionDependencies.size()]));
    }

    public final C9785g apply(C9785g gVar, Description description) {
        return new RequestPermissionStatement(gVar);
    }

    @VisibleForTesting
    public Set<String> satisfyPermissionDependencies(String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(strArr));
        if (linkedHashSet.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
            linkedHashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        return linkedHashSet;
    }

    @VisibleForTesting
    public void setPermissionGranter(PermissionGranter permissionGranter2) {
        this.permissionGranter = (PermissionGranter) Checks.checkNotNull(permissionGranter2, "permissionRequester cannot be null!");
    }

    @VisibleForTesting
    public GrantPermissionRule(@NonNull PermissionGranter permissionGranter2) {
        setPermissionGranter(permissionGranter2);
    }
}
