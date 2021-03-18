package luka.cache.model;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {

    //Attribut
    private int id;

    //Contructor
    public User(int id){

        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlowData() throws InterruptedException{
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphanumeric(1000);
        return generatedString;
    }

}
