package com.example.goldbrowncalculatorv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



   private Spinner Spinner1, Spinner2;
   private EditText InputValue;
   private Button ConvertButton;
   private TextView TotalWeight, PureGold;

     private TextView Density_point , BronzeWeight ;
     String value_1;
     String value_2;
     String InputValueString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner2 = (Spinner) findViewById(R.id.spinner2);

        InputValue = (EditText) findViewById(R.id.input_value);
        ConvertButton = (Button) findViewById(R.id.convert_button);

        TotalWeight = (TextView) findViewById(R.id.total_weight);
        PureGold = (TextView) findViewById(R.id.pure_gold_weight);

        Density_point = (TextView) findViewById(R.id.density_point);
        BronzeWeight = (TextView) findViewById(R.id.Bronze_weight);



        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.goldQuality , android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner1.setAdapter(adapter1);


        Spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                value_1 = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, value_1, Toast.LENGTH_SHORT).show();

// -------------------------------------------------------------------------------------------------
                final double typicalBronze = 1.0375;
                final double quarterBronze = 0.25937;
// -------------------------------------------------------------------------------------------------
                final double Bronze_13 = typicalBronze *3;
                final double Bronze_13_25 = (typicalBronze*3) - (quarterBronze);
                final double Bronze_13_5 =  (typicalBronze*3) - (2* quarterBronze);
                final double Bronze_13_75 =  (typicalBronze*3) - (3* quarterBronze);

                final double Total_13 = 16.6 + Bronze_13;
                final double Total_13_25 = 16.6 + Bronze_13_25;
                final double Total_13_5 = 16.6 + Bronze_13_5;
                final double Total_13_75 = 16.6 + Bronze_13_75;


                final double from13 = (Bronze_13 / Total_13);
                final double from13_25 = (Bronze_13_25 / Total_13_25);
                final double from13_5 = (Bronze_13_5 / Total_13_5);
                final double from13_75 = (Bronze_13_75 / Total_13_75);

// -------------------------------------------------------------------------------------------------
                final double Bronze_14 = typicalBronze *2;
                final double Bronze_14_25 = (typicalBronze*2) - (quarterBronze);
                final double Bronze_14_5 =  (typicalBronze*2) - (2* quarterBronze);
                final double Bronze_14_75 =  (typicalBronze*2) - (3* quarterBronze);

                final double Total_14 = 16.6 + Bronze_14;
                final double Total_14_25 = 16.6 + Bronze_14_25;
                final double Total_14_5 = 16.6 + Bronze_14_5;
                final double Total_14_75 = 16.6 + Bronze_14_75;


                final double from14 = (Bronze_14 / Total_14);
                final double from14_25 = (Bronze_14_25 / Total_14_25);
                final double from14_5 = (Bronze_14_5 / Total_14_5);
                final double from14_75 = (Bronze_14_75 / Total_14_75);

                final double to14 = (Total_14 / Bronze_14);

// -------------------------------------------------------------------------------------------------

                final double Bronze_15 = typicalBronze * 1;

                final double Total_15 = 16.6 + Bronze_15;

                final double from15 = (Bronze_15 / Total_15);


                final double to15 = (Total_15 / Bronze_15);

// -------------------------------------------------------------------------------------------------

                final double Bronze_96 = 0.6916;

                final double Total_96 = 16.6 + Bronze_96;

                final double to96 = (Total_96 / Bronze_96);

// -------------------------------------------------------------------------------------------------

                final double from13to14 = from13 * to14;
                final double from13_25to14 = from13_25 * to14;
                final double from13_5to14 = from13_5 * to14;
                final double from13_75to14 = from13_75 * to14;

                final double from13to15 = from13 * to15;
                final double from13_25to15 = from13_25 * to15;
                final double from13_5to15 = from13_5 * to15;
                final double from13_75to15 = from13_75 * to15;


                final double from13to96 = from13 * to96;
                final double from13_25to96 = from13_25 * to96;
                final double from13_5to96 = from13_5 * to96;
                final double from13_75to96 = from13_75 * to96;




// -------------------------------------------------------------------------------------------------

                final double from14to15 = from14 * to15;
                final double from14_25to15 = from14_25 * to15;
                final double from14_5to15 = from14_5 * to15;
                final double from14_75to15 = from14_75 * to15;


                final double from14to96 = from14 * to96;
                final double from14_25to96 = from14_25 * to96;
                final double from14_5to96 = from14_5 * to96;
                final double from14_75to96 = from14_75 * to96;


// -------------------------------------------------------------------------------------------------

                final double from15to96 = from15 * to96;


// -------------------------------------------------------------------------------------------------

                if((value_1.equals("13") | value_1.equals("13.25") | value_1.equals("13.5") | value_1.equals("13.75") ))
                {

                    switch (value_1){
                        case "13" :{
                            setDensityAndBronzeWeight("15.8",Bronze_13,Total_13);
                        }
                        case "13.25" :{
                            setDensityAndBronzeWeight("16",Bronze_13_25,Total_13_25);
                        }
                        case "13.5" :{
                            setDensityAndBronzeWeight("16.3",Bronze_13_5,Total_13_5);
                        }
                        case "13.75" :{
                            setDensityAndBronzeWeight("16.5",Bronze_13_75,Total_13_75);
                        }
                    }

                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(MainActivity.this, R.array.ifFrom13 , android.R.layout.simple_spinner_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    Spinner2.setAdapter(adapter2);

                    Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            value_2 = parent.getItemAtPosition(position).toString();


                        ConvertButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                InputValue.onEditorAction(EditorInfo.IME_ACTION_DONE);

                                InputValueString = InputValue.getText().toString();

                                if(TextUtils.isEmpty(InputValueString))
                                {
                                    Toast.makeText(MainActivity.this, "Please Enter value...", Toast.LENGTH_SHORT).show();
                                }

                                else if(value_1.equals("13") && value_2.equals("14"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13to14;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }
                                else if(value_1.equals("13.25") && value_2.equals("14"))
                                {



                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_25to14;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.5") && value_2.equals("14"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_5to14;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.75") && value_2.equals("14"))
                                {



                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_75to14;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

//----------------------------------------------------------------------------------------------------------------------------------------



                                else if(value_1.equals("13") && value_2.equals("15"))
                                {




                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13to15;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }
                                else if(value_1.equals("13.25") && value_2.equals("15"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_25to15;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.5") && value_2.equals("15"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_5to15;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.75") && value_2.equals("15"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_75to15;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }


  //--------------------------------------------------------------------------------------------------------------------------------------


                                else if(value_1.equals("13") && value_2.equals("96"))
                                {



                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13to96;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }
                                else if(value_1.equals("13.25") && value_2.equals("96"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_25to96;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.5") && value_2.equals("96"))
                                {


                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_5to96;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                                else if(value_1.equals("13.75") && value_2.equals("96"))
                                {



                                    double resultValue = (double)  Double.parseDouble(InputValueString) * from13_75to96;
                                    String resultValueString = String.format("%.3f",resultValue);
                                    TotalWeight.setText(resultValueString+" g ");
                                    double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                    String finalResultString = String.format("%.3f" , finalResultFloat);
                                    PureGold.setText(finalResultString+" g ");

                                }

                            }}); }@Override public void onNothingSelected(AdapterView<?> parent) { }});

                }
//--------------------------------------------------------------------------------------------------------------------------------------


                if((value_1.equals("14") | value_1.equals("14.25") | value_1.equals("14.5") | value_1.equals("14.75") ))
                {

                    if(value_1.equals("14"))
                    {
                        Density_point.setText("16.8");
                        BronzeWeight.setText(String.format("%.2f" , Bronze_14*(16.6/Total_14)*7.229 ) + " Y");
                    }
                    else if(value_1.equals("14.25"))
                    {
                        Density_point.setText("17");
                        BronzeWeight.setText(String.format("%.2f" , Bronze_14_25 *(16.6/Total_14_25)*7.229) + " Y");
                    }

                    else if(value_1.equals("14.5"))
                    {
                        Density_point.setText("17.2");
                        BronzeWeight.setText(String.format("%.2f" , Bronze_14_5*(16.6/Total_14_5)*7.229)+ " Y");
                    }
                    else if(value_1.equals("14.75"))
                    {
                        Density_point.setText("17.5");
                        BronzeWeight.setText(String.format("%.2f" , Bronze_14_75*(16.6/Total_14_75)*7.229)+ " Y");
                    }





                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(MainActivity.this, R.array.ifFrom14 , android.R.layout.simple_spinner_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    Spinner2.setAdapter(adapter2);


                    Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                            value_2 = parent.getItemAtPosition(position).toString();


                            ConvertButton.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {


                                    InputValue.onEditorAction(EditorInfo.IME_ACTION_DONE);

                                    InputValueString = InputValue.getText().toString();

                                    if(TextUtils.isEmpty(InputValueString))
                                    {
                                        Toast.makeText(MainActivity.this, "Please Enter value...", Toast.LENGTH_SHORT).show();
                                    }

                                    else if(value_1.equals("14") && value_2.equals("15"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14to15;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }
                                    else if(value_1.equals("14.25") && value_2.equals("15"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_25to15;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }

                                    else if(value_1.equals("14.5") && value_2.equals("15"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_5to15;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }

                                    else if(value_1.equals("14.75") && value_2.equals("15"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_75to15;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }


// ----------------------------------------------------------------------------------------------------------------------------------
                                    else if(value_1.equals("14") && value_2.equals("96"))
                                    {



                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14to96;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }
                                    else if(value_1.equals("14.25") && value_2.equals("96"))
                                    {



                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_25to96;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }

                                    else if(value_1.equals("14.5") && value_2.equals("96"))
                                    {



                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_5to96;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }

                                    else if(value_1.equals("14.75") && value_2.equals("96"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from14_75to96;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }


                                }}); }@Override public void onNothingSelected(AdapterView<?> parent) { }});

                }




                if(value_1.equals("15"))
                {

                    Density_point.setText("17.8");
                    BronzeWeight.setText(String.format("%.2f" , Bronze_15*(16.6/Total_15)*7.229) + " Y");

                    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(MainActivity.this, R.array.ifFrom15 , android.R.layout.simple_spinner_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    Spinner2.setAdapter(adapter2);


                    Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                            value_2 = parent.getItemAtPosition(position).toString();


                            ConvertButton.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {


                                    InputValue.onEditorAction(EditorInfo.IME_ACTION_DONE);

                                    InputValueString = InputValue.getText().toString();

                                    if(TextUtils.isEmpty(InputValueString))
                                    {
                                        Toast.makeText(MainActivity.this, "Please Enter value...", Toast.LENGTH_SHORT).show();
                                    }


                                    else if(value_1.equals("15") && value_2.equals("96"))
                                    {


                                        double resultValue = (double)  Double.parseDouble(InputValueString) * from15to96;
                                        String resultValueString = String.format("%.3f",resultValue);
                                        TotalWeight.setText(resultValueString+" g ");
                                        double finalResultFloat = resultValue - Double.parseDouble(InputValueString);
                                        String finalResultString = String.format("%.3f" , finalResultFloat);
                                        PureGold.setText(finalResultString+" g ");

                                    }



                                }}); }@Override public void onNothingSelected(AdapterView<?> parent) { }});

                }









            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    void setDensityAndBronzeWeight(String density,double bronze, double total){
        Density_point.setText("density");
        BronzeWeight.setText(String.format("%.2f" , bronze *(16.6/total)*7.229 ) + " Y");
    }
}
