/**
 * Created by Andrew Bell 12/5/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.mappingtest.domain;

public class NestedEnum {

    String id;
    MyEnum myEnum;

    public NestedEnum(MyEnum myEnum, String id) {
        this.myEnum = myEnum;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }
}
