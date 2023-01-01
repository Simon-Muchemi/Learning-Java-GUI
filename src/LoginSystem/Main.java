package LoginSystem;

public class Main {
    public static void main(String[]args){
        var idandpwd  = new IDandPWD();

        var lpage = new LoginPage(idandpwd.getLoginInfo());


    }
}
