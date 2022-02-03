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
@Document(collection = "responseFirst")
public class ResponseFirst implements Serializable {

    private static final long serialVersionUID = 1L;

    public ResponseFirst(String msgFirst) {
        this.msgFirst = msgFirst;
    }

    public ResponseFirst() {
    }

    @Id
    private String id;

    @Field("msgFirst")
    private String msgFirst;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgFirst() {
        return msgFirst;
    }

    public void setMsgFirst(String msgFirst) {
        this.msgFirst = msgFirst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ResponseFirst))
            return false;
        ResponseFirst that = (ResponseFirst) o;
        return Objects.equals(id, that.id) && Objects.equals(msgFirst, that.msgFirst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msgFirst);
    }

    @Override
    public String toString() {
        return "ResponseFirst{" +
                "id='" + id + '\'' +
                ", msgFirst='" + msgFirst + '\'' +
                '}';
    }
}
