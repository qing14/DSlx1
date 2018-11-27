package com.bwie.asus.dslx1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoaderInterface;

public class MainActivity extends AppCompatActivity {

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.banner);
        banner.setImageLoader(new ImageLoaderInterface<ImageView>() {


            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Bean.NewslistBean bean= (Bean.NewslistBean) path;
                ImageLoader.getInstance().displayImage(bean.getPicUrl(),imageView);
            }

            @Override
            public ImageView createImageView(Context context) {
                ImageView imageView=new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            }
        });
        initdata();




    }

    private void initdata() {
        Utils.getInstance().getRequest("https://api.tianapi.com/wxnew/?key=c4aa776e0a51d57d6750511e2baa46b6&num=6&page=1"
                , Bean.class
                , new Utils.Callback<Bean>() {


                    @Override
                    public void onsuccess(Bean bean) {
                        banner.setImages(bean.getNewslist());
                        banner.start();
                    }
                });


    }
}
