package pl.sda.zdjavapol75.podstawy.enumy;

public enum PackageSize {
    SMALL(40,90),
    MEDIUM(90,140),
    LARGE(140,250),
    UNKOWN(0,0);

    private int minSize;
    private int maxSize;

    PackageSize (int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
}
