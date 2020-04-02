package mastersTools.items;

public class Weapon implements Item {
    private String name;
    private String description;
    private String weaponCategory;
    private boolean isRanger;

    private int price;
    private String damage;
    private double weight;

    private boolean isAmmo;
    private boolean isTwoHand;
    private boolean isReach;
    private boolean isDistance;
    private boolean isLight;
    private boolean isThrowable;
    private boolean isSpecial;
    private boolean isReload;
    private boolean isHeavy;
    private boolean isUniversal;
    private boolean isFencing;
    private boolean isHindrance;

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(String weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public boolean isRanger() {
        return isRanger;
    }

    public void setRanger(boolean ranger) {
        isRanger = ranger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAmmo() {
        return isAmmo;
    }

    public void setAmmo(boolean ammo) {
        isAmmo = ammo;
    }

    public boolean isTwoHand() {
        return isTwoHand;
    }

    public void setTwoHand(boolean twoHand) {
        isTwoHand = twoHand;
    }

    public boolean isReach() {
        return isReach;
    }

    public void setReach(boolean reach) {
        isReach = reach;
    }

    public boolean isDistance() {
        return isDistance;
    }

    public void setDistance(boolean distance) {
        isDistance = distance;
    }

    public boolean isLight() {
        return isLight;
    }

    public void setLight(boolean light) {
        isLight = light;
    }

    public boolean isThrowable() {
        return isThrowable;
    }

    public void setThrowable(boolean throwable) {
        isThrowable = throwable;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public boolean isReload() {
        return isReload;
    }

    public void setReload(boolean reload) {
        isReload = reload;
    }

    public boolean isHeavy() {
        return isHeavy;
    }

    public void setHeavy(boolean heavy) {
        isHeavy = heavy;
    }

    public boolean isUniversal() {
        return isUniversal;
    }

    public void setUniversal(boolean universal) {
        isUniversal = universal;
    }

    public boolean isFencing() {
        return isFencing;
    }

    public void setFencing(boolean fencing) {
        isFencing = fencing;
    }

    public boolean isHindrance() {
        return isHindrance;
    }

    public void setHindrance(boolean hindrance) {
        isHindrance = hindrance;
    }
}
