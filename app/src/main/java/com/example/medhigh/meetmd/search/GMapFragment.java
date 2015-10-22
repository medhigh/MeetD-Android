package com.example.medhigh.meetmd.search;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medhigh.meetmd.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;

import java.lang.reflect.Field;
import java.util.List;

import butterknife.ButterKnife;
import soap.wcf.ServiceProviderXml;

/**
 * Google Map Class Fragment.
 * <p/>
 * This class contains Google Map and related to it components
 */
public class GMapFragment extends Fragment implements ConnectionCallbacks, OnConnectionFailedListener {
    protected static final String TAG = "GMapFragment";
    public static Location mapFocus;
    private static boolean listIsNull = true;
    public Location mLastLocation;
    protected float mapConditionRadius;
    protected GoogleApiClient mGoogleApiClient;
    SupportMapFragment mapFragment;
    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    //private List<Clinic> clinicList;
    private List<ServiceProviderXml> providers;

    public static boolean isListIsNull() {
        return listIsNull;
    }

    public static void setListIsNull(boolean listIsNull) {
        GMapFragment.listIsNull = listIsNull;
    }

    public static float distance(Location myLocation, double lat, double lng) {
        Location target = new Location("target");
        target.setLatitude(lat);
        target.setLongitude(lng);
        return myLocation.distanceTo(target);
    }

    public Location getmLastLocation() {
        return mLastLocation;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getChildFragmentManager();
        mapFragment = ((SupportMapFragment) fm.findFragmentById(R.id.map));
        if (mapFragment == null) {
            mapFragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.map, mapFragment).commit();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_location, container, false);
        ButterKnife.bind(this, view);
        buildGoogleApiClient();
        setUpMapIfNeeded();
        mapConditionRadius = 3f;
        //ListActivity.setMapsActivity(this);
        //getMarkersFromBase();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        //getMarkersFromBase();
        mapRepaint();
        checkFocus();
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private synchronized void setUpMap() {
        if (mMap != null) {

            GoogleMapOptions options = new GoogleMapOptions();
            options.compassEnabled(true);
            MapFragment.newInstance(options);

            mMap.setMyLocationEnabled(true);
            UiSettings settings = mMap.getUiSettings();
            settings.setMapToolbarEnabled(true);
            settings.setZoomControlsEnabled(true);
            if (providers != null && mLastLocation != null) {
                listIsNull = false;
//                mMap.clear();
//                for (Clinic c: getClinicList()){
//                    if (distance(mLastLocation,c.lat,c.lng)<=mapConditionRadius*1000f) {
//                        mMap.addMarker(new MarkerOptions().position(new LatLng(c.lat, c.lng)).title(c.name));
//                    }
//                }
            }
        }
    }

    public void checkFocus() {
        if (mapFocus != null) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(mapFocus.getLatitude(),
                    mapFocus.getLongitude()), 14f));
        }
        mapRepaint();
    }

//    public void getMarkersFromBase(){
//        SingletonDAO.getStartAsync(this);
//    }

    public synchronized void mapRepaint() {
        if (mMap != null) {
            setUpMap();
        } else {
            setUpMapIfNeeded();
            setUpMap();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
        mapRepaint();
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(getContext())
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
        checkFocus();
    }

    /**
     * Runs when a GoogleApiClient object successfully connects.
     */
    @Override
    public void onConnected(Bundle connectionHint) {
        // Provides a simple way of getting a device's location and is well suited for
        // applications that do not require a fine-grained location and that do not need location
        // updates. Gets the best and most recent location currently available, which may be null
        // in rare cases when a location is not available.
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        Log.d(TAG, "now we can get locate");
        if (mLastLocation != null && mapFocus == null) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(mLastLocation.getLatitude(),
                    mLastLocation.getLongitude()), 14f));
        }
        checkFocus();
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        // Refer to the javadoc for ConnectionResult to see what error codes might be returned in
        // onConnectionFailed.
        Log.i(TAG, "Connection failed: ConnectionResult.getErrorCode() = " + result.getErrorCode());
    }

    @Override
    public void onConnectionSuspended(int cause) {
        // The connection to Google Play services was lost for some reason. We call connect() to
        // attempt to re-establish the connection.
        Log.i(TAG, "Connection suspended");
        mGoogleApiClient.connect();
    }

    public GoogleMap getmMap() {
        return mMap;
    }


    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            if (mapFragment == null) {
                mapFragment = SupportMapFragment.newInstance();
                //getChildFragmentManager().beginTransaction().replace(R.id.map, mapFragment).commit();
            }
            mMap = mapFragment.getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
