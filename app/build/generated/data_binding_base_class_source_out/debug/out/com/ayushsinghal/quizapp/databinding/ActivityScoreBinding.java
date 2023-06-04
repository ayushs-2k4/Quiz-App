// Generated by view binder compiler. Do not edit!
package com.ayushsinghal.quizapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.ayushsinghal.quizapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScoreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView congratsAnimation;

  @NonNull
  public final TextView scoreTextView;

  @NonNull
  public final TextView textView2;

  private ActivityScoreBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView congratsAnimation, @NonNull TextView scoreTextView,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.congratsAnimation = congratsAnimation;
    this.scoreTextView = scoreTextView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_score, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.congratsAnimation;
      LottieAnimationView congratsAnimation = ViewBindings.findChildViewById(rootView, id);
      if (congratsAnimation == null) {
        break missingId;
      }

      id = R.id.scoreTextView;
      TextView scoreTextView = ViewBindings.findChildViewById(rootView, id);
      if (scoreTextView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityScoreBinding((ConstraintLayout) rootView, congratsAnimation, scoreTextView,
          textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
