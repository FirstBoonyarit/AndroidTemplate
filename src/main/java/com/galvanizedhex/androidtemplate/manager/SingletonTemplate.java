package com.galvanizedhex.androidtemplate.manager;

import android.content.Context;

/**
 * Created by P0010 on 6/12/2559.
 */

public class SingletonTemplate {

    private static SingletonTemplate instance;

    public static SingletonTemplate getInstance() {

        if (instance == null) {
            instance = new SingletonTemplate();
        }

        return instance;
    }

    Context mContext;

    private SingletonTemplate() {
        this.mContext = Contextor.getInstance().getContext();
    }

}
