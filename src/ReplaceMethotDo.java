public class ReplaceMethotDo {
    public static void main(String[] args) {

   String message="I love Pumpkin,Pumpkin is fun!" ;
   //      message.replace("Pumpkin","Java");
message=   message.replace("Pumpkin","Java!");
        System.out.println(message);

        String message2="Happy Thanks Giving to All!" ;
        //"Happy Thanksgiving to All!"
        message2=   message2.replace("Thanks Giving","Thanksgiving");
        System.out.println(message2);
//remove all the space
        message2=   message2.replace(" ","");
        System.out.println("message2= "+message2);


    }
}
