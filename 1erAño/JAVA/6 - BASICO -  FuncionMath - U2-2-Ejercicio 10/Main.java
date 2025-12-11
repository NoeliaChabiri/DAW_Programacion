//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num,doceControl,contador;
        contador=0;
        num=0;
        doceControl=0;

        while (contador<30 && num!=99){

            num=(int) (Math.random()*100)+1;
            contador++;

            System.out.println(num+"");

            if(num==12){
                doceControl++;
            }

        }

        System.out.println("El número doce salio "+doceControl+" Veces");

    }

}