package com.mir.bmi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ftcFragment extends Fragment {

    EditText editText;
    String calculation;
    TextView textView;
    private Button calc;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_ftc, container, false);

        editText=view.findViewById(R.id.ferbtn);
        textView=view.findViewById(R.id.resultf);
        calc=view.findViewById(R.id.resultfbtn2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText.getText().toString();

                float f=Float.parseFloat(s1);

                double n=(f-32)/1.8;

                calculation="Result: "+n ;

                textView.setText(calculation);

            }
        });
        return view;
    }
}