package com.unnc.digitalmenu.intelligentdigitalmenu;

/**
 * Created by xys_0329 on 2018/3/11.
 */


/**
 * Created by Kite on 2018/3/19.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerRepo {
    private DBHelper dbHelper;

    public CustomerRepo(Context context){
        dbHelper=new DBHelper(context);
    }

    public int insert(Customer customer){
        //打开连接，写入数据
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Customer.KEY_email,customer.email);
        values.put(Customer.KEY_password,customer.password);
        //
        long customer_Id=db.insert(Customer.TABLE,null,values);
        db.close();
        return (int)customer_Id;
    }

    public void delete(int customer_Id){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        db.delete(Customer.TABLE,Customer.KEY_ID+"=?", new String[]{String.valueOf(customer_Id)});
        db.close();
    }
    public void update(Customer customer){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(Customer.KEY_email,customer.email);
        values.put(Customer.KEY_password,customer.password);

        db.update(Customer.TABLE,values,Customer.KEY_ID+"=?",new String[] { String.valueOf(customer.customer_ID) });
        db.close();
    }

    public ArrayList<HashMap<String, String>> getCustomerList(){
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        String selectQuery="SELECT "+
                Customer.KEY_ID+","+
                Customer.KEY_email+","+
                Customer.KEY_password+" FROM "+Customer.TABLE;
        ArrayList<HashMap<String,String>> customerList=new ArrayList<HashMap<String, String>>();
        Cursor cursor=db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst()){
            do{
                HashMap<String,String> customer=new HashMap<String,String>();
                customer.put("id",cursor.getString(cursor.getColumnIndex(Customer.KEY_ID)));
                customer.put("name",cursor.getString(cursor.getColumnIndex(Customer.KEY_email)));
                customerList.add(customer);
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return customerList;
    }

    public Customer getCustomerById(int Id){
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        String selectQuery="SELECT "+
                Customer.KEY_ID + "," +
                Customer.KEY_email + "," +
                Customer.KEY_password +
                " FROM " + Customer.TABLE
                + " WHERE " +
                Customer.KEY_ID + "=?";
        int iCount=0;
        Customer customer=new Customer();
        Cursor cursor=db.rawQuery(selectQuery,new String[]{String.valueOf(Id)});
        if(cursor.moveToFirst()){
            do{
                customer.customer_ID =cursor.getInt(cursor.getColumnIndex(Customer.KEY_ID));
                customer.email  =cursor.getString(cursor.getColumnIndex(Customer.KEY_email));
                customer.password =cursor.getString(cursor.getColumnIndex(Customer.KEY_password));
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return customer;
    }

    //检验用户名是否已存在
    public boolean CheckIsDataAlreadyInDBorNot(String value){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        String Query="SELECT "+
                Customer.KEY_ID + "," +
                Customer.KEY_email + "," +
                Customer.KEY_password +
                " FROM " + Customer.TABLE
                + " WHERE " +
                Customer.KEY_email + "=?";
        Cursor cursor = db.rawQuery(Query,new String[] { value });
        if (cursor.getCount()>0){
            cursor.close();
            return  true;
        }
        cursor.close();
        return false;
    }

    //验证登录
    public boolean login(String email,String password) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String Query = "select * from Customer where email=? and password=?";
        Cursor cursor = db.rawQuery(Query, new String[] {email, password});
        if (cursor.moveToFirst()) {
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }

}
