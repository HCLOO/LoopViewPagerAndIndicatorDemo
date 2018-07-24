package com.example.huangcl.loopviewpagerandindicatordemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MyViewPagerAdapter extends PagerAdapter {

    Context context;
    List<String> contentList;
    TextView textView;

    public MyViewPagerAdapter(Context context, List<String> contentList) {
        this.context=context;
        this.contentList=contentList;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_viewpager_item,null);
        textView=(TextView) view.findViewById(R.id.text_view);
        if(contentList!=null&&!contentList.isEmpty())
            textView.setText(contentList.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return contentList==null?0:contentList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
