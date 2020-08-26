package javabasic.test.test823.first;


/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 9:02 星期日
 */
public class Hero {
    private String heroName;
    private int score = 0;
    private int level = 0;
    private int killHeroNum = 0;
    private int killSoldierNum = 0;

    public Hero() {}
    public Hero(String heroName) {
        this.heroName = heroName;
    }

    public void killHero() {
        this.score += 5;
        this.killHeroNum += 1;
        this.level = this.score / 100;
    }

    public void KillSoldier() {
        this.score += 1;
        this.killSoldierNum += 1;
        this.level = this.score / 100;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }


    public void show() {
        System.out.println("Hero{" +
                "heroName='" + heroName + '\'' +
                ", score=" + score +
                ", level=" + level +
                ", killHeroNum=" + killHeroNum +
                ", killSoldierNum=" + killSoldierNum +
                '}');
    }
}
