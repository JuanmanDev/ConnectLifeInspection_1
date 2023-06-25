package androidx.test.rule;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.util.Checks;
import java.util.Properties;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

@Beta
public class PortForwardingRule implements C9741c {
    @VisibleForTesting
    public static final String DEFAULT_PROXY_HOST = "127.0.0.1";
    @VisibleForTesting
    public static final int DEFAULT_PROXY_PORT = 8080;
    @VisibleForTesting
    public static final String HTTPS_HOST_PROPERTY = "https.proxyHost";
    @VisibleForTesting
    public static final String HTTPS_PORT_PROPERTY = "https.proxyPort";
    @VisibleForTesting
    public static final String HTTP_HOST_PROPERTY = "http.proxyHost";
    @VisibleForTesting
    public static final String HTTP_PORT_PROPERTY = "http.proxyPort";
    public static final int MAX_PORT = 65535;
    public static final int MIN_PORT = 1024;
    public static final String TAG = "PortForwardingRule";
    public Properties backUpProp;
    @VisibleForTesting
    public Properties prop;
    @VisibleForTesting
    public final String proxyHost;
    @VisibleForTesting
    public final int proxyPort;

    public static class Builder {
        public Properties prop = System.getProperties();
        public String proxyHost = PortForwardingRule.DEFAULT_PROXY_HOST;
        public int proxyPort = PortForwardingRule.DEFAULT_PROXY_PORT;

        public PortForwardingRule build() {
            return new PortForwardingRule(this);
        }

        public Builder withProperties(@NonNull Properties properties) {
            this.prop = (Properties) Checks.checkNotNull(properties);
            return this;
        }

        public Builder withProxyHost(@NonNull String str) {
            this.proxyHost = (String) Checks.checkNotNull(str);
            return this;
        }

        public Builder withProxyPort(int i) {
            Checks.checkArgument(i >= 1024 && i <= 65535, "%d is used as a proxy port, must in range [%d, %d]", Integer.valueOf(i), 1024, 65535);
            this.proxyPort = i;
            return this;
        }
    }

    public class PortForwardingStatement extends C9785g {
        public final C9785g base;

        public PortForwardingStatement(C9785g gVar) {
            this.base = gVar;
        }

        public void evaluate() {
            try {
                PortForwardingRule.this.setPortForwarding();
                String.format("The current process traffic is forwarded to %s:%d", new Object[]{PortForwardingRule.this.proxyHost, Integer.valueOf(PortForwardingRule.this.proxyPort)});
                this.base.evaluate();
            } finally {
                PortForwardingRule.this.restorePortForwarding();
            }
        }
    }

    private void backUpProperties() {
        if (this.prop.getProperty(HTTP_HOST_PROPERTY) != null) {
            this.backUpProp.setProperty(HTTP_HOST_PROPERTY, this.prop.getProperty(HTTP_HOST_PROPERTY));
        }
        if (this.prop.getProperty(HTTPS_HOST_PROPERTY) != null) {
            this.backUpProp.setProperty(HTTPS_HOST_PROPERTY, this.prop.getProperty(HTTPS_HOST_PROPERTY));
        }
        if (this.prop.getProperty(HTTP_PORT_PROPERTY) != null) {
            this.backUpProp.setProperty(HTTP_PORT_PROPERTY, this.prop.getProperty(HTTP_PORT_PROPERTY));
        }
        if (this.prop.getProperty(HTTPS_PORT_PROPERTY) != null) {
            this.backUpProp.setProperty(HTTPS_PORT_PROPERTY, this.prop.getProperty(HTTPS_PORT_PROPERTY));
        }
    }

    public static int getDefaultPort() {
        return DEFAULT_PROXY_PORT;
    }

    private void restoreOneProperty(Properties properties, Properties properties2, String str) {
        if (properties2.getProperty(str) != null) {
            properties.setProperty(str, properties2.getProperty(str));
        } else {
            properties.remove(str);
        }
    }

    /* access modifiers changed from: private */
    public void restorePortForwarding() {
        try {
            beforeRestoreForwarding();
        } finally {
            restoreOneProperty(this.prop, this.backUpProp, HTTP_HOST_PROPERTY);
            restoreOneProperty(this.prop, this.backUpProp, HTTPS_HOST_PROPERTY);
            restoreOneProperty(this.prop, this.backUpProp, HTTP_PORT_PROPERTY);
            restoreOneProperty(this.prop, this.backUpProp, HTTPS_PORT_PROPERTY);
            afterRestoreForwarding();
        }
    }

    /* access modifiers changed from: private */
    public void setPortForwarding() {
        beforePortForwarding();
        this.prop.setProperty(HTTP_HOST_PROPERTY, this.proxyHost);
        this.prop.setProperty(HTTPS_HOST_PROPERTY, this.proxyHost);
        this.prop.setProperty(HTTP_PORT_PROPERTY, String.valueOf(this.proxyPort));
        this.prop.setProperty(HTTPS_PORT_PROPERTY, String.valueOf(this.proxyPort));
        afterPortForwarding();
    }

    public void afterPortForwarding() {
    }

    public void afterRestoreForwarding() {
    }

    public C9785g apply(C9785g gVar, Description description) {
        return new PortForwardingStatement(gVar);
    }

    public void beforePortForwarding() {
    }

    public void beforeRestoreForwarding() {
    }

    public PortForwardingRule(Builder builder) {
        this(builder.proxyHost, builder.proxyPort, builder.prop);
    }

    public PortForwardingRule(int i) {
        this(DEFAULT_PROXY_HOST, i, System.getProperties());
    }

    @VisibleForTesting
    public PortForwardingRule(String str, int i, @NonNull Properties properties) {
        this.proxyHost = str;
        this.proxyPort = i;
        this.prop = (Properties) Checks.checkNotNull(properties);
        this.backUpProp = new Properties();
        backUpProperties();
    }
}
