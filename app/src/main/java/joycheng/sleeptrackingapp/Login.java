package joycheng.sleeptrackingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by tiffanyxu on 2017-09-16.
 */

public class Login {
    public class inputActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.inputpage);
        }

//        public void viewValue(View view){
//            Intent viewIntent = new Intent(getApplicationContext(),statistics.class);
//            startActivity(viewIntent);
//
//        }


    }

}
