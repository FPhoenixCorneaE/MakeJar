package com.wkz.makejar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirstActivity extends BaseActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ResourceUtils.getLayoutId(this, "activity_first"));
        initView();
    }

    private void initView() {
        mImageView = (ImageView) findViewById(ResourceUtils.getId(this, "imageView"));

        Drawable drawable = AssetsUtils.getAssetsImageDrawable(this, "pic_czjy.png", "pic_czjy");
        mImageView.setImageDrawable(drawable);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
    }
}
