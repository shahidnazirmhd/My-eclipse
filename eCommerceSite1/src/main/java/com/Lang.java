package com;

import java.io.Serializable;

public class Lang implements Serializable{
private String lang;

public Lang(String lang) {
	this.lang = lang;
}

public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}

}
