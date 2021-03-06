package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.proxy;

public class SlackMessageSender implements MessageSender{
    @Override
    public void sendMessage(String wiadosc) {
        System.out.println(wiadosc);
    }
}
