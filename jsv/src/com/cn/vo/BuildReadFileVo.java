/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.vo;

/**
 *
 * @author Administrator
 */
public class BuildReadFileVo {

    private StringBuilder fieldName;
    private StringBuilder fieldContent;
    
    public BuildReadFileVo() {
         
    }

    public BuildReadFileVo(StringBuilder fieldName, StringBuilder fieldContent) {
        this.fieldName = fieldName;
        this.fieldContent = fieldContent;
    }

    public StringBuilder getFieldName() {
        return fieldName;
    }

    public void setFieldName(StringBuilder fieldName) {
        this.fieldName = fieldName;
    }

    public StringBuilder getFieldContent() {
        return fieldContent;
    }

    public void setFieldContent(StringBuilder fieldContent) {
        this.fieldContent = fieldContent;
    }

    
    
    
}
