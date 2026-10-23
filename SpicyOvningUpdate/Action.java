package SpicyOvningUpdate;

interface  Action {

    final int damagePointsfromArrow=10;
    final int damagePointsfromSpider = 5;
    final int damagePointsfromMonkeys= 10;
    final int damagePointsfromWildAnimals= 7;

    //coommon shared by characters to attack
   
    void attackWithArrows();

    void wildanimalsAttack();

    void spiderAttack();

    void monkeyAttack();
   
}

