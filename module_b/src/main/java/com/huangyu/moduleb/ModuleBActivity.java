package com.huangyu.moduleb;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.huangyu.module_common.BaseActivity;
import com.huangyu.module_common.RouterConstants;

import butterknife.OnClick;

/**
 * Created by huangyu on 2018/9/5.
 */
@Route(path = RouterConstants.MODULE_B_MAIN_ACTIVITY)
public class ModuleBActivity extends BaseActivity {

    @Override
    public int getLayoutResId() {
        return R.layout.module_b_activity_main;
    }

    @OnClick(R2.id.tv_title)
    public void onClick() {
        ARouter.getInstance().build(RouterConstants.MODULE_A_MAIN_ACTIVITY).navigation();
    }

}
