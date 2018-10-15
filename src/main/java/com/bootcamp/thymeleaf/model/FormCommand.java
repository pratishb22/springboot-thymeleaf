package com.bootcamp.thymeleaf.model;

import java.util.StringJoiner;

public class FormCommand {

    private String textField;
    private String textareaField;
    private String datetimeField;
    private boolean singleCheckboxField;

    public String getTextField() {
        return textField;
    }

    public FormCommand setTextField(String textField) {
        this.textField = textField;
        return this;
    }

    public String getTextareaField() {
        return textareaField;
    }

    public FormCommand setTextareaField(String textareaField) {
        this.textareaField = textareaField;
        return this;
    }

    public String getDatetimeField() {
        return datetimeField;
    }

    public FormCommand setDatetimeField(String datetimeField) {
        this.datetimeField = datetimeField;
        return this;
    }

    public boolean isSingleCheckboxField() {
        return singleCheckboxField;
    }

    public FormCommand setSingleCheckboxField(boolean singleCheckboxField) {
        this.singleCheckboxField = singleCheckboxField;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("datetimeField = " + datetimeField)
                .add("singleCheckboxField = " + singleCheckboxField)
                .add("textareaField = " + textareaField)
                .add("textField = " + textField)
                .toString();
    }
}
