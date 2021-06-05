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
 
public class SlametGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.slamet1, R.drawable.slamet2, R.drawable.slamet3, R.drawable.slamet4, R.drawable.slamet5};

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
		txt1.setText("Kordinat Titik Start adalah 109o13’04’’E, 07o18’05’’S. Titik Start berupa tempat yang datar dan lapang  yang biasa untuk berkemah di kanan jalan menuju arah Pancuran Pitu yang dilanjutkan dengan jalan setapak memasuki hutan damar. Medan dari Titik Start  menuju Pos 1 berupa jalan setapak tanah yang landai. Hutan berupa hutan homogen pohon damar yang dikelola oleh KPH Banyumas. Banyak terdapat tempat datar untuk mendirikan tenda di sepanjang perjalanan menuju Pos 1. Tepat sebelum  Pos 1 kita akan melewati sungai kecil dan dilanjutkan tanjakan terjal dengan batuan yang licin. Setelah tanjakan tersebut kita sampai di Pos 1. Pos 1 berupa tempat datar dengan pohon–pohon besar yang membuat suasananya menjadi teduh. Tidak begitu luas, kira–kira hanya cukup untuk 2 tenda dengan ukuran 4 orang.  Sumber air di Pos 1 ini adalah sungai musiman yang kita temui sebelum Pos 1 tadi, tetapi ketika kemarau panjang sungai tersebut kemungkinan kering. Perjalanan dari Titik Start hingga Pos 1 memakan waktu kira–kira 1 jam" );
			
		Toast.makeText(getBaseContext(), "Pos 1" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" Dari Pos 2 menuju Pos 3 tidak terlalu jauh, kira–kira hanya memakan waktu sekitar 1 jam. Medan berupa jalan tanah setapak yang menanjak dengan vegetasi masih berupa hutan heterogen bersemak. Pos 3 terletak di kordinat 109o12’23’’E, 07o16’50’’S ditandai dengan adanya tugu triangulasi yang menunjukkan  ketinggian 1664 mdpl. Pos 3 tidak terlalu luas, kira-kira hanya bisa untuk 2 tenda ukuran 4 orang" );
		
	Toast.makeText(getBaseContext(), " Pos 2" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Setelah Pos 3 medan mulai konsisten menanjak terjal. Jalan yang dilalui masih berupa jalan setapak dengan vegetasi berupa hutan heterogen bersemak. Dalam perjalanan ke Pos 4 ini tangga–tangga akar pohon mulai terasa sangat berguna seiring dengan medan yang semakin menanjak. Di sepanjang perjalanan terdapat beberapa tempat datar yang di sebut pos bayangan yang cukup untuk 1 – 2 tenda dan  sangat berguna karena jarak Pos 3 ke Pos 4 lumayan lama yaitu sekitar 3 – 4 jam. Pos 4 sendiri terletak di kordinat 109o12’03’’E, 07o15’55’’S. Di Pos 4 ini mempunyai dua bagian terpisah oleh semak belukar, bagian depan hanya bisa untuk mendirikan 2 – 3 tenda, sedangkan bagian belakang di utara bagian depan bisa untuk mendirikan 3 – 4 tenda dengan suasana lebih teduh dan lembab" );
			
	Toast.makeText(getBaseContext(), "Pos 3" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Jalur menuju Pos 5 berupa jalan tanjakan menuju sebuah puncakan. Susana pendakian yang mulanya selalu teduh mulai terasa panas karena  pohon-pohon besar sudah mulai jarang dan berganti dengan cantigi. Vegetasi mulai didominasi oleh semak belukar sehingga sering kita harus bersusah payah melewati jalur berupa terowongan–terowongan semak belukar. Mendekati puncakan jalan semakin menanjak. Di puncakan inilah pertemuan jalur Baturaden dengan Kaliwadas. Dari sini arah pendakian yang mulanya ke utara berubah menjadi ke timur dan medan yang akan dilalui menjadi lebih datar bahkan menjadi turunan. Daerah di sepanjang jalan menuju Pos 5 ini merupakan daerah rawan kebakaran, bisa dilihat dari banyaknya bekas kebakaran yang kita temui. Setelah berjalan sekitar 3 jam dari Pos 4 kita akan sampai di Pos 5. Pos 5 berupa dataran bertingkat dengan beberapa pohon besar di sekitarnya. Keberadaan pohon–pohon ini melindungi Pos 5 dari terpaan angin secara langsung sehingga membuatnya menjadi tempat bermalam yang cukup aman. Terdapat tempat yang cukup luas untuk mendirikan beberapa tenda di sini. Dari Pos 5 ini kita bisa melihat dengan jelas medan yang akan kita lewati menuju puncak Gunung Slamet. Pos 5 merupakan batas vegetasi. Letak kordinat Pos 5 adalah 1109o12’26’’E, 07o14’55’’S dan di sinilah para pendaki biasa meninggalkan barang bawaannya sebelum menuju puncak jika pulangnya akan kembali ke jalur Baturaden atau Jalur Kaliwadas" );
			
	Toast.makeText(getBaseContext(), "Pos 4" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position ==4) {
		txt1.setText("Jalur dari Pos 5 menuju puncak berupa tanjakan batu yang terjal. Perjalanan menuju puncak sangatlah kering karena bisa dibilang dari Pos 5 menuju puncak sudah tidak ada lagi tanaman. Medan berupa batu–batuan lepas dengan jalur yang kurang jelas. Awalnya kita harus mengambil tepat di tengah punggungan kemudian setelah sampai di bibir kawah jalur akan melipir ke arah kanan menuju puncak Gunung Slamet dengan ketinggian 3432 mdpl. Para pendaki diharapkan tidak terlalu lama di puncak karena adanya bau belerang yang cukup menyengat dari gunung berapi yang masih aktif ini. Puncak Gunung Slamet ditandai dengan tugu tumpukan batu. Perjalanan dari Pos 5 menuju puncak bisa ditempuh dengan waktu sekitar 1 jam." );
			
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