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
    private Button buttonplus1;
    private Button buttonminus1;
    private Button buttonplus2;
    private Button buttonminus2;
    private Button buttonplus3;
    private Button buttonminus3;
    private Button buttonplus4;
    private Button buttonminus4;
    private Button buttonplus5;
    private Button buttonminus5;
    private Button buttonplus6;
    private Button buttonminus6;
    private Button buttonplus7;
    private Button buttonminus7;
    private Button buttonplus8;
    private Button buttonminus8;
    private Button buttonplus9;
    private Button buttonminus9;



    private int num1;
    private TextView textView1;
    private int num2;
    private TextView textView2;
    private int num3;
    private TextView textView3;
    private int num4;
    private TextView textView4;
    private int num5;
    private TextView textView5;
    private int num6;
    private TextView textView6;
    private int num7;
    private TextView textView7;
    private int num8;
    private TextView textView8;
    private int num9;
    private TextView textView9;

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

        textView1 = (TextView)findViewById(R.id.etAmount1);
        num1 = Integer.parseInt(textView1.getText().toString());
        Button buttonplus1 = (Button)findViewById(R.id.buttonplus1);
        buttonplus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1 + 1;
                textView1.setText(Integer.toString(num1));
            }
        });

        textView1 = (TextView)findViewById(R.id.etAmount1);
        num1 = Integer.parseInt(textView1.getText().toString());
        Button buttonminus1 = (Button)findViewById(R.id.buttonminus1);
        buttonminus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1 >= 1) {
                    num1 = num1 - 1;
                }
                textView1.setText(Integer.toString(num1));
            }
        });

        textView2 = (TextView)findViewById(R.id.etAmount2);
        num1 = Integer.parseInt(textView1.getText().toString());
        Button buttonplus2 = (Button)findViewById(R.id.buttonplus2);
        buttonplus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = num2 + 1;
                textView2.setText(Integer.toString(num2));
            }
        });

        textView2 = (TextView)findViewById(R.id.etAmount2);
        num2 = Integer.parseInt(textView2.getText().toString());
        Button buttonminus2 = (Button)findViewById(R.id.buttonminus2);
        buttonminus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num2 >= 1) {
                    num2 = num2 - 1;
                }
                textView2.setText(Integer.toString(num2));
            }
        });

        textView3 = (TextView)findViewById(R.id.etAmount3);
        num3 = Integer.parseInt(textView3.getText().toString());
        Button buttonplus3 = (Button)findViewById(R.id.buttonplus3);
        buttonplus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3 = num3 + 1;
                textView3.setText(Integer.toString(num3));
            }
        });

        textView3 = (TextView)findViewById(R.id.etAmount3);
        num3 = Integer.parseInt(textView3.getText().toString());
        Button buttonminus3 = (Button)findViewById(R.id.buttonminus3);
        buttonminus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num3 >= 1) {
                    num3 = num3 - 1;
                }
                textView3.setText(Integer.toString(num3));
            }
        });

        textView4 = (TextView)findViewById(R.id.etAmount4);
        num4 = Integer.parseInt(textView4.getText().toString());
        Button buttonplus4 = (Button)findViewById(R.id.buttonplus4);
        buttonplus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num4 = num4 + 1;
                textView4.setText(Integer.toString(num4));
            }
        });

        textView4 = (TextView)findViewById(R.id.etAmount4);
        num4 = Integer.parseInt(textView4.getText().toString());
        Button buttonminus4 = (Button)findViewById(R.id.buttonminus4);
        buttonminus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num4 >= 1) {
                    num4 = num4 - 1;
                }
                textView4.setText(Integer.toString(num4));
            }
        });

        textView5 = (TextView)findViewById(R.id.etAmount5);
        num5 = Integer.parseInt(textView5.getText().toString());
        Button buttonplus5 = (Button)findViewById(R.id.buttonplus5);
        buttonplus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num5 = num5 + 1;
                textView5.setText(Integer.toString(num5));
            }
        });

        textView5 = (TextView)findViewById(R.id.etAmount5);
        num5 = Integer.parseInt(textView5.getText().toString());
        Button buttonminus5 = (Button)findViewById(R.id.buttonminus5);
        buttonminus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num5 >= 1) {
                    num5 = num5 - 1;
                }
                textView5.setText(Integer.toString(num5));
            }
        });

        textView6 = (TextView)findViewById(R.id.etAmount6);
        num6 = Integer.parseInt(textView6.getText().toString());
        Button buttonplus6 = (Button)findViewById(R.id.buttonplus6);
        buttonplus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num6 = num6 + 1;
                textView6.setText(Integer.toString(num6));
            }
        });

        textView6 = (TextView)findViewById(R.id.etAmount6);
        num6 = Integer.parseInt(textView6.getText().toString());
        Button buttonminus6 = (Button)findViewById(R.id.buttonminus6);
        buttonminus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num6 >= 1) {
                    num6 = num6 - 1;
                }
                textView6.setText(Integer.toString(num6));
            }
        });


        textView7 = (TextView)findViewById(R.id.etAmount7);
        num7 = Integer.parseInt(textView7.getText().toString());
        Button buttonplus7 = (Button)findViewById(R.id.buttonplus7);
        buttonplus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num7= num7 + 1;
                textView7.setText(Integer.toString(num7));
            }
        });

        textView7 = (TextView)findViewById(R.id.etAmount7);
        num7 = Integer.parseInt(textView7.getText().toString());
        Button buttonminus7 = (Button)findViewById(R.id.buttonminus7);
        buttonminus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num7 >= 1) {
                    num7 = num7 - 1;
                }
                textView7.setText(Integer.toString(num7));
            }
        });


        textView8 = (TextView)findViewById(R.id.etAmount8);
        num8 = Integer.parseInt(textView3.getText().toString());
        Button buttonplus8 = (Button)findViewById(R.id.buttonplus8);
        buttonplus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num8 = num8 + 1;
                textView8.setText(Integer.toString(num8));
            }
        });

        textView8 = (TextView)findViewById(R.id.etAmount8);
        num8 = Integer.parseInt(textView8.getText().toString());
        Button buttonminus8 = (Button)findViewById(R.id.buttonminus8);
        buttonminus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num8 >= 1) {
                    num8 = num8 - 1;
                }
                textView8.setText(Integer.toString(num8));
            }
        });

        textView9 = (TextView)findViewById(R.id.etAmount9);
        num9 = Integer.parseInt(textView9.getText().toString());
        Button buttonplus9 = (Button)findViewById(R.id.buttonplus9);
        buttonplus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num9 = num9 + 1;
                textView9.setText(Integer.toString(num9));
            }
        });

        textView9 = (TextView)findViewById(R.id.etAmount9);
        num9 = Integer.parseInt(textView9.getText().toString());
        Button buttonminus9 = (Button)findViewById(R.id.buttonminus9);
        buttonminus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num9 >= 1) {
                    num9 = num9 - 1;
                }
                textView9.setText(Integer.toString(num9));
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
