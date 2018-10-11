package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
    private static AdvertisementStorage ourInstance = new AdvertisementStorage();

    private final List<Advertisement> videos = new ArrayList<>();

    private AdvertisementStorage() {
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min)
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min)
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60)); //10 min
        videos.add(new Advertisement(someContent, "Fourth Video", 1000, 4, 5 * 60)); //5 min
        videos.add(new Advertisement(someContent, "Fifth Video", 200, 30, 6 * 60)); //6 min
        videos.add(new Advertisement(someContent, "Sixth Video", 200, 30, 7 * 60)); //7 min
    }

    public static AdvertisementStorage getInstance() {
        return ourInstance;
    }

    public List<Advertisement> list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}
