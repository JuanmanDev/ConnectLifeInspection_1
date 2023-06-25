package com.google.common.util.concurrent;

public enum Service$State {
    NEW {
        public boolean isTerminal() {
            return false;
        }
    },
    STARTING {
        public boolean isTerminal() {
            return false;
        }
    },
    RUNNING {
        public boolean isTerminal() {
            return false;
        }
    },
    STOPPING {
        public boolean isTerminal() {
            return false;
        }
    },
    TERMINATED {
        public boolean isTerminal() {
            return true;
        }
    },
    FAILED {
        public boolean isTerminal() {
            return true;
        }
    };

    public abstract boolean isTerminal();
}
