import java.util.Scanner;
public class Unit2ProjectRunner {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first x-y coordinate point: ");
    String firstCoordinate = s.nextLine();
    System.out.print("Enter the second x-y coordinate point:  ");
    String secondCoordinate = s.nextLine();

    int x1 = Integer.parseInt(firstCoordinate.substring(1,firstCoordinate.indexOf(",")));
    int y1 = Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf(",")+1, firstCoordinate.indexOf(")")));
    int x2 = Integer.parseInt(secondCoordinate.substring(1,secondCoordinate.indexOf(",")));
    int y2 = Integer.parseInt(secondCoordinate.substring(secondCoordinate.indexOf(",")+1, secondCoordinate.indexOf(")")));
    LinearEquation equation = new LinearEquation(x1,x2,y1,y2);

    //This is the toString that'll display all the values
    equation.toString();

    System.out.println("Enter an x value to get a full coordinate: ");
    int usersXValues = s.nextInt();
    System.out.println("New coordinate: ");
    System.out.println(equation.usersNewCoordinate(usersXValues));



    }
}
