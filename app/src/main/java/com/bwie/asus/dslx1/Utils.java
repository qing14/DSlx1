package com.bwie.asus.dslx1;

import android.os.AsyncTask;

import com.google.common.io.CharStreams;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Utils {

    public static Utils instance;

    public Utils() {
    }
    public static Utils getInstance(){
        if (instance==null){
            instance=new Utils();
        }
        return instance;
    }



    public interface Callback<T>{
        void onsuccess(T t);
    }
    public void getRequest(final String urlstr,final Class clazz,final Callback callback){
        new AsyncTask<String,Void,Object>(){

            @Override
            protected Object doInBackground(String... strings) {
                return getRequest(strings[0],clazz);
            }

            @Override
            protected void onPostExecute(Object o) {
                callback.onsuccess(o);
            }
        }.execute(urlstr);
    }

    private <T> T getRequest(String urlStr, Class clazz) {
        return (T) new Gson().fromJson(getRequest(urlStr),clazz);
    }

    public String getRequest(String urlStr) {
        String result="";
        try {
            URL url=new URL(urlStr);
            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();

            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            int code = httpURLConnection.getResponseCode();
            if (code==200){
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader streamReader=new InputStreamReader(inputStream,"UTF-8");
                result = CharStreams.toString(streamReader);


            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;

    }


}
