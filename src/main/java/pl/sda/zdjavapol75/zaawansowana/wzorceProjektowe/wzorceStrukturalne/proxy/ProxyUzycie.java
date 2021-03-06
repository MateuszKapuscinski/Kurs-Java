package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.proxy;

public class ProxyUzycie {
    public static void main(String[] args) {
        User user = new User("Hot_Andrzej", TypUser.USER_ZALOGOWANY);
        User admin =  new User("admin", TypUser.ADMIN);
        User anonimowy =  new User("nieznany", TypUser.USER_NIE_ZALOGOWANY);
        User gold = new User("gold", TypUser.USER_GOLD);

        MessageSender messageSender =  new SlackMessageSender();
        SlackMessageSenderProxy proxy = new SlackMessageSenderProxy(messageSender, gold);
        proxy.sendMessage("Witaj userze: ");
    }
}
