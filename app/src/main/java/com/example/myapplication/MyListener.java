package com.example.myapplication;
import android.content.Context ;
import android.service.notification.NotificationListenerService ;
import android.service.notification.StatusBarNotification ;
import android.util.Log ;
public interface MyListener {
    void setValue (String packageName) ;
}

