package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationChannelGroupCompat {
    public boolean mBlocked;
    public List<NotificationChannelCompat> mChannels;
    public String mDescription;
    public final String mId;
    public CharSequence mName;

    public static class Builder {
        public final NotificationChannelGroupCompat mGroup;

        public Builder(@NonNull String str) {
            this.mGroup = new NotificationChannelGroupCompat(str);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.mGroup;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mGroup.mDescription = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mGroup.mName = charSequence;
            return this;
        }
    }

    public NotificationChannelGroupCompat(@NonNull String str) {
        this.mChannels = Collections.emptyList();
        this.mId = (String) Preconditions.checkNotNull(str);
    }

    @RequiresApi(26)
    private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel next : list) {
            if (this.mId.equals(next.getGroup())) {
                arrayList.add(new NotificationChannelCompat(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }

    @Nullable
    public String getDescription() {
        return this.mDescription;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    public NotificationChannelGroup getNotificationChannelGroup() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.mId, this.mName);
        if (Build.VERSION.SDK_INT >= 28) {
            notificationChannelGroup.setDescription(this.mDescription);
        }
        return notificationChannelGroup;
    }

    public boolean isBlocked() {
        return this.mBlocked;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
    }

    @RequiresApi(28)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @RequiresApi(26)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.mName = notificationChannelGroup.getName();
        if (Build.VERSION.SDK_INT >= 28) {
            this.mDescription = notificationChannelGroup.getDescription();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.mBlocked = notificationChannelGroup.isBlocked();
            this.mChannels = getChannelsCompat(notificationChannelGroup.getChannels());
            return;
        }
        this.mChannels = getChannelsCompat(list);
    }
}
