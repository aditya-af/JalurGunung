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
 
public class MerbabuGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.merbabu1, R.drawable.merbabu2, R.drawable.merbabu3, R.drawable.merbabu4, R.drawable.merbabu5,R.drawable.merbabu6};

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
		txt1.setText("Basecamp merbabu via selo terdapat pada Dk Genteng, Desa Tarubatang. Terdapat dua buah basecamp yang dikelola oleh warga lengkap dengan fasilitas souvenir dan penjualan perlengkapan pendakian sederhana. Pendakian dimulai dari gerbang Taman Nasional Gunung Merbabu yang berjarak 50 meter dari basecamp. Di sekitar gerbang terdapat camping ground. Pada jarak 800 meter dari pintu masuk jalur pendakian akan ditemui sebuah persimpangan. Jalur kiri (tanjakan) merupakan jalur pendakian, sedangkan jalur kanan (jalur menurun) adalah jalur menuju daerah jurang warung yang dapat digunakan sebagai lokasi birdwatching" );
			
		Toast.makeText(getBaseContext(), "Base Camp" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" Pos 1 dapat ditempuh selama 1 jam dari basecamp. Pos yang berupa sebidang tanah ini berada pada ketinggian ± 2190 m dan masih berada pada zona hutan gunung sehingga tidak ada pemandangan. Pos I umumnya digunakan untuk tempat berisitirahat sejenak. Selepas Pos I ada percabangan jalur lama (kiri) yang langsung menuju Pos III dan jalur baru (lurus)" );
		
	Toast.makeText(getBaseContext(), " Pos 1" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Pos 2 berjarak kurang lebih satu jam perjalan dari pos I. Tipikal pos II mirip pos satu yang berupa sebidang tanah tanpa bangunan dan terletak pada ketinggian 2420 mdpl. Vegetasinya berupa peralihan hutan hujan pegunungan dan hutan hujan sub alpin" );
			
	Toast.makeText(getBaseContext(), "Pos 2" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Pos 3 berada pada ketinggian 2590 mdpl. Pada pos ini terdapat sekelompok batuan besar yang menjadi obyek vandalism. Entah, apakah karena banyaknya coretan sehingga pos ini dinamai watu tulis atau sebaliknya, karena bernama watu tulis, para pendaki vandalis mencorat coret bantu ini. Pemandangan dari pos III cukup lapang dan dapat melihat merapi di seberangnya. 200 meter dari pos III dapat dijumpai sebuah nisan memoriam alm. Heri Susanto, seorang pendaki asal Surabaya yang mengalami kecelakan pendakian pada tahun 1997." );
			
	Toast.makeText(getBaseContext(), "Pos 3" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==4) {
		txt1.setText("Sabana I berada pada ketinggian ±2770 mdpl sedangkan sabana II terletak pada ketinggian ±2860 mdpl. Sabana I dan sabana II dipisahkan oleh sebuah bukit. Ekosistem sabana ini didominasi oleh rumput bubarjaran. Kedua lokasi ini sering dijadikan sebagai tempat berkemah para pendaki" );
			
	Toast.makeText(getBaseContext(), "Sabana I dan Sabana II" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==5) {
		txt1.setText("Jemblongan berada kurang lebih 100 meter dari sabana II. tempat ini merupakan tempat berkemah alternative. Berada di tengah tengah pepohonan, tempat ini menjadi tempat yang nyaman untuk berkemah karena terlindung dari angin dan cukup dekat dengan puncak (± I jam perjalanan)" );
			
	Toast.makeText(getBaseContext(), "Jemblongan" +"",
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