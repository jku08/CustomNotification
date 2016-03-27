package com.jku_dev.notificationtest;

import android.app.NotificationManager;
import android.content.Context;
//import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.NotificationCompat.Builder;
import android.widget.Button;
import android.widget.EditText;
//
//import com.google.android.gms.appindexing.AppIndex;
//import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    private GoogleApiClient client;


    NotificationCompat.Builder buttonNotifBuilder;
    NotificationManager buttonNotifMgr;
    int buttonNotifId = 1;
    Button notifButton;
    String notifContent;
    String notifContentError;
    EditText mEdit;
    Context mContext;

    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notifButton = (Button)findViewById(R.id.button_notif);

        clearButton = (Button)findViewById(R.id.button_clear);

        mEdit   = (EditText)findViewById(R.id.notifText);

        notifContent = "Hello World!";

        notifContentError = "No text entered";

        mContext = this;


//        buttonNotifBuilder = new Builder(this);
//        buttonNotifBuilder.setSmallIcon(R.drawable.buttonnotif_icon);
//        buttonNotifBuilder.setContentTitle("I'm a Notification");
//        buttonNotifBuilder.setContentText(notifContent);

        buttonNotifMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notifButton.setOnClickListener(
                new View.OnClickListener() {
                public void onClick(View v) {

                    notifContent = mEdit.getText().toString();

                    if (notifContent.equals("")) {
                        notifContent = notifContentError;
                    }

                    buttonNotifBuilder = new Builder(mContext);
                    buttonNotifBuilder.setSmallIcon(R.drawable.buttonnotif_icon);
                    buttonNotifBuilder.setContentText("Custom Notification");
                    buttonNotifBuilder.setContentTitle(notifContent);

                    buttonNotifMgr.notify(buttonNotifId, buttonNotifBuilder.build());

                    buttonNotifId++;
            }
        });

        clearButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        mEdit.setText("");

                    }
                }
        );


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
//        com.google.android.gms.appindexing.Action viewAction = com.google.android.gms.appindexing.Action.newAction(
//                com.google.android.gms.appindexing.Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app deep link URI is correct.
//                Uri.parse("android-app://com.jku_dev.notificationtest/http/host/path")
//        );
//        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        com.google.android.gms.appindexing.Action viewAction = com.google.android.gms.appindexing.Action.newAction(
//                com.google.android.gms.appindexing.Action.TYPE_VIEW, // TODO: choose an action type.
//                "Main Page", // TODO: Define a title for the content shown.
//                // TODO: If you have web page content that matches this app activity's content,
//                // make sure this auto-generated web page URL is correct.
//                // Otherwise, set the URL to null.
//                Uri.parse("http://host/path"),
//                // TODO: Make sure this auto-generated app deep link URI is correct.
//                Uri.parse("android-app://com.jku_dev.notificationtest/http/host/path")
//        );
//        AppIndex.AppIndexApi.end(client, viewAction);
//        client.disconnect();
    }

    @Override
    public void onClick(View v) {

//        v.findViewById(R.id.button_notif);
//
//        buttonNotifMgr.notify(buttonNotifId, buttonNotifBuilder.build());
//                buttonNotifId++;

    }
}
