package com;

import java.io.Serializable;

public class Lang implements Serializable{
private String lang="en";
private static Lang instance;
public static synchronized Lang getInstance(){
    if (null!=instance){
        return instance;
    }else {
        instance=new Lang();
        return instance;
    }
}
public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}

}
