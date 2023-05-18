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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shiba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeHorizontalItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView homeHorImgPizza;

  @NonNull
  public final TextView homeHorPizzaTxt;

  private HomeHorizontalItemBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull ImageView homeHorImgPizza, @NonNull TextView homeHorPizzaTxt) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.homeHorImgPizza = homeHorImgPizza;
    this.homeHorPizzaTxt = homeHorPizzaTxt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeHorizontalItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeHorizontalItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_horizontal_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeHorizontalItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.home_hor_img_pizza;
      ImageView homeHorImgPizza = ViewBindings.findChildViewById(rootView, id);
      if (homeHorImgPizza == null) {
        break missingId;
      }

      id = R.id.home_hor_pizza_txt;
      TextView homeHorPizzaTxt = ViewBindings.findChildViewById(rootView, id);
      if (homeHorPizzaTxt == null) {
        break missingId;
      }

      return new HomeHorizontalItemBinding((CardView) rootView, cardView, homeHorImgPizza,
          homeHorPizzaTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
