package com.prudentwebandapp.siminfobd;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AllAboutSim extends AppCompatActivity {

    ImageView grameenphone;
    ImageView airtel;
    ImageView robi;
    ImageView banglalink;
    ImageView teletok;

    AdView mAdView;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_about_sim);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        loadFullScreenAd();

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        grameenphone = findViewById(R.id.grameenphone);
        grameenphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mInterstitialAd!= null) {
                    mInterstitialAd.show(AllAboutSim.this);
                }

                Intent myIntent = new Intent(AllAboutSim.this, GrameenPhone.class);
                startActivity(myIntent);

            }
        });



        airtel = findViewById(R.id.airtel);
        airtel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mInterstitialAd!= null) {
                    mInterstitialAd.show(AllAboutSim.this);
                }

                Intent myIntent = new Intent(AllAboutSim.this, Airtel.class);
                startActivity(myIntent);
            }
        });



        robi = findViewById(R.id.robi);
        robi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mInterstitialAd!= null) {
                    mInterstitialAd.show(AllAboutSim.this);
                }

                Intent myIntent = new Intent(AllAboutSim.this, Robi.class);
                startActivity(myIntent);
            }
        });



        banglalink = findViewById(R.id.banglalink);
        banglalink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mInterstitialAd!= null) {
                    mInterstitialAd.show(AllAboutSim.this);
                }

                Intent myIntent = new Intent(AllAboutSim.this, Banglalink.class);
                startActivity(myIntent);
            }
        });



        teletok = findViewById(R.id.teletok);
        teletok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mInterstitialAd!= null) {
                    mInterstitialAd.show(AllAboutSim.this);
                }

                Intent myIntent = new Intent(AllAboutSim.this, TeleTok.class);
                startActivity(myIntent);
            }
        });




    }


    private void loadFullScreenAd(){

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;


                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.

                                loadFullScreenAd();

                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                            }
                        });


                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });
    }


}