package com.example.fibonacci;

import android.widget.EditText;

import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci extends MainActivity{

    public static void fibonacci(int n) {
        String text="";
        ArrayList<BigInteger> fib = new ArrayList<>();
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("1");
        fib.add(n1);
        fib.add(n2);
        for (int i=1;i<n;i++) {
            fib.add(fib.get(i).add(fib.get(i-1)));
        }
        for (int i=1;i<=n;i++){
            text=fib.get(i)+"\n";
        }
        return;
    }


}

