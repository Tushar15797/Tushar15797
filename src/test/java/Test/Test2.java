package Test;

import org.apache.poi.ss.formula.atp.Switch;

import static org.apache.commons.math3.analysis.FunctionUtils.add;

public class Test2 {
    public static void main(String[] args) {
        int i = 2;
        switch (i){
            case 1:
                add();
                break;
        }
    }
        public static void add(){
            int a=10;
            int b=20;
            System.out.println(a+b);
        }
    }

