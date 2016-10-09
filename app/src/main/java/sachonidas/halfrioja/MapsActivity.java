package sachonidas.halfrioja;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final LatLng inicio = new LatLng(42.46513250389874,-2.436518669128418 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(inicio, 12));

        LatLng salidaHalf = new LatLng(42.4715865,-2.4544017);
        mMap.addMarker(new MarkerOptions().position(salidaHalf).title("Salida Half").icon(BitmapDescriptorFactory.fromResource(R.drawable.meta)));

        LatLng parkingHalf = new LatLng(42.4746517,-2.4539692);
        mMap.addMarker(new MarkerOptions().position(parkingHalf).title("Parking").icon(BitmapDescriptorFactory.fromResource(R.drawable.parking)));

        LatLng husaGranVia = new LatLng(42.4651768,-2.454470399999991);
        mMap.addMarker(new MarkerOptions().position(husaGranVia).title("Hotel Husa Gran Vía").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));

        LatLng herenciaHotel = new LatLng(42.4657677,-2.4529786000000513);
        mMap.addMarker(new MarkerOptions().position(herenciaHotel).title("Hotel Herencia de Logroño").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));

        LatLng husaLasCañas = new LatLng(42.476670835602675,-2.396119236946106);
        mMap.addMarker(new MarkerOptions().position(husaLasCañas).title("Hotel Husa Las Cañas").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));
    }
}
