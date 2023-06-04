// Generated by view binder compiler. Do not edit!
package com.ayushsinghal.quizapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ayushsinghal.quizapp.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearProgressIndicator linearProgressBar;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final Button signUpInsteadButton;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull TextInputLayout email, @NonNull ImageView imageView2,
      @NonNull LinearProgressIndicator linearProgressBar, @NonNull TextInputLayout password,
      @NonNull Button signUpInsteadButton) {
    this.rootView = rootView;
    this.button = button;
    this.email = email;
    this.imageView2 = imageView2;
    this.linearProgressBar = linearProgressBar;
    this.password = password;
    this.signUpInsteadButton = signUpInsteadButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputLayout email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearProgressBar;
      LinearProgressIndicator linearProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (linearProgressBar == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.signUpInsteadButton;
      Button signUpInsteadButton = ViewBindings.findChildViewById(rootView, id);
      if (signUpInsteadButton == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, button, email, imageView2,
          linearProgressBar, password, signUpInsteadButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}