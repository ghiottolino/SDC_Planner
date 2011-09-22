package com.seitenbau.android.sdcplanner.data;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import com.seitenbau.android.sdcplanner.beans.Talk;


public class TestData {

    private static boolean initialized = false;

    private static List<Talk> talks = new ArrayList<Talk>();

    
    public static List<Talk> getAllTalks() {

        if (!initialized) {

            initializeTalks();
        }

        return talks;
    }

  
    
    private static void initializeTalks()
    {
        String fileName = "sessions.xml";
        InputStream resourceAsStream = new TestData().getClass()
                .getResourceAsStream(fileName);

        XmlPullParser parser = null;
        
        try {
            parser = ParserUtils.newPullParser(resourceAsStream);
          
        } catch (XmlPullParserException e) {
            throw new RuntimeException(e);
        }
        try {
            talks = new LocalSessionsHandler().parse(parser, null);
               
        } catch (XmlPullParserException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        
        initialized=true;
    }
    
    
    
    
    
}
