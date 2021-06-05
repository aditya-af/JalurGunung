package com.jalur.gunung;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuGunung extends Activity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menugunung);

        Menu weather_data[] = new Menu[]
        {
            new Menu(R.drawable.menugunung, "Lawu"),
            new Menu(R.drawable.menugunung, "Merapi"),
            new Menu(R.drawable.menugunung, "Merbabu"),
            new Menu(R.drawable.menugunung, "Slamet"),
            new Menu(R.drawable.menugunung, "Sindoro"),
            new Menu(R.drawable.menugunung, "Sumbing"),
      
        };

        MenuAdapter adapter = new MenuAdapter(this,
                R.layout.list_menu_item_gunung, weather_data);

        listView1 = (ListView)findViewById(R.id.listView1);

        View header = (View)getLayoutInflater().inflate(R.layout.list_menu_header_gunung, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
                
        listView1.setClickable(true);
        
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
             
              switch (position) {
              case 1:
            	 Intent a = new Intent(getApplicationContext(),Lawu.class);
                 startActivity(a);
                break;
              case 2:
            	  Intent b = new Intent(getApplicationContext(),Merapi.class);
                  startActivity(b);
                break;
              case 3:
               	  Intent c = new Intent(getApplicationContext(),Merbabu.class);
                  startActivity(c);
                break;
              case 4:
               	  Intent d = new Intent(getApplicationContext(),Slamet.class);
                  startActivity(d);
                break;
              case 5:
               	  Intent e = new Intent(getApplicationContext(),Sindoro.class);
                  startActivity(e);
                break;
              case 6:
               	  Intent f = new Intent(getApplicationContext(),Sumbing.class);
                  startActivity(f);
                break;
              }
            }
          });
        
        

    }}