package id.co.helloapps2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AktivitasUI extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitas_ui);
        button = (Button) findViewById(R.id.bhallo);
        button.setOnClickListener(view -> ahallo());

        button = (Button) findViewById(R.id.blender);
        button.setOnClickListener(view -> alenderr());

        button = (Button) findViewById(R.id.balarm);
        button.setOnClickListener(view -> aalarm());

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(view -> asianida());

        button = (Button) findViewById(R.id.bcount);
        button.setOnClickListener(view -> acount());

        button = (Button) findViewById(R.id.bmaps);
        button.setOnClickListener(view -> amap());

        button = (Button) findViewById(R.id.baktif2);
        button.setOnClickListener(view -> aaktif2());
    }
    public void ahallo() {
        Intent intent = new Intent(this, AktivitasHallo.class);
        startActivity(intent);
    }
    public void aaktif2() {
        Intent intent = new Intent(this, AktivitasSatu.class);
        startActivity(intent);
    }
    public void aalarm() {
        Intent intent = new Intent(this, AktivAlarm2.class);
        startActivity(intent);
    }
    public void asianida() {
        Intent intent = new Intent(this, AktivitasSianida.class);
        startActivity(intent);
    }
    public void acount() {
        Intent intent = new Intent(this, AktivitasFibonacci.class);
        startActivity(intent);
    }
    public void amap() {
        Intent intent = new Intent(this, AktivitasMap.class);
        startActivity(intent);
    }

    public void alenderr() {
        Intent intent = new Intent(this, AktivitasKalender.class);
        startActivity(intent);
    }
}