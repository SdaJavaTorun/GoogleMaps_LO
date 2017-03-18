package com.sdajava.googlemaps;

/**
 * Created by lukas on 18.03.2017.
 */
import com.google.maps.GeoApiContext;

public class KeyAuthorization {
    private static GeoApiContext context;

    public KeyAuthorization(String key) {
        context = new GeoApiContext().setApiKey(key);
    }

    public  GeoApiContext getContext() {
        return context;
    }

    public static void setContext(GeoApiContext context) {
        KeyAuthorization.context = context;
    }
}
