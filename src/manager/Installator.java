package manager;

import entity.core.Identity;
import entity.core.Statement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Installator {

    public static final String ADMIN_NAME = "system-itself";

    private List<String> initialUserNames;

    public Installator(String initialUserName) {
        this.initialUserNames = new ArrayList<>(1);
        this.initialUserNames.add(initialUserName);
    }

    public Installator(List<String> initialUserNames) {
        this.initialUserNames = initialUserNames;
    }

    public List<Statement> getInitialStatements() {
        List<Statement> statements = new ArrayList<>();

        Identity admin = new Identity(new Date(), null, null, ADMIN_NAME);
        statements.add(admin);

        for (String user: this.initialUserNames) {
            Identity newUser = new Identity(new Date(), admin, null, user);
            statements.add(newUser);
        }

        return statements;
    }
}
