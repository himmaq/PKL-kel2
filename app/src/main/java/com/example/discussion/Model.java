package com.example.discussion;

class Model {
    String askerPhoto, content, date, like, name, photo, reply, title, topic;

    public Model() {
    }

    public Model(String askerPhoto, String content, String date, String like, String name, String photo, String reply, String title, String topic) {
        this.askerPhoto = askerPhoto;
        this.content = content;
        this.date = date;
        this.like = like;
        this.name = name;
        this.photo = photo;
        this.reply = reply;
        this.title = title;
        this.topic = topic;
    }

    public String getAskerPhoto() {
        return askerPhoto;
    }

    public void setAskerPhoto(String askerPhoto) {
        this.askerPhoto = askerPhoto;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
