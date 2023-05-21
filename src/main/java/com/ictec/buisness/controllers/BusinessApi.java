package com.ictec.buisness.controllers;

import com.ictec.buisness.httpentities.Address;
import com.ictec.buisness.httpentities.Buisness;
import com.ictec.buisness.httpentities.Location;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BusinessApi {
    @GetMapping("/show_business")
    public ResponseEntity<Buisness> showBusiness(){
        Buisness b = new Buisness();
        b.setName("Mtron");
        b.setPhone_number("+1345627378");

        Address a = new Address();
        a.setLine1("254/1A");
        a.setLine2("Robert Gunawardhana Road");
        a.setState("Western");
        a.setCity("Battaramulla");
        a.setCountry("Sri Lanka");

        b.setAddress(a);

        Location l = new Location();
        l.setLatitude("41.26353");
        l.setLongitude("-80.23453");

        b.setLocation(l);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b);
    }

    @PostMapping("/business")
    public ResponseEntity<Buisness> saveBusiness(@RequestBody Buisness b){
        return ResponseEntity.ok().body(b);
    }
}
