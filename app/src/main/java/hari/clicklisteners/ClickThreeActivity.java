package hari.clicklisteners;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ClickThreeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_three);
        findViewById(R.id.way_three_btn).setOnClickListener(new ClickListener());
    }
    class ClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            showToast("click three");
        }
    }
}
