package com.example.paurevic.pulsderstadt;



        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class CardViewActivity extends Activity {

    View button, button2, button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_activity);
        /*addListenerOnButton(View.inflate(null, R.layout.cardview_activity, null));
        addListenerOnButton2(View.inflate(null, R.layout.cardview_activity, null));
        addListenerOnButton3(View.inflate(null,R.layout.cardview_activity,null));*/

    }

    public void addListenerOnButton(View v) {

        final Context context = this;

        button = (View) findViewById(R.id.cv);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }


        });

        button2 = (View) findViewById(R.id.cv2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity3.class);
                startActivity(intent);

            }

        });

        button3 = (View) findViewById(R.id.cv23);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

            }

        });

    }


    public void addListenerOnButton2(View v) {

        final Context context = this;

        button = (View) findViewById(R.id.cv2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });
    }

    public void addListenerOnButton3(View v) {

        final Context context = this;

        button = (View) findViewById(R.id.cv23);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });
    }


}