package org.greenrobot.eventbus;

import java.util.logging.Level;

public final class BackgroundPoster implements Runnable, Poster {
    public final EventBus eventBus;
    public volatile boolean executorRunning;
    public final PendingPostQueue queue = new PendingPostQueue();

    public BackgroundPoster(EventBus eventBus2) {
        this.eventBus = eventBus2;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost obtainPendingPost = PendingPost.obtainPendingPost(subscription, obj);
        synchronized (this) {
            this.queue.enqueue(obtainPendingPost);
            if (!this.executorRunning) {
                this.executorRunning = true;
                this.eventBus.getExecutorService().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                PendingPost poll = this.queue.poll(1000);
                if (poll == null) {
                    synchronized (this) {
                        poll = this.queue.poll();
                        if (poll == null) {
                            this.executorRunning = false;
                            this.executorRunning = false;
                            return;
                        }
                    }
                }
                this.eventBus.invokeSubscriber(poll);
            } catch (InterruptedException e) {
                try {
                    Logger logger = this.eventBus.getLogger();
                    Level level = Level.WARNING;
                    logger.log(level, Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.executorRunning = false;
                }
            }
        }
    }
}
