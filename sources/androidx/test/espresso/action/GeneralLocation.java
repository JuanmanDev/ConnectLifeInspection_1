package androidx.test.espresso.action;

import android.graphics.Rect;
import android.view.View;

public enum GeneralLocation implements CoordinatesProvider {
    TOP_LEFT {
        public float[] calculateCoordinates(View view) {
            Position position = Position.BEGIN;
            return GeneralLocation.getCoordinates(view, position, position);
        }
    },
    TOP_CENTER {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.BEGIN, Position.MIDDLE);
        }
    },
    TOP_RIGHT {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.BEGIN, Position.END);
        }
    },
    CENTER_LEFT {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.MIDDLE, Position.BEGIN);
        }
    },
    CENTER {
        public float[] calculateCoordinates(View view) {
            Position position = Position.MIDDLE;
            return GeneralLocation.getCoordinates(view, position, position);
        }
    },
    CENTER_RIGHT {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.MIDDLE, Position.END);
        }
    },
    BOTTOM_LEFT {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.END, Position.BEGIN);
        }
    },
    BOTTOM_CENTER {
        public float[] calculateCoordinates(View view) {
            return GeneralLocation.getCoordinates(view, Position.END, Position.MIDDLE);
        }
    },
    BOTTOM_RIGHT {
        public float[] calculateCoordinates(View view) {
            Position position = Position.END;
            return GeneralLocation.getCoordinates(view, position, position);
        }
    },
    VISIBLE_CENTER {
        public float[] calculateCoordinates(View view) {
            Position position = Position.MIDDLE;
            return GeneralLocation.getCoordinatesOfVisiblePart(view, position, position);
        }
    };

    public enum Position {
        BEGIN {
            public float getPosition(int i, int i2) {
                return (float) i;
            }
        },
        MIDDLE {
            public float getPosition(int i, int i2) {
                return ((float) i) + (((float) (i2 - 1)) / 2.0f);
            }
        },
        END {
            public float getPosition(int i, int i2) {
                return (float) ((i + i2) - 1);
            }
        };

        public abstract float getPosition(int i, int i2);
    }

    public static float[] getCoordinates(View view, Position position, Position position2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{position2.getPosition(iArr[0], view.getWidth()), position.getPosition(iArr[1], view.getHeight())};
    }

    public static float[] getCoordinatesOfVisiblePart(View view, Position position, Position position2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new float[]{position2.getPosition(iArr[0], rect.width()), position.getPosition(iArr[1], rect.height())};
    }

    public static CoordinatesProvider translate(CoordinatesProvider coordinatesProvider, float f, float f2) {
        return new TranslatedCoordinatesProvider(coordinatesProvider, f, f2);
    }
}
