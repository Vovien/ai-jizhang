// Generated by view binder compiler. Do not edit!
package com.jmbon.video.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.jmbon.video.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemVideoListGuessBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final IncludeVideoGuessBinding textInfo1;

  @NonNull
  public final IncludeVideoGuessBinding textInfo2;

  @NonNull
  public final IncludeVideoGuessBinding textInfo3;

  @NonNull
  public final IncludeVideoGuessBinding textInfo4;

  @NonNull
  public final TextView textTitle;

  private ItemVideoListGuessBinding(@NonNull MaterialCardView rootView,
      @NonNull IncludeVideoGuessBinding textInfo1, @NonNull IncludeVideoGuessBinding textInfo2,
      @NonNull IncludeVideoGuessBinding textInfo3, @NonNull IncludeVideoGuessBinding textInfo4,
      @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.textInfo1 = textInfo1;
    this.textInfo2 = textInfo2;
    this.textInfo3 = textInfo3;
    this.textInfo4 = textInfo4;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVideoListGuessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVideoListGuessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_video_list_guess, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVideoListGuessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textInfo1;
      View textInfo1 = ViewBindings.findChildViewById(rootView, id);
      if (textInfo1 == null) {
        break missingId;
      }
      IncludeVideoGuessBinding binding_textInfo1 = IncludeVideoGuessBinding.bind(textInfo1);

      id = R.id.textInfo2;
      View textInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (textInfo2 == null) {
        break missingId;
      }
      IncludeVideoGuessBinding binding_textInfo2 = IncludeVideoGuessBinding.bind(textInfo2);

      id = R.id.textInfo3;
      View textInfo3 = ViewBindings.findChildViewById(rootView, id);
      if (textInfo3 == null) {
        break missingId;
      }
      IncludeVideoGuessBinding binding_textInfo3 = IncludeVideoGuessBinding.bind(textInfo3);

      id = R.id.textInfo4;
      View textInfo4 = ViewBindings.findChildViewById(rootView, id);
      if (textInfo4 == null) {
        break missingId;
      }
      IncludeVideoGuessBinding binding_textInfo4 = IncludeVideoGuessBinding.bind(textInfo4);

      id = R.id.textTitle;
      TextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new ItemVideoListGuessBinding((MaterialCardView) rootView, binding_textInfo1,
          binding_textInfo2, binding_textInfo3, binding_textInfo4, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
