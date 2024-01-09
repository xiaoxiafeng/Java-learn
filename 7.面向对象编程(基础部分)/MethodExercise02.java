public class MethodExercise02 {
    
    public static void main(String[] args) {
       int[][] arr = {{54,69,30,12,74}, {88,33,66,99,44,}, {147,236,987,120,87}};
       MyTools tool =  new MyTools();
       tool.arr(arr);

       Person per = new Person();
       per.name = "WANGWU";
       per.age = 65;

       Person per2 = tool.copyPerson(per);
       System.out.println(per.name + "\t" + per.age);
       System.out.println(per2.name + "\t" + per2.age);
    }
}

class MyTools {
    public void arr(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 25;
        return p2;

        // p = new Person();
        // p.name = "李四";
        // p.age = 25;
        // return p;
    }
}

class Person {
    String name;
    int age;
}

