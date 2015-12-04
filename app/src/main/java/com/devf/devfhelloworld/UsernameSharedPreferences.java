package com.devf.devfhelloworld;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by gerardogtn on 12/3/15.
 */
public class UsernameSharedPreferences {

    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";

    public static String getUsername(Context context){
        return PreferenceManager
                .getDefaultSharedPreferences(context)
                .getString(KEY_USERNAME, "sin usuario");

    }

    public static void setUsername(Context context, String username){
        PreferenceManager
                .getDefaultSharedPreferences(context)
                .edit()
                .putString(KEY_USERNAME, username)
                .apply();
    }

    public static String getPassword(Context context){
        return PreferenceManager
                .getDefaultSharedPreferences(context)
                .getString(KEY_PASSWORD, "sin contrasena");

    }

    public static void setUserPassword(Context context, String password){
        PreferenceManager
                .getDefaultSharedPreferences(context)
                .edit()
                .putString(KEY_PASSWORD, password)
                .apply();
    }




}
