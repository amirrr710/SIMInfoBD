package com.prudentwebandapp.siminfobd;

import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class GrameenPhone extends AppCompatActivity {


    private static final int REQUEST_CALL = 1;
    private TextView s_number_g, b_check_g, e_balance_g, d_check_g, m_check_g, cc_number_g,li_offer_g, p_sms_off_g;
    TextView s_number_g_copy, b_check_g_copy, e_balance_g_copy, d_check_g_copy, m_check_g_copy,
            cc_number_g_copy, li_offer_g_copy, p_sms_off_g_copy;
    private TextView s_number_g_call, b_check_g_call, e_balance_g_call, d_check_g_call, m_check_g_call,
            cc_number_g_call,li_offer_g_call, p_sms_off_g_call;


    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grameen_phone);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        s_number_g_call = findViewById(R.id.s_number_g_call);
        b_check_g_call = findViewById(R.id.b_check_g_call);
        e_balance_g_call = findViewById(R.id.e_balance_g_call);
        d_check_g_call = findViewById(R.id.d_check_g_call);
        m_check_g_call = findViewById(R.id.m_check_g_call);
        cc_number_g_call = findViewById(R.id.cc_number_g_call);
        li_offer_g_call = findViewById(R.id.li_offer_g_call);
        p_sms_off_g_call = findViewById(R.id.p_sms_off_g_call);


        s_number_g = findViewById(R.id.s_number_g);
        s_number_g_copy = findViewById(R.id.s_number_g_copy);

        s_number_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",s_number_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        b_check_g = findViewById(R.id.b_Check_g);
        b_check_g_copy = findViewById(R.id.b_check_g_copy);

        b_check_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",b_check_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        e_balance_g = findViewById(R.id.e_balance_g);
        e_balance_g_copy = findViewById(R.id.e_balance_g_copy);

        e_balance_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",e_balance_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });


        d_check_g = findViewById(R.id.d_check_g);
        d_check_g_copy = findViewById(R.id.d_check_g_copy);

        d_check_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",d_check_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });


        m_check_g = findViewById(R.id.m_check_g);
        m_check_g_copy = findViewById(R.id.m_check_g_copy);

        m_check_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",m_check_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });



        cc_number_g = findViewById(R.id.cc_number_g);
        cc_number_g_copy =  findViewById(R.id.cc_number_g_copy);

        cc_number_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",cc_number_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });



        li_offer_g = findViewById(R.id.li_offer_g);
        li_offer_g_copy = findViewById(R.id.li_offer_g_copy);

        li_offer_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",li_offer_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        p_sms_off_g = findViewById(R.id.p_sms_off_g);
        p_sms_off_g_copy = findViewById(R.id.p_sms_off_g_copy);

        p_sms_off_g_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",p_sms_off_g.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(GrameenPhone.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });



        s_number_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton();

            }
        });

        b_check_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton1();

            }
        });

        e_balance_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton2();

            }
        });

        d_check_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton3();

            }
        });

        m_check_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton4();

            }
        });


        cc_number_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton6();

            }
        });


        li_offer_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton7();

            }
        });


        p_sms_off_g_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton8();

            }
        });




    }

    private void callButton () {
        String number = s_number_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*2" + "%23" ;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton1 () {
        String number = b_check_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*566" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton2 () {
        String number = e_balance_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*1010*1" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton3 () {
        String number = d_check_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*121*1*4" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton4 () {
        String number = m_check_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*121*1*2" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }



    private void callButton6 () {
        String number = cc_number_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:121";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton7 () {
        String number = li_offer_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*444" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton8 () {
        String number = p_sms_off_g.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(GrameenPhone.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(GrameenPhone.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*121*1101" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }






    @Override
    public void onRequestPermissionsResult ( int requestCode, @NonNull String[] permissions,
                                             @NonNull int[] grantResults){
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callButton();
                callButton1();
                callButton2();
                callButton3();
                callButton4();
                callButton6();
                callButton7();
                callButton8();

            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }

        }



    }
}