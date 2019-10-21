package latv.itics.tesoem.edu.practica6_latv02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaje (View view){
        Toast.makeText(this, "Mensaje Emergente", Toast.LENGTH_LONG).show();
    }
}
