package com.mavoic.mavonbrowser.utils;

/**
 * Created by lzhyu on 2017-12-18.
 */

public final class UrlUtils {

    public static String checkUrl(String url){
        if(url.startsWith("http://")||url.startsWith("https://")){
            return url;
        }
        return "http://"+url;
    }
}
