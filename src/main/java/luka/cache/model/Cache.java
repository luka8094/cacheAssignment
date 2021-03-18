package luka.cache.model;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Cache {

    Map<String, String> hashMap = new HashMap<String, String>();

    public String get(String key){

        return hashMap.get(key);
    }

    public void set(String key, String value){

        hashMap.put(key,value);
    }

    public boolean has(String key){

        return hashMap.containsKey(key);
    }

    public void delete(String key){

        hashMap.remove(key);
    }

  /* SetTTL løsnings implementation var undladt */

}
