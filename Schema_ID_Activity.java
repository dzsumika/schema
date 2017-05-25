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

        //importing other classes
        final CreateUrl createUrl = new CreateUrl();

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
                //using generateUrl to make our url
                String url = createUrl.generateUrl(ID_from_input);

                //making our intent
                final Intent i = new Intent(Schema_ID_Activity.this, Schema_Activity.class);
                i.putExtra("ID", url);

                //starting the activity, shows the schedule
                startActivity(i);
            }
        });



    }
}
