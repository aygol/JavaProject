package creare;
import day44.SlackUser;
public class  SlackAdminUser extends SlackUser {
    //  //	 addEmoji
    //    //Creare 1 subClass SlackAdminUser
    //    //attribute :
    int	adminId;
    //    //	 sendAtChannelMessage
    //    //	 deleteMessage
    //    //	 addChannel
    //    //	 toString method
    //    //constructor :
    //    //	 3 argument constructor to set all fields value

public SlackAdminUser(String name,String status, int adminId){
    this.adminId=adminId;
    this.status=status;
    this.adminId=adminId;
}
public static void sendAtChannelMessage (){
    System.out.println("Send chanall method ");

}public static void deleteMessage (){
        System.out.println("delete Message method ");

    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminId +
                '}';
    }

    public static void main(String[] args) {
        SlackAdminUser user1=new SlackAdminUser("akbar","release the horses",101);
        user1.sendMessage();

    }
}
