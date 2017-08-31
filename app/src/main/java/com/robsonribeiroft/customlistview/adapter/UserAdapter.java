package com.robsonribeiroft.customlistview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.robsonribeiroft.customlistview.R;
import com.robsonribeiroft.customlistview.model.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    private Activity activity;
    private List<User> users = new ArrayList<>();

    public UserAdapter(Activity activity, List<User> users){
        this.activity = activity;
        this.users = users;
    }


    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        User currentUser = (User) getItem(i);
        LayoutInflater inflater = activity.getLayoutInflater();
        View viewHolder = inflater.inflate(R.layout.adapter_user, null);

        ImageView imageView = viewHolder.findViewById(R.id.imageView);
        TextView textName = viewHolder.findViewById(R.id.textView);
        TextView textEmail = viewHolder.findViewById(R.id.textView2);

        textName.setText(currentUser.getName());
        textEmail.setText(currentUser.getEmail());
        Picasso.with(activity)
                .load(currentUser.getPicture())
                .placeholder(android.R.drawable.stat_sys_download)
                .error(android.R.drawable.stat_notify_error)
                .into(imageView);

        return viewHolder;
    }
}
