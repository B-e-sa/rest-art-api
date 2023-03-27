package aws.rest.art.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Artwork {

    String imageUrl,
            name,
            description,
            completedIn;

}
