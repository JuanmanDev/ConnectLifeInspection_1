package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.UUID;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundUpdater implements ForegroundUpdater {
    public static final String TAG = Logger.tagWithPrefix("WMFgUpdater");
    public final ForegroundProcessor mForegroundProcessor;
    public final TaskExecutor mTaskExecutor;
    public final WorkSpecDao mWorkSpecDao;

    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase, @NonNull ForegroundProcessor foregroundProcessor, @NonNull TaskExecutor taskExecutor) {
        this.mForegroundProcessor = foregroundProcessor;
        this.mTaskExecutor = taskExecutor;
        this.mWorkSpecDao = workDatabase.workSpecDao();
    }

    @NonNull
    public C6316e<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        SettableFuture create = SettableFuture.create();
        final SettableFuture settableFuture = create;
        final UUID uuid2 = uuid;
        final ForegroundInfo foregroundInfo2 = foregroundInfo;
        final Context context2 = context;
        this.mTaskExecutor.executeOnBackgroundThread(new Runnable() {
            public void run() {
                try {
                    if (!settableFuture.isCancelled()) {
                        String uuid = uuid2.toString();
                        WorkInfo.State state = WorkForegroundUpdater.this.mWorkSpecDao.getState(uuid);
                        if (state == null || state.isFinished()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        WorkForegroundUpdater.this.mForegroundProcessor.startForeground(uuid, foregroundInfo2);
                        context2.startService(SystemForegroundDispatcher.createNotifyIntent(context2, uuid, foregroundInfo2));
                    }
                    settableFuture.set(null);
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        return create;
    }
}
