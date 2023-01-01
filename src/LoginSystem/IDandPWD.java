package LoginSystem;

import java.util.HashMap;

public class IDandPWD {
    HashMap<String,String> logninfo = new HashMap<>();

    void IDandPasswords(){
        logninfo.put("Simon", "Dalas");
        logninfo.put("Jackson", "geneva");
        logninfo.put("Peach", "Lollipop");
    }

    protected HashMap getLoginInfo(){
        return logninfo;
    }
}
