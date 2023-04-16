package gov.iti.jets.services.dto.categories;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CategoryDto implements Serializable {
    private Integer id;

    @NotEmpty(message = "Name must have value")
    private String name;

    private Date lastUpdate;

    public CategoryDto() {
    }

    public CategoryDto(Integer id, String name, Date lastUpdate) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "CategoryDto [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
    }

}
