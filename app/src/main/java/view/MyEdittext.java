package view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

/**
 * Created by gh on 2017-08-12.
 */

public class MyEdittext extends EditText{
    private Drawable mRightDrawable;

    private class MyListener implements OnFocusChangeListener {

        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                int len = getText().toString().length();
                if (len == 0) {
                    MyEdittext.this.setClearDrawableVisible(true);
                } else {
                    MyEdittext.this.setClearDrawableVisible(false);
                }
            } else {
                MyEdittext.this.setClearDrawableVisible(true);
            }

        }
    }

    public MyEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEdittext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public MyEdittext(Context context) {
        super(context);
        init();
    }

    private void init () {
        Drawable[] drawables = this.getCompoundDrawables();
        mRightDrawable = drawables[2];
        this.setOnFocusChangeListener(new MyListener());

        setClearDrawableVisible(true);
    }

    public void setClearDrawableVisible(boolean isClear) {
        Drawable drawable;
        if (isClear == false) {
            drawable = this.mRightDrawable;
        } else {
            drawable = null;
        }

        Drawable[] draws = getCompoundDrawables();
        setCompoundDrawables(
                draws[0],
                draws[1],
                drawable,
                draws[3]
                );

    }

}
