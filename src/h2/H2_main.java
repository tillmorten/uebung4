package h2;

public class H2_main {
public static void main(String[] args) {
    boolean x=true, y=false, a=false, b=false, c=false;
int input = 0;
boolean notequal = x!= y;

if (input == 11 || input == 10) {
    x = true;}
else {
    x = false;}
 if (input == 11 ||  input ==1) {
    y = true;
    }else {
     
        y = false;
    }if(x==y){a=true;}
     if(x==true ||  notequal){b=true;}
    switch (input) {
        case 1:
            c=false;
            break;
    case 0: 
        c=true;
        break;
        case 10:
            c=true;
            break;
            case 11:
                c=true;
                break;
    }
    System.out.println("x:" +x + " y: " + y + " a: " + a + " b: " + b + " c: " + c);

}
}
