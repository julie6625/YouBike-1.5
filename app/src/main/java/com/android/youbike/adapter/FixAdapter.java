package com.android.youbike.adapter;

import androidx.annotation.Nullable;

import com.android.youbike.R;
import com.android.youbike.entity.FixBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.List;


public class FixAdapter extends BaseQuickAdapter<FixBean, BaseViewHolder> {
    public FixAdapter(@Nullable List<FixBean> data) {
        super(R.layout.res_fix_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FixBean item) {
        helper.setText(R.id.tv1, "通報案號： "+item.getTitle())
                .setText(R.id.tv2,"通報類型："+item.getType())
                .setText(R.id.tv3,"所在地區："+item.getArea())
                .setText(R.id.tv4,"维修項目："+item.getProject());
    }
}
