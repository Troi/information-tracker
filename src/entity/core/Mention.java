package entity.core;

import java.util.Date;

public class Mention extends Statement {
    private Identity mentioned;
    private MediaStatement pointing;

    public Mention(Date creation, Identity creator, MediaStatement proof, Identity mentioned, MediaStatement pointing) {
        super(creation, creator, proof);
        this.mentioned = mentioned;
        this.pointing = pointing;
    }

    public Identity getMentioned() {
        return mentioned;
    }

    public MediaStatement getPointing() {
        return pointing;
    }
}
