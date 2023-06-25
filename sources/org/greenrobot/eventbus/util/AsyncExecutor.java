package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;

public class AsyncExecutor {
    public final EventBus eventBus;
    public final Constructor<?> failureEventConstructor;
    public final Object scope;
    public final Executor threadPool;

    public static class Builder {
        public EventBus eventBus;
        public Class<?> failureEventType;
        public Executor threadPool;

        public AsyncExecutor build() {
            return buildForScope((Object) null);
        }

        public AsyncExecutor buildForScope(Object obj) {
            if (this.eventBus == null) {
                this.eventBus = EventBus.getDefault();
            }
            if (this.threadPool == null) {
                this.threadPool = Executors.newCachedThreadPool();
            }
            if (this.failureEventType == null) {
                this.failureEventType = ThrowableFailureEvent.class;
            }
            return new AsyncExecutor(this.threadPool, this.eventBus, this.failureEventType, obj);
        }

        public Builder eventBus(EventBus eventBus2) {
            this.eventBus = eventBus2;
            return this;
        }

        public Builder failureEventType(Class<?> cls) {
            this.failureEventType = cls;
            return this;
        }

        public Builder threadPool(Executor executor) {
            this.threadPool = executor;
            return this;
        }

        public Builder() {
        }
    }

    public interface RunnableEx {
        void run();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncExecutor create() {
        return new Builder().build();
    }

    public void execute(final RunnableEx runnableEx) {
        this.threadPool.execute(new Runnable() {
            public void run() {
                try {
                    runnableEx.run();
                } catch (Exception e) {
                    try {
                        Object newInstance = AsyncExecutor.this.failureEventConstructor.newInstance(new Object[]{e});
                        if (newInstance instanceof HasExecutionScope) {
                            ((HasExecutionScope) newInstance).setExecutionScope(AsyncExecutor.this.scope);
                        }
                        AsyncExecutor.this.eventBus.post(newInstance);
                    } catch (Exception e2) {
                        AsyncExecutor.this.eventBus.getLogger().log(Level.SEVERE, "Original exception:", e);
                        throw new RuntimeException("Could not create failure event", e2);
                    }
                }
            }
        });
    }

    public AsyncExecutor(Executor executor, EventBus eventBus2, Class<?> cls, Object obj) {
        this.threadPool = executor;
        this.eventBus = eventBus2;
        this.scope = obj;
        try {
            this.failureEventConstructor = cls.getConstructor(new Class[]{Throwable.class});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e);
        }
    }
}
