package asymalaps.funnybiology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void intent (View view) {
        Intent i = new Intent(MainActivity.this, quiztype.class);
        startActivity(i);
    }

}
