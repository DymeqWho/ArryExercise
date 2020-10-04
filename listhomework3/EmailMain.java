package listhomework3;

import java.util.ArrayList;
import java.util.List;

public class EmailMain {
    public static void main(String[] args) {

        Email user = new Email("user@mydomain.com");
        Email admin = new Email("admin@mydomain.com");
        Email moderator = new Email("moderator@email.com");
        Email admin2 = new Email("admin@mydomain.com");

        List<Email> emailList = new ArrayList<>();

        emailList.add(user);
        emailList.add(admin);
        emailList.add(moderator);
        emailList.add(admin2);

        System.out.println("emailList = " + (emailList.toString()));

        System.out.println(emailList.indexOf(admin2));
        boolean isEqual = admin.equals(admin2);
        System.out.println(isEqual);
        int adminHash = admin.hashCode();
        System.out.println("adminHash = " + adminHash);
        int admin2Hash = admin2.hashCode();
        System.out.println("admin2Hash = " + admin2Hash);
        int emailAdminCompareToAdmin2 = adminHash - admin2Hash;
        System.out.println("emailAdminCompareToAdmin2 = " + emailAdminCompareToAdmin2);
        if (emailAdminCompareToAdmin2 == 0 ){
            System.out.println("they have the same Hash");
        } else {
            System.out.println("they have different hash");
        }

    }
}