package com.encrypt.demo.demoencrypt.model;

public class Response {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data='" + data + '\'' +
                '}';
    }
}
