// Generated by view binder compiler. Do not edit!
package com.example.shiba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shiba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeVerticalItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ConstraintLayout constraintlayout;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView rating;

  @NonNull
  public final TextView timing;

  @NonNull
  public final ImageView verImg;

  private HomeVerticalItemBinding(@NonNull CardView rootView,
      @NonNull ConstraintLayout constraintlayout, @NonNull ImageView imageView4,
      @NonNull ImageView imageView5, @NonNull TextView name, @NonNull TextView price,
      @NonNull TextView rating, @NonNull TextView timing, @NonNull ImageView verImg) {
    this.rootView = rootView;
    this.constraintlayout = constraintlayout;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.name = name;
    this.price = price;
    this.rating = rating;
    this.timing = timing;
    this.verImg = verImg;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeVerticalItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeVerticalItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_vertical_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeVerticalItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintlayout;
      ConstraintLayout constraintlayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintlayout == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.rating;
      TextView rating = ViewBindings.findChildViewById(rootView, id);
      if (rating == null) {
        break missingId;
      }

      id = R.id.timing;
      TextView timing = ViewBindings.findChildViewById(rootView, id);
      if (timing == null) {
        break missingId;
      }

      id = R.id.ver_img;
      ImageView verImg = ViewBindings.findChildViewById(rootView, id);
      if (verImg == null) {
        break missingId;
      }

      return new HomeVerticalItemBinding((CardView) rootView, constraintlayout, imageView4,
          imageView5, name, price, rating, timing, verImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
