
package org.mule.module.google.spreadsheet.model.holders;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-03-26T12:36:12-05:00", comments = "Build 3.4.3.1620.30ea288")
public class CellExpressionHolder {

    protected Object rowNumber;
    protected int _rowNumberType;
    protected Object columnNumber;
    protected int _columnNumberType;
    protected Object valueOrFormula;
    protected String _valueOrFormulaType;
    protected Object evaluatedValue;
    protected String _evaluatedValueType;

    /**
     * Sets rowNumber
     * 
     * @param value Value to set
     */
    public void setRowNumber(Object value) {
        this.rowNumber = value;
    }

    /**
     * Retrieves rowNumber
     * 
     */
    public Object getRowNumber() {
        return this.rowNumber;
    }

    /**
     * Sets columnNumber
     * 
     * @param value Value to set
     */
    public void setColumnNumber(Object value) {
        this.columnNumber = value;
    }

    /**
     * Retrieves columnNumber
     * 
     */
    public Object getColumnNumber() {
        return this.columnNumber;
    }

    /**
     * Sets valueOrFormula
     * 
     * @param value Value to set
     */
    public void setValueOrFormula(Object value) {
        this.valueOrFormula = value;
    }

    /**
     * Retrieves valueOrFormula
     * 
     */
    public Object getValueOrFormula() {
        return this.valueOrFormula;
    }

    /**
     * Sets evaluatedValue
     * 
     * @param value Value to set
     */
    public void setEvaluatedValue(Object value) {
        this.evaluatedValue = value;
    }

    /**
     * Retrieves evaluatedValue
     * 
     */
    public Object getEvaluatedValue() {
        return this.evaluatedValue;
    }

}
