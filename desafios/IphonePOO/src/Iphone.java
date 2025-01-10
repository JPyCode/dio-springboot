import features.CallFeature;
import features.NavigatorFeature;
import features.PlayerFeature;

public class Iphone implements CallFeature, NavigatorFeature, PlayerFeature {

    private Long numberIMEI;
    private String macAdress;
    private String ipAdress;
    private int voiceMailNumber;

    public Iphone(Long numberIMEI, String macAdress, String ipAdress, int voiceMailNumber) {
        this.numberIMEI = numberIMEI;
        this.macAdress = macAdress;
        this.ipAdress = ipAdress;
        this.voiceMailNumber = voiceMailNumber;
    }

    public Long getNumberIMEI() {
        return numberIMEI;
    }

    public void setNumberIMEI(Long numberIMEI) {
        this.numberIMEI = numberIMEI;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public int getVoiceMailNumber() {
        return voiceMailNumber;
    }

    public void setVoiceMailNumber(int voiceMailNumber) {
        this.voiceMailNumber = voiceMailNumber;
    }

    // Implement methods from CallFeature
    public void makeCall(String number) {
        System.out.println("Ligando para " + number);
    }

    public void answerCall() {
        System.out.println("Chamada atendida.");
    }

    public void startVoiceMail() {
        System.out.println("Deixando recado de voz.");
    }

    // Implement methods from NavigatorFeature
    public void showPage(String url) {
        System.out.println("Abrindo página " + url);
    }

    public void addNewPage() {
        System.out.println("Abrindo nova aba.");
    }

    public void refreshPage() {
        System.out.println("Atualizando página.");
    }

    // Implement methods from PlayerFeature

    public void selectMusic(String music) {
        System.out.println("Selecionando a música: " + music);
    }

    public void playMusic() {
        System.out.println("Tocando música.");
    }

    public void pauseMusic() {
        System.out.println("Pausando música.");
    }
    
}
