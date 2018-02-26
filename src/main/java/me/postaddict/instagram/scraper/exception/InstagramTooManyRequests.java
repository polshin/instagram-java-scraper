package me.postaddict.instagram.scraper.exception;

public class InstagramTooManyRequests extends InstagramException {
    public InstagramTooManyRequests() {
    }

    public InstagramTooManyRequests(String message) {
        super(message);
    }
}
