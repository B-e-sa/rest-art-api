package aws.rest.art.api.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Artist {

    String nickname,
            portraitUrl,
            birthCountry,
            movement,
            description,
            fullName,
            diedIn,
            wasBornIn,
            placeOfDeath;

    List<Artwork> artworks = new ArrayList<>();

}
