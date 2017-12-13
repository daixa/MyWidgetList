package com.xiaolajiao.mywidgetlist;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;

/**
 * Created by Administrator on 2017/12/9.
 */

public class myAppWidgetHost extends AppWidgetHost {
    public myAppWidgetHost(Context context, int hostId) {
        super(context, hostId);
    }

    @Override
    protected AppWidgetHostView onCreateView(Context context, int appWidgetId, AppWidgetProviderInfo appWidget) {
        return super.onCreateView(context, appWidgetId, appWidget);
    }
}
