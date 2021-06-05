package com.jalur.gunung;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu weather_data[] = new Menu[]
        {
            new Menu(R.drawable.peta, "Jalur Gunung"),
            new Menu(R.drawable.petunjuk, "Petunjuk Aplikasi"),
            new Menu(R.drawable.pembuat, "Pembuat"),
            new Menu(R.drawable.keluar, "Keluar")
            
        };

        MenuAdapter adapter = new MenuAdapter(this,
                R.layout.list_menu_item, weather_data);

        listView1 = (ListView)findViewById(R.id.listView1);

        View header = (View)getLayoutInflater().inflate(R.layout.list_menu_header, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
                
        listView1.setClickable(true);
        
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
              /* demo mengirim kode error ke LogCat */
              switch (position) {
                 case 1:
             	 Intent lokasi = new Intent(getApplicationContext(),MenuGunung.class);
                  startActivity(lokasi);
                 break;
              case 2:
            	  Intent petunjuk = new Intent(getApplicationContext(),Bantuan.class);
                  startActivity(petunjuk);
                break;
              case 3:
            	  Intent tentang = new Intent(getApplicationContext(),Pembuat.class);
                  startActivity(tentang);
                break;
              case 4:
            	 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
  				builder.setMessage("Anda Yakin Ingin Menutup Aplikasi?")
  						.setCancelable(false).setPositiveButton("Ya",
  								new DialogInterface.OnClickListener() {
  									public void onClick(DialogInterface dialog,
  											int id) {
  										Intent exit = new Intent(
  												Intent.ACTION_MAIN);
  										exit.addCategory(Intent.CATEGORY_HOME);
  										exit
  												.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  										startActivity(exit);
  									}
  								}).setNegativeButton("Tidak",
  								new DialogInterface.OnClickListener() {
  									public void onClick(DialogInterface dialog,
  											int id) {
  										dialog.cancel();
  									}
  								}).show();
                break;
              }
            }
          });
        
        

    }}