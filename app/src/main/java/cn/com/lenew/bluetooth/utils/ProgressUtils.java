package cn.com.lenew.bluetooth.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by lenovo on 2016/7/8 0008.
 */
public class ProgressUtils {

    private static ProgressDialog progressDialog;

    public static void showProgress(Context context,String msg){
        progressDialog = ProgressDialog.show(context,null,msg,false,true);
    }

    public static void dismissProgress(){
        if(progressDialog!=null && progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }

}
