package com.tyler_buchheim.simplemusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        /*
         * Set onclick listeners for relevant intents
         */
        Button payment = (Button) findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(StoreActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
        Button details = (Button) findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailsIntent = new Intent(StoreActivity.this, DetailsActivity.class);
                startActivity(detailsIntent);
            }
        });
        Button main = (Button) findViewById(R.id.main);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
