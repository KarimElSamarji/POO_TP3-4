package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class MeteoController {

    @GetMapping("/meteo")
    public String apiCall(String address){
        String uri = "https://api-adresse.data.gouv.fr/search/?q="+address;
        RestTemplate restTemplate = new RestTemplate();
        String data = restTemplate.getForObject(uri, String.class);
        String[] mydata = data.split("coordinates");
        String coo = mydata[1].split( "]")[0];
        String coords = coo.replace(":","").replace("[","");
        coords = coords.substring(1);
        System.out.println("coordinates: "+coords);
        return coords;
    }

    public String Clim(String coo){
        String uri = "https://api.meteo-concept.com/api/forecast/daily/0?token=37f1a95feba9980b436e34e6d07edae39bbd4a597eca600968cd029991909c8d&latlng=["+coo+"]";
        RestTemplate restTemplate = new RestTemplate();
        String data = restTemplate.getForObject(uri, String.class);
        String[] mydata = data.split("probarain");
        mydata = mydata[1].split((","));
        String[] finaldata = mydata[1].split((":"));
        System.out.println(finaldata[1]);

        return finaldata[1];
    }

    @PostMapping ("/meteo")
    public String getMeteo(@RequestParam String address, Model model) {
        System.out.println("Methode Meteo");
        System.out.println(address);
        model.addAttribute("meteo", address);
        String coords = apiCall(address);
        model.addAttribute("coords", coords);
        String met = Clim(coords);
        model.addAttribute("met", met);

        return "meteo";
    }
}