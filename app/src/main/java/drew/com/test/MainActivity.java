package drew.com.test;


import android.app.Activity;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.ImageButton;

import android.view.View;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

/*

public class MainActivity extends Activity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) this.findViewById(R.id.play);

        one.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    stopPlaying();
                } else {
                    stopPlaying();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fade);
                    mp.start();
                }
            }
            private void stopPlaying() {
                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
            }
        });
    }

}*/
public class MainActivity extends Activity {

    private MediaPlayer mp;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton b = (ImageButton) findViewById(R.id.play);


        b.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if (i==0) {
                    stopPlaying();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fade);
                    mp.start();
                    i = 1;
                }
                else {
                    stopPlaying();
                    i = 0;

                }

            }

        });


    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}