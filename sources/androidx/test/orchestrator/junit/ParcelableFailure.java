package androidx.test.orchestrator.junit;

import android.os.Parcel;
import android.os.Parcelable;
import org.junit.runner.notification.Failure;

public final class ParcelableFailure implements Parcelable {
    public static final Parcelable.Creator<ParcelableFailure> CREATOR = new Parcelable.Creator<ParcelableFailure>() {
        public ParcelableFailure createFromParcel(Parcel parcel) {
            return new ParcelableFailure(parcel);
        }

        public ParcelableFailure[] newArray(int i) {
            return new ParcelableFailure[i];
        }
    };
    public static final int MAX_STREAM_LENGTH = 16384;
    public static final String TAG = "ParcelableFailure";
    public final ParcelableDescription description;
    public final String trace;

    public static String trimToLength(String str) {
        if (str.length() <= 16384) {
            return String.valueOf(str).concat("\n");
        }
        String.format("Stack trace too long, trimmed to first %s characters.", new Object[]{16384});
        return String.valueOf(str.substring(0, 16384)).concat("\n");
    }

    public int describeContents() {
        return 0;
    }

    public ParcelableDescription getDescription() {
        return this.description;
    }

    public String getTrace() {
        return this.trace;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.description, 0);
        parcel.writeString(this.trace);
    }

    public ParcelableFailure(Failure failure) {
        this.description = new ParcelableDescription(failure.getDescription());
        this.trace = failure.getTrace();
    }

    public ParcelableFailure(Parcel parcel) {
        this.description = (ParcelableDescription) parcel.readParcelable(ParcelableDescription.class.getClassLoader());
        this.trace = parcel.readString();
    }

    public ParcelableFailure(ParcelableDescription parcelableDescription, Throwable th) {
        this.description = parcelableDescription;
        this.trace = trimToLength(th.getMessage());
    }
}
