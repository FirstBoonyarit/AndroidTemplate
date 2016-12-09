package com.galvanizedhex.androidtemplate.utils;

/**
 * Created by P0010 on 9/12/2559.
 */

public class ScreenUtil {

    private static ScreenUtil instance;


    public ScreenUtil getInstance() {

        if (instance == null) {
            instance = new ScreenUtil();
        }

        return this.instance;
    }

    private ScreenUtil() {


    }


}
