package co.miniforge.corey.stringanalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    public static String text = "intentTag";

    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


        locateViews();


        bindFunctionality();
    }

    void locateViews(){
        input = (EditText) findViewById(R.id.stringToAnalyzeEditText);
        submit = (Button) findViewById(R.id.submitButton);
    }

    void bindFunctionality(){


        submit.setOnClickListener(new View.OnClickListener() {





            @Override
            public void onClick(View view) {

                //Check to see if EditText is empty
                if(isEmpty(input)){
                    Toast emptyMessageInput = Toast.makeText(getApplicationContext(), "Please enter a message!", Toast.LENGTH_LONG);
                    emptyMessageInput.show();

                }
                else{
                    Intent intent = new Intent(getApplicationContext(), AnalyzerActivity.class);
                    intent.putExtra(text, input.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private boolean isEmpty(EditText checkText) {
        if (checkText.getText().toString().trim().length() > 0){
            return false;
        }
        return true;
    }
}



