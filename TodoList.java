package TodoList;
import java.util.ArrayList;
import java.util.Scanner;
public class TodoList {
    public static void main(String[] args) {
        Scanner TakeFromUser = new Scanner(System.in);
        ArrayList<String> ToDo = new ArrayList<>();
        System.out.println("==== Todo List ====\n" + "Enter Your choice or choose -1 to exit ");
        System.out.println("1- To add to the todo list ");
        System.out.println("2- To delete from the todo list ");
        System.out.println("3- To update from the todo list ");
        System.out.println("4- To print all the todos ");
       String numberChosed;
    do  {
        numberChosed = (TakeFromUser.nextLine());
        if (numberChosed.equals("1")||numberChosed.equals("2")||numberChosed.equals("3")||numberChosed.equals("4")||numberChosed.equals("-1")) {
            switch (numberChosed) {
                case "1" -> {
                    System.out.println("Enter your todo name : ");
                    ToDo.add(TakeFromUser.nextLine().toLowerCase());
                    System.out.println("Your todo saved .. choose another choice");
                    System.out.println("-------");
                }
                case "2" -> {
                    if (ToDo.size() == 0) {
                        System.out.println("there is nothing to do and delete try but some thing in your list  .. choose another choice");
                        System.out.println("-------");
                        break;
                    }
                    System.out.println("Enter the todo index that you want to delete :");
                    try {
                        int index = TakeFromUser.nextInt();
                        if (index >= ToDo.size() || index <= -1) {
                            System.out.println("the index that you but is error  try again the index start from 0. ");
                            System.out.println("-------");
                            break;
                        }
                        ToDo.remove(index);
                        System.out.println("your todo deleted .. chose another choice");
                        System.out.println("-------");
                    }catch (Exception e){
                        System.out.println("may be you but a chatacters ");
                        System.out.println("-------");}
                }
                case "3" ->  {
                    if (ToDo.size() == 0) {
                        System.out.println("there is nothing to do and update try but some thing in your list  .. choose another choice");
                        System.out.println("-------");
                        break;
                    }
                    try {

                    int index;
                    System.out.println("Enter the todo index that you want to replace :");
                    index = TakeFromUser.nextInt();
                    if (index >=ToDo.size() || index <= -1) {
                        System.out.println("the index that you but is error  try again  ");
                        System.out.println("-------");}
                   else {
                        System.out.println("Enter the todo name :");
                        var Newtodo = TakeFromUser.next().toLowerCase();
                        ToDo.set(index, Newtodo);
                        System.out.println("Your todo saved .. choose another choice");
                        System.out.println("-------");
                    }
                }catch (Exception e){
                        System.out.println("may be you but a chatacters ");
                        System.out.println("-------");
                    }
                }
                case "4" -> {
                    System.out.println(ToDo);
                    System.out.println("choose another choice");
                    System.out.println("-------");
                }
                case "-1" -> System.out.println("program terminated , based on user input");
            }
       }
        else{
                System.out.println(" ops what you want again >> chose from 1-4 and -1 for exit");
                System.out.println("-------");
            }
    } while (!numberChosed.equals("-1"));
}
}
