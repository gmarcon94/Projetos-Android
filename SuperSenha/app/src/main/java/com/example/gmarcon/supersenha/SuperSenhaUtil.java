package com.example.gmarcon.supersenha;

import android.graphics.Color;

import java.util.Random;

public class SuperSenhaUtil {

    public static final int coresSecretas[] =
            {Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.WHITE, Color.CYAN};

    public static int[] sortearCores() {

        Random r = new Random();

        return new int[]
                {coresSecretas[r.nextInt(7)], coresSecretas[r.nextInt(7)], coresSecretas[r.nextInt(7)]};
    }

}
