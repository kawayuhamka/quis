package androidfkipuhamka.quis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        score = (TextView) findViewById(R.id.text_score);
        score.setText("SCORE : "+String.valueOf( getIntent().getIntExtra("SCORE", 0)));
    }
}
