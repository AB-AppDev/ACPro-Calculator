package one.programmer.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private Button B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        B = findViewById(R.id.add);


    }


    public void doAddition(View V) {


        float ans = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());

        Log.d("ADDITION", ans + "");

        B.setText(ans + "");

    }


}