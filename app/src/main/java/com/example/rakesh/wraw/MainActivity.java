package com.example.rakesh.wraw;



        import android.content.Intent;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1,b2,b3,b4;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        b2 = (Button)findViewById(R.id.free_food);
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Freefood.class);
                startActivity(i);
            }
        });
        b3 = (Button)findViewById(R.id.sell);
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Sell_login.class);
                startActivity(i);
            }
        });
        b4 = (Button)findViewById(R.id.purchase);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,parchaseActivity.class);
                startActivity(i);
            }
        });
    }



}
