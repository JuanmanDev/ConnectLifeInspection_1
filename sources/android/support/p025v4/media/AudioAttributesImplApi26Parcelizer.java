package android.support.p025v4.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.v4.media.AudioAttributesImplApi26Parcelizer */
public final class AudioAttributesImplApi26Parcelizer extends androidx.media.AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesImplApi26Parcelizer.read(versionedParcel);
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesImplApi26Parcelizer.write(audioAttributesImplApi26, versionedParcel);
    }
}
