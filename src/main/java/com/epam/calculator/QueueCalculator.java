package com.epam.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueCalculator{

    private Calculator calculator;

    public QueueCalculator() {
        calculator = new Calculator();
    }

    private List<String> queue;

    public String getAnswer(String str){
        queue = new ArrayList<>();
        queue.addAll(Arrays.asList(str.split(" ")));
        for(int i=0;i<queue.size();i++){
            String a;
            if((a = queue.get(i)).contains("sqrt")){
                callCalc(i,a);
            }
        }
        for(int i=0;i<queue.size();i++){
            String a;
            if((a = queue.get(i)).equals("*")||(a = queue.get(i)).equals("/")){
                callCalc(i,a);
                i--;
            }
        }
        for(int i=0;i<queue.size();i++){
            String a;
            if((a = queue.get(i)).equals("+")||(a = queue.get(i)).equals("-")){
                callCalc(i,a);
                i--;
            }
        }
        return roundAnswer();
    }

    public void callCalc(int index, String sym){
        if(!sym.contains("sqrt")) {
            double a, b;
            a = Double.parseDouble(queue.get(index - 1));
            b = Double.parseDouble(queue.get(index + 1));
            String fin = null;
            if (sym.equals("*")) {
                fin = calculator.mult(a, b).toString();
            }
            if (sym.equals("/")) {
                fin = calculator.div(a, b).toString();
            }
            if (sym.equals("+")) {
                fin = calculator.add(a, b).toString();
            }
            if (sym.equals("-")) {
                fin = calculator.sub(a, b).toString();
            }

            queue.set(index, fin);
            queue.remove(index + 1);
            queue.remove(index - 1);
        } else {
            double a = Double.parseDouble(sym.substring("sqrt".length()));
            queue.set(index,calculator.sqrt(a).toString());
        }
    }

    public String roundAnswer(){
        double c = Math.round((Double.parseDouble(queue.get(0))*100));
        return String.valueOf(c/100);
    }

}
