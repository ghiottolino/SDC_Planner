/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.seitenbau.android.sdcplanner.data;

import com.seitenbau.android.sdcplanner.beans.Room;
import com.seitenbau.android.sdcplanner.beans.Talk;
import com.seitenbau.android.sdcplanner.beans.TimeSlot;
import com.seitenbau.android.sdcplanner.data.ParserUtils;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.ContentResolver;

import java.io.IOException;
import java.util.ArrayList;

import static org.xmlpull.v1.XmlPullParser.END_DOCUMENT;
import static org.xmlpull.v1.XmlPullParser.END_TAG;
import static org.xmlpull.v1.XmlPullParser.START_TAG;
import static org.xmlpull.v1.XmlPullParser.TEXT;

public class LocalSessionsHandler {

    public LocalSessionsHandler() {
    }

    public ArrayList<Talk> parse(XmlPullParser parser,
            ContentResolver resolver) throws XmlPullParserException,
            IOException {
        final ArrayList<Talk> talks = new ArrayList<Talk>();

        int type;
        while ((type = parser.next()) != END_DOCUMENT) {
            if (type == START_TAG && Tags.SESSION.equals(parser.getName())) {
                parseSession(parser, talks);
            }
        }

        return talks;
    }

    private static void parseSession(XmlPullParser parser, ArrayList<Talk> talks)
            throws XmlPullParserException, IOException {
        final int depth = parser.getDepth();

        Talk talk = new Talk();

        long startTime = -1;
        long endTime = -1;
        String title = null;
        String sessionId = null;
        String trackId = null;
        String roomId = null;
        String sessionAbstract = null;
        String speakers = null;

        String tag = null;
        int type;
        while (((type = parser.next()) != END_TAG || parser.getDepth() > depth)
                && type != END_DOCUMENT) {
            if (type == START_TAG) {
                tag = parser.getName();
            } else if (type == END_TAG) {
                tag = null;
            } else if (type == TEXT) {
                final String text = parser.getText();
                if (Tags.START.equals(tag)) {
                    startTime = ParserUtils.parseTime(text);
                } else if (Tags.END.equals(tag)) {
                    endTime = ParserUtils.parseTime(text);
                } else if (Tags.ROOM.equals(tag)) {
                    //roomId = Rooms.generateRoomId(text);
                    roomId = text;
                } else if (Tags.TRACK.equals(tag)) {
                    // trackId = Tracks.generateTrackId(text);
                    trackId = text;
                } else if (Tags.ID.equals(tag)) {
                    sessionId = text;
                } else if (Tags.TITLE.equals(tag)) {
                    title = text;
                } else if (Tags.ABSTRACT.equals(tag)) {
                    sessionAbstract = text;
                } else if (Tags.SPEAKER.equals(tag)) {
                    speakers = text;
                }

            }
        }
        
        talk.setTitle(title);
        talk.setRoom(roomId);
        talk.setSpeakers(speakers);
        talk.setTeaser(sessionAbstract);
        talks.add(talk);

    }

 
    interface Tags {
        String SESSION = "session";
        String ID = "id";
        String START = "start";
        String END = "end";
        String ROOM = "room";
        String TRACK = "track";
        String TITLE = "title";
        String ABSTRACT = "abstract";
        String LINKS = "links";
        String SPEAKER = "speaker";

    }
}
