package com.example.qvntruyen;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Ad_Truyen extends BaseAdapter {

    private List<DS_Truyen> list;
    LayoutInflater layoutInflater;
    Context context;

    public Ad_Truyen(Context context, List<DS_Truyen> list) {
        this.list = list;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.gv_item, null);
            holder = new ViewHolder();
            holder.img = (ImageView) convertView.findViewById(R.id.gv_item_iv_image);
            holder.name = (TextView) convertView.findViewById(R.id.gv_item_tv_nameimage);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        DS_Truyen ds = this.list.get(position);
        holder.name.setText(ds.getName());

        int imgId = this.getMipmapResIdByName(ds.getImg());
        holder.img.setImageResource(imgId);
        return convertView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();

        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomGridView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder{
        ImageView img;
        TextView name;
    }
}
