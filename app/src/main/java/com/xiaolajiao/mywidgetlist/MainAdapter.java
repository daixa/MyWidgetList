package com.xiaolajiao.mywidgetlist;

import android.appwidget.AppWidgetProviderInfo;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */

public class MainAdapter extends BaseQuickAdapter<AppWidgetProviderInfo, BaseViewHolder> {

    public MainAdapter(@Nullable List<AppWidgetProviderInfo> data) {
        super(R.layout.widget_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AppWidgetProviderInfo item) {
        helper.setText(R.id.widget_tv, String.valueOf(item.provider.getShortClassName()));
        Glide.with(mContext).load(item.loadPreviewImage(mContext, 480)).into((ImageView) helper.getView(R.id.widget_iv));
        Log.e(TAG, "convert: "+item.initialLayout );
    }
}
