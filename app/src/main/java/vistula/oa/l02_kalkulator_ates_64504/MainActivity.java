package vistula.oa.l02_kalkulator_ates_64504;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import static vistula.oa.l02_kalkulator_ates_64504.CalculatorTools.calculations;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void calculate(View view){
        EditText editTextNumber1 = (EditText)findViewById((R.id.inputNumber1));
        EditText editTextNumber2 = (EditText)findViewById((R.id.inputNumber2));
        Spinner spinnerBase1 =   (Spinner)findViewById(R.id.spinnerBase1);
        Spinner spinnerOperator =   (Spinner)findViewById(R.id.spinnnerOperator);
        TextView textViewOutput1 = (TextView)findViewById(R.id.outputBase1);

        String str_n1 = editTextNumber1.getText().toString();
        String str_n2 = editTextNumber2.getText().toString();
        int base1 = Integer.parseInt(spinnerBase1.getSelectedItem().toString());
        String operator = spinnerOperator.getSelectedItem().toString();

        int n1 = 0, n2 = 0;
        try{
            n1 = Integer.parseInt(str_n1, base1);
        }catch (NumberFormatException e){
            editTextNumber1.setText('0');
        }
        try{
            n2 = Integer.parseInt(str_n2, base1);
        }catch (NumberFormatException e){
            editTextNumber2.setText('0');
        }


        TextView textViewNumber1Base10 = (TextView)findViewById(R.id.txtInputNumber1Base10);
        TextView textViewOperator10 = (TextView)findViewById(R.id.txtOperator10);
        TextView textViewNumber2Base10 = (TextView)findViewById(R.id.txtInputNumber2Base10);
        TextView textViewOutputBase10 = (TextView)findViewById(R.id.outputBase2);
        textViewNumber1Base10.setText(Integer.toString(n1));
        textViewOperator10.setText(operator);
        textViewNumber2Base10.setText((Integer.toString(n2)));

    }
}