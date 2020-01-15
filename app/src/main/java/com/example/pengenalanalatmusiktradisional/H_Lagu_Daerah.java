package com.example.pengenalanalatmusiktradisional;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class H_Lagu_Daerah extends AppCompatActivity {

    RecyclerView audioListView;
    AudioListAdapter audioListAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__lagu__daerah);


        //Checks permissions
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
                return;
            }
        }

        //Finds all the mp3 files in device and makes a list
        getSongs();

    }

    public void getSongs(){
        context = H_Lagu_Daerah.this;
        audioListView = findViewById(R.id.audioListView);

        List<AudioModel> allAudioFiles = getAllAudioFromDevice(context);

        audioListAdapter = new AudioListAdapter(context,allAudioFiles);
        audioListView.setLayoutManager(new LinearLayoutManager(context));
        audioListView.setAdapter(audioListAdapter);
    }

    public List<AudioModel> getAllAudioFromDevice(final Context context) {

        final List<AudioModel> tempAudioList = new ArrayList<>();

        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] projection = {MediaStore.Audio.AudioColumns.DATA, MediaStore.Audio.AudioColumns.ALBUM, MediaStore.Audio.ArtistColumns.ARTIST,};
        Cursor c = context.getContentResolver().query(uri,
                projection,
                null,
                null,
                null);

        if (c != null) {
            while (c.moveToNext()) {

                AudioModel audioModel = new AudioModel();

                String path = c.getString(0);
                String album = c.getString(1);
                String artist = c.getString(2);

                String name = path.substring(path.lastIndexOf("/") + 1);

                audioModel.setaName(name);
                audioModel.setaAlbum(album);
                audioModel.setaArtist(artist);
                audioModel.setaPath(path);

                tempAudioList.add(audioModel);
            }
            c.close();
        }

        return tempAudioList;
    }

    //Handling callback
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getSongs();
                    Toast.makeText(context,"Permission granted",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context,"Permission denied",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
