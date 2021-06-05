package com.jalur.gunung;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.content.Intent;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.widget.Toast;


public class LawuJalur extends FragmentActivity {
	final int RQS_GooglePlayServices = 1;
	private GoogleMap myMap;
	 protected LocationManager   locManager;
	 double                      latitude;
	  double                      longitude;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jalur);
        
       // addGoogleMap();
        
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map);
        myMap = mySupportMapFragment.getMap();
      
        
        
        
        LatLng a = new LatLng(-7.663055555556,111.186944444444);
        MarkerOptions markerA = new MarkerOptions();
        markerA.position(a);
        markerA.title("Base Camp Cemoro Kandang");
        markerA.snippet("-7.663055555556,111.186944444444");
        markerA.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerA);
        
        LatLng b = new LatLng(-7.65,111.188611111111);
        MarkerOptions markerB = new MarkerOptions();
        markerB.position(b);
        markerB.title("Pos 1 (Taman Sari Bawah)");
        markerB.snippet("-7.65,111.188611111111");
        markerB.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        myMap.addMarker(markerB);
        
        LatLng c = new LatLng(-7.6425,111.187777777778);
        MarkerOptions markerC = new MarkerOptions();
        markerC.position(c);
        markerC.title("Pos 2 (Taman Sari Atas)");
        markerC.snippet("-7.6425,111.187777777778");
        markerC.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerC);
        
        LatLng d = new LatLng(-7.64,111.181944444444);
        MarkerOptions markerD = new MarkerOptions();
        markerD.position(d);
        markerD.title("Pos Bayangan");
        markerD.snippet("-7.64,111.181944444444");
        markerD.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        myMap.addMarker(markerD);
        
        LatLng e = new LatLng(-7.635277777778,111.184444444444);
        MarkerOptions markerE = new MarkerOptions();
        markerE.position(e);
        markerE.title("Pos 3 (Penggik)");
        markerE.snippet("-7.635277777778,111.184444444444");
        markerE.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
        myMap.addMarker(markerE);
        
        LatLng f = new LatLng(-7.631944444444,111.186388888889);
        MarkerOptions markerF = new MarkerOptions();
        markerF.position(f);
        markerF.title("Pos 4 (Cokrosuryo)");
        markerF.snippet("-7.631944444444,111.186388888889");
        markerF.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        myMap.addMarker(markerF);
        
        LatLng g = new LatLng(-7.625277777778,111.194722222222);
        MarkerOptions markerG = new MarkerOptions();
        markerG.position(g);
        markerG.title("Pos 5");
        markerG.snippet("-7.625277777778,111.194722222222");
        markerG.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        myMap.addMarker(markerG);
        
        
                
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        myMap.getUiSettings().setCompassEnabled(true);
        
        myMap.getUiSettings().setZoomControlsEnabled(true);
        
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        
        myMap.setMyLocationEnabled(true);
        
        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(a, 13));
        
        
        myMap.setOnMarkerClickListener(new OnMarkerClickListener() {
			
			@Override
			public boolean onMarkerClick(Marker arg0) {
				// TODO Auto-generated method stub
				
				try {
					StringBuilder urlString = new StringBuilder(); 	  					
					String daddr = (String.valueOf(arg0.getPosition().latitude)+","+String.valueOf(arg0.getPosition().longitude)); 
					urlString.append("http://maps.google.com/maps?f=d&hl=en"); 
					urlString.append("&saddr="+String.valueOf(myMap.getMyLocation().getLatitude())+","+String.valueOf(myMap.getMyLocation().getLongitude())); 
					urlString.append("&daddr="+daddr);
					Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));
					startActivity(i);
				} catch (Exception ee) {
					Toast.makeText(getApplicationContext(), "Lokasi Saat Ini Belum Didapatkan, Coba Nyalakan GPS, Keluar Ruangan dan Tunggu Beberapa Saat", Toast.LENGTH_LONG).show();
				}
				return false;
			}
		});
        
        
        
        
        
        myMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
			
			@Override
			public void onInfoWindowClick(Marker arg0) {
				// TODO Auto-generated method stub
				//JIKA KLIKNYA INGIN DI INFO WINDOW
			}
		});
    }

    private void addGoogleMap() {
        // check if we have got the googleMap already
        if (myMap == null) {
        	myMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
         //  myMap.setOnMarkerDragListener(this);
          myMap.setMyLocationEnabled(true);
          LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
          Criteria criteria = new Criteria();
          String provider = locationManager.getBestProvider(criteria, true);
          Location location = locationManager.getLastKnownLocation(provider);
          if(location!=null){
        	  onLocationChanged(location);
        	  myMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longitude))
        			  .title("Posisi Anda Sekarang").icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1)));
        	  addLines();
        	  
      		           }
          }
     
      }
    
    public void onLocationChanged(Location location) {
  	  latitude = location.getLatitude();
  	  longitude = location.getLongitude();
  	  LatLng latLng = new LatLng(latitude, longitude);
  	  myMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
  	  myMap.animateCamera(CameraUpdateFactory.zoomTo(15));
  	
  	  
    }
    
    private void addLines() {
        if (myMap != null) {
        	myMap.addPolyline((new PolylineOptions())
              .add(new LatLng(-7.0187352,110.3625896), new LatLng(latitude,longitude)).width(5).color(Color.BLUE)
              .geodesic(true));
          // move camera to zoom on map
          myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
        		  new LatLng(-7.0187352,110.3625896), 13));
        }
      }
    
  
}
