package com.acme.room;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class TodoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        Realm.setDefaultConfiguration(
                new RealmConfiguration.Builder()
                        .deleteRealmIfMigrationNeeded()
                        .schemaVersion(1)
                        .build());
    }
}
