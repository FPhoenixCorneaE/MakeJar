package com.wkz.makejar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends BaseActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ResourceUtils.getLayoutId(this, "activity_second"));
        initView();
    }

    private void initView() {
        mImageView = (ImageView) findViewById(ResourceUtils.getId(this, "iv_second"));

        Bitmap bitmap = AssetsUtils.getAssetsImageBitmap(this, "pic_bilibili.jpg");
        mImageView.setImageBitmap(bitmap);
    }
}
