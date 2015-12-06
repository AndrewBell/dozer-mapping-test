/**
 * Created by Andrew Bell 12/5/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.mappingtest.domain;

import java.util.Date;

public class SourceObj {

    String basicString;
    NestedEnum nestedEnum;
    Date shortDate;
    Date longDate;

    public SourceObj(String basicString, NestedEnum nestedEnum, Date shortDate, Date longDate) {
        this.basicString = basicString;
        this.nestedEnum = nestedEnum;
        this.shortDate = shortDate;
        this.longDate = longDate;
    }

    public String getBasicString() {
        return basicString;
    }

    public void setBasicString(String basicString) {
        this.basicString = basicString;
    }

    public NestedEnum getNestedEnum() {
        return nestedEnum;
    }

    public void setNestedEnum(NestedEnum nestedEnum) {
        this.nestedEnum = nestedEnum;
    }

    public Date getShortDate() {
        return shortDate;
    }

    public void setShortDate(Date shortDate) {
        this.shortDate = shortDate;
    }

    public Date getLongDate() {
        return longDate;
    }

    public void setLongDate(Date longDate) {
        this.longDate = longDate;
    }
}
