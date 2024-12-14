import java.util.Scanner;

public class Calogic {


    public static double add(double a,double b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
    public static double sub(double a,double b){
        return a-b;

    }
    public static double sub(double a,double b,double c){
        return a-b-c;
    }
    public static double mul(double a,double b){
        return a*b;

    }
    public static double mul(double a,double b,double c){
        return a*b*c;
    }
    public static double div(double a,double b){
        return a/b;

    }
    public static double div(double a,double b,double c){
        return a/b/c;}
    public static double pow(double a,double b){
        return a/b;

    }
    public static double pow(double a,double b,double c){
        return a/b/c;
    }

    private static Number checkResukt(double resu){
        if(resu%1==0){
            if(Integer.MIN_VALUE<resu && Integer.MAX_VALUE>resu){
                int result1=(int)resu;
                System.out.println("result is" + result1);
            }
            else{
                long result1=(long)resu;
                System.out.println("result is" + result1);
            }

        }
        else{
            System.out.println("result is" + resu);
    }
    return 0;}

public static void operation() {
            jai:
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to calculator choose the choice\n1.add\n2.sub\n3.mul\n4.div\n5.pow\n6.exit");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the two ot three parameter \n1 choice for 2 parameters\n2 choice for 3 parameters");
                        int input1 = input.nextInt();
                        if (input1 == 1) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double result = Calogic.add(in1, in2);
                            System.out.println("result is" + result);

                        } else if (input1 == 2) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double in3 = input.nextDouble();
                            double result = Calogic.add(in1, in2, in3);
                            System.out.println("result is" + result);


                        }
                        break;
                    case 2:
                        System.out.println("Enter the two ot three parameter \n1 choice for 2 parameters\n2 choice for 3 parameters");
                        int input2 = input.nextInt();
                        if (input2 == 1) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double result = Calogic.sub(in1, in2);
                            System.out.println("result is" + result);

                        } else if (input2 == 2) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double in3 =input.nextDouble();
                            double result = Calogic.sub(in1, in2, in3);
                            System.out.println("result is" + result);


                        }
                        break;
                    case 3:
                        System.out.println("Enter the two ot three parameter \n1 choice for 2 parameters\n2 choice for 3 parameters");
                        int input3 = input.nextInt();
                        if (input3 == 1) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double result = Calogic.mul(in1, in2);
                            System.out.println("result is" + result);

                        } else if (input3 == 2) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double in3 = input.nextDouble();
                            double result = Calogic.mul(in1, in2, in3);
                            System.out.println("result is" + result);


                        }
                        break;
                    case 4:
                        System.out.println("Enter the two ot three parameter \n1 choice for 2 parameters\n2 choice for 3 parameters");
                        int input4 = input.nextInt();
                        if (input4 == 1) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double result = Calogic.div(in1, in2);

                           checkResukt(result);


                        } else if (input4 == 2) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double in3 = input.nextDouble();
                            double result = Calogic.div(in1, in2, in3);
                            checkResukt(result);



                        }
                        break;
                    case 5:
                        System.out.println("Enter the two ot three parameter \n1 choice for 2 parameters\n2 choice for 3 parameters");
                        int input5 = input.nextInt();
                        if (input5 == 1) {
                            System.out.println("Enter the two parameter");
                            double in1 = input.nextDouble();
                            double in2 = input.nextDouble();
                            double result = Calogic.pow(in1, in2);
                            System.out.println("result is" + result);

                        } else if (input5 == 2) {
                            System.out.println("Enter the three parameter");
                            double in1 =input.nextDouble();
                            double in2 = input.nextDouble();
                            double in3 = input.nextDouble();
                            double result = Calogic.pow(in1, in2, in3);


                        }


                        break;
                    case 6:
                        break jai;

                    default:
                        System.out.println("Enter the valid choice");


                }
            }
        }}

