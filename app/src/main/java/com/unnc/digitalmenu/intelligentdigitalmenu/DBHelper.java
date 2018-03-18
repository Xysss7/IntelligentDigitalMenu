package com.unnc.digitalmenu.intelligentdigitalmenu;

/**
 * Created by xys_0329 on 2018/3/11.
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;


public class DBHelper extends SQLiteOpenHelper {
    //数据库版本号
    private static final int DATABASE_VERSION=4;

    //数据库名称
    private static final String DATABASE_NAME="crud.db";

    public DBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建数据表
        String CREATE_TABLE_Customer="CREATE TABLE "+ Customer.TABLE+"("
                +Customer.KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                +Customer.KEY_name+" TEXT, "
                +Customer.KEY_age+" INTEGER, "
                +Customer.KEY_email+" TEXT)";
        db.execSQL(CREATE_TABLE_Customer);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //如果旧表存在，删除，所以数据将会消失
        db.execSQL("DROP TABLE IF EXISTS "+ Customer.TABLE);

        //再次创建表
        onCreate(db);
    }
}