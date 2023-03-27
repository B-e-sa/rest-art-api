package aws.rest.art.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import aws.rest.art.api.Data;
import aws.rest.art.api.model.Artist;

@Service
public class ArtistService {

    @Autowired
    Data data;

    public ResponseEntity<Artist> getArtistByName(String name) {

        for (Artist artist : data.getAllArtists()) {
            if ((artist.getNickname()).toLowerCase().equals(name)) {
                return ResponseEntity.ok(artist);
            }
        }

        return ResponseEntity.notFound().build();

    }

    public ResponseEntity<List<Artist>> getArtistsByHometown(String hometown) {

        List<Artist> results = new ArrayList<>();

        for (Artist artist : data.getAllArtists()) {
            if (artist.getBirthCountry().toLowerCase().equals(hometown)) {
                results.add(artist);
            }
        }

        if (results.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(results);

    }

    public ResponseEntity<List<Artist>> getArtistsByMovement(String movement) {

        List<Artist> results = new ArrayList<>();

        for (Artist artist : data.getAllArtists()) {
            if ((artist.getMovement()).toLowerCase().equals(movement)) {
                results.add(artist);
            }
        }

        if (results.size() == 0) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(results);

    }

}
