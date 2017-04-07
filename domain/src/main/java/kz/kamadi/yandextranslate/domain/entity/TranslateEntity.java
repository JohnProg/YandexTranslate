package kz.kamadi.yandextranslate.domain.entity;

import java.util.List;

public class TranslateEntity {
    private List<String> text;
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
