package com.example.mytravelexpensemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText email, password;
    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        email = findViewById(R.id.email_login);
        password = findViewById(R.id.pass_login);
        login = findViewById(R.id.login_acc);
        login.setOnClickListener(this);
        register = findViewById(R.id.register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_acc:
//                if (TextUtils.isEmpty(email.getText().toString())) {
//                    return;
//                }
//                if (TextUtils.isEmpty(password.getText().toString())) {
//                    return;
//                } else {
//                    setLogin();
//                }
                startActivity(new Intent(Login.this, DashBoard.class));
                break;
            case R.id.register:
                startActivity(new Intent(Login.this, Register.class));
                break;
        }
    }

    void setLogin() {
        StringRequest request = new StringRequest(Request.Method.POST, Constants.LOGIN, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Login.this, response, Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Login.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("email", email.getText().toString());
                params.put("password", password.getText().toString());
                return params;
            }
        };
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }

}

