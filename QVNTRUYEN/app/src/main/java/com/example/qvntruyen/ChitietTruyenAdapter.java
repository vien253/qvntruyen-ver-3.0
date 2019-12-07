package com.example.qvntruyen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ChitietTruyenAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ChitietTruyen> DSList;

    public ChitietTruyenAdapter(Context context, int layout, List<ChitietTruyen> DSList) {
        this.context = context;
        this.layout = layout;
        this.DSList = DSList;
    }

    @Override
    public int getCount() {
        return DSList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        TextView chap;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
          ViewHolder holder;
        if(view==null)
        {
            holder= new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.chap=(TextView) view.findViewById(R.id.chaptruyen);
            view.setTag(holder);
        }else{
            holder=(ViewHolder)view.getTag();
        }
        ChitietTruyen ds_truyen= this.DSList.get(i);
        holder.chap.setText(ds_truyen.getChap());

        return view;
    }
}
