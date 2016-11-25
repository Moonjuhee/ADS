package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
            import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
            import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

                CheckBox c_abc;
                LinearLayout line;
                ImageView img;
                RadioButton rbb1;
                RadioButton rbb2;
                RadioButton rbb3;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    c_abc=(CheckBox)findViewById(R.id.checkBox);
                    line=(LinearLayout)findViewById(R.id.abc);
                    img=(ImageView)findViewById(R.id.img1);
                    rbb1=(RadioButton)findViewById(R.id.rb1);
                    rbb2=(RadioButton)findViewById(R.id.rb2);
                    rbb3=(RadioButton)findViewById(R.id.rb3);

                    rbb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                img.setImageResource(R.drawable.dog);
                            }
                        }
                    });

                    rbb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked)
                                img.setImageResource(R.drawable.cat);
                        }
                    });

                    rbb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked)
                                img.setImageResource(R.drawable.rabbit);
                        }
                    });
                    c_abc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                line.setVisibility(View.VISIBLE);
                            }
                            else {
                                line.setVisibility(View.INVISIBLE);

                            }
                        }
        });
    }
}
