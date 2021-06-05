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
 
public class LawuGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.lawu1, R.drawable.lawu2, R.drawable.lawu3, R.drawable.lawu4, R.drawable.lawu5, R.drawable.lawu6 };

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
		txt1.setText("Kordinat Base Camp Cemoro Kandang adalah 111o11’13’’E, 07o39’47’’S. Sebaiknya kita mengambil air dari base camp sebelum mulai mendaki. Jalur menuju Pos 1 dimulai dengan hutan pinus dengan jalan setapak yang landai. Kita akan menyusuri punggungan lebar yang semakin menyempit ketika memasuki daerah hutan dengan pohon yang mulai beragam. Jalur cenderung landai hingga menuju Pos 1. " );
			
		Toast.makeText(getBaseContext(), "Base Camp Cemoro Kandang" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" Pos 1 yang bernama Pos Taman Sari Bawah berupa rumah dari batu yang lumayan besar untuk bermalam sekitar 7 – 8 orang pendaki. Di Pos 1 ini terdapat warung makan, sehingga pendaki sering beristirahat lama di pos ini. Pos 1 mempunyai kordinat 111o11’19’’E, 07o39’00’’S." );
		
	Toast.makeText(getBaseContext(), "Pos 1 (Taman Sari Bawah)" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Jalur menuju Pos 2 masih berupa jalan setapak landai dengan hutan bersemak. Banyak tempat yang bisa digunakan untuk mendirikan tenda di sepanjang jalur menuju Pos 2. Pos 2 yang bernama Pos Taman Sari Atas ini berupa bangunan rumah batu mirip dengan pos 1. Kita juga bisa mendirikan tenda di sekitar bangunan pos 2. Pos 2 terletak di Kordinat 111o11’16’’E, 07o38’33’’S" );
			
	Toast.makeText(getBaseContext(), "Pos 2 (Taman Sari Atas)" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Jalur menuju Pos 3 berupa tanjakan ringan berkelok–kelok yang terdapat banyak jalan potong yang cukup terjal untuk menghemat waktu. Jalur dari Pos Bayangan menuju Pos 3 akan terasa jauh karena jalan yang monoton dan berkelok–kelok. Pos 3 yang bernama Pos Penggik berupa bangunan rumah seng yang terletak di pinggir jurang. Tidak terdapat tempat yang cukup datar di sekitar pos untuk mendirikan tenda kecuali di dalam pos. Pos 3 mempunyai titik kordinat 111o11’04’’E, 07o38’07’’S" );
			
	Toast.makeText(getBaseContext(), "Pos 3 (Penggik)" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==4) {
		txt1.setText("Jalur menuju Pos 4 masih berupa jalur tanjakan berkelok–kelok menyusuri punggungan bukit 3173 mdpl dan sudah memasuki daerah batas vegetasi. Sekitar 100 meter dari Pos 3 terdapat mata air di pinggir jalan setapak. Tanjakan akan semakin terjal saat mendekati puncak bukit 3173 mdpl yang disebut dengan Ondho Rante (tanjakan berantai). Di bawah puncak bukit itulah Pos 4 berada. Pos 4 atau Pos Cokrosuryo berupa bangunan rumah dari batu. Di sekitarnya terdapat tempat yang cukup luas untuk mendirikan beberapa tenda. Di pos ini terdapat memoriam seorang pendaki. Dari Pos 4 ini kita bisa melihat guratan sinar matahari ketika terbit. Puncak Gunung Lawu juga sudah terlihat dari sini. Pos 4 terletak di kordinat 111o11’11’’E, 07o37’55’’S" );
			
	Toast.makeText(getBaseContext(), "Pos 4 (Cokrosuryo)" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==5) {
		txt1.setText("Jalur menuju Pos 5 berupa jalur landai yang mengitari Puncak Gunung Lawu dari sisi barat daya menuju ke sisi sebelah utara. Di sepanjang jalur sudah terlihat Puncak Gunung Lawu. Setelah sampai di sisi utara terdapat percabangan jalan setapak menuju Hargo Dalem (Pesemayaman Prabu Brawijaya) dan Hargo Dumilah (Puncak Lawu). Pertigaan inilah Pos 5 berupa tempat datar yang tidak begitu luas dan tidak ada bangunan selther. Pos 5 mempunyai titik kordinat 111o11’41’’E, 07o37’31’’S. Jalur dari Pos 5 menuju puncak berupa tanjakan berbatu yang cukup terjal. Jarak dari Pos 5 ke puncak tidak begitu jauh. Di Puncak Gunung Lawu terdapat bangunan tugu penanda sebagai titik triangulasi. Pucak Gunung Lawu berada di ketinggian 3266 mdpl. Puncak Gunung Lawu terletak di kordinat 111o11’39’’E, 07o37’37’’S. Dari Puncak Gunung Lawu kita bisa melihat kawah berupa dataran berpasir. Ke arah timur laut dari puncak akan terlihat komplek menyerupai perkampungan, itu adalah Hargo Dalem. Di komplek Hargo Dalem terdapat warung dan bangunan tempat singgah Raja Kasunanan Surakarta. Komplek Hargo Dalem terletak di 111o11’39’’E, 07o37’37’’S" );
			
	Toast.makeText(getBaseContext(), "Pos 5" +"",
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