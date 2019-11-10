package com.example.qvntruyen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {
    TextView mTvName;
    ArrayList<DS_Truyen> img_detail = new ArrayList<DS_Truyen>();
    GridView gView;
    Ad_Truyen listtruyen;
    FrameLayout frameLayout;
    //FragmentManager fm = getFragmentManager();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home,container,false);
        img_detail = (ArrayList<DS_Truyen>) ds();
        gView = (GridView) view.findViewById(R.id.fragment_home_gv_item);
        listtruyen = new Ad_Truyen(getContext(), img_detail);
        gView.setAdapter(listtruyen);
        Info();
        return view;
    }

    public static List<DS_Truyen> ds(){
        List<DS_Truyen> list = new ArrayList<DS_Truyen>();
        list.add(new DS_Truyen("book1","Re-zero"));
        list.add(new DS_Truyen("book2","Date A Live"));
        list.add(new DS_Truyen("book3","UCHI NO KO NO TAME NARABA, ORE WA MOSHIKASHITARA MAOU MO TAOSERU KAMO SHIRENAI"));
        list.add(new DS_Truyen("book4","Gosick"));
        list.add(new DS_Truyen("book5","God Slayer"));
        list.add(new DS_Truyen("book6","The Beginning After The End"));
        return list;
    }

    private void Info(){
        gView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction ff = getActivity().getSupportFragmentManager().beginTransaction();
                ff.replace(R.id.fragment_container, new Item_click());
                ff.commit();
            }
        });

    }
}
