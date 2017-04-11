package net.yuzumone.twimedica;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

public class TwimedicaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String key = BuildConfig.TWITTER_API_KEY;
        String secret = BuildConfig.TWITTER_API_SECRET;
        TwitterAuthConfig config = new TwitterAuthConfig(key, secret);
        Fabric.with(this, new Twitter(config));
    }
}
