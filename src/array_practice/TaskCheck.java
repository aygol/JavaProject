package array_practice;

public class TaskCheck {
    public static void main(String[] args) {
        String spelledName=getSpelledName("Lala");
        System.out.println("spelledName="+spelledName);
        System.out.println(getSpelledName("Sevinj"));
    }
    public static String getSpelledName(String name) {
        String result = "";
        for (int x = 0; x < name.length(); x++) {
            result = result + name.charAt(x);
            if (x != name.length() - 1) ;
            result = result + "-";
        }
        return result ;
    }
}



