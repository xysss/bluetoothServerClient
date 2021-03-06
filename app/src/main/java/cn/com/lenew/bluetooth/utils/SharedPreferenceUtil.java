package cn.com.lenew.bluetooth.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lenew on 2016/7/8 0008.
 */
public class SharedPreferenceUtil {

    private static String SHARED_NAME = "bid_yangjing_bluetooth";

    private static SharedPreferenceUtil instance;

    private SharedPreferences sharedPreferences;

    private Context mContext;

    private SharedPreferenceUtil(Context context){
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(SHARED_NAME,Context.MODE_PRIVATE);
    }

    public static SharedPreferenceUtil getInstance(Context context){
        if(instance == null){
            instance = new SharedPreferenceUtil(context);
        }
        return instance;
    }

    public void putString(String key,String value){
        sharedPreferences.edit().putString(key,value).apply();
    }

    public String getString(String key){
        return sharedPreferences.getString(key,"");
    }
}
