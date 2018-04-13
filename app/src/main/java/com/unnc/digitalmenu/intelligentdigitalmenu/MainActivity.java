package com.unnc.digitalmenu.intelligentdigitalmenu;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private Button button1;
    private CardView cardView;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private ImageView image9;
    private Button butexit;

    private Button btnAdd,btnGetAll;
    private TextView student_Id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        card();
    }

    public void card() {
        cardView = (CardView)findViewById(R.id.cardView);
        cardView.setRadius(8);
        cardView.setCardElevation(8);
        cardView.setContentPadding(5,5,5,5);

        //button1 = (Button)findViewById(R.id.button1);
        image1 = (ImageView) findViewById(R.id.image1);
        butexit = (Button)findViewById(R.id.Exit);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog dialog = new  CustomDialog(MainActivity.this);
                dialog.show();
            }
        });

        image2 = (ImageView) findViewById(R.id.image2);
        butexit = (Button)findViewById(R.id.Exit);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog1 dialog = new  CustomDialog1(MainActivity.this);
                dialog.show();
            }
        });

        image3 = (ImageView) findViewById(R.id.image3);
        butexit = (Button)findViewById(R.id.Exit);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog2 dialog = new  CustomDialog2(MainActivity.this);
                dialog.show();
            }
        });


        image4 = (ImageView) findViewById(R.id.image4);
        butexit = (Button)findViewById(R.id.Exit);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog3 dialog = new  CustomDialog3(MainActivity.this);
                dialog.show();
            }
        });


        image5 = (ImageView) findViewById(R.id.image5);
        butexit = (Button)findViewById(R.id.Exit);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog4 dialog = new  CustomDialog4(MainActivity.this);
                dialog.show();
            }
        });

        image6 = (ImageView) findViewById(R.id.image6);
        butexit = (Button)findViewById(R.id.Exit);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog5 dialog = new  CustomDialog5(MainActivity.this);
                dialog.show();
            }
        });

        image7 = (ImageView) findViewById(R.id.image7);
        butexit = (Button)findViewById(R.id.Exit);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog6 dialog = new  CustomDialog6(MainActivity.this);
                dialog.show();
            }
        });

        image8 = (ImageView) findViewById(R.id.image8);
        butexit = (Button)findViewById(R.id.Exit);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog7 dialog = new  CustomDialog7(MainActivity.this);
                dialog.show();
            }
        });

        image9 = (ImageView) findViewById(R.id.image9);
        butexit = (Button)findViewById(R.id.Exit);
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog8 dialog = new  CustomDialog8(MainActivity.this);
                dialog.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_gallery) {


        } else if (id == R.id.nav_slideshow) {


        } else if (id == R.id.nav_manage) {
            //check if the account is valid
            if(checkAccount()) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }else {
                //not signed in, register or login in
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        } else if (id == R.id.nav_call) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:152567277") );
            startActivity(intent);

        } else if (id == R.id.nav_web) {
            Intent intent = new Intent (Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.baidu.com") );
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public boolean checkAccount() {
        return true;
    }
}
