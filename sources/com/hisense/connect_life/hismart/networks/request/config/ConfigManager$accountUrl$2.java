package com.hisense.connect_life.hismart.networks.request.config;

import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigManager.kt */
public final class ConfigManager$accountUrl$2 extends Lambda implements Function0<String> {
    public static final ConfigManager$accountUrl$2 INSTANCE = new ConfigManager$accountUrl$2();

    public ConfigManager$accountUrl$2() {
        super(0);
    }

    @NotNull
    public final String invoke() {
        return HiNetWorks.Companion.getInstance().getHostUrl(CloudService.ACCOUNT);
    }
}
