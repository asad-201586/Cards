package com.asad.cards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tab extends AppCompatActivity {

    private LinearLayout mLn1,mLn2,mLn3,mLn4;
    private ImageView mImg1,mImg2,mImg3,mImg4;
    private TextView mTxt1,mTxt2,mTxt3,mTxt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        initialize();

    }

    private void initialize()
    {
        mLn1 = findViewById(R.id.ln1);
        mLn2 = findViewById(R.id.ln2);
        mLn3 = findViewById(R.id.ln3);
        mLn4 = findViewById(R.id.ln4);

        mImg1 = findViewById(R.id.img1);
        mImg2 = findViewById(R.id.img2);
        mImg3 = findViewById(R.id.img3);
        mImg4 = findViewById(R.id.img4);

        mTxt1 = findViewById(R.id.txt1);
        mTxt2 = findViewById(R.id.txt2);
        mTxt3 = findViewById(R.id.txt3);
        mTxt4 = findViewById(R.id.txt4);
    }

    public void clickListener(View view)
    {
        int id = view.getId();

        switch (id)
        {
            case R.id.ln1:
                mImg1.setImageResource(R.drawable.add_call_highligh);
                mImg2.setImageResource(R.drawable.add_camera);
                mImg3.setImageResource(R.drawable.add_location);
                mImg4.setImageResource(R.drawable.add_photo);

                mImg1.setBackground(getResources().getDrawable(R.drawable.icon_back_highligh));
                mImg2.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg3.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg4.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));

                mTxt1.setTextColor(getResources().getColor(R.color.text_color_high));
                mTxt2.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt3.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt4.setTextColor(getResources().getColor(R.color.text_color_normal));

                break;

            case R.id.ln2:
                mImg1.setImageResource(R.drawable.add_call);
                mImg2.setImageResource(R.drawable.add_camera_highlight);
                mImg3.setImageResource(R.drawable.add_location);
                mImg4.setImageResource(R.drawable.add_photo);

                mImg1.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg2.setBackground(getResources().getDrawable(R.drawable.icon_back_highligh));
                mImg3.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg4.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));

                mTxt1.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt2.setTextColor(getResources().getColor(R.color.text_color_high));
                mTxt3.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt4.setTextColor(getResources().getColor(R.color.text_color_normal));

                break;

            case R.id.ln3:
                mImg1.setImageResource(R.drawable.add_call);
                mImg2.setImageResource(R.drawable.add_camera);
                mImg3.setImageResource(R.drawable.add_location_hightlight);
                mImg4.setImageResource(R.drawable.add_photo);

                mImg1.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg2.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg3.setBackground(getResources().getDrawable(R.drawable.icon_back_highligh));
                mImg4.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));

                mTxt1.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt2.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt3.setTextColor(getResources().getColor(R.color.text_color_high));
                mTxt4.setTextColor(getResources().getColor(R.color.text_color_normal));

                break;

            case R.id.ln4:
                mImg1.setImageResource(R.drawable.add_call);
                mImg2.setImageResource(R.drawable.add_camera);
                mImg3.setImageResource(R.drawable.add_location);
                mImg4.setImageResource(R.drawable.add_photo_highlight);

                mImg1.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg2.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg3.setBackground(getResources().getDrawable(R.drawable.icon_back_normal));
                mImg4.setBackground(getResources().getDrawable(R.drawable.icon_back_highligh));

                mTxt1.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt2.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt3.setTextColor(getResources().getColor(R.color.text_color_normal));
                mTxt4.setTextColor(getResources().getColor(R.color.text_color_high));

                break;
        }
    }
}