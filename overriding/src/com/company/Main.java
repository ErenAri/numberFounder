package com.company;

import java.awt.font.FontRenderContext;

public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{
                new TeacherCreditManager(),
                new FarmerCreditManager(),
                new StudentCreditManager()
        };

        for (BaseCreditManager creditManager: creditManagers){
            System.out.println(creditManager);
            System.out.println(creditManager.calculate(1000));
        }
    }
}
