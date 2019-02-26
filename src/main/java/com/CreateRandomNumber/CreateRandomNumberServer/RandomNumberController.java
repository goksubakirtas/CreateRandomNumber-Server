package com.CreateRandomNumber.CreateRandomNumberServer;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created on Jan.2019
 *
 * @author Goksu
 */
@RestController
@AllArgsConstructor
@RequestMapping("/createNumber")
public class RandomNumberController {
    private final RandomNumberService randomNumberService;

//    public RandomNumberController(RandomNumberService randomNumberService) {
//        this.randomNumberService = randomNumberService;
//    }

    @GetMapping
    public int createRandomNumber(){
        return randomNumberService.createRandomNumber();
    }


}
