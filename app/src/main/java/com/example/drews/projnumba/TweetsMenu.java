package com.example.drews.projnumba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.tweetui.TweetUtils;
import com.twitter.sdk.android.tweetui.TweetView;

public class TweetsMenu extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweets_menu);

        final LinearLayout myLayout
                = (LinearLayout) findViewById(R.id.bike_tweet);

        final long tweetId = 510908133917487104L;
        TweetUtils.loadTweet(tweetId, new Callback<Tweet>() {
            @Override
            public void success(Result<Tweet> result) {
                myLayout.addView(new TweetView(TweetsMenu.this, tweet));
            }

            @Override
            public void failure(TwitterException exception) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "You did something wrong.", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}