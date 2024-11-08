package kylelisscoding.pauls.ScaleApiKnox.controller;

import kylelisscoding.pauls.ScaleApiKnox.model.ScaleWeight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static kylelisscoding.pauls.ScaleApiKnox.model.ScaleConnection.connectToScale;

@RestController
public class ProductController {

    @GetMapping("/getWeight")
    public String createScaleWeight(final ScaleWeight weight){
        System.out.println(weight);
        return weight.toString();
    }
}
