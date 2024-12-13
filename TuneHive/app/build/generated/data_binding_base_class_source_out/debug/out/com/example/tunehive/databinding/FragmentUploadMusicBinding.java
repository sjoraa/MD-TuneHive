// Generated by view binder compiler. Do not edit!
package com.example.tunehive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
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

public final class FragmentUploadMusicBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView audioFileLabel;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final TextView genreLabel;

  @NonNull
  public final Spinner genreSpinner;

  @NonNull
  public final TextView songCoverLabel;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final EditText titleInput;

  @NonNull
  public final TextView titleLabel;

  @NonNull
  public final Button uploadAudioButton;

  @NonNull
  public final LinearLayout uploadMusic;

  @NonNull
  public final TextView uploadMusicLabel;

  @NonNull
  public final Button uploadSongCoverButton;

  private FragmentUploadMusicBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView audioFileLabel, @NonNull ImageButton backButton,
      @NonNull TextView genreLabel, @NonNull Spinner genreSpinner, @NonNull TextView songCoverLabel,
      @NonNull Button submitButton, @NonNull EditText titleInput, @NonNull TextView titleLabel,
      @NonNull Button uploadAudioButton, @NonNull LinearLayout uploadMusic,
      @NonNull TextView uploadMusicLabel, @NonNull Button uploadSongCoverButton) {
    this.rootView = rootView;
    this.audioFileLabel = audioFileLabel;
    this.backButton = backButton;
    this.genreLabel = genreLabel;
    this.genreSpinner = genreSpinner;
    this.songCoverLabel = songCoverLabel;
    this.submitButton = submitButton;
    this.titleInput = titleInput;
    this.titleLabel = titleLabel;
    this.uploadAudioButton = uploadAudioButton;
    this.uploadMusic = uploadMusic;
    this.uploadMusicLabel = uploadMusicLabel;
    this.uploadSongCoverButton = uploadSongCoverButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUploadMusicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUploadMusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_upload_music, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUploadMusicBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audioFileLabel;
      TextView audioFileLabel = ViewBindings.findChildViewById(rootView, id);
      if (audioFileLabel == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.genreLabel;
      TextView genreLabel = ViewBindings.findChildViewById(rootView, id);
      if (genreLabel == null) {
        break missingId;
      }

      id = R.id.genreSpinner;
      Spinner genreSpinner = ViewBindings.findChildViewById(rootView, id);
      if (genreSpinner == null) {
        break missingId;
      }

      id = R.id.songCoverLabel;
      TextView songCoverLabel = ViewBindings.findChildViewById(rootView, id);
      if (songCoverLabel == null) {
        break missingId;
      }

      id = R.id.submitButton;
      Button submitButton = ViewBindings.findChildViewById(rootView, id);
      if (submitButton == null) {
        break missingId;
      }

      id = R.id.titleInput;
      EditText titleInput = ViewBindings.findChildViewById(rootView, id);
      if (titleInput == null) {
        break missingId;
      }

      id = R.id.titleLabel;
      TextView titleLabel = ViewBindings.findChildViewById(rootView, id);
      if (titleLabel == null) {
        break missingId;
      }

      id = R.id.uploadAudioButton;
      Button uploadAudioButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadAudioButton == null) {
        break missingId;
      }

      id = R.id.uploadMusic;
      LinearLayout uploadMusic = ViewBindings.findChildViewById(rootView, id);
      if (uploadMusic == null) {
        break missingId;
      }

      id = R.id.uploadMusicLabel;
      TextView uploadMusicLabel = ViewBindings.findChildViewById(rootView, id);
      if (uploadMusicLabel == null) {
        break missingId;
      }

      id = R.id.uploadSongCoverButton;
      Button uploadSongCoverButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadSongCoverButton == null) {
        break missingId;
      }

      return new FragmentUploadMusicBinding((ConstraintLayout) rootView, audioFileLabel, backButton,
          genreLabel, genreSpinner, songCoverLabel, submitButton, titleInput, titleLabel,
          uploadAudioButton, uploadMusic, uploadMusicLabel, uploadSongCoverButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
