package hari.clicklisteners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ClickOneActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_one);
        findViewById(R.id.way_one_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             showToast("clock one");
            }
        });
    }
}
