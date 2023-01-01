package LoginSystem;

import java.util.HashMap;

public class LoginPage {
    HashMap<String,String> loginInfo = new HashMap<>();
    LoginPage(HashMap<String, String> LoginInfoOriginal){
        loginInfo = LoginInfoOriginal;
    }
}
