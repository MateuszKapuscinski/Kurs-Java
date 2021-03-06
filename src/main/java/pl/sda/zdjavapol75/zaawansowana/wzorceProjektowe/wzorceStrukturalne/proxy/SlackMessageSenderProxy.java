package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.proxy;

public class SlackMessageSenderProxy implements MessageSender{
    private MessageSender messageSender;
    private User user;
    public SlackMessageSenderProxy(MessageSender messageSender, User user) {
        this.messageSender = messageSender;
        this.user = user;
    }
    @Override
    public void sendMessage(String wiadosc) {
        if(czyJestDostep()){
            messageSender.sendMessage(wiadosc + user.getLoginName());
        }
    }
    private boolean czyJestDostep(){
        switch (user.getTypUser()){
            case USER_ZALOGOWANY:
            case ADMIN:
                System.out.println("User o loginie: " + user.getLoginName() + " jest autoryzowany.");
                return Boolean.TRUE;
            case USER_NIE_ZALOGOWANY:
                System.out.println("User o loginie: " + user.getLoginName() + " jest nieautoryzowany.");
                return Boolean.FALSE;
            case USER_GOLD:
                System.out.println("User o liginie: " + user.getLoginName() + " jest autoryzowany");
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
