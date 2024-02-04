package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Guildmaster extends Unit implements Attackable, Guardable {
    public Guildmaster(int maxHealth, int speed, int power, int defense, int location) {
        super("Guildmaster", "G", maxHealth, speed, location, false);
        setRange(1);
        setPower(power);
        setDefense(defense);
    }

    public boolean move(int spaces) {
        return super.move(-1);
    }

    public int attack(Unit e) {
        if (!this.sameTeam(e)) {
            if(BattleUtils.validRange(this.getRange(),this.getLocation(),e.getLocation()))
            {return BattleUtils.calculateDamage(power, e);}
        }
        return -1;
    }

    @Override
    public void guard() {
    }

}
