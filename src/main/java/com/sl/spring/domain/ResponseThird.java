package com.sl.spring.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "responseThird")
public class ResponseThird implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("msgThird")
    private String msgThird;

    public ResponseThird(String msgThird) {
        this.msgThird = msgThird;
    }

    public ResponseThird() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgThird() {
        return msgThird;
    }

    public void setMsgThird(String msgThird) {
        this.msgThird = msgThird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ResponseThird))
            return false;
        ResponseThird that = (ResponseThird) o;
        return Objects.equals(id, that.id) && Objects.equals(msgThird, that.msgThird);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msgThird);
    }

    @Override
    public String toString() {
        return "ResponseThird{" +
                "id='" + id + '\'' +
                ", msgThird='" + msgThird + '\'' +
                '}';
    }
}
