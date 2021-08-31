package com.example.discussion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.jetbrains.annotations.NotNull;

public class DiscussionAdapter extends FirebaseRecyclerAdapter<Model, DiscussionAdapter.ViewHolder> {

    public DiscussionAdapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Model model) {
        holder.theme.setText(model.getTopic());
        holder.question.setText(model.getTitle());
        holder.name.setText(model.getName());
        holder.posted.setText(model.getDate());
        holder.detailQuestion.setText(model.getContent());
        holder.like.setText(model.getLike());
        holder.reply.setText(model.getReply());

        Glide.with(holder.imgProfile.getContext()).load(model.getAskerPhoto()).into(holder.imgProfile);
        Glide.with(holder.imgProfileUser.getContext()).load(model.getPhoto()).into(holder.imgProfileUser);
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carddiscussion,parent,false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile, imgProfileUser;
        TextView theme, question, name, posted, detailQuestion, like, reply;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.img_profile);
            imgProfileUser = itemView.findViewById(R.id.img_profileuser);
            theme = itemView.findViewById(R.id.tv_theme);
            question = itemView.findViewById(R.id.tv_question);
            name = itemView.findViewById(R.id.tv_name);
            posted = itemView.findViewById(R.id.tv_posted);
            detailQuestion = itemView.findViewById(R.id.tv_detailquestion);
            like = itemView.findViewById(R.id.tv_like);
            reply = itemView.findViewById(R.id.et_replies);

        }
    }
}
