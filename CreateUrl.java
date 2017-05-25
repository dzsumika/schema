package com.example.zsomborsimonguth.schema;

import android.widget.EditText;

/**
 * Created by zsombor.simonguth on 2017-05-25.
 */

public class CreateUrl {

    public static String generateUrl(EditText input)
    {
        //extracting the string from the user input
        final String id = input.getText().toString();

        //declaring the url to the schedule site
        final String uri = "http://www.novasoftware.se/ImgGen/schedulegenerator.aspx?format=png&schoolid=80080/sv-se&type=-1&id="+id+"&period=&week=21&mode=0&printer=0&colors=32&head=0&clock=0&foot=0&day=0&width=350&height=450&maxwidth=350&maxheight=450";

        return uri;
    }

}
