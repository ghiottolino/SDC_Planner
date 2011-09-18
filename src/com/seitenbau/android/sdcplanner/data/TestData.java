package com.seitenbau.android.sdcplanner.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import com.seitenbau.android.sdcplanner.beans.Room;
import com.seitenbau.android.sdcplanner.beans.Talk;
import com.seitenbau.android.sdcplanner.beans.TimeSlot;

public class TestData {

    private static boolean initialized = false;

    private static List<Talk> talks = new ArrayList<Talk>();

    public static List<Talk> getAllTalks() {

        if (!initialized) {

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

        return talks;
    }

}
