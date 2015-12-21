package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by DS on 12/22/2015.
 */
public class ArticleDetailImageView extends ImageView {
    public ArticleDetailImageView(Context context) {
        super(context);
    }

    public ArticleDetailImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArticleDetailImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
// Taken from Material Design Course Video
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int sevenEightHeight = MeasureSpec.getSize(widthMeasureSpec) * 7/8;
        int sevenEightHeightSpec =
                MeasureSpec.makeMeasureSpec(sevenEightHeight, MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, sevenEightHeightSpec);
    }
}
