package aws.rest.art.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aws.rest.art.api.Data;
import aws.rest.art.api.model.Artist;
import aws.rest.art.api.service.ArtistService;

@RequestMapping("/artist")
@RestController
public class ArtistController {

    @Autowired
    Data data;

    @Autowired
    ArtistService artistService;

    @GetMapping("")
    public ResponseEntity<List<Artist>> getAllArtists() {
        return ResponseEntity.ok(data.getAllArtists());
    }

    @GetMapping("/{artistName}")
    public ResponseEntity<Artist> getArtist(@PathVariable(value = "artistName") String artistName) {
        return artistService.getArtistByName(artistName);
    }

    @GetMapping("/movement/{movement}")
    public ResponseEntity<List<Artist>> getByMovement(@PathVariable(value = "movement") String movement) {
        return artistService.getArtistsByMovement(movement);
    }

    @GetMapping("/hometown/{hometown}")
    public ResponseEntity<List<Artist>> getArtistsByHometown(@PathVariable(value = "hometown") String hometown) {
        return artistService.getArtistsByHometown(hometown);
    }

}
