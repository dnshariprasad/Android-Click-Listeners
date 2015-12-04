package hari.clicklisteners;

import android.os.Bundle;
import android.view.View;

public class ClickFiveActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_five);

    }
    public void onClick(View v){
        int id=v.getId();
        switch (id){
            case R.id.way_five_btn:
                showToast("click filve");
                break;

        }
    }
}
