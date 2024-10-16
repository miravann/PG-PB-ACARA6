package com.example.acara6;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    Button Regis;
    EditText editusername;
    EditText editemail;
    EditText editphone;
    CheckBox checkBox;
    private ViewPager2 viewPager2; // Declare ViewPager2

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        editusername = rootView.findViewById(R.id.username);
        editemail = rootView.findViewById(R.id.email);
        editphone = rootView.findViewById(R.id.phone);
        checkBox = rootView.findViewById(R.id.Checks);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Regis.setEnabled(true);
                } else {
                    Regis.setEnabled(false);
                }
            }
        });






        Regis = (Button) rootView.findViewById(R.id.btnRegis);
        Regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()) {
                    String usernameview = editusername.getText().toString();
                    String emailview = editemail.getText().toString();
                    String phoneview = editphone.getText().toString();

                    Intent intent = new Intent(getActivity(), SecondActivity.class);
                    intent.putExtra("username", usernameview);
                    intent.putExtra("email", emailview);
                    intent.putExtra("phone", phoneview);

                    startActivity(intent);
                }
                else {
                    Toast.makeText(getActivity(), "Pastikan telah menyetujui S&K!", Toast.LENGTH_SHORT). show();
                }


            }
        });
        return rootView;
    }
}