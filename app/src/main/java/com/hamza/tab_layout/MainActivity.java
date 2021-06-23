package com.hamza.tab_layout;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentInteractionListener, FragmentCall.OnFragmentInteractionListener {
TextView call,status,chat;
Button camerabtn;
ViewPager viewPager;
PagerViewAdapter pagerViewAdapter;

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call =   (TextView)findViewById(R.id.call);
        camerabtn =   (Button)findViewById(R.id.Maincamera);
        status  = (TextView)findViewById(R.id.status);
        chat = (TextView)findViewById(R.id.chat);

       /* viewPager = (ViewPager)findViewById(R.id.fragment_layout);
        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);
*/
        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //viewPager.setCurrentItem(0);
                loadFragment(new FragmentOne());
            }
        });
        /*
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int i) {
                onTabChange(i);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        }); */
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onTabChange(int i) {
        if(i==0){
            camerabtn.setTextSize(25);
            camerabtn.setTextColor(getColor(R.color.bright_color));
            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));
            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));
            call.setTextSize(20);
            call.setTextColor(getColor(R.color.light_color));
        }
        if(i==1){
            camerabtn.setTextSize(20);
            camerabtn.setTextColor(getColor(R.color.light_color));
            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.bright_color));
            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));
            call.setTextSize(20);
            call.setTextColor(getColor(R.color.light_color));
        }
        if(i==2){
            camerabtn.setTextSize(20);
            camerabtn.setTextColor(getColor(R.color.light_color));
            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));
            status.setTextSize(25);
            status.setTextColor(getColor(R.color.bright_color));
            call.setTextSize(20);
            call.setTextColor(getColor(R.color.light_color));
        }
        if(i==3){
            camerabtn.setTextSize(20);
            camerabtn.setTextColor(getColor(R.color.light_color));
            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));
            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));
            call.setTextSize(25);
            call.setTextColor(getColor(R.color.bright_color));
        }


    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragmeneOne,fragment);
        fragmentTransaction.commit();
    }


}
