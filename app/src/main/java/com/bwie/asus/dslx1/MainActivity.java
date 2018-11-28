package com.bwie.asus.dslx1;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoaderInterface;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Banner banner;
    private ArrayList<String> list;
    private TextView name;
    private TextView price1;
    private TextView price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.banner);
        name = findViewById(R.id.name);
        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);

        banner.setImageLoader(new ImageLoaderInterface<ImageView>() {


            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                ImageLoader.getInstance().displayImage((String) path,imageView);
            }

            @Override
            public ImageView createImageView(Context context) {
                ImageView imageView=new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return imageView;
            }
        });
        initdata();




    }

    private void initdata() {

        Utils.getInstance().getRequest("http://www.zhaoapi.cn/product/getProductDetail?pid=1"
                , Bean.class
                , new Utils.Callback<Bean>() {


                    @Override
                    public void onsuccess(Bean bean) {
                        list = new ArrayList<>();
                        String[] split = bean.getData().getImages().split("\\|");

                        Log.i("TEXT",split.length+"one");

                        for (int i=0;i<split.length;i++){
                            list.add(split[i]);
                        }
                        name.setText(bean.getData().getTitle());
                        price1.setText("原价："+bean.getData().getPrice());
                        price1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                        price2.setText("优惠价："+bean.getData().getBargainPrice());
                        banner.setImages(list);
                        banner.start();


                    }
                });
           }
           private void sub(String str){
                int index=str.indexOf("|");
                if (index>=0){
                    String string=str.substring(0,index);
                    list.add(string);
                    sub(str.substring(index+1,str.length()));
                }else {
                    list.add(str);
                }



           }


}
