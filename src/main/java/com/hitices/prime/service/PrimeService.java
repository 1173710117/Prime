package com.hitices.prime.service;

import com.hitices.mclient.annotation.MSvcFunc;
import com.hitices.mclient.base.MSvcObject;
import org.springframework.stereotype.Service;

@Service
public class PrimeService extends MSvcObject {

    @MSvcFunc
    public Integer prime1(Integer n){
        if (n == 0){
            return 0;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0)
                return 0;
        }
        return n;
    }

    @MSvcFunc
    public Integer prime2(Integer n){
        if (n == 0){
            return 0;
        }
        for (int i = n/2 + 1 ; i < n; i++){
            if(n % i == 0)
                return 0;
        }
        return n;
    }
}
