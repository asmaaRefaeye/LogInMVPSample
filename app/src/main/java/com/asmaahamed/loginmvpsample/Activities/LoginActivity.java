package com.asmaahamed.loginmvpsample.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.asmaahamed.loginmvpsample.Model.PresenterImp;
import com.asmaahamed.loginmvpsample.Presenter.LogInPresenter;
import com.asmaahamed.loginmvpsample.R;
import com.asmaahamed.loginmvpsample.View.LoginView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginView {

    EditText userName ,userPassword;
    Button logInButton;
   LogInPresenter mloginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.name_editText);
        userPassword=findViewById(R.id.password_editText);
        logInButton=findViewById(R.id.login_button);
        mloginPresenter=new PresenterImp(LoginActivity.this);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =userName.getText().toString();
                String userpassword=userPassword.getText().toString();
                mloginPresenter.performLogin(username,userpassword);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void logInValidation() {
        Toast.makeText(this, "please enter username and password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void logInSuccees() {
        Toast.makeText(this, "Login successed", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void LogInFailure() {
        Toast.makeText(this, "Login failed please try again", Toast.LENGTH_SHORT).show();

    }
}
