package net.yuzumone.twimedica;

import android.app.Application;

import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

public class TwimedicaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String key = BuildConfig.TWITTER_API_KEY;
        String secret = BuildConfig.TWITTER_API_SECRET;
        TwitterConfig config = new TwitterConfig.Builder(this)
                .twitterAuthConfig(new TwitterAuthConfig(key, secret))
                .build();
        Twitter.initialize(config);
    }
}
