public class User {

    public static void main(String[] args) {
        Iphone iphone = new Iphone(123456789L, 
        "00:11:22:33:44:55", 
        "192.168.0.0",
        40029822);

        // Calling methods from CallFeature
        iphone.makeCall("40028922");
        iphone.answerCall();
        iphone.startVoiceMail();

        // Calling methods from NavigatorFeature
        iphone.showPage("web.dio.me");
        iphone.addNewPage();
        iphone.refreshPage();

        // Calling methods from PlayerFeature
        iphone.selectMusic("Here");
        iphone.playMusic();
        iphone.pauseMusic();
    }
}