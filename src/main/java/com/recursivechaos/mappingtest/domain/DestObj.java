/**
 * Created by Andrew Bell 12/5/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.mappingtest.domain;

public class DestObj {

    String basicString;
    String myEnum;
    String shortDate;
    String longDate;

    public DestObj() {
    }

    public DestObj(String basicString, String myEnum, String shortDate, String longDate) {
        this.basicString = basicString;
        this.myEnum = myEnum;
        this.shortDate = shortDate;
        this.longDate = longDate;
    }

    public String getBasicString() {
        return basicString;
    }

    public void setBasicString(String basicString) {
        this.basicString = basicString;
    }

    public String getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(String myEnum) {
        this.myEnum = myEnum;
    }

    public String getShortDate() {
        return shortDate;
    }

    public void setShortDate(String shortDate) {
        this.shortDate = shortDate;
    }

    public String getLongDate() {
        return longDate;
    }

    public void setLongDate(String longDate) {
        this.longDate = longDate;
    }
}
