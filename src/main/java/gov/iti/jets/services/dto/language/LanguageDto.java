package gov.iti.jets.services.dto.language;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LanguageDto implements Serializable {

    private Integer id;

    @NotEmpty(message = "name must have value")
    private String name;

    private Date lastUpdate;

    public LanguageDto() {
    }

    public LanguageDto(Integer id, String name, Date lastUpdate) {
        this.id = id;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "LanguageDto [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
    }


    

}
