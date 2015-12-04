package hari.clicklisteners;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Hari on 12/4/2015.
 */
public class BaseActivity extends AppCompatActivity {
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
