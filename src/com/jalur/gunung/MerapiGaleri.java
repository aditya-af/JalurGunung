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
 
public class MerapiGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.merapi1, R.drawable.merapi2, R.drawable.merapi3, R.drawable.merapi4, R.drawable.merapi5, R.drawable.merapi6 };

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
		txt1.setText("Basecamp Barameru pada koordinat S 07o30'43,9 dan E 110o27'14,7 pada ketinggian 1.684 mDPL " );
			
		Toast.makeText(getBaseContext(), "Basecamp BARAMERU Saat Dinihari" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" New Selo ini merupakan shelter yang cukup luas, biasa buat nongkrong orang-orang sekitar karena kalau siang hari, view Merbabu dari sini sangat jelas. Di sini dilengkapi dengan gardu pandang, MCK, juga beberapa warung yang menyediakan makan dan minum bagi para pengunjung/pendaki yang nongkrong di sini" );
		
	Toast.makeText(getBaseContext(), " New Selo" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Pos 1, ditandai semacam gerbang hijau beratap joglo pada koordinat S 07o31'21,3 dan E 110o27'06,7 pada ketinggian sekitar 2.060an mDPL" );
			
	Toast.makeText(getBaseContext(), "Pos 1 Merapi" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Pos Batu Belah pada posisi koordinat S 07o31'35,9 dan E 110o27'04,1 pada ketinggian sekitar 2.300 mDPL yang ditandai adanya dua batu besar persis di tengah jalur, 2 batu yang seolah-olah seperti batu besar yang terbelah" );
			
	Toast.makeText(getBaseContext(), "Pos Batu Belah" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==4) {
		txt1.setText("Tugu Triangulasi ini berada pada posisi koordinat S 07o30'09,2 dan E 110o45'19,9 pada ketinggian sekitar 2.525 mDPL" );
			
	Toast.makeText(getBaseContext(), "Tugu Triangulasi" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==5) {
		txt1.setText("Posisi puncak pada koordinat S 07o32'24,1 dan E 110o26'50,4 dengan posisi ketinggian sekitar 2.914 mDPL" );
			
	Toast.makeText(getBaseContext(), "Puncak Merapi" +"",
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