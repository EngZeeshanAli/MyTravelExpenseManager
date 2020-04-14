package com.example.mytravelexpensemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;


public class Register extends AppCompatActivity implements View.OnClickListener {
    EditText name, email, pass, mobile;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    private void init() {
        name = findViewById(R.id.name_register);
        email = findViewById(R.id.email_register);
        pass = findViewById(R.id.pass_register);
        mobile = findViewById(R.id.mobile_register);
        register = findViewById(R.id.register_acc);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_acc:
                setRegister();
                break;
        }
    }

    void setRegister() {
        StringRequest request = new StringRequest(Request.Method.POST, Constants.REGISTER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Register.this, response, Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Register.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", "Alif");
                params.put("email", "http://itsalif.info");
                params.put("password", "http://itsalif.info");
                params.put("mobile", "http://itsalif.info");
                return params;
            }
        };
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }

}
