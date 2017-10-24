package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Display the UI
        //R = resourse class
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextName = (EditText) findViewById(R.id.editTextN);
        editTextAge = (EditText)findViewById(R.id.editText2);
        textViewMessage = (TextView)findViewById(R.id.textView1);

    }

    public void displayMessage(View view){
        String name;
        int age;
        age= Integer.parseInt(editTextAge.getText().toString());
        name=editTextName.getText().toString();
        textViewMessage.setText("Hi, " + name + ". You will be " + ++age +" years old in 2018.");
    }
}
