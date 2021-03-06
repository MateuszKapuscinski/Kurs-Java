package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.template;

public class TemplateUzycie {
    public static void main(String[] args) {
        HeroTemplate mocnyBohater =  new SuperHeroTemplate();
        HeroTemplate slabyBohater = new SlabyHeroTemplate();
        System.out.println("Moc ataku slabego Hero rowna: " + slabyBohater.silaAtakuBohatera());
        System.out.println("Moc ataku mocnego Hero rowna: " + mocnyBohater.silaAtakuBohatera());

        HeroTemplate boss = new BossHero();
        System.out.println("Moc ataku bossa wynosi: " + boss.silaAtakuBohatera());

        GoblinTemplate slabyGoblin = new SlabyGoblin();
        GoblinTemplate superGoblin = new SuperGoblin();
        System.out.println("Moc ataku slabego goblina wynosi: " + slabyGoblin.silaAtakuBohatera());
        System.out.println("Moc ataku super goblina wynosi " + superGoblin.silaAtakuBohatera());
        walka(slabyBohater,slabyGoblin);

    }
    private static void walka (HeroTemplate hero, GoblinTemplate goblin) {
        if (hero.silaAtakuBohatera() > goblin.silaAtakuBohatera()) {
            System.out.println("Wygral bohater");
        }else {
            System.out.println("wygral goblin");
        }
    }
}
