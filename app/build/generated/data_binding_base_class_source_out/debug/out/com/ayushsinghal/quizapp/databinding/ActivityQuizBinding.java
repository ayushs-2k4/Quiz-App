// Generated by view binder compiler. Do not edit!
package com.ayushsinghal.quizapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ayushsinghal.quizapp.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQuizBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final LinearProgressIndicator linearProgressBar;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final Button option1;

  @NonNull
  public final Button option2;

  @NonNull
  public final Button option3;

  @NonNull
  public final Button option4;

  @NonNull
  public final TextView questionCountTextView;

  @NonNull
  public final TextView questionTextView;

  private ActivityQuizBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView3,
      @NonNull LinearProgressIndicator linearProgressBar, @NonNull Button logoutButton,
      @NonNull Button option1, @NonNull Button option2, @NonNull Button option3,
      @NonNull Button option4, @NonNull TextView questionCountTextView,
      @NonNull TextView questionTextView) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.linearProgressBar = linearProgressBar;
    this.logoutButton = logoutButton;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.questionCountTextView = questionCountTextView;
    this.questionTextView = questionTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQuizBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQuizBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_quiz, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQuizBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.linearProgressBar;
      LinearProgressIndicator linearProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (linearProgressBar == null) {
        break missingId;
      }

      id = R.id.logoutButton;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.option1;
      Button option1 = ViewBindings.findChildViewById(rootView, id);
      if (option1 == null) {
        break missingId;
      }

      id = R.id.option2;
      Button option2 = ViewBindings.findChildViewById(rootView, id);
      if (option2 == null) {
        break missingId;
      }

      id = R.id.option3;
      Button option3 = ViewBindings.findChildViewById(rootView, id);
      if (option3 == null) {
        break missingId;
      }

      id = R.id.option4;
      Button option4 = ViewBindings.findChildViewById(rootView, id);
      if (option4 == null) {
        break missingId;
      }

      id = R.id.questionCountTextView;
      TextView questionCountTextView = ViewBindings.findChildViewById(rootView, id);
      if (questionCountTextView == null) {
        break missingId;
      }

      id = R.id.questionTextView;
      TextView questionTextView = ViewBindings.findChildViewById(rootView, id);
      if (questionTextView == null) {
        break missingId;
      }

      return new ActivityQuizBinding((ConstraintLayout) rootView, imageView3, linearProgressBar,
          logoutButton, option1, option2, option3, option4, questionCountTextView,
          questionTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
