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

public class Airtel extends AppCompatActivity {


    private static final int REQUEST_CALL = 1;
    private TextView s_number_a, b_check_a, e_balance_a, d_check_a,s_check_a, m_check_a, cc_number_a,li_offer_a, p_sms_off_a;
    TextView s_number_a_copy, b_check_a_copy, e_balance_a_copy, d_check_a_copy, m_check_a_copy,s_check_a_copy,
            cc_number_a_copy, li_offer_a_copy, p_sms_off_a_copy;
    private TextView s_number_a_call, b_check_a_call, e_balance_a_call, d_check_a_call, s_check_a_call,m_check_a_call,
            cc_number_a_call,li_offer_a_call, p_sms_off_a_call;

    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtel);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        s_number_a_call = findViewById(R.id.s_number_a_call);
        b_check_a_call = findViewById(R.id.b_check_a_call);
        e_balance_a_call = findViewById(R.id.e_balance_a_call);
        d_check_a_call = findViewById(R.id.d_check_a_call);
        s_check_a_call = findViewById(R.id.s_check_a_call);
        m_check_a_call = findViewById(R.id.m_check_a_call);
        cc_number_a_call = findViewById(R.id.cc_number_a_call);
        li_offer_a_call = findViewById(R.id.li_offer_a_call);
        p_sms_off_a_call = findViewById(R.id.p_sms_off_a_call);



        s_number_a = findViewById(R.id.s_number_a);
        s_number_a_copy = findViewById(R.id.s_number_a_copy);

        s_number_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",s_number_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        b_check_a = findViewById(R.id.b_check_a);
        b_check_a_copy = findViewById(R.id.b_check_a_copy);

        b_check_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",b_check_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        e_balance_a = findViewById(R.id.e_balance_a);
        e_balance_a_copy = findViewById(R.id.e_balance_a_copy);

        e_balance_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",e_balance_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });


        d_check_a = findViewById(R.id.d_check_a);
        d_check_a_copy = findViewById(R.id.d_check_a_copy);

        d_check_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",d_check_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });


        m_check_a = findViewById(R.id.m_check_a);
        m_check_a_copy = findViewById(R.id.m_check_a_copy);

        m_check_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",m_check_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });


        s_check_a = findViewById(R.id.s_check_a);
        s_check_a_copy = findViewById(R.id.s_check_a_copy);

        s_check_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",s_check_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });



        cc_number_a = findViewById(R.id.cc_number_a);
        cc_number_a_copy =  findViewById(R.id.cc_number_a_copy);

        cc_number_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",cc_number_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });



        li_offer_a = findViewById(R.id.li_offer_a);
        li_offer_a_copy = findViewById(R.id.li_offer_a_copy);

        li_offer_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",li_offer_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        p_sms_off_a = findViewById(R.id.p_sms_off_a);
        p_sms_off_a_copy = findViewById(R.id.p_sms_off_a_copy);

        p_sms_off_a_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",p_sms_off_a.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Airtel.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        s_number_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton();

            }
        });

        b_check_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton1();

            }
        });

        e_balance_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton2();

            }
        });

        d_check_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton3();

            }
        });

        s_check_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton4();

            }
        });

        m_check_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton5();

            }
        });


        cc_number_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton6();

            }
        });


        li_offer_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton7();

            }
        });


        p_sms_off_a_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton8();

            }
        });




    }

    private void callButton () {
        String number = s_number_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*2" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton1 () {
        String number = b_check_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*778" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton2 () {
        String number = e_balance_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*141*10" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton3 () {
        String number = d_check_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*3" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton4 () {
        String number = m_check_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*0" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton5 () {
        String number = s_check_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*778*2" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton6 () {
        String number = cc_number_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:121";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton7 () {
        String number = li_offer_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*4" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton8 () {
        String number = p_sms_off_a.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Airtel.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Airtel.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*7" + "%23";
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
                callButton5();
                callButton6();
                callButton7();
                callButton8();

            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }

        }



    }
}