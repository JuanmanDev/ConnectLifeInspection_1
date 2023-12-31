package net.sqlcipher;

public class CustomCursorWindowAllocation implements CursorWindowAllocation {
    public long growthPaddingSize = 0;
    public long initialAllocationSize = 0;
    public long maxAllocationSize = 0;

    public CustomCursorWindowAllocation(long j, long j2, long j3) {
        this.initialAllocationSize = j;
        this.growthPaddingSize = j2;
        this.maxAllocationSize = j3;
    }

    public long getGrowthPaddingSize() {
        return this.growthPaddingSize;
    }

    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    public long getMaxAllocationSize() {
        return this.maxAllocationSize;
    }
}
