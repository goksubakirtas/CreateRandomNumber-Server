package com.CreateRandomNumber.CreateRandomNumberServer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created on Jan.2019
 *
 * @author Goksu
 */
@Service
@Slf4j
public class RandomNumberService {

    public int createRandomNumber(){
//     int  number= (int)(Math.random()*1000);
//        return number;
        return (int)(Math.random()*1000);
//        while (true){
//            try {
//                int  number=(int)(Math.random()*1000);
//                Thread.sleep(5000);
//                log.info("Current value: "+number);
//                return number;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
