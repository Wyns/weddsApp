package com.pauwyns.wedds.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class YouTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("VdFMpCMVGAk", "Kenyan Wedding Edu+Eve"));
        addItem(new YouTubeVideo("BemUzUyzYmY", "Janet Mbugua's Wedding"));
        addItem(new YouTubeVideo("IjLPoGG_XpE", "One Crazy Wedding Dance Fest"));
        addItem(new YouTubeVideo("G2WWYfKmzBs", "Reporter Evelyn Wambui is Taken"));
        addItem(new YouTubeVideo("vXBnNyd-nfI", "Kenya Wedding Video Mary + Joseph"));
        addItem(new YouTubeVideo("LrSca6vHcAY", "Jenny + Robert: A Kenyan Love Story"));
        addItem(new YouTubeVideo("PEsvKT9QMx8", "Rossianna + Thomas"));
        addItem(new YouTubeVideo("c_FRFR7S_wg", "Best wedding Dance ever / K&N"));
        addItem(new YouTubeVideo("tqbAuaWwW70", "Beyonce Surprise Wedding dance with Bridesmaids !!!!!!!"));
        addItem(new YouTubeVideo("LrSca6vHcAY", "Jenny + Robert: A Kenyan Love Story"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}