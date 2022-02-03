package com.sl.spring.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * Persist AuditEvent managed by the Spring Boot actuator.
 *
 * @see org.springframework.boot.actuate.audit.AuditEvent
 */
@Document(collection = "responseSecond")
public class ResponseSecond implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("msgSecond")
    private String msgSecond;

    public ResponseSecond(String msgSecond) {
        this.msgSecond = msgSecond;
    }

    public ResponseSecond() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgSecond() {
        return msgSecond;
    }

    public void setMsgSecond(String msgSecond) {
        this.msgSecond = msgSecond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ResponseSecond))
            return false;
        ResponseSecond that = (ResponseSecond) o;
        return Objects.equals(id, that.id) && Objects.equals(msgSecond, that.msgSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msgSecond);
    }

    @Override
    public String toString() {
        return "ResponseSecond{" +
                "id='" + id + '\'' +
                ", msgSecond='" + msgSecond + '\'' +
                '}';
    }
}
