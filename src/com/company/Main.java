package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Swimable  swimable1 = new Shurk ();
        Swimable  swimable2 = new Shurk ();
        Swimable  swimable3 = new Shurk ();
        Swimable  swimable4 = new Shurk ();
        Swimable  swimable5 = new Shurk ();

        swimable1.swimm();
        swimable2.swimm();
        swimable3.swimm();
        swimable4.swimm();
        swimable5.swimm();

        Swimable swimable6 = new Duck();
        Swimable swimable7 = new Duck();
        Swimable swimable8 = new Duck();
        Swimable swimable9 = new Duck();
        Swimable swimable10 = new Duck();

        swimable6.swimm();
        swimable7.swimm();
        swimable8.swimm();
        swimable9.swimm();
        swimable10.swimm();

        Swimable swimable11 = new Turtle();
        Swimable swimable12 = new Turtle();
        Swimable swimable13 = new Turtle();
        Swimable swimable14 = new Turtle();
        Swimable swimable15 = new Turtle();

        swimable11.swimm();
        swimable12.swimm();
        swimable13.swimm();
        swimable14.swimm();
        swimable15.swimm();

        Swimable[] okeanarium = {swimable1,swimable2,swimable3,swimable4,swimable5,
                   swimable6,swimable7,swimable8,swimable9,swimable10,
                swimable11,swimable12,swimable13,swimable14,swimable15};

        System.out.println(Arrays.toString(okeanarium));

    }
    Shurk shurk = new Shurk(){
        public void method1(int s, int e, int w){
            super.method1(s, e, w);
        }

        @Override
        void method1(int s) {
            super.method1(s);
            System.out.println("asdad");
        }
    };

    }


