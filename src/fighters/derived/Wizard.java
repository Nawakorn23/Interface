package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Unit;
import logic.BattleUtils;

import java.io.IOException;

public class Wizard extends Unit implements Attackable {
    public Wizard(int maxHealth, int speed, int power, int location) {
        super("Wizard", "w", maxHealth, speed, location, true);
        setRange(2);
        setPower(power);
    }

    public int attack(Unit e) {
        if (!this.sameTeam(e)) {
            if (BattleUtils.validRange(this.getRange(), this.getLocation(), e.getLocation())) {
                return power;
            }
        }
        return -1;
    }

}
