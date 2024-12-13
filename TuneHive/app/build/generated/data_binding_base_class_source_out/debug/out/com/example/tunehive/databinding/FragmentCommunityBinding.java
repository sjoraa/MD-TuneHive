// Generated by view binder compiler. Do not edit!
package com.example.tunehive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tunehive.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCommunityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton btnPosting;

  @NonNull
  public final LinearLayout btnPostingContainer;

  @NonNull
  public final FloatingActionButton btnUploadLagu;

  @NonNull
  public final LinearLayout btnUploadLaguContainer;

  @NonNull
  public final LinearLayout buttonsContainer;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final View overlayBackground;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView tvPosting;

  @NonNull
  public final TextView tvUploadLagu;

  private FragmentCommunityBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton btnPosting, @NonNull LinearLayout btnPostingContainer,
      @NonNull FloatingActionButton btnUploadLagu, @NonNull LinearLayout btnUploadLaguContainer,
      @NonNull LinearLayout buttonsContainer, @NonNull FloatingActionButton fab,
      @NonNull View overlayBackground, @NonNull RecyclerView recyclerView,
      @NonNull TextView tvPosting, @NonNull TextView tvUploadLagu) {
    this.rootView = rootView;
    this.btnPosting = btnPosting;
    this.btnPostingContainer = btnPostingContainer;
    this.btnUploadLagu = btnUploadLagu;
    this.btnUploadLaguContainer = btnUploadLaguContainer;
    this.buttonsContainer = buttonsContainer;
    this.fab = fab;
    this.overlayBackground = overlayBackground;
    this.recyclerView = recyclerView;
    this.tvPosting = tvPosting;
    this.tvUploadLagu = tvUploadLagu;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommunityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_community, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommunityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPosting;
      FloatingActionButton btnPosting = ViewBindings.findChildViewById(rootView, id);
      if (btnPosting == null) {
        break missingId;
      }

      id = R.id.btnPostingContainer;
      LinearLayout btnPostingContainer = ViewBindings.findChildViewById(rootView, id);
      if (btnPostingContainer == null) {
        break missingId;
      }

      id = R.id.btnUploadLagu;
      FloatingActionButton btnUploadLagu = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadLagu == null) {
        break missingId;
      }

      id = R.id.btnUploadLaguContainer;
      LinearLayout btnUploadLaguContainer = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadLaguContainer == null) {
        break missingId;
      }

      id = R.id.buttonsContainer;
      LinearLayout buttonsContainer = ViewBindings.findChildViewById(rootView, id);
      if (buttonsContainer == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.overlayBackground;
      View overlayBackground = ViewBindings.findChildViewById(rootView, id);
      if (overlayBackground == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.tvPosting;
      TextView tvPosting = ViewBindings.findChildViewById(rootView, id);
      if (tvPosting == null) {
        break missingId;
      }

      id = R.id.tvUploadLagu;
      TextView tvUploadLagu = ViewBindings.findChildViewById(rootView, id);
      if (tvUploadLagu == null) {
        break missingId;
      }

      return new FragmentCommunityBinding((RelativeLayout) rootView, btnPosting,
          btnPostingContainer, btnUploadLagu, btnUploadLaguContainer, buttonsContainer, fab,
          overlayBackground, recyclerView, tvPosting, tvUploadLagu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}