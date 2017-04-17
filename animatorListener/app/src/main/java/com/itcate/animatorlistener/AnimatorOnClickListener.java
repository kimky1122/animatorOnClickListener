package com.itcate.animatorlistener;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimatorOnClickListener extends View implements View.OnClickListener {


    OnClickListener mContext = null;


    public AnimatorOnClickListener(View.OnClickListener context) {
        super((Context)context);
        mContext = context;

    }


    @Override
    public void onClick(View v) {
        if (mContext != null) {
            Animation myAnim = AnimationUtils.loadAnimation((Context)mContext, R.anim.scale);
            v.startAnimation(myAnim);
        }
        mContext.onClick(v);


    }

}