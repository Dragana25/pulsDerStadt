package com.example.paurevic.pulsderstadt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Timo on 04.07.2015.
 */
public class MainActivity3 extends Activity {
    RatingBar rb1;
    RatingBar rb2;
    TextView tv1;
    TextView tv2;
    float userRating;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_app);
       /* rb1 = (RatingBar)findViewById(R.id.rating1);
        rb1.setNumStars(5);
        rb1.setStepSize(1);
        rb1.setRating(1);
        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            //wie viele Sterne vergeben wurden
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                userRating = rb1.getRating();
                if (userRating == 0) {
                    rb1.setRating(1);
                }
                if (userRating == 1) {
                    rb1.setRating(1);
                    tv1.setText("sehr schlecht (1 Stern)");
                }
                if (userRating == 2) {
                    rb1.setRating(2);
                    tv1.setText("schlecht (2 Sterne)");
                }
                if (userRating == 3) {
                    rb1.setRating(3);
                    tv1.setText("nicht so gut (3 Sterne)");
                }
                if (userRating == 4) {
                    rb1.setRating(4);
                    tv1.setText("In Ordnung (4 Sterne)");
                }
                if (userRating == 5) {
                    rb1.setRating(5);
                    tv1.setText("Gut (5 Sterne)");
                }
                if (userRating == 6) {
                    rb1.setRating(6);
                    tv1.setText("Sehr gut (6 Sterne)");
                }
            }
        });
        rb2 = (RatingBar)findViewById(R.id.rating2);
        rb2.setNumStars(5);
        rb2.setStepSize(1);
        tv1 = (TextView)findViewById(R.id.text1);
        tv2 = (TextView)findViewById(R.id.text2);*/
    }
}