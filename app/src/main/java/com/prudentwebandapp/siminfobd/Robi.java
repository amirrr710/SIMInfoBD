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

public class Robi extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private TextView s_number_r, b_check_r, e_balance_r, d_check_r, s_check_r, m_check_r, cc_number_r, li_offer_r,p_sms_off_r;
    private TextView s_number_r_call, b_check_r_call, e_balance_r_call, d_check_r_call, s_check_r_call, m_check_r_call,
            cc_number_r_call, li_offer_r_call, p_sms_off_r_call;

    TextView s_number_r_copy, b_check_r_copy, e_balance_r_copy, d_check_r_copy, m_check_r_copy,s_check_r_copy,
            cc_number_r_copy, li_offer_r_copy, p_sms_off_r_copy;

    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robi);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        s_number_r = findViewById(R.id.s_number_r);
        b_check_r = findViewById(R.id.b_check_r);
        e_balance_r = findViewById(R.id.e_balance_r);
        d_check_r = findViewById(R.id.d_check_r);
        s_check_r = findViewById(R.id.s_check_r);
        m_check_r = findViewById(R.id.m_check_r);
        cc_number_r = findViewById(R.id.cc_number_r);
        li_offer_r = findViewById(R.id.li_offer_r);
        p_sms_off_r = findViewById(R.id.p_sms_off_r);


        s_number_r_call = findViewById(R.id.s_number_r_call);
        b_check_r_call = findViewById(R.id.b_check_r_call);
        e_balance_r_call = findViewById(R.id.e_balance_r_call);
        d_check_r_call = findViewById(R.id.d_check_r_call);
        s_check_r_call = findViewById(R.id.s_check_r_call);
        m_check_r_call = findViewById(R.id.m_check_r_call);
        cc_number_r_call = findViewById(R.id.cc_number_r_call);
        li_offer_r_call = findViewById(R.id.li_offer_r_call);
        p_sms_off_r_call = findViewById(R.id.p_sms_off_r_call);


        s_number_r_copy = findViewById(R.id.s_number_r_copy);

        s_number_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",s_number_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });



        b_check_r_copy = findViewById(R.id.b_check_r_copy);

        b_check_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",b_check_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });



        e_balance_r_copy = findViewById(R.id.e_balance_r_copy);

        e_balance_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",e_balance_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });



        d_check_r_copy = findViewById(R.id.d_check_r_copy);

        d_check_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",d_check_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });



        m_check_r_copy = findViewById(R.id.m_check_r_copy);

        m_check_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",m_check_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });



        s_check_r_copy = findViewById(R.id.s_check_r_copy);

        s_check_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",s_check_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();


            }
        });




        cc_number_r_copy =  findViewById(R.id.cc_number_r_copy);

        cc_number_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",cc_number_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });




        li_offer_r_copy = findViewById(R.id.li_offer_r_copy);

        li_offer_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",li_offer_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });


        p_sms_off_r_copy = findViewById(R.id.p_sms_off_r_copy);

        p_sms_off_r_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText( "text",p_sms_off_r.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Robi.this, "Number Copied!", Toast.LENGTH_SHORT).show();

            }
        });




        s_number_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton();

            }
        });

        b_check_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton1();

            }
        });

        e_balance_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton2();

            }
        });

        d_check_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton3();

            }
        });

        s_check_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton4();

            }
        });

        m_check_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton5();

            }
        });


        cc_number_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton6();

            }
        });


        li_offer_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton7();

            }
        });


        p_sms_off_r_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callButton8();

            }
        });




    }

        private void callButton () {
            String number = s_number_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*2" + "%23" ;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


        private void callButton1 () {
            String number = b_check_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*222" + "%23";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


        private void callButton2 () {
            String number = e_balance_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*8" + "%23";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


        private void callButton3 () {
            String number = d_check_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*3" + "%23";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


        private void callButton4 () {
            String number = m_check_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*222*2" + "%23";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


        private void callButton5 () {
            String number = s_check_r.getText().toString();

            if (number.trim().length() > 0) {
                if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                        CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Robi.this, new String[]{
                            Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:*222*10" + "%23";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }
            }
        }


    private void callButton6 () {
        String number = cc_number_r.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Robi.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:123";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton7 () {
        String number = li_offer_r.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Robi.this, new String[]{
                        Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:*123" + "%23";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void callButton8 () {
        String number = p_sms_off_r.getText().toString();

        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Robi.this, Manifest.permission.
                    CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Robi.this, new String[]{
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
