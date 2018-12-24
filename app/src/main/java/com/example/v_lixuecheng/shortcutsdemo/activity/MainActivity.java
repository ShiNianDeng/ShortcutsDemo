package com.example.v_lixuecheng.shortcutsdemo.activity;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.v_lixuecheng.shortcutsdemo.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N_MR1) {
//            ShortcutManager manager = this.getSystemService(ShortcutManager.class);
//            Intent intent = new Intent(this,PlayMusicActivity.class);
//            intent.setAction(Intent.ACTION_VIEW);
//            ShortcutInfo shortcut = new ShortcutInfo.Builder(this, "id1")
//                    .setShortLabel("Website")
//                    .setLongLabel("Open the website")
//                    .setIcon(Icon.createWithResource(this, R.drawable.add))
//                    .setIntent(intent)
//                    .build();
//            manager.addDynamicShortcuts(Arrays.asList(shortcut));
//        }
    }
}
