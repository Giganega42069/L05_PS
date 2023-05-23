package sg.edu.rp.c346.id22004686.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class details extends AppCompatActivity {
    TextView display;
    Button buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        display = findViewById(R.id.display);
        buttons = findViewById(R.id.button1);

        Intent intent = getIntent();
        String ok = intent.getStringExtra("code");
        if (ok.equals("C346")) {
            display.setText("Module Code: "+ok+"\nModule Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        } else if (ok.equals("C349")) {
            display.setText("Module Code: "+ok+"\nModule Name: iPad Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 3\nVenue: W64P");
        }

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(details.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}