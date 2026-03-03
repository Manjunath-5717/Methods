public class Methods {

    public static String studentDetails(String name,long phno,int id) {
        return name+" "+phno+" "+id;
    }
    public static void studentDetails(String name,int id) {
        System.out.println(name+" "+id);
    }
    public static void main(String[] args) {

        System.out.println(studentDetails("manju",901902571,1));
        studentDetails("prashanth",2);

    }

}
