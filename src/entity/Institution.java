package entity;

import java.util.Objects;

public class Institution {
    private Integer id;
    private String name;
    private String choises;
    private Double reason;
    private String explains;
    private String createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoises() {
        return choises;
    }

    public void setChoises(String choises) {
        this.choises = choises;
    }
    public Double getReason() {
        return reason;
    }

    public void setReason(Double reason) {
        this.reason = reason;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institution that = (Institution) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(explains, that.explains) &&
                Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, reason, explains, createtime);
    }

}
