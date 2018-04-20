package entity.core;

import java.util.Date;

public class Identity extends Statement {

    private String name;

    public Identity(Date creation, Identity creator, MediaStatement proof, String name) {
        super(creation, creator, proof);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "There is person " + this.getName();
    }
}
