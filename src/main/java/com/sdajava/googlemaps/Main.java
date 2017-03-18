package com.sdajava.googlemaps;


import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class Main {

    public static void main(String[] args) {

        GoogleApiService googleApiService = new GoogleApiService();

        System.out.println(googleApiService.getLongLat("Torun"));
    }
}
