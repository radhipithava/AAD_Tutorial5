package com.example.tutoria5_rp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtfname , txtlname , txtuname , txtpass , txtbranch , txtcity , txtgender , txtstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtfname = findViewById(R.id.txtfname);
        txtlname = findViewById(R.id.txtlname);
        txtuname = findViewById(R.id.txtuname);
        txtpass = findViewById(R.id.txtpass);
        txtbranch = findViewById(R.id.txtbranch);
        txtcity = findViewById(R.id.txtcity);
        txtgender = findViewById(R.id.txtgender);
        txtstatus = findViewById(R.id.txtstatus);

        String fname = getIntent().getStringExtra("fname");
        String lname = getIntent().getStringExtra("lname");
        String email = getIntent().getStringExtra("email");
        String pass = getIntent().getStringExtra("pass");
        String branch = getIntent().getStringExtra("switch");
        String gender = getIntent().getStringExtra("gender");
        String city = getIntent().getStringExtra("spinner");
        String status = getIntent().getStringExtra("check");

        String f1 = txtfname.getText().toString();
        String l1 = txtlname.getText().toString();
        String e1 = txtuname.getText().toString();
        String p1 = txtpass.getText().toString();
        String b1 = txtbranch.getText().toString();
        String g1 = txtgender.getText().toString();
        String s1 = txtstatus.getText().toString();
        String c1 = txtcity.getText().toString();

        f1 += fname;
        l1 += lname;
        e1 += email;
        p1 += pass;
        b1 += branch;
        g1 += gender;
        c1 += city;
        s1 += status;

        txtfname.setText(f1);
        txtlname.setText(l1);
        txtuname.setText(e1);
        txtpass.setText(p1);
        txtbranch.setText(b1);
        txtgender.setText(g1);
        txtcity.setText(c1);
        txtstatus.setText(s1);

    }
}