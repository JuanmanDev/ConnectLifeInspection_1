package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class WorkQuery {
    public final List<UUID> mIds;
    public final List<WorkInfo.State> mStates;
    public final List<String> mTags;
    public final List<String> mUniqueWorkNames;

    public static final class Builder {
        public List<UUID> mIds = new ArrayList();
        public List<WorkInfo.State> mStates = new ArrayList();
        public List<String> mTags = new ArrayList();
        public List<String> mUniqueWorkNames = new ArrayList();

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromIds(@NonNull List<UUID> list) {
            Builder builder = new Builder();
            builder.addIds(list);
            return builder;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromStates(@NonNull List<WorkInfo.State> list) {
            Builder builder = new Builder();
            builder.addStates(list);
            return builder;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromTags(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addTags(list);
            return builder;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromUniqueWorkNames(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addUniqueWorkNames(list);
            return builder;
        }

        @NonNull
        public Builder addIds(@NonNull List<UUID> list) {
            this.mIds.addAll(list);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List<WorkInfo.State> list) {
            this.mStates.addAll(list);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List<String> list) {
            this.mTags.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List<String> list) {
            this.mUniqueWorkNames.addAll(list);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if (!this.mIds.isEmpty() || !this.mUniqueWorkNames.isEmpty() || !this.mTags.isEmpty() || !this.mStates.isEmpty()) {
                return new WorkQuery(this);
            }
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
    }

    public WorkQuery(@NonNull Builder builder) {
        this.mIds = builder.mIds;
        this.mUniqueWorkNames = builder.mUniqueWorkNames;
        this.mTags = builder.mTags;
        this.mStates = builder.mStates;
    }

    @NonNull
    public List<UUID> getIds() {
        return this.mIds;
    }

    @NonNull
    public List<WorkInfo.State> getStates() {
        return this.mStates;
    }

    @NonNull
    public List<String> getTags() {
        return this.mTags;
    }

    @NonNull
    public List<String> getUniqueWorkNames() {
        return this.mUniqueWorkNames;
    }
}
