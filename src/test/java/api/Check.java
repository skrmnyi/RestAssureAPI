
//Please ignore this class, it was created to fix POJO problem

package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openjdk.nashorn.internal.objects.annotations.Getter;
import org.openjdk.nashorn.internal.objects.annotations.Setter;


@JsonDeserialize(as = Check.class)
public class Check {

    @JsonProperty("Description")
    public String description;

    @JsonCreator
    public Check(@JsonProperty("Description") String description) {
        this.description = description;
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
        return "Check{" +
                "description='" + description + '\'' +
                '}';
    }
}
