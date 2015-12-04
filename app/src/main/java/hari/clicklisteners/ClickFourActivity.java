package hari.clicklisteners;

import android.os.Bundle;
import android.view.View;

public class ClickFourActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_four);
        findViewById(R.id.way_four_btn).setOnClickListener(listener);
    }

   private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showToast("clock four");
        }
    };

}
