package com.huangyu.component;

import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.huangyu.module_common.BaseActivity;
import com.huangyu.module_common.RouterConstants;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.tv_left, R.id.tv_right})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_left:
                ARouter.getInstance().build(RouterConstants.MODULE_A_MAIN_ACTIVITY).navigation();
                break;
            case R.id.tv_right:
                ARouter.getInstance().build(RouterConstants.MODULE_B_MAIN_ACTIVITY).navigation();
                break;
        }
    }

}

