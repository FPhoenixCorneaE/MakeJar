package com.wkz.makejar;

import android.content.Context;

public class ResourceUtils {
 
    public static int getLayoutId(Context context, String name) {
        return context.getResources().getIdentifier(name, "layout",
                context.getPackageName());
    }
 
    public static int getStringId(Context context, String name) {
        return context.getResources().getIdentifier(name, "string",
                context.getPackageName());
    }
 
    public static int getDrawableId(Context context, String name) {
        return context.getResources().getIdentifier(name,
                "drawable", context.getPackageName());
    }

    public static int getMipmapId(Context context, String name) {
        return context.getResources().getIdentifier(name,
                "mipmap", context.getPackageName());
    }

    public static int getStyleId(Context context, String name) {
        return context.getResources().getIdentifier(name,
                "style", context.getPackageName());
    }
 
    public static int getId(Context context, String name) {
        return context.getResources().getIdentifier(name,"id", context.getPackageName());
    }
 
    public static int getColorId(Context context, String name) {
        return context.getResources().getIdentifier(name,
                "color", context.getPackageName());
    }
    public static int getArrayId(Context context, String name) {
        return context.getResources().getIdentifier(name,
                "array", context.getPackageName());
    }
}