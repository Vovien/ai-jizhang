// Generated by view binder compiler. Do not edit!
package com.jmbon.video.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.allen.library.shape.ShapeFrameLayout;
import com.jmbon.video.R;
import com.jmbon.video.widget.FollowButton;
import com.jmbon.video.widget.VerticalViewFlipper;
import com.jmbon.video.widget.seekbar.TickSeekBar;
import com.jmbon.widget.FloatLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemVideoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeFrameLayout advImageLayout;

  @NonNull
  public final View background;

  @NonNull
  public final View backgroundtop;

  @NonNull
  public final VerticalViewFlipper clBox;

  @NonNull
  public final LinearLayout clCollection;

  @NonNull
  public final LinearLayout clComments;

  @NonNull
  public final LinearLayout clLike;

  @NonNull
  public final LinearLayout clShare;

  @NonNull
  public final ConstraintLayout clVideoControl;

  @NonNull
  public final FrameLayout flBottom;

  @NonNull
  public final FloatLayout floatLayout;

  @NonNull
  public final ImageView imageAvatar;

  @NonNull
  public final FollowButton imageFocus;

  @NonNull
  public final ImageView imageLike;

  @NonNull
  public final ImageView imageThumb;

  @NonNull
  public final ImageView ivCollection;

  @NonNull
  public final ImageView ivShare;

  @NonNull
  public final LinearLayout layoutRisk;

  @NonNull
  public final LinearLayout llOpt;

  @NonNull
  public final TickSeekBar seekBar;

  @NonNull
  public final TextView textAlbum;

  @NonNull
  public final TextView textCollection;

  @NonNull
  public final TextView textComments;

  @NonNull
  public final TextView textDesc;

  @NonNull
  public final TextView textFollow;

  @NonNull
  public final TextView textGetCase;

  @NonNull
  public final TextView textLike;

  @NonNull
  public final TextView textName;

  @NonNull
  public final TextView textReply;

  @NonNull
  public final TextView textRiskTips;

  @NonNull
  public final TextView textTime;

  @NonNull
  public final TextView textVideoAlbum;

  @NonNull
  public final TextView tvShare;

  @NonNull
  public final FrameLayout videoControl;

  @NonNull
  public final View viewBaseLine;

  private ItemVideoBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeFrameLayout advImageLayout, @NonNull View background,
      @NonNull View backgroundtop, @NonNull VerticalViewFlipper clBox,
      @NonNull LinearLayout clCollection, @NonNull LinearLayout clComments,
      @NonNull LinearLayout clLike, @NonNull LinearLayout clShare,
      @NonNull ConstraintLayout clVideoControl, @NonNull FrameLayout flBottom,
      @NonNull FloatLayout floatLayout, @NonNull ImageView imageAvatar,
      @NonNull FollowButton imageFocus, @NonNull ImageView imageLike, @NonNull ImageView imageThumb,
      @NonNull ImageView ivCollection, @NonNull ImageView ivShare, @NonNull LinearLayout layoutRisk,
      @NonNull LinearLayout llOpt, @NonNull TickSeekBar seekBar, @NonNull TextView textAlbum,
      @NonNull TextView textCollection, @NonNull TextView textComments, @NonNull TextView textDesc,
      @NonNull TextView textFollow, @NonNull TextView textGetCase, @NonNull TextView textLike,
      @NonNull TextView textName, @NonNull TextView textReply, @NonNull TextView textRiskTips,
      @NonNull TextView textTime, @NonNull TextView textVideoAlbum, @NonNull TextView tvShare,
      @NonNull FrameLayout videoControl, @NonNull View viewBaseLine) {
    this.rootView = rootView;
    this.advImageLayout = advImageLayout;
    this.background = background;
    this.backgroundtop = backgroundtop;
    this.clBox = clBox;
    this.clCollection = clCollection;
    this.clComments = clComments;
    this.clLike = clLike;
    this.clShare = clShare;
    this.clVideoControl = clVideoControl;
    this.flBottom = flBottom;
    this.floatLayout = floatLayout;
    this.imageAvatar = imageAvatar;
    this.imageFocus = imageFocus;
    this.imageLike = imageLike;
    this.imageThumb = imageThumb;
    this.ivCollection = ivCollection;
    this.ivShare = ivShare;
    this.layoutRisk = layoutRisk;
    this.llOpt = llOpt;
    this.seekBar = seekBar;
    this.textAlbum = textAlbum;
    this.textCollection = textCollection;
    this.textComments = textComments;
    this.textDesc = textDesc;
    this.textFollow = textFollow;
    this.textGetCase = textGetCase;
    this.textLike = textLike;
    this.textName = textName;
    this.textReply = textReply;
    this.textRiskTips = textRiskTips;
    this.textTime = textTime;
    this.textVideoAlbum = textVideoAlbum;
    this.tvShare = tvShare;
    this.videoControl = videoControl;
    this.viewBaseLine = viewBaseLine;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_video, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVideoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adv_image_layout;
      ShapeFrameLayout advImageLayout = ViewBindings.findChildViewById(rootView, id);
      if (advImageLayout == null) {
        break missingId;
      }

      id = R.id.background;
      View background = ViewBindings.findChildViewById(rootView, id);
      if (background == null) {
        break missingId;
      }

      id = R.id.backgroundtop;
      View backgroundtop = ViewBindings.findChildViewById(rootView, id);
      if (backgroundtop == null) {
        break missingId;
      }

      id = R.id.clBox;
      VerticalViewFlipper clBox = ViewBindings.findChildViewById(rootView, id);
      if (clBox == null) {
        break missingId;
      }

      id = R.id.clCollection;
      LinearLayout clCollection = ViewBindings.findChildViewById(rootView, id);
      if (clCollection == null) {
        break missingId;
      }

      id = R.id.clComments;
      LinearLayout clComments = ViewBindings.findChildViewById(rootView, id);
      if (clComments == null) {
        break missingId;
      }

      id = R.id.clLike;
      LinearLayout clLike = ViewBindings.findChildViewById(rootView, id);
      if (clLike == null) {
        break missingId;
      }

      id = R.id.clShare;
      LinearLayout clShare = ViewBindings.findChildViewById(rootView, id);
      if (clShare == null) {
        break missingId;
      }

      ConstraintLayout clVideoControl = (ConstraintLayout) rootView;

      id = R.id.fl_bottom;
      FrameLayout flBottom = ViewBindings.findChildViewById(rootView, id);
      if (flBottom == null) {
        break missingId;
      }

      id = R.id.float_layout;
      FloatLayout floatLayout = ViewBindings.findChildViewById(rootView, id);
      if (floatLayout == null) {
        break missingId;
      }

      id = R.id.imageAvatar;
      ImageView imageAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imageAvatar == null) {
        break missingId;
      }

      id = R.id.imageFocus;
      FollowButton imageFocus = ViewBindings.findChildViewById(rootView, id);
      if (imageFocus == null) {
        break missingId;
      }

      id = R.id.imageLike;
      ImageView imageLike = ViewBindings.findChildViewById(rootView, id);
      if (imageLike == null) {
        break missingId;
      }

      id = R.id.imageThumb;
      ImageView imageThumb = ViewBindings.findChildViewById(rootView, id);
      if (imageThumb == null) {
        break missingId;
      }

      id = R.id.ivCollection;
      ImageView ivCollection = ViewBindings.findChildViewById(rootView, id);
      if (ivCollection == null) {
        break missingId;
      }

      id = R.id.iv_share;
      ImageView ivShare = ViewBindings.findChildViewById(rootView, id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.layoutRisk;
      LinearLayout layoutRisk = ViewBindings.findChildViewById(rootView, id);
      if (layoutRisk == null) {
        break missingId;
      }

      id = R.id.llOpt;
      LinearLayout llOpt = ViewBindings.findChildViewById(rootView, id);
      if (llOpt == null) {
        break missingId;
      }

      id = R.id.seekBar;
      TickSeekBar seekBar = ViewBindings.findChildViewById(rootView, id);
      if (seekBar == null) {
        break missingId;
      }

      id = R.id.textAlbum;
      TextView textAlbum = ViewBindings.findChildViewById(rootView, id);
      if (textAlbum == null) {
        break missingId;
      }

      id = R.id.textCollection;
      TextView textCollection = ViewBindings.findChildViewById(rootView, id);
      if (textCollection == null) {
        break missingId;
      }

      id = R.id.textComments;
      TextView textComments = ViewBindings.findChildViewById(rootView, id);
      if (textComments == null) {
        break missingId;
      }

      id = R.id.textDesc;
      TextView textDesc = ViewBindings.findChildViewById(rootView, id);
      if (textDesc == null) {
        break missingId;
      }

      id = R.id.textFollow;
      TextView textFollow = ViewBindings.findChildViewById(rootView, id);
      if (textFollow == null) {
        break missingId;
      }

      id = R.id.text_get_case;
      TextView textGetCase = ViewBindings.findChildViewById(rootView, id);
      if (textGetCase == null) {
        break missingId;
      }

      id = R.id.textLike;
      TextView textLike = ViewBindings.findChildViewById(rootView, id);
      if (textLike == null) {
        break missingId;
      }

      id = R.id.textName;
      TextView textName = ViewBindings.findChildViewById(rootView, id);
      if (textName == null) {
        break missingId;
      }

      id = R.id.textReply;
      TextView textReply = ViewBindings.findChildViewById(rootView, id);
      if (textReply == null) {
        break missingId;
      }

      id = R.id.textRiskTips;
      TextView textRiskTips = ViewBindings.findChildViewById(rootView, id);
      if (textRiskTips == null) {
        break missingId;
      }

      id = R.id.textTime;
      TextView textTime = ViewBindings.findChildViewById(rootView, id);
      if (textTime == null) {
        break missingId;
      }

      id = R.id.textVideoAlbum;
      TextView textVideoAlbum = ViewBindings.findChildViewById(rootView, id);
      if (textVideoAlbum == null) {
        break missingId;
      }

      id = R.id.tv_share;
      TextView tvShare = ViewBindings.findChildViewById(rootView, id);
      if (tvShare == null) {
        break missingId;
      }

      id = R.id.videoControl;
      FrameLayout videoControl = ViewBindings.findChildViewById(rootView, id);
      if (videoControl == null) {
        break missingId;
      }

      id = R.id.viewBaseLine;
      View viewBaseLine = ViewBindings.findChildViewById(rootView, id);
      if (viewBaseLine == null) {
        break missingId;
      }

      return new ItemVideoBinding((ConstraintLayout) rootView, advImageLayout, background,
          backgroundtop, clBox, clCollection, clComments, clLike, clShare, clVideoControl, flBottom,
          floatLayout, imageAvatar, imageFocus, imageLike, imageThumb, ivCollection, ivShare,
          layoutRisk, llOpt, seekBar, textAlbum, textCollection, textComments, textDesc, textFollow,
          textGetCase, textLike, textName, textReply, textRiskTips, textTime, textVideoAlbum,
          tvShare, videoControl, viewBaseLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
