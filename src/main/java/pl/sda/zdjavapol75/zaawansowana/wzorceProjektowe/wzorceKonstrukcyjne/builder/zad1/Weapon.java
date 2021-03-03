package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceKonstrukcyjne.builder.zad1;

public class Weapon {
    private String type;
    private String name;
    private String naboje;
    private Weapon(String type, String name, String naboje) {
        this.type = type;
        this.name = name;
        this.naboje = naboje;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getNaboje() {
        return naboje;
    }
    public static class Builder {
        private String type;
        private String name;
        private String naboje;
        // metody budownicze
        public Builder withType(final String type) {
            this.type = type;
            return this;
        }
        public Builder withName(final String name) {
            this.name = name;
            return this;
        }
        public Builder withNaboje(final String naboje){
            this.naboje = naboje;
            return this;
        }
        // metoda budująca obiekt docelowy
        public Weapon build() {
            return new Weapon(type, name, naboje);
        }
    }
}
