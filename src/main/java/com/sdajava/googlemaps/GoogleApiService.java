package com.sdajava.googlemaps;

/**
 * Created by lukas on 18.03.2017.
 */

import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

import com.google.maps.GeoApiContext;

public class GoogleApiService {

    private GeoApiContext context
        = new KeyAuthorization("AIzaSyAxUMClD0Q6-8jMiTUXGl_NiWcsOBbcJO8").getContext();

    public String getLongLat(String cityName) {

        try {
            GeocodingResult[] results = GeocodingApi.geocode(context, cityName).await();
            if (results.length > 0)
                return results[0].geometry.location.toString();
            else return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getFullAddress(String cityName) {
        try {
            GeocodingResult[] results = GeocodingApi.geocode(context,
                cityName).await();
            if (results.length > 0)
                return results[0].formattedAddress;
            else return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
