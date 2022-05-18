package INTERFACI;

import java.util.Scanner;

public class calculadora implements operação_matematica {



        @Override
        public void soma ( double operador1, double operador2){
            System.out.println(" a soma é :" + (operador1 + operador2));
        }
        @Override
        public void subtracao ( double operador1, double operador2){
            System.out.println(" a subtracão  é :" + (operador1 - operador2));
        }
        @Override
        public void mutiplicacao ( double operador1, double operador2){
            System.out.println(" a mutiplicação  é :" + (operador1 * operador2));
        }
        @Override
        public void divisao ( double operador1, double operador2){
            System.out.println(" a  divição  é :" + (operador1 / operador2));
        }
    }
