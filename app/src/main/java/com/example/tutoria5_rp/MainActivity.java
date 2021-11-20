package com.example.tutoria5_rp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edxfname , edxlname , edxemail , edxpass;
    Switch swcbranch;
    RadioGroup rdggen;
    CheckBox chkprofile;
    Spinner spncity;
    RadioButton rdb;
    Button btnregister;
    TextView txtswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edxfname = findViewById(R.id.edxfname);
        edxlname = findViewById(R.id.edxlname);
        edxemail = findViewById(R.id.edxemail);
        edxpass = findViewById(R.id.edxpass);
        rdggen = findViewById(R.id.rdggen);
        swcbranch=findViewById(R.id.swcbranch);
        chkprofile = findViewById(R.id.chkprofile);
        spncity = findViewById(R.id.spncity);
        btnregister = findViewById(R.id.btnregister);
        txtswitch = findViewById(R.id.txtswitch);

        String check = "active";
        String uncheck = "unactive";
        String SwitchOn = "IT";
        String SwitchOff = "CE";

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = edxfname.getText().toString();
                String lname = edxlname.getText().toString();
                String email = edxemail.getText().toString();
                String pass = edxpass.getText().toString();
                String s = txtswitch.getText().toString();
                String swc = swcbranch.getText().toString();
                int select = rdggen.getCheckedRadioButtonId();
                rdb = (RadioButton)findViewById(select);
                String gender = rdb.getText().toString();
                String spn = spncity.getSelectedItem().toString();
                String chk = chkprofile.getText().toString();

                chkprofile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(isChecked){
                            chkprofile.setText(check);
                        }
                        else {
                            chkprofile.setText(uncheck);
                        }
                    }
                });
                if(chkprofile.isChecked()){
                    chk="Active";
                }
                else{
                    chk="InActive";
                }

                swcbranch.setChecked(true);
                swcbranch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if(isChecked){
                            txtswitch.setText(SwitchOn);
                        }
                        else {
                            txtswitch.setText(SwitchOff);
                        }
                    }
                });
                if(swcbranch.isChecked()){
                    s="IT";
                }
                else {
                    s="CE";
                }

                Intent SwitchIntent =new Intent(MainActivity.this,MainActivity2.class);
                SwitchIntent.putExtra("fname",fname);
                SwitchIntent.putExtra("lname",lname);
                SwitchIntent.putExtra("email",email);
                SwitchIntent.putExtra("pass",pass);
                SwitchIntent.putExtra("switch",s);
                SwitchIntent.putExtra("gender",gender);
                SwitchIntent.putExtra("spinner",spn);
                SwitchIntent.putExtra("check",chk);

                startActivity(SwitchIntent);
                finish();
            }
        });
    }
