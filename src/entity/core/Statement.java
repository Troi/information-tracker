package entity.core;

import java.util.Date;

public abstract class Statement {
    private Date creation;
    private Identity creator;
    private MediaStatement proof;

    public Statement(Date creation, Identity creator, MediaStatement proof) {
        this.creation = creation;
        this.creator = creator;
        this.proof = proof;
    }

    public Date getCreation() {
        return creation;
    }

    public Identity getCreator() {
        return creator;
    }

    public MediaStatement getProof() {
        return proof;
    }

    public String getCLIFormated() {
        if (this.creator != null) {
            return this.creator.getName() + " " + this.creation.toString() + " claims: " + this.toString();
        } else {
            return "Admin of this site " + this.creation.toString() + " claims: " + this.toString();
        }
    }

    public abstract String toString();
}
