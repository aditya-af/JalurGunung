package com.jalur.gunung;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Sumbing extends TabActivity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Resources res = getResources(); 
        TabHost tabHost = getTabHost();  
        TabHost.TabSpec spec;  
        Intent intent;  

        intent = new Intent().setClass(this, SumbingProfil.class);
        
        spec = tabHost.newTabSpec("Profil").setIndicator("Profil",
                          res.getDrawable(R.drawable.profil2))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, SumbingGaleri.class);
        
        spec = tabHost.newTabSpec("Galeri").setIndicator("Galeri",
                          res.getDrawable(R.drawable.galery))
                      .setContent(intent);
        tabHost.addTab(spec);

        
        intent = new Intent().setClass(this, SumbingJalur.class);
        spec = tabHost.newTabSpec("Jalur").setIndicator("Jalur",
                          res.getDrawable(R.drawable.jalur))
                      .setContent(intent);
        tabHost.addTab(spec);
        
                

        tabHost.setCurrentTab(0);
    }
}
