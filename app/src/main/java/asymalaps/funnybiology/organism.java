package asymalaps.funnybiology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class organism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organism);
    }

    public void intent5 (View view) {
        Intent i = new Intent(organism.this, organism2.class);
        startActivity(i);
    }
}
