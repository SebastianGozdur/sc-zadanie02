import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BuilderExample {

    private String name;
    private String createdBy;
    private String description;

    public BuilderExample(String name, String createdBy, String description) {
        this.name = name;
        this.createdBy = createdBy;
        this.description = description;
    }
}
