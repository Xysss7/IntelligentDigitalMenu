package com.unnc.digitalmenu.intelligentdigitalmenu;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class CustomDialog3 extends Dialog {
    Context mContext;
    private Button butexit;

    public CustomDialog3 (Context context){
        super(context);
        mContext = context;
    }
    public CustomDialog3(Context context, int theme) {
        super(context, theme);
        mContext = context;
    }

    public CustomDialog3(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.mContext = context;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_dialog3, null);
        setCanceledOnTouchOutside(false);

        this.setContentView(layout);

        initview();
    }

    private void initview() {
        // TODO Auto-generated method stub
        butexit = (Button)findViewById(R.id.Exit);
        butexit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                CustomDialog3.this.dismiss();
            }
        });
    }
}