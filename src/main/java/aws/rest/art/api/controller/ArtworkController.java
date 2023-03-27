package aws.rest.art.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/artwork")
public class ArtworkController {
    
    @GetMapping("")
    public void test() {}

}
