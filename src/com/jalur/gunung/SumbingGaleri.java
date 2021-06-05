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
 
public class SumbingGaleri extends Activity implements ViewFactory{
 
Integer[] imageIDS = {R.drawable.sumbing1, R.drawable.sumbing2, R.drawable.sumbing3, R.drawable.sumbing4};

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
		txt1.setText("Basecamp Sumbing (lat=-7.350184 lon=110.028583) ketinggian 1415 m Basecamp sumbing tempanya seperti gudang penyimpanan hasil panen. Jika musim panen tiba basecampnya biasanya dipindah ke lebih atas dekat dengan permukiman warga. Waktu saya bangun pagi terlihat cahaya kemerahan menyelimuti gunung Sindoro, indah sekali pemandangan langitnya. Setelah bersiap-siap kami berkumpul untuk memutuskan jalur mana yang harus dilewati untuk mendaki. Setelah diskusi yang panjang akhirnya diputuskan menggunakan jalur lama." );
			
		Toast.makeText(getBaseContext(), "Base Camp" +"",
		Toast.LENGTH_SHORT).show(); 
		} 
	else if (position == 1) {
	txt1.setText(" Kami berangkat menuju pos 1 trek yang dilewatu yaitu jalan aspal kemudian dilanjutkan dengan jalan berbatu. Dari basecamp sampai permukiman warga jalannya cenderung lebih landai. Namun setelah belok ke jalur lama, jalan akan berubah menjadi menanjak dengan trek berbatu. Track yang cukup pangjang dengan tanjakan yang menguras tenaga. Tanjakan yang seperti ga ada abisnya menjadi sarapan pagi kami. " );
		
	Toast.makeText(getBaseContext(), " Pos 1" +"",
	Toast.LENGTH_SHORT).show(); 
	} 
	else if (position == 2) {
		txt1.setText("Butuh waktu 1 jam untuk mendaki dari pos 1 ke pos 2. Di pos 2 tempatnya juga cukup lebar. Hampir sama dengan pos 1. Tempatnya juga dilindungin oleh pohon. Setelah istirahat sekitar 5 menit kami melanjutkan perjalanan ke pos 3. Trek dan pemandangannya hampir sama sepertiperjalanan sebelumnya hutan dengan melewati tebing. Jika menemui tanjakan yang cukup terjal berati hampir sampai ke pos 3. Karena pos 3terletak di ujung tanjakan tersebut. Tanjakannya cukup curam sebenarnya tapi karena sudah dibuat seperti tangga jadi terasa tidak bergitu berat. Namun berhati-hati jika hujan karena treknya tanah mudah untuk tergelincir." );
			
	Toast.makeText(getBaseContext(), "Pos 2" +"",
	Toast.LENGTH_SHORT).show(); 
	}
	else if (position == 3) {
		txt1.setText("Butuh waktu 1 jam untuk mencapai pos 3 dari pos 2. Tempatnya tidak begitu lebar mungkin hanya cukup untuk 2-3 tenda. Di pos 3 pohon sudah jarang sehingga agak kurang terlindungi dari badai ataupun panas. Karena sudah beristirahat sebelumnya kami di pos 3 tidak beristirahat dan langsung melanjutkan perjalanan ke pos 4. Untuk mencapai ke pos 4 ternyata terdapat pula tanjakan yang curam dan tajam. Tanjakannya hampir sama seperti tanjakan pos 3" );
			
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