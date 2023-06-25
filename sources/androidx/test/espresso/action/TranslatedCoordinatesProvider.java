package androidx.test.espresso.action;

import android.view.View;

public final class TranslatedCoordinatesProvider implements CoordinatesProvider {
    public final CoordinatesProvider coordinatesProvider;

    /* renamed from: dx */
    public final float f271dx;

    /* renamed from: dy */
    public final float f272dy;

    public TranslatedCoordinatesProvider(CoordinatesProvider coordinatesProvider2, float f, float f2) {
        this.coordinatesProvider = coordinatesProvider2;
        this.f271dx = f;
        this.f272dy = f2;
    }

    public float[] calculateCoordinates(View view) {
        float[] calculateCoordinates = this.coordinatesProvider.calculateCoordinates(view);
        calculateCoordinates[0] = calculateCoordinates[0] + (this.f271dx * ((float) view.getWidth()));
        calculateCoordinates[1] = calculateCoordinates[1] + (this.f272dy * ((float) view.getHeight()));
        return calculateCoordinates;
    }
}
