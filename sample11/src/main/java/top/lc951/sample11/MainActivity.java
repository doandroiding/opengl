package top.lc951.sample11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample11_1(View view){
        Sample11_1_Activity.actionActivity(this);
    }
    public void sample11_2(View view){
        Sample11_2_Activity.actionActivity(this);
    }
 public void sample11_3(View view){
        Sample11_3_Activity.actionActivity(this);
    }

}
