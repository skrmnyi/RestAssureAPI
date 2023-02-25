package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openjdk.nashorn.internal.objects.annotations.Getter;
import org.openjdk.nashorn.internal.objects.annotations.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = PojoObjects.class)
public class PojoObjects {


    @JsonProperty("Present")
    public String present;

    @JsonProperty("Description")
    public String description;

    @JsonIgnoreProperties
    @JsonCreator
    public PojoObjects() {
        this.present = present;
        this.description = description;

    }

    @Getter
    public String getPresent() {
        return present;
    }

    @Setter
    public void setPresent(String present) {
        this.present = present;
    }

    @Getter
    public String getDescription() {
        return description;
    }

    @Setter
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OneMorePojo{" +
                "present='" + present + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}