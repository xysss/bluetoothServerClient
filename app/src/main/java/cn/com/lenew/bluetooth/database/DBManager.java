package cn.com.lenew.bluetooth.database;

import org.xutils.DbManager;
import org.xutils.db.Selector;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

import cn.com.lenew.bluetooth.bean.BluetoothMessage;

/**
 * Created by lenovo on 2016/7/11 0011.
 */
public class DBManager {

    private static DbManager.DaoConfig daoConfig;

    public static DbManager.DaoConfig getDaoConfig(){
        if(daoConfig==null){
            daoConfig = new DbManager.DaoConfig();
            daoConfig.setDbVersion(2);
        }
        return daoConfig;
    }


    public static void save(Object obj){
        try {
            x.getDb(DBManager.getDaoConfig()).save(obj);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }


    public static List<BluetoothMessage> findAll(String remoteAddress) {
        try {

            Selector<BluetoothMessage> selector = x.getDb(getDaoConfig()).selector(BluetoothMessage.class);
            selector.where("sender","=",remoteAddress);
            selector.or("receiver","=",remoteAddress);
            return selector.findAll();
        } catch (DbException e) {
            e.printStackTrace();
        }
        return null;
    }
}
