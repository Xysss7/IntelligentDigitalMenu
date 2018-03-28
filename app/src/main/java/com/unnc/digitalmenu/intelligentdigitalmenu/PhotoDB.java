package com.unnc.digitalmenu.intelligentdigitalmenu;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by xys_0329 on 2018/3/27.
 */

public class PhotoDB {

    //在数据库创建时，图片字段的数据类型存储为 BLOB数据库插入操作
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "create table " + Photo.TABLE + " ( " + Photo.KEY_ID + " integer primary key , " + Photo.KEY_image+ " BLOB ) ";
        db.execSQL(sql);
    }

}
