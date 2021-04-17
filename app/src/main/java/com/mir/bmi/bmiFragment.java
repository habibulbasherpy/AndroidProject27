package com.mir.bmi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class bmiFragment extends Fragment {

    EditText weidth,height;
    String calculation,bmiresult;
    private Button cal;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_bmi, container, false);

        weidth=view.findViewById(R.id.weidth);
        height=view.findViewById(R.id.height);
        cal=view.findViewById(R.id.bmical);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=weidth.getText().toString();
                String s2=height.getText().toString();

                float widthvalue=Float.parseFloat(s1);
                float heightvalue=Float.parseFloat(s2);

                float bmi=widthvalue / (heightvalue*heightvalue);


                if (bmi<25){
                   bmiresult=" Not Overweight ";
                }
                else {
                    bmiresult=" Overweight ";
                }

                calculation="Result: "+bmi +bmiresult;

                //weidth.setText(calculation);
                Toast.makeText(getActivity(),calculation,Toast.LENGTH_LONG).show();



            }
        });


        return view;



    }

}