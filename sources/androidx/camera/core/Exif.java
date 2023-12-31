package androidx.camera.core;

import android.location.Location;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Exif {
    public static final ThreadLocal<SimpleDateFormat> DATETIME_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    };
    public static final ThreadLocal<SimpleDateFormat> DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    };
    public static final long INVALID_TIMESTAMP = -1;
    public static final String KILOMETERS_PER_HOUR = "K";
    public static final String KNOTS = "N";
    public static final String MILES_PER_HOUR = "M";
    public static final String TAG = "Exif";
    public static final ThreadLocal<SimpleDateFormat> TIME_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    };
    public final ExifInterface mExifInterface;
    public boolean mRemoveTimestamp = false;

    public static final class Speed {

        public static final class Converter {
            public final double mMph;

            public Converter(double d) {
                this.mMph = d;
            }

            public double toKilometersPerHour() {
                return this.mMph / 0.621371d;
            }

            public double toKnots() {
                return this.mMph / 1.15078d;
            }

            public double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }

            public double toMilesPerHour() {
                return this.mMph;
            }
        }

        public static Converter fromKilometersPerHour(double d) {
            return new Converter(d * 0.621371d);
        }

        public static Converter fromKnots(double d) {
            return new Converter(d * 1.15078d);
        }

        public static Converter fromMetersPerSecond(double d) {
            return new Converter(d * 2.23694d);
        }

        public static Converter fromMilesPerHour(double d) {
            return new Converter(d);
        }
    }

    public Exif(ExifInterface exifInterface) {
        this.mExifInterface = exifInterface;
    }

    private void attachLastModifiedTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME, convertToExifDateTime);
        try {
            this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME, Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime()));
        } catch (ParseException unused) {
        }
    }

    public static Date convertFromExifDate(String str) {
        return DATE_FORMAT.get().parse(str);
    }

    public static Date convertFromExifDateTime(String str) {
        return DATETIME_FORMAT.get().parse(str);
    }

    public static Date convertFromExifTime(String str) {
        return TIME_FORMAT.get().parse(str);
    }

    public static String convertToExifDateTime(long j) {
        return DATETIME_FORMAT.get().format(new Date(j));
    }

    public static Exif createFromFile(File file) {
        return createFromFileString(file.toString());
    }

    public static Exif createFromFileString(String str) {
        return new Exif(new ExifInterface(str));
    }

    public static Exif createFromInputStream(InputStream inputStream) {
        return new Exif(new ExifInterface(inputStream));
    }

    private int getOrientation() {
        return this.mExifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
    }

    private long parseTimestamp(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            return -1;
        }
        if (str2 == null) {
            try {
                return convertFromExifDate(str).getTime();
            } catch (ParseException unused) {
                return -1;
            }
        } else if (str == null) {
            try {
                return convertFromExifTime(str2).getTime();
            } catch (ParseException unused2) {
                return -1;
            }
        } else {
            return parseTimestamp(str + " " + str2);
        }
    }

    public void attachLocation(Location location) {
        this.mExifInterface.setGpsInfo(location);
    }

    public void attachTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME_ORIGINAL, convertToExifDateTime);
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME_DIGITIZED, convertToExifDateTime);
        try {
            String l = Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime());
            this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, l);
            this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, l);
        } catch (ParseException unused) {
        }
        this.mRemoveTimestamp = false;
    }

    public void flipHorizontally() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.mExifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i));
    }

    public void flipVertically() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.mExifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i));
    }

    @Nullable
    public String getDescription() {
        return this.mExifInterface.getAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION);
    }

    public int getHeight() {
        return this.mExifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_LENGTH, 0);
    }

    public long getLastModifiedTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(ExifInterface.TAG_DATETIME));
        if (parseTimestamp == -1) {
            return -1;
        }
        String attribute = this.mExifInterface.getAttribute(ExifInterface.TAG_SUBSEC_TIME);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    @Nullable
    public Location getLocation() {
        double d;
        String attribute = this.mExifInterface.getAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD);
        double[] latLong = this.mExifInterface.getLatLong();
        double altitude = this.mExifInterface.getAltitude(0.0d);
        double attributeDouble = this.mExifInterface.getAttributeDouble(ExifInterface.TAG_GPS_SPEED, 0.0d);
        String attribute2 = this.mExifInterface.getAttribute(ExifInterface.TAG_GPS_SPEED_REF);
        if (attribute2 == null) {
            attribute2 = "K";
        }
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(ExifInterface.TAG_GPS_DATESTAMP), this.mExifInterface.getAttribute(ExifInterface.TAG_GPS_TIMESTAMP));
        if (latLong == null) {
            return null;
        }
        if (attribute == null) {
            attribute = TAG;
        }
        Location location = new Location(attribute);
        location.setLatitude(latLong[0]);
        location.setLongitude(latLong[1]);
        if (altitude != 0.0d) {
            location.setAltitude(altitude);
        }
        if (attributeDouble != 0.0d) {
            char c = 65535;
            int hashCode = attribute2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && attribute2.equals("N")) {
                        c = 1;
                    }
                } else if (attribute2.equals("M")) {
                    c = 0;
                }
            } else if (attribute2.equals("K")) {
                c = 2;
            }
            if (c == 0) {
                d = Speed.fromMilesPerHour(attributeDouble).toMetersPerSecond();
            } else if (c != 1) {
                d = Speed.fromKilometersPerHour(attributeDouble).toMetersPerSecond();
            } else {
                d = Speed.fromKnots(attributeDouble).toMetersPerSecond();
            }
            location.setSpeed((float) d);
        }
        if (parseTimestamp != -1) {
            location.setTime(parseTimestamp);
        }
        return location;
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return BottomAppBarTopEdgeTreatment.ANGLE_UP;
            case 6:
            case 7:
                return 90;
            case 8:
                return BottomAppBarTopEdgeTreatment.ANGLE_UP;
            default:
                return 0;
        }
    }

    public long getTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.getAttribute(ExifInterface.TAG_DATETIME_ORIGINAL));
        if (parseTimestamp == -1) {
            return -1;
        }
        String attribute = this.mExifInterface.getAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
        if (attribute == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = Long.parseLong(attribute);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public int getWidth() {
        return this.mExifInterface.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH, 0);
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public void removeLocation() {
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_ALTITUDE, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_SPEED, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_SPEED_REF, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_DATESTAMP, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_GPS_TIMESTAMP, (String) null);
    }

    public void removeTimestamp() {
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME_ORIGINAL, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_DATETIME_DIGITIZED, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, (String) null);
        this.mExifInterface.setAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, (String) null);
        this.mRemoveTimestamp = true;
    }

    public void rotate(int i) {
        int i2;
        if (i % 90 != 0) {
            String.format("Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", new Object[]{Integer.valueOf(i)});
            this.mExifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int orientation = getOrientation();
        while (i3 < 0) {
            i3 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (orientation) {
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 8;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 2;
                    break;
                case 6:
                    i2 = 3;
                    break;
                case 7:
                    i2 = 4;
                    break;
                case 8:
                    i2 = 1;
                    break;
                default:
                    i2 = 6;
                    break;
            }
        }
        this.mExifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(orientation));
    }

    public void save() {
        if (!this.mRemoveTimestamp) {
            attachLastModifiedTimestamp();
        }
        this.mExifInterface.saveAttributes();
    }

    public void setDescription(@Nullable String str) {
        this.mExifInterface.setAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION, str);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getRotation()), Boolean.valueOf(isFlippedVertically()), Boolean.valueOf(isFlippedHorizontally()), getLocation(), Long.valueOf(getTimestamp()), getDescription()});
    }

    private long parseTimestamp(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        try {
            return convertFromExifDateTime(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }
}
