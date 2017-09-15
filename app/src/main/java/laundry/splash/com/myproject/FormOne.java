package laundry.splash.com.myproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class FormOne extends AppCompatActivity {
    EditText first_name,middle_name,last_name,age,adhar_card,contact_number,city,address;
    Spinner nameOfDoctor;
    Button capture_image,save;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form_one);

        setToolbar();
        initializeValues();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = gender.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                System.out.println("Radio VAlue "+radioButton);

                if(first_name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.first_name),Toast.LENGTH_SHORT).show();
                }else
                if(middle_name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.middle_name),Toast.LENGTH_SHORT).show();
                }else
                if(last_name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.last_name),Toast.LENGTH_SHORT).show();
                }else
                if(contact_number.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.contact_no),Toast.LENGTH_SHORT).show();
                }else
                if(address.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.contact_no),Toast.LENGTH_SHORT).show();
                }else
                if(age.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.age),Toast.LENGTH_SHORT).show();
                }else
                if(address.equals(""))
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.please_enter)+getResources().getString(R.string.address),Toast.LENGTH_SHORT).show();
                }else
                {

                }



            }
        });
    }
    private void initializeValues()
    {
        gender= (RadioGroup) findViewById(R.id.gender);
        first_name= (EditText) findViewById(R.id.first_name);
        middle_name= (EditText) findViewById(R.id.middle_name);
        last_name= (EditText) findViewById(R.id.last_name);
        age= (EditText) findViewById(R.id.age);
        adhar_card= (EditText) findViewById(R.id.adhar_card);
        contact_number= (EditText) findViewById(R.id.contact_number);
        city= (EditText) findViewById(R.id.city);
        address= (EditText) findViewById(R.id.address);
        capture_image= (Button) findViewById(R.id.capture_image);
        save= (Button) findViewById(R.id.save);

    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Patients Form");


    }
}
