package com.example.cicdproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Players")
public class PlayerController {

    private List<Player> list = new ArrayList<>();

    @GetMapping
    public List<Player> getAllPlayers(){
        return list;
    }

    @PostMapping
    public List<Player> newPlayer(@RequestBody Player player){
        list.add(player);
        return list;
    }


}
