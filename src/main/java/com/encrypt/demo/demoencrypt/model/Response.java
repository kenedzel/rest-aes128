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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;

        Response response = (Response) o;

        return data.equals(response.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
