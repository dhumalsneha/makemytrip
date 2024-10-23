package com.example.makemytrip;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hotelcontroller {

     @GetMapping("/hotel")
         public String getData()
     {
             return "please book hotel from MMT, 75% discount in North India";

     }


    @PutMapping("/hotel/hotelId")
    public String updateHotel(@PathVariable String hotelId, @RequestParam String status){
         return  "Hotel with ID : " + hotelId + "is now " + status;
     }
}
