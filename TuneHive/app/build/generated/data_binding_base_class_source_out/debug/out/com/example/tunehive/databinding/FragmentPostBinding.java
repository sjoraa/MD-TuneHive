// Generated by view binder compiler. Do not edit!
package com.example.tunehive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tunehive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final Button btnPost;

  @NonNull
  public final EditText editTextPost;

  @NonNull
  public final ConstraintLayout postContainer;

  @NonNull
  public final LinearLayout profileContainer;

  @NonNull
  public final ImageView profilePicture;

  @NonNull
  public final TextView userName;

  private FragmentPostBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton backButton,
      @NonNull Button btnPost, @NonNull EditText editTextPost,
      @NonNull ConstraintLayout postContainer, @NonNull LinearLayout profileContainer,
      @NonNull ImageView profilePicture, @NonNull TextView userName) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.btnPost = btnPost;
    this.editTextPost = editTextPost;
    this.postContainer = postContainer;
    this.profileContainer = profileContainer;
    this.profilePicture = profilePicture;
    this.userName = userName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.btnPost;
      Button btnPost = ViewBindings.findChildViewById(rootView, id);
      if (btnPost == null) {
        break missingId;
      }

      id = R.id.editTextPost;
      EditText editTextPost = ViewBindings.findChildViewById(rootView, id);
      if (editTextPost == null) {
        break missingId;
      }

      id = R.id.postContainer;
      ConstraintLayout postContainer = ViewBindings.findChildViewById(rootView, id);
      if (postContainer == null) {
        break missingId;
      }

      id = R.id.profileContainer;
      LinearLayout profileContainer = ViewBindings.findChildViewById(rootView, id);
      if (profileContainer == null) {
        break missingId;
      }

      id = R.id.profilePicture;
      ImageView profilePicture = ViewBindings.findChildViewById(rootView, id);
      if (profilePicture == null) {
        break missingId;
      }

      id = R.id.userName;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new FragmentPostBinding((ConstraintLayout) rootView, backButton, btnPost, editTextPost,
          postContainer, profileContainer, profilePicture, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
