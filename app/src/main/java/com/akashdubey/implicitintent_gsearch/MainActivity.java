package com.akashdubey.implicitintent_gsearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText search;
    Button   searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search=(EditText)findViewById(R.id.searchET);
        searchBtn=(Button)findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchString;
                searchString=search.getText().toString();
                Intent browser= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/search?q="+searchString));
                startActivity(browser);
            }
        });
    }
}
