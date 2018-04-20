package entity.core;

import java.util.Date;

public class MediaStatement extends Statement {
    private String url;
    private Identity publisher;

    public MediaStatement(Date creation, Identity creator, MediaStatement proof, String url, Identity publisher) {
        super(creation, creator, proof);
        this.url = url;
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public Identity getPublisher() {
        return publisher;
    }


    @Override
    public String toString() {
        if (this.publisher != null) {
            return "There is " + this.url + " published by " + this.publisher.getName();
        } else {
            return "There is " + this.url + " by uknown";
        }
    }
}
