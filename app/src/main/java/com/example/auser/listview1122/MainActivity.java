package com.example.auser.listview1122;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    int [] picture = new int[]{R.drawable.map,R.drawable.browser,R.drawable.music};
    String[] array1 =new String[]{"Logo1","Logo2","Logo3"};
    String[] array2 =new String[]{"11111","22222","33333"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv =(ListView)findViewById(R.id.listview);
        MyAdaper adaper =new MyAdaper(this);
        lv.setAdapter(adaper);
    }
}



class MyAdaper extends BaseAdapter{
    int [] picture = new int[]{R.drawable.map,R.drawable.browser,R.drawable.music};
    String[] array1 =new String[]{"Logo1","Logo2","Logo3"};
    String[] array2 =new String[]{"11111","22222","33333"};
private LayoutInflater myInflater;
    public MyAdaper(Context c){
        myInflater =LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return picture.length;
    }

    @Override
    public Object getItem(int i) {
        return picture.length;
    }

    @Override
    public long getItemId(int i) {
        return picture.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        convertView = myInflater.inflate(R.layout.mylayout,null);
        ImageView imageView =(ImageView)convertView.findViewById(R.id.logo);
        TextView tv1 =(TextView)convertView.findViewById(R.id.tv1);
        TextView tv2 =(TextView)convertView.findViewById(R.id.tv2);

        imageView.setImageResource(picture[position]);
        tv1.setText(array1[position]);
        tv2.setText(array2[position]);

        return convertView;
    }
}