package com.example.zsomborsimonguth.schema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.lang.String;

import static android.R.id.list;

public class Schema_ID_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schema__id_);

        //getting our variables from the UI
        final Spinner choose_school = (Spinner) findViewById(R.id.choose_school);
        final ImageButton show_schedule = (ImageButton) findViewById(R.id.go_button);
        final EditText ID_from_input = (EditText) findViewById(R.id.ID_input);

        //making our array what we'll put into spinner
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.schools, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.schools,
                R.layout.spinner);

        //setting up the spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choose_school.setAdapter(adapter);

        show_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //extracting the string from the user input
                final String id = ID_from_input.getText().toString();

                //declaring the url to the schedule site
                final String uri = "http://www.novasoftware.se/ImgGen/schedulegenerator.aspx?format=png&schoolid=80080/sv-se&type=-1&id="+id+"&period=&week=21&mode=0&printer=0&colors=32&head=0&clock=0&foot=0&day=0&width=350&height=450&maxwidth=350&maxheight=450";

                //making our intent
                final Intent i = new Intent(Schema_ID_Activity.this, Schema_Activity.class);
                i.putExtra("ID", uri);

                //starting the activity, shows the schedule
                startActivity(i);
            }
        });



    }
}
