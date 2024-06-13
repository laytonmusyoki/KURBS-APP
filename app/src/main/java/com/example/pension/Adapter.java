package com.example.pension;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public List<User> userList;
    public Adapter(List<User> usersList){
        this.userList=usersList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String id=userList.get(position).getId();
        String username=userList.get(position).getUsername();
        String email=userList.get(position).getEmail();

        holder.setData(id,username,email);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView userId,userUsername,userEmail;


        public ViewHolder(View view) {
            super(view);
            userId=view.findViewById(R.id.id);
            userEmail=view.findViewById(R.id.email);
            userUsername=view.findViewById(R.id.username);
        }

        public void setData(String id, String username, String email) {
            userId.setText(id);
            userUsername.setText(username);
            userEmail.setText(email);
        }
    }
}
