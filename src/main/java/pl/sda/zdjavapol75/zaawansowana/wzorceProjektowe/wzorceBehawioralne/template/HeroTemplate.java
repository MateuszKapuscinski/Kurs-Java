package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceBehawioralne.template;

public abstract class HeroTemplate {
    public abstract int silaBohatera();
    public abstract int mocBohatera();
    public int silaAtakuBohatera(){
        return 3*silaBohatera() + 10 *mocBohatera();
    }
}
