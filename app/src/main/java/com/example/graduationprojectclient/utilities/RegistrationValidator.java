package com.example.graduationprojectclient.utilities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import com.example.graduationprojectclient.R;
import com.example.graduationprojectclient.activity.RegistrationActivity;

public class RegistrationValidator {

    @SuppressLint("StaticFieldLeak")
    static Context context = RegistrationActivity.getContext();

    public static Boolean Validator(String email, String name, String secondName, String password) {

        if (email.equals("")) {
            if (name.equals("")) {
                if (secondName.equals("")) {
                    if (password.equals("")) {
                        Toast.makeText(context, R.string.empty_pass, Toast.LENGTH_SHORT).show();

                        return false;
                    }
                    if (password.length() < 6) {
                        Toast.makeText(context, R.string.password_length, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    Toast.makeText(context, R.string.empty_second_name, Toast.LENGTH_SHORT).show();
                    return false;
                }
                Toast.makeText(context, R.string.empty_name, Toast.LENGTH_SHORT).show();
                return false;
            }
            Toast.makeText(context, R.string.empty_email, Toast.LENGTH_SHORT).show();
            return false;
        }
        if (email.length() < 1) {
            Toast.makeText(context, R.string.email_length, Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

}