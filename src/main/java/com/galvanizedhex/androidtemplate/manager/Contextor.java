package com.galvanizedhex.androidtemplate.manager;

import android.content.Context;

/**
 * Created by P0010 on 6/12/2559.
 */

public class Contextor {

    private static Contextor instance;
    private Context mContext;

    public static Contextor getInstance() {

        if (instance == null)
            instance = new Contextor();

        return instance;
    }

    private Contextor() {

    }

    public void init(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }
}
