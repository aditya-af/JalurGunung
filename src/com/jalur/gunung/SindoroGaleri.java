package com.jalur.gunung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery.LayoutParams;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
 
public class SindoroGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.sindoro1, R.drawable.sindoro2, R.drawable.sindoro3, R.drawable.sindoro4, R.drawable.sindoro5,R.drawable.sindoro6};

Gallery gallery;
ImageSwitcher imageSwitcher;
private TextView txt1;

@Override	
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.galeri);
txt1 = (TextView) findViewById(R.id.mot1);
imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
imageSwitcher.setFactory(this);
imageSwitcher.setAnimation(AnimationUtils.loadAnimation(this,
android.R.anim.fade_in));
imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
android.R.anim.fade_out));
gallery = (Gallery) findViewById(R.id.gallery1);
gallery.setAdapter(new ImageAdapter(this));
gallery.setOnItemClickListener(new OnItemClickListener() {
 
@Override
public void onItemClick(AdapterView<?> parent, View v, int position,
long id) {
	
	if (position == 0) {
		txt1.setText("Basecamp Kledung terletak di pinggir jalan dan ada pohon besar. Untuk pendaftaran Rp 7.000/orang parkir motor Rp 3.000/orang. Di basecamp yang kita lakukan adalah melakukan persiapan, pendaftaran anggota. Selain itu kita juga bisa makan dahulu atau tidur di basecamp. Pada jalur Garung ini kita akan menemui jasa ojek hantar sampai Pos I. Biayanya adalah Rp 15.000/orang/motor" );
			
		Toast.makeText(getBaseContext(), "Base Camp" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" Perjalanan dari basecamp menuju Pos 1 kita akan melewati jalan batu rapi dan tertata dengan pemandangan kanan kiri perkebunan. Lalu kita akan masuk ke dalam hutan menuju Pos 1" );
		
	Toast.makeText(getBaseContext(), " Pos 1" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Jalur menuju Pos 2 kita akan masuk ke dalam hutan. Trek tanah" );
			
	Toast.makeText(getBaseContext(), "Pos 2" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Jalur menuju Pos 3 lumayan panjang. Pos 3 cocok sekali untuk mendirikan tenda" );
			
	Toast.makeText(getBaseContext(), "Pos 3" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==4) {
		txt1.setText("Menuju Pos 4 jalurnya semakin menanjak" );
			
	Toast.makeText(getBaseContext(), "Pos 4" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==5) {
		txt1.setText("Selanjutnya trek semakin menanjak dengan pemandangan kanan kiri sungguh indah" );
			
	Toast.makeText(getBaseContext(), "Puncak" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	
	
	
imageSwitcher.setImageResource(imageIDS[position]);
}
});
}
@Override
public View makeView() {
ImageView imageView = new ImageView(this);
//imageView.setBackgroundColor(0xFF000000);
imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
imageView.setLayoutParams(new
ImageSwitcher.LayoutParams(
LayoutParams.FILL_PARENT,
LayoutParams.FILL_PARENT));
return imageView;
}
public class ImageAdapter extends BaseAdapter{
 
Context context;
int itemBackground;
public ImageAdapter(Context c){
context = c;
//TypedArray a = obtainStyledAttributes(R.styleable.AdsAttrs);
//itemBackground = a.getResourceId(R.styleable.AdsAttrs_adSize, 0);
//a.recycle();
}
@Override
public int getCount() {
return imageIDS.length;
}
 
@Override
public Object getItem(int position) {
return position;
}
 
@Override
public long getItemId(int position) {
return position;
}
 
@Override
public View getView(int position, View convertView, ViewGroup parent) {
ImageView imageView;
if(convertView == null){
imageView = new ImageView(context);
imageView.setImageResource(imageIDS[position]);
imageView.setScaleType(ImageView.ScaleType.FIT_XY);
imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
}else {
imageView = (ImageView) convertView;
}
imageView.setBackgroundResource(itemBackground);
 
return imageView;
}
 
}
}