package com.wkz.makejar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class AssetsUtils {

    public static Drawable getAssetsImageDrawable(Context context, String fileName, String srcName) {
        Drawable drawable = null;
        try {
            drawable = Drawable.createFromStream(context.getAssets().open(fileName), srcName);
        } catch (Exception e) {
            Log.i("AssetManager", e.toString());
        }
        return drawable;
    }

    public static Bitmap getAssetsImageBitmap(Context context, String fileName) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open(fileName));
        } catch (Exception e) {
            Log.i("AssetManager", e.toString());
        }
        return bitmap;
    }
}
