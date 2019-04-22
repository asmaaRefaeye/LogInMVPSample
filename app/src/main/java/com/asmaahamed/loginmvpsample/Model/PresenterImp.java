package com.asmaahamed.loginmvpsample.Model;

import android.text.TextUtils;

import com.asmaahamed.loginmvpsample.Presenter.LogInPresenter;
import com.asmaahamed.loginmvpsample.View.LoginView;

public class PresenterImp implements LogInPresenter {

    LoginView mloginView;

    public PresenterImp(LoginView loginView) {
        this.mloginView = loginView;
    }

    @Override
    public void performLogin(String userName, String password) {

 if (TextUtils.isEmpty(userName)|| TextUtils.isEmpty(password)){
      mloginView.logInValidation();
 }else
     if (userName.equals("asmaa") || password.equals("123456")){
         mloginView.logInSuccees();
     }else
        mloginView.LogInFailure();

    }
}
