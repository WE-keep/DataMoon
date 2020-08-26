package javabasic.test.test823.first;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 9:12 星期日
 */
public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Arthur");
        hero.killHero();
        hero.killHero();

        hero.KillSoldier();
        hero.KillSoldier();
        hero.KillSoldier();
        hero.KillSoldier();
        hero.KillSoldier();

        hero.killHero();
        hero.killHero();

        hero.show();
    }
}
