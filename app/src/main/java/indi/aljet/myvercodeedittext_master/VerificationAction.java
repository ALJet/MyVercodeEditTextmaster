package indi.aljet.myvercodeedittext_master;

import android.support.annotation.ColorRes;

/**
 * 填写验证码的 Action
 */
public interface VerificationAction {

    /**
     * 设置位数
     * @param figures
     */
    void setFigures(int figures);


    /**
     * 设置验证码之间的间距
     * @param margin
     */
    void setVerCodeMargin(int margin);


    /**
     * 设置底部选中状态的颜色
     * @param bottomSelectedColor
     */
    void setBottomSelectedColor(@ColorRes int bottomSelectedColor);


    /**
     * 设置底部未选中状态的颜色
     * @param bottomNormalColor
     */
    void setBottomNormalColor(@ColorRes int bottomNormalColor);


    /**
     * 设置选择的背景颜色
     * @param selectedBackgroundColor
     */
    void setSelectedBackgroundColor(@ColorRes int selectedBackgroundColor);

    /**
     * 设置底线的高度
     * @param bottomLineHeight
     */
    void setBottomLineHeight(int bottomLineHeight);


    /**
     * 设置当验证码变化的时候监听器
     * @param listener
     */
    void setOnVerificationCodeChangedListener(OnVerificationCodeChangedListener listener);


    /**
     * 验证码变化时候监听事件
      */
    interface OnVerificationCodeChangedListener{

        /**
         * 当验证码变化的时候
         * @param s
         * @param start
         * @param before
         * @param count
         */
        void onVerCodeChanged(CharSequence s,
                              int start,
                              int before,
                              int count);


        /**
         *输入完成后的回调
         * @param s
         */
        void onInputCompleted(CharSequence s);
    }
}
