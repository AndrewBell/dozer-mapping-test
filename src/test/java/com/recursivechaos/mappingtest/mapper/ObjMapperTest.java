/**
 * Created by Andrew Bell 12/5/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.mappingtest.mapper;

import com.recursivechaos.mappingtest.domain.DestObj;
import com.recursivechaos.mappingtest.domain.MyEnum;
import com.recursivechaos.mappingtest.domain.NestedEnum;
import com.recursivechaos.mappingtest.domain.SourceObj;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;


public class ObjMapperTest {

    @Test
    public void testMapObj() throws Exception {
        NestedEnum myEnum = new NestedEnum(MyEnum.ONE, "uno");
        Date testDate = new Date(0);
        SourceObj source = new SourceObj("myString", myEnum, testDate, testDate);
        ObjMapper mapper = new ObjMapper();

        DestObj destObj = mapper.mapObj(source);

        assertThat(destObj.getBasicString()).isEqualTo(source.getBasicString());
        assertThat(destObj.getMyEnum()).isEqualTo(source.getNestedEnum().getMyEnum().getValue());
        assertThat(destObj.getLongDate()).isEqualTo(mapLongDate(source.getLongDate()));
        assertThat(destObj.getShortDate()).isEqualTo(mapShortDate(source.getShortDate()));
    }

    String mapShortDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(date);
    }

    String mapLongDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}